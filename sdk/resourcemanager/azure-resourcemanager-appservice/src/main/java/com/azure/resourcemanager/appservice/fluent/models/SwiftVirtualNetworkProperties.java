// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * SwiftVirtualNetwork resource specific properties.
 */
@Fluent
public final class SwiftVirtualNetworkProperties implements JsonSerializable<SwiftVirtualNetworkProperties> {
    /*
     * The Virtual Network subnet's resource ID. This is the subnet that this Web App will join. This subnet must have a
     * delegation to Microsoft.Web/serverFarms defined first.
     */
    private String subnetResourceId;

    /*
     * A flag that specifies if the scale unit this Web App is on supports Swift integration.
     */
    private Boolean swiftSupported;

    /**
     * Creates an instance of SwiftVirtualNetworkProperties class.
     */
    public SwiftVirtualNetworkProperties() {
    }

    /**
     * Get the subnetResourceId property: The Virtual Network subnet's resource ID. This is the subnet that this Web App
     * will join. This subnet must have a delegation to Microsoft.Web/serverFarms defined first.
     * 
     * @return the subnetResourceId value.
     */
    public String subnetResourceId() {
        return this.subnetResourceId;
    }

    /**
     * Set the subnetResourceId property: The Virtual Network subnet's resource ID. This is the subnet that this Web App
     * will join. This subnet must have a delegation to Microsoft.Web/serverFarms defined first.
     * 
     * @param subnetResourceId the subnetResourceId value to set.
     * @return the SwiftVirtualNetworkProperties object itself.
     */
    public SwiftVirtualNetworkProperties withSubnetResourceId(String subnetResourceId) {
        this.subnetResourceId = subnetResourceId;
        return this;
    }

    /**
     * Get the swiftSupported property: A flag that specifies if the scale unit this Web App is on supports Swift
     * integration.
     * 
     * @return the swiftSupported value.
     */
    public Boolean swiftSupported() {
        return this.swiftSupported;
    }

    /**
     * Set the swiftSupported property: A flag that specifies if the scale unit this Web App is on supports Swift
     * integration.
     * 
     * @param swiftSupported the swiftSupported value to set.
     * @return the SwiftVirtualNetworkProperties object itself.
     */
    public SwiftVirtualNetworkProperties withSwiftSupported(Boolean swiftSupported) {
        this.swiftSupported = swiftSupported;
        return this;
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
        jsonWriter.writeStringField("subnetResourceId", this.subnetResourceId);
        jsonWriter.writeBooleanField("swiftSupported", this.swiftSupported);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SwiftVirtualNetworkProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SwiftVirtualNetworkProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SwiftVirtualNetworkProperties.
     */
    public static SwiftVirtualNetworkProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SwiftVirtualNetworkProperties deserializedSwiftVirtualNetworkProperties
                = new SwiftVirtualNetworkProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("subnetResourceId".equals(fieldName)) {
                    deserializedSwiftVirtualNetworkProperties.subnetResourceId = reader.getString();
                } else if ("swiftSupported".equals(fieldName)) {
                    deserializedSwiftVirtualNetworkProperties.swiftSupported
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSwiftVirtualNetworkProperties;
        });
    }
}
