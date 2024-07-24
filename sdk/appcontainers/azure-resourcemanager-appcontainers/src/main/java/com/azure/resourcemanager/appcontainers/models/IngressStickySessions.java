// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Sticky Sessions for Single Revision Mode.
 */
@Fluent
public final class IngressStickySessions implements JsonSerializable<IngressStickySessions> {
    /*
     * Sticky Session Affinity
     */
    private Affinity affinity;

    /**
     * Creates an instance of IngressStickySessions class.
     */
    public IngressStickySessions() {
    }

    /**
     * Get the affinity property: Sticky Session Affinity.
     * 
     * @return the affinity value.
     */
    public Affinity affinity() {
        return this.affinity;
    }

    /**
     * Set the affinity property: Sticky Session Affinity.
     * 
     * @param affinity the affinity value to set.
     * @return the IngressStickySessions object itself.
     */
    public IngressStickySessions withAffinity(Affinity affinity) {
        this.affinity = affinity;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("affinity", this.affinity == null ? null : this.affinity.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IngressStickySessions from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IngressStickySessions if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the IngressStickySessions.
     */
    public static IngressStickySessions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IngressStickySessions deserializedIngressStickySessions = new IngressStickySessions();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("affinity".equals(fieldName)) {
                    deserializedIngressStickySessions.affinity = Affinity.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIngressStickySessions;
        });
    }
}
