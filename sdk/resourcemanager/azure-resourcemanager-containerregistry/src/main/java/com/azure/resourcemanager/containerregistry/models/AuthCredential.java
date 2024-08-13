// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Authentication credential stored for an upstream.
 */
@Fluent
public final class AuthCredential implements JsonSerializable<AuthCredential> {
    /*
     * The name of the credential.
     */
    private CredentialName name;

    /*
     * KeyVault Secret URI for accessing the username.
     */
    private String usernameSecretIdentifier;

    /*
     * KeyVault Secret URI for accessing the password.
     */
    private String passwordSecretIdentifier;

    /*
     * This provides data pertaining to the health of the auth credential.
     */
    private CredentialHealth credentialHealth;

    /**
     * Creates an instance of AuthCredential class.
     */
    public AuthCredential() {
    }

    /**
     * Get the name property: The name of the credential.
     * 
     * @return the name value.
     */
    public CredentialName name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the credential.
     * 
     * @param name the name value to set.
     * @return the AuthCredential object itself.
     */
    public AuthCredential withName(CredentialName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the usernameSecretIdentifier property: KeyVault Secret URI for accessing the username.
     * 
     * @return the usernameSecretIdentifier value.
     */
    public String usernameSecretIdentifier() {
        return this.usernameSecretIdentifier;
    }

    /**
     * Set the usernameSecretIdentifier property: KeyVault Secret URI for accessing the username.
     * 
     * @param usernameSecretIdentifier the usernameSecretIdentifier value to set.
     * @return the AuthCredential object itself.
     */
    public AuthCredential withUsernameSecretIdentifier(String usernameSecretIdentifier) {
        this.usernameSecretIdentifier = usernameSecretIdentifier;
        return this;
    }

    /**
     * Get the passwordSecretIdentifier property: KeyVault Secret URI for accessing the password.
     * 
     * @return the passwordSecretIdentifier value.
     */
    public String passwordSecretIdentifier() {
        return this.passwordSecretIdentifier;
    }

    /**
     * Set the passwordSecretIdentifier property: KeyVault Secret URI for accessing the password.
     * 
     * @param passwordSecretIdentifier the passwordSecretIdentifier value to set.
     * @return the AuthCredential object itself.
     */
    public AuthCredential withPasswordSecretIdentifier(String passwordSecretIdentifier) {
        this.passwordSecretIdentifier = passwordSecretIdentifier;
        return this;
    }

    /**
     * Get the credentialHealth property: This provides data pertaining to the health of the auth credential.
     * 
     * @return the credentialHealth value.
     */
    public CredentialHealth credentialHealth() {
        return this.credentialHealth;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (credentialHealth() != null) {
            credentialHealth().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name == null ? null : this.name.toString());
        jsonWriter.writeStringField("usernameSecretIdentifier", this.usernameSecretIdentifier);
        jsonWriter.writeStringField("passwordSecretIdentifier", this.passwordSecretIdentifier);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AuthCredential from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AuthCredential if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AuthCredential.
     */
    public static AuthCredential fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AuthCredential deserializedAuthCredential = new AuthCredential();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedAuthCredential.name = CredentialName.fromString(reader.getString());
                } else if ("usernameSecretIdentifier".equals(fieldName)) {
                    deserializedAuthCredential.usernameSecretIdentifier = reader.getString();
                } else if ("passwordSecretIdentifier".equals(fieldName)) {
                    deserializedAuthCredential.passwordSecretIdentifier = reader.getString();
                } else if ("credentialHealth".equals(fieldName)) {
                    deserializedAuthCredential.credentialHealth = CredentialHealth.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAuthCredential;
        });
    }
}
