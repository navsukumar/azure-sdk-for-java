// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.msi.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Federated identity credential properties.
 * 
 * The properties associated with a federated identity credential.
 */
@Fluent
public final class FederatedIdentityCredentialProperties
    implements JsonSerializable<FederatedIdentityCredentialProperties> {
    /*
     * The URL of the issuer to be trusted.
     */
    private String issuer;

    /*
     * The identifier of the external identity.
     */
    private String subject;

    /*
     * The list of audiences that can appear in the issued token.
     */
    private List<String> audiences;

    /**
     * Creates an instance of FederatedIdentityCredentialProperties class.
     */
    public FederatedIdentityCredentialProperties() {
    }

    /**
     * Get the issuer property: The URL of the issuer to be trusted.
     * 
     * @return the issuer value.
     */
    public String issuer() {
        return this.issuer;
    }

    /**
     * Set the issuer property: The URL of the issuer to be trusted.
     * 
     * @param issuer the issuer value to set.
     * @return the FederatedIdentityCredentialProperties object itself.
     */
    public FederatedIdentityCredentialProperties withIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Get the subject property: The identifier of the external identity.
     * 
     * @return the subject value.
     */
    public String subject() {
        return this.subject;
    }

    /**
     * Set the subject property: The identifier of the external identity.
     * 
     * @param subject the subject value to set.
     * @return the FederatedIdentityCredentialProperties object itself.
     */
    public FederatedIdentityCredentialProperties withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Get the audiences property: The list of audiences that can appear in the issued token.
     * 
     * @return the audiences value.
     */
    public List<String> audiences() {
        return this.audiences;
    }

    /**
     * Set the audiences property: The list of audiences that can appear in the issued token.
     * 
     * @param audiences the audiences value to set.
     * @return the FederatedIdentityCredentialProperties object itself.
     */
    public FederatedIdentityCredentialProperties withAudiences(List<String> audiences) {
        this.audiences = audiences;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (issuer() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property issuer in model FederatedIdentityCredentialProperties"));
        }
        if (subject() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property subject in model FederatedIdentityCredentialProperties"));
        }
        if (audiences() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property audiences in model FederatedIdentityCredentialProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FederatedIdentityCredentialProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("issuer", this.issuer);
        jsonWriter.writeStringField("subject", this.subject);
        jsonWriter.writeArrayField("audiences", this.audiences, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FederatedIdentityCredentialProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FederatedIdentityCredentialProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FederatedIdentityCredentialProperties.
     */
    public static FederatedIdentityCredentialProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FederatedIdentityCredentialProperties deserializedFederatedIdentityCredentialProperties
                = new FederatedIdentityCredentialProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("issuer".equals(fieldName)) {
                    deserializedFederatedIdentityCredentialProperties.issuer = reader.getString();
                } else if ("subject".equals(fieldName)) {
                    deserializedFederatedIdentityCredentialProperties.subject = reader.getString();
                } else if ("audiences".equals(fieldName)) {
                    List<String> audiences = reader.readArray(reader1 -> reader1.getString());
                    deserializedFederatedIdentityCredentialProperties.audiences = audiences;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFederatedIdentityCredentialProperties;
        });
    }
}
