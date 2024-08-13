// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Describes a section in the fabric settings of the cluster.
 */
@Fluent
public final class SettingsSectionDescription implements JsonSerializable<SettingsSectionDescription> {
    /*
     * The section name of the fabric settings.
     */
    private String name;

    /*
     * The collection of parameters in the section.
     */
    private List<SettingsParameterDescription> parameters;

    /**
     * Creates an instance of SettingsSectionDescription class.
     */
    public SettingsSectionDescription() {
    }

    /**
     * Get the name property: The section name of the fabric settings.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The section name of the fabric settings.
     * 
     * @param name the name value to set.
     * @return the SettingsSectionDescription object itself.
     */
    public SettingsSectionDescription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the parameters property: The collection of parameters in the section.
     * 
     * @return the parameters value.
     */
    public List<SettingsParameterDescription> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The collection of parameters in the section.
     * 
     * @param parameters the parameters value to set.
     * @return the SettingsSectionDescription object itself.
     */
    public SettingsSectionDescription withParameters(List<SettingsParameterDescription> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(
                    new IllegalArgumentException("Missing required property name in model SettingsSectionDescription"));
        }
        if (parameters() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property parameters in model SettingsSectionDescription"));
        } else {
            parameters().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SettingsSectionDescription.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeArrayField("parameters", this.parameters, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SettingsSectionDescription from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SettingsSectionDescription if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SettingsSectionDescription.
     */
    public static SettingsSectionDescription fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SettingsSectionDescription deserializedSettingsSectionDescription = new SettingsSectionDescription();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedSettingsSectionDescription.name = reader.getString();
                } else if ("parameters".equals(fieldName)) {
                    List<SettingsParameterDescription> parameters
                        = reader.readArray(reader1 -> SettingsParameterDescription.fromJson(reader1));
                    deserializedSettingsSectionDescription.parameters = parameters;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSettingsSectionDescription;
        });
    }
}
