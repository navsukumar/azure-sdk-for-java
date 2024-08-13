// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.documentintelligence.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Request body to authorize document classifier copy.
 */
@Fluent
public final class AuthorizeClassifierCopyRequest implements JsonSerializable<AuthorizeClassifierCopyRequest> {
    /*
     * Unique document classifier name.
     */
    @Generated
    private final String classifierId;

    /*
     * Document classifier description.
     */
    @Generated
    private String description;

    /*
     * List of key-value tag attributes associated with the document classifier.
     */
    @Generated
    private Map<String, String> tags;

    /**
     * Creates an instance of AuthorizeClassifierCopyRequest class.
     * 
     * @param classifierId the classifierId value to set.
     */
    @Generated
    public AuthorizeClassifierCopyRequest(String classifierId) {
        this.classifierId = classifierId;
    }

    /**
     * Get the classifierId property: Unique document classifier name.
     * 
     * @return the classifierId value.
     */
    @Generated
    public String getClassifierId() {
        return this.classifierId;
    }

    /**
     * Get the description property: Document classifier description.
     * 
     * @return the description value.
     */
    @Generated
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Document classifier description.
     * 
     * @param description the description value to set.
     * @return the AuthorizeClassifierCopyRequest object itself.
     */
    @Generated
    public AuthorizeClassifierCopyRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the tags property: List of key-value tag attributes associated with the document classifier.
     * 
     * @return the tags value.
     */
    @Generated
    public Map<String, String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: List of key-value tag attributes associated with the document classifier.
     * 
     * @param tags the tags value to set.
     * @return the AuthorizeClassifierCopyRequest object itself.
     */
    @Generated
    public AuthorizeClassifierCopyRequest setTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("classifierId", this.classifierId);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AuthorizeClassifierCopyRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AuthorizeClassifierCopyRequest if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AuthorizeClassifierCopyRequest.
     */
    @Generated
    public static AuthorizeClassifierCopyRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String classifierId = null;
            String description = null;
            Map<String, String> tags = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("classifierId".equals(fieldName)) {
                    classifierId = reader.getString();
                } else if ("description".equals(fieldName)) {
                    description = reader.getString();
                } else if ("tags".equals(fieldName)) {
                    tags = reader.readMap(reader1 -> reader1.getString());
                } else {
                    reader.skipChildren();
                }
            }
            AuthorizeClassifierCopyRequest deserializedAuthorizeClassifierCopyRequest
                = new AuthorizeClassifierCopyRequest(classifierId);
            deserializedAuthorizeClassifierCopyRequest.description = description;
            deserializedAuthorizeClassifierCopyRequest.tags = tags;

            return deserializedAuthorizeClassifierCopyRequest;
        });
    }
}
