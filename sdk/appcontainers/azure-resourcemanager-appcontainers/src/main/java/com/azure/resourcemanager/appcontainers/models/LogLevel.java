// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Sets the log level for the Dapr sidecar. Allowed values are debug, info, warn, error. Default is info.
 */
public final class LogLevel extends ExpandableStringEnum<LogLevel> {
    /**
     * Static value info for LogLevel.
     */
    public static final LogLevel INFO = fromString("info");

    /**
     * Static value debug for LogLevel.
     */
    public static final LogLevel DEBUG = fromString("debug");

    /**
     * Static value warn for LogLevel.
     */
    public static final LogLevel WARN = fromString("warn");

    /**
     * Static value error for LogLevel.
     */
    public static final LogLevel ERROR = fromString("error");

    /**
     * Creates a new instance of LogLevel value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LogLevel() {
    }

    /**
     * Creates or finds a LogLevel from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding LogLevel.
     */
    public static LogLevel fromString(String name) {
        return fromString(name, LogLevel.class);
    }

    /**
     * Gets known LogLevel values.
     * 
     * @return known LogLevel values.
     */
    public static Collection<LogLevel> values() {
        return values(LogLevel.class);
    }
}
