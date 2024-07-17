// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The OSImageNotificationProfile model.
 */
@Fluent
public final class OSImageNotificationProfile {
    /*
     * Length of time a Virtual Machine being reimaged or having its OS upgraded will have to potentially approve the OS
     * Image Scheduled Event before the event is auto approved (timed out). The configuration is specified in ISO 8601
     * format, and the value must be 15 minutes (PT15M)
     */
    @JsonProperty(value = "notBeforeTimeout")
    private String notBeforeTimeout;

    /*
     * Specifies whether the OS Image Scheduled event is enabled or disabled.
     */
    @JsonProperty(value = "enable")
    private Boolean enable;

    /**
     * Creates an instance of OSImageNotificationProfile class.
     */
    public OSImageNotificationProfile() {
    }

    /**
     * Get the notBeforeTimeout property: Length of time a Virtual Machine being reimaged or having its OS upgraded will
     * have to potentially approve the OS Image Scheduled Event before the event is auto approved (timed out). The
     * configuration is specified in ISO 8601 format, and the value must be 15 minutes (PT15M).
     * 
     * @return the notBeforeTimeout value.
     */
    public String notBeforeTimeout() {
        return this.notBeforeTimeout;
    }

    /**
     * Set the notBeforeTimeout property: Length of time a Virtual Machine being reimaged or having its OS upgraded will
     * have to potentially approve the OS Image Scheduled Event before the event is auto approved (timed out). The
     * configuration is specified in ISO 8601 format, and the value must be 15 minutes (PT15M).
     * 
     * @param notBeforeTimeout the notBeforeTimeout value to set.
     * @return the OSImageNotificationProfile object itself.
     */
    public OSImageNotificationProfile withNotBeforeTimeout(String notBeforeTimeout) {
        this.notBeforeTimeout = notBeforeTimeout;
        return this;
    }

    /**
     * Get the enable property: Specifies whether the OS Image Scheduled event is enabled or disabled.
     * 
     * @return the enable value.
     */
    public Boolean enable() {
        return this.enable;
    }

    /**
     * Set the enable property: Specifies whether the OS Image Scheduled event is enabled or disabled.
     * 
     * @param enable the enable value to set.
     * @return the OSImageNotificationProfile object itself.
     */
    public OSImageNotificationProfile withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
