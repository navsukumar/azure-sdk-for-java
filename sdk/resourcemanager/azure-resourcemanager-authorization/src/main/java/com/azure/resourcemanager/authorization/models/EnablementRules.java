// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The type of enablement rule.
 */
public final class EnablementRules extends ExpandableStringEnum<EnablementRules> {
    /**
     * Static value MultiFactorAuthentication for EnablementRules.
     */
    public static final EnablementRules MULTI_FACTOR_AUTHENTICATION = fromString("MultiFactorAuthentication");

    /**
     * Static value Justification for EnablementRules.
     */
    public static final EnablementRules JUSTIFICATION = fromString("Justification");

    /**
     * Static value Ticketing for EnablementRules.
     */
    public static final EnablementRules TICKETING = fromString("Ticketing");

    /**
     * Creates a new instance of EnablementRules value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EnablementRules() {
    }

    /**
     * Creates or finds a EnablementRules from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding EnablementRules.
     */
    public static EnablementRules fromString(String name) {
        return fromString(name, EnablementRules.class);
    }

    /**
     * Gets known EnablementRules values.
     * 
     * @return known EnablementRules values.
     */
    public static Collection<EnablementRules> values() {
        return values(EnablementRules.class);
    }
}
