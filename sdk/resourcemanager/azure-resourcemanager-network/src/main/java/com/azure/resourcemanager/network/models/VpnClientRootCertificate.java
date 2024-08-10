// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.fluent.models.VpnClientRootCertificatePropertiesFormat;
import java.io.IOException;

/**
 * VPN client root certificate of virtual network gateway.
 */
@Fluent
public final class VpnClientRootCertificate extends SubResource {
    /*
     * Properties of the vpn client root certificate.
     */
    private VpnClientRootCertificatePropertiesFormat innerProperties = new VpnClientRootCertificatePropertiesFormat();

    /*
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     */
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /**
     * Creates an instance of VpnClientRootCertificate class.
     */
    public VpnClientRootCertificate() {
    }

    /**
     * Get the innerProperties property: Properties of the vpn client root certificate.
     * 
     * @return the innerProperties value.
     */
    private VpnClientRootCertificatePropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     * 
     * @param name the name value to set.
     * @return the VpnClientRootCertificate object itself.
     */
    public VpnClientRootCertificate withName(String name) {
        this.name = name;
        return this;
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
     * {@inheritDoc}
     */
    @Override
    public VpnClientRootCertificate withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the publicCertData property: The certificate public data.
     * 
     * @return the publicCertData value.
     */
    public String publicCertData() {
        return this.innerProperties() == null ? null : this.innerProperties().publicCertData();
    }

    /**
     * Set the publicCertData property: The certificate public data.
     * 
     * @param publicCertData the publicCertData value to set.
     * @return the VpnClientRootCertificate object itself.
     */
    public VpnClientRootCertificate withPublicCertData(String publicCertData) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnClientRootCertificatePropertiesFormat();
        }
        this.innerProperties().withPublicCertData(publicCertData);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the VPN client root certificate resource.
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
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model VpnClientRootCertificate"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VpnClientRootCertificate.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VpnClientRootCertificate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VpnClientRootCertificate if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VpnClientRootCertificate.
     */
    public static VpnClientRootCertificate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VpnClientRootCertificate deserializedVpnClientRootCertificate = new VpnClientRootCertificate();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedVpnClientRootCertificate.withId(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedVpnClientRootCertificate.innerProperties
                        = VpnClientRootCertificatePropertiesFormat.fromJson(reader);
                } else if ("name".equals(fieldName)) {
                    deserializedVpnClientRootCertificate.name = reader.getString();
                } else if ("etag".equals(fieldName)) {
                    deserializedVpnClientRootCertificate.etag = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVpnClientRootCertificate;
        });
    }
}
