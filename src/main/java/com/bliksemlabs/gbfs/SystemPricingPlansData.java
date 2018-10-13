
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
    "plans"
})
public class SystemPricingPlansData {

    @JsonProperty("plans")
    private List<SystemPricingPlansPlan> plans = new ArrayList<SystemPricingPlansPlan>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SystemPricingPlansData() {
    }

    /**
     * 
     * @param plans
     */
    public SystemPricingPlansData(List<SystemPricingPlansPlan> plans) {
        super();
        this.plans = plans;
    }

    @JsonProperty("plans")
    public List<SystemPricingPlansPlan> getPlans() {
        return plans;
    }

    @JsonProperty("plans")
    public void setPlans(List<SystemPricingPlansPlan> plans) {
        this.plans = plans;
    }

    public SystemPricingPlansData withPlans(List<SystemPricingPlansPlan> plans) {
        this.plans = plans;
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

    public SystemPricingPlansData withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("plans", plans).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(plans).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SystemPricingPlansData) == false) {
            return false;
        }
        SystemPricingPlansData rhs = ((SystemPricingPlansData) other);
        return new EqualsBuilder().append(plans, rhs.plans).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
