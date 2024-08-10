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
 * Properties of Provisioning Issue.
 */
@Fluent
public final class ProvisioningIssueProperties implements JsonSerializable<ProvisioningIssueProperties> {
    /*
     * Type of Issue
     */
    private String issueType;

    /*
     * Description of the issue
     */
    private String description;

    /**
     * Creates an instance of ProvisioningIssueProperties class.
     */
    public ProvisioningIssueProperties() {
    }

    /**
     * Get the issueType property: Type of Issue.
     * 
     * @return the issueType value.
     */
    public String issueType() {
        return this.issueType;
    }

    /**
     * Set the issueType property: Type of Issue.
     * 
     * @param issueType the issueType value to set.
     * @return the ProvisioningIssueProperties object itself.
     */
    public ProvisioningIssueProperties withIssueType(String issueType) {
        this.issueType = issueType;
        return this;
    }

    /**
     * Get the description property: Description of the issue.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the issue.
     * 
     * @param description the description value to set.
     * @return the ProvisioningIssueProperties object itself.
     */
    public ProvisioningIssueProperties withDescription(String description) {
        this.description = description;
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
        jsonWriter.writeStringField("issueType", this.issueType);
        jsonWriter.writeStringField("description", this.description);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProvisioningIssueProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProvisioningIssueProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ProvisioningIssueProperties.
     */
    public static ProvisioningIssueProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProvisioningIssueProperties deserializedProvisioningIssueProperties = new ProvisioningIssueProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("issueType".equals(fieldName)) {
                    deserializedProvisioningIssueProperties.issueType = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedProvisioningIssueProperties.description = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProvisioningIssueProperties;
        });
    }
}
