// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Network Virtual Appliance Sku Instances
 * 
 * List of available Sku and instances.
 */
@Immutable
public final class NetworkVirtualApplianceSkuInstances
    implements JsonSerializable<NetworkVirtualApplianceSkuInstances> {
    /*
     * Scale Unit.
     */
    private String scaleUnit;

    /*
     * Instance Count.
     */
    private Integer instanceCount;

    /**
     * Creates an instance of NetworkVirtualApplianceSkuInstances class.
     */
    public NetworkVirtualApplianceSkuInstances() {
    }

    /**
     * Get the scaleUnit property: Scale Unit.
     * 
     * @return the scaleUnit value.
     */
    public String scaleUnit() {
        return this.scaleUnit;
    }

    /**
     * Get the instanceCount property: Instance Count.
     * 
     * @return the instanceCount value.
     */
    public Integer instanceCount() {
        return this.instanceCount;
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
     * Reads an instance of NetworkVirtualApplianceSkuInstances from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkVirtualApplianceSkuInstances if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NetworkVirtualApplianceSkuInstances.
     */
    public static NetworkVirtualApplianceSkuInstances fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkVirtualApplianceSkuInstances deserializedNetworkVirtualApplianceSkuInstances
                = new NetworkVirtualApplianceSkuInstances();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("scaleUnit".equals(fieldName)) {
                    deserializedNetworkVirtualApplianceSkuInstances.scaleUnit = reader.getString();
                } else if ("instanceCount".equals(fieldName)) {
                    deserializedNetworkVirtualApplianceSkuInstances.instanceCount
                        = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkVirtualApplianceSkuInstances;
        });
    }
}
