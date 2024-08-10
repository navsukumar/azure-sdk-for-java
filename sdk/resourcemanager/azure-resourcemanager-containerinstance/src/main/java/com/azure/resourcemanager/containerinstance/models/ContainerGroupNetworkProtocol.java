// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The protocol associated with the port.
 */
public final class ContainerGroupNetworkProtocol extends ExpandableStringEnum<ContainerGroupNetworkProtocol> {
    /**
     * Static value TCP for ContainerGroupNetworkProtocol.
     */
    public static final ContainerGroupNetworkProtocol TCP = fromString("TCP");

    /**
     * Static value UDP for ContainerGroupNetworkProtocol.
     */
    public static final ContainerGroupNetworkProtocol UDP = fromString("UDP");

    /**
     * Creates a new instance of ContainerGroupNetworkProtocol value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ContainerGroupNetworkProtocol() {
    }

    /**
     * Creates or finds a ContainerGroupNetworkProtocol from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ContainerGroupNetworkProtocol.
     */
    public static ContainerGroupNetworkProtocol fromString(String name) {
        return fromString(name, ContainerGroupNetworkProtocol.class);
    }

    /**
     * Gets known ContainerGroupNetworkProtocol values.
     * 
     * @return known ContainerGroupNetworkProtocol values.
     */
    public static Collection<ContainerGroupNetworkProtocol> values() {
        return values(ContainerGroupNetworkProtocol.class);
    }
}
