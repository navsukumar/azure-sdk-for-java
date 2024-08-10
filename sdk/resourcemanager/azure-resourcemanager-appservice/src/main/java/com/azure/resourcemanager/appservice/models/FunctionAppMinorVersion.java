// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Function App stack minor version.
 */
@Immutable
public final class FunctionAppMinorVersion implements JsonSerializable<FunctionAppMinorVersion> {
    /*
     * Function App stack (display only).
     */
    private String displayText;

    /*
     * Function App stack name.
     */
    private String value;

    /*
     * Settings associated with the minor version.
     */
    private FunctionAppRuntimes stackSettings;

    /**
     * Creates an instance of FunctionAppMinorVersion class.
     */
    public FunctionAppMinorVersion() {
    }

    /**
     * Get the displayText property: Function App stack (display only).
     * 
     * @return the displayText value.
     */
    public String displayText() {
        return this.displayText;
    }

    /**
     * Get the value property: Function App stack name.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Get the stackSettings property: Settings associated with the minor version.
     * 
     * @return the stackSettings value.
     */
    public FunctionAppRuntimes stackSettings() {
        return this.stackSettings;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (stackSettings() != null) {
            stackSettings().validate();
        }
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
     * Reads an instance of FunctionAppMinorVersion from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FunctionAppMinorVersion if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the FunctionAppMinorVersion.
     */
    public static FunctionAppMinorVersion fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FunctionAppMinorVersion deserializedFunctionAppMinorVersion = new FunctionAppMinorVersion();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("displayText".equals(fieldName)) {
                    deserializedFunctionAppMinorVersion.displayText = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedFunctionAppMinorVersion.value = reader.getString();
                } else if ("stackSettings".equals(fieldName)) {
                    deserializedFunctionAppMinorVersion.stackSettings = FunctionAppRuntimes.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFunctionAppMinorVersion;
        });
    }
}
