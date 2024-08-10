// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.data.appconfiguration.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The SettingLabel model.
 */
@Immutable
public final class SettingLabel implements JsonSerializable<SettingLabel> {
    /*
     * The name of the label.
     */
    private String name;

    /**
     * Creates an instance of SettingLabel class.
     */
    public SettingLabel() {
    }

    /**
     * Get the name property: The name of the label.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SettingLabel from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SettingLabel if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SettingLabel.
     */
    public static SettingLabel fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SettingLabel deserializedSettingLabel = new SettingLabel();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedSettingLabel.name = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSettingLabel;
        });
    }
}
