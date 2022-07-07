// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for IdentityType. */
public final class IdentityType extends ExpandableStringEnum<IdentityType> {
    /** Static value user for IdentityType. */
    public static final IdentityType USER = fromString("user");

    /** Static value application for IdentityType. */
    public static final IdentityType APPLICATION = fromString("application");

    /** Static value managedIdentity for IdentityType. */
    public static final IdentityType MANAGED_IDENTITY = fromString("managedIdentity");

    /** Static value key for IdentityType. */
    public static final IdentityType KEY = fromString("key");

    /** Static value SystemAssigned for IdentityType. */
    public static final IdentityType SYSTEM_ASSIGNED = fromString("SystemAssigned");

    /** Static value UserAssigned for IdentityType. */
    public static final IdentityType USER_ASSIGNED = fromString("UserAssigned");

    /** Static value None for IdentityType. */
    public static final IdentityType NONE = fromString("None");

    /**
     * Creates or finds a IdentityType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IdentityType.
     */
    @JsonCreator
    public static IdentityType fromString(String name) {
        return fromString(name, IdentityType.class);
    }

    /**
     * Gets known IdentityType values.
     *
     * @return known IdentityType values.
     */
    public static Collection<IdentityType> values() {
        return values(IdentityType.class);
    }
}
