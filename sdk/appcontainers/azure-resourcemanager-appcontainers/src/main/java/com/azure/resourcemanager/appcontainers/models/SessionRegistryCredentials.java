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
 * Session pool private registry credentials.
 */
@Fluent
public final class SessionRegistryCredentials implements JsonSerializable<SessionRegistryCredentials> {
    /*
     * Container registry server.
     */
    private String registryServer;

    /*
     * Container registry username.
     */
    private String username;

    /*
     * The name of the secret that contains the registry login password
     */
    private String passwordSecretRef;

    /**
     * Creates an instance of SessionRegistryCredentials class.
     */
    public SessionRegistryCredentials() {
    }

    /**
     * Get the registryServer property: Container registry server.
     * 
     * @return the registryServer value.
     */
    public String registryServer() {
        return this.registryServer;
    }

    /**
     * Set the registryServer property: Container registry server.
     * 
     * @param registryServer the registryServer value to set.
     * @return the SessionRegistryCredentials object itself.
     */
    public SessionRegistryCredentials withRegistryServer(String registryServer) {
        this.registryServer = registryServer;
        return this;
    }

    /**
     * Get the username property: Container registry username.
     * 
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: Container registry username.
     * 
     * @param username the username value to set.
     * @return the SessionRegistryCredentials object itself.
     */
    public SessionRegistryCredentials withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the passwordSecretRef property: The name of the secret that contains the registry login password.
     * 
     * @return the passwordSecretRef value.
     */
    public String passwordSecretRef() {
        return this.passwordSecretRef;
    }

    /**
     * Set the passwordSecretRef property: The name of the secret that contains the registry login password.
     * 
     * @param passwordSecretRef the passwordSecretRef value to set.
     * @return the SessionRegistryCredentials object itself.
     */
    public SessionRegistryCredentials withPasswordSecretRef(String passwordSecretRef) {
        this.passwordSecretRef = passwordSecretRef;
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
        jsonWriter.writeStringField("registryServer", this.registryServer);
        jsonWriter.writeStringField("username", this.username);
        jsonWriter.writeStringField("passwordSecretRef", this.passwordSecretRef);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SessionRegistryCredentials from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SessionRegistryCredentials if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SessionRegistryCredentials.
     */
    public static SessionRegistryCredentials fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SessionRegistryCredentials deserializedSessionRegistryCredentials = new SessionRegistryCredentials();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("registryServer".equals(fieldName)) {
                    deserializedSessionRegistryCredentials.registryServer = reader.getString();
                } else if ("username".equals(fieldName)) {
                    deserializedSessionRegistryCredentials.username = reader.getString();
                } else if ("passwordSecretRef".equals(fieldName)) {
                    deserializedSessionRegistryCredentials.passwordSecretRef = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSessionRegistryCredentials;
        });
    }
}
