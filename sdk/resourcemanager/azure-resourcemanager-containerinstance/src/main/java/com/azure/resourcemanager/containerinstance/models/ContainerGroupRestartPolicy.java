// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Restart policy for all containers within the container group.
 * - `Always` Always restart
 * - `OnFailure` Restart on failure
 * - `Never` Never restart.
 */
public final class ContainerGroupRestartPolicy extends ExpandableStringEnum<ContainerGroupRestartPolicy> {
    /**
     * Static value Always for ContainerGroupRestartPolicy.
     */
    public static final ContainerGroupRestartPolicy ALWAYS = fromString("Always");

    /**
     * Static value OnFailure for ContainerGroupRestartPolicy.
     */
    public static final ContainerGroupRestartPolicy ON_FAILURE = fromString("OnFailure");

    /**
     * Static value Never for ContainerGroupRestartPolicy.
     */
    public static final ContainerGroupRestartPolicy NEVER = fromString("Never");

    /**
     * Creates a new instance of ContainerGroupRestartPolicy value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ContainerGroupRestartPolicy() {
    }

    /**
     * Creates or finds a ContainerGroupRestartPolicy from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ContainerGroupRestartPolicy.
     */
    public static ContainerGroupRestartPolicy fromString(String name) {
        return fromString(name, ContainerGroupRestartPolicy.class);
    }

    /**
     * Gets known ContainerGroupRestartPolicy values.
     * 
     * @return known ContainerGroupRestartPolicy values.
     */
    public static Collection<ContainerGroupRestartPolicy> values() {
        return values(ContainerGroupRestartPolicy.class);
    }
}
