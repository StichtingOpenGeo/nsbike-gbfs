
package com.bliksemlabs.gbfs;

import java.util.HashMap;
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
    "num_bikes_available",
    "num_docks_available",
    "is_installed",
    "is_renting",
    "is_returning",
    "last_reported"
})
public class StationStatusStation {

    @JsonProperty("station_id")
    private String stationId;
    @JsonProperty("num_bikes_available")
    private int numBikesAvailable;
    @JsonProperty("num_docks_available")
    private int numDocksAvailable;
    @JsonProperty("is_installed")
    private int isInstalled;
    @JsonProperty("is_renting")
    private int isRenting;
    @JsonProperty("is_returning")
    private int isReturning;
    @JsonProperty("last_reported")
    private long lastReported;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public StationStatusStation() {
    }

    /**
     * 
     * @param isReturning
     * @param numBikesAvailable
     * @param isInstalled
     * @param isRenting
     * @param numDocksAvailable
     * @param stationId
     * @param lastReported
     */
    public StationStatusStation(String stationId, int numBikesAvailable, int numDocksAvailable, int isInstalled, int isRenting, int isReturning, long lastReported) {
        super();
        this.stationId = stationId;
        this.numBikesAvailable = numBikesAvailable;
        this.numDocksAvailable = numDocksAvailable;
        this.isInstalled = isInstalled;
        this.isRenting = isRenting;
        this.isReturning = isReturning;
        this.lastReported = lastReported;
    }

    @JsonProperty("station_id")
    public String getStationId() {
        return stationId;
    }

    @JsonProperty("station_id")
    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public StationStatusStation withStationId(String stationId) {
        this.stationId = stationId;
        return this;
    }

    @JsonProperty("num_bikes_available")
    public int getNumBikesAvailable() {
        return numBikesAvailable;
    }

    @JsonProperty("num_bikes_available")
    public void setNumBikesAvailable(int numBikesAvailable) {
        this.numBikesAvailable = numBikesAvailable;
    }

    public StationStatusStation withNumBikesAvailable(int numBikesAvailable) {
        this.numBikesAvailable = numBikesAvailable;
        return this;
    }

    @JsonProperty("num_docks_available")
    public int getNumDocksAvailable() {
        return numDocksAvailable;
    }

    @JsonProperty("num_docks_available")
    public void setNumDocksAvailable(int numDocksAvailable) {
        this.numDocksAvailable = numDocksAvailable;
    }

    public StationStatusStation withNumDocksAvailable(int numDocksAvailable) {
        this.numDocksAvailable = numDocksAvailable;
        return this;
    }

    @JsonProperty("is_installed")
    public int getIsInstalled() {
        return isInstalled;
    }

    @JsonProperty("is_installed")
    public void setIsInstalled(int isInstalled) {
        this.isInstalled = isInstalled;
    }

    public StationStatusStation withIsInstalled(int isInstalled) {
        this.isInstalled = isInstalled;
        return this;
    }

    @JsonProperty("is_renting")
    public int getIsRenting() {
        return isRenting;
    }

    @JsonProperty("is_renting")
    public void setIsRenting(int isRenting) {
        this.isRenting = isRenting;
    }

    public StationStatusStation withIsRenting(int isRenting) {
        this.isRenting = isRenting;
        return this;
    }

    @JsonProperty("is_returning")
    public int getIsReturning() {
        return isReturning;
    }

    @JsonProperty("is_returning")
    public void setIsReturning(int isReturning) {
        this.isReturning = isReturning;
    }

    public StationStatusStation withIsReturning(int isReturning) {
        this.isReturning = isReturning;
        return this;
    }

    @JsonProperty("last_reported")
    public long getLastReported() {
        return lastReported;
    }

    @JsonProperty("last_reported")
    public void setLastReported(int lastReported) {
        this.lastReported = lastReported;
    }

    public StationStatusStation withLastReported(int lastReported) {
        this.lastReported = lastReported;
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

    public StationStatusStation withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("stationId", stationId).append("numBikesAvailable", numBikesAvailable).append("numDocksAvailable", numDocksAvailable).append("isInstalled", isInstalled).append("isRenting", isRenting).append("isReturning", isReturning).append("lastReported", lastReported).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(isReturning).append(numBikesAvailable).append(isInstalled).append(additionalProperties).append(isRenting).append(numDocksAvailable).append(stationId).append(lastReported).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StationStatusStation) == false) {
            return false;
        }
        StationStatusStation rhs = ((StationStatusStation) other);
        return new EqualsBuilder().append(isReturning, rhs.isReturning).append(numBikesAvailable, rhs.numBikesAvailable).append(isInstalled, rhs.isInstalled).append(additionalProperties, rhs.additionalProperties).append(isRenting, rhs.isRenting).append(numDocksAvailable, rhs.numDocksAvailable).append(stationId, rhs.stationId).append(lastReported, rhs.lastReported).isEquals();
    }

}
