// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Client certificate definition.
 */
@Fluent
public final class ClientCertificate implements JsonSerializable<ClientCertificate> {
    /*
     * Indicates if the client certificate has admin access to the cluster. Non admin clients can perform only read only
     * operations on the cluster.
     */
    private boolean isAdmin;

    /*
     * Certificate thumbprint.
     */
    private String thumbprint;

    /*
     * Certificate common name.
     */
    private String commonName;

    /*
     * Issuer thumbprint for the certificate. Only used together with CommonName.
     */
    private String issuerThumbprint;

    /**
     * Creates an instance of ClientCertificate class.
     */
    public ClientCertificate() {
    }

    /**
     * Get the isAdmin property: Indicates if the client certificate has admin access to the cluster. Non admin clients
     * can perform only read only operations on the cluster.
     * 
     * @return the isAdmin value.
     */
    public boolean isAdmin() {
        return this.isAdmin;
    }

    /**
     * Set the isAdmin property: Indicates if the client certificate has admin access to the cluster. Non admin clients
     * can perform only read only operations on the cluster.
     * 
     * @param isAdmin the isAdmin value to set.
     * @return the ClientCertificate object itself.
     */
    public ClientCertificate withIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
        return this;
    }

    /**
     * Get the thumbprint property: Certificate thumbprint.
     * 
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the thumbprint property: Certificate thumbprint.
     * 
     * @param thumbprint the thumbprint value to set.
     * @return the ClientCertificate object itself.
     */
    public ClientCertificate withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get the commonName property: Certificate common name.
     * 
     * @return the commonName value.
     */
    public String commonName() {
        return this.commonName;
    }

    /**
     * Set the commonName property: Certificate common name.
     * 
     * @param commonName the commonName value to set.
     * @return the ClientCertificate object itself.
     */
    public ClientCertificate withCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }

    /**
     * Get the issuerThumbprint property: Issuer thumbprint for the certificate. Only used together with CommonName.
     * 
     * @return the issuerThumbprint value.
     */
    public String issuerThumbprint() {
        return this.issuerThumbprint;
    }

    /**
     * Set the issuerThumbprint property: Issuer thumbprint for the certificate. Only used together with CommonName.
     * 
     * @param issuerThumbprint the issuerThumbprint value to set.
     * @return the ClientCertificate object itself.
     */
    public ClientCertificate withIssuerThumbprint(String issuerThumbprint) {
        this.issuerThumbprint = issuerThumbprint;
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
        jsonWriter.writeBooleanField("isAdmin", this.isAdmin);
        jsonWriter.writeStringField("thumbprint", this.thumbprint);
        jsonWriter.writeStringField("commonName", this.commonName);
        jsonWriter.writeStringField("issuerThumbprint", this.issuerThumbprint);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClientCertificate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClientCertificate if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ClientCertificate.
     */
    public static ClientCertificate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClientCertificate deserializedClientCertificate = new ClientCertificate();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("isAdmin".equals(fieldName)) {
                    deserializedClientCertificate.isAdmin = reader.getBoolean();
                } else if ("thumbprint".equals(fieldName)) {
                    deserializedClientCertificate.thumbprint = reader.getString();
                } else if ("commonName".equals(fieldName)) {
                    deserializedClientCertificate.commonName = reader.getString();
                } else if ("issuerThumbprint".equals(fieldName)) {
                    deserializedClientCertificate.issuerThumbprint = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClientCertificate;
        });
    }
}
