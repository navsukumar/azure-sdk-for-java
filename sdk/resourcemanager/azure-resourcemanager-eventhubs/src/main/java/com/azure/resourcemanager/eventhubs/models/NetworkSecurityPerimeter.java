// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * NetworkSecurityPerimeter related information.
 */
@Fluent
public final class NetworkSecurityPerimeter {
    /*
     * Fully qualified identifier of the resource
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Guid of the resource
     */
    @JsonProperty(value = "perimeterGuid")
    private String perimeterGuid;

    /*
     * Location of the resource
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Creates an instance of NetworkSecurityPerimeter class.
     */
    public NetworkSecurityPerimeter() {
    }

    /**
     * Get the id property: Fully qualified identifier of the resource.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Fully qualified identifier of the resource.
     * 
     * @param id the id value to set.
     * @return the NetworkSecurityPerimeter object itself.
     */
    public NetworkSecurityPerimeter withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the perimeterGuid property: Guid of the resource.
     * 
     * @return the perimeterGuid value.
     */
    public String perimeterGuid() {
        return this.perimeterGuid;
    }

    /**
     * Set the perimeterGuid property: Guid of the resource.
     * 
     * @param perimeterGuid the perimeterGuid value to set.
     * @return the NetworkSecurityPerimeter object itself.
     */
    public NetworkSecurityPerimeter withPerimeterGuid(String perimeterGuid) {
        this.perimeterGuid = perimeterGuid;
        return this;
    }

    /**
     * Get the location property: Location of the resource.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Location of the resource.
     * 
     * @param location the location value to set.
     * @return the NetworkSecurityPerimeter object itself.
     */
    public NetworkSecurityPerimeter withLocation(String location) {
        this.location = location;
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
