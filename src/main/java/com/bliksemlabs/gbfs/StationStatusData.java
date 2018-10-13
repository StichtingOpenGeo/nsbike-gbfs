
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
    "stations"
})
public class StationStatusData {

    @JsonProperty("stations")
    private List<StationStatusStation> stations = new ArrayList<StationStatusStation>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public StationStatusData() {
    }

    /**
     * 
     * @param stations
     */
    public StationStatusData(List<StationStatusStation> stations) {
        super();
        this.stations = stations;
    }

    @JsonProperty("stations")
    public List<StationStatusStation> getStations() {
        return stations;
    }

    @JsonProperty("stations")
    public void setStations(List<StationStatusStation> stations) {
        this.stations = stations;
    }

    public StationStatusData withStations(List<StationStatusStation> stations) {
        this.stations = stations;
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

    public StationStatusData withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("stations", stations).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(stations).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StationStatusData) == false) {
            return false;
        }
        StationStatusData rhs = ((StationStatusData) other);
        return new EqualsBuilder().append(stations, rhs.stations).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
