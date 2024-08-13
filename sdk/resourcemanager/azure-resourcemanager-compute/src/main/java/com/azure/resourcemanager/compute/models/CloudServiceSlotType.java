// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Slot type for the cloud service.
 * Possible values are &lt;br /&gt;&lt;br /&gt;**Production**&lt;br /&gt;&lt;br /&gt;**Staging**&lt;br /&gt;&lt;br /&gt;
 * If not specified, the default value is Production.
 */
public final class CloudServiceSlotType extends ExpandableStringEnum<CloudServiceSlotType> {
    /**
     * Static value Production for CloudServiceSlotType.
     */
    public static final CloudServiceSlotType PRODUCTION = fromString("Production");

    /**
     * Static value Staging for CloudServiceSlotType.
     */
    public static final CloudServiceSlotType STAGING = fromString("Staging");

    /**
     * Creates a new instance of CloudServiceSlotType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CloudServiceSlotType() {
    }

    /**
     * Creates or finds a CloudServiceSlotType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CloudServiceSlotType.
     */
    public static CloudServiceSlotType fromString(String name) {
        return fromString(name, CloudServiceSlotType.class);
    }

    /**
     * Gets known CloudServiceSlotType values.
     * 
     * @return known CloudServiceSlotType values.
     */
    public static Collection<CloudServiceSlotType> values() {
        return values(CloudServiceSlotType.class);
    }
}
