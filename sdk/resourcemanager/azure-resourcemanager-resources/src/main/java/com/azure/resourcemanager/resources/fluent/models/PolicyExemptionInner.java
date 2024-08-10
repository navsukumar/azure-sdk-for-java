// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.resources.models.AssignmentScopeValidation;
import com.azure.resourcemanager.resources.models.ExemptionCategory;
import com.azure.resourcemanager.resources.models.ResourceSelector;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * The policy exemption.
 */
@Fluent
public final class PolicyExemptionInner extends ProxyResource {
    /*
     * Properties for the policy exemption.
     */
    private PolicyExemptionProperties innerProperties = new PolicyExemptionProperties();

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

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
     * Creates an instance of PolicyExemptionInner class.
     */
    public PolicyExemptionInner() {
    }

    /**
     * Get the innerProperties property: Properties for the policy exemption.
     * 
     * @return the innerProperties value.
     */
    private PolicyExemptionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
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
     * Get the policyAssignmentId property: The ID of the policy assignment that is being exempted.
     * 
     * @return the policyAssignmentId value.
     */
    public String policyAssignmentId() {
        return this.innerProperties() == null ? null : this.innerProperties().policyAssignmentId();
    }

    /**
     * Set the policyAssignmentId property: The ID of the policy assignment that is being exempted.
     * 
     * @param policyAssignmentId the policyAssignmentId value to set.
     * @return the PolicyExemptionInner object itself.
     */
    public PolicyExemptionInner withPolicyAssignmentId(String policyAssignmentId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyExemptionProperties();
        }
        this.innerProperties().withPolicyAssignmentId(policyAssignmentId);
        return this;
    }

    /**
     * Get the policyDefinitionReferenceIds property: The policy definition reference ID list when the associated policy
     * assignment is an assignment of a policy set definition.
     * 
     * @return the policyDefinitionReferenceIds value.
     */
    public List<String> policyDefinitionReferenceIds() {
        return this.innerProperties() == null ? null : this.innerProperties().policyDefinitionReferenceIds();
    }

    /**
     * Set the policyDefinitionReferenceIds property: The policy definition reference ID list when the associated policy
     * assignment is an assignment of a policy set definition.
     * 
     * @param policyDefinitionReferenceIds the policyDefinitionReferenceIds value to set.
     * @return the PolicyExemptionInner object itself.
     */
    public PolicyExemptionInner withPolicyDefinitionReferenceIds(List<String> policyDefinitionReferenceIds) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyExemptionProperties();
        }
        this.innerProperties().withPolicyDefinitionReferenceIds(policyDefinitionReferenceIds);
        return this;
    }

    /**
     * Get the exemptionCategory property: The policy exemption category. Possible values are Waiver and Mitigated.
     * 
     * @return the exemptionCategory value.
     */
    public ExemptionCategory exemptionCategory() {
        return this.innerProperties() == null ? null : this.innerProperties().exemptionCategory();
    }

    /**
     * Set the exemptionCategory property: The policy exemption category. Possible values are Waiver and Mitigated.
     * 
     * @param exemptionCategory the exemptionCategory value to set.
     * @return the PolicyExemptionInner object itself.
     */
    public PolicyExemptionInner withExemptionCategory(ExemptionCategory exemptionCategory) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyExemptionProperties();
        }
        this.innerProperties().withExemptionCategory(exemptionCategory);
        return this;
    }

    /**
     * Get the expiresOn property: The expiration date and time (in UTC ISO 8601 format yyyy-MM-ddTHH:mm:ssZ) of the
     * policy exemption.
     * 
     * @return the expiresOn value.
     */
    public OffsetDateTime expiresOn() {
        return this.innerProperties() == null ? null : this.innerProperties().expiresOn();
    }

    /**
     * Set the expiresOn property: The expiration date and time (in UTC ISO 8601 format yyyy-MM-ddTHH:mm:ssZ) of the
     * policy exemption.
     * 
     * @param expiresOn the expiresOn value to set.
     * @return the PolicyExemptionInner object itself.
     */
    public PolicyExemptionInner withExpiresOn(OffsetDateTime expiresOn) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyExemptionProperties();
        }
        this.innerProperties().withExpiresOn(expiresOn);
        return this;
    }

    /**
     * Get the displayName property: The display name of the policy exemption.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The display name of the policy exemption.
     * 
     * @param displayName the displayName value to set.
     * @return the PolicyExemptionInner object itself.
     */
    public PolicyExemptionInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyExemptionProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the description property: The description of the policy exemption.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The description of the policy exemption.
     * 
     * @param description the description value to set.
     * @return the PolicyExemptionInner object itself.
     */
    public PolicyExemptionInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyExemptionProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the metadata property: The policy exemption metadata. Metadata is an open ended object and is typically a
     * collection of key value pairs.
     * 
     * @return the metadata value.
     */
    public Object metadata() {
        return this.innerProperties() == null ? null : this.innerProperties().metadata();
    }

    /**
     * Set the metadata property: The policy exemption metadata. Metadata is an open ended object and is typically a
     * collection of key value pairs.
     * 
     * @param metadata the metadata value to set.
     * @return the PolicyExemptionInner object itself.
     */
    public PolicyExemptionInner withMetadata(Object metadata) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyExemptionProperties();
        }
        this.innerProperties().withMetadata(metadata);
        return this;
    }

    /**
     * Get the resourceSelectors property: The resource selector list to filter policies by resource properties.
     * 
     * @return the resourceSelectors value.
     */
    public List<ResourceSelector> resourceSelectors() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceSelectors();
    }

    /**
     * Set the resourceSelectors property: The resource selector list to filter policies by resource properties.
     * 
     * @param resourceSelectors the resourceSelectors value to set.
     * @return the PolicyExemptionInner object itself.
     */
    public PolicyExemptionInner withResourceSelectors(List<ResourceSelector> resourceSelectors) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyExemptionProperties();
        }
        this.innerProperties().withResourceSelectors(resourceSelectors);
        return this;
    }

    /**
     * Get the assignmentScopeValidation property: The option whether validate the exemption is at or under the
     * assignment scope.
     * 
     * @return the assignmentScopeValidation value.
     */
    public AssignmentScopeValidation assignmentScopeValidation() {
        return this.innerProperties() == null ? null : this.innerProperties().assignmentScopeValidation();
    }

    /**
     * Set the assignmentScopeValidation property: The option whether validate the exemption is at or under the
     * assignment scope.
     * 
     * @param assignmentScopeValidation the assignmentScopeValidation value to set.
     * @return the PolicyExemptionInner object itself.
     */
    public PolicyExemptionInner withAssignmentScopeValidation(AssignmentScopeValidation assignmentScopeValidation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyExemptionProperties();
        }
        this.innerProperties().withAssignmentScopeValidation(assignmentScopeValidation);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model PolicyExemptionInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PolicyExemptionInner.class);

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
     * Reads an instance of PolicyExemptionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PolicyExemptionInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PolicyExemptionInner.
     */
    public static PolicyExemptionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PolicyExemptionInner deserializedPolicyExemptionInner = new PolicyExemptionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedPolicyExemptionInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedPolicyExemptionInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedPolicyExemptionInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedPolicyExemptionInner.innerProperties = PolicyExemptionProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedPolicyExemptionInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPolicyExemptionInner;
        });
    }
}
