
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
    "last_updated",
    "ttl",
    "data"
})
public class SystemRegions {

    @JsonProperty("last_updated")
    private long lastUpdated;
    @JsonProperty("ttl")
    private int ttl;
    @JsonProperty("data")
    private SystemRegionsData data;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SystemRegions() {
    }

    /**
     * 
     * @param data
     * @param lastUpdated
     * @param ttl
     */
    public SystemRegions(long lastUpdated, int ttl, SystemRegionsData data) {
        super();
        this.lastUpdated = lastUpdated;
        this.ttl = ttl;
        this.data = data;
    }

    @JsonProperty("last_updated")
    public long getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("last_updated")
    public void setLastUpdated(long lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public SystemRegions withLastUpdated(long lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    @JsonProperty("ttl")
    public int getTtl() {
        return ttl;
    }

    @JsonProperty("ttl")
    public void setTtl(int ttl) {
        this.ttl = ttl;
    }

    public SystemRegions withTtl(int ttl) {
        this.ttl = ttl;
        return this;
    }

    @JsonProperty("data")
    public SystemRegionsData getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(SystemRegionsData data) {
        this.data = data;
    }

    public SystemRegions withData(SystemRegionsData data) {
        this.data = data;
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

    public SystemRegions withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("lastUpdated", lastUpdated).append("ttl", ttl).append("data", data).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(data).append(lastUpdated).append(ttl).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SystemRegions) == false) {
            return false;
        }
        SystemRegions rhs = ((SystemRegions) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(data, rhs.data).append(lastUpdated, rhs.lastUpdated).append(ttl, rhs.ttl).isEquals();
    }

}
