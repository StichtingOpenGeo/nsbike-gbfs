
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
    "feeds"
})
public class GBFSLanguage {

    @JsonProperty("feeds")
    private List<GBFSFeed> feeds = new ArrayList<GBFSFeed>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public GBFSLanguage() {
    }

    /**
     * 
     * @param feeds
     */
    public GBFSLanguage(List<GBFSFeed> feeds) {
        super();
        this.feeds = feeds;
    }

    @JsonProperty("feeds")
    public List<GBFSFeed> getFeeds() {
        return feeds;
    }

    @JsonProperty("feeds")
    public void setFeeds(List<GBFSFeed> feeds) {
        this.feeds = feeds;
    }

    public GBFSLanguage withFeeds(List<GBFSFeed> feeds) {
        this.feeds = feeds;
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

    public GBFSLanguage withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("feeds", feeds).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(feeds).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GBFSLanguage) == false) {
            return false;
        }
        GBFSLanguage rhs = ((GBFSLanguage) other);
        return new EqualsBuilder().append(feeds, rhs.feeds).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
