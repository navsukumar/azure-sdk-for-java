// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.exception.ManagementError;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.resources.models.WhatIfChange;
import java.io.IOException;
import java.util.List;

/**
 * Result of the What-If operation. Contains a list of predicted changes and a URL link to get to the next set of
 * results.
 */
@Fluent
public final class WhatIfOperationResultInner implements JsonSerializable<WhatIfOperationResultInner> {
    /*
     * Status of the What-If operation.
     */
    private String status;

    /*
     * What-If operation properties.
     */
    private WhatIfOperationProperties innerProperties;

    /*
     * Error when What-If operation fails.
     */
    private ManagementError error;

    /**
     * Creates an instance of WhatIfOperationResultInner class.
     */
    public WhatIfOperationResultInner() {
    }

    /**
     * Get the status property: Status of the What-If operation.
     * 
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: Status of the What-If operation.
     * 
     * @param status the status value to set.
     * @return the WhatIfOperationResultInner object itself.
     */
    public WhatIfOperationResultInner withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the innerProperties property: What-If operation properties.
     * 
     * @return the innerProperties value.
     */
    private WhatIfOperationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the error property: Error when What-If operation fails.
     * 
     * @return the error value.
     */
    public ManagementError error() {
        return this.error;
    }

    /**
     * Set the error property: Error when What-If operation fails.
     * 
     * @param error the error value to set.
     * @return the WhatIfOperationResultInner object itself.
     */
    public WhatIfOperationResultInner withError(ManagementError error) {
        this.error = error;
        return this;
    }

    /**
     * Get the changes property: List of resource changes predicted by What-If operation.
     * 
     * @return the changes value.
     */
    public List<WhatIfChange> changes() {
        return this.innerProperties() == null ? null : this.innerProperties().changes();
    }

    /**
     * Set the changes property: List of resource changes predicted by What-If operation.
     * 
     * @param changes the changes value to set.
     * @return the WhatIfOperationResultInner object itself.
     */
    public WhatIfOperationResultInner withChanges(List<WhatIfChange> changes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WhatIfOperationProperties();
        }
        this.innerProperties().withChanges(changes);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("status", this.status);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeJsonField("error", this.error);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WhatIfOperationResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WhatIfOperationResultInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the WhatIfOperationResultInner.
     */
    public static WhatIfOperationResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WhatIfOperationResultInner deserializedWhatIfOperationResultInner = new WhatIfOperationResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("status".equals(fieldName)) {
                    deserializedWhatIfOperationResultInner.status = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedWhatIfOperationResultInner.innerProperties = WhatIfOperationProperties.fromJson(reader);
                } else if ("error".equals(fieldName)) {
                    deserializedWhatIfOperationResultInner.error = ManagementError.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWhatIfOperationResultInner;
        });
    }
}
