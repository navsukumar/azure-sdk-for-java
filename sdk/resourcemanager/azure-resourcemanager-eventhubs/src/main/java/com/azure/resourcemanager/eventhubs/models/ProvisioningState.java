// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Provisioning state of the Cluster.
 */
public final class ProvisioningState extends ExpandableStringEnum<ProvisioningState> {
    /**
     * Static value Unknown for ProvisioningState.
     */
    public static final ProvisioningState UNKNOWN = fromString("Unknown");

    /**
     * Static value Creating for ProvisioningState.
     */
    public static final ProvisioningState CREATING = fromString("Creating");

    /**
     * Static value Deleting for ProvisioningState.
     */
    public static final ProvisioningState DELETING = fromString("Deleting");

    /**
     * Static value Scaling for ProvisioningState.
     */
    public static final ProvisioningState SCALING = fromString("Scaling");

    /**
     * Static value Active for ProvisioningState.
     */
    public static final ProvisioningState ACTIVE = fromString("Active");

    /**
     * Static value Failed for ProvisioningState.
     */
    public static final ProvisioningState FAILED = fromString("Failed");

    /**
     * Static value Succeeded for ProvisioningState.
     */
    public static final ProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Canceled for ProvisioningState.
     */
    public static final ProvisioningState CANCELED = fromString("Canceled");

    /**
     * Creates a new instance of ProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ProvisioningState() {
    }

    /**
     * Creates or finds a ProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ProvisioningState.
     */
    public static ProvisioningState fromString(String name) {
        return fromString(name, ProvisioningState.class);
    }

    /**
     * Gets known ProvisioningState values.
     * 
     * @return known ProvisioningState values.
     */
    public static Collection<ProvisioningState> values() {
        return values(ProvisioningState.class);
    }
}
