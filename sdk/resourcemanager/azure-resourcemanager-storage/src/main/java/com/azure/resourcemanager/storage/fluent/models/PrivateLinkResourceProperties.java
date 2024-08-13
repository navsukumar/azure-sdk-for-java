// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Properties of a private link resource.
 */
@Fluent
public final class PrivateLinkResourceProperties implements JsonSerializable<PrivateLinkResourceProperties> {
    /*
     * The private link resource group id.
     */
    private String groupId;

    /*
     * The private link resource required member names.
     */
    private List<String> requiredMembers;

    /*
     * The private link resource Private link DNS zone name.
     */
    private List<String> requiredZoneNames;

    /**
     * Creates an instance of PrivateLinkResourceProperties class.
     */
    public PrivateLinkResourceProperties() {
    }

    /**
     * Get the groupId property: The private link resource group id.
     * 
     * @return the groupId value.
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Get the requiredMembers property: The private link resource required member names.
     * 
     * @return the requiredMembers value.
     */
    public List<String> requiredMembers() {
        return this.requiredMembers;
    }

    /**
     * Get the requiredZoneNames property: The private link resource Private link DNS zone name.
     * 
     * @return the requiredZoneNames value.
     */
    public List<String> requiredZoneNames() {
        return this.requiredZoneNames;
    }

    /**
     * Set the requiredZoneNames property: The private link resource Private link DNS zone name.
     * 
     * @param requiredZoneNames the requiredZoneNames value to set.
     * @return the PrivateLinkResourceProperties object itself.
     */
    public PrivateLinkResourceProperties withRequiredZoneNames(List<String> requiredZoneNames) {
        this.requiredZoneNames = requiredZoneNames;
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
        jsonWriter.writeArrayField("requiredZoneNames", this.requiredZoneNames,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrivateLinkResourceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateLinkResourceProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateLinkResourceProperties.
     */
    public static PrivateLinkResourceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateLinkResourceProperties deserializedPrivateLinkResourceProperties
                = new PrivateLinkResourceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("groupId".equals(fieldName)) {
                    deserializedPrivateLinkResourceProperties.groupId = reader.getString();
                } else if ("requiredMembers".equals(fieldName)) {
                    List<String> requiredMembers = reader.readArray(reader1 -> reader1.getString());
                    deserializedPrivateLinkResourceProperties.requiredMembers = requiredMembers;
                } else if ("requiredZoneNames".equals(fieldName)) {
                    List<String> requiredZoneNames = reader.readArray(reader1 -> reader1.getString());
                    deserializedPrivateLinkResourceProperties.requiredZoneNames = requiredZoneNames;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateLinkResourceProperties;
        });
    }
}
