// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * This determines if traffic is allowed over public network. By default it is enabled. If value is SecuredByPerimeter
 * then Inbound and Outbound communication is controlled by the network security perimeter and profile's access rules.
 */
public final class PublicNetworkAccessFlag extends ExpandableStringEnum<PublicNetworkAccessFlag> {
    /**
     * Static value Enabled for PublicNetworkAccessFlag.
     */
    public static final PublicNetworkAccessFlag ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for PublicNetworkAccessFlag.
     */
    public static final PublicNetworkAccessFlag DISABLED = fromString("Disabled");

    /**
     * Static value SecuredByPerimeter for PublicNetworkAccessFlag.
     */
    public static final PublicNetworkAccessFlag SECURED_BY_PERIMETER = fromString("SecuredByPerimeter");

    /**
     * Creates a new instance of PublicNetworkAccessFlag value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PublicNetworkAccessFlag() {
    }

    /**
     * Creates or finds a PublicNetworkAccessFlag from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PublicNetworkAccessFlag.
     */
    public static PublicNetworkAccessFlag fromString(String name) {
        return fromString(name, PublicNetworkAccessFlag.class);
    }

    /**
     * Gets known PublicNetworkAccessFlag values.
     * 
     * @return known PublicNetworkAccessFlag values.
     */
    public static Collection<PublicNetworkAccessFlag> values() {
        return values(PublicNetworkAccessFlag.class);
    }
}
