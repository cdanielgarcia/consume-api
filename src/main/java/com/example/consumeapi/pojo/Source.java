
package com.example.consumeapi.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Source {

    @JsonProperty("annotations")
    private Annotations mAnnotations;
    @JsonProperty("measures")
    private List<String> mMeasures;
    @JsonProperty("name")
    private String mName;
    @JsonProperty("substitutions")
    private List<Object> mSubstitutions;

    public Annotations getAnnotations() {
        return mAnnotations;
    }

    public void setAnnotations(Annotations annotations) {
        mAnnotations = annotations;
    }

    public List<String> getMeasures() {
        return mMeasures;
    }

    public void setMeasures(List<String> measures) {
        mMeasures = measures;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public List<Object> getSubstitutions() {
        return mSubstitutions;
    }

    public void setSubstitutions(List<Object> substitutions) {
        mSubstitutions = substitutions;
    }

    @Override
    public String toString() {
        return "Source{" +
                "mAnnotations=" + mAnnotations +
                ", mMeasures=" + mMeasures +
                ", mName='" + mName + '\'' +
                ", mSubstitutions=" + mSubstitutions +
                '}';
    }
}
