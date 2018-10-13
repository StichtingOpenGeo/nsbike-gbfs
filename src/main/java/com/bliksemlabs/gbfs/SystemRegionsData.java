
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
    "regions"
})
public class SystemRegionsData {

    @JsonProperty("regions")
    private List<SystemRegionsRegion> regions = new ArrayList<SystemRegionsRegion>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SystemRegionsData() {
    }

    /**
     * 
     * @param regions
     */
    public SystemRegionsData(List<SystemRegionsRegion> regions) {
        super();
        this.regions = regions;
    }

    @JsonProperty("regions")
    public List<SystemRegionsRegion> getRegions() {
        return regions;
    }

    @JsonProperty("regions")
    public void setRegions(List<SystemRegionsRegion> regions) {
        this.regions = regions;
    }

    public SystemRegionsData withRegions(List<SystemRegionsRegion> regions) {
        this.regions = regions;
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

    public SystemRegionsData withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("regions", regions).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(regions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SystemRegionsData) == false) {
            return false;
        }
        SystemRegionsData rhs = ((SystemRegionsData) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(regions, rhs.regions).isEquals();
    }

}
