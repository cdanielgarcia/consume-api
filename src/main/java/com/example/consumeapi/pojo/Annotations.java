
package com.example.consumeapi.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Annotations {

    @JsonProperty("dataset_link")
    private String mDatasetLink;
    @JsonProperty("dataset_name")
    private String mDatasetName;
    @JsonProperty("source_description")
    private String mSourceDescription;
    @JsonProperty("source_name")
    private String mSourceName;
    private String subtopic;
    @JsonProperty("table_id")
    private String mTableId;
    private String topic;

    public String getDatasetLink() {
        return mDatasetLink;
    }

    public void setDatasetLink(String datasetLink) {
        mDatasetLink = datasetLink;
    }

    public String getDatasetName() {
        return mDatasetName;
    }

    public void setDatasetName(String datasetName) {
        mDatasetName = datasetName;
    }

    public String getSourceDescription() {
        return mSourceDescription;
    }

    public void setSourceDescription(String sourceDescription) {
        mSourceDescription = sourceDescription;
    }

    public String getSourceName() {
        return mSourceName;
    }

    public void setSourceName(String sourceName) {
        mSourceName = sourceName;
    }

    public String getSubtopic() {
        return subtopic;
    }

    public void setSubtopic(String subtopic) {
        this.subtopic = subtopic;
    }

    public String getTableId() {
        return mTableId;
    }

    public void setTableId(String tableId) {
        mTableId = tableId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "Annotations{" +
                "mDatasetLink='" + mDatasetLink + '\'' +
                ", mDatasetName='" + mDatasetName + '\'' +
                ", mSourceDescription='" + mSourceDescription + '\'' +
                ", mSourceName='" + mSourceName + '\'' +
                ", subtopic='" + subtopic + '\'' +
                ", mTableId='" + mTableId + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }
}
