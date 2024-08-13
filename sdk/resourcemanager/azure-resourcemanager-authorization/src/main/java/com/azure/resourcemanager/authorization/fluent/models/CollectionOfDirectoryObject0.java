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
import java.util.List;
import java.util.Map;

/**
 * Collection of directoryObject.
 */
@Fluent
public final class CollectionOfDirectoryObject0 implements JsonSerializable<CollectionOfDirectoryObject0> {
    /*
     * The value property.
     */
    private List<MicrosoftGraphDirectoryObjectInner> value;

    /*
     * The @odata.nextLink property.
     */
    private String odataNextLink;

    /*
     * Collection of directoryObject
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of CollectionOfDirectoryObject0 class.
     */
    public CollectionOfDirectoryObject0() {
    }

    /**
     * Get the value property: The value property.
     * 
     * @return the value value.
     */
    public List<MicrosoftGraphDirectoryObjectInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     * 
     * @param value the value value to set.
     * @return the CollectionOfDirectoryObject0 object itself.
     */
    public CollectionOfDirectoryObject0 withValue(List<MicrosoftGraphDirectoryObjectInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the odataNextLink property: The &#064;odata.nextLink property.
     * 
     * @return the odataNextLink value.
     */
    public String odataNextLink() {
        return this.odataNextLink;
    }

    /**
     * Set the odataNextLink property: The &#064;odata.nextLink property.
     * 
     * @param odataNextLink the odataNextLink value to set.
     * @return the CollectionOfDirectoryObject0 object itself.
     */
    public CollectionOfDirectoryObject0 withOdataNextLink(String odataNextLink) {
        this.odataNextLink = odataNextLink;
        return this;
    }

    /**
     * Get the additionalProperties property: Collection of directoryObject.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Collection of directoryObject.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the CollectionOfDirectoryObject0 object itself.
     */
    public CollectionOfDirectoryObject0 withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("@odata.nextLink", this.odataNextLink);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CollectionOfDirectoryObject0 from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CollectionOfDirectoryObject0 if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CollectionOfDirectoryObject0.
     */
    public static CollectionOfDirectoryObject0 fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CollectionOfDirectoryObject0 deserializedCollectionOfDirectoryObject0 = new CollectionOfDirectoryObject0();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<MicrosoftGraphDirectoryObjectInner> value
                        = reader.readArray(reader1 -> MicrosoftGraphDirectoryObjectInner.fromJson(reader1));
                    deserializedCollectionOfDirectoryObject0.value = value;
                } else if ("@odata.nextLink".equals(fieldName)) {
                    deserializedCollectionOfDirectoryObject0.odataNextLink = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedCollectionOfDirectoryObject0.additionalProperties = additionalProperties;

            return deserializedCollectionOfDirectoryObject0;
        });
    }
}
