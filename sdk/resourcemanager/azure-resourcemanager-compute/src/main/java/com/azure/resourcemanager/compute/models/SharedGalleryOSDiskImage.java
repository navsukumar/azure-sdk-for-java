// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * This is the OS disk image.
 */
@Fluent
public final class SharedGalleryOSDiskImage extends SharedGalleryDiskImage {
    /*
     * This property indicates the size of the VHD to be created.
     */
    private Integer diskSizeGB;

    /**
     * Creates an instance of SharedGalleryOSDiskImage class.
     */
    public SharedGalleryOSDiskImage() {
    }

    /**
     * Get the diskSizeGB property: This property indicates the size of the VHD to be created.
     * 
     * @return the diskSizeGB value.
     */
    @Override
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SharedGalleryOSDiskImage withHostCaching(SharedGalleryHostCaching hostCaching) {
        super.withHostCaching(hostCaching);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("hostCaching", hostCaching() == null ? null : hostCaching().toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SharedGalleryOSDiskImage from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SharedGalleryOSDiskImage if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SharedGalleryOSDiskImage.
     */
    public static SharedGalleryOSDiskImage fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SharedGalleryOSDiskImage deserializedSharedGalleryOSDiskImage = new SharedGalleryOSDiskImage();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("diskSizeGB".equals(fieldName)) {
                    deserializedSharedGalleryOSDiskImage.diskSizeGB = reader.getNullable(JsonReader::getInt);
                } else if ("hostCaching".equals(fieldName)) {
                    deserializedSharedGalleryOSDiskImage
                        .withHostCaching(SharedGalleryHostCaching.fromString(reader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSharedGalleryOSDiskImage;
        });
    }
}
