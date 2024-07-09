// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Supported parameters for a Healthcare task.
 */
@Fluent
public final class HealthcareTaskParameters extends PreBuiltTaskParameters {
    /*
     * Specifies the method used to interpret string offsets.  Defaults to Text Elements (Graphemes) according to Unicode v8.0.0. For additional information see https://aka.ms/text-analytics-offsets.
     */
    private StringIndexType stringIndexType;

    /**
     * Creates an instance of HealthcareTaskParameters class.
     */
    public HealthcareTaskParameters() {
    }

    /**
     * Get the stringIndexType property: Specifies the method used to interpret string offsets. Defaults to Text
     * Elements (Graphemes) according to Unicode v8.0.0. For additional information see
     * https://aka.ms/text-analytics-offsets.
     * 
     * @return the stringIndexType value.
     */
    public StringIndexType getStringIndexType() {
        return this.stringIndexType;
    }

    /**
     * Set the stringIndexType property: Specifies the method used to interpret string offsets. Defaults to Text
     * Elements (Graphemes) according to Unicode v8.0.0. For additional information see
     * https://aka.ms/text-analytics-offsets.
     * 
     * @param stringIndexType the stringIndexType value to set.
     * @return the HealthcareTaskParameters object itself.
     */
    public HealthcareTaskParameters setStringIndexType(StringIndexType stringIndexType) {
        this.stringIndexType = stringIndexType;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthcareTaskParameters setModelVersion(String modelVersion) {
        super.setModelVersion(modelVersion);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthcareTaskParameters setLoggingOptOut(Boolean loggingOptOut) {
        super.setLoggingOptOut(loggingOptOut);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("loggingOptOut", isLoggingOptOut());
        jsonWriter.writeStringField("modelVersion", getModelVersion());
        jsonWriter.writeStringField("stringIndexType",
            this.stringIndexType == null ? null : this.stringIndexType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HealthcareTaskParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HealthcareTaskParameters if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the HealthcareTaskParameters.
     */
    public static HealthcareTaskParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HealthcareTaskParameters deserializedHealthcareTaskParameters = new HealthcareTaskParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("loggingOptOut".equals(fieldName)) {
                    deserializedHealthcareTaskParameters.setLoggingOptOut(reader.getNullable(JsonReader::getBoolean));
                } else if ("modelVersion".equals(fieldName)) {
                    deserializedHealthcareTaskParameters.setModelVersion(reader.getString());
                } else if ("stringIndexType".equals(fieldName)) {
                    deserializedHealthcareTaskParameters.stringIndexType
                        = StringIndexType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHealthcareTaskParameters;
        });
    }
}
