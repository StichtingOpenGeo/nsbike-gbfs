
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
    "bikes"
})
public class FreeBikeStatusData {

    @JsonProperty("bikes")
    private List<FreeBikeStatusBike> bikes = new ArrayList<FreeBikeStatusBike>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public FreeBikeStatusData() {
    }

    /**
     * 
     * @param bikes
     */
    public FreeBikeStatusData(List<FreeBikeStatusBike> bikes) {
        super();
        this.bikes = bikes;
    }

    @JsonProperty("bikes")
    public List<FreeBikeStatusBike> getBikes() {
        return bikes;
    }

    @JsonProperty("bikes")
    public void setBikes(List<FreeBikeStatusBike> bikes) {
        this.bikes = bikes;
    }

    public FreeBikeStatusData withBikes(List<FreeBikeStatusBike> bikes) {
        this.bikes = bikes;
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

    public FreeBikeStatusData withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bikes", bikes).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(bikes).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FreeBikeStatusData) == false) {
            return false;
        }
        FreeBikeStatusData rhs = ((FreeBikeStatusData) other);
        return new EqualsBuilder().append(bikes, rhs.bikes).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
