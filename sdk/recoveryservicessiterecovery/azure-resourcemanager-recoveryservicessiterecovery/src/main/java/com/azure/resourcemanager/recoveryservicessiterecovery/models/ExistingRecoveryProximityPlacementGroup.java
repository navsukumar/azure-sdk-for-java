// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Existing recovery proximity placement group input. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resourceType")
@JsonTypeName("Existing")
@Fluent
public final class ExistingRecoveryProximityPlacementGroup extends RecoveryProximityPlacementGroupCustomDetails {
    /*
     * The recovery proximity placement group Id. Will throw error, if resource does not exist.
     */
    @JsonProperty(value = "recoveryProximityPlacementGroupId")
    private String recoveryProximityPlacementGroupId;

    /** Creates an instance of ExistingRecoveryProximityPlacementGroup class. */
    public ExistingRecoveryProximityPlacementGroup() {
    }

    /**
     * Get the recoveryProximityPlacementGroupId property: The recovery proximity placement group Id. Will throw error,
     * if resource does not exist.
     *
     * @return the recoveryProximityPlacementGroupId value.
     */
    public String recoveryProximityPlacementGroupId() {
        return this.recoveryProximityPlacementGroupId;
    }

    /**
     * Set the recoveryProximityPlacementGroupId property: The recovery proximity placement group Id. Will throw error,
     * if resource does not exist.
     *
     * @param recoveryProximityPlacementGroupId the recoveryProximityPlacementGroupId value to set.
     * @return the ExistingRecoveryProximityPlacementGroup object itself.
     */
    public ExistingRecoveryProximityPlacementGroup withRecoveryProximityPlacementGroupId(
        String recoveryProximityPlacementGroupId) {
        this.recoveryProximityPlacementGroupId = recoveryProximityPlacementGroupId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}