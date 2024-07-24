// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Class containing feature settings of vault.
 */
@Fluent
public final class FeatureSettings implements JsonSerializable<FeatureSettings> {
    /*
     * CrossSubscriptionRestore Settings
     */
    private CrossSubscriptionRestoreSettings crossSubscriptionRestoreSettings;

    /*
     * The crossRegionRestoreSettings property.
     */
    private CrossRegionRestoreSettings crossRegionRestoreSettings;

    /**
     * Creates an instance of FeatureSettings class.
     */
    public FeatureSettings() {
    }

    /**
     * Get the crossSubscriptionRestoreSettings property: CrossSubscriptionRestore Settings.
     * 
     * @return the crossSubscriptionRestoreSettings value.
     */
    public CrossSubscriptionRestoreSettings crossSubscriptionRestoreSettings() {
        return this.crossSubscriptionRestoreSettings;
    }

    /**
     * Set the crossSubscriptionRestoreSettings property: CrossSubscriptionRestore Settings.
     * 
     * @param crossSubscriptionRestoreSettings the crossSubscriptionRestoreSettings value to set.
     * @return the FeatureSettings object itself.
     */
    public FeatureSettings
        withCrossSubscriptionRestoreSettings(CrossSubscriptionRestoreSettings crossSubscriptionRestoreSettings) {
        this.crossSubscriptionRestoreSettings = crossSubscriptionRestoreSettings;
        return this;
    }

    /**
     * Get the crossRegionRestoreSettings property: The crossRegionRestoreSettings property.
     * 
     * @return the crossRegionRestoreSettings value.
     */
    public CrossRegionRestoreSettings crossRegionRestoreSettings() {
        return this.crossRegionRestoreSettings;
    }

    /**
     * Set the crossRegionRestoreSettings property: The crossRegionRestoreSettings property.
     * 
     * @param crossRegionRestoreSettings the crossRegionRestoreSettings value to set.
     * @return the FeatureSettings object itself.
     */
    public FeatureSettings withCrossRegionRestoreSettings(CrossRegionRestoreSettings crossRegionRestoreSettings) {
        this.crossRegionRestoreSettings = crossRegionRestoreSettings;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (crossSubscriptionRestoreSettings() != null) {
            crossSubscriptionRestoreSettings().validate();
        }
        if (crossRegionRestoreSettings() != null) {
            crossRegionRestoreSettings().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("crossSubscriptionRestoreSettings", this.crossSubscriptionRestoreSettings);
        jsonWriter.writeJsonField("crossRegionRestoreSettings", this.crossRegionRestoreSettings);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FeatureSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FeatureSettings if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the FeatureSettings.
     */
    public static FeatureSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FeatureSettings deserializedFeatureSettings = new FeatureSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("crossSubscriptionRestoreSettings".equals(fieldName)) {
                    deserializedFeatureSettings.crossSubscriptionRestoreSettings
                        = CrossSubscriptionRestoreSettings.fromJson(reader);
                } else if ("crossRegionRestoreSettings".equals(fieldName)) {
                    deserializedFeatureSettings.crossRegionRestoreSettings
                        = CrossRegionRestoreSettings.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFeatureSettings;
        });
    }
}
