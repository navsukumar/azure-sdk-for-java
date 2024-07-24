// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Volumes associated with snapshot policy.
 */
@Fluent
public final class SnapshotPolicyVolumeListInner implements JsonSerializable<SnapshotPolicyVolumeListInner> {
    /*
     * List of volumes
     */
    private List<VolumeInner> value;

    /**
     * Creates an instance of SnapshotPolicyVolumeListInner class.
     */
    public SnapshotPolicyVolumeListInner() {
    }

    /**
     * Get the value property: List of volumes.
     * 
     * @return the value value.
     */
    public List<VolumeInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of volumes.
     * 
     * @param value the value value to set.
     * @return the SnapshotPolicyVolumeListInner object itself.
     */
    public SnapshotPolicyVolumeListInner withValue(List<VolumeInner> value) {
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
     * Reads an instance of SnapshotPolicyVolumeListInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SnapshotPolicyVolumeListInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SnapshotPolicyVolumeListInner.
     */
    public static SnapshotPolicyVolumeListInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SnapshotPolicyVolumeListInner deserializedSnapshotPolicyVolumeListInner
                = new SnapshotPolicyVolumeListInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<VolumeInner> value = reader.readArray(reader1 -> VolumeInner.fromJson(reader1));
                    deserializedSnapshotPolicyVolumeListInner.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSnapshotPolicyVolumeListInner;
        });
    }
}
