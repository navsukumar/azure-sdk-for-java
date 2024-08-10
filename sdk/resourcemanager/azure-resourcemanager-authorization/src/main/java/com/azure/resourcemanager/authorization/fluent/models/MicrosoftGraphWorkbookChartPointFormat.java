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
 * workbookChartPointFormat.
 */
@Fluent
public final class MicrosoftGraphWorkbookChartPointFormat extends MicrosoftGraphEntity {
    /*
     * workbookChartFill
     */
    private MicrosoftGraphWorkbookChartFill fill;

    /*
     * workbookChartPointFormat
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphWorkbookChartPointFormat class.
     */
    public MicrosoftGraphWorkbookChartPointFormat() {
    }

    /**
     * Get the fill property: workbookChartFill.
     * 
     * @return the fill value.
     */
    public MicrosoftGraphWorkbookChartFill fill() {
        return this.fill;
    }

    /**
     * Set the fill property: workbookChartFill.
     * 
     * @param fill the fill value to set.
     * @return the MicrosoftGraphWorkbookChartPointFormat object itself.
     */
    public MicrosoftGraphWorkbookChartPointFormat withFill(MicrosoftGraphWorkbookChartFill fill) {
        this.fill = fill;
        return this;
    }

    /**
     * Get the additionalProperties property: workbookChartPointFormat.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: workbookChartPointFormat.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphWorkbookChartPointFormat object itself.
     */
    public MicrosoftGraphWorkbookChartPointFormat withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphWorkbookChartPointFormat withId(String id) {
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
        if (fill() != null) {
            fill().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeJsonField("fill", this.fill);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphWorkbookChartPointFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphWorkbookChartPointFormat if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphWorkbookChartPointFormat.
     */
    public static MicrosoftGraphWorkbookChartPointFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphWorkbookChartPointFormat deserializedMicrosoftGraphWorkbookChartPointFormat
                = new MicrosoftGraphWorkbookChartPointFormat();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookChartPointFormat.withId(reader.getString());
                } else if ("fill".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookChartPointFormat.fill
                        = MicrosoftGraphWorkbookChartFill.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphWorkbookChartPointFormat.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphWorkbookChartPointFormat;
        });
    }
}
