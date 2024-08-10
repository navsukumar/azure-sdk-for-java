// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Extension specific properties.
 */
@Fluent
public final class DeploymentExtensionSpecProperties implements JsonSerializable<DeploymentExtensionSpecProperties> {
    /*
     * Type of extension to be added.
     */
    private String extensionType;

    /*
     * Version of the extension being used.
     */
    private String version;

    /*
     * Settings for the extension.
     */
    private Object settings;

    /*
     * Protected settings for the extension.
     */
    private Object protectedSettings;

    /**
     * Creates an instance of DeploymentExtensionSpecProperties class.
     */
    public DeploymentExtensionSpecProperties() {
    }

    /**
     * Get the extensionType property: Type of extension to be added.
     * 
     * @return the extensionType value.
     */
    public String extensionType() {
        return this.extensionType;
    }

    /**
     * Set the extensionType property: Type of extension to be added.
     * 
     * @param extensionType the extensionType value to set.
     * @return the DeploymentExtensionSpecProperties object itself.
     */
    public DeploymentExtensionSpecProperties withExtensionType(String extensionType) {
        this.extensionType = extensionType;
        return this;
    }

    /**
     * Get the version property: Version of the extension being used.
     * 
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Version of the extension being used.
     * 
     * @param version the version value to set.
     * @return the DeploymentExtensionSpecProperties object itself.
     */
    public DeploymentExtensionSpecProperties withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the settings property: Settings for the extension.
     * 
     * @return the settings value.
     */
    public Object settings() {
        return this.settings;
    }

    /**
     * Set the settings property: Settings for the extension.
     * 
     * @param settings the settings value to set.
     * @return the DeploymentExtensionSpecProperties object itself.
     */
    public DeploymentExtensionSpecProperties withSettings(Object settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Get the protectedSettings property: Protected settings for the extension.
     * 
     * @return the protectedSettings value.
     */
    public Object protectedSettings() {
        return this.protectedSettings;
    }

    /**
     * Set the protectedSettings property: Protected settings for the extension.
     * 
     * @param protectedSettings the protectedSettings value to set.
     * @return the DeploymentExtensionSpecProperties object itself.
     */
    public DeploymentExtensionSpecProperties withProtectedSettings(Object protectedSettings) {
        this.protectedSettings = protectedSettings;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (extensionType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property extensionType in model DeploymentExtensionSpecProperties"));
        }
        if (version() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property version in model DeploymentExtensionSpecProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DeploymentExtensionSpecProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("extensionType", this.extensionType);
        jsonWriter.writeStringField("version", this.version);
        jsonWriter.writeUntypedField("settings", this.settings);
        jsonWriter.writeUntypedField("protectedSettings", this.protectedSettings);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DeploymentExtensionSpecProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DeploymentExtensionSpecProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DeploymentExtensionSpecProperties.
     */
    public static DeploymentExtensionSpecProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DeploymentExtensionSpecProperties deserializedDeploymentExtensionSpecProperties
                = new DeploymentExtensionSpecProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("extensionType".equals(fieldName)) {
                    deserializedDeploymentExtensionSpecProperties.extensionType = reader.getString();
                } else if ("version".equals(fieldName)) {
                    deserializedDeploymentExtensionSpecProperties.version = reader.getString();
                } else if ("settings".equals(fieldName)) {
                    deserializedDeploymentExtensionSpecProperties.settings = reader.readUntyped();
                } else if ("protectedSettings".equals(fieldName)) {
                    deserializedDeploymentExtensionSpecProperties.protectedSettings = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDeploymentExtensionSpecProperties;
        });
    }
}
