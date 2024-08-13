// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.messages.models.channels;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The template bindings component button for WhatsApp.
 */
@Immutable
public final class WhatsAppMessageTemplateBindingsButton
    implements JsonSerializable<WhatsAppMessageTemplateBindingsButton> {

    /*
     * The WhatsApp button sub type
     */
    @Generated
    private final WhatsAppMessageButtonSubType subType;

    /*
     * The name of the referenced item in the template values.
     */
    @Generated
    private final String refValue;

    /**
     * Creates an instance of WhatsAppMessageTemplateBindingsButton class.
     *
     * @param subType the subType value to set.
     * @param refValue the refValue value to set.
     */
    @Generated
    public WhatsAppMessageTemplateBindingsButton(WhatsAppMessageButtonSubType subType, String refValue) {
        this.subType = subType;
        this.refValue = refValue;
    }

    /**
     * Get the subType property: The WhatsApp button sub type.
     *
     * @return the subType value.
     */
    @Generated
    public WhatsAppMessageButtonSubType getSubType() {
        return this.subType;
    }

    /**
     * Get the refValue property: The name of the referenced item in the template values.
     *
     * @return the refValue value.
     */
    @Generated
    public String getRefValue() {
        return this.refValue;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("subType", this.subType == null ? null : this.subType.toString());
        jsonWriter.writeStringField("refValue", this.refValue);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WhatsAppMessageTemplateBindingsButton from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of WhatsAppMessageTemplateBindingsButton if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the WhatsAppMessageTemplateBindingsButton.
     */
    @Generated
    public static WhatsAppMessageTemplateBindingsButton fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WhatsAppMessageButtonSubType subType = null;
            String refValue = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("subType".equals(fieldName)) {
                    subType = WhatsAppMessageButtonSubType.fromString(reader.getString());
                } else if ("refValue".equals(fieldName)) {
                    refValue = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new WhatsAppMessageTemplateBindingsButton(subType, refValue);
        });
    }
}
