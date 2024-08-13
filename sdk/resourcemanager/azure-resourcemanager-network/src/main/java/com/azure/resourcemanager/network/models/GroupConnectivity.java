// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Group connectivity type.
 */
public final class GroupConnectivity extends ExpandableStringEnum<GroupConnectivity> {
    /**
     * Static value None for GroupConnectivity.
     */
    public static final GroupConnectivity NONE = fromString("None");

    /**
     * Static value DirectlyConnected for GroupConnectivity.
     */
    public static final GroupConnectivity DIRECTLY_CONNECTED = fromString("DirectlyConnected");

    /**
     * Creates a new instance of GroupConnectivity value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public GroupConnectivity() {
    }

    /**
     * Creates or finds a GroupConnectivity from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding GroupConnectivity.
     */
    public static GroupConnectivity fromString(String name) {
        return fromString(name, GroupConnectivity.class);
    }

    /**
     * Gets known GroupConnectivity values.
     * 
     * @return known GroupConnectivity values.
     */
    public static Collection<GroupConnectivity> values() {
        return values(GroupConnectivity.class);
    }
}
