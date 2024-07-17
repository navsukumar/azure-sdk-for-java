// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.fluent.models.VirtualMachineInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The List Virtual Machine operation response.
 */
@Fluent
public final class VirtualMachineListResult {
    /*
     * The list of virtual machines.
     */
    @JsonProperty(value = "value", required = true)
    private List<VirtualMachineInner> value;

    /*
     * The URI to fetch the next page of VMs. Call ListNext() with this URI to fetch the next page of Virtual Machines.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of VirtualMachineListResult class.
     */
    public VirtualMachineListResult() {
    }

    /**
     * Get the value property: The list of virtual machines.
     * 
     * @return the value value.
     */
    public List<VirtualMachineInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of virtual machines.
     * 
     * @param value the value value to set.
     * @return the VirtualMachineListResult object itself.
     */
    public VirtualMachineListResult withValue(List<VirtualMachineInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of VMs. Call ListNext() with this URI to fetch the next
     * page of Virtual Machines.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to fetch the next page of VMs. Call ListNext() with this URI to fetch the next
     * page of Virtual Machines.
     * 
     * @param nextLink the nextLink value to set.
     * @return the VirtualMachineListResult object itself.
     */
    public VirtualMachineListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property value in model VirtualMachineListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VirtualMachineListResult.class);
}
