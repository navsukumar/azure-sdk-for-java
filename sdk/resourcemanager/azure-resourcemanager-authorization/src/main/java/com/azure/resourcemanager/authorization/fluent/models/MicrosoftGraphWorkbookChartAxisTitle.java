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
 * workbookChartAxisTitle.
 */
@Fluent
public final class MicrosoftGraphWorkbookChartAxisTitle extends MicrosoftGraphEntity {
    /*
     * Represents the axis title.
     */
    private String text;

    /*
     * A boolean that specifies the visibility of an axis title.
     */
    private Boolean visible;

    /*
     * workbookChartAxisTitleFormat
     */
    private MicrosoftGraphWorkbookChartAxisTitleFormat format;

    /*
     * workbookChartAxisTitle
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphWorkbookChartAxisTitle class.
     */
    public MicrosoftGraphWorkbookChartAxisTitle() {
    }

    /**
     * Get the text property: Represents the axis title.
     * 
     * @return the text value.
     */
    public String text() {
        return this.text;
    }

    /**
     * Set the text property: Represents the axis title.
     * 
     * @param text the text value to set.
     * @return the MicrosoftGraphWorkbookChartAxisTitle object itself.
     */
    public MicrosoftGraphWorkbookChartAxisTitle withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the visible property: A boolean that specifies the visibility of an axis title.
     * 
     * @return the visible value.
     */
    public Boolean visible() {
        return this.visible;
    }

    /**
     * Set the visible property: A boolean that specifies the visibility of an axis title.
     * 
     * @param visible the visible value to set.
     * @return the MicrosoftGraphWorkbookChartAxisTitle object itself.
     */
    public MicrosoftGraphWorkbookChartAxisTitle withVisible(Boolean visible) {
        this.visible = visible;
        return this;
    }

    /**
     * Get the format property: workbookChartAxisTitleFormat.
     * 
     * @return the format value.
     */
    public MicrosoftGraphWorkbookChartAxisTitleFormat format() {
        return this.format;
    }

    /**
     * Set the format property: workbookChartAxisTitleFormat.
     * 
     * @param format the format value to set.
     * @return the MicrosoftGraphWorkbookChartAxisTitle object itself.
     */
    public MicrosoftGraphWorkbookChartAxisTitle withFormat(MicrosoftGraphWorkbookChartAxisTitleFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Get the additionalProperties property: workbookChartAxisTitle.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: workbookChartAxisTitle.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphWorkbookChartAxisTitle object itself.
     */
    public MicrosoftGraphWorkbookChartAxisTitle withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphWorkbookChartAxisTitle withId(String id) {
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
        if (format() != null) {
            format().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeStringField("text", this.text);
        jsonWriter.writeBooleanField("visible", this.visible);
        jsonWriter.writeJsonField("format", this.format);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphWorkbookChartAxisTitle from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphWorkbookChartAxisTitle if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphWorkbookChartAxisTitle.
     */
    public static MicrosoftGraphWorkbookChartAxisTitle fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphWorkbookChartAxisTitle deserializedMicrosoftGraphWorkbookChartAxisTitle
                = new MicrosoftGraphWorkbookChartAxisTitle();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookChartAxisTitle.withId(reader.getString());
                } else if ("text".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookChartAxisTitle.text = reader.getString();
                } else if ("visible".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookChartAxisTitle.visible
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("format".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookChartAxisTitle.format
                        = MicrosoftGraphWorkbookChartAxisTitleFormat.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphWorkbookChartAxisTitle.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphWorkbookChartAxisTitle;
        });
    }
}
