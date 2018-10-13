
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
    "plan_id",
    "url",
    "name",
    "currency",
    "price",
    "is_taxable",
    "description"
})
public class SystemPricingPlansPlan {

    @JsonProperty("plan_id")
    private String planId;
    @JsonProperty("url")
    private String url;
    @JsonProperty("name")
    private String name;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("price")
    private float price;
    @JsonProperty("is_taxable")
    private int isTaxable;
    @JsonProperty("description")
    private String description;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SystemPricingPlansPlan() {
    }

    /**
     * 
     * @param price
     * @param description
     * @param isTaxable
     * @param name
     * @param planId
     * @param url
     * @param currency
     */
    public SystemPricingPlansPlan(String planId, String url, String name, String currency, float price, int isTaxable, String description) {
        super();
        this.planId = planId;
        this.url = url;
        this.name = name;
        this.currency = currency;
        this.price = price;
        this.isTaxable = isTaxable;
        this.description = description;
    }

    @JsonProperty("plan_id")
    public String getPlanId() {
        return planId;
    }

    @JsonProperty("plan_id")
    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public SystemPricingPlansPlan withPlanId(String planId) {
        this.planId = planId;
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

    public SystemPricingPlansPlan withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public SystemPricingPlansPlan withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public SystemPricingPlansPlan withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    @JsonProperty("price")
    public float getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(float price) {
        this.price = price;
    }

    public SystemPricingPlansPlan withPrice(float price) {
        this.price = price;
        return this;
    }

    @JsonProperty("is_taxable")
    public int getIsTaxable() {
        return isTaxable;
    }

    @JsonProperty("is_taxable")
    public void setIsTaxable(int isTaxable) {
        this.isTaxable = isTaxable;
    }

    public SystemPricingPlansPlan withIsTaxable(int isTaxable) {
        this.isTaxable = isTaxable;
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

    public SystemPricingPlansPlan withDescription(String description) {
        this.description = description;
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

    public SystemPricingPlansPlan withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("planId", planId).append("url", url).append("name", name).append("currency", currency).append("price", price).append("isTaxable", isTaxable).append("description", description).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(price).append(additionalProperties).append(description).append(isTaxable).append(name).append(planId).append(url).append(currency).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SystemPricingPlansPlan) == false) {
            return false;
        }
        SystemPricingPlansPlan rhs = ((SystemPricingPlansPlan) other);
        return new EqualsBuilder().append(price, rhs.price).append(additionalProperties, rhs.additionalProperties).append(description, rhs.description).append(isTaxable, rhs.isTaxable).append(name, rhs.name).append(planId, rhs.planId).append(url, rhs.url).append(currency, rhs.currency).isEquals();
    }

}
