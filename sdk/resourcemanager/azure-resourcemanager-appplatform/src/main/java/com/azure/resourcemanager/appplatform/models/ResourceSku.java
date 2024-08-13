// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Describes an available Azure Spring Apps SKU.
 */
@Fluent
public final class ResourceSku implements JsonSerializable<ResourceSku> {
    /*
     * Gets the type of resource the SKU applies to.
     */
    private String resourceType;

    /*
     * Gets the name of SKU.
     */
    private String name;

    /*
     * Gets the tier of SKU.
     */
    private String tier;

    /*
     * Gets the capacity of SKU.
     */
    private SkuCapacity capacity;

    /*
     * Gets the set of locations that the SKU is available.
     */
    private List<String> locations;

    /*
     * Gets a list of locations and availability zones in those locations where the SKU is available.
     */
    private List<ResourceSkuLocationInfo> locationInfo;

    /*
     * Gets the restrictions because of which SKU cannot be used. This is
     * empty if there are no restrictions.
     */
    private List<ResourceSkuRestrictions> restrictions;

    /**
     * Creates an instance of ResourceSku class.
     */
    public ResourceSku() {
    }

    /**
     * Get the resourceType property: Gets the type of resource the SKU applies to.
     * 
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: Gets the type of resource the SKU applies to.
     * 
     * @param resourceType the resourceType value to set.
     * @return the ResourceSku object itself.
     */
    public ResourceSku withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the name property: Gets the name of SKU.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets the name of SKU.
     * 
     * @param name the name value to set.
     * @return the ResourceSku object itself.
     */
    public ResourceSku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: Gets the tier of SKU.
     * 
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the tier property: Gets the tier of SKU.
     * 
     * @param tier the tier value to set.
     * @return the ResourceSku object itself.
     */
    public ResourceSku withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the capacity property: Gets the capacity of SKU.
     * 
     * @return the capacity value.
     */
    public SkuCapacity capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: Gets the capacity of SKU.
     * 
     * @param capacity the capacity value to set.
     * @return the ResourceSku object itself.
     */
    public ResourceSku withCapacity(SkuCapacity capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the locations property: Gets the set of locations that the SKU is available.
     * 
     * @return the locations value.
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Set the locations property: Gets the set of locations that the SKU is available.
     * 
     * @param locations the locations value to set.
     * @return the ResourceSku object itself.
     */
    public ResourceSku withLocations(List<String> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get the locationInfo property: Gets a list of locations and availability zones in those locations where the SKU
     * is available.
     * 
     * @return the locationInfo value.
     */
    public List<ResourceSkuLocationInfo> locationInfo() {
        return this.locationInfo;
    }

    /**
     * Set the locationInfo property: Gets a list of locations and availability zones in those locations where the SKU
     * is available.
     * 
     * @param locationInfo the locationInfo value to set.
     * @return the ResourceSku object itself.
     */
    public ResourceSku withLocationInfo(List<ResourceSkuLocationInfo> locationInfo) {
        this.locationInfo = locationInfo;
        return this;
    }

    /**
     * Get the restrictions property: Gets the restrictions because of which SKU cannot be used. This is
     * empty if there are no restrictions.
     * 
     * @return the restrictions value.
     */
    public List<ResourceSkuRestrictions> restrictions() {
        return this.restrictions;
    }

    /**
     * Set the restrictions property: Gets the restrictions because of which SKU cannot be used. This is
     * empty if there are no restrictions.
     * 
     * @param restrictions the restrictions value to set.
     * @return the ResourceSku object itself.
     */
    public ResourceSku withRestrictions(List<ResourceSkuRestrictions> restrictions) {
        this.restrictions = restrictions;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (capacity() != null) {
            capacity().validate();
        }
        if (locationInfo() != null) {
            locationInfo().forEach(e -> e.validate());
        }
        if (restrictions() != null) {
            restrictions().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("resourceType", this.resourceType);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("tier", this.tier);
        jsonWriter.writeJsonField("capacity", this.capacity);
        jsonWriter.writeArrayField("locations", this.locations, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("locationInfo", this.locationInfo, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("restrictions", this.restrictions, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourceSku from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceSku if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResourceSku.
     */
    public static ResourceSku fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourceSku deserializedResourceSku = new ResourceSku();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resourceType".equals(fieldName)) {
                    deserializedResourceSku.resourceType = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedResourceSku.name = reader.getString();
                } else if ("tier".equals(fieldName)) {
                    deserializedResourceSku.tier = reader.getString();
                } else if ("capacity".equals(fieldName)) {
                    deserializedResourceSku.capacity = SkuCapacity.fromJson(reader);
                } else if ("locations".equals(fieldName)) {
                    List<String> locations = reader.readArray(reader1 -> reader1.getString());
                    deserializedResourceSku.locations = locations;
                } else if ("locationInfo".equals(fieldName)) {
                    List<ResourceSkuLocationInfo> locationInfo
                        = reader.readArray(reader1 -> ResourceSkuLocationInfo.fromJson(reader1));
                    deserializedResourceSku.locationInfo = locationInfo;
                } else if ("restrictions".equals(fieldName)) {
                    List<ResourceSkuRestrictions> restrictions
                        = reader.readArray(reader1 -> ResourceSkuRestrictions.fromJson(reader1));
                    deserializedResourceSku.restrictions = restrictions;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourceSku;
        });
    }
}
