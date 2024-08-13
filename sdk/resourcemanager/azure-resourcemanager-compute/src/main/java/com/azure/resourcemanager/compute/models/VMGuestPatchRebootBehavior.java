// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Describes the reboot requirements of the patch.
 */
public final class VMGuestPatchRebootBehavior extends ExpandableStringEnum<VMGuestPatchRebootBehavior> {
    /**
     * Static value Unknown for VMGuestPatchRebootBehavior.
     */
    public static final VMGuestPatchRebootBehavior UNKNOWN = fromString("Unknown");

    /**
     * Static value NeverReboots for VMGuestPatchRebootBehavior.
     */
    public static final VMGuestPatchRebootBehavior NEVER_REBOOTS = fromString("NeverReboots");

    /**
     * Static value AlwaysRequiresReboot for VMGuestPatchRebootBehavior.
     */
    public static final VMGuestPatchRebootBehavior ALWAYS_REQUIRES_REBOOT = fromString("AlwaysRequiresReboot");

    /**
     * Static value CanRequestReboot for VMGuestPatchRebootBehavior.
     */
    public static final VMGuestPatchRebootBehavior CAN_REQUEST_REBOOT = fromString("CanRequestReboot");

    /**
     * Creates a new instance of VMGuestPatchRebootBehavior value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VMGuestPatchRebootBehavior() {
    }

    /**
     * Creates or finds a VMGuestPatchRebootBehavior from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding VMGuestPatchRebootBehavior.
     */
    public static VMGuestPatchRebootBehavior fromString(String name) {
        return fromString(name, VMGuestPatchRebootBehavior.class);
    }

    /**
     * Gets known VMGuestPatchRebootBehavior values.
     * 
     * @return known VMGuestPatchRebootBehavior values.
     */
    public static Collection<VMGuestPatchRebootBehavior> values() {
        return values(VMGuestPatchRebootBehavior.class);
    }
}
