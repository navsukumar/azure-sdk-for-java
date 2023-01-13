// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** The Relationship Cardinality. */
public enum CardinalityTypes {
    /** Enum value OneToOne. */
    ONE_TO_ONE("OneToOne"),

    /** Enum value OneToMany. */
    ONE_TO_MANY("OneToMany"),

    /** Enum value ManyToMany. */
    MANY_TO_MANY("ManyToMany");

    /** The actual serialized value for a CardinalityTypes instance. */
    private final String value;

    CardinalityTypes(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CardinalityTypes instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed CardinalityTypes object, or null if unable to parse.
     */
    @JsonCreator
    public static CardinalityTypes fromString(String value) {
        if (value == null) {
            return null;
        }
        CardinalityTypes[] items = CardinalityTypes.values();
        for (CardinalityTypes item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
