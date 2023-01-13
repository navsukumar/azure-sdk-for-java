// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.frontdoor.models.NetworkExperimentResourceState;
import com.azure.resourcemanager.frontdoor.models.State;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the properties of an experiment. */
@Fluent
public final class ProfileProperties {
    /*
     * Resource status.
     */
    @JsonProperty(value = "resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private NetworkExperimentResourceState resourceState;

    /*
     * The state of the Experiment
     */
    @JsonProperty(value = "enabledState")
    private State enabledState;

    /** Creates an instance of ProfileProperties class. */
    public ProfileProperties() {
    }

    /**
     * Get the resourceState property: Resource status.
     *
     * @return the resourceState value.
     */
    public NetworkExperimentResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Get the enabledState property: The state of the Experiment.
     *
     * @return the enabledState value.
     */
    public State enabledState() {
        return this.enabledState;
    }

    /**
     * Set the enabledState property: The state of the Experiment.
     *
     * @param enabledState the enabledState value to set.
     * @return the ProfileProperties object itself.
     */
    public ProfileProperties withEnabledState(State enabledState) {
        this.enabledState = enabledState;
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