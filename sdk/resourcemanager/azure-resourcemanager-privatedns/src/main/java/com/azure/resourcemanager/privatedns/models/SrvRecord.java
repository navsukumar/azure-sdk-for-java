// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.privatedns.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * An SRV record.
 */
@Fluent
public final class SrvRecord implements JsonSerializable<SrvRecord> {
    /*
     * The priority value for this SRV record.
     */
    private Integer priority;

    /*
     * The weight value for this SRV record.
     */
    private Integer weight;

    /*
     * The port value for this SRV record.
     */
    private Integer port;

    /*
     * The target domain name for this SRV record.
     */
    private String target;

    /**
     * Creates an instance of SrvRecord class.
     */
    public SrvRecord() {
    }

    /**
     * Get the priority property: The priority value for this SRV record.
     * 
     * @return the priority value.
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority property: The priority value for this SRV record.
     * 
     * @param priority the priority value to set.
     * @return the SrvRecord object itself.
     */
    public SrvRecord withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the weight property: The weight value for this SRV record.
     * 
     * @return the weight value.
     */
    public Integer weight() {
        return this.weight;
    }

    /**
     * Set the weight property: The weight value for this SRV record.
     * 
     * @param weight the weight value to set.
     * @return the SrvRecord object itself.
     */
    public SrvRecord withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Get the port property: The port value for this SRV record.
     * 
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: The port value for this SRV record.
     * 
     * @param port the port value to set.
     * @return the SrvRecord object itself.
     */
    public SrvRecord withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the target property: The target domain name for this SRV record.
     * 
     * @return the target value.
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target property: The target domain name for this SRV record.
     * 
     * @param target the target value to set.
     * @return the SrvRecord object itself.
     */
    public SrvRecord withTarget(String target) {
        this.target = target;
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
        jsonWriter.writeNumberField("priority", this.priority);
        jsonWriter.writeNumberField("weight", this.weight);
        jsonWriter.writeNumberField("port", this.port);
        jsonWriter.writeStringField("target", this.target);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SrvRecord from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SrvRecord if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the SrvRecord.
     */
    public static SrvRecord fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SrvRecord deserializedSrvRecord = new SrvRecord();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("priority".equals(fieldName)) {
                    deserializedSrvRecord.priority = reader.getNullable(JsonReader::getInt);
                } else if ("weight".equals(fieldName)) {
                    deserializedSrvRecord.weight = reader.getNullable(JsonReader::getInt);
                } else if ("port".equals(fieldName)) {
                    deserializedSrvRecord.port = reader.getNullable(JsonReader::getInt);
                } else if ("target".equals(fieldName)) {
                    deserializedSrvRecord.target = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSrvRecord;
        });
    }
}
