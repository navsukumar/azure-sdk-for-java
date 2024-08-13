// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.Base64Url;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * onenotePage.
 */
@Fluent
public final class MicrosoftGraphOnenotePage extends MicrosoftGraphOnenoteEntitySchemaObjectModel {
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

    /*
     * The page's HTML content.
     */
    private Base64Url content;

    /*
     * The URL for the page's HTML content. Read-only.
     */
    private String contentUrl;

    /*
     * The unique identifier of the application that created the page. Read-only.
     */
    private String createdByAppId;

    /*
     * The date and time when the page was last modified. The timestamp represents date and time information using ISO
     * 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
     * '2014-01-01T00:00:00Z'. Read-only.
     */
    private OffsetDateTime lastModifiedDateTime;

    /*
     * The indentation level of the page. Read-only.
     */
    private Integer level;

    /*
     * pageLinks
     */
    private MicrosoftGraphPageLinks links;

    /*
     * The order of the page within its parent section. Read-only.
     */
    private Integer order;

    /*
     * The title of the page.
     */
    private String title;

    /*
     * The userTags property.
     */
    private List<String> userTags;

    /*
     * notebook
     */
    private MicrosoftGraphNotebook parentNotebook;

    /*
     * onenoteSection
     */
    private MicrosoftGraphOnenoteSection parentSection;

    /*
     * onenotePage
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphOnenotePage class.
     */
    public MicrosoftGraphOnenotePage() {
    }

    /**
     * Get the content property: The page's HTML content.
     * 
     * @return the content value.
     */
    public byte[] content() {
        if (this.content == null) {
            return EMPTY_BYTE_ARRAY;
        }
        return this.content.decodedBytes();
    }

    /**
     * Set the content property: The page's HTML content.
     * 
     * @param content the content value to set.
     * @return the MicrosoftGraphOnenotePage object itself.
     */
    public MicrosoftGraphOnenotePage withContent(byte[] content) {
        if (content == null) {
            this.content = null;
        } else {
            this.content = Base64Url.encode(CoreUtils.clone(content));
        }
        return this;
    }

    /**
     * Get the contentUrl property: The URL for the page's HTML content. Read-only.
     * 
     * @return the contentUrl value.
     */
    public String contentUrl() {
        return this.contentUrl;
    }

    /**
     * Set the contentUrl property: The URL for the page's HTML content. Read-only.
     * 
     * @param contentUrl the contentUrl value to set.
     * @return the MicrosoftGraphOnenotePage object itself.
     */
    public MicrosoftGraphOnenotePage withContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
        return this;
    }

    /**
     * Get the createdByAppId property: The unique identifier of the application that created the page. Read-only.
     * 
     * @return the createdByAppId value.
     */
    public String createdByAppId() {
        return this.createdByAppId;
    }

    /**
     * Set the createdByAppId property: The unique identifier of the application that created the page. Read-only.
     * 
     * @param createdByAppId the createdByAppId value to set.
     * @return the MicrosoftGraphOnenotePage object itself.
     */
    public MicrosoftGraphOnenotePage withCreatedByAppId(String createdByAppId) {
        this.createdByAppId = createdByAppId;
        return this;
    }

    /**
     * Get the lastModifiedDateTime property: The date and time when the page was last modified. The timestamp
     * represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC
     * on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
     * 
     * @return the lastModifiedDateTime value.
     */
    public OffsetDateTime lastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }

    /**
     * Set the lastModifiedDateTime property: The date and time when the page was last modified. The timestamp
     * represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC
     * on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
     * 
     * @param lastModifiedDateTime the lastModifiedDateTime value to set.
     * @return the MicrosoftGraphOnenotePage object itself.
     */
    public MicrosoftGraphOnenotePage withLastModifiedDateTime(OffsetDateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
        return this;
    }

    /**
     * Get the level property: The indentation level of the page. Read-only.
     * 
     * @return the level value.
     */
    public Integer level() {
        return this.level;
    }

    /**
     * Set the level property: The indentation level of the page. Read-only.
     * 
     * @param level the level value to set.
     * @return the MicrosoftGraphOnenotePage object itself.
     */
    public MicrosoftGraphOnenotePage withLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * Get the links property: pageLinks.
     * 
     * @return the links value.
     */
    public MicrosoftGraphPageLinks links() {
        return this.links;
    }

    /**
     * Set the links property: pageLinks.
     * 
     * @param links the links value to set.
     * @return the MicrosoftGraphOnenotePage object itself.
     */
    public MicrosoftGraphOnenotePage withLinks(MicrosoftGraphPageLinks links) {
        this.links = links;
        return this;
    }

    /**
     * Get the order property: The order of the page within its parent section. Read-only.
     * 
     * @return the order value.
     */
    public Integer order() {
        return this.order;
    }

    /**
     * Set the order property: The order of the page within its parent section. Read-only.
     * 
     * @param order the order value to set.
     * @return the MicrosoftGraphOnenotePage object itself.
     */
    public MicrosoftGraphOnenotePage withOrder(Integer order) {
        this.order = order;
        return this;
    }

    /**
     * Get the title property: The title of the page.
     * 
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title property: The title of the page.
     * 
     * @param title the title value to set.
     * @return the MicrosoftGraphOnenotePage object itself.
     */
    public MicrosoftGraphOnenotePage withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the userTags property: The userTags property.
     * 
     * @return the userTags value.
     */
    public List<String> userTags() {
        return this.userTags;
    }

    /**
     * Set the userTags property: The userTags property.
     * 
     * @param userTags the userTags value to set.
     * @return the MicrosoftGraphOnenotePage object itself.
     */
    public MicrosoftGraphOnenotePage withUserTags(List<String> userTags) {
        this.userTags = userTags;
        return this;
    }

    /**
     * Get the parentNotebook property: notebook.
     * 
     * @return the parentNotebook value.
     */
    public MicrosoftGraphNotebook parentNotebook() {
        return this.parentNotebook;
    }

    /**
     * Set the parentNotebook property: notebook.
     * 
     * @param parentNotebook the parentNotebook value to set.
     * @return the MicrosoftGraphOnenotePage object itself.
     */
    public MicrosoftGraphOnenotePage withParentNotebook(MicrosoftGraphNotebook parentNotebook) {
        this.parentNotebook = parentNotebook;
        return this;
    }

    /**
     * Get the parentSection property: onenoteSection.
     * 
     * @return the parentSection value.
     */
    public MicrosoftGraphOnenoteSection parentSection() {
        return this.parentSection;
    }

    /**
     * Set the parentSection property: onenoteSection.
     * 
     * @param parentSection the parentSection value to set.
     * @return the MicrosoftGraphOnenotePage object itself.
     */
    public MicrosoftGraphOnenotePage withParentSection(MicrosoftGraphOnenoteSection parentSection) {
        this.parentSection = parentSection;
        return this;
    }

    /**
     * Get the additionalProperties property: onenotePage.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: onenotePage.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphOnenotePage object itself.
     */
    public MicrosoftGraphOnenotePage withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphOnenotePage withCreatedDateTime(OffsetDateTime createdDateTime) {
        super.withCreatedDateTime(createdDateTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphOnenotePage withSelf(String self) {
        super.withSelf(self);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphOnenotePage withId(String id) {
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
        if (links() != null) {
            links().validate();
        }
        if (parentNotebook() != null) {
            parentNotebook().validate();
        }
        if (parentSection() != null) {
            parentSection().validate();
        }
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
            createdDateTime() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(createdDateTime()));
        jsonWriter.writeStringField("content", Objects.toString(this.content, null));
        jsonWriter.writeStringField("contentUrl", this.contentUrl);
        jsonWriter.writeStringField("createdByAppId", this.createdByAppId);
        jsonWriter.writeStringField("lastModifiedDateTime",
            this.lastModifiedDateTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.lastModifiedDateTime));
        jsonWriter.writeNumberField("level", this.level);
        jsonWriter.writeJsonField("links", this.links);
        jsonWriter.writeNumberField("order", this.order);
        jsonWriter.writeStringField("title", this.title);
        jsonWriter.writeArrayField("userTags", this.userTags, (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("parentNotebook", this.parentNotebook);
        jsonWriter.writeJsonField("parentSection", this.parentSection);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphOnenotePage from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphOnenotePage if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphOnenotePage.
     */
    public static MicrosoftGraphOnenotePage fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphOnenotePage deserializedMicrosoftGraphOnenotePage = new MicrosoftGraphOnenotePage();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphOnenotePage.withId(reader.getString());
                } else if ("self".equals(fieldName)) {
                    deserializedMicrosoftGraphOnenotePage.withSelf(reader.getString());
                } else if ("createdDateTime".equals(fieldName)) {
                    deserializedMicrosoftGraphOnenotePage.withCreatedDateTime(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("content".equals(fieldName)) {
                    deserializedMicrosoftGraphOnenotePage.content
                        = reader.getNullable(nonNullReader -> new Base64Url(nonNullReader.getString()));
                } else if ("contentUrl".equals(fieldName)) {
                    deserializedMicrosoftGraphOnenotePage.contentUrl = reader.getString();
                } else if ("createdByAppId".equals(fieldName)) {
                    deserializedMicrosoftGraphOnenotePage.createdByAppId = reader.getString();
                } else if ("lastModifiedDateTime".equals(fieldName)) {
                    deserializedMicrosoftGraphOnenotePage.lastModifiedDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("level".equals(fieldName)) {
                    deserializedMicrosoftGraphOnenotePage.level = reader.getNullable(JsonReader::getInt);
                } else if ("links".equals(fieldName)) {
                    deserializedMicrosoftGraphOnenotePage.links = MicrosoftGraphPageLinks.fromJson(reader);
                } else if ("order".equals(fieldName)) {
                    deserializedMicrosoftGraphOnenotePage.order = reader.getNullable(JsonReader::getInt);
                } else if ("title".equals(fieldName)) {
                    deserializedMicrosoftGraphOnenotePage.title = reader.getString();
                } else if ("userTags".equals(fieldName)) {
                    List<String> userTags = reader.readArray(reader1 -> reader1.getString());
                    deserializedMicrosoftGraphOnenotePage.userTags = userTags;
                } else if ("parentNotebook".equals(fieldName)) {
                    deserializedMicrosoftGraphOnenotePage.parentNotebook = MicrosoftGraphNotebook.fromJson(reader);
                } else if ("parentSection".equals(fieldName)) {
                    deserializedMicrosoftGraphOnenotePage.parentSection = MicrosoftGraphOnenoteSection.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphOnenotePage.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphOnenotePage;
        });
    }
}
