// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Properties supplied for Subnet.
 */
@Fluent
public final class Subnet implements JsonSerializable<Subnet> {
    /*
     * Resource ID of Virtual Network Subnet
     */
    private String id;

    /**
     * Creates an instance of Subnet class.
     */
    public Subnet() {
    }

    /**
     * Get the id property: Resource ID of Virtual Network Subnet.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID of Virtual Network Subnet.
     * 
     * @param id the id value to set.
     * @return the Subnet object itself.
     */
    public Subnet withId(String id) {
        this.id = id;
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
        jsonWriter.writeStringField("id", this.id);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Subnet from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Subnet if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IOException If an error occurs while reading the Subnet.
     */
    public static Subnet fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Subnet deserializedSubnet = new Subnet();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedSubnet.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSubnet;
        });
    }
}
