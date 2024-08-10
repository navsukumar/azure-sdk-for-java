// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * onenoteEntitySchemaObjectModel.
 */
@Fluent
public class MicrosoftGraphOnenoteEntitySchemaObjectModel extends MicrosoftGraphOnenoteEntityBaseModel {
    /*
     * The date and time when the page was created. The timestamp represents date and time information using ISO 8601
     * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
     * '2014-01-01T00:00:00Z'. Read-only.
     */
    private OffsetDateTime createdDateTime;

    /*
     * onenoteEntitySchemaObjectModel
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphOnenoteEntitySchemaObjectModel class.
     */
    public MicrosoftGraphOnenoteEntitySchemaObjectModel() {
    }

    /**
     * Get the createdDateTime property: The date and time when the page was created. The timestamp represents date and
     * time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would
     * look like this: '2014-01-01T00:00:00Z'. Read-only.
     * 
     * @return the createdDateTime value.
     */
    public OffsetDateTime createdDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: The date and time when the page was created. The timestamp represents date and
     * time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would
     * look like this: '2014-01-01T00:00:00Z'. Read-only.
     * 
     * @param createdDateTime the createdDateTime value to set.
     * @return the MicrosoftGraphOnenoteEntitySchemaObjectModel object itself.
     */
    public MicrosoftGraphOnenoteEntitySchemaObjectModel withCreatedDateTime(OffsetDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the additionalProperties property: onenoteEntitySchemaObjectModel.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: onenoteEntitySchemaObjectModel.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphOnenoteEntitySchemaObjectModel object itself.
     */
    public MicrosoftGraphOnenoteEntitySchemaObjectModel
        withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphOnenoteEntitySchemaObjectModel withSelf(String self) {
        super.withSelf(self);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphOnenoteEntitySchemaObjectModel withId(String id) {
        super.withId(id);
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
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeStringField("self", self());
        jsonWriter.writeStringField("createdDateTime",
            this.createdDateTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.createdDateTime));
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphOnenoteEntitySchemaObjectModel from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphOnenoteEntitySchemaObjectModel if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphOnenoteEntitySchemaObjectModel.
     */
    public static MicrosoftGraphOnenoteEntitySchemaObjectModel fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphOnenoteEntitySchemaObjectModel deserializedMicrosoftGraphOnenoteEntitySchemaObjectModel
                = new MicrosoftGraphOnenoteEntitySchemaObjectModel();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphOnenoteEntitySchemaObjectModel.withId(reader.getString());
                } else if ("self".equals(fieldName)) {
                    deserializedMicrosoftGraphOnenoteEntitySchemaObjectModel.withSelf(reader.getString());
                } else if ("createdDateTime".equals(fieldName)) {
                    deserializedMicrosoftGraphOnenoteEntitySchemaObjectModel.createdDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphOnenoteEntitySchemaObjectModel.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphOnenoteEntitySchemaObjectModel;
        });
    }
}
