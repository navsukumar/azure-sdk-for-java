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
 * Qos Traffic Profiler IP Range properties.
 */
@Fluent
public final class QosIpRange implements JsonSerializable<QosIpRange> {
    /*
     * Start IP Address.
     */
    private String startIp;

    /*
     * End IP Address.
     */
    private String endIp;

    /**
     * Creates an instance of QosIpRange class.
     */
    public QosIpRange() {
    }

    /**
     * Get the startIp property: Start IP Address.
     * 
     * @return the startIp value.
     */
    public String startIp() {
        return this.startIp;
    }

    /**
     * Set the startIp property: Start IP Address.
     * 
     * @param startIp the startIp value to set.
     * @return the QosIpRange object itself.
     */
    public QosIpRange withStartIp(String startIp) {
        this.startIp = startIp;
        return this;
    }

    /**
     * Get the endIp property: End IP Address.
     * 
     * @return the endIp value.
     */
    public String endIp() {
        return this.endIp;
    }

    /**
     * Set the endIp property: End IP Address.
     * 
     * @param endIp the endIp value to set.
     * @return the QosIpRange object itself.
     */
    public QosIpRange withEndIp(String endIp) {
        this.endIp = endIp;
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
        jsonWriter.writeStringField("startIP", this.startIp);
        jsonWriter.writeStringField("endIP", this.endIp);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of QosIpRange from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of QosIpRange if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the QosIpRange.
     */
    public static QosIpRange fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            QosIpRange deserializedQosIpRange = new QosIpRange();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("startIP".equals(fieldName)) {
                    deserializedQosIpRange.startIp = reader.getString();
                } else if ("endIP".equals(fieldName)) {
                    deserializedQosIpRange.endIp = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedQosIpRange;
        });
    }
}
