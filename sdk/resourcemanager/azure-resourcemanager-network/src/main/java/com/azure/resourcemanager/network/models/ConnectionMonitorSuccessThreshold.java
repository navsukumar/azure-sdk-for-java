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

/**
 * Describes the threshold for declaring a test successful.
 */
@Fluent
public final class ConnectionMonitorSuccessThreshold implements JsonSerializable<ConnectionMonitorSuccessThreshold> {
    /*
     * The maximum percentage of failed checks permitted for a test to evaluate as successful.
     */
    private Integer checksFailedPercent;

    /*
     * The maximum round-trip time in milliseconds permitted for a test to evaluate as successful.
     */
    private Float roundTripTimeMs;

    /**
     * Creates an instance of ConnectionMonitorSuccessThreshold class.
     */
    public ConnectionMonitorSuccessThreshold() {
    }

    /**
     * Get the checksFailedPercent property: The maximum percentage of failed checks permitted for a test to evaluate as
     * successful.
     * 
     * @return the checksFailedPercent value.
     */
    public Integer checksFailedPercent() {
        return this.checksFailedPercent;
    }

    /**
     * Set the checksFailedPercent property: The maximum percentage of failed checks permitted for a test to evaluate as
     * successful.
     * 
     * @param checksFailedPercent the checksFailedPercent value to set.
     * @return the ConnectionMonitorSuccessThreshold object itself.
     */
    public ConnectionMonitorSuccessThreshold withChecksFailedPercent(Integer checksFailedPercent) {
        this.checksFailedPercent = checksFailedPercent;
        return this;
    }

    /**
     * Get the roundTripTimeMs property: The maximum round-trip time in milliseconds permitted for a test to evaluate as
     * successful.
     * 
     * @return the roundTripTimeMs value.
     */
    public Float roundTripTimeMs() {
        return this.roundTripTimeMs;
    }

    /**
     * Set the roundTripTimeMs property: The maximum round-trip time in milliseconds permitted for a test to evaluate as
     * successful.
     * 
     * @param roundTripTimeMs the roundTripTimeMs value to set.
     * @return the ConnectionMonitorSuccessThreshold object itself.
     */
    public ConnectionMonitorSuccessThreshold withRoundTripTimeMs(Float roundTripTimeMs) {
        this.roundTripTimeMs = roundTripTimeMs;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("checksFailedPercent", this.checksFailedPercent);
        jsonWriter.writeNumberField("roundTripTimeMs", this.roundTripTimeMs);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConnectionMonitorSuccessThreshold from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConnectionMonitorSuccessThreshold if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ConnectionMonitorSuccessThreshold.
     */
    public static ConnectionMonitorSuccessThreshold fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConnectionMonitorSuccessThreshold deserializedConnectionMonitorSuccessThreshold
                = new ConnectionMonitorSuccessThreshold();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("checksFailedPercent".equals(fieldName)) {
                    deserializedConnectionMonitorSuccessThreshold.checksFailedPercent
                        = reader.getNullable(JsonReader::getInt);
                } else if ("roundTripTimeMs".equals(fieldName)) {
                    deserializedConnectionMonitorSuccessThreshold.roundTripTimeMs
                        = reader.getNullable(JsonReader::getFloat);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConnectionMonitorSuccessThreshold;
        });
    }
}
