// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.resources.fluentcore.arm.models;

import com.azure.core.util.ExpandableStringEnum;

import java.util.Collection;

/** Defines values for CheckNameAvailabilityReason. */
public final class CheckNameAvailabilityReason extends ExpandableStringEnum<CheckNameAvailabilityReason> {

    /** Static value Invalid for CheckNameAvailabilityReason. */
    public static final CheckNameAvailabilityReason INVALID = fromString("Invalid");

    /** Static value AlreadyExists for CheckNameAvailabilityReason. */
    public static final CheckNameAvailabilityReason ALREADY_EXISTS = fromString("AlreadyExists");

    /**
     * Creates or finds a CheckNameAvailabilityReason from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CheckNameAvailabilityReason.
     */
    public static CheckNameAvailabilityReason fromString(String name) {
        return fromString(name, CheckNameAvailabilityReason.class);
    }

    /**
     * Gets known CheckNameAvailabilityReason values.
     *
     * @return known CheckNameAvailabilityReason values.
     */
    public static Collection<CheckNameAvailabilityReason> values() {
        return values(CheckNameAvailabilityReason.class);
    }
}
