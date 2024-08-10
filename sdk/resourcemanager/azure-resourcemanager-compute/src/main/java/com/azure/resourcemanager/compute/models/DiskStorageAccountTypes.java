// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The sku name.
 */
public final class DiskStorageAccountTypes extends ExpandableStringEnum<DiskStorageAccountTypes> {
    /**
     * Static value Standard_LRS for DiskStorageAccountTypes.
     */
    public static final DiskStorageAccountTypes STANDARD_LRS = fromString("Standard_LRS");

    /**
     * Static value Premium_LRS for DiskStorageAccountTypes.
     */
    public static final DiskStorageAccountTypes PREMIUM_LRS = fromString("Premium_LRS");

    /**
     * Static value StandardSSD_LRS for DiskStorageAccountTypes.
     */
    public static final DiskStorageAccountTypes STANDARD_SSD_LRS = fromString("StandardSSD_LRS");

    /**
     * Static value UltraSSD_LRS for DiskStorageAccountTypes.
     */
    public static final DiskStorageAccountTypes ULTRA_SSD_LRS = fromString("UltraSSD_LRS");

    /**
     * Static value Premium_ZRS for DiskStorageAccountTypes.
     */
    public static final DiskStorageAccountTypes PREMIUM_ZRS = fromString("Premium_ZRS");

    /**
     * Static value StandardSSD_ZRS for DiskStorageAccountTypes.
     */
    public static final DiskStorageAccountTypes STANDARD_SSD_ZRS = fromString("StandardSSD_ZRS");

    /**
     * Static value PremiumV2_LRS for DiskStorageAccountTypes.
     */
    public static final DiskStorageAccountTypes PREMIUM_V2_LRS = fromString("PremiumV2_LRS");

    /**
     * Creates a new instance of DiskStorageAccountTypes value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DiskStorageAccountTypes() {
    }

    /**
     * Creates or finds a DiskStorageAccountTypes from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DiskStorageAccountTypes.
     */
    public static DiskStorageAccountTypes fromString(String name) {
        return fromString(name, DiskStorageAccountTypes.class);
    }

    /**
     * Gets known DiskStorageAccountTypes values.
     * 
     * @return known DiskStorageAccountTypes values.
     */
    public static Collection<DiskStorageAccountTypes> values() {
        return values(DiskStorageAccountTypes.class);
    }
}
