// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Properties of the delegation.
 */
@Fluent
public final class DelegationProperties implements JsonSerializable<DelegationProperties> {
    /*
     * The service name to which the NVA is delegated.
     */
    private String serviceName;

    /*
     * The current provisioning state.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of DelegationProperties class.
     */
    public DelegationProperties() {
    }

    /**
     * Get the serviceName property: The service name to which the NVA is delegated.
     * 
     * @return the serviceName value.
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName property: The service name to which the NVA is delegated.
     * 
     * @param serviceName the serviceName value to set.
     * @return the DelegationProperties object itself.
     */
    public DelegationProperties withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get the provisioningState property: The current provisioning state.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("serviceName", this.serviceName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DelegationProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DelegationProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DelegationProperties.
     */
    public static DelegationProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DelegationProperties deserializedDelegationProperties = new DelegationProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("serviceName".equals(fieldName)) {
                    deserializedDelegationProperties.serviceName = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedDelegationProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDelegationProperties;
        });
    }
}
