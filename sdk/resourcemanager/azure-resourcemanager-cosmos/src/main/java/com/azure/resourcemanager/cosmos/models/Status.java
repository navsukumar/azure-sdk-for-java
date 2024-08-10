// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Enum to indicate current buildout status of the region.
 */
public final class Status extends ExpandableStringEnum<Status> {
    /**
     * Static value Uninitialized for Status.
     */
    public static final Status UNINITIALIZED = fromString("Uninitialized");

    /**
     * Static value Initializing for Status.
     */
    public static final Status INITIALIZING = fromString("Initializing");

    /**
     * Static value InternallyReady for Status.
     */
    public static final Status INTERNALLY_READY = fromString("InternallyReady");

    /**
     * Static value Online for Status.
     */
    public static final Status ONLINE = fromString("Online");

    /**
     * Static value Deleting for Status.
     */
    public static final Status DELETING = fromString("Deleting");

    /**
     * Creates a new instance of Status value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Status() {
    }

    /**
     * Creates or finds a Status from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding Status.
     */
    public static Status fromString(String name) {
        return fromString(name, Status.class);
    }

    /**
     * Gets known Status values.
     * 
     * @return known Status values.
     */
    public static Collection<Status> values() {
        return values(Status.class);
    }
}
