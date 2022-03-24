
package com.example.consumeapi.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Datum {

    @JsonProperty("ID Nation")
    private String mIDNation;
    @JsonProperty("ID Year")
    private Long mIDYear;
    @JsonProperty("Nation")
    private String mNation;
    @JsonProperty("Population")
    private Long mPopulation;
    @JsonProperty("Slug Nation")
    private String mSlugNation;
    @JsonProperty("Year")
    private String mYear;

    public String getIDNation() {
        return mIDNation;
    }

    public void setIDNation(String iDNation) {
        mIDNation = iDNation;
    }

    public Long getIDYear() {
        return mIDYear;
    }

    public void setIDYear(Long iDYear) {
        mIDYear = iDYear;
    }

    public String getNation() {
        return mNation;
    }

    public void setNation(String nation) {
        mNation = nation;
    }

    public Long getPopulation() {
        return mPopulation;
    }

    public void setPopulation(Long population) {
        mPopulation = population;
    }

    public String getSlugNation() {
        return mSlugNation;
    }

    public void setSlugNation(String slugNation) {
        mSlugNation = slugNation;
    }

    public String getYear() {
        return mYear;
    }

    public void setYear(String year) {
        mYear = year;
    }

    @Override
    public String toString() {
        return "Datum{" +
                "mIDNation='" + mIDNation + '\'' +
                ", mIDYear=" + mIDYear +
                ", mNation='" + mNation + '\'' +
                ", mPopulation=" + mPopulation +
                ", mSlugNation='" + mSlugNation + '\'' +
                ", mYear='" + mYear + '\'' +
                '}';
    }
}
