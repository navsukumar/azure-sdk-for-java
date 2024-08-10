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
 * attachmentItem.
 */
@Fluent
public final class MicrosoftGraphAttachmentItem implements JsonSerializable<MicrosoftGraphAttachmentItem> {
    /*
     * attachmentType
     */
    private MicrosoftGraphAttachmentType attachmentType;

    /*
     * The nature of the data in the attachment. Optional.
     */
    private String contentType;

    /*
     * true if the attachment is an inline attachment; otherwise, false. Optional.
     */
    private Boolean isInline;

    /*
     * The display name of the attachment. This can be a descriptive string and does not have to be the actual file
     * name. Required.
     */
    private String name;

    /*
     * The length of the attachment in bytes. Required.
     */
    private Long size;

    /*
     * attachmentItem
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphAttachmentItem class.
     */
    public MicrosoftGraphAttachmentItem() {
    }

    /**
     * Get the attachmentType property: attachmentType.
     * 
     * @return the attachmentType value.
     */
    public MicrosoftGraphAttachmentType attachmentType() {
        return this.attachmentType;
    }

    /**
     * Set the attachmentType property: attachmentType.
     * 
     * @param attachmentType the attachmentType value to set.
     * @return the MicrosoftGraphAttachmentItem object itself.
     */
    public MicrosoftGraphAttachmentItem withAttachmentType(MicrosoftGraphAttachmentType attachmentType) {
        this.attachmentType = attachmentType;
        return this;
    }

    /**
     * Get the contentType property: The nature of the data in the attachment. Optional.
     * 
     * @return the contentType value.
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The nature of the data in the attachment. Optional.
     * 
     * @param contentType the contentType value to set.
     * @return the MicrosoftGraphAttachmentItem object itself.
     */
    public MicrosoftGraphAttachmentItem withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the isInline property: true if the attachment is an inline attachment; otherwise, false. Optional.
     * 
     * @return the isInline value.
     */
    public Boolean isInline() {
        return this.isInline;
    }

    /**
     * Set the isInline property: true if the attachment is an inline attachment; otherwise, false. Optional.
     * 
     * @param isInline the isInline value to set.
     * @return the MicrosoftGraphAttachmentItem object itself.
     */
    public MicrosoftGraphAttachmentItem withIsInline(Boolean isInline) {
        this.isInline = isInline;
        return this;
    }

    /**
     * Get the name property: The display name of the attachment. This can be a descriptive string and does not have to
     * be the actual file name. Required.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The display name of the attachment. This can be a descriptive string and does not have to
     * be the actual file name. Required.
     * 
     * @param name the name value to set.
     * @return the MicrosoftGraphAttachmentItem object itself.
     */
    public MicrosoftGraphAttachmentItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the size property: The length of the attachment in bytes. Required.
     * 
     * @return the size value.
     */
    public Long size() {
        return this.size;
    }

    /**
     * Set the size property: The length of the attachment in bytes. Required.
     * 
     * @param size the size value to set.
     * @return the MicrosoftGraphAttachmentItem object itself.
     */
    public MicrosoftGraphAttachmentItem withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * Get the additionalProperties property: attachmentItem.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: attachmentItem.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphAttachmentItem object itself.
     */
    public MicrosoftGraphAttachmentItem withAdditionalProperties(Map<String, Object> additionalProperties) {
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
        jsonWriter.writeStringField("attachmentType",
            this.attachmentType == null ? null : this.attachmentType.toString());
        jsonWriter.writeStringField("contentType", this.contentType);
        jsonWriter.writeBooleanField("isInline", this.isInline);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeNumberField("size", this.size);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphAttachmentItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphAttachmentItem if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphAttachmentItem.
     */
    public static MicrosoftGraphAttachmentItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphAttachmentItem deserializedMicrosoftGraphAttachmentItem = new MicrosoftGraphAttachmentItem();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("attachmentType".equals(fieldName)) {
                    deserializedMicrosoftGraphAttachmentItem.attachmentType
                        = MicrosoftGraphAttachmentType.fromString(reader.getString());
                } else if ("contentType".equals(fieldName)) {
                    deserializedMicrosoftGraphAttachmentItem.contentType = reader.getString();
                } else if ("isInline".equals(fieldName)) {
                    deserializedMicrosoftGraphAttachmentItem.isInline = reader.getNullable(JsonReader::getBoolean);
                } else if ("name".equals(fieldName)) {
                    deserializedMicrosoftGraphAttachmentItem.name = reader.getString();
                } else if ("size".equals(fieldName)) {
                    deserializedMicrosoftGraphAttachmentItem.size = reader.getNullable(JsonReader::getLong);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphAttachmentItem.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphAttachmentItem;
        });
    }
}
