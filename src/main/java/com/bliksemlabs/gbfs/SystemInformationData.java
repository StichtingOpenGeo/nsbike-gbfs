
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
    "system_id",
    "language",
    "name",
    "short_name",
    "operator",
    "url",
    "purchase_url",
    "start_date",
    "phone_number",
    "email",
    "timezone",
    "license_url"
})
public class SystemInformationData {

    @JsonProperty("system_id")
    private String systemId;
    @JsonProperty("language")
    private String language;
    @JsonProperty("name")
    private String name;
    @JsonProperty("short_name")
    private String shortName;
    @JsonProperty("operator")
    private String operator;
    @JsonProperty("url")
    private String url;
    @JsonProperty("purchase_url")
    private String purchaseUrl;
    @JsonProperty("start_date")
    private String startDate;
    @JsonProperty("phone_number")
    private String phoneNumber;
    @JsonProperty("email")
    private String email;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("license_url")
    private String licenseUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SystemInformationData() {
    }

    /**
     * 
     * @param startDate
     * @param timezone
     * @param phoneNumber
     * @param email
     * @param purchaseUrl
     * @param name
     * @param language
     * @param systemId
     * @param shortName
     * @param licenseUrl
     * @param url
     * @param operator
     */
    public SystemInformationData(String systemId, String language, String name, String shortName, String operator, String url, String purchaseUrl, String startDate, String phoneNumber, String email, String timezone, String licenseUrl) {
        super();
        this.systemId = systemId;
        this.language = language;
        this.name = name;
        this.shortName = shortName;
        this.operator = operator;
        this.url = url;
        this.purchaseUrl = purchaseUrl;
        this.startDate = startDate;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.timezone = timezone;
        this.licenseUrl = licenseUrl;
    }

    @JsonProperty("system_id")
    public String getSystemId() {
        return systemId;
    }

    @JsonProperty("system_id")
    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public SystemInformationData withSystemId(String systemId) {
        this.systemId = systemId;
        return this;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    public SystemInformationData withLanguage(String language) {
        this.language = language;
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

    public SystemInformationData withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("short_name")
    public String getShortName() {
        return shortName;
    }

    @JsonProperty("short_name")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public SystemInformationData withShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    @JsonProperty("operator")
    public String getOperator() {
        return operator;
    }

    @JsonProperty("operator")
    public void setOperator(String operator) {
        this.operator = operator;
    }

    public SystemInformationData withOperator(String operator) {
        this.operator = operator;
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

    public SystemInformationData withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("purchase_url")
    public String getPurchaseUrl() {
        return purchaseUrl;
    }

    @JsonProperty("purchase_url")
    public void setPurchaseUrl(String purchaseUrl) {
        this.purchaseUrl = purchaseUrl;
    }

    public SystemInformationData withPurchaseUrl(String purchaseUrl) {
        this.purchaseUrl = purchaseUrl;
        return this;
    }

    @JsonProperty("start_date")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("start_date")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public SystemInformationData withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    @JsonProperty("phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phone_number")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public SystemInformationData withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public SystemInformationData withEmail(String email) {
        this.email = email;
        return this;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public SystemInformationData withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    @JsonProperty("license_url")
    public String getLicenseUrl() {
        return licenseUrl;
    }

    @JsonProperty("license_url")
    public void setLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl;
    }

    public SystemInformationData withLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl;
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

    public SystemInformationData withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("systemId", systemId).append("language", language).append("name", name).append("shortName", shortName).append("operator", operator).append("url", url).append("purchaseUrl", purchaseUrl).append("startDate", startDate).append("phoneNumber", phoneNumber).append("email", email).append("timezone", timezone).append("licenseUrl", licenseUrl).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(startDate).append(purchaseUrl).append(url).append(operator).append(timezone).append(phoneNumber).append(email).append(additionalProperties).append(name).append(language).append(systemId).append(shortName).append(licenseUrl).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SystemInformationData) == false) {
            return false;
        }
        SystemInformationData rhs = ((SystemInformationData) other);
        return new EqualsBuilder().append(startDate, rhs.startDate).append(purchaseUrl, rhs.purchaseUrl).append(url, rhs.url).append(operator, rhs.operator).append(timezone, rhs.timezone).append(phoneNumber, rhs.phoneNumber).append(email, rhs.email).append(additionalProperties, rhs.additionalProperties).append(name, rhs.name).append(language, rhs.language).append(systemId, rhs.systemId).append(shortName, rhs.shortName).append(licenseUrl, rhs.licenseUrl).isEquals();
    }

}
