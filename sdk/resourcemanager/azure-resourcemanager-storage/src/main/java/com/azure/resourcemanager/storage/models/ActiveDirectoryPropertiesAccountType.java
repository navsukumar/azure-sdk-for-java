// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Specifies the Active Directory account type for Azure Storage.
 */
public final class ActiveDirectoryPropertiesAccountType
    extends ExpandableStringEnum<ActiveDirectoryPropertiesAccountType> {
    /**
     * Static value User for ActiveDirectoryPropertiesAccountType.
     */
    public static final ActiveDirectoryPropertiesAccountType USER = fromString("User");

    /**
     * Static value Computer for ActiveDirectoryPropertiesAccountType.
     */
    public static final ActiveDirectoryPropertiesAccountType COMPUTER = fromString("Computer");

    /**
     * Creates a new instance of ActiveDirectoryPropertiesAccountType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ActiveDirectoryPropertiesAccountType() {
    }

    /**
     * Creates or finds a ActiveDirectoryPropertiesAccountType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ActiveDirectoryPropertiesAccountType.
     */
    public static ActiveDirectoryPropertiesAccountType fromString(String name) {
        return fromString(name, ActiveDirectoryPropertiesAccountType.class);
    }

    /**
     * Gets known ActiveDirectoryPropertiesAccountType values.
     * 
     * @return known ActiveDirectoryPropertiesAccountType values.
     */
    public static Collection<ActiveDirectoryPropertiesAccountType> values() {
        return values(ActiveDirectoryPropertiesAccountType.class);
    }
}
