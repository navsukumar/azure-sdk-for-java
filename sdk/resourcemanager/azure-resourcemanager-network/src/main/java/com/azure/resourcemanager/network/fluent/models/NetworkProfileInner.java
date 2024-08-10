// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.ContainerNetworkInterface;
import com.azure.resourcemanager.network.models.ContainerNetworkInterfaceConfiguration;
import com.azure.resourcemanager.network.models.ProvisioningState;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Network profile resource.
 */
@Fluent
public final class NetworkProfileInner extends Resource {
    /*
     * Network profile properties.
     */
    private NetworkProfilePropertiesFormat innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /*
     * Resource ID.
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
     * Creates an instance of NetworkProfileInner class.
     */
    public NetworkProfileInner() {
    }

    /**
     * Get the innerProperties property: Network profile properties.
     * 
     * @return the innerProperties value.
     */
    private NetworkProfilePropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the id property: Resource ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     * 
     * @param id the id value to set.
     * @return the NetworkProfileInner object itself.
     */
    public NetworkProfileInner withId(String id) {
        this.id = id;
        return this;
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
    public NetworkProfileInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkProfileInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the containerNetworkInterfaces property: List of child container network interfaces.
     * 
     * @return the containerNetworkInterfaces value.
     */
    public List<ContainerNetworkInterface> containerNetworkInterfaces() {
        return this.innerProperties() == null ? null : this.innerProperties().containerNetworkInterfaces();
    }

    /**
     * Get the containerNetworkInterfaceConfigurations property: List of chid container network interface
     * configurations.
     * 
     * @return the containerNetworkInterfaceConfigurations value.
     */
    public List<ContainerNetworkInterfaceConfiguration> containerNetworkInterfaceConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().containerNetworkInterfaceConfigurations();
    }

    /**
     * Set the containerNetworkInterfaceConfigurations property: List of chid container network interface
     * configurations.
     * 
     * @param containerNetworkInterfaceConfigurations the containerNetworkInterfaceConfigurations value to set.
     * @return the NetworkProfileInner object itself.
     */
    public NetworkProfileInner withContainerNetworkInterfaceConfigurations(
        List<ContainerNetworkInterfaceConfiguration> containerNetworkInterfaceConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkProfilePropertiesFormat();
        }
        this.innerProperties().withContainerNetworkInterfaceConfigurations(containerNetworkInterfaceConfigurations);
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the network profile resource.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
    }

    /**
     * Get the provisioningState property: The provisioning state of the network profile resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
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
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("id", this.id);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkProfileInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkProfileInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the NetworkProfileInner.
     */
    public static NetworkProfileInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkProfileInner deserializedNetworkProfileInner = new NetworkProfileInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedNetworkProfileInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedNetworkProfileInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedNetworkProfileInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedNetworkProfileInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedNetworkProfileInner.innerProperties = NetworkProfilePropertiesFormat.fromJson(reader);
                } else if ("etag".equals(fieldName)) {
                    deserializedNetworkProfileInner.etag = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedNetworkProfileInner.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkProfileInner;
        });
    }
}
