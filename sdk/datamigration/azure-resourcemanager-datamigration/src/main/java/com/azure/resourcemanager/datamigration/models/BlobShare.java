// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Blob container storage information. */
@Fluent
public final class BlobShare {
    /*
     * SAS URI of Azure Storage Account Container.
     */
    @JsonProperty(value = "sasUri", required = true)
    private String sasUri;

    /** Creates an instance of BlobShare class. */
    public BlobShare() {
    }

    /**
     * Get the sasUri property: SAS URI of Azure Storage Account Container.
     *
     * @return the sasUri value.
     */
    public String sasUri() {
        return this.sasUri;
    }

    /**
     * Set the sasUri property: SAS URI of Azure Storage Account Container.
     *
     * @param sasUri the sasUri value to set.
     * @return the BlobShare object itself.
     */
    public BlobShare withSasUri(String sasUri) {
        this.sasUri = sasUri;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sasUri() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sasUri in model BlobShare"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BlobShare.class);
}
