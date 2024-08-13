// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.storage.fluent.models.ImmutabilityPolicyProperty;
import java.io.IOException;
import java.util.List;

/**
 * The properties of an ImmutabilityPolicy of a blob container.
 */
@Fluent
public final class ImmutabilityPolicyProperties implements JsonSerializable<ImmutabilityPolicyProperties> {
    /*
     * The properties of an ImmutabilityPolicy of a blob container.
     */
    private ImmutabilityPolicyProperty innerProperties;

    /*
     * ImmutabilityPolicy Etag.
     */
    private String etag;

    /*
     * The ImmutabilityPolicy update history of the blob container.
     */
    private List<UpdateHistoryProperty> updateHistory;

    /**
     * Creates an instance of ImmutabilityPolicyProperties class.
     */
    public ImmutabilityPolicyProperties() {
    }

    /**
     * Get the innerProperties property: The properties of an ImmutabilityPolicy of a blob container.
     * 
     * @return the innerProperties value.
     */
    private ImmutabilityPolicyProperty innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: ImmutabilityPolicy Etag.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the updateHistory property: The ImmutabilityPolicy update history of the blob container.
     * 
     * @return the updateHistory value.
     */
    public List<UpdateHistoryProperty> updateHistory() {
        return this.updateHistory;
    }

    /**
     * Get the immutabilityPeriodSinceCreationInDays property: The immutability period for the blobs in the container
     * since the policy creation, in days.
     * 
     * @return the immutabilityPeriodSinceCreationInDays value.
     */
    public Integer immutabilityPeriodSinceCreationInDays() {
        return this.innerProperties() == null ? null : this.innerProperties().immutabilityPeriodSinceCreationInDays();
    }

    /**
     * Set the immutabilityPeriodSinceCreationInDays property: The immutability period for the blobs in the container
     * since the policy creation, in days.
     * 
     * @param immutabilityPeriodSinceCreationInDays the immutabilityPeriodSinceCreationInDays value to set.
     * @return the ImmutabilityPolicyProperties object itself.
     */
    public ImmutabilityPolicyProperties
        withImmutabilityPeriodSinceCreationInDays(Integer immutabilityPeriodSinceCreationInDays) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ImmutabilityPolicyProperty();
        }
        this.innerProperties().withImmutabilityPeriodSinceCreationInDays(immutabilityPeriodSinceCreationInDays);
        return this;
    }

    /**
     * Get the state property: The ImmutabilityPolicy state of a blob container, possible values include: Locked and
     * Unlocked.
     * 
     * @return the state value.
     */
    public ImmutabilityPolicyState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Get the allowProtectedAppendWrites property: This property can only be changed for unlocked time-based retention
     * policies. When enabled, new blocks can be written to an append blob while maintaining immutability protection and
     * compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted. This property
     * cannot be changed with ExtendImmutabilityPolicy API.
     * 
     * @return the allowProtectedAppendWrites value.
     */
    public Boolean allowProtectedAppendWrites() {
        return this.innerProperties() == null ? null : this.innerProperties().allowProtectedAppendWrites();
    }

    /**
     * Set the allowProtectedAppendWrites property: This property can only be changed for unlocked time-based retention
     * policies. When enabled, new blocks can be written to an append blob while maintaining immutability protection and
     * compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted. This property
     * cannot be changed with ExtendImmutabilityPolicy API.
     * 
     * @param allowProtectedAppendWrites the allowProtectedAppendWrites value to set.
     * @return the ImmutabilityPolicyProperties object itself.
     */
    public ImmutabilityPolicyProperties withAllowProtectedAppendWrites(Boolean allowProtectedAppendWrites) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ImmutabilityPolicyProperty();
        }
        this.innerProperties().withAllowProtectedAppendWrites(allowProtectedAppendWrites);
        return this;
    }

    /**
     * Get the allowProtectedAppendWritesAll property: This property can only be changed for unlocked time-based
     * retention policies. When enabled, new blocks can be written to both 'Append and Bock Blobs' while maintaining
     * immutability protection and compliance. Only new blocks can be added and any existing blocks cannot be modified
     * or deleted. This property cannot be changed with ExtendImmutabilityPolicy API. The 'allowProtectedAppendWrites'
     * and 'allowProtectedAppendWritesAll' properties are mutually exclusive.
     * 
     * @return the allowProtectedAppendWritesAll value.
     */
    public Boolean allowProtectedAppendWritesAll() {
        return this.innerProperties() == null ? null : this.innerProperties().allowProtectedAppendWritesAll();
    }

    /**
     * Set the allowProtectedAppendWritesAll property: This property can only be changed for unlocked time-based
     * retention policies. When enabled, new blocks can be written to both 'Append and Bock Blobs' while maintaining
     * immutability protection and compliance. Only new blocks can be added and any existing blocks cannot be modified
     * or deleted. This property cannot be changed with ExtendImmutabilityPolicy API. The 'allowProtectedAppendWrites'
     * and 'allowProtectedAppendWritesAll' properties are mutually exclusive.
     * 
     * @param allowProtectedAppendWritesAll the allowProtectedAppendWritesAll value to set.
     * @return the ImmutabilityPolicyProperties object itself.
     */
    public ImmutabilityPolicyProperties withAllowProtectedAppendWritesAll(Boolean allowProtectedAppendWritesAll) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ImmutabilityPolicyProperty();
        }
        this.innerProperties().withAllowProtectedAppendWritesAll(allowProtectedAppendWritesAll);
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
        if (updateHistory() != null) {
            updateHistory().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ImmutabilityPolicyProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ImmutabilityPolicyProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ImmutabilityPolicyProperties.
     */
    public static ImmutabilityPolicyProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ImmutabilityPolicyProperties deserializedImmutabilityPolicyProperties = new ImmutabilityPolicyProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedImmutabilityPolicyProperties.innerProperties
                        = ImmutabilityPolicyProperty.fromJson(reader);
                } else if ("etag".equals(fieldName)) {
                    deserializedImmutabilityPolicyProperties.etag = reader.getString();
                } else if ("updateHistory".equals(fieldName)) {
                    List<UpdateHistoryProperty> updateHistory
                        = reader.readArray(reader1 -> UpdateHistoryProperty.fromJson(reader1));
                    deserializedImmutabilityPolicyProperties.updateHistory = updateHistory;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedImmutabilityPolicyProperties;
        });
    }
}
