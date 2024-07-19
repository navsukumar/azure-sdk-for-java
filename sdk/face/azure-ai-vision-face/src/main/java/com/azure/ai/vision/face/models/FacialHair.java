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
 * Properties describing facial hair attributes.
 */
@Immutable
public final class FacialHair implements JsonSerializable<FacialHair> {

    /*
     * A number ranging from 0 to 1 indicating a level of confidence associated with a property.
     */
    @Generated
    private final double moustache;

    /*
     * A number ranging from 0 to 1 indicating a level of confidence associated with a property.
     */
    @Generated
    private final double beard;

    /*
     * A number ranging from 0 to 1 indicating a level of confidence associated with a property.
     */
    @Generated
    private final double sideburns;

    /**
     * Creates an instance of FacialHair class.
     *
     * @param moustache the moustache value to set.
     * @param beard the beard value to set.
     * @param sideburns the sideburns value to set.
     */
    @Generated
    private FacialHair(double moustache, double beard, double sideburns) {
        this.moustache = moustache;
        this.beard = beard;
        this.sideburns = sideburns;
    }

    /**
     * Get the moustache property: A number ranging from 0 to 1 indicating a level of confidence associated with a
     * property.
     *
     * @return the moustache value.
     */
    @Generated
    public double getMoustache() {
        return this.moustache;
    }

    /**
     * Get the beard property: A number ranging from 0 to 1 indicating a level of confidence associated with a property.
     *
     * @return the beard value.
     */
    @Generated
    public double getBeard() {
        return this.beard;
    }

    /**
     * Get the sideburns property: A number ranging from 0 to 1 indicating a level of confidence associated with a
     * property.
     *
     * @return the sideburns value.
     */
    @Generated
    public double getSideburns() {
        return this.sideburns;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeDoubleField("moustache", this.moustache);
        jsonWriter.writeDoubleField("beard", this.beard);
        jsonWriter.writeDoubleField("sideburns", this.sideburns);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FacialHair from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of FacialHair if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FacialHair.
     */
    @Generated
    public static FacialHair fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            double moustache = 0.0;
            double beard = 0.0;
            double sideburns = 0.0;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("moustache".equals(fieldName)) {
                    moustache = reader.getDouble();
                } else if ("beard".equals(fieldName)) {
                    beard = reader.getDouble();
                } else if ("sideburns".equals(fieldName)) {
                    sideburns = reader.getDouble();
                } else {
                    reader.skipChildren();
                }
            }
            return new FacialHair(moustache, beard, sideburns);
        });
    }
}
