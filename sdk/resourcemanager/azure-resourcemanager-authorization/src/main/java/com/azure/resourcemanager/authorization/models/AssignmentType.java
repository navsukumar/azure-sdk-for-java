// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Assignment type of the role assignment schedule.
 */
public final class AssignmentType extends ExpandableStringEnum<AssignmentType> {
    /**
     * Static value Activated for AssignmentType.
     */
    public static final AssignmentType ACTIVATED = fromString("Activated");

    /**
     * Static value Assigned for AssignmentType.
     */
    public static final AssignmentType ASSIGNED = fromString("Assigned");

    /**
     * Creates a new instance of AssignmentType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AssignmentType() {
    }

    /**
     * Creates or finds a AssignmentType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AssignmentType.
     */
    public static AssignmentType fromString(String name) {
        return fromString(name, AssignmentType.class);
    }

    /**
     * Gets known AssignmentType values.
     * 
     * @return known AssignmentType values.
     */
    public static Collection<AssignmentType> values() {
        return values(AssignmentType.class);
    }
}
