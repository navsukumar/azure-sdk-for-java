// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The LegalHold property of a blob container.
 */
@Fluent
public final class LegalHoldInner implements JsonSerializable<LegalHoldInner> {
    /*
     * The hasLegalHold public property is set to true by SRP if there are at least one existing tag. The hasLegalHold
     * public property is set to false by SRP if all existing legal hold tags are cleared out. There can be a maximum of
     * 1000 blob containers with hasLegalHold=true for a given account.
     */
    private Boolean hasLegalHold;

    /*
     * Each tag should be 3 to 23 alphanumeric characters and is normalized to lower case at SRP.
     */
    private List<String> tags;

    /*
     * When enabled, new blocks can be written to both 'Append and Bock Blobs' while maintaining legal hold protection
     * and compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted.
     */
    private Boolean allowProtectedAppendWritesAll;

    /**
     * Creates an instance of LegalHoldInner class.
     */
    public LegalHoldInner() {
    }

    /**
     * Get the hasLegalHold property: The hasLegalHold public property is set to true by SRP if there are at least one
     * existing tag. The hasLegalHold public property is set to false by SRP if all existing legal hold tags are cleared
     * out. There can be a maximum of 1000 blob containers with hasLegalHold=true for a given account.
     * 
     * @return the hasLegalHold value.
     */
    public Boolean hasLegalHold() {
        return this.hasLegalHold;
    }

    /**
     * Get the tags property: Each tag should be 3 to 23 alphanumeric characters and is normalized to lower case at SRP.
     * 
     * @return the tags value.
     */
    public List<String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Each tag should be 3 to 23 alphanumeric characters and is normalized to lower case at SRP.
     * 
     * @param tags the tags value to set.
     * @return the LegalHoldInner object itself.
     */
    public LegalHoldInner withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the allowProtectedAppendWritesAll property: When enabled, new blocks can be written to both 'Append and Bock
     * Blobs' while maintaining legal hold protection and compliance. Only new blocks can be added and any existing
     * blocks cannot be modified or deleted.
     * 
     * @return the allowProtectedAppendWritesAll value.
     */
    public Boolean allowProtectedAppendWritesAll() {
        return this.allowProtectedAppendWritesAll;
    }

    /**
     * Set the allowProtectedAppendWritesAll property: When enabled, new blocks can be written to both 'Append and Bock
     * Blobs' while maintaining legal hold protection and compliance. Only new blocks can be added and any existing
     * blocks cannot be modified or deleted.
     * 
     * @param allowProtectedAppendWritesAll the allowProtectedAppendWritesAll value to set.
     * @return the LegalHoldInner object itself.
     */
    public LegalHoldInner withAllowProtectedAppendWritesAll(Boolean allowProtectedAppendWritesAll) {
        this.allowProtectedAppendWritesAll = allowProtectedAppendWritesAll;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (tags() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property tags in model LegalHoldInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LegalHoldInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("tags", this.tags, (writer, element) -> writer.writeString(element));
        jsonWriter.writeBooleanField("allowProtectedAppendWritesAll", this.allowProtectedAppendWritesAll);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LegalHoldInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LegalHoldInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the LegalHoldInner.
     */
    public static LegalHoldInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LegalHoldInner deserializedLegalHoldInner = new LegalHoldInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tags".equals(fieldName)) {
                    List<String> tags = reader.readArray(reader1 -> reader1.getString());
                    deserializedLegalHoldInner.tags = tags;
                } else if ("hasLegalHold".equals(fieldName)) {
                    deserializedLegalHoldInner.hasLegalHold = reader.getNullable(JsonReader::getBoolean);
                } else if ("allowProtectedAppendWritesAll".equals(fieldName)) {
                    deserializedLegalHoldInner.allowProtectedAppendWritesAll
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLegalHoldInner;
        });
    }
}
