// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * role of namespace in GEO DR - possible values 'Primary' or 'PrimaryNotReplicating' or 'Secondary'.
 */
public enum RoleDisasterRecovery {
    /**
     * Enum value Primary.
     */
    PRIMARY("Primary"),

    /**
     * Enum value PrimaryNotReplicating.
     */
    PRIMARY_NOT_REPLICATING("PrimaryNotReplicating"),

    /**
     * Enum value Secondary.
     */
    SECONDARY("Secondary");

    /**
     * The actual serialized value for a RoleDisasterRecovery instance.
     */
    private final String value;

    RoleDisasterRecovery(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RoleDisasterRecovery instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed RoleDisasterRecovery object, or null if unable to parse.
     */
    @JsonCreator
    public static RoleDisasterRecovery fromString(String value) {
        if (value == null) {
            return null;
        }
        RoleDisasterRecovery[] items = RoleDisasterRecovery.values();
        for (RoleDisasterRecovery item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
