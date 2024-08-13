// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Type of the customized accelerator.
 */
public final class CustomizedAcceleratorType extends ExpandableStringEnum<CustomizedAcceleratorType> {
    /**
     * Static value Accelerator for CustomizedAcceleratorType.
     */
    public static final CustomizedAcceleratorType ACCELERATOR = fromString("Accelerator");

    /**
     * Static value Fragment for CustomizedAcceleratorType.
     */
    public static final CustomizedAcceleratorType FRAGMENT = fromString("Fragment");

    /**
     * Creates a new instance of CustomizedAcceleratorType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CustomizedAcceleratorType() {
    }

    /**
     * Creates or finds a CustomizedAcceleratorType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CustomizedAcceleratorType.
     */
    public static CustomizedAcceleratorType fromString(String name) {
        return fromString(name, CustomizedAcceleratorType.class);
    }

    /**
     * Gets known CustomizedAcceleratorType values.
     * 
     * @return known CustomizedAcceleratorType values.
     */
    public static Collection<CustomizedAcceleratorType> values() {
        return values(CustomizedAcceleratorType.class);
    }
}
