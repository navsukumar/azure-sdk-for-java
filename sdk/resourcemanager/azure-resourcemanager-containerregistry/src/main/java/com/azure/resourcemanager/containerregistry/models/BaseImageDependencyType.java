// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The type of the base image dependency.
 */
public final class BaseImageDependencyType extends ExpandableStringEnum<BaseImageDependencyType> {
    /**
     * Static value BuildTime for BaseImageDependencyType.
     */
    public static final BaseImageDependencyType BUILD_TIME = fromString("BuildTime");

    /**
     * Static value RunTime for BaseImageDependencyType.
     */
    public static final BaseImageDependencyType RUN_TIME = fromString("RunTime");

    /**
     * Creates a new instance of BaseImageDependencyType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BaseImageDependencyType() {
    }

    /**
     * Creates or finds a BaseImageDependencyType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding BaseImageDependencyType.
     */
    public static BaseImageDependencyType fromString(String name) {
        return fromString(name, BaseImageDependencyType.class);
    }

    /**
     * Gets known BaseImageDependencyType values.
     * 
     * @return known BaseImageDependencyType values.
     */
    public static Collection<BaseImageDependencyType> values() {
        return values(BaseImageDependencyType.class);
    }
}
