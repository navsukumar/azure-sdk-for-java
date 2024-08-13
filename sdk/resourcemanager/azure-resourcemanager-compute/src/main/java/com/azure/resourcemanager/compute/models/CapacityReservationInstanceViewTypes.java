// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for CapacityReservationInstanceViewTypes.
 */
public final class CapacityReservationInstanceViewTypes
    extends ExpandableStringEnum<CapacityReservationInstanceViewTypes> {
    /**
     * Static value instanceView for CapacityReservationInstanceViewTypes.
     */
    public static final CapacityReservationInstanceViewTypes INSTANCE_VIEW = fromString("instanceView");

    /**
     * Creates a new instance of CapacityReservationInstanceViewTypes value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CapacityReservationInstanceViewTypes() {
    }

    /**
     * Creates or finds a CapacityReservationInstanceViewTypes from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CapacityReservationInstanceViewTypes.
     */
    public static CapacityReservationInstanceViewTypes fromString(String name) {
        return fromString(name, CapacityReservationInstanceViewTypes.class);
    }

    /**
     * Gets known CapacityReservationInstanceViewTypes values.
     * 
     * @return known CapacityReservationInstanceViewTypes values.
     */
    public static Collection<CapacityReservationInstanceViewTypes> values() {
        return values(CapacityReservationInstanceViewTypes.class);
    }
}
