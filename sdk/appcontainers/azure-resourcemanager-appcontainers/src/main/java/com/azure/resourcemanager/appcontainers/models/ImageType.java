// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The type of the image. Set to CloudBuild to let the system manages the image, where user will not be able to update
 * image through image field. Set to ContainerImage for user provided image.
 */
public final class ImageType extends ExpandableStringEnum<ImageType> {
    /**
     * Static value CloudBuild for ImageType.
     */
    public static final ImageType CLOUD_BUILD = fromString("CloudBuild");

    /**
     * Static value ContainerImage for ImageType.
     */
    public static final ImageType CONTAINER_IMAGE = fromString("ContainerImage");

    /**
     * Creates a new instance of ImageType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ImageType() {
    }

    /**
     * Creates or finds a ImageType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ImageType.
     */
    public static ImageType fromString(String name) {
        return fromString(name, ImageType.class);
    }

    /**
     * Gets known ImageType values.
     * 
     * @return known ImageType values.
     */
    public static Collection<ImageType> values() {
        return values(ImageType.class);
    }
}
