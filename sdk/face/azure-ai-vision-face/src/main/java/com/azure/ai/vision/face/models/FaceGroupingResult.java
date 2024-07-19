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
import java.util.List;

/**
 * Response body for group face operation.
 */
@Immutable
public final class FaceGroupingResult implements JsonSerializable<FaceGroupingResult> {

    /*
     * A partition of the original faces based on face similarity. Groups are ranked by number of faces.
     */
    @Generated
    private final List<List<String>> groups;

    /*
     * Face ids array of faces that cannot find any similar faces from original faces.
     */
    @Generated
    private final List<String> messyGroup;

    /**
     * Creates an instance of FaceGroupingResult class.
     *
     * @param groups the groups value to set.
     * @param messyGroup the messyGroup value to set.
     */
    @Generated
    private FaceGroupingResult(List<List<String>> groups, List<String> messyGroup) {
        this.groups = groups;
        this.messyGroup = messyGroup;
    }

    /**
     * Get the groups property: A partition of the original faces based on face similarity. Groups are ranked by number
     * of faces.
     *
     * @return the groups value.
     */
    @Generated
    public List<List<String>> getGroups() {
        return this.groups;
    }

    /**
     * Get the messyGroup property: Face ids array of faces that cannot find any similar faces from original faces.
     *
     * @return the messyGroup value.
     */
    @Generated
    public List<String> getMessyGroup() {
        return this.messyGroup;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("groups", this.groups,
            (writer, element) -> writer.writeArray(element, (writer1, element1) -> writer1.writeString(element1)));
        jsonWriter.writeArrayField("messyGroup", this.messyGroup, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FaceGroupingResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of FaceGroupingResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FaceGroupingResult.
     */
    @Generated
    public static FaceGroupingResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<List<String>> groups = null;
            List<String> messyGroup = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("groups".equals(fieldName)) {
                    groups = reader.readArray(reader1 -> reader1.readArray(reader2 -> reader2.getString()));
                } else if ("messyGroup".equals(fieldName)) {
                    messyGroup = reader.readArray(reader1 -> reader1.getString());
                } else {
                    reader.skipChildren();
                }
            }
            return new FaceGroupingResult(groups, messyGroup);
        });
    }
}
