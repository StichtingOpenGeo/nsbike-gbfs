
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
    "rental_hours"
})
public class SystemHoursData {

    @JsonProperty("rental_hours")
    private List<SystemHoursRentalHour> rentalHours = new ArrayList<SystemHoursRentalHour>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SystemHoursData() {
    }

    /**
     * 
     * @param rentalHours
     */
    public SystemHoursData(List<SystemHoursRentalHour> rentalHours) {
        super();
        this.rentalHours = rentalHours;
    }

    @JsonProperty("rental_hours")
    public List<SystemHoursRentalHour> getRentalHours() {
        return rentalHours;
    }

    @JsonProperty("rental_hours")
    public void setRentalHours(List<SystemHoursRentalHour> rentalHours) {
        this.rentalHours = rentalHours;
    }

    public SystemHoursData withRentalHours(List<SystemHoursRentalHour> rentalHours) {
        this.rentalHours = rentalHours;
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

    public SystemHoursData withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("rentalHours", rentalHours).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(rentalHours).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SystemHoursData) == false) {
            return false;
        }
        SystemHoursData rhs = ((SystemHoursData) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(rentalHours, rhs.rentalHours).isEquals();
    }

}
