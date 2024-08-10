// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * sensitivity.
 */
public final class MicrosoftGraphSensitivity extends ExpandableStringEnum<MicrosoftGraphSensitivity> {
    /**
     * Static value normal for MicrosoftGraphSensitivity.
     */
    public static final MicrosoftGraphSensitivity NORMAL = fromString("normal");

    /**
     * Static value personal for MicrosoftGraphSensitivity.
     */
    public static final MicrosoftGraphSensitivity PERSONAL = fromString("personal");

    /**
     * Static value private for MicrosoftGraphSensitivity.
     */
    public static final MicrosoftGraphSensitivity PRIVATE = fromString("private");

    /**
     * Static value confidential for MicrosoftGraphSensitivity.
     */
    public static final MicrosoftGraphSensitivity CONFIDENTIAL = fromString("confidential");

    /**
     * Creates a new instance of MicrosoftGraphSensitivity value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MicrosoftGraphSensitivity() {
    }

    /**
     * Creates or finds a MicrosoftGraphSensitivity from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphSensitivity.
     */
    public static MicrosoftGraphSensitivity fromString(String name) {
        return fromString(name, MicrosoftGraphSensitivity.class);
    }

    /**
     * Gets known MicrosoftGraphSensitivity values.
     * 
     * @return known MicrosoftGraphSensitivity values.
     */
    public static Collection<MicrosoftGraphSensitivity> values() {
        return values(MicrosoftGraphSensitivity.class);
    }
}
