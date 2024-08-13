// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * bodyType.
 */
public final class MicrosoftGraphBodyType extends ExpandableStringEnum<MicrosoftGraphBodyType> {
    /**
     * Static value text for MicrosoftGraphBodyType.
     */
    public static final MicrosoftGraphBodyType TEXT = fromString("text");

    /**
     * Static value html for MicrosoftGraphBodyType.
     */
    public static final MicrosoftGraphBodyType HTML = fromString("html");

    /**
     * Creates a new instance of MicrosoftGraphBodyType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MicrosoftGraphBodyType() {
    }

    /**
     * Creates or finds a MicrosoftGraphBodyType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphBodyType.
     */
    public static MicrosoftGraphBodyType fromString(String name) {
        return fromString(name, MicrosoftGraphBodyType.class);
    }

    /**
     * Gets known MicrosoftGraphBodyType values.
     * 
     * @return known MicrosoftGraphBodyType values.
     */
    public static Collection<MicrosoftGraphBodyType> values() {
        return values(MicrosoftGraphBodyType.class);
    }
}
