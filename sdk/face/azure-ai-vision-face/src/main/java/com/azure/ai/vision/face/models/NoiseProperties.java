// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.face.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Properties describing noise level of the image.
 */
@Immutable
public final class NoiseProperties implements JsonSerializable<NoiseProperties> {

    /*
     * An enum value indicating level of noise.
     */
    @Generated
    private final NoiseLevel noiseLevel;

    /*
     * A number indicating level of noise level ranging from 0 to 1. [0, 0.25) is under exposure. [0.25, 0.75) is good
     * exposure. [0.75, 1] is over exposure. [0, 0.3) is low noise level. [0.3, 0.7) is medium noise level. [0.7, 1] is
     * high noise level.
     */
    @Generated
    private final double value;

    /**
     * Creates an instance of NoiseProperties class.
     *
     * @param noiseLevel the noiseLevel value to set.
     * @param value the value value to set.
     */
    @Generated
    private NoiseProperties(NoiseLevel noiseLevel, double value) {
        this.noiseLevel = noiseLevel;
        this.value = value;
    }

    /**
     * Get the noiseLevel property: An enum value indicating level of noise.
     *
     * @return the noiseLevel value.
     */
    @Generated
    public NoiseLevel getNoiseLevel() {
        return this.noiseLevel;
    }

    /**
     * Get the value property: A number indicating level of noise level ranging from 0 to 1. [0, 0.25) is under
     * exposure. [0.25, 0.75) is good exposure. [0.75, 1] is over exposure. [0, 0.3) is low noise level. [0.3, 0.7) is
     * medium noise level. [0.7, 1] is high noise level.
     *
     * @return the value value.
     */
    @Generated
    public double getValue() {
        return this.value;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("noiseLevel", this.noiseLevel == null ? null : this.noiseLevel.toString());
        jsonWriter.writeDoubleField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NoiseProperties from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of NoiseProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the NoiseProperties.
     */
    @Generated
    public static NoiseProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NoiseLevel noiseLevel = null;
            double value = 0.0;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("noiseLevel".equals(fieldName)) {
                    noiseLevel = NoiseLevel.fromString(reader.getString());
                } else if ("value".equals(fieldName)) {
                    value = reader.getDouble();
                } else {
                    reader.skipChildren();
                }
            }
            return new NoiseProperties(noiseLevel, value);
        });
    }
}
