// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.models;

/**
 * Applicable only for the standard3 SKU. You can set this property to enable up to 3 high density partitions that allow
 * up to 1000 indexes, which is much higher than the maximum indexes allowed for any other SKU. For the standard3 SKU,
 * the value is either 'default' or 'highDensity'. For all other SKUs, this value must be 'default'.
 */
public enum HostingMode {
    /**
     * Enum value default.
     */
    DEFAULT("default"),

    /**
     * Enum value highDensity.
     */
    HIGH_DENSITY("highDensity");

    /**
     * The actual serialized value for a HostingMode instance.
     */
    private final String value;

    HostingMode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a HostingMode instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed HostingMode object, or null if unable to parse.
     */
    public static HostingMode fromString(String value) {
        if (value == null) {
            return null;
        }
        HostingMode[] items = HostingMode.values();
        for (HostingMode item : items) {
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
