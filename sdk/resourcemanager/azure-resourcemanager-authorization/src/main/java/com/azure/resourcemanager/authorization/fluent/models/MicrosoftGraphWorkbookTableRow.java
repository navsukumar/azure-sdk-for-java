// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * workbookTableRow.
 */
@Fluent
public final class MicrosoftGraphWorkbookTableRow extends MicrosoftGraphEntity {
    /*
     * Returns the index number of the row within the rows collection of the table. Zero-indexed. Read-only.
     */
    private Integer index;

    /*
     * Json
     */
    private Map<String, Object> values;

    /*
     * workbookTableRow
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphWorkbookTableRow class.
     */
    public MicrosoftGraphWorkbookTableRow() {
    }

    /**
     * Get the index property: Returns the index number of the row within the rows collection of the table.
     * Zero-indexed. Read-only.
     * 
     * @return the index value.
     */
    public Integer index() {
        return this.index;
    }

    /**
     * Set the index property: Returns the index number of the row within the rows collection of the table.
     * Zero-indexed. Read-only.
     * 
     * @param index the index value to set.
     * @return the MicrosoftGraphWorkbookTableRow object itself.
     */
    public MicrosoftGraphWorkbookTableRow withIndex(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * Get the values property: Json.
     * 
     * @return the values value.
     */
    public Map<String, Object> values() {
        return this.values;
    }

    /**
     * Set the values property: Json.
     * 
     * @param values the values value to set.
     * @return the MicrosoftGraphWorkbookTableRow object itself.
     */
    public MicrosoftGraphWorkbookTableRow withValues(Map<String, Object> values) {
        this.values = values;
        return this;
    }

    /**
     * Get the additionalProperties property: workbookTableRow.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: workbookTableRow.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphWorkbookTableRow object itself.
     */
    public MicrosoftGraphWorkbookTableRow withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphWorkbookTableRow withId(String id) {
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
        jsonWriter.writeNumberField("index", this.index);
        jsonWriter.writeMapField("values", this.values, (writer, element) -> writer.writeUntyped(element));
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphWorkbookTableRow from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphWorkbookTableRow if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphWorkbookTableRow.
     */
    public static MicrosoftGraphWorkbookTableRow fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphWorkbookTableRow deserializedMicrosoftGraphWorkbookTableRow
                = new MicrosoftGraphWorkbookTableRow();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookTableRow.withId(reader.getString());
                } else if ("index".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookTableRow.index = reader.getNullable(JsonReader::getInt);
                } else if ("values".equals(fieldName)) {
                    Map<String, Object> values = reader.readMap(reader1 -> reader1.readUntyped());
                    deserializedMicrosoftGraphWorkbookTableRow.values = values;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphWorkbookTableRow.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphWorkbookTableRow;
        });
    }
}
