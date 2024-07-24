// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The current provisioning state.
 */
public final class PrivateEndpointConnectionProvisioningState
    extends ExpandableStringEnum<PrivateEndpointConnectionProvisioningState> {
    /**
     * Static value Succeeded for PrivateEndpointConnectionProvisioningState.
     */
    public static final PrivateEndpointConnectionProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for PrivateEndpointConnectionProvisioningState.
     */
    public static final PrivateEndpointConnectionProvisioningState FAILED = fromString("Failed");

    /**
     * Static value Canceled for PrivateEndpointConnectionProvisioningState.
     */
    public static final PrivateEndpointConnectionProvisioningState CANCELED = fromString("Canceled");

    /**
     * Static value Waiting for PrivateEndpointConnectionProvisioningState.
     */
    public static final PrivateEndpointConnectionProvisioningState WAITING = fromString("Waiting");

    /**
     * Static value Updating for PrivateEndpointConnectionProvisioningState.
     */
    public static final PrivateEndpointConnectionProvisioningState UPDATING = fromString("Updating");

    /**
     * Static value Deleting for PrivateEndpointConnectionProvisioningState.
     */
    public static final PrivateEndpointConnectionProvisioningState DELETING = fromString("Deleting");

    /**
     * Static value Pending for PrivateEndpointConnectionProvisioningState.
     */
    public static final PrivateEndpointConnectionProvisioningState PENDING = fromString("Pending");

    /**
     * Creates a new instance of PrivateEndpointConnectionProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PrivateEndpointConnectionProvisioningState() {
    }

    /**
     * Creates or finds a PrivateEndpointConnectionProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PrivateEndpointConnectionProvisioningState.
     */
    public static PrivateEndpointConnectionProvisioningState fromString(String name) {
        return fromString(name, PrivateEndpointConnectionProvisioningState.class);
    }

    /**
     * Gets known PrivateEndpointConnectionProvisioningState values.
     * 
     * @return known PrivateEndpointConnectionProvisioningState values.
     */
    public static Collection<PrivateEndpointConnectionProvisioningState> values() {
        return values(PrivateEndpointConnectionProvisioningState.class);
    }
}
