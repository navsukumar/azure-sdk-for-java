// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.digitaltwins.core.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

/**
 * A model definition and metadata for that model.
 */
@Fluent
public final class DigitalTwinsModelData implements JsonSerializable<DigitalTwinsModelData> {
    /*
     * A language map that contains the localized display names as specified in the model definition.
     */
    private Map<String, String> displayName;

    /*
     * A language map that contains the localized descriptions as specified in the model definition.
     */
    private Map<String, String> description;

    /*
     * The id of the model as specified in the model definition.
     */
    private final String id;

    /*
     * The time the model was uploaded to the service.
     */
    private OffsetDateTime uploadTime;

    /*
     * Indicates if the model is decommissioned. Decommissioned models cannot be referenced by newly created digital twins.
     */
    private Boolean decommissioned;

    /*
     * The model definition.
     */
    private Object model;

    /**
     * Creates an instance of DigitalTwinsModelData class.
     * 
     * @param id the id value to set.
     */
    public DigitalTwinsModelData(String id) {
        this.id = id;
    }

    /**
     * Get the displayName property: A language map that contains the localized display names as specified in the model
     * definition.
     * 
     * @return the displayName value.
     */
    public Map<String, String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: A language map that contains the localized display names as specified in the model
     * definition.
     * 
     * @param displayName the displayName value to set.
     * @return the DigitalTwinsModelData object itself.
     */
    public DigitalTwinsModelData setDisplayName(Map<String, String> displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description property: A language map that contains the localized descriptions as specified in the model
     * definition.
     * 
     * @return the description value.
     */
    public Map<String, String> getDescription() {
        return this.description;
    }

    /**
     * Set the description property: A language map that contains the localized descriptions as specified in the model
     * definition.
     * 
     * @param description the description value to set.
     * @return the DigitalTwinsModelData object itself.
     */
    public DigitalTwinsModelData setDescription(Map<String, String> description) {
        this.description = description;
        return this;
    }

    /**
     * Get the id property: The id of the model as specified in the model definition.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the uploadTime property: The time the model was uploaded to the service.
     * 
     * @return the uploadTime value.
     */
    public OffsetDateTime getUploadTime() {
        return this.uploadTime;
    }

    /**
     * Set the uploadTime property: The time the model was uploaded to the service.
     * 
     * @param uploadTime the uploadTime value to set.
     * @return the DigitalTwinsModelData object itself.
     */
    public DigitalTwinsModelData setUploadTime(OffsetDateTime uploadTime) {
        this.uploadTime = uploadTime;
        return this;
    }

    /**
     * Get the decommissioned property: Indicates if the model is decommissioned. Decommissioned models cannot be
     * referenced by newly created digital twins.
     * 
     * @return the decommissioned value.
     */
    public Boolean isDecommissioned() {
        return this.decommissioned;
    }

    /**
     * Set the decommissioned property: Indicates if the model is decommissioned. Decommissioned models cannot be
     * referenced by newly created digital twins.
     * 
     * @param decommissioned the decommissioned value to set.
     * @return the DigitalTwinsModelData object itself.
     */
    public DigitalTwinsModelData setDecommissioned(Boolean decommissioned) {
        this.decommissioned = decommissioned;
        return this;
    }

    /**
     * Get the model property: The model definition.
     * 
     * @return the model value.
     */
    public Object getModel() {
        return this.model;
    }

    /**
     * Set the model property: The model definition.
     * 
     * @param model the model value to set.
     * @return the DigitalTwinsModelData object itself.
     */
    public DigitalTwinsModelData setModel(Object model) {
        this.model = model;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeMapField("displayName", this.displayName, (writer, element) -> writer.writeString(element));
        jsonWriter.writeMapField("description", this.description, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("uploadTime",
            this.uploadTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.uploadTime));
        jsonWriter.writeBooleanField("decommissioned", this.decommissioned);
        jsonWriter.writeUntypedField("model", this.model);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DigitalTwinsModelData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DigitalTwinsModelData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DigitalTwinsModelData.
     */
    public static DigitalTwinsModelData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean idFound = false;
            String id = null;
            Map<String, String> displayName = null;
            Map<String, String> description = null;
            OffsetDateTime uploadTime = null;
            Boolean decommissioned = null;
            Object model = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    id = reader.getString();
                    idFound = true;
                } else if ("displayName".equals(fieldName)) {
                    displayName = reader.readMap(reader1 -> reader1.getString());
                } else if ("description".equals(fieldName)) {
                    description = reader.readMap(reader1 -> reader1.getString());
                } else if ("uploadTime".equals(fieldName)) {
                    uploadTime = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("decommissioned".equals(fieldName)) {
                    decommissioned = reader.getNullable(JsonReader::getBoolean);
                } else if ("model".equals(fieldName)) {
                    model = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }
            if (idFound) {
                DigitalTwinsModelData deserializedDigitalTwinsModelData = new DigitalTwinsModelData(id);
                deserializedDigitalTwinsModelData.displayName = displayName;
                deserializedDigitalTwinsModelData.description = description;
                deserializedDigitalTwinsModelData.uploadTime = uploadTime;
                deserializedDigitalTwinsModelData.decommissioned = decommissioned;
                deserializedDigitalTwinsModelData.model = model;

                return deserializedDigitalTwinsModelData;
            }
            throw new IllegalStateException("Missing required property: id");
        });
    }
}
