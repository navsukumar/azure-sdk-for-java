// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Azure Cosmos DB SQL Role Assignment resource object.
 */
@Fluent
public final class SqlRoleAssignmentResource implements JsonSerializable<SqlRoleAssignmentResource> {
    /*
     * The unique identifier for the associated Role Definition.
     */
    private String roleDefinitionId;

    /*
     * The data plane resource path for which access is being granted through this Role Assignment.
     */
    private String scope;

    /*
     * The unique identifier for the associated AAD principal in the AAD graph to which access is being granted through
     * this Role Assignment. Tenant ID for the principal is inferred using the tenant associated with the subscription.
     */
    private String principalId;

    /**
     * Creates an instance of SqlRoleAssignmentResource class.
     */
    public SqlRoleAssignmentResource() {
    }

    /**
     * Get the roleDefinitionId property: The unique identifier for the associated Role Definition.
     * 
     * @return the roleDefinitionId value.
     */
    public String roleDefinitionId() {
        return this.roleDefinitionId;
    }

    /**
     * Set the roleDefinitionId property: The unique identifier for the associated Role Definition.
     * 
     * @param roleDefinitionId the roleDefinitionId value to set.
     * @return the SqlRoleAssignmentResource object itself.
     */
    public SqlRoleAssignmentResource withRoleDefinitionId(String roleDefinitionId) {
        this.roleDefinitionId = roleDefinitionId;
        return this;
    }

    /**
     * Get the scope property: The data plane resource path for which access is being granted through this Role
     * Assignment.
     * 
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: The data plane resource path for which access is being granted through this Role
     * Assignment.
     * 
     * @param scope the scope value to set.
     * @return the SqlRoleAssignmentResource object itself.
     */
    public SqlRoleAssignmentResource withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the principalId property: The unique identifier for the associated AAD principal in the AAD graph to which
     * access is being granted through this Role Assignment. Tenant ID for the principal is inferred using the tenant
     * associated with the subscription.
     * 
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: The unique identifier for the associated AAD principal in the AAD graph to which
     * access is being granted through this Role Assignment. Tenant ID for the principal is inferred using the tenant
     * associated with the subscription.
     * 
     * @param principalId the principalId value to set.
     * @return the SqlRoleAssignmentResource object itself.
     */
    public SqlRoleAssignmentResource withPrincipalId(String principalId) {
        this.principalId = principalId;
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
        jsonWriter.writeStringField("roleDefinitionId", this.roleDefinitionId);
        jsonWriter.writeStringField("scope", this.scope);
        jsonWriter.writeStringField("principalId", this.principalId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SqlRoleAssignmentResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SqlRoleAssignmentResource if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SqlRoleAssignmentResource.
     */
    public static SqlRoleAssignmentResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SqlRoleAssignmentResource deserializedSqlRoleAssignmentResource = new SqlRoleAssignmentResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("roleDefinitionId".equals(fieldName)) {
                    deserializedSqlRoleAssignmentResource.roleDefinitionId = reader.getString();
                } else if ("scope".equals(fieldName)) {
                    deserializedSqlRoleAssignmentResource.scope = reader.getString();
                } else if ("principalId".equals(fieldName)) {
                    deserializedSqlRoleAssignmentResource.principalId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSqlRoleAssignmentResource;
        });
    }
}
