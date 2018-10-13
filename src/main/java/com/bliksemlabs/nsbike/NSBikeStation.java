
package com.bliksemlabs.nsbike;

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
    "rbr",
    "biciklana",
    "naziv",
    "adresa",
    "sirina",
    "visina",
    "mesto1",
    "mesto2",
    "mesto3",
    "mesto4",
    "mesto5",
    "mesto6",
    "mesto7",
    "mesto8",
    "mesto9",
    "mesto10",
    "mesto11",
    "mesto12",
    "mesto13",
    "mesto14",
    "zauzeto",
    "slobodno",
    "vreme"
})
public class NSBikeStation {

    @JsonProperty("rbr")
    private int rbr;
    @JsonProperty("biciklana")
    private String biciklana;
    @JsonProperty("naziv")
    private String naziv;
    @JsonProperty("adresa")
    private String adresa;
    @JsonProperty("sirina")
    private float sirina;
    @JsonProperty("visina")
    private float visina;
    @JsonProperty("mesto1")
    private int mesto1;
    @JsonProperty("mesto2")
    private int mesto2;
    @JsonProperty("mesto3")
    private int mesto3;
    @JsonProperty("mesto4")
    private int mesto4;
    @JsonProperty("mesto5")
    private int mesto5;
    @JsonProperty("mesto6")
    private int mesto6;
    @JsonProperty("mesto7")
    private int mesto7;
    @JsonProperty("mesto8")
    private int mesto8;
    @JsonProperty("mesto9")
    private int mesto9;
    @JsonProperty("mesto10")
    private int mesto10;
    @JsonProperty("mesto11")
    private int mesto11;
    @JsonProperty("mesto12")
    private int mesto12;
    @JsonProperty("mesto13")
    private int mesto13;
    @JsonProperty("mesto14")
    private int mesto14;
    @JsonProperty("zauzeto")
    private int zauzeto;
    @JsonProperty("slobodno")
    private int slobodno;
    @JsonProperty("vreme")
    private String vreme;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public NSBikeStation() {
    }

    /**
     * 
     * @param adresa
     * @param mesto13
     * @param mesto14
     * @param vreme
     * @param slobodno
     * @param mesto4
     * @param mesto5
     * @param mesto2
     * @param sirina
     * @param mesto3
     * @param mesto11
     * @param rbr
     * @param mesto12
     * @param mesto1
     * @param mesto10
     * @param naziv
     * @param mesto7
     * @param visina
     * @param mesto6
     * @param mesto9
     * @param mesto8
     * @param biciklana
     * @param zauzeto
     */
    public NSBikeStation(int rbr, String biciklana, String naziv, String adresa, float sirina, float visina, int mesto1, int mesto2, int mesto3, int mesto4, int mesto5, int mesto6, int mesto7, int mesto8, int mesto9, int mesto10, int mesto11, int mesto12, int mesto13, int mesto14, int zauzeto, int slobodno, String vreme) {
        super();
        this.rbr = rbr;
        this.biciklana = biciklana;
        this.naziv = naziv;
        this.adresa = adresa;
        this.sirina = sirina;
        this.visina = visina;
        this.mesto1 = mesto1;
        this.mesto2 = mesto2;
        this.mesto3 = mesto3;
        this.mesto4 = mesto4;
        this.mesto5 = mesto5;
        this.mesto6 = mesto6;
        this.mesto7 = mesto7;
        this.mesto8 = mesto8;
        this.mesto9 = mesto9;
        this.mesto10 = mesto10;
        this.mesto11 = mesto11;
        this.mesto12 = mesto12;
        this.mesto13 = mesto13;
        this.mesto14 = mesto14;
        this.zauzeto = zauzeto;
        this.slobodno = slobodno;
        this.vreme = vreme;
    }

    @JsonProperty("rbr")
    public int getRbr() {
        return rbr;
    }

    @JsonProperty("rbr")
    public void setRbr(int rbr) {
        this.rbr = rbr;
    }

    public NSBikeStation withRbr(int rbr) {
        this.rbr = rbr;
        return this;
    }

    @JsonProperty("biciklana")
    public String getBiciklana() {
        return biciklana;
    }

    @JsonProperty("biciklana")
    public void setBiciklana(String biciklana) {
        this.biciklana = biciklana;
    }

    public NSBikeStation withBiciklana(String biciklana) {
        this.biciklana = biciklana;
        return this;
    }

    @JsonProperty("naziv")
    public String getNaziv() {
        return naziv;
    }

    @JsonProperty("naziv")
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public NSBikeStation withNaziv(String naziv) {
        this.naziv = naziv;
        return this;
    }

    @JsonProperty("adresa")
    public String getAdresa() {
        return adresa;
    }

    @JsonProperty("adresa")
    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public NSBikeStation withAdresa(String adresa) {
        this.adresa = adresa;
        return this;
    }

    @JsonProperty("sirina")
    public float getSirina() {
        return sirina;
    }

    @JsonProperty("sirina")
    public void setSirina(float sirina) {
        this.sirina = sirina;
    }

    public NSBikeStation withSirina(float sirina) {
        this.sirina = sirina;
        return this;
    }

    @JsonProperty("visina")
    public float getVisina() {
        return visina;
    }

    @JsonProperty("visina")
    public void setVisina(float visina) {
        this.visina = visina;
    }

    public NSBikeStation withVisina(float visina) {
        this.visina = visina;
        return this;
    }

    @JsonProperty("mesto1")
    public int getMesto1() {
        return mesto1;
    }

    @JsonProperty("mesto1")
    public void setMesto1(int mesto1) {
        this.mesto1 = mesto1;
    }

    public NSBikeStation withMesto1(int mesto1) {
        this.mesto1 = mesto1;
        return this;
    }

    @JsonProperty("mesto2")
    public int getMesto2() {
        return mesto2;
    }

    @JsonProperty("mesto2")
    public void setMesto2(int mesto2) {
        this.mesto2 = mesto2;
    }

    public NSBikeStation withMesto2(int mesto2) {
        this.mesto2 = mesto2;
        return this;
    }

    @JsonProperty("mesto3")
    public int getMesto3() {
        return mesto3;
    }

    @JsonProperty("mesto3")
    public void setMesto3(int mesto3) {
        this.mesto3 = mesto3;
    }

    public NSBikeStation withMesto3(int mesto3) {
        this.mesto3 = mesto3;
        return this;
    }

    @JsonProperty("mesto4")
    public int getMesto4() {
        return mesto4;
    }

    @JsonProperty("mesto4")
    public void setMesto4(int mesto4) {
        this.mesto4 = mesto4;
    }

    public NSBikeStation withMesto4(int mesto4) {
        this.mesto4 = mesto4;
        return this;
    }

    @JsonProperty("mesto5")
    public int getMesto5() {
        return mesto5;
    }

    @JsonProperty("mesto5")
    public void setMesto5(int mesto5) {
        this.mesto5 = mesto5;
    }

    public NSBikeStation withMesto5(int mesto5) {
        this.mesto5 = mesto5;
        return this;
    }

    @JsonProperty("mesto6")
    public int getMesto6() {
        return mesto6;
    }

    @JsonProperty("mesto6")
    public void setMesto6(int mesto6) {
        this.mesto6 = mesto6;
    }

    public NSBikeStation withMesto6(int mesto6) {
        this.mesto6 = mesto6;
        return this;
    }

    @JsonProperty("mesto7")
    public int getMesto7() {
        return mesto7;
    }

    @JsonProperty("mesto7")
    public void setMesto7(int mesto7) {
        this.mesto7 = mesto7;
    }

    public NSBikeStation withMesto7(int mesto7) {
        this.mesto7 = mesto7;
        return this;
    }

    @JsonProperty("mesto8")
    public int getMesto8() {
        return mesto8;
    }

    @JsonProperty("mesto8")
    public void setMesto8(int mesto8) {
        this.mesto8 = mesto8;
    }

    public NSBikeStation withMesto8(int mesto8) {
        this.mesto8 = mesto8;
        return this;
    }

    @JsonProperty("mesto9")
    public int getMesto9() {
        return mesto9;
    }

    @JsonProperty("mesto9")
    public void setMesto9(int mesto9) {
        this.mesto9 = mesto9;
    }

    public NSBikeStation withMesto9(int mesto9) {
        this.mesto9 = mesto9;
        return this;
    }

    @JsonProperty("mesto10")
    public int getMesto10() {
        return mesto10;
    }

    @JsonProperty("mesto10")
    public void setMesto10(int mesto10) {
        this.mesto10 = mesto10;
    }

    public NSBikeStation withMesto10(int mesto10) {
        this.mesto10 = mesto10;
        return this;
    }

    @JsonProperty("mesto11")
    public int getMesto11() {
        return mesto11;
    }

    @JsonProperty("mesto11")
    public void setMesto11(int mesto11) {
        this.mesto11 = mesto11;
    }

    public NSBikeStation withMesto11(int mesto11) {
        this.mesto11 = mesto11;
        return this;
    }

    @JsonProperty("mesto12")
    public int getMesto12() {
        return mesto12;
    }

    @JsonProperty("mesto12")
    public void setMesto12(int mesto12) {
        this.mesto12 = mesto12;
    }

    public NSBikeStation withMesto12(int mesto12) {
        this.mesto12 = mesto12;
        return this;
    }

    @JsonProperty("mesto13")
    public int getMesto13() {
        return mesto13;
    }

    @JsonProperty("mesto13")
    public void setMesto13(int mesto13) {
        this.mesto13 = mesto13;
    }

    public NSBikeStation withMesto13(int mesto13) {
        this.mesto13 = mesto13;
        return this;
    }

    @JsonProperty("mesto14")
    public int getMesto14() {
        return mesto14;
    }

    @JsonProperty("mesto14")
    public void setMesto14(int mesto14) {
        this.mesto14 = mesto14;
    }

    public NSBikeStation withMesto14(int mesto14) {
        this.mesto14 = mesto14;
        return this;
    }

    @JsonProperty("zauzeto")
    public int getZauzeto() {
        return zauzeto;
    }

    @JsonProperty("zauzeto")
    public void setZauzeto(int zauzeto) {
        this.zauzeto = zauzeto;
    }

    public NSBikeStation withZauzeto(int zauzeto) {
        this.zauzeto = zauzeto;
        return this;
    }

    @JsonProperty("slobodno")
    public int getSlobodno() {
        return slobodno;
    }

    @JsonProperty("slobodno")
    public void setSlobodno(int slobodno) {
        this.slobodno = slobodno;
    }

    public NSBikeStation withSlobodno(int slobodno) {
        this.slobodno = slobodno;
        return this;
    }

    @JsonProperty("vreme")
    public String getVreme() {
        return vreme;
    }

    @JsonProperty("vreme")
    public void setVreme(String vreme) {
        this.vreme = vreme;
    }

    public NSBikeStation withVreme(String vreme) {
        this.vreme = vreme;
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

    public NSBikeStation withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("rbr", rbr).append("biciklana", biciklana).append("naziv", naziv).append("adresa", adresa).append("sirina", sirina).append("visina", visina).append("mesto1", mesto1).append("mesto2", mesto2).append("mesto3", mesto3).append("mesto4", mesto4).append("mesto5", mesto5).append("mesto6", mesto6).append("mesto7", mesto7).append("mesto8", mesto8).append("mesto9", mesto9).append("mesto10", mesto10).append("mesto11", mesto11).append("mesto12", mesto12).append("mesto13", mesto13).append("mesto14", mesto14).append("zauzeto", zauzeto).append("slobodno", slobodno).append("vreme", vreme).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(slobodno).append(sirina).append(naziv).append(mesto7).append(mesto6).append(mesto9).append(mesto8).append(biciklana).append(zauzeto).append(adresa).append(mesto13).append(mesto14).append(vreme).append(mesto4).append(mesto5).append(mesto2).append(mesto3).append(mesto11).append(rbr).append(mesto12).append(mesto1).append(mesto10).append(visina).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NSBikeStation) == false) {
            return false;
        }
        NSBikeStation rhs = ((NSBikeStation) other);
        return new EqualsBuilder().append(slobodno, rhs.slobodno).append(sirina, rhs.sirina).append(naziv, rhs.naziv).append(mesto7, rhs.mesto7).append(mesto6, rhs.mesto6).append(mesto9, rhs.mesto9).append(mesto8, rhs.mesto8).append(biciklana, rhs.biciklana).append(zauzeto, rhs.zauzeto).append(adresa, rhs.adresa).append(mesto13, rhs.mesto13).append(mesto14, rhs.mesto14).append(vreme, rhs.vreme).append(mesto4, rhs.mesto4).append(mesto5, rhs.mesto5).append(mesto2, rhs.mesto2).append(mesto3, rhs.mesto3).append(mesto11, rhs.mesto11).append(rbr, rhs.rbr).append(mesto12, rhs.mesto12).append(mesto1, rhs.mesto1).append(mesto10, rhs.mesto10).append(visina, rhs.visina).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
