// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Relocate volume request.
 */
@Fluent
public final class RelocateVolumeRequest implements JsonSerializable<RelocateVolumeRequest> {
    /*
     * New creation token for the volume that controls the mount point name
     */
    private String creationToken;

    /**
     * Creates an instance of RelocateVolumeRequest class.
     */
    public RelocateVolumeRequest() {
    }

    /**
     * Get the creationToken property: New creation token for the volume that controls the mount point name.
     * 
     * @return the creationToken value.
     */
    public String creationToken() {
        return this.creationToken;
    }

    /**
     * Set the creationToken property: New creation token for the volume that controls the mount point name.
     * 
     * @param creationToken the creationToken value to set.
     * @return the RelocateVolumeRequest object itself.
     */
    public RelocateVolumeRequest withCreationToken(String creationToken) {
        this.creationToken = creationToken;
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
        jsonWriter.writeStringField("creationToken", this.creationToken);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RelocateVolumeRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RelocateVolumeRequest if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RelocateVolumeRequest.
     */
    public static RelocateVolumeRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RelocateVolumeRequest deserializedRelocateVolumeRequest = new RelocateVolumeRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("creationToken".equals(fieldName)) {
                    deserializedRelocateVolumeRequest.creationToken = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRelocateVolumeRequest;
        });
    }
}
