// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

/**
 * Predefined action to be taken.
 */
public enum AutoHealActionType {
    /**
     * Enum value Recycle.
     */
    RECYCLE("Recycle"),

    /**
     * Enum value LogEvent.
     */
    LOG_EVENT("LogEvent"),

    /**
     * Enum value CustomAction.
     */
    CUSTOM_ACTION("CustomAction");

    /**
     * The actual serialized value for a AutoHealActionType instance.
     */
    private final String value;

    AutoHealActionType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AutoHealActionType instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed AutoHealActionType object, or null if unable to parse.
     */
    public static AutoHealActionType fromString(String value) {
        if (value == null) {
            return null;
        }
        AutoHealActionType[] items = AutoHealActionType.values();
        for (AutoHealActionType item : items) {
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
