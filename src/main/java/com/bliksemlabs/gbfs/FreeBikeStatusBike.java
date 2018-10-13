
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
    "bike_id",
    "lat",
    "lon",
    "is_reserved",
    "is_disabled"
})
public class FreeBikeStatusBike {

    @JsonProperty("bike_id")
    private String bikeId;
    @JsonProperty("lat")
    private float lat;
    @JsonProperty("lon")
    private float lon;
    @JsonProperty("is_reserved")
    private int isReserved;
    @JsonProperty("is_disabled")
    private int isDisabled;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public FreeBikeStatusBike() {
    }

    /**
     * 
     * @param isDisabled
     * @param lon
     * @param bikeId
     * @param isReserved
     * @param lat
     */
    public FreeBikeStatusBike(String bikeId, float lat, float lon, int isReserved, int isDisabled) {
        super();
        this.bikeId = bikeId;
        this.lat = lat;
        this.lon = lon;
        this.isReserved = isReserved;
        this.isDisabled = isDisabled;
    }

    @JsonProperty("bike_id")
    public String getBikeId() {
        return bikeId;
    }

    @JsonProperty("bike_id")
    public void setBikeId(String bikeId) {
        this.bikeId = bikeId;
    }

    public FreeBikeStatusBike withBikeId(String bikeId) {
        this.bikeId = bikeId;
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

    public FreeBikeStatusBike withLat(float lat) {
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

    public FreeBikeStatusBike withLon(float lon) {
        this.lon = lon;
        return this;
    }

    @JsonProperty("is_reserved")
    public int getIsReserved() {
        return isReserved;
    }

    @JsonProperty("is_reserved")
    public void setIsReserved(int isReserved) {
        this.isReserved = isReserved;
    }

    public FreeBikeStatusBike withIsReserved(int isReserved) {
        this.isReserved = isReserved;
        return this;
    }

    @JsonProperty("is_disabled")
    public int getIsDisabled() {
        return isDisabled;
    }

    @JsonProperty("is_disabled")
    public void setIsDisabled(int isDisabled) {
        this.isDisabled = isDisabled;
    }

    public FreeBikeStatusBike withIsDisabled(int isDisabled) {
        this.isDisabled = isDisabled;
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

    public FreeBikeStatusBike withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bikeId", bikeId).append("lat", lat).append("lon", lon).append("isReserved", isReserved).append("isDisabled", isDisabled).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(isDisabled).append(lon).append(bikeId).append(additionalProperties).append(isReserved).append(lat).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FreeBikeStatusBike) == false) {
            return false;
        }
        FreeBikeStatusBike rhs = ((FreeBikeStatusBike) other);
        return new EqualsBuilder().append(isDisabled, rhs.isDisabled).append(lon, rhs.lon).append(bikeId, rhs.bikeId).append(additionalProperties, rhs.additionalProperties).append(isReserved, rhs.isReserved).append(lat, rhs.lat).isEquals();
    }

}
