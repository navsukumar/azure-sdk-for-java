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
 * directoryRoleTemplate
 * 
 * Represents an Azure Active Directory object. The directoryObject type is the base type for many other directory
 * entity types.
 */
@Fluent
public final class MicrosoftGraphDirectoryRoleTemplate extends MicrosoftGraphDirectoryObjectInner {
    /*
     * The description to set for the directory role. Read-only.
     */
    private String description;

    /*
     * The display name to set for the directory role. Read-only.
     */
    private String displayName;

    /*
     * Represents an Azure Active Directory object. The directoryObject type is the base type for many other directory
     * entity types.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphDirectoryRoleTemplate class.
     */
    public MicrosoftGraphDirectoryRoleTemplate() {
    }

    /**
     * Get the description property: The description to set for the directory role. Read-only.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description to set for the directory role. Read-only.
     * 
     * @param description the description value to set.
     * @return the MicrosoftGraphDirectoryRoleTemplate object itself.
     */
    public MicrosoftGraphDirectoryRoleTemplate withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the displayName property: The display name to set for the directory role. Read-only.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name to set for the directory role. Read-only.
     * 
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphDirectoryRoleTemplate object itself.
     */
    public MicrosoftGraphDirectoryRoleTemplate withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the additionalProperties property: Represents an Azure Active Directory object. The directoryObject type is
     * the base type for many other directory entity types.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Represents an Azure Active Directory object. The directoryObject type is
     * the base type for many other directory entity types.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphDirectoryRoleTemplate object itself.
     */
    public MicrosoftGraphDirectoryRoleTemplate withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphDirectoryRoleTemplate withDeletedDateTime(OffsetDateTime deletedDateTime) {
        super.withDeletedDateTime(deletedDateTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphDirectoryRoleTemplate withId(String id) {
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
        jsonWriter.writeStringField("deletedDateTime",
            deletedDateTime() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(deletedDateTime()));
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("displayName", this.displayName);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphDirectoryRoleTemplate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphDirectoryRoleTemplate if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphDirectoryRoleTemplate.
     */
    public static MicrosoftGraphDirectoryRoleTemplate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphDirectoryRoleTemplate deserializedMicrosoftGraphDirectoryRoleTemplate
                = new MicrosoftGraphDirectoryRoleTemplate();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphDirectoryRoleTemplate.withId(reader.getString());
                } else if ("deletedDateTime".equals(fieldName)) {
                    deserializedMicrosoftGraphDirectoryRoleTemplate.withDeletedDateTime(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("description".equals(fieldName)) {
                    deserializedMicrosoftGraphDirectoryRoleTemplate.description = reader.getString();
                } else if ("displayName".equals(fieldName)) {
                    deserializedMicrosoftGraphDirectoryRoleTemplate.displayName = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphDirectoryRoleTemplate.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphDirectoryRoleTemplate;
        });
    }
}
