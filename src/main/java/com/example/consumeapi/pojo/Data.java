
package com.example.consumeapi.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Data {

    @JsonProperty("data")
    private List<Datum> mData;
    @JsonProperty("source")
    private List<Source> mSource;

    public List<Datum> getData() {
        return mData;
    }

    public void setData(List<Datum> data) {
        mData = data;
    }

    public List<Source> getSource() {
        return mSource;
    }

    public void setSource(List<Source> source) {
        mSource = source;
    }

    @Override
    public String toString() {
        return "Data{" +
                "mData=" + mData +
                ", mSource=" + mSource +
                '}';
    }
}
