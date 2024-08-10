// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Information gained from troubleshooting of specified resource.
 */
@Fluent
public final class TroubleshootingDetails implements JsonSerializable<TroubleshootingDetails> {
    /*
     * The id of the get troubleshoot operation.
     */
    private String id;

    /*
     * Reason type of failure.
     */
    private String reasonType;

    /*
     * A summary of troubleshooting.
     */
    private String summary;

    /*
     * Details on troubleshooting results.
     */
    private String detail;

    /*
     * List of recommended actions.
     */
    private List<TroubleshootingRecommendedActions> recommendedActions;

    /**
     * Creates an instance of TroubleshootingDetails class.
     */
    public TroubleshootingDetails() {
    }

    /**
     * Get the id property: The id of the get troubleshoot operation.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The id of the get troubleshoot operation.
     * 
     * @param id the id value to set.
     * @return the TroubleshootingDetails object itself.
     */
    public TroubleshootingDetails withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the reasonType property: Reason type of failure.
     * 
     * @return the reasonType value.
     */
    public String reasonType() {
        return this.reasonType;
    }

    /**
     * Set the reasonType property: Reason type of failure.
     * 
     * @param reasonType the reasonType value to set.
     * @return the TroubleshootingDetails object itself.
     */
    public TroubleshootingDetails withReasonType(String reasonType) {
        this.reasonType = reasonType;
        return this;
    }

    /**
     * Get the summary property: A summary of troubleshooting.
     * 
     * @return the summary value.
     */
    public String summary() {
        return this.summary;
    }

    /**
     * Set the summary property: A summary of troubleshooting.
     * 
     * @param summary the summary value to set.
     * @return the TroubleshootingDetails object itself.
     */
    public TroubleshootingDetails withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Get the detail property: Details on troubleshooting results.
     * 
     * @return the detail value.
     */
    public String detail() {
        return this.detail;
    }

    /**
     * Set the detail property: Details on troubleshooting results.
     * 
     * @param detail the detail value to set.
     * @return the TroubleshootingDetails object itself.
     */
    public TroubleshootingDetails withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * Get the recommendedActions property: List of recommended actions.
     * 
     * @return the recommendedActions value.
     */
    public List<TroubleshootingRecommendedActions> recommendedActions() {
        return this.recommendedActions;
    }

    /**
     * Set the recommendedActions property: List of recommended actions.
     * 
     * @param recommendedActions the recommendedActions value to set.
     * @return the TroubleshootingDetails object itself.
     */
    public TroubleshootingDetails withRecommendedActions(List<TroubleshootingRecommendedActions> recommendedActions) {
        this.recommendedActions = recommendedActions;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (recommendedActions() != null) {
            recommendedActions().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("reasonType", this.reasonType);
        jsonWriter.writeStringField("summary", this.summary);
        jsonWriter.writeStringField("detail", this.detail);
        jsonWriter.writeArrayField("recommendedActions", this.recommendedActions,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TroubleshootingDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TroubleshootingDetails if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the TroubleshootingDetails.
     */
    public static TroubleshootingDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TroubleshootingDetails deserializedTroubleshootingDetails = new TroubleshootingDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedTroubleshootingDetails.id = reader.getString();
                } else if ("reasonType".equals(fieldName)) {
                    deserializedTroubleshootingDetails.reasonType = reader.getString();
                } else if ("summary".equals(fieldName)) {
                    deserializedTroubleshootingDetails.summary = reader.getString();
                } else if ("detail".equals(fieldName)) {
                    deserializedTroubleshootingDetails.detail = reader.getString();
                } else if ("recommendedActions".equals(fieldName)) {
                    List<TroubleshootingRecommendedActions> recommendedActions
                        = reader.readArray(reader1 -> TroubleshootingRecommendedActions.fromJson(reader1));
                    deserializedTroubleshootingDetails.recommendedActions = recommendedActions;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTroubleshootingDetails;
        });
    }
}
