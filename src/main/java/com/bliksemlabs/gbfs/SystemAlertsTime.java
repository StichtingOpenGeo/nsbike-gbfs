
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
    "start",
    "end"
})
public class SystemAlertsTime {

    @JsonProperty("start")
    private int start;
    @JsonProperty("end")
    private int end;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SystemAlertsTime() {
    }

    /**
     * 
     * @param start
     * @param end
     */
    public SystemAlertsTime(int start, int end) {
        super();
        this.start = start;
        this.end = end;
    }

    @JsonProperty("start")
    public int getStart() {
        return start;
    }

    @JsonProperty("start")
    public void setStart(int start) {
        this.start = start;
    }

    public SystemAlertsTime withStart(int start) {
        this.start = start;
        return this;
    }

    @JsonProperty("end")
    public int getEnd() {
        return end;
    }

    @JsonProperty("end")
    public void setEnd(int end) {
        this.end = end;
    }

    public SystemAlertsTime withEnd(int end) {
        this.end = end;
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

    public SystemAlertsTime withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("start", start).append("end", end).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(start).append(additionalProperties).append(end).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SystemAlertsTime) == false) {
            return false;
        }
        SystemAlertsTime rhs = ((SystemAlertsTime) other);
        return new EqualsBuilder().append(start, rhs.start).append(additionalProperties, rhs.additionalProperties).append(end, rhs.end).isEquals();
    }

}
