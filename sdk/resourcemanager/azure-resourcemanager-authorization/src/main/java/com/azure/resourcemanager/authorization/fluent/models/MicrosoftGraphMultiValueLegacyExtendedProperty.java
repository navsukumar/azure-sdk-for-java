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
import java.util.List;
import java.util.Map;

/**
 * multiValueLegacyExtendedProperty.
 */
@Fluent
public final class MicrosoftGraphMultiValueLegacyExtendedProperty extends MicrosoftGraphEntity {
    /*
     * A collection of property values.
     */
    private List<String> value;

    /*
     * multiValueLegacyExtendedProperty
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphMultiValueLegacyExtendedProperty class.
     */
    public MicrosoftGraphMultiValueLegacyExtendedProperty() {
    }

    /**
     * Get the value property: A collection of property values.
     * 
     * @return the value value.
     */
    public List<String> value() {
        return this.value;
    }

    /**
     * Set the value property: A collection of property values.
     * 
     * @param value the value value to set.
     * @return the MicrosoftGraphMultiValueLegacyExtendedProperty object itself.
     */
    public MicrosoftGraphMultiValueLegacyExtendedProperty withValue(List<String> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the additionalProperties property: multiValueLegacyExtendedProperty.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: multiValueLegacyExtendedProperty.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphMultiValueLegacyExtendedProperty object itself.
     */
    public MicrosoftGraphMultiValueLegacyExtendedProperty
        withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphMultiValueLegacyExtendedProperty withId(String id) {
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
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeString(element));
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphMultiValueLegacyExtendedProperty from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphMultiValueLegacyExtendedProperty if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphMultiValueLegacyExtendedProperty.
     */
    public static MicrosoftGraphMultiValueLegacyExtendedProperty fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphMultiValueLegacyExtendedProperty deserializedMicrosoftGraphMultiValueLegacyExtendedProperty
                = new MicrosoftGraphMultiValueLegacyExtendedProperty();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphMultiValueLegacyExtendedProperty.withId(reader.getString());
                } else if ("value".equals(fieldName)) {
                    List<String> value = reader.readArray(reader1 -> reader1.getString());
                    deserializedMicrosoftGraphMultiValueLegacyExtendedProperty.value = value;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphMultiValueLegacyExtendedProperty.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphMultiValueLegacyExtendedProperty;
        });
    }
}
