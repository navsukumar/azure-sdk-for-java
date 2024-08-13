// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.ProvisioningState;
import java.io.IOException;
import java.util.List;

/**
 * Service Endpoint Policy resource.
 */
@Fluent
public final class ServiceEndpointPolicyPropertiesFormat
    implements JsonSerializable<ServiceEndpointPolicyPropertiesFormat> {
    /*
     * A collection of service endpoint policy definitions of the service endpoint policy.
     */
    private List<ServiceEndpointPolicyDefinitionInner> serviceEndpointPolicyDefinitions;

    /*
     * A collection of references to subnets.
     */
    private List<SubnetInner> subnets;

    /*
     * The resource GUID property of the service endpoint policy resource.
     */
    private String resourceGuid;

    /*
     * The provisioning state of the service endpoint policy resource.
     */
    private ProvisioningState provisioningState;

    /*
     * The alias indicating if the policy belongs to a service
     */
    private String serviceAlias;

    /*
     * A collection of contextual service endpoint policy.
     */
    private List<String> contextualServiceEndpointPolicies;

    /**
     * Creates an instance of ServiceEndpointPolicyPropertiesFormat class.
     */
    public ServiceEndpointPolicyPropertiesFormat() {
    }

    /**
     * Get the serviceEndpointPolicyDefinitions property: A collection of service endpoint policy definitions of the
     * service endpoint policy.
     * 
     * @return the serviceEndpointPolicyDefinitions value.
     */
    public List<ServiceEndpointPolicyDefinitionInner> serviceEndpointPolicyDefinitions() {
        return this.serviceEndpointPolicyDefinitions;
    }

    /**
     * Set the serviceEndpointPolicyDefinitions property: A collection of service endpoint policy definitions of the
     * service endpoint policy.
     * 
     * @param serviceEndpointPolicyDefinitions the serviceEndpointPolicyDefinitions value to set.
     * @return the ServiceEndpointPolicyPropertiesFormat object itself.
     */
    public ServiceEndpointPolicyPropertiesFormat withServiceEndpointPolicyDefinitions(
        List<ServiceEndpointPolicyDefinitionInner> serviceEndpointPolicyDefinitions) {
        this.serviceEndpointPolicyDefinitions = serviceEndpointPolicyDefinitions;
        return this;
    }

    /**
     * Get the subnets property: A collection of references to subnets.
     * 
     * @return the subnets value.
     */
    public List<SubnetInner> subnets() {
        return this.subnets;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the service endpoint policy resource.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the service endpoint policy resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the serviceAlias property: The alias indicating if the policy belongs to a service.
     * 
     * @return the serviceAlias value.
     */
    public String serviceAlias() {
        return this.serviceAlias;
    }

    /**
     * Set the serviceAlias property: The alias indicating if the policy belongs to a service.
     * 
     * @param serviceAlias the serviceAlias value to set.
     * @return the ServiceEndpointPolicyPropertiesFormat object itself.
     */
    public ServiceEndpointPolicyPropertiesFormat withServiceAlias(String serviceAlias) {
        this.serviceAlias = serviceAlias;
        return this;
    }

    /**
     * Get the contextualServiceEndpointPolicies property: A collection of contextual service endpoint policy.
     * 
     * @return the contextualServiceEndpointPolicies value.
     */
    public List<String> contextualServiceEndpointPolicies() {
        return this.contextualServiceEndpointPolicies;
    }

    /**
     * Set the contextualServiceEndpointPolicies property: A collection of contextual service endpoint policy.
     * 
     * @param contextualServiceEndpointPolicies the contextualServiceEndpointPolicies value to set.
     * @return the ServiceEndpointPolicyPropertiesFormat object itself.
     */
    public ServiceEndpointPolicyPropertiesFormat
        withContextualServiceEndpointPolicies(List<String> contextualServiceEndpointPolicies) {
        this.contextualServiceEndpointPolicies = contextualServiceEndpointPolicies;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (serviceEndpointPolicyDefinitions() != null) {
            serviceEndpointPolicyDefinitions().forEach(e -> e.validate());
        }
        if (subnets() != null) {
            subnets().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("serviceEndpointPolicyDefinitions", this.serviceEndpointPolicyDefinitions,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("serviceAlias", this.serviceAlias);
        jsonWriter.writeArrayField("contextualServiceEndpointPolicies", this.contextualServiceEndpointPolicies,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServiceEndpointPolicyPropertiesFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServiceEndpointPolicyPropertiesFormat if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ServiceEndpointPolicyPropertiesFormat.
     */
    public static ServiceEndpointPolicyPropertiesFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServiceEndpointPolicyPropertiesFormat deserializedServiceEndpointPolicyPropertiesFormat
                = new ServiceEndpointPolicyPropertiesFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("serviceEndpointPolicyDefinitions".equals(fieldName)) {
                    List<ServiceEndpointPolicyDefinitionInner> serviceEndpointPolicyDefinitions
                        = reader.readArray(reader1 -> ServiceEndpointPolicyDefinitionInner.fromJson(reader1));
                    deserializedServiceEndpointPolicyPropertiesFormat.serviceEndpointPolicyDefinitions
                        = serviceEndpointPolicyDefinitions;
                } else if ("subnets".equals(fieldName)) {
                    List<SubnetInner> subnets = reader.readArray(reader1 -> SubnetInner.fromJson(reader1));
                    deserializedServiceEndpointPolicyPropertiesFormat.subnets = subnets;
                } else if ("resourceGuid".equals(fieldName)) {
                    deserializedServiceEndpointPolicyPropertiesFormat.resourceGuid = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedServiceEndpointPolicyPropertiesFormat.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("serviceAlias".equals(fieldName)) {
                    deserializedServiceEndpointPolicyPropertiesFormat.serviceAlias = reader.getString();
                } else if ("contextualServiceEndpointPolicies".equals(fieldName)) {
                    List<String> contextualServiceEndpointPolicies = reader.readArray(reader1 -> reader1.getString());
                    deserializedServiceEndpointPolicyPropertiesFormat.contextualServiceEndpointPolicies
                        = contextualServiceEndpointPolicies;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServiceEndpointPolicyPropertiesFormat;
        });
    }
}
