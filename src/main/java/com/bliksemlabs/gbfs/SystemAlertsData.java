
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
    "alerts"
})
public class SystemAlertsData {

    @JsonProperty("alerts")
    private List<SystemAlertsAlert> alerts = new ArrayList<SystemAlertsAlert>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SystemAlertsData() {
    }

    /**
     * 
     * @param alerts
     */
    public SystemAlertsData(List<SystemAlertsAlert> alerts) {
        super();
        this.alerts = alerts;
    }

    @JsonProperty("alerts")
    public List<SystemAlertsAlert> getAlerts() {
        return alerts;
    }

    @JsonProperty("alerts")
    public void setAlerts(List<SystemAlertsAlert> alerts) {
        this.alerts = alerts;
    }

    public SystemAlertsData withAlerts(List<SystemAlertsAlert> alerts) {
        this.alerts = alerts;
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

    public SystemAlertsData withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("alerts", alerts).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(alerts).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SystemAlertsData) == false) {
            return false;
        }
        SystemAlertsData rhs = ((SystemAlertsData) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(alerts, rhs.alerts).isEquals();
    }

}
