// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Flag if need to use hub gateway.
 */
public final class UseHubGateway extends ExpandableStringEnum<UseHubGateway> {
    /**
     * Static value False for UseHubGateway.
     */
    public static final UseHubGateway FALSE = fromString("False");

    /**
     * Static value True for UseHubGateway.
     */
    public static final UseHubGateway TRUE = fromString("True");

    /**
     * Creates a new instance of UseHubGateway value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public UseHubGateway() {
    }

    /**
     * Creates or finds a UseHubGateway from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding UseHubGateway.
     */
    public static UseHubGateway fromString(String name) {
        return fromString(name, UseHubGateway.class);
    }

    /**
     * Gets known UseHubGateway values.
     * 
     * @return known UseHubGateway values.
     */
    public static Collection<UseHubGateway> values() {
        return values(UseHubGateway.class);
    }
}
