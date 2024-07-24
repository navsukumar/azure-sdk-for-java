// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The reboot state of the VM following completion of the operation.
 */
public final class VMGuestPatchRebootStatus extends ExpandableStringEnum<VMGuestPatchRebootStatus> {
    /**
     * Static value Unknown for VMGuestPatchRebootStatus.
     */
    public static final VMGuestPatchRebootStatus UNKNOWN = fromString("Unknown");

    /**
     * Static value NotNeeded for VMGuestPatchRebootStatus.
     */
    public static final VMGuestPatchRebootStatus NOT_NEEDED = fromString("NotNeeded");

    /**
     * Static value Required for VMGuestPatchRebootStatus.
     */
    public static final VMGuestPatchRebootStatus REQUIRED = fromString("Required");

    /**
     * Static value Started for VMGuestPatchRebootStatus.
     */
    public static final VMGuestPatchRebootStatus STARTED = fromString("Started");

    /**
     * Static value Failed for VMGuestPatchRebootStatus.
     */
    public static final VMGuestPatchRebootStatus FAILED = fromString("Failed");

    /**
     * Static value Completed for VMGuestPatchRebootStatus.
     */
    public static final VMGuestPatchRebootStatus COMPLETED = fromString("Completed");

    /**
     * Creates a new instance of VMGuestPatchRebootStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VMGuestPatchRebootStatus() {
    }

    /**
     * Creates or finds a VMGuestPatchRebootStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding VMGuestPatchRebootStatus.
     */
    public static VMGuestPatchRebootStatus fromString(String name) {
        return fromString(name, VMGuestPatchRebootStatus.class);
    }

    /**
     * Gets known VMGuestPatchRebootStatus values.
     * 
     * @return known VMGuestPatchRebootStatus values.
     */
    public static Collection<VMGuestPatchRebootStatus> values() {
        return values(VMGuestPatchRebootStatus.class);
    }
}
