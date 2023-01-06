// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** InMageAzureV2 switch provider details. */
@Immutable
public final class InMageAzureV2SwitchProviderDetails {
    /*
     * The target vault Id.
     */
    @JsonProperty(value = "targetVaultId", access = JsonProperty.Access.WRITE_ONLY)
    private String targetVaultId;

    /*
     * The target resource Id.
     */
    @JsonProperty(value = "targetResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String targetResourceId;

    /*
     * The target fabric Id.
     */
    @JsonProperty(value = "targetFabricId", access = JsonProperty.Access.WRITE_ONLY)
    private String targetFabricId;

    /*
     * The target appliance Id.
     */
    @JsonProperty(value = "targetApplianceId", access = JsonProperty.Access.WRITE_ONLY)
    private String targetApplianceId;

    /** Creates an instance of InMageAzureV2SwitchProviderDetails class. */
    public InMageAzureV2SwitchProviderDetails() {
    }

    /**
     * Get the targetVaultId property: The target vault Id.
     *
     * @return the targetVaultId value.
     */
    public String targetVaultId() {
        return this.targetVaultId;
    }

    /**
     * Get the targetResourceId property: The target resource Id.
     *
     * @return the targetResourceId value.
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Get the targetFabricId property: The target fabric Id.
     *
     * @return the targetFabricId value.
     */
    public String targetFabricId() {
        return this.targetFabricId;
    }

    /**
     * Get the targetApplianceId property: The target appliance Id.
     *
     * @return the targetApplianceId value.
     */
    public String targetApplianceId() {
        return this.targetApplianceId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}