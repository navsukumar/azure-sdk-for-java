// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appplatform.models.ConfigurationServiceGitPropertyValidateResult;
import java.io.IOException;

/**
 * Validation result for configuration service settings.
 */
@Fluent
public final class ConfigurationServiceSettingsValidateResultInner
    implements JsonSerializable<ConfigurationServiceSettingsValidateResultInner> {
    /*
     * Validation result for configuration service settings
     */
    private ConfigurationServiceGitPropertyValidateResult gitPropertyValidationResult;

    /**
     * Creates an instance of ConfigurationServiceSettingsValidateResultInner class.
     */
    public ConfigurationServiceSettingsValidateResultInner() {
    }

    /**
     * Get the gitPropertyValidationResult property: Validation result for configuration service settings.
     * 
     * @return the gitPropertyValidationResult value.
     */
    public ConfigurationServiceGitPropertyValidateResult gitPropertyValidationResult() {
        return this.gitPropertyValidationResult;
    }

    /**
     * Set the gitPropertyValidationResult property: Validation result for configuration service settings.
     * 
     * @param gitPropertyValidationResult the gitPropertyValidationResult value to set.
     * @return the ConfigurationServiceSettingsValidateResultInner object itself.
     */
    public ConfigurationServiceSettingsValidateResultInner
        withGitPropertyValidationResult(ConfigurationServiceGitPropertyValidateResult gitPropertyValidationResult) {
        this.gitPropertyValidationResult = gitPropertyValidationResult;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (gitPropertyValidationResult() != null) {
            gitPropertyValidationResult().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("gitPropertyValidationResult", this.gitPropertyValidationResult);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConfigurationServiceSettingsValidateResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConfigurationServiceSettingsValidateResultInner if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ConfigurationServiceSettingsValidateResultInner.
     */
    public static ConfigurationServiceSettingsValidateResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConfigurationServiceSettingsValidateResultInner deserializedConfigurationServiceSettingsValidateResultInner
                = new ConfigurationServiceSettingsValidateResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("gitPropertyValidationResult".equals(fieldName)) {
                    deserializedConfigurationServiceSettingsValidateResultInner.gitPropertyValidationResult
                        = ConfigurationServiceGitPropertyValidateResult.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConfigurationServiceSettingsValidateResultInner;
        });
    }
}
