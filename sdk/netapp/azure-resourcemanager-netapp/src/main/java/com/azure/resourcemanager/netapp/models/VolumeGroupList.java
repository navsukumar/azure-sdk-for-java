// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.netapp.fluent.models.VolumeGroupInner;
import java.io.IOException;
import java.util.List;

/**
 * List of volume group resources.
 */
@Fluent
public final class VolumeGroupList implements JsonSerializable<VolumeGroupList> {
    /*
     * List of volume Groups
     */
    private List<VolumeGroupInner> value;

    /**
     * Creates an instance of VolumeGroupList class.
     */
    public VolumeGroupList() {
    }

    /**
     * Get the value property: List of volume Groups.
     * 
     * @return the value value.
     */
    public List<VolumeGroupInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of volume Groups.
     * 
     * @param value the value value to set.
     * @return the VolumeGroupList object itself.
     */
    public VolumeGroupList withValue(List<VolumeGroupInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VolumeGroupList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VolumeGroupList if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the VolumeGroupList.
     */
    public static VolumeGroupList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VolumeGroupList deserializedVolumeGroupList = new VolumeGroupList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<VolumeGroupInner> value = reader.readArray(reader1 -> VolumeGroupInner.fromJson(reader1));
                    deserializedVolumeGroupList.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVolumeGroupList;
        });
    }
}
