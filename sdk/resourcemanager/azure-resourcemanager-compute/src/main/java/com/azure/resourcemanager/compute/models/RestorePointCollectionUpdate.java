// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.compute.fluent.models.RestorePointCollectionProperties;
import com.azure.resourcemanager.compute.fluent.models.RestorePointInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * Update Restore Point collection parameters.
 */
@Fluent
public final class RestorePointCollectionUpdate extends UpdateResource {
    /*
     * The restore point collection properties.
     */
    @JsonProperty(value = "properties")
    private RestorePointCollectionProperties innerProperties;

    /**
     * Creates an instance of RestorePointCollectionUpdate class.
     */
    public RestorePointCollectionUpdate() {
    }

    /**
     * Get the innerProperties property: The restore point collection properties.
     * 
     * @return the innerProperties value.
     */
    private RestorePointCollectionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RestorePointCollectionUpdate withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the source property: The properties of the source resource that this restore point collection is created
     * from.
     * 
     * @return the source value.
     */
    public RestorePointCollectionSourceProperties source() {
        return this.innerProperties() == null ? null : this.innerProperties().source();
    }

    /**
     * Set the source property: The properties of the source resource that this restore point collection is created
     * from.
     * 
     * @param source the source value to set.
     * @return the RestorePointCollectionUpdate object itself.
     */
    public RestorePointCollectionUpdate withSource(RestorePointCollectionSourceProperties source) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RestorePointCollectionProperties();
        }
        this.innerProperties().withSource(source);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the restore point collection.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the restorePointCollectionId property: The unique id of the restore point collection.
     * 
     * @return the restorePointCollectionId value.
     */
    public String restorePointCollectionId() {
        return this.innerProperties() == null ? null : this.innerProperties().restorePointCollectionId();
    }

    /**
     * Get the restorePoints property: A list containing all restore points created under this restore point collection.
     * 
     * @return the restorePoints value.
     */
    public List<RestorePointInner> restorePoints() {
        return this.innerProperties() == null ? null : this.innerProperties().restorePoints();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
