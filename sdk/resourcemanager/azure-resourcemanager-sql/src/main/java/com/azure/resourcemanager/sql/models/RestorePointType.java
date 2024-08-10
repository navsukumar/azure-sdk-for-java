// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

/**
 * The type of restore point.
 */
public enum RestorePointType {
    /**
     * Enum value CONTINUOUS.
     */
    CONTINUOUS("CONTINUOUS"),

    /**
     * Enum value DISCRETE.
     */
    DISCRETE("DISCRETE");

    /**
     * The actual serialized value for a RestorePointType instance.
     */
    private final String value;

    RestorePointType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RestorePointType instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed RestorePointType object, or null if unable to parse.
     */
    public static RestorePointType fromString(String value) {
        if (value == null) {
            return null;
        }
        RestorePointType[] items = RestorePointType.values();
        for (RestorePointType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
