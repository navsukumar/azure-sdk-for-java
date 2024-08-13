// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Specify the public IP allocation type.
 */
public final class PublicIpAllocationMethod extends ExpandableStringEnum<PublicIpAllocationMethod> {
    /**
     * Static value Dynamic for PublicIpAllocationMethod.
     */
    public static final PublicIpAllocationMethod DYNAMIC = fromString("Dynamic");

    /**
     * Static value Static for PublicIpAllocationMethod.
     */
    public static final PublicIpAllocationMethod STATIC = fromString("Static");

    /**
     * Creates a new instance of PublicIpAllocationMethod value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PublicIpAllocationMethod() {
    }

    /**
     * Creates or finds a PublicIpAllocationMethod from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PublicIpAllocationMethod.
     */
    public static PublicIpAllocationMethod fromString(String name) {
        return fromString(name, PublicIpAllocationMethod.class);
    }

    /**
     * Gets known PublicIpAllocationMethod values.
     * 
     * @return known PublicIpAllocationMethod values.
     */
    public static Collection<PublicIpAllocationMethod> values() {
        return values(PublicIpAllocationMethod.class);
    }
}
