// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Type. */
public final class Type extends ExpandableStringEnum<Type> {
    /** Static value StorageAccount for Type. */
    public static final Type STORAGE_ACCOUNT = fromString("StorageAccount");

    /** Static value EventHub for Type. */
    public static final Type EVENT_HUB = fromString("EventHub");

    /**
     * Creates or finds a Type from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Type.
     */
    @JsonCreator
    public static Type fromString(String name) {
        return fromString(name, Type.class);
    }

    /**
     * Gets known Type values.
     *
     * @return known Type values.
     */
    public static Collection<Type> values() {
        return values(Type.class);
    }
}
