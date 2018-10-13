
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
    "alert_id",
    "type",
    "times",
    "station_ids",
    "region_ids",
    "url",
    "summary",
    "description",
    "last_updated"
})
public class SystemAlertsAlert {

    @JsonProperty("alert_id")
    private String alertId;
    @JsonProperty("type")
    private String type;
    @JsonProperty("times")
    private List<SystemAlertsTime> times = new ArrayList<SystemAlertsTime>();
    @JsonProperty("station_ids")
    private List<String> stationIds = new ArrayList<String>();
    @JsonProperty("region_ids")
    private List<String> regionIds = new ArrayList<String>();
    @JsonProperty("url")
    private String url;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("description")
    private String description;
    @JsonProperty("last_updated")
    private int lastUpdated;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SystemAlertsAlert() {
    }

    /**
     * 
     * @param summary
     * @param alertId
     * @param regionIds
     * @param times
     * @param description
     * @param lastUpdated
     * @param stationIds
     * @param type
     * @param url
     */
    public SystemAlertsAlert(String alertId, String type, List<SystemAlertsTime> times, List<String> stationIds, List<String> regionIds, String url, String summary, String description, int lastUpdated) {
        super();
        this.alertId = alertId;
        this.type = type;
        this.times = times;
        this.stationIds = stationIds;
        this.regionIds = regionIds;
        this.url = url;
        this.summary = summary;
        this.description = description;
        this.lastUpdated = lastUpdated;
    }

    @JsonProperty("alert_id")
    public String getAlertId() {
        return alertId;
    }

    @JsonProperty("alert_id")
    public void setAlertId(String alertId) {
        this.alertId = alertId;
    }

    public SystemAlertsAlert withAlertId(String alertId) {
        this.alertId = alertId;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public SystemAlertsAlert withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("times")
    public List<SystemAlertsTime> getTimes() {
        return times;
    }

    @JsonProperty("times")
    public void setTimes(List<SystemAlertsTime> times) {
        this.times = times;
    }

    public SystemAlertsAlert withTimes(List<SystemAlertsTime> times) {
        this.times = times;
        return this;
    }

    @JsonProperty("station_ids")
    public List<String> getStationIds() {
        return stationIds;
    }

    @JsonProperty("station_ids")
    public void setStationIds(List<String> stationIds) {
        this.stationIds = stationIds;
    }

    public SystemAlertsAlert withStationIds(List<String> stationIds) {
        this.stationIds = stationIds;
        return this;
    }

    @JsonProperty("region_ids")
    public List<String> getRegionIds() {
        return regionIds;
    }

    @JsonProperty("region_ids")
    public void setRegionIds(List<String> regionIds) {
        this.regionIds = regionIds;
    }

    public SystemAlertsAlert withRegionIds(List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public SystemAlertsAlert withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public SystemAlertsAlert withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public SystemAlertsAlert withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("last_updated")
    public int getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("last_updated")
    public void setLastUpdated(int lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public SystemAlertsAlert withLastUpdated(int lastUpdated) {
        this.lastUpdated = lastUpdated;
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

    public SystemAlertsAlert withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("alertId", alertId).append("type", type).append("times", times).append("stationIds", stationIds).append("regionIds", regionIds).append("url", url).append("summary", summary).append("description", description).append("lastUpdated", lastUpdated).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(summary).append(alertId).append(regionIds).append(times).append(additionalProperties).append(description).append(lastUpdated).append(stationIds).append(type).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SystemAlertsAlert) == false) {
            return false;
        }
        SystemAlertsAlert rhs = ((SystemAlertsAlert) other);
        return new EqualsBuilder().append(summary, rhs.summary).append(alertId, rhs.alertId).append(regionIds, rhs.regionIds).append(times, rhs.times).append(additionalProperties, rhs.additionalProperties).append(description, rhs.description).append(lastUpdated, rhs.lastUpdated).append(stationIds, rhs.stationIds).append(type, rhs.type).append(url, rhs.url).isEquals();
    }

}
