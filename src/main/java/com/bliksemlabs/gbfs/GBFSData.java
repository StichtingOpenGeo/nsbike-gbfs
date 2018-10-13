
package com.bliksemlabs.gbfs;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GBFSData {
    private Map<String, GBFSLanguage> languages = new HashMap<String, GBFSLanguage>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public GBFSData() {
    }

    /**
     * 
     */
    public GBFSData(Map<String, GBFSLanguage> languages) {
        super();
        this.languages = languages;
    }

    @JsonAnyGetter
    public Map<String, GBFSLanguage> getLanguages() {
        return this.languages;
    }

    @JsonAnySetter
    public void setLanguage(String bcp47, GBFSLanguage language) {
        this.languages.put(bcp47, language);
    }

    public GBFSData withLanguage(String bcp47, GBFSLanguage language) {
        this.languages.put(bcp47, language);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("languages", languages).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(languages).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GBFSData) == false) {
            return false;
        }
        GBFSData rhs = ((GBFSData) other);
        return new EqualsBuilder().append(languages, rhs.languages).isEquals();
    }

}
