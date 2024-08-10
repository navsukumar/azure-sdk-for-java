// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The properties of a response to source upload request.
 */
@Fluent
public final class SourceUploadDefinitionInner implements JsonSerializable<SourceUploadDefinitionInner> {
    /*
     * The URL where the client can upload the source.
     */
    private String uploadUrl;

    /*
     * The relative path to the source. This is used to submit the subsequent queue build request.
     */
    private String relativePath;

    /**
     * Creates an instance of SourceUploadDefinitionInner class.
     */
    public SourceUploadDefinitionInner() {
    }

    /**
     * Get the uploadUrl property: The URL where the client can upload the source.
     * 
     * @return the uploadUrl value.
     */
    public String uploadUrl() {
        return this.uploadUrl;
    }

    /**
     * Set the uploadUrl property: The URL where the client can upload the source.
     * 
     * @param uploadUrl the uploadUrl value to set.
     * @return the SourceUploadDefinitionInner object itself.
     */
    public SourceUploadDefinitionInner withUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }

    /**
     * Get the relativePath property: The relative path to the source. This is used to submit the subsequent queue build
     * request.
     * 
     * @return the relativePath value.
     */
    public String relativePath() {
        return this.relativePath;
    }

    /**
     * Set the relativePath property: The relative path to the source. This is used to submit the subsequent queue build
     * request.
     * 
     * @param relativePath the relativePath value to set.
     * @return the SourceUploadDefinitionInner object itself.
     */
    public SourceUploadDefinitionInner withRelativePath(String relativePath) {
        this.relativePath = relativePath;
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
        jsonWriter.writeStringField("uploadUrl", this.uploadUrl);
        jsonWriter.writeStringField("relativePath", this.relativePath);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SourceUploadDefinitionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SourceUploadDefinitionInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SourceUploadDefinitionInner.
     */
    public static SourceUploadDefinitionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SourceUploadDefinitionInner deserializedSourceUploadDefinitionInner = new SourceUploadDefinitionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("uploadUrl".equals(fieldName)) {
                    deserializedSourceUploadDefinitionInner.uploadUrl = reader.getString();
                } else if ("relativePath".equals(fieldName)) {
                    deserializedSourceUploadDefinitionInner.relativePath = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSourceUploadDefinitionInner;
        });
    }
}
