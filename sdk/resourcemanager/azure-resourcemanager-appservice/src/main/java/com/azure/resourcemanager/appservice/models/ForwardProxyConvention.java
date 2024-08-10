// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

/**
 * The convention used to determine the url of the request made.
 */
public enum ForwardProxyConvention {
    /**
     * Enum value NoProxy.
     */
    NO_PROXY("NoProxy"),

    /**
     * Enum value Standard.
     */
    STANDARD("Standard"),

    /**
     * Enum value Custom.
     */
    CUSTOM("Custom");

    /**
     * The actual serialized value for a ForwardProxyConvention instance.
     */
    private final String value;

    ForwardProxyConvention(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ForwardProxyConvention instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed ForwardProxyConvention object, or null if unable to parse.
     */
    public static ForwardProxyConvention fromString(String value) {
        if (value == null) {
            return null;
        }
        ForwardProxyConvention[] items = ForwardProxyConvention.values();
        for (ForwardProxyConvention item : items) {
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
