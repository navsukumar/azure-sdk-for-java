// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for EncryptionAlgorithmType. */
public enum EncryptionAlgorithmType {
    /** Enum value AES256. */
    AES256("AES256");

    /** The actual serialized value for a EncryptionAlgorithmType instance. */
    private final String value;

    EncryptionAlgorithmType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a EncryptionAlgorithmType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed EncryptionAlgorithmType object, or null if unable to parse.
     */
    @JsonCreator
    public static EncryptionAlgorithmType fromString(String value) {
        EncryptionAlgorithmType[] items = EncryptionAlgorithmType.values();
        for (EncryptionAlgorithmType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
