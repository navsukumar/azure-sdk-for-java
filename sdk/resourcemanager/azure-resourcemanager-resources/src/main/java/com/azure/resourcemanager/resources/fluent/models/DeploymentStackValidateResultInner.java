// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.core.management.exception.ManagementError;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.resources.models.AzureResourceBase;
import com.azure.resourcemanager.resources.models.DeploymentStackValidateProperties;
import java.io.IOException;

/**
 * The Deployment stack validation result.
 */
@Fluent
public final class DeploymentStackValidateResultInner extends AzureResourceBase {
    /*
     * The validation result details.
     */
    private DeploymentStackValidateProperties properties;

    /*
     * The error detail.
     */
    private ManagementError error;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /**
     * Creates an instance of DeploymentStackValidateResultInner class.
     */
    public DeploymentStackValidateResultInner() {
    }

    /**
     * Get the properties property: The validation result details.
     * 
     * @return the properties value.
     */
    public DeploymentStackValidateProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The validation result details.
     * 
     * @param properties the properties value to set.
     * @return the DeploymentStackValidateResultInner object itself.
     */
    public DeploymentStackValidateResultInner withProperties(DeploymentStackValidateProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the error property: The error detail.
     * 
     * @return the error value.
     */
    public ManagementError error() {
        return this.error;
    }

    /**
     * Set the error property: The error detail.
     * 
     * @param error the error value to set.
     * @return the DeploymentStackValidateResultInner object itself.
     */
    public DeploymentStackValidateResultInner withError(ManagementError error) {
        this.error = error;
        return this;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    @Override
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.properties);
        jsonWriter.writeJsonField("error", this.error);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DeploymentStackValidateResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DeploymentStackValidateResultInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DeploymentStackValidateResultInner.
     */
    public static DeploymentStackValidateResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DeploymentStackValidateResultInner deserializedDeploymentStackValidateResultInner
                = new DeploymentStackValidateResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedDeploymentStackValidateResultInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedDeploymentStackValidateResultInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedDeploymentStackValidateResultInner.type = reader.getString();
                } else if ("systemData".equals(fieldName)) {
                    deserializedDeploymentStackValidateResultInner.systemData = SystemData.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedDeploymentStackValidateResultInner.properties
                        = DeploymentStackValidateProperties.fromJson(reader);
                } else if ("error".equals(fieldName)) {
                    deserializedDeploymentStackValidateResultInner.error = ManagementError.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDeploymentStackValidateResultInner;
        });
    }
}
