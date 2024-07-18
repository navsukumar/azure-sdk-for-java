// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.accesscontrol.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

/**
 * Role Assignment response details.
 */
@Fluent
public final class RoleAssignmentDetails implements JsonSerializable<RoleAssignmentDetails> {
    /*
     * Role Assignment ID
     */
    private String id;

    /*
     * Role ID of the Synapse Built-In Role
     */
    private UUID roleDefinitionId;

    /*
     * Object ID of the AAD principal or security-group
     */
    private UUID principalId;

    /*
     * Scope at the role assignment is created
     */
    private String scope;

    /*
     * Type of the principal Id: User, Group or ServicePrincipal
     */
    private String principalType;

    /**
     * Creates an instance of RoleAssignmentDetails class.
     */
    public RoleAssignmentDetails() {
    }

    /**
     * Get the id property: Role Assignment ID.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Role Assignment ID.
     * 
     * @param id the id value to set.
     * @return the RoleAssignmentDetails object itself.
     */
    public RoleAssignmentDetails setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the roleDefinitionId property: Role ID of the Synapse Built-In Role.
     * 
     * @return the roleDefinitionId value.
     */
    public UUID getRoleDefinitionId() {
        return this.roleDefinitionId;
    }

    /**
     * Set the roleDefinitionId property: Role ID of the Synapse Built-In Role.
     * 
     * @param roleDefinitionId the roleDefinitionId value to set.
     * @return the RoleAssignmentDetails object itself.
     */
    public RoleAssignmentDetails setRoleDefinitionId(UUID roleDefinitionId) {
        this.roleDefinitionId = roleDefinitionId;
        return this;
    }

    /**
     * Get the principalId property: Object ID of the AAD principal or security-group.
     * 
     * @return the principalId value.
     */
    public UUID getPrincipalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: Object ID of the AAD principal or security-group.
     * 
     * @param principalId the principalId value to set.
     * @return the RoleAssignmentDetails object itself.
     */
    public RoleAssignmentDetails setPrincipalId(UUID principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get the scope property: Scope at the role assignment is created.
     * 
     * @return the scope value.
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * Set the scope property: Scope at the role assignment is created.
     * 
     * @param scope the scope value to set.
     * @return the RoleAssignmentDetails object itself.
     */
    public RoleAssignmentDetails setScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the principalType property: Type of the principal Id: User, Group or ServicePrincipal.
     * 
     * @return the principalType value.
     */
    public String getPrincipalType() {
        return this.principalType;
    }

    /**
     * Set the principalType property: Type of the principal Id: User, Group or ServicePrincipal.
     * 
     * @param principalType the principalType value to set.
     * @return the RoleAssignmentDetails object itself.
     */
    public RoleAssignmentDetails setPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("roleDefinitionId", Objects.toString(this.roleDefinitionId, null));
        jsonWriter.writeStringField("principalId", Objects.toString(this.principalId, null));
        jsonWriter.writeStringField("scope", this.scope);
        jsonWriter.writeStringField("principalType", this.principalType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RoleAssignmentDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RoleAssignmentDetails if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RoleAssignmentDetails.
     */
    public static RoleAssignmentDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RoleAssignmentDetails deserializedRoleAssignmentDetails = new RoleAssignmentDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedRoleAssignmentDetails.id = reader.getString();
                } else if ("roleDefinitionId".equals(fieldName)) {
                    deserializedRoleAssignmentDetails.roleDefinitionId
                        = reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString()));
                } else if ("principalId".equals(fieldName)) {
                    deserializedRoleAssignmentDetails.principalId
                        = reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString()));
                } else if ("scope".equals(fieldName)) {
                    deserializedRoleAssignmentDetails.scope = reader.getString();
                } else if ("principalType".equals(fieldName)) {
                    deserializedRoleAssignmentDetails.principalType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRoleAssignmentDetails;
        });
    }
}
