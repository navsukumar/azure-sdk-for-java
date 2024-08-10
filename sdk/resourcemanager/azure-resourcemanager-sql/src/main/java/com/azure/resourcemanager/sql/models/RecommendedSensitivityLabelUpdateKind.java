// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

/**
 * Defines values for RecommendedSensitivityLabelUpdateKind.
 */
public enum RecommendedSensitivityLabelUpdateKind {
    /**
     * Enum value enable.
     */
    ENABLE("enable"),

    /**
     * Enum value disable.
     */
    DISABLE("disable");

    /**
     * The actual serialized value for a RecommendedSensitivityLabelUpdateKind instance.
     */
    private final String value;

    RecommendedSensitivityLabelUpdateKind(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RecommendedSensitivityLabelUpdateKind instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed RecommendedSensitivityLabelUpdateKind object, or null if unable to parse.
     */
    public static RecommendedSensitivityLabelUpdateKind fromString(String value) {
        if (value == null) {
            return null;
        }
        RecommendedSensitivityLabelUpdateKind[] items = RecommendedSensitivityLabelUpdateKind.values();
        for (RecommendedSensitivityLabelUpdateKind item : items) {
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
