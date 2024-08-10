// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Enumerates the ways that a service can be partitioned.
 */
public final class ServiceScalingTriggerKind extends ExpandableStringEnum<ServiceScalingTriggerKind> {
    /**
     * Static value AveragePartitionLoadTrigger for ServiceScalingTriggerKind.
     */
    public static final ServiceScalingTriggerKind AVERAGE_PARTITION_LOAD_TRIGGER
        = fromString("AveragePartitionLoadTrigger");

    /**
     * Static value AverageServiceLoadTrigger for ServiceScalingTriggerKind.
     */
    public static final ServiceScalingTriggerKind AVERAGE_SERVICE_LOAD_TRIGGER
        = fromString("AverageServiceLoadTrigger");

    /**
     * Creates a new instance of ServiceScalingTriggerKind value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ServiceScalingTriggerKind() {
    }

    /**
     * Creates or finds a ServiceScalingTriggerKind from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ServiceScalingTriggerKind.
     */
    public static ServiceScalingTriggerKind fromString(String name) {
        return fromString(name, ServiceScalingTriggerKind.class);
    }

    /**
     * Gets known ServiceScalingTriggerKind values.
     * 
     * @return known ServiceScalingTriggerKind values.
     */
    public static Collection<ServiceScalingTriggerKind> values() {
        return values(ServiceScalingTriggerKind.class);
    }
}
