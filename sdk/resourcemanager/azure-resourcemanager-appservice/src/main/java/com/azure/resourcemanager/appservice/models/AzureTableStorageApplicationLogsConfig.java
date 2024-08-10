// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Application logs to Azure table storage configuration.
 */
@Fluent
public final class AzureTableStorageApplicationLogsConfig
    implements JsonSerializable<AzureTableStorageApplicationLogsConfig> {
    /*
     * Log level.
     */
    private LogLevel level;

    /*
     * SAS URL to an Azure table with add/query/delete permissions.
     */
    private String sasUrl;

    /**
     * Creates an instance of AzureTableStorageApplicationLogsConfig class.
     */
    public AzureTableStorageApplicationLogsConfig() {
    }

    /**
     * Get the level property: Log level.
     * 
     * @return the level value.
     */
    public LogLevel level() {
        return this.level;
    }

    /**
     * Set the level property: Log level.
     * 
     * @param level the level value to set.
     * @return the AzureTableStorageApplicationLogsConfig object itself.
     */
    public AzureTableStorageApplicationLogsConfig withLevel(LogLevel level) {
        this.level = level;
        return this;
    }

    /**
     * Get the sasUrl property: SAS URL to an Azure table with add/query/delete permissions.
     * 
     * @return the sasUrl value.
     */
    public String sasUrl() {
        return this.sasUrl;
    }

    /**
     * Set the sasUrl property: SAS URL to an Azure table with add/query/delete permissions.
     * 
     * @param sasUrl the sasUrl value to set.
     * @return the AzureTableStorageApplicationLogsConfig object itself.
     */
    public AzureTableStorageApplicationLogsConfig withSasUrl(String sasUrl) {
        this.sasUrl = sasUrl;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sasUrl() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property sasUrl in model AzureTableStorageApplicationLogsConfig"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureTableStorageApplicationLogsConfig.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("sasUrl", this.sasUrl);
        jsonWriter.writeStringField("level", this.level == null ? null : this.level.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureTableStorageApplicationLogsConfig from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureTableStorageApplicationLogsConfig if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AzureTableStorageApplicationLogsConfig.
     */
    public static AzureTableStorageApplicationLogsConfig fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureTableStorageApplicationLogsConfig deserializedAzureTableStorageApplicationLogsConfig
                = new AzureTableStorageApplicationLogsConfig();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sasUrl".equals(fieldName)) {
                    deserializedAzureTableStorageApplicationLogsConfig.sasUrl = reader.getString();
                } else if ("level".equals(fieldName)) {
                    deserializedAzureTableStorageApplicationLogsConfig.level = LogLevel.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureTableStorageApplicationLogsConfig;
        });
    }
}
