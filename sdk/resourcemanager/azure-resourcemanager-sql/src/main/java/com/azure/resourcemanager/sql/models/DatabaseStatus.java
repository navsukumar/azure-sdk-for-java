// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The status of the database.
 */
public final class DatabaseStatus extends ExpandableStringEnum<DatabaseStatus> {
    /**
     * Static value Online for DatabaseStatus.
     */
    public static final DatabaseStatus ONLINE = fromString("Online");

    /**
     * Static value Restoring for DatabaseStatus.
     */
    public static final DatabaseStatus RESTORING = fromString("Restoring");

    /**
     * Static value RecoveryPending for DatabaseStatus.
     */
    public static final DatabaseStatus RECOVERY_PENDING = fromString("RecoveryPending");

    /**
     * Static value Recovering for DatabaseStatus.
     */
    public static final DatabaseStatus RECOVERING = fromString("Recovering");

    /**
     * Static value Suspect for DatabaseStatus.
     */
    public static final DatabaseStatus SUSPECT = fromString("Suspect");

    /**
     * Static value Offline for DatabaseStatus.
     */
    public static final DatabaseStatus OFFLINE = fromString("Offline");

    /**
     * Static value Standby for DatabaseStatus.
     */
    public static final DatabaseStatus STANDBY = fromString("Standby");

    /**
     * Static value Shutdown for DatabaseStatus.
     */
    public static final DatabaseStatus SHUTDOWN = fromString("Shutdown");

    /**
     * Static value EmergencyMode for DatabaseStatus.
     */
    public static final DatabaseStatus EMERGENCY_MODE = fromString("EmergencyMode");

    /**
     * Static value AutoClosed for DatabaseStatus.
     */
    public static final DatabaseStatus AUTO_CLOSED = fromString("AutoClosed");

    /**
     * Static value Copying for DatabaseStatus.
     */
    public static final DatabaseStatus COPYING = fromString("Copying");

    /**
     * Static value Creating for DatabaseStatus.
     */
    public static final DatabaseStatus CREATING = fromString("Creating");

    /**
     * Static value Inaccessible for DatabaseStatus.
     */
    public static final DatabaseStatus INACCESSIBLE = fromString("Inaccessible");

    /**
     * Static value OfflineSecondary for DatabaseStatus.
     */
    public static final DatabaseStatus OFFLINE_SECONDARY = fromString("OfflineSecondary");

    /**
     * Static value Pausing for DatabaseStatus.
     */
    public static final DatabaseStatus PAUSING = fromString("Pausing");

    /**
     * Static value Paused for DatabaseStatus.
     */
    public static final DatabaseStatus PAUSED = fromString("Paused");

    /**
     * Static value Resuming for DatabaseStatus.
     */
    public static final DatabaseStatus RESUMING = fromString("Resuming");

    /**
     * Static value Scaling for DatabaseStatus.
     */
    public static final DatabaseStatus SCALING = fromString("Scaling");

    /**
     * Static value OfflineChangingDwPerformanceTiers for DatabaseStatus.
     */
    public static final DatabaseStatus OFFLINE_CHANGING_DW_PERFORMANCE_TIERS
        = fromString("OfflineChangingDwPerformanceTiers");

    /**
     * Static value OnlineChangingDwPerformanceTiers for DatabaseStatus.
     */
    public static final DatabaseStatus ONLINE_CHANGING_DW_PERFORMANCE_TIERS
        = fromString("OnlineChangingDwPerformanceTiers");

    /**
     * Static value Disabled for DatabaseStatus.
     */
    public static final DatabaseStatus DISABLED = fromString("Disabled");

    /**
     * Static value Stopping for DatabaseStatus.
     */
    public static final DatabaseStatus STOPPING = fromString("Stopping");

    /**
     * Static value Stopped for DatabaseStatus.
     */
    public static final DatabaseStatus STOPPED = fromString("Stopped");

    /**
     * Static value Starting for DatabaseStatus.
     */
    public static final DatabaseStatus STARTING = fromString("Starting");

    /**
     * Creates a new instance of DatabaseStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DatabaseStatus() {
    }

    /**
     * Creates or finds a DatabaseStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DatabaseStatus.
     */
    public static DatabaseStatus fromString(String name) {
        return fromString(name, DatabaseStatus.class);
    }

    /**
     * Gets known DatabaseStatus values.
     * 
     * @return known DatabaseStatus values.
     */
    public static Collection<DatabaseStatus> values() {
        return values(DatabaseStatus.class);
    }
}
