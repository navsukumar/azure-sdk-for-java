// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

/**
 * Gets or sets the workflow health state.
 */
public enum WorkflowHealthState {
    /**
     * Enum value NotSpecified.
     */
    NOT_SPECIFIED("NotSpecified"),

    /**
     * Enum value Healthy.
     */
    HEALTHY("Healthy"),

    /**
     * Enum value Unhealthy.
     */
    UNHEALTHY("Unhealthy"),

    /**
     * Enum value Unknown.
     */
    UNKNOWN("Unknown");

    /**
     * The actual serialized value for a WorkflowHealthState instance.
     */
    private final String value;

    WorkflowHealthState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a WorkflowHealthState instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed WorkflowHealthState object, or null if unable to parse.
     */
    public static WorkflowHealthState fromString(String value) {
        if (value == null) {
            return null;
        }
        WorkflowHealthState[] items = WorkflowHealthState.values();
        for (WorkflowHealthState item : items) {
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
