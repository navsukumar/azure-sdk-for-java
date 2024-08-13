// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The move operation mode.
 */
public final class MoveOperationMode extends ExpandableStringEnum<MoveOperationMode> {
    /**
     * Static value Move for MoveOperationMode.
     */
    public static final MoveOperationMode MOVE = fromString("Move");

    /**
     * Static value Copy for MoveOperationMode.
     */
    public static final MoveOperationMode COPY = fromString("Copy");

    /**
     * Creates a new instance of MoveOperationMode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MoveOperationMode() {
    }

    /**
     * Creates or finds a MoveOperationMode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding MoveOperationMode.
     */
    public static MoveOperationMode fromString(String name) {
        return fromString(name, MoveOperationMode.class);
    }

    /**
     * Gets known MoveOperationMode values.
     * 
     * @return known MoveOperationMode values.
     */
    public static Collection<MoveOperationMode> values() {
        return values(MoveOperationMode.class);
    }
}
