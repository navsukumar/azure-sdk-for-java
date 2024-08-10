// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appplatform.models.PredefinedAcceleratorProperties;
import com.azure.resourcemanager.appplatform.models.Sku;
import java.io.IOException;

/**
 * Predefined accelerator resource.
 */
@Fluent
public final class PredefinedAcceleratorResourceInner extends ProxyResource {
    /*
     * Predefined accelerator properties payload
     */
    private PredefinedAcceleratorProperties properties;

    /*
     * Sku of the predefined accelerator resource
     */
    private Sku sku;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    private SystemData systemData;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of PredefinedAcceleratorResourceInner class.
     */
    public PredefinedAcceleratorResourceInner() {
    }

    /**
     * Get the properties property: Predefined accelerator properties payload.
     * 
     * @return the properties value.
     */
    public PredefinedAcceleratorProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Predefined accelerator properties payload.
     * 
     * @param properties the properties value to set.
     * @return the PredefinedAcceleratorResourceInner object itself.
     */
    public PredefinedAcceleratorResourceInner withProperties(PredefinedAcceleratorProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the sku property: Sku of the predefined accelerator resource.
     * 
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Sku of the predefined accelerator resource.
     * 
     * @param sku the sku value to set.
     * @return the PredefinedAcceleratorResourceInner object itself.
     */
    public PredefinedAcceleratorResourceInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.properties);
        jsonWriter.writeJsonField("sku", this.sku);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PredefinedAcceleratorResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PredefinedAcceleratorResourceInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PredefinedAcceleratorResourceInner.
     */
    public static PredefinedAcceleratorResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PredefinedAcceleratorResourceInner deserializedPredefinedAcceleratorResourceInner
                = new PredefinedAcceleratorResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedPredefinedAcceleratorResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedPredefinedAcceleratorResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedPredefinedAcceleratorResourceInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedPredefinedAcceleratorResourceInner.properties
                        = PredefinedAcceleratorProperties.fromJson(reader);
                } else if ("sku".equals(fieldName)) {
                    deserializedPredefinedAcceleratorResourceInner.sku = Sku.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedPredefinedAcceleratorResourceInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPredefinedAcceleratorResourceInner;
        });
    }
}
