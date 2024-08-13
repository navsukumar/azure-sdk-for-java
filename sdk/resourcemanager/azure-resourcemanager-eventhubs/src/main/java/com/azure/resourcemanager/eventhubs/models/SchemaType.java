// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for SchemaType.
 */
public final class SchemaType extends ExpandableStringEnum<SchemaType> {
    /**
     * Static value Unknown for SchemaType.
     */
    public static final SchemaType UNKNOWN = fromString("Unknown");

    /**
     * Static value Avro for SchemaType.
     */
    public static final SchemaType AVRO = fromString("Avro");

    /**
     * Creates a new instance of SchemaType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SchemaType() {
    }

    /**
     * Creates or finds a SchemaType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SchemaType.
     */
    public static SchemaType fromString(String name) {
        return fromString(name, SchemaType.class);
    }

    /**
     * Gets known SchemaType values.
     * 
     * @return known SchemaType values.
     */
    public static Collection<SchemaType> values() {
        return values(SchemaType.class);
    }
}
