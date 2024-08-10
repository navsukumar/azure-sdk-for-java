// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import java.io.IOException;

/**
 * Swift Virtual Network Contract. This is used to enable the new Swift way of doing virtual network integration.
 */
@Fluent
public final class SwiftVirtualNetworkInner extends ProxyOnlyResource {
    /*
     * SwiftVirtualNetwork resource specific properties
     */
    private SwiftVirtualNetworkProperties innerProperties;

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
     * Creates an instance of SwiftVirtualNetworkInner class.
     */
    public SwiftVirtualNetworkInner() {
    }

    /**
     * Get the innerProperties property: SwiftVirtualNetwork resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private SwiftVirtualNetworkProperties innerProperties() {
        return this.innerProperties;
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
    public SwiftVirtualNetworkInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the subnetResourceId property: The Virtual Network subnet's resource ID. This is the subnet that this Web App
     * will join. This subnet must have a delegation to Microsoft.Web/serverFarms defined first.
     * 
     * @return the subnetResourceId value.
     */
    public String subnetResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().subnetResourceId();
    }

    /**
     * Set the subnetResourceId property: The Virtual Network subnet's resource ID. This is the subnet that this Web App
     * will join. This subnet must have a delegation to Microsoft.Web/serverFarms defined first.
     * 
     * @param subnetResourceId the subnetResourceId value to set.
     * @return the SwiftVirtualNetworkInner object itself.
     */
    public SwiftVirtualNetworkInner withSubnetResourceId(String subnetResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SwiftVirtualNetworkProperties();
        }
        this.innerProperties().withSubnetResourceId(subnetResourceId);
        return this;
    }

    /**
     * Get the swiftSupported property: A flag that specifies if the scale unit this Web App is on supports Swift
     * integration.
     * 
     * @return the swiftSupported value.
     */
    public Boolean swiftSupported() {
        return this.innerProperties() == null ? null : this.innerProperties().swiftSupported();
    }

    /**
     * Set the swiftSupported property: A flag that specifies if the scale unit this Web App is on supports Swift
     * integration.
     * 
     * @param swiftSupported the swiftSupported value to set.
     * @return the SwiftVirtualNetworkInner object itself.
     */
    public SwiftVirtualNetworkInner withSwiftSupported(Boolean swiftSupported) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SwiftVirtualNetworkProperties();
        }
        this.innerProperties().withSwiftSupported(swiftSupported);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", kind());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SwiftVirtualNetworkInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SwiftVirtualNetworkInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SwiftVirtualNetworkInner.
     */
    public static SwiftVirtualNetworkInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SwiftVirtualNetworkInner deserializedSwiftVirtualNetworkInner = new SwiftVirtualNetworkInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedSwiftVirtualNetworkInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedSwiftVirtualNetworkInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedSwiftVirtualNetworkInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedSwiftVirtualNetworkInner.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedSwiftVirtualNetworkInner.innerProperties
                        = SwiftVirtualNetworkProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSwiftVirtualNetworkInner;
        });
    }
}
