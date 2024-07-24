// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * smbNonBrowsable
 * 
 * Enables non-browsable property for SMB Shares. Only applicable for SMB/DualProtocol volume.
 */
public final class SmbNonBrowsable extends ExpandableStringEnum<SmbNonBrowsable> {
    /**
     * Static value Disabled for SmbNonBrowsable.
     */
    public static final SmbNonBrowsable DISABLED = fromString("Disabled");

    /**
     * Static value Enabled for SmbNonBrowsable.
     */
    public static final SmbNonBrowsable ENABLED = fromString("Enabled");

    /**
     * Creates a new instance of SmbNonBrowsable value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SmbNonBrowsable() {
    }

    /**
     * Creates or finds a SmbNonBrowsable from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SmbNonBrowsable.
     */
    public static SmbNonBrowsable fromString(String name) {
        return fromString(name, SmbNonBrowsable.class);
    }

    /**
     * Gets known SmbNonBrowsable values.
     * 
     * @return known SmbNonBrowsable values.
     */
    public static Collection<SmbNonBrowsable> values() {
        return values(SmbNonBrowsable.class);
    }
}
