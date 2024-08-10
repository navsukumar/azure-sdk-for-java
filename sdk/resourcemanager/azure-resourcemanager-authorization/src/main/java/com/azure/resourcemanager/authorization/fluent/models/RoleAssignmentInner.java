// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.authorization.models.PrincipalType;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Role Assignments.
 */
@Fluent
public final class RoleAssignmentInner extends ProxyResource {
    /*
     * Role assignment properties.
     */
    private RoleAssignmentProperties innerProperties;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of RoleAssignmentInner class.
     */
    public RoleAssignmentInner() {
    }

    /**
     * Get the innerProperties property: Role assignment properties.
     * 
     * @return the innerProperties value.
     */
    private RoleAssignmentProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the scope property: The role assignment scope.
     * 
     * @return the scope value.
     */
    public String scope() {
        return this.innerProperties() == null ? null : this.innerProperties().scope();
    }

    /**
     * Get the roleDefinitionId property: The role definition ID.
     * 
     * @return the roleDefinitionId value.
     */
    public String roleDefinitionId() {
        return this.innerProperties() == null ? null : this.innerProperties().roleDefinitionId();
    }

    /**
     * Set the roleDefinitionId property: The role definition ID.
     * 
     * @param roleDefinitionId the roleDefinitionId value to set.
     * @return the RoleAssignmentInner object itself.
     */
    public RoleAssignmentInner withRoleDefinitionId(String roleDefinitionId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentProperties();
        }
        this.innerProperties().withRoleDefinitionId(roleDefinitionId);
        return this;
    }

    /**
     * Get the principalId property: The principal ID.
     * 
     * @return the principalId value.
     */
    public String principalId() {
        return this.innerProperties() == null ? null : this.innerProperties().principalId();
    }

    /**
     * Set the principalId property: The principal ID.
     * 
     * @param principalId the principalId value to set.
     * @return the RoleAssignmentInner object itself.
     */
    public RoleAssignmentInner withPrincipalId(String principalId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentProperties();
        }
        this.innerProperties().withPrincipalId(principalId);
        return this;
    }

    /**
     * Get the principalType property: The principal type of the assigned principal ID.
     * 
     * @return the principalType value.
     */
    public PrincipalType principalType() {
        return this.innerProperties() == null ? null : this.innerProperties().principalType();
    }

    /**
     * Set the principalType property: The principal type of the assigned principal ID.
     * 
     * @param principalType the principalType value to set.
     * @return the RoleAssignmentInner object itself.
     */
    public RoleAssignmentInner withPrincipalType(PrincipalType principalType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentProperties();
        }
        this.innerProperties().withPrincipalType(principalType);
        return this;
    }

    /**
     * Get the description property: Description of role assignment.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Description of role assignment.
     * 
     * @param description the description value to set.
     * @return the RoleAssignmentInner object itself.
     */
    public RoleAssignmentInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the condition property: The conditions on the role assignment. This limits the resources it can be assigned
     * to. e.g.: &#064;Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName]
     * StringEqualsIgnoreCase 'foo_storage_container'.
     * 
     * @return the condition value.
     */
    public String condition() {
        return this.innerProperties() == null ? null : this.innerProperties().condition();
    }

    /**
     * Set the condition property: The conditions on the role assignment. This limits the resources it can be assigned
     * to. e.g.: &#064;Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName]
     * StringEqualsIgnoreCase 'foo_storage_container'.
     * 
     * @param condition the condition value to set.
     * @return the RoleAssignmentInner object itself.
     */
    public RoleAssignmentInner withCondition(String condition) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentProperties();
        }
        this.innerProperties().withCondition(condition);
        return this;
    }

    /**
     * Get the conditionVersion property: Version of the condition. Currently the only accepted value is '2.0'.
     * 
     * @return the conditionVersion value.
     */
    public String conditionVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().conditionVersion();
    }

    /**
     * Set the conditionVersion property: Version of the condition. Currently the only accepted value is '2.0'.
     * 
     * @param conditionVersion the conditionVersion value to set.
     * @return the RoleAssignmentInner object itself.
     */
    public RoleAssignmentInner withConditionVersion(String conditionVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentProperties();
        }
        this.innerProperties().withConditionVersion(conditionVersion);
        return this;
    }

    /**
     * Get the createdOn property: Time it was created.
     * 
     * @return the createdOn value.
     */
    public OffsetDateTime createdOn() {
        return this.innerProperties() == null ? null : this.innerProperties().createdOn();
    }

    /**
     * Get the updatedOn property: Time it was updated.
     * 
     * @return the updatedOn value.
     */
    public OffsetDateTime updatedOn() {
        return this.innerProperties() == null ? null : this.innerProperties().updatedOn();
    }

    /**
     * Get the createdBy property: Id of the user who created the assignment.
     * 
     * @return the createdBy value.
     */
    public String createdBy() {
        return this.innerProperties() == null ? null : this.innerProperties().createdBy();
    }

    /**
     * Get the updatedBy property: Id of the user who updated the assignment.
     * 
     * @return the updatedBy value.
     */
    public String updatedBy() {
        return this.innerProperties() == null ? null : this.innerProperties().updatedBy();
    }

    /**
     * Get the delegatedManagedIdentityResourceId property: Id of the delegated managed identity resource.
     * 
     * @return the delegatedManagedIdentityResourceId value.
     */
    public String delegatedManagedIdentityResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().delegatedManagedIdentityResourceId();
    }

    /**
     * Set the delegatedManagedIdentityResourceId property: Id of the delegated managed identity resource.
     * 
     * @param delegatedManagedIdentityResourceId the delegatedManagedIdentityResourceId value to set.
     * @return the RoleAssignmentInner object itself.
     */
    public RoleAssignmentInner withDelegatedManagedIdentityResourceId(String delegatedManagedIdentityResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentProperties();
        }
        this.innerProperties().withDelegatedManagedIdentityResourceId(delegatedManagedIdentityResourceId);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RoleAssignmentInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RoleAssignmentInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RoleAssignmentInner.
     */
    public static RoleAssignmentInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RoleAssignmentInner deserializedRoleAssignmentInner = new RoleAssignmentInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedRoleAssignmentInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedRoleAssignmentInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedRoleAssignmentInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedRoleAssignmentInner.innerProperties = RoleAssignmentProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRoleAssignmentInner;
        });
    }
}
