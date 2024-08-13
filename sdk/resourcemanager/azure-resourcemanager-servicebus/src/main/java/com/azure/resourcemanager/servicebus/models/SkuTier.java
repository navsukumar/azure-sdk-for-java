// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.models;

/**
 * The billing tier of this particular SKU.
 */
public enum SkuTier {
    /**
     * Enum value Basic.
     */
    BASIC("Basic"),

    /**
     * Enum value Standard.
     */
    STANDARD("Standard"),

    /**
     * Enum value Premium.
     */
    PREMIUM("Premium");

    /**
     * The actual serialized value for a SkuTier instance.
     */
    private final String value;

    SkuTier(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SkuTier instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed SkuTier object, or null if unable to parse.
     */
    public static SkuTier fromString(String value) {
        if (value == null) {
            return null;
        }
        SkuTier[] items = SkuTier.values();
        for (SkuTier item : items) {
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
