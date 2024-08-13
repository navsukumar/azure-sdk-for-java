// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Link type (GEO, NAMED, STANDBY).
 */
public final class ReplicationLinkType extends ExpandableStringEnum<ReplicationLinkType> {
    /**
     * Static value GEO for ReplicationLinkType.
     */
    public static final ReplicationLinkType GEO = fromString("GEO");

    /**
     * Static value NAMED for ReplicationLinkType.
     */
    public static final ReplicationLinkType NAMED = fromString("NAMED");

    /**
     * Static value STANDBY for ReplicationLinkType.
     */
    public static final ReplicationLinkType STANDBY = fromString("STANDBY");

    /**
     * Creates a new instance of ReplicationLinkType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ReplicationLinkType() {
    }

    /**
     * Creates or finds a ReplicationLinkType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ReplicationLinkType.
     */
    public static ReplicationLinkType fromString(String name) {
        return fromString(name, ReplicationLinkType.class);
    }

    /**
     * Gets known ReplicationLinkType values.
     * 
     * @return known ReplicationLinkType values.
     */
    public static Collection<ReplicationLinkType> values() {
        return values(ReplicationLinkType.class);
    }
}
