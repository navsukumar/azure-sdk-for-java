// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.deviceregistry.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.deviceregistry.models.AssetEndpointProfileProperties;
import com.azure.resourcemanager.deviceregistry.models.ExtendedLocation;
import java.io.IOException;
import java.util.Map;

/**
 * Asset Endpoint Profile definition.
 */
@Fluent
public final class AssetEndpointProfileInner extends Resource {
    /*
     * The resource-specific properties for this resource.
     */
    private AssetEndpointProfileProperties properties;

    /*
     * The extended location.
     */
    private ExtendedLocation extendedLocation;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
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
     * Creates an instance of AssetEndpointProfileInner class.
     */
    public AssetEndpointProfileInner() {
    }

    /**
     * Get the properties property: The resource-specific properties for this resource.
     * 
     * @return the properties value.
     */
    public AssetEndpointProfileProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The resource-specific properties for this resource.
     * 
     * @param properties the properties value to set.
     * @return the AssetEndpointProfileInner object itself.
     */
    public AssetEndpointProfileInner withProperties(AssetEndpointProfileProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the extendedLocation property: The extended location.
     * 
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: The extended location.
     * 
     * @param extendedLocation the extendedLocation value to set.
     * @return the AssetEndpointProfileInner object itself.
     */
    public AssetEndpointProfileInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
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
     * {@inheritDoc}
     */
    @Override
    public AssetEndpointProfileInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssetEndpointProfileInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
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
        if (extendedLocation() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property extendedLocation in model AssetEndpointProfileInner"));
        } else {
            extendedLocation().validate();
        }
        if (location() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property location in model AssetEndpointProfileInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AssetEndpointProfileInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("extendedLocation", this.extendedLocation);
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AssetEndpointProfileInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AssetEndpointProfileInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AssetEndpointProfileInner.
     */
    public static AssetEndpointProfileInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AssetEndpointProfileInner deserializedAssetEndpointProfileInner = new AssetEndpointProfileInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedAssetEndpointProfileInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedAssetEndpointProfileInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedAssetEndpointProfileInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedAssetEndpointProfileInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedAssetEndpointProfileInner.withTags(tags);
                } else if ("extendedLocation".equals(fieldName)) {
                    deserializedAssetEndpointProfileInner.extendedLocation = ExtendedLocation.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedAssetEndpointProfileInner.properties = AssetEndpointProfileProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedAssetEndpointProfileInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAssetEndpointProfileInner;
        });
    }
}
