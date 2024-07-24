// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computefleet.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Available from Api-Version 2017-03-30 onwards, it represents whether the
 * specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible
 * values are: 'IPv4' and 'IPv6'.
 */
public final class IPVersion extends ExpandableStringEnum<IPVersion> {
    /**
     * Static value IPv4 for IPVersion.
     */
    public static final IPVersion IPV4 = fromString("IPv4");

    /**
     * Static value IPv6 for IPVersion.
     */
    public static final IPVersion IPV6 = fromString("IPv6");

    /**
     * Creates a new instance of IPVersion value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public IPVersion() {
    }

    /**
     * Creates or finds a IPVersion from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding IPVersion.
     */
    public static IPVersion fromString(String name) {
        return fromString(name, IPVersion.class);
    }

    /**
     * Gets known IPVersion values.
     * 
     * @return known IPVersion values.
     */
    public static Collection<IPVersion> values() {
        return values(IPVersion.class);
    }
}
