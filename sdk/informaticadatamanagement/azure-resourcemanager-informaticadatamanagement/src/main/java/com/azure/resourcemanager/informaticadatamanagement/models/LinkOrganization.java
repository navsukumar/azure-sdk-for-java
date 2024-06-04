// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Link Organization.
 */
@Fluent
public final class LinkOrganization {
    /*
     * Link organization token
     */
    @JsonProperty(value = "token")
    private String token;

    /**
     * Creates an instance of LinkOrganization class.
     */
    public LinkOrganization() {
    }

    /**
     * Get the token property: Link organization token.
     * 
     * @return the token value.
     */
    public String token() {
        return this.token;
    }

    /**
     * Set the token property: Link organization token.
     * 
     * @param token the token value to set.
     * @return the LinkOrganization object itself.
     */
    public LinkOrganization withToken(String token) {
        this.token = token;
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
