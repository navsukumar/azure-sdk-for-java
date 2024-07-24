// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The status of the patch detection.
 */
public final class DetectionStatus extends ExpandableStringEnum<DetectionStatus> {
    /**
     * Static value Succeeded for DetectionStatus.
     */
    public static final DetectionStatus SUCCEEDED = fromString("Succeeded");

    /**
     * Static value RegistryLoginFailed for DetectionStatus.
     */
    public static final DetectionStatus REGISTRY_LOGIN_FAILED = fromString("RegistryLoginFailed");

    /**
     * Static value Failed for DetectionStatus.
     */
    public static final DetectionStatus FAILED = fromString("Failed");

    /**
     * Creates a new instance of DetectionStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DetectionStatus() {
    }

    /**
     * Creates or finds a DetectionStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DetectionStatus.
     */
    public static DetectionStatus fromString(String name) {
        return fromString(name, DetectionStatus.class);
    }

    /**
     * Gets known DetectionStatus values.
     * 
     * @return known DetectionStatus values.
     */
    public static Collection<DetectionStatus> values() {
        return values(DetectionStatus.class);
    }
}
