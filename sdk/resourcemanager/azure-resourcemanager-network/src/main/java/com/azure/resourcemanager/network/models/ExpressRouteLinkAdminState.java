// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Administrative state of the physical port.
 */
public final class ExpressRouteLinkAdminState extends ExpandableStringEnum<ExpressRouteLinkAdminState> {
    /**
     * Static value Enabled for ExpressRouteLinkAdminState.
     */
    public static final ExpressRouteLinkAdminState ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for ExpressRouteLinkAdminState.
     */
    public static final ExpressRouteLinkAdminState DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of ExpressRouteLinkAdminState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ExpressRouteLinkAdminState() {
    }

    /**
     * Creates or finds a ExpressRouteLinkAdminState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ExpressRouteLinkAdminState.
     */
    public static ExpressRouteLinkAdminState fromString(String name) {
        return fromString(name, ExpressRouteLinkAdminState.class);
    }

    /**
     * Gets known ExpressRouteLinkAdminState values.
     * 
     * @return known ExpressRouteLinkAdminState values.
     */
    public static Collection<ExpressRouteLinkAdminState> values() {
        return values(ExpressRouteLinkAdminState.class);
    }
}
