// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Type of connection monitor.
 */
public final class ConnectionMonitorType extends ExpandableStringEnum<ConnectionMonitorType> {
    /**
     * Static value MultiEndpoint for ConnectionMonitorType.
     */
    public static final ConnectionMonitorType MULTI_ENDPOINT = fromString("MultiEndpoint");

    /**
     * Static value SingleSourceDestination for ConnectionMonitorType.
     */
    public static final ConnectionMonitorType SINGLE_SOURCE_DESTINATION = fromString("SingleSourceDestination");

    /**
     * Creates a new instance of ConnectionMonitorType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ConnectionMonitorType() {
    }

    /**
     * Creates or finds a ConnectionMonitorType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ConnectionMonitorType.
     */
    public static ConnectionMonitorType fromString(String name) {
        return fromString(name, ConnectionMonitorType.class);
    }

    /**
     * Gets known ConnectionMonitorType values.
     * 
     * @return known ConnectionMonitorType values.
     */
    public static Collection<ConnectionMonitorType> values() {
        return values(ConnectionMonitorType.class);
    }
}
