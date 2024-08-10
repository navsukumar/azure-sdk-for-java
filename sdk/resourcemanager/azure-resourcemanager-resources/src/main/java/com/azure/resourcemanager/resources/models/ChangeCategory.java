// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

/**
 * The entity that made the change.
 */
public enum ChangeCategory {
    /**
     * Enum value User.
     */
    USER("User"),

    /**
     * Enum value System.
     */
    SYSTEM("System");

    /**
     * The actual serialized value for a ChangeCategory instance.
     */
    private final String value;

    ChangeCategory(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ChangeCategory instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed ChangeCategory object, or null if unable to parse.
     */
    public static ChangeCategory fromString(String value) {
        if (value == null) {
            return null;
        }
        ChangeCategory[] items = ChangeCategory.values();
        for (ChangeCategory item : items) {
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
