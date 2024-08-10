// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.fluent.models.SecurityAdminConfigurationInner;
import java.io.IOException;
import java.util.List;

/**
 * A list of network manager security admin configurations.
 */
@Fluent
public final class SecurityAdminConfigurationListResult
    implements JsonSerializable<SecurityAdminConfigurationListResult> {
    /*
     * Gets a page of security admin configurations
     */
    private List<SecurityAdminConfigurationInner> value;

    /*
     * Gets the URL to get the next page of results.
     */
    private String nextLink;

    /**
     * Creates an instance of SecurityAdminConfigurationListResult class.
     */
    public SecurityAdminConfigurationListResult() {
    }

    /**
     * Get the value property: Gets a page of security admin configurations.
     * 
     * @return the value value.
     */
    public List<SecurityAdminConfigurationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets a page of security admin configurations.
     * 
     * @param value the value value to set.
     * @return the SecurityAdminConfigurationListResult object itself.
     */
    public SecurityAdminConfigurationListResult withValue(List<SecurityAdminConfigurationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Gets the URL to get the next page of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Gets the URL to get the next page of results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the SecurityAdminConfigurationListResult object itself.
     */
    public SecurityAdminConfigurationListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SecurityAdminConfigurationListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SecurityAdminConfigurationListResult if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SecurityAdminConfigurationListResult.
     */
    public static SecurityAdminConfigurationListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SecurityAdminConfigurationListResult deserializedSecurityAdminConfigurationListResult
                = new SecurityAdminConfigurationListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<SecurityAdminConfigurationInner> value
                        = reader.readArray(reader1 -> SecurityAdminConfigurationInner.fromJson(reader1));
                    deserializedSecurityAdminConfigurationListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedSecurityAdminConfigurationListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSecurityAdminConfigurationListResult;
        });
    }
}
