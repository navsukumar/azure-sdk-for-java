// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The hub routing preference gateway types.
 */
public final class HubRoutingPreference extends ExpandableStringEnum<HubRoutingPreference> {
    /**
     * Static value ExpressRoute for HubRoutingPreference.
     */
    public static final HubRoutingPreference EXPRESS_ROUTE = fromString("ExpressRoute");

    /**
     * Static value VpnGateway for HubRoutingPreference.
     */
    public static final HubRoutingPreference VPN_GATEWAY = fromString("VpnGateway");

    /**
     * Static value ASPath for HubRoutingPreference.
     */
    public static final HubRoutingPreference ASPATH = fromString("ASPath");

    /**
     * Creates a new instance of HubRoutingPreference value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public HubRoutingPreference() {
    }

    /**
     * Creates or finds a HubRoutingPreference from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding HubRoutingPreference.
     */
    public static HubRoutingPreference fromString(String name) {
        return fromString(name, HubRoutingPreference.class);
    }

    /**
     * Gets known HubRoutingPreference values.
     * 
     * @return known HubRoutingPreference values.
     */
    public static Collection<HubRoutingPreference> values() {
        return values(HubRoutingPreference.class);
    }
}
