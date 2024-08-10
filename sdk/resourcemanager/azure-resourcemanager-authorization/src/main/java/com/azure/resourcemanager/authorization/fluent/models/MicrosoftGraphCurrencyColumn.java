// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * currencyColumn.
 */
@Fluent
public final class MicrosoftGraphCurrencyColumn implements JsonSerializable<MicrosoftGraphCurrencyColumn> {
    /*
     * Specifies the locale from which to infer the currency symbol.
     */
    private String locale;

    /*
     * currencyColumn
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphCurrencyColumn class.
     */
    public MicrosoftGraphCurrencyColumn() {
    }

    /**
     * Get the locale property: Specifies the locale from which to infer the currency symbol.
     * 
     * @return the locale value.
     */
    public String locale() {
        return this.locale;
    }

    /**
     * Set the locale property: Specifies the locale from which to infer the currency symbol.
     * 
     * @param locale the locale value to set.
     * @return the MicrosoftGraphCurrencyColumn object itself.
     */
    public MicrosoftGraphCurrencyColumn withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * Get the additionalProperties property: currencyColumn.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: currencyColumn.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphCurrencyColumn object itself.
     */
    public MicrosoftGraphCurrencyColumn withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
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
        jsonWriter.writeStringField("locale", this.locale);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphCurrencyColumn from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphCurrencyColumn if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphCurrencyColumn.
     */
    public static MicrosoftGraphCurrencyColumn fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphCurrencyColumn deserializedMicrosoftGraphCurrencyColumn = new MicrosoftGraphCurrencyColumn();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("locale".equals(fieldName)) {
                    deserializedMicrosoftGraphCurrencyColumn.locale = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphCurrencyColumn.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphCurrencyColumn;
        });
    }
}
