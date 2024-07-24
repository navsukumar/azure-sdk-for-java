// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for MetricAggregationType.
 */
public final class MetricAggregationType extends ExpandableStringEnum<MetricAggregationType> {
    /**
     * Static value Average for MetricAggregationType.
     */
    public static final MetricAggregationType AVERAGE = fromString("Average");

    /**
     * Creates a new instance of MetricAggregationType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MetricAggregationType() {
    }

    /**
     * Creates or finds a MetricAggregationType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding MetricAggregationType.
     */
    public static MetricAggregationType fromString(String name) {
        return fromString(name, MetricAggregationType.class);
    }

    /**
     * Gets known MetricAggregationType values.
     * 
     * @return known MetricAggregationType values.
     */
    public static Collection<MetricAggregationType> values() {
        return values(MetricAggregationType.class);
    }
}
