// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Storage key type: StorageAccessKey or SharedAccessKey.
 */
public final class StorageKeyType extends ExpandableStringEnum<StorageKeyType> {
    /**
     * Static value SharedAccessKey for StorageKeyType.
     */
    public static final StorageKeyType SHARED_ACCESS_KEY = fromString("SharedAccessKey");

    /**
     * Static value StorageAccessKey for StorageKeyType.
     */
    public static final StorageKeyType STORAGE_ACCESS_KEY = fromString("StorageAccessKey");

    /**
     * Creates a new instance of StorageKeyType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public StorageKeyType() {
    }

    /**
     * Creates or finds a StorageKeyType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding StorageKeyType.
     */
    public static StorageKeyType fromString(String name) {
        return fromString(name, StorageKeyType.class);
    }

    /**
     * Gets known StorageKeyType values.
     * 
     * @return known StorageKeyType values.
     */
    public static Collection<StorageKeyType> values() {
        return values(StorageKeyType.class);
    }
}
