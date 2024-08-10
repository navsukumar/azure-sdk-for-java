// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Specifies the way the operation will be performed.
 */
public final class UpdateType extends ExpandableStringEnum<UpdateType> {
    /**
     * Static value Default for UpdateType.
     */
    public static final UpdateType DEFAULT = fromString("Default");

    /**
     * Static value ByUpgradeDomain for UpdateType.
     */
    public static final UpdateType BY_UPGRADE_DOMAIN = fromString("ByUpgradeDomain");

    /**
     * Creates a new instance of UpdateType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public UpdateType() {
    }

    /**
     * Creates or finds a UpdateType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding UpdateType.
     */
    public static UpdateType fromString(String name) {
        return fromString(name, UpdateType.class);
    }

    /**
     * Gets known UpdateType values.
     * 
     * @return known UpdateType values.
     */
    public static Collection<UpdateType> values() {
        return values(UpdateType.class);
    }
}
