// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * MinTlsVersion: configures the minimum version of TLS required for SSL requests.
 */
public final class SupportedTlsVersions extends ExpandableStringEnum<SupportedTlsVersions> {
    /**
     * Static value 1.0 for SupportedTlsVersions.
     */
    public static final SupportedTlsVersions ONE_ZERO = fromString("1.0");

    /**
     * Static value 1.1 for SupportedTlsVersions.
     */
    public static final SupportedTlsVersions ONE_ONE = fromString("1.1");

    /**
     * Static value 1.2 for SupportedTlsVersions.
     */
    public static final SupportedTlsVersions ONE_TWO = fromString("1.2");

    /**
     * Static value 1.3 for SupportedTlsVersions.
     */
    public static final SupportedTlsVersions ONE_THREE = fromString("1.3");

    /**
     * Creates a new instance of SupportedTlsVersions value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SupportedTlsVersions() {
    }

    /**
     * Creates or finds a SupportedTlsVersions from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SupportedTlsVersions.
     */
    public static SupportedTlsVersions fromString(String name) {
        return fromString(name, SupportedTlsVersions.class);
    }

    /**
     * Gets known SupportedTlsVersions values.
     * 
     * @return known SupportedTlsVersions values.
     */
    public static Collection<SupportedTlsVersions> values() {
        return values(SupportedTlsVersions.class);
    }
}
