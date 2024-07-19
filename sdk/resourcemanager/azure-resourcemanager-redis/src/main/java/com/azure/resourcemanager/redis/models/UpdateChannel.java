// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Optional: Specifies the update channel for the monthly Redis updates your Redis Cache will receive. Caches using
 * 'Preview' update channel get latest Redis updates at least 4 weeks ahead of 'Stable' channel caches. Default value is
 * 'Stable'.
 */
public final class UpdateChannel extends ExpandableStringEnum<UpdateChannel> {
    /**
     * Static value Stable for UpdateChannel.
     */
    public static final UpdateChannel STABLE = fromString("Stable");

    /**
     * Static value Preview for UpdateChannel.
     */
    public static final UpdateChannel PREVIEW = fromString("Preview");

    /**
     * Creates a new instance of UpdateChannel value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public UpdateChannel() {
    }

    /**
     * Creates or finds a UpdateChannel from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding UpdateChannel.
     */
    @JsonCreator
    public static UpdateChannel fromString(String name) {
        return fromString(name, UpdateChannel.class);
    }

    /**
     * Gets known UpdateChannel values.
     * 
     * @return known UpdateChannel values.
     */
    public static Collection<UpdateChannel> values() {
        return values(UpdateChannel.class);
    }
}
