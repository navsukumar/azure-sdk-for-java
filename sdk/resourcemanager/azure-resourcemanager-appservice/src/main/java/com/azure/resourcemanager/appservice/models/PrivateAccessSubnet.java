// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Description of a Virtual Network subnet that is useable for private site access.
 */
@Fluent
public final class PrivateAccessSubnet implements JsonSerializable<PrivateAccessSubnet> {
    /*
     * The name of the subnet.
     */
    private String name;

    /*
     * The key (ID) of the subnet.
     */
    private Integer key;

    /**
     * Creates an instance of PrivateAccessSubnet class.
     */
    public PrivateAccessSubnet() {
    }

    /**
     * Get the name property: The name of the subnet.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the subnet.
     * 
     * @param name the name value to set.
     * @return the PrivateAccessSubnet object itself.
     */
    public PrivateAccessSubnet withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the key property: The key (ID) of the subnet.
     * 
     * @return the key value.
     */
    public Integer key() {
        return this.key;
    }

    /**
     * Set the key property: The key (ID) of the subnet.
     * 
     * @param key the key value to set.
     * @return the PrivateAccessSubnet object itself.
     */
    public PrivateAccessSubnet withKey(Integer key) {
        this.key = key;
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
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeNumberField("key", this.key);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrivateAccessSubnet from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateAccessSubnet if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateAccessSubnet.
     */
    public static PrivateAccessSubnet fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateAccessSubnet deserializedPrivateAccessSubnet = new PrivateAccessSubnet();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedPrivateAccessSubnet.name = reader.getString();
                } else if ("key".equals(fieldName)) {
                    deserializedPrivateAccessSubnet.key = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateAccessSubnet;
        });
    }
}
