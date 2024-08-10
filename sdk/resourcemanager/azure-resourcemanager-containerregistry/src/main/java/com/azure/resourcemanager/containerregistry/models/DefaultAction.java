// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The default action of allow or deny when no other rules match.
 */
public final class DefaultAction extends ExpandableStringEnum<DefaultAction> {
    /**
     * Static value Allow for DefaultAction.
     */
    public static final DefaultAction ALLOW = fromString("Allow");

    /**
     * Static value Deny for DefaultAction.
     */
    public static final DefaultAction DENY = fromString("Deny");

    /**
     * Creates a new instance of DefaultAction value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DefaultAction() {
    }

    /**
     * Creates or finds a DefaultAction from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DefaultAction.
     */
    public static DefaultAction fromString(String name) {
        return fromString(name, DefaultAction.class);
    }

    /**
     * Gets known DefaultAction values.
     * 
     * @return known DefaultAction values.
     */
    public static Collection<DefaultAction> values() {
        return values(DefaultAction.class);
    }
}
