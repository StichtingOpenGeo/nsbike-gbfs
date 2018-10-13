
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
    "calendars"
})
public class SystemCalendarData {

    @JsonProperty("calendars")
    private List<SystemCalendarCalendar> calendars = new ArrayList<SystemCalendarCalendar>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SystemCalendarData() {
    }

    /**
     * 
     * @param calendars
     */
    public SystemCalendarData(List<SystemCalendarCalendar> calendars) {
        super();
        this.calendars = calendars;
    }

    @JsonProperty("calendars")
    public List<SystemCalendarCalendar> getCalendars() {
        return calendars;
    }

    @JsonProperty("calendars")
    public void setCalendars(List<SystemCalendarCalendar> calendars) {
        this.calendars = calendars;
    }

    public SystemCalendarData withCalendars(List<SystemCalendarCalendar> calendars) {
        this.calendars = calendars;
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

    public SystemCalendarData withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("calendars", calendars).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(calendars).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SystemCalendarData) == false) {
            return false;
        }
        SystemCalendarData rhs = ((SystemCalendarData) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(calendars, rhs.calendars).isEquals();
    }

}
