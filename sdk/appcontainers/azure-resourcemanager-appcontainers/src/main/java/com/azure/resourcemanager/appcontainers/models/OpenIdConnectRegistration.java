// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The configuration settings of the app registration for the custom Open ID Connect provider.
 */
@Fluent
public final class OpenIdConnectRegistration implements JsonSerializable<OpenIdConnectRegistration> {
    /*
     * The client id of the custom Open ID Connect provider.
     */
    private String clientId;

    /*
     * The authentication credentials of the custom Open ID Connect provider.
     */
    private OpenIdConnectClientCredential clientCredential;

    /*
     * The configuration settings of the endpoints used for the custom Open ID Connect provider.
     */
    private OpenIdConnectConfig openIdConnectConfiguration;

    /**
     * Creates an instance of OpenIdConnectRegistration class.
     */
    public OpenIdConnectRegistration() {
    }

    /**
     * Get the clientId property: The client id of the custom Open ID Connect provider.
     * 
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The client id of the custom Open ID Connect provider.
     * 
     * @param clientId the clientId value to set.
     * @return the OpenIdConnectRegistration object itself.
     */
    public OpenIdConnectRegistration withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientCredential property: The authentication credentials of the custom Open ID Connect provider.
     * 
     * @return the clientCredential value.
     */
    public OpenIdConnectClientCredential clientCredential() {
        return this.clientCredential;
    }

    /**
     * Set the clientCredential property: The authentication credentials of the custom Open ID Connect provider.
     * 
     * @param clientCredential the clientCredential value to set.
     * @return the OpenIdConnectRegistration object itself.
     */
    public OpenIdConnectRegistration withClientCredential(OpenIdConnectClientCredential clientCredential) {
        this.clientCredential = clientCredential;
        return this;
    }

    /**
     * Get the openIdConnectConfiguration property: The configuration settings of the endpoints used for the custom Open
     * ID Connect provider.
     * 
     * @return the openIdConnectConfiguration value.
     */
    public OpenIdConnectConfig openIdConnectConfiguration() {
        return this.openIdConnectConfiguration;
    }

    /**
     * Set the openIdConnectConfiguration property: The configuration settings of the endpoints used for the custom Open
     * ID Connect provider.
     * 
     * @param openIdConnectConfiguration the openIdConnectConfiguration value to set.
     * @return the OpenIdConnectRegistration object itself.
     */
    public OpenIdConnectRegistration withOpenIdConnectConfiguration(OpenIdConnectConfig openIdConnectConfiguration) {
        this.openIdConnectConfiguration = openIdConnectConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (clientCredential() != null) {
            clientCredential().validate();
        }
        if (openIdConnectConfiguration() != null) {
            openIdConnectConfiguration().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("clientId", this.clientId);
        jsonWriter.writeJsonField("clientCredential", this.clientCredential);
        jsonWriter.writeJsonField("openIdConnectConfiguration", this.openIdConnectConfiguration);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OpenIdConnectRegistration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OpenIdConnectRegistration if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OpenIdConnectRegistration.
     */
    public static OpenIdConnectRegistration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OpenIdConnectRegistration deserializedOpenIdConnectRegistration = new OpenIdConnectRegistration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("clientId".equals(fieldName)) {
                    deserializedOpenIdConnectRegistration.clientId = reader.getString();
                } else if ("clientCredential".equals(fieldName)) {
                    deserializedOpenIdConnectRegistration.clientCredential
                        = OpenIdConnectClientCredential.fromJson(reader);
                } else if ("openIdConnectConfiguration".equals(fieldName)) {
                    deserializedOpenIdConnectRegistration.openIdConnectConfiguration
                        = OpenIdConnectConfig.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOpenIdConnectRegistration;
        });
    }
}
