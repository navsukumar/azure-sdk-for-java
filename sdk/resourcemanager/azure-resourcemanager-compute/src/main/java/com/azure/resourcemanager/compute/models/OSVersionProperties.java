// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * OS version properties.
 */
@Immutable
public final class OSVersionProperties implements JsonSerializable<OSVersionProperties> {
    /*
     * The family of this OS version.
     */
    private String family;

    /*
     * The family label of this OS version.
     */
    private String familyLabel;

    /*
     * The OS version.
     */
    private String version;

    /*
     * The OS version label.
     */
    private String label;

    /*
     * Specifies whether this is the default OS version for its family.
     */
    private Boolean isDefault;

    /*
     * Specifies whether this OS version is active.
     */
    private Boolean isActive;

    /**
     * Creates an instance of OSVersionProperties class.
     */
    public OSVersionProperties() {
    }

    /**
     * Get the family property: The family of this OS version.
     * 
     * @return the family value.
     */
    public String family() {
        return this.family;
    }

    /**
     * Get the familyLabel property: The family label of this OS version.
     * 
     * @return the familyLabel value.
     */
    public String familyLabel() {
        return this.familyLabel;
    }

    /**
     * Get the version property: The OS version.
     * 
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Get the label property: The OS version label.
     * 
     * @return the label value.
     */
    public String label() {
        return this.label;
    }

    /**
     * Get the isDefault property: Specifies whether this is the default OS version for its family.
     * 
     * @return the isDefault value.
     */
    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * Get the isActive property: Specifies whether this OS version is active.
     * 
     * @return the isActive value.
     */
    public Boolean isActive() {
        return this.isActive;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OSVersionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OSVersionProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the OSVersionProperties.
     */
    public static OSVersionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OSVersionProperties deserializedOSVersionProperties = new OSVersionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("family".equals(fieldName)) {
                    deserializedOSVersionProperties.family = reader.getString();
                } else if ("familyLabel".equals(fieldName)) {
                    deserializedOSVersionProperties.familyLabel = reader.getString();
                } else if ("version".equals(fieldName)) {
                    deserializedOSVersionProperties.version = reader.getString();
                } else if ("label".equals(fieldName)) {
                    deserializedOSVersionProperties.label = reader.getString();
                } else if ("isDefault".equals(fieldName)) {
                    deserializedOSVersionProperties.isDefault = reader.getNullable(JsonReader::getBoolean);
                } else if ("isActive".equals(fieldName)) {
                    deserializedOSVersionProperties.isActive = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOSVersionProperties;
        });
    }
}
