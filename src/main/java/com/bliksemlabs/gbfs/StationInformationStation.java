
package com.bliksemlabs.gbfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "station_id",
    "name",
    "short_name",
    "lat",
    "lon",
    "address",
    "cross_street",
    "region_id",
    "post_code",
    "rental_methods",
    "capacity"
})
public class StationInformationStation {

    @JsonProperty("station_id")
    private String stationId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("short_name")
    private String shortName;
    @JsonProperty("lat")
    private float lat;
    @JsonProperty("lon")
    private float lon;
    @JsonProperty("address")
    private String address;
    @JsonProperty("cross_street")
    private String crossStreet;
    @JsonProperty("region_id")
    private String regionId;
    @JsonProperty("post_code")
    private String postCode;
    @JsonProperty("rental_methods")
    private List<String> rentalMethods = new ArrayList<String>();
    @JsonProperty("capacity")
    private int capacity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public StationInformationStation() {
    }

    /**
     * 
     * @param lon
     * @param rentalMethods
     * @param address
     * @param name
     * @param postCode
     * @param capacity
     * @param stationId
     * @param shortName
     * @param lat
     * @param regionId
     * @param crossStreet
     */
    public StationInformationStation(String stationId, String name, String shortName, float lat, float lon, String address, String crossStreet, String regionId, String postCode, List<String> rentalMethods, int capacity) {
        super();
        this.stationId = stationId;
        this.name = name;
        this.shortName = shortName;
        this.lat = lat;
        this.lon = lon;
        this.address = address;
        this.crossStreet = crossStreet;
        this.regionId = regionId;
        this.postCode = postCode;
        this.rentalMethods = rentalMethods;
        this.capacity = capacity;
    }

    @JsonProperty("station_id")
    public String getStationId() {
        return stationId;
    }

    @JsonProperty("station_id")
    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public StationInformationStation withStationId(String stationId) {
        this.stationId = stationId;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public StationInformationStation withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("short_name")
    public String getShortName() {
        return shortName;
    }

    @JsonProperty("short_name")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public StationInformationStation withShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    @JsonProperty("lat")
    public float getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(float lat) {
        this.lat = lat;
    }

    public StationInformationStation withLat(float lat) {
        this.lat = lat;
        return this;
    }

    @JsonProperty("lon")
    public float getLon() {
        return lon;
    }

    @JsonProperty("lon")
    public void setLon(float lon) {
        this.lon = lon;
    }

    public StationInformationStation withLon(float lon) {
        this.lon = lon;
        return this;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    public StationInformationStation withAddress(String address) {
        this.address = address;
        return this;
    }

    @JsonProperty("cross_street")
    public String getCrossStreet() {
        return crossStreet;
    }

    @JsonProperty("cross_street")
    public void setCrossStreet(String crossStreet) {
        this.crossStreet = crossStreet;
    }

    public StationInformationStation withCrossStreet(String crossStreet) {
        this.crossStreet = crossStreet;
        return this;
    }

    @JsonProperty("region_id")
    public String getRegionId() {
        return regionId;
    }

    @JsonProperty("region_id")
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public StationInformationStation withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    @JsonProperty("post_code")
    public String getPostCode() {
        return postCode;
    }

    @JsonProperty("post_code")
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public StationInformationStation withPostCode(String postCode) {
        this.postCode = postCode;
        return this;
    }

    @JsonProperty("rental_methods")
    public List<String> getRentalMethods() {
        return rentalMethods;
    }

    @JsonProperty("rental_methods")
    public void setRentalMethods(List<String> rentalMethods) {
        this.rentalMethods = rentalMethods;
    }

    public StationInformationStation withRentalMethods(List<String> rentalMethods) {
        this.rentalMethods = rentalMethods;
        return this;
    }

    @JsonProperty("capacity")
    public int getCapacity() {
        return capacity;
    }

    @JsonProperty("capacity")
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public StationInformationStation withCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public StationInformationStation withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("stationId", stationId).append("name", name).append("shortName", shortName).append("lat", lat).append("lon", lon).append("address", address).append("crossStreet", crossStreet).append("regionId", regionId).append("postCode", postCode).append("rentalMethods", rentalMethods).append("capacity", capacity).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lon).append(rentalMethods).append(postCode).append(stationId).append(crossStreet).append(address).append(additionalProperties).append(name).append(capacity).append(shortName).append(lat).append(regionId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StationInformationStation) == false) {
            return false;
        }
        StationInformationStation rhs = ((StationInformationStation) other);
        return new EqualsBuilder().append(lon, rhs.lon).append(rentalMethods, rhs.rentalMethods).append(postCode, rhs.postCode).append(stationId, rhs.stationId).append(crossStreet, rhs.crossStreet).append(address, rhs.address).append(additionalProperties, rhs.additionalProperties).append(name, rhs.name).append(capacity, rhs.capacity).append(shortName, rhs.shortName).append(lat, rhs.lat).append(regionId, rhs.regionId).isEquals();
    }

}
