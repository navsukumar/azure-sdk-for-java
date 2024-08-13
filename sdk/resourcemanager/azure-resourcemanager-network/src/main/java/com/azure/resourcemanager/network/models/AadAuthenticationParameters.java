// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * AAD Vpn authentication type related parameters.
 */
@Fluent
public final class AadAuthenticationParameters implements JsonSerializable<AadAuthenticationParameters> {
    /*
     * AAD Vpn authentication parameter AAD tenant.
     */
    private String aadTenant;

    /*
     * AAD Vpn authentication parameter AAD audience.
     */
    private String aadAudience;

    /*
     * AAD Vpn authentication parameter AAD issuer.
     */
    private String aadIssuer;

    /**
     * Creates an instance of AadAuthenticationParameters class.
     */
    public AadAuthenticationParameters() {
    }

    /**
     * Get the aadTenant property: AAD Vpn authentication parameter AAD tenant.
     * 
     * @return the aadTenant value.
     */
    public String aadTenant() {
        return this.aadTenant;
    }

    /**
     * Set the aadTenant property: AAD Vpn authentication parameter AAD tenant.
     * 
     * @param aadTenant the aadTenant value to set.
     * @return the AadAuthenticationParameters object itself.
     */
    public AadAuthenticationParameters withAadTenant(String aadTenant) {
        this.aadTenant = aadTenant;
        return this;
    }

    /**
     * Get the aadAudience property: AAD Vpn authentication parameter AAD audience.
     * 
     * @return the aadAudience value.
     */
    public String aadAudience() {
        return this.aadAudience;
    }

    /**
     * Set the aadAudience property: AAD Vpn authentication parameter AAD audience.
     * 
     * @param aadAudience the aadAudience value to set.
     * @return the AadAuthenticationParameters object itself.
     */
    public AadAuthenticationParameters withAadAudience(String aadAudience) {
        this.aadAudience = aadAudience;
        return this;
    }

    /**
     * Get the aadIssuer property: AAD Vpn authentication parameter AAD issuer.
     * 
     * @return the aadIssuer value.
     */
    public String aadIssuer() {
        return this.aadIssuer;
    }

    /**
     * Set the aadIssuer property: AAD Vpn authentication parameter AAD issuer.
     * 
     * @param aadIssuer the aadIssuer value to set.
     * @return the AadAuthenticationParameters object itself.
     */
    public AadAuthenticationParameters withAadIssuer(String aadIssuer) {
        this.aadIssuer = aadIssuer;
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
        jsonWriter.writeStringField("aadTenant", this.aadTenant);
        jsonWriter.writeStringField("aadAudience", this.aadAudience);
        jsonWriter.writeStringField("aadIssuer", this.aadIssuer);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AadAuthenticationParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AadAuthenticationParameters if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AadAuthenticationParameters.
     */
    public static AadAuthenticationParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AadAuthenticationParameters deserializedAadAuthenticationParameters = new AadAuthenticationParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("aadTenant".equals(fieldName)) {
                    deserializedAadAuthenticationParameters.aadTenant = reader.getString();
                } else if ("aadAudience".equals(fieldName)) {
                    deserializedAadAuthenticationParameters.aadAudience = reader.getString();
                } else if ("aadIssuer".equals(fieldName)) {
                    deserializedAadAuthenticationParameters.aadIssuer = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAadAuthenticationParameters;
        });
    }
}
