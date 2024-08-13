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
 * workbookNamedItem.
 */
@Fluent
public final class MicrosoftGraphWorkbookNamedItem extends MicrosoftGraphEntity {
    /*
     * Represents the comment associated with this name.
     */
    private String comment;

    /*
     * The name of the object. Read-only.
     */
    private String name;

    /*
     * Indicates whether the name is scoped to the workbook or to a specific worksheet. Read-only.
     */
    private String scope;

    /*
     * Indicates what type of reference is associated with the name. The possible values are: String, Integer, Double,
     * Boolean, Range. Read-only.
     */
    private String type;

    /*
     * Json
     */
    private Map<String, Object> value;

    /*
     * Specifies whether the object is visible or not.
     */
    private Boolean visible;

    /*
     * workbookWorksheet
     */
    private MicrosoftGraphWorkbookWorksheet worksheet;

    /*
     * workbookNamedItem
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphWorkbookNamedItem class.
     */
    public MicrosoftGraphWorkbookNamedItem() {
    }

    /**
     * Get the comment property: Represents the comment associated with this name.
     * 
     * @return the comment value.
     */
    public String comment() {
        return this.comment;
    }

    /**
     * Set the comment property: Represents the comment associated with this name.
     * 
     * @param comment the comment value to set.
     * @return the MicrosoftGraphWorkbookNamedItem object itself.
     */
    public MicrosoftGraphWorkbookNamedItem withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Get the name property: The name of the object. Read-only.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the object. Read-only.
     * 
     * @param name the name value to set.
     * @return the MicrosoftGraphWorkbookNamedItem object itself.
     */
    public MicrosoftGraphWorkbookNamedItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the scope property: Indicates whether the name is scoped to the workbook or to a specific worksheet.
     * Read-only.
     * 
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: Indicates whether the name is scoped to the workbook or to a specific worksheet.
     * Read-only.
     * 
     * @param scope the scope value to set.
     * @return the MicrosoftGraphWorkbookNamedItem object itself.
     */
    public MicrosoftGraphWorkbookNamedItem withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the type property: Indicates what type of reference is associated with the name. The possible values are:
     * String, Integer, Double, Boolean, Range. Read-only.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Indicates what type of reference is associated with the name. The possible values are:
     * String, Integer, Double, Boolean, Range. Read-only.
     * 
     * @param type the type value to set.
     * @return the MicrosoftGraphWorkbookNamedItem object itself.
     */
    public MicrosoftGraphWorkbookNamedItem withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the value property: Json.
     * 
     * @return the value value.
     */
    public Map<String, Object> value() {
        return this.value;
    }

    /**
     * Set the value property: Json.
     * 
     * @param value the value value to set.
     * @return the MicrosoftGraphWorkbookNamedItem object itself.
     */
    public MicrosoftGraphWorkbookNamedItem withValue(Map<String, Object> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the visible property: Specifies whether the object is visible or not.
     * 
     * @return the visible value.
     */
    public Boolean visible() {
        return this.visible;
    }

    /**
     * Set the visible property: Specifies whether the object is visible or not.
     * 
     * @param visible the visible value to set.
     * @return the MicrosoftGraphWorkbookNamedItem object itself.
     */
    public MicrosoftGraphWorkbookNamedItem withVisible(Boolean visible) {
        this.visible = visible;
        return this;
    }

    /**
     * Get the worksheet property: workbookWorksheet.
     * 
     * @return the worksheet value.
     */
    public MicrosoftGraphWorkbookWorksheet worksheet() {
        return this.worksheet;
    }

    /**
     * Set the worksheet property: workbookWorksheet.
     * 
     * @param worksheet the worksheet value to set.
     * @return the MicrosoftGraphWorkbookNamedItem object itself.
     */
    public MicrosoftGraphWorkbookNamedItem withWorksheet(MicrosoftGraphWorkbookWorksheet worksheet) {
        this.worksheet = worksheet;
        return this;
    }

    /**
     * Get the additionalProperties property: workbookNamedItem.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: workbookNamedItem.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphWorkbookNamedItem object itself.
     */
    public MicrosoftGraphWorkbookNamedItem withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphWorkbookNamedItem withId(String id) {
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
        if (worksheet() != null) {
            worksheet().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeStringField("comment", this.comment);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("scope", this.scope);
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeMapField("value", this.value, (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeBooleanField("visible", this.visible);
        jsonWriter.writeJsonField("worksheet", this.worksheet);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphWorkbookNamedItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphWorkbookNamedItem if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphWorkbookNamedItem.
     */
    public static MicrosoftGraphWorkbookNamedItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphWorkbookNamedItem deserializedMicrosoftGraphWorkbookNamedItem
                = new MicrosoftGraphWorkbookNamedItem();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookNamedItem.withId(reader.getString());
                } else if ("comment".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookNamedItem.comment = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookNamedItem.name = reader.getString();
                } else if ("scope".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookNamedItem.scope = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookNamedItem.type = reader.getString();
                } else if ("value".equals(fieldName)) {
                    Map<String, Object> value = reader.readMap(reader1 -> reader1.readUntyped());
                    deserializedMicrosoftGraphWorkbookNamedItem.value = value;
                } else if ("visible".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookNamedItem.visible = reader.getNullable(JsonReader::getBoolean);
                } else if ("worksheet".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookNamedItem.worksheet
                        = MicrosoftGraphWorkbookWorksheet.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphWorkbookNamedItem.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphWorkbookNamedItem;
        });
    }
}
