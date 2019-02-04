package com.bliksemlabs.nsbike;

import com.bliksemlabs.gbfs.*;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.zeromq.ZMQ;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.zip.GZIPOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        final ZMQ.Context context = ZMQ.context(1);
        final ZMQ.Socket pusher = context.socket(ZMQ.PUSH);
        pusher.connect("tcp://127.0.0.1:6706");

        final ObjectMapper objectMapper = new ObjectMapper();
        final ObjectWriter writer = objectMapper.writer(new DefaultPrettyPrinter());

        final OkHttpClient client = new OkHttpClient();
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

        // final Request requestSr = new Request.Builder()
        //        .url("http://87.237.204.211:8080/ns_bike/api/stanje/")
        //        .build();
        //
        // Response responseSr = client.newCall(requestSr).execute();
        // if (responseSr.isSuccessful()) {
        // }

        long lastUpdated = LocalDateTime.now().atZone(ZoneId.systemDefault()).toEpochSecond();

        final Request requestEng = new Request.Builder()
                .url("http://87.237.204.211:8080/ns_bike/api/stanje/eng/")
                .build();

		// TODO: mkdir /tmp/nsbike.rs/en 

        SystemInformation systemInformation = new SystemInformation(lastUpdated, 86400, new SystemInformationData("http://nsbike.rs/", "en", "NS Bike", null, "PUC Novi Sad", "http://nsbike.rs/", "http://nsbike.rs/2018/03/26/pricelist/", "2015-03-26", "+381214724140", "pitanja@parkingns.rs", "Europe/Belgrade", "https://creativecommons.org/licenses/by-sa/4.0/"));
        writer.writeValue(new File("/tmp/nsbike.rs/en/system_information.json"), systemInformation);

        FreeBikeStatus freeBikeStatus = new FreeBikeStatus(lastUpdated, 86400, null);
        writer.writeValue(new File("/tmp/nsbike.rs/en/free_bike_status.json"), freeBikeStatus);

        SystemHours systemHours = new SystemHours(lastUpdated, 86400, new SystemHoursData(Arrays.asList(new SystemHoursRentalHour(Arrays.asList("MEMBER"), Arrays.asList("mon", "tue", "wed", "thu", "fri", "sat", "sun"), "00:00:00", "23:59:59"))));
        writer.writeValue(new File("/tmp/nsbike.rs/en/system_hours.json"), systemHours);

        SystemCalendar systemCalendar = new SystemCalendar(lastUpdated, 86400, null);
        writer.writeValue(new File("/tmp/nsbike.rs/en/system_calendar.json"), systemCalendar);

        SystemRegions systemRegions = new SystemRegions(lastUpdated, 86400, new SystemRegionsData(Arrays.asList(new SystemRegionsRegion("http://novisad.rs/", "Novi Sad"))));
        writer.writeValue(new File("/tmp/nsbike.rs/en/system_regions.json"), systemRegions);
        
        SystemPricingPlans systemPricingPlans = new SystemPricingPlans(lastUpdated, 86400, new SystemPricingPlansData(Arrays.asList(
                new SystemPricingPlansPlan("http://nsbike.rs/#onehour", "http://nsbike.rs/2018/03/26/pricelist/", "One hour bicycle rental", "RSD", 30, 0, "One hour bicycle rental"),
                new SystemPricingPlansPlan("http://nsbike.rs/#oneday", "http://nsbike.rs/2018/03/26/pricelist/", "Daily bicycle rental", "RSD", 170, 0, "Daily bicycle rental"),
                new SystemPricingPlansPlan("http://nsbike.rs/#season", "http://nsbike.rs/2018/03/26/pricelist/", "Season ticket", "RSD", 1100, 0, "Two hours daily during season"),
                new SystemPricingPlansPlan("http://nsbike.rs/#card", "http://nsbike.rs/2018/03/26/pricelist/", "Customer Card", "RSD", 600, 0, "Cost for the customer card")
                )));
        writer.writeValue(new File("/tmp/nsbike.rs/en/system_princing_plans.json"), systemPricingPlans);

        SystemAlerts systemAlerts = new SystemAlerts(lastUpdated, 86400, null);
        writer.writeValue(new File("/tmp/nsbike.rs/en/system_alerts.json"), systemAlerts);

        GBFS gbfs = new GBFS(lastUpdated, 86400, new GBFSData(new HashMap<String, GBFSLanguage>() {{
            put("en", new GBFSLanguage(Arrays.asList(
                    new GBFSFeed("system_information", "http://gbfs.openov.org/nsbike.rs/en/system_information.json"),
                    new GBFSFeed("station_information", "http://gbfs.openov.org/nsbike.rs/en/station_information.json"),
                    new GBFSFeed("station_status", "http://gbfs.openov.org/nsbike.rs/en/station_status.json"),
                    new GBFSFeed("free_bike_status", "http://gbfs.openov.org/nsbike.rs/en/free_bike_status.json"),
                    new GBFSFeed("system_hours", "http://gbfs.openov.org/nsbike.rs/en/system_hours.json"),
                    new GBFSFeed("system_calendar", "http://gbfs.openov.org/nsbike.rs/en/system_calendar.json"),
                    new GBFSFeed("system_regions", "http://gbfs.openov.org/nsbike.rs/en/system_regions.json"),
                    new GBFSFeed("system_princing_plans", "http://gbfs.openov.org/nsbike.rs/en/system_princing_plans.json"),
                    new GBFSFeed("system_alerts", "http://gbfs.openov.org/nsbike.rs/en/system_alerts.json"))));
        }}));

        writer.writeValue(new File("/tmp/nsbike.rs/en/gbfs.json"), gbfs);

        ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
        ses.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                try {
                    Response responseEng = client.newCall(requestEng).execute();

                    if (responseEng.isSuccessful()) {
                        final byte[] responseBytes = responseEng.body().bytes();

                        ByteArrayOutputStream byteStream = new ByteArrayOutputStream(responseBytes.length);
                        try
                        {
                            GZIPOutputStream zipStream = new GZIPOutputStream(byteStream);
                            try
                            {
                                zipStream.write(responseBytes);
                            }
                            finally
                            {
                                zipStream.close();
                            }
                        }
                        finally
                        {
                            byteStream.close();
                        }

                        byte[] compressedData = byteStream.toByteArray();

                        pusher.sendMore("/nsbike.rs");
                        pusher.send(compressedData);

                        final NSBikeStation[] nsBikeStations = objectMapper.readValue(responseBytes, NSBikeStation[].class);

                        StationInformation stationInformation = new StationInformation()
                                .withTtl(3600)
                                .withLastUpdated(lastUpdated)
                                .withData(new StationInformationData(Arrays.stream(nsBikeStations).map(nsBikeStation -> new StationInformationStation("http://nsbike.rs/#" + nsBikeStation.getBiciklana(), nsBikeStation.getNaziv(), null, nsBikeStation.getSirina(), nsBikeStation.getVisina(), nsBikeStation.getAdresa(), null, "http://novisad.rs/", null, Arrays.asList("KEY"), nsBikeStation.getZauzeto() + nsBikeStation.getSlobodno())).collect(Collectors.toList())));

                        writer.writeValue(new File("/tmp/nsbike.rs/en/station_information.json"), stationInformation);

                        StationStatus stationStatus = new StationStatus()
                                .withTtl(60)
                                .withLastUpdated(lastUpdated)
                                .withData(new StationStatusData(Arrays.stream(nsBikeStations)
                                        .map(nsBikeStation -> new StationStatusStation(nsBikeStation.getBiciklana(),
                                                nsBikeStation.getZauzeto(), nsBikeStation.getSlobodno(), 1, 1, 1,
                                                LocalDateTime.parse(nsBikeStation.getVreme(), formatter).atZone(ZoneId.systemDefault()).toEpochSecond())).collect(Collectors.toList())));

                        writer.writeValue(new File("/tmp/nsbike.rs/en/station_status.json"), stationStatus);
                    }
                } catch (IOException exception) {

                }
            }
        }, 0, 1, TimeUnit.MINUTES);


    }
}
