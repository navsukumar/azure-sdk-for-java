// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.eventhubs.models.ProvisioningStateDR;
import com.azure.resourcemanager.eventhubs.models.RoleDisasterRecovery;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Single item in List or Get Alias(Disaster Recovery configuration) operation.
 */
@Fluent
public final class ArmDisasterRecoveryInner extends ProxyResource {
    /*
     * Properties required to the Create Or Update Alias(Disaster Recovery configurations)
     */
    @JsonProperty(value = "properties")
    private ArmDisasterRecoveryProperties innerProperties;

    /*
     * The system meta data relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The geo-location where the resource lives
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * Creates an instance of ArmDisasterRecoveryInner class.
     */
    public ArmDisasterRecoveryInner() {
    }

    /**
     * Get the innerProperties property: Properties required to the Create Or Update Alias(Disaster Recovery
     * configurations).
     * 
     * @return the innerProperties value.
     */
    private ArmDisasterRecoveryProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system meta data relating to this resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the provisioningState property: Provisioning state of the Alias(Disaster Recovery configuration) - possible
     * values 'Accepted' or 'Succeeded' or 'Failed'.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningStateDR provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the partnerNamespace property: ARM Id of the Primary/Secondary eventhub namespace name, which is part of GEO
     * DR pairing.
     * 
     * @return the partnerNamespace value.
     */
    public String partnerNamespace() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerNamespace();
    }

    /**
     * Set the partnerNamespace property: ARM Id of the Primary/Secondary eventhub namespace name, which is part of GEO
     * DR pairing.
     * 
     * @param partnerNamespace the partnerNamespace value to set.
     * @return the ArmDisasterRecoveryInner object itself.
     */
    public ArmDisasterRecoveryInner withPartnerNamespace(String partnerNamespace) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ArmDisasterRecoveryProperties();
        }
        this.innerProperties().withPartnerNamespace(partnerNamespace);
        return this;
    }

    /**
     * Get the alternateName property: Alternate name specified when alias and namespace names are same.
     * 
     * @return the alternateName value.
     */
    public String alternateName() {
        return this.innerProperties() == null ? null : this.innerProperties().alternateName();
    }

    /**
     * Set the alternateName property: Alternate name specified when alias and namespace names are same.
     * 
     * @param alternateName the alternateName value to set.
     * @return the ArmDisasterRecoveryInner object itself.
     */
    public ArmDisasterRecoveryInner withAlternateName(String alternateName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ArmDisasterRecoveryProperties();
        }
        this.innerProperties().withAlternateName(alternateName);
        return this;
    }

    /**
     * Get the role property: role of namespace in GEO DR - possible values 'Primary' or 'PrimaryNotReplicating' or
     * 'Secondary'.
     * 
     * @return the role value.
     */
    public RoleDisasterRecovery role() {
        return this.innerProperties() == null ? null : this.innerProperties().role();
    }

    /**
     * Get the pendingReplicationOperationsCount property: Number of entities pending to be replicated.
     * 
     * @return the pendingReplicationOperationsCount value.
     */
    public Long pendingReplicationOperationsCount() {
        return this.innerProperties() == null ? null : this.innerProperties().pendingReplicationOperationsCount();
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
}
