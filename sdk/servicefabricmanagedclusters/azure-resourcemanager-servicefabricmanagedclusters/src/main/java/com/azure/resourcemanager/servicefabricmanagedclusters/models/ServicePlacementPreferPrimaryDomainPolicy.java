// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes the policy to be used for placement of a Service Fabric service where the service's
 * Primary replicas should optimally be placed in a particular domain.
 * 
 * This placement policy is usually used with fault domains in scenarios where the Service Fabric
 * cluster is geographically distributed in order to indicate that a service's primary replica should
 * be located in a particular fault domain, which in geo-distributed scenarios usually aligns with regional
 * or datacenter boundaries. Note that since this is an optimization it is possible that the Primary replica
 * may not end up located in this domain due to failures, capacity limits, or other constraints.
 */
@Fluent
public final class ServicePlacementPreferPrimaryDomainPolicy extends ServicePlacementPolicy {
    /*
     * The type of placement policy for a service fabric service. Following are the possible values.
     */
    private ServicePlacementPolicyType type = ServicePlacementPolicyType.PREFERRED_PRIMARY_DOMAIN;

    /*
     * The name of the domain that should used for placement as per this policy.
     */
    private String domainName;

    /**
     * Creates an instance of ServicePlacementPreferPrimaryDomainPolicy class.
     */
    public ServicePlacementPreferPrimaryDomainPolicy() {
    }

    /**
     * Get the type property: The type of placement policy for a service fabric service. Following are the possible
     * values.
     * 
     * @return the type value.
     */
    @Override
    public ServicePlacementPolicyType type() {
        return this.type;
    }

    /**
     * Get the domainName property: The name of the domain that should used for placement as per this policy.
     * 
     * @return the domainName value.
     */
    public String domainName() {
        return this.domainName;
    }

    /**
     * Set the domainName property: The name of the domain that should used for placement as per this policy.
     * 
     * @param domainName the domainName value to set.
     * @return the ServicePlacementPreferPrimaryDomainPolicy object itself.
     */
    public ServicePlacementPreferPrimaryDomainPolicy withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (domainName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property domainName in model ServicePlacementPreferPrimaryDomainPolicy"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServicePlacementPreferPrimaryDomainPolicy.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("domainName", this.domainName);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServicePlacementPreferPrimaryDomainPolicy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServicePlacementPreferPrimaryDomainPolicy if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ServicePlacementPreferPrimaryDomainPolicy.
     */
    public static ServicePlacementPreferPrimaryDomainPolicy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServicePlacementPreferPrimaryDomainPolicy deserializedServicePlacementPreferPrimaryDomainPolicy
                = new ServicePlacementPreferPrimaryDomainPolicy();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("domainName".equals(fieldName)) {
                    deserializedServicePlacementPreferPrimaryDomainPolicy.domainName = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedServicePlacementPreferPrimaryDomainPolicy.type
                        = ServicePlacementPolicyType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServicePlacementPreferPrimaryDomainPolicy;
        });
    }
}
