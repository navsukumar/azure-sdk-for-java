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
 * listItemVersion.
 */
@Fluent
public final class MicrosoftGraphListItemVersion extends MicrosoftGraphBaseItemVersion {
    /*
     * fieldValueSet
     */
    private MicrosoftGraphFieldValueSet fields;

    /*
     * listItemVersion
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphListItemVersion class.
     */
    public MicrosoftGraphListItemVersion() {
    }

    /**
     * Get the fields property: fieldValueSet.
     * 
     * @return the fields value.
     */
    public MicrosoftGraphFieldValueSet fields() {
        return this.fields;
    }

    /**
     * Set the fields property: fieldValueSet.
     * 
     * @param fields the fields value to set.
     * @return the MicrosoftGraphListItemVersion object itself.
     */
    public MicrosoftGraphListItemVersion withFields(MicrosoftGraphFieldValueSet fields) {
        this.fields = fields;
        return this;
    }

    /**
     * Get the additionalProperties property: listItemVersion.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: listItemVersion.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphListItemVersion object itself.
     */
    public MicrosoftGraphListItemVersion withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphListItemVersion withLastModifiedBy(MicrosoftGraphIdentitySet lastModifiedBy) {
        super.withLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphListItemVersion withLastModifiedDateTime(OffsetDateTime lastModifiedDateTime) {
        super.withLastModifiedDateTime(lastModifiedDateTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphListItemVersion withPublication(MicrosoftGraphPublicationFacet publication) {
        super.withPublication(publication);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphListItemVersion withId(String id) {
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
        if (fields() != null) {
            fields().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeJsonField("lastModifiedBy", lastModifiedBy());
        jsonWriter.writeStringField("lastModifiedDateTime",
            lastModifiedDateTime() == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(lastModifiedDateTime()));
        jsonWriter.writeJsonField("publication", publication());
        jsonWriter.writeJsonField("fields", this.fields);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphListItemVersion from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphListItemVersion if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphListItemVersion.
     */
    public static MicrosoftGraphListItemVersion fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphListItemVersion deserializedMicrosoftGraphListItemVersion
                = new MicrosoftGraphListItemVersion();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphListItemVersion.withId(reader.getString());
                } else if ("lastModifiedBy".equals(fieldName)) {
                    deserializedMicrosoftGraphListItemVersion
                        .withLastModifiedBy(MicrosoftGraphIdentitySet.fromJson(reader));
                } else if ("lastModifiedDateTime".equals(fieldName)) {
                    deserializedMicrosoftGraphListItemVersion.withLastModifiedDateTime(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("publication".equals(fieldName)) {
                    deserializedMicrosoftGraphListItemVersion
                        .withPublication(MicrosoftGraphPublicationFacet.fromJson(reader));
                } else if ("fields".equals(fieldName)) {
                    deserializedMicrosoftGraphListItemVersion.fields = MicrosoftGraphFieldValueSet.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphListItemVersion.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphListItemVersion;
        });
    }
}
