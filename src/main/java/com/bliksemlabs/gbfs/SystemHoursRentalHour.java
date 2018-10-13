
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
    "user_types",
    "days",
    "start_time",
    "end_time"
})
public class SystemHoursRentalHour {

    @JsonProperty("user_types")
    private List<String> userTypes = new ArrayList<String>();
    @JsonProperty("days")
    private List<String> days = new ArrayList<String>();
    @JsonProperty("start_time")
    private String startTime;
    @JsonProperty("end_time")
    private String endTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SystemHoursRentalHour() {
    }

    /**
     * 
     * @param startTime
     * @param days
     * @param userTypes
     * @param endTime
     */
    public SystemHoursRentalHour(List<String> userTypes, List<String> days, String startTime, String endTime) {
        super();
        this.userTypes = userTypes;
        this.days = days;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @JsonProperty("user_types")
    public List<String> getUserTypes() {
        return userTypes;
    }

    @JsonProperty("user_types")
    public void setUserTypes(List<String> userTypes) {
        this.userTypes = userTypes;
    }

    public SystemHoursRentalHour withUserTypes(List<String> userTypes) {
        this.userTypes = userTypes;
        return this;
    }

    @JsonProperty("days")
    public List<String> getDays() {
        return days;
    }

    @JsonProperty("days")
    public void setDays(List<String> days) {
        this.days = days;
    }

    public SystemHoursRentalHour withDays(List<String> days) {
        this.days = days;
        return this;
    }

    @JsonProperty("start_time")
    public String getStartTime() {
        return startTime;
    }

    @JsonProperty("start_time")
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public SystemHoursRentalHour withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    @JsonProperty("end_time")
    public String getEndTime() {
        return endTime;
    }

    @JsonProperty("end_time")
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public SystemHoursRentalHour withEndTime(String endTime) {
        this.endTime = endTime;
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

    public SystemHoursRentalHour withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("userTypes", userTypes).append("days", days).append("startTime", startTime).append("endTime", endTime).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(startTime).append(days).append(additionalProperties).append(userTypes).append(endTime).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SystemHoursRentalHour) == false) {
            return false;
        }
        SystemHoursRentalHour rhs = ((SystemHoursRentalHour) other);
        return new EqualsBuilder().append(startTime, rhs.startTime).append(days, rhs.days).append(additionalProperties, rhs.additionalProperties).append(userTypes, rhs.userTypes).append(endTime, rhs.endTime).isEquals();
    }

}
