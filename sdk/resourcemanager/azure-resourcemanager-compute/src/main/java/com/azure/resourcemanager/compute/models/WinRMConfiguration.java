// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Describes Windows Remote Management configuration of the VM.
 */
@Fluent
public final class WinRMConfiguration implements JsonSerializable<WinRMConfiguration> {
    /*
     * The list of Windows Remote Management listeners
     */
    private List<WinRMListener> listeners;

    /**
     * Creates an instance of WinRMConfiguration class.
     */
    public WinRMConfiguration() {
    }

    /**
     * Get the listeners property: The list of Windows Remote Management listeners.
     * 
     * @return the listeners value.
     */
    public List<WinRMListener> listeners() {
        return this.listeners;
    }

    /**
     * Set the listeners property: The list of Windows Remote Management listeners.
     * 
     * @param listeners the listeners value to set.
     * @return the WinRMConfiguration object itself.
     */
    public WinRMConfiguration withListeners(List<WinRMListener> listeners) {
        this.listeners = listeners;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (listeners() != null) {
            listeners().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("listeners", this.listeners, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WinRMConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WinRMConfiguration if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the WinRMConfiguration.
     */
    public static WinRMConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WinRMConfiguration deserializedWinRMConfiguration = new WinRMConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("listeners".equals(fieldName)) {
                    List<WinRMListener> listeners = reader.readArray(reader1 -> WinRMListener.fromJson(reader1));
                    deserializedWinRMConfiguration.listeners = listeners;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWinRMConfiguration;
        });
    }
}
