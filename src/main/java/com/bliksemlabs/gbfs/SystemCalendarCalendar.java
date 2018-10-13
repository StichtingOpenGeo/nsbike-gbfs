
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
    "start_month",
    "start_day",
    "start_year",
    "end_month",
    "end_day",
    "end_year"
})
public class SystemCalendarCalendar {

    @JsonProperty("start_month")
    private int startMonth;
    @JsonProperty("start_day")
    private int startDay;
    @JsonProperty("start_year")
    private int startYear;
    @JsonProperty("end_month")
    private int endMonth;
    @JsonProperty("end_day")
    private int endDay;
    @JsonProperty("end_year")
    private int endYear;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SystemCalendarCalendar() {
    }

    /**
     * 
     * @param endYear
     * @param endDay
     * @param startYear
     * @param startDay
     * @param startMonth
     * @param endMonth
     */
    public SystemCalendarCalendar(int startMonth, int startDay, int startYear, int endMonth, int endDay, int endYear) {
        super();
        this.startMonth = startMonth;
        this.startDay = startDay;
        this.startYear = startYear;
        this.endMonth = endMonth;
        this.endDay = endDay;
        this.endYear = endYear;
    }

    @JsonProperty("start_month")
    public int getStartMonth() {
        return startMonth;
    }

    @JsonProperty("start_month")
    public void setStartMonth(int startMonth) {
        this.startMonth = startMonth;
    }

    public SystemCalendarCalendar withStartMonth(int startMonth) {
        this.startMonth = startMonth;
        return this;
    }

    @JsonProperty("start_day")
    public int getStartDay() {
        return startDay;
    }

    @JsonProperty("start_day")
    public void setStartDay(int startDay) {
        this.startDay = startDay;
    }

    public SystemCalendarCalendar withStartDay(int startDay) {
        this.startDay = startDay;
        return this;
    }

    @JsonProperty("start_year")
    public int getStartYear() {
        return startYear;
    }

    @JsonProperty("start_year")
    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public SystemCalendarCalendar withStartYear(int startYear) {
        this.startYear = startYear;
        return this;
    }

    @JsonProperty("end_month")
    public int getEndMonth() {
        return endMonth;
    }

    @JsonProperty("end_month")
    public void setEndMonth(int endMonth) {
        this.endMonth = endMonth;
    }

    public SystemCalendarCalendar withEndMonth(int endMonth) {
        this.endMonth = endMonth;
        return this;
    }

    @JsonProperty("end_day")
    public int getEndDay() {
        return endDay;
    }

    @JsonProperty("end_day")
    public void setEndDay(int endDay) {
        this.endDay = endDay;
    }

    public SystemCalendarCalendar withEndDay(int endDay) {
        this.endDay = endDay;
        return this;
    }

    @JsonProperty("end_year")
    public int getEndYear() {
        return endYear;
    }

    @JsonProperty("end_year")
    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public SystemCalendarCalendar withEndYear(int endYear) {
        this.endYear = endYear;
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

    public SystemCalendarCalendar withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("startMonth", startMonth).append("startDay", startDay).append("startYear", startYear).append("endMonth", endMonth).append("endDay", endDay).append("endYear", endYear).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(endYear).append(endDay).append(startYear).append(additionalProperties).append(startDay).append(startMonth).append(endMonth).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SystemCalendarCalendar) == false) {
            return false;
        }
        SystemCalendarCalendar rhs = ((SystemCalendarCalendar) other);
        return new EqualsBuilder().append(endYear, rhs.endYear).append(endDay, rhs.endDay).append(startYear, rhs.startYear).append(additionalProperties, rhs.additionalProperties).append(startDay, rhs.startDay).append(startMonth, rhs.startMonth).append(endMonth, rhs.endMonth).isEquals();
    }

}
