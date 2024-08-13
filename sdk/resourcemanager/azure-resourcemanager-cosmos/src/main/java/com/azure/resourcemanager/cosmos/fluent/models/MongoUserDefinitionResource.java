// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cosmos.models.Role;
import java.io.IOException;
import java.util.List;

/**
 * Azure Cosmos DB Mongo User Definition resource object.
 */
@Fluent
public final class MongoUserDefinitionResource implements JsonSerializable<MongoUserDefinitionResource> {
    /*
     * The user name for User Definition.
     */
    private String username;

    /*
     * The password for User Definition. Response does not contain user password.
     */
    private String password;

    /*
     * The database name for which access is being granted for this User Definition.
     */
    private String databaseName;

    /*
     * A custom definition for the USer Definition.
     */
    private String customData;

    /*
     * The set of roles inherited by the User Definition.
     */
    private List<Role> roles;

    /*
     * The Mongo Auth mechanism. For now, we only support auth mechanism SCRAM-SHA-256.
     */
    private String mechanisms;

    /**
     * Creates an instance of MongoUserDefinitionResource class.
     */
    public MongoUserDefinitionResource() {
    }

    /**
     * Get the username property: The user name for User Definition.
     * 
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: The user name for User Definition.
     * 
     * @param username the username value to set.
     * @return the MongoUserDefinitionResource object itself.
     */
    public MongoUserDefinitionResource withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password for User Definition. Response does not contain user password.
     * 
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: The password for User Definition. Response does not contain user password.
     * 
     * @param password the password value to set.
     * @return the MongoUserDefinitionResource object itself.
     */
    public MongoUserDefinitionResource withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the databaseName property: The database name for which access is being granted for this User Definition.
     * 
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the databaseName property: The database name for which access is being granted for this User Definition.
     * 
     * @param databaseName the databaseName value to set.
     * @return the MongoUserDefinitionResource object itself.
     */
    public MongoUserDefinitionResource withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the customData property: A custom definition for the USer Definition.
     * 
     * @return the customData value.
     */
    public String customData() {
        return this.customData;
    }

    /**
     * Set the customData property: A custom definition for the USer Definition.
     * 
     * @param customData the customData value to set.
     * @return the MongoUserDefinitionResource object itself.
     */
    public MongoUserDefinitionResource withCustomData(String customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Get the roles property: The set of roles inherited by the User Definition.
     * 
     * @return the roles value.
     */
    public List<Role> roles() {
        return this.roles;
    }

    /**
     * Set the roles property: The set of roles inherited by the User Definition.
     * 
     * @param roles the roles value to set.
     * @return the MongoUserDefinitionResource object itself.
     */
    public MongoUserDefinitionResource withRoles(List<Role> roles) {
        this.roles = roles;
        return this;
    }

    /**
     * Get the mechanisms property: The Mongo Auth mechanism. For now, we only support auth mechanism SCRAM-SHA-256.
     * 
     * @return the mechanisms value.
     */
    public String mechanisms() {
        return this.mechanisms;
    }

    /**
     * Set the mechanisms property: The Mongo Auth mechanism. For now, we only support auth mechanism SCRAM-SHA-256.
     * 
     * @param mechanisms the mechanisms value to set.
     * @return the MongoUserDefinitionResource object itself.
     */
    public MongoUserDefinitionResource withMechanisms(String mechanisms) {
        this.mechanisms = mechanisms;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (roles() != null) {
            roles().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("userName", this.username);
        jsonWriter.writeStringField("password", this.password);
        jsonWriter.writeStringField("databaseName", this.databaseName);
        jsonWriter.writeStringField("customData", this.customData);
        jsonWriter.writeArrayField("roles", this.roles, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("mechanisms", this.mechanisms);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MongoUserDefinitionResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MongoUserDefinitionResource if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MongoUserDefinitionResource.
     */
    public static MongoUserDefinitionResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MongoUserDefinitionResource deserializedMongoUserDefinitionResource = new MongoUserDefinitionResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("userName".equals(fieldName)) {
                    deserializedMongoUserDefinitionResource.username = reader.getString();
                } else if ("password".equals(fieldName)) {
                    deserializedMongoUserDefinitionResource.password = reader.getString();
                } else if ("databaseName".equals(fieldName)) {
                    deserializedMongoUserDefinitionResource.databaseName = reader.getString();
                } else if ("customData".equals(fieldName)) {
                    deserializedMongoUserDefinitionResource.customData = reader.getString();
                } else if ("roles".equals(fieldName)) {
                    List<Role> roles = reader.readArray(reader1 -> Role.fromJson(reader1));
                    deserializedMongoUserDefinitionResource.roles = roles;
                } else if ("mechanisms".equals(fieldName)) {
                    deserializedMongoUserDefinitionResource.mechanisms = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMongoUserDefinitionResource;
        });
    }
}
