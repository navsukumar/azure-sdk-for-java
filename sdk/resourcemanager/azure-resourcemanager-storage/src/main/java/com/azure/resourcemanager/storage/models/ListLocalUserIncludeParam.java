// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for ListLocalUserIncludeParam.
 */
public final class ListLocalUserIncludeParam extends ExpandableStringEnum<ListLocalUserIncludeParam> {
    /**
     * Static value nfsv3 for ListLocalUserIncludeParam.
     */
    public static final ListLocalUserIncludeParam NFSV3 = fromString("nfsv3");

    /**
     * Creates a new instance of ListLocalUserIncludeParam value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ListLocalUserIncludeParam() {
    }

    /**
     * Creates or finds a ListLocalUserIncludeParam from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ListLocalUserIncludeParam.
     */
    public static ListLocalUserIncludeParam fromString(String name) {
        return fromString(name, ListLocalUserIncludeParam.class);
    }

    /**
     * Gets known ListLocalUserIncludeParam values.
     * 
     * @return known ListLocalUserIncludeParam values.
     */
    public static Collection<ListLocalUserIncludeParam> values() {
        return values(ListLocalUserIncludeParam.class);
    }
}
