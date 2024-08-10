// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Profile of the managed cluster NAT gateway.
 */
@Fluent
public final class ManagedClusterNatGatewayProfile implements JsonSerializable<ManagedClusterNatGatewayProfile> {
    /*
     * Profile of the managed outbound IP resources of the cluster NAT gateway.
     */
    private ManagedClusterManagedOutboundIpProfile managedOutboundIpProfile;

    /*
     * The effective outbound IP resources of the cluster NAT gateway.
     */
    private List<ResourceReference> effectiveOutboundIPs;

    /*
     * Desired outbound flow idle timeout in minutes. Allowed values are in the range of 4 to 120 (inclusive). The
     * default value is 4 minutes.
     */
    private Integer idleTimeoutInMinutes;

    /**
     * Creates an instance of ManagedClusterNatGatewayProfile class.
     */
    public ManagedClusterNatGatewayProfile() {
    }

    /**
     * Get the managedOutboundIpProfile property: Profile of the managed outbound IP resources of the cluster NAT
     * gateway.
     * 
     * @return the managedOutboundIpProfile value.
     */
    public ManagedClusterManagedOutboundIpProfile managedOutboundIpProfile() {
        return this.managedOutboundIpProfile;
    }

    /**
     * Set the managedOutboundIpProfile property: Profile of the managed outbound IP resources of the cluster NAT
     * gateway.
     * 
     * @param managedOutboundIpProfile the managedOutboundIpProfile value to set.
     * @return the ManagedClusterNatGatewayProfile object itself.
     */
    public ManagedClusterNatGatewayProfile
        withManagedOutboundIpProfile(ManagedClusterManagedOutboundIpProfile managedOutboundIpProfile) {
        this.managedOutboundIpProfile = managedOutboundIpProfile;
        return this;
    }

    /**
     * Get the effectiveOutboundIPs property: The effective outbound IP resources of the cluster NAT gateway.
     * 
     * @return the effectiveOutboundIPs value.
     */
    public List<ResourceReference> effectiveOutboundIPs() {
        return this.effectiveOutboundIPs;
    }

    /**
     * Set the effectiveOutboundIPs property: The effective outbound IP resources of the cluster NAT gateway.
     * 
     * @param effectiveOutboundIPs the effectiveOutboundIPs value to set.
     * @return the ManagedClusterNatGatewayProfile object itself.
     */
    public ManagedClusterNatGatewayProfile withEffectiveOutboundIPs(List<ResourceReference> effectiveOutboundIPs) {
        this.effectiveOutboundIPs = effectiveOutboundIPs;
        return this;
    }

    /**
     * Get the idleTimeoutInMinutes property: Desired outbound flow idle timeout in minutes. Allowed values are in the
     * range of 4 to 120 (inclusive). The default value is 4 minutes.
     * 
     * @return the idleTimeoutInMinutes value.
     */
    public Integer idleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }

    /**
     * Set the idleTimeoutInMinutes property: Desired outbound flow idle timeout in minutes. Allowed values are in the
     * range of 4 to 120 (inclusive). The default value is 4 minutes.
     * 
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set.
     * @return the ManagedClusterNatGatewayProfile object itself.
     */
    public ManagedClusterNatGatewayProfile withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (managedOutboundIpProfile() != null) {
            managedOutboundIpProfile().validate();
        }
        if (effectiveOutboundIPs() != null) {
            effectiveOutboundIPs().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("managedOutboundIPProfile", this.managedOutboundIpProfile);
        jsonWriter.writeArrayField("effectiveOutboundIPs", this.effectiveOutboundIPs,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeNumberField("idleTimeoutInMinutes", this.idleTimeoutInMinutes);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedClusterNatGatewayProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedClusterNatGatewayProfile if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ManagedClusterNatGatewayProfile.
     */
    public static ManagedClusterNatGatewayProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedClusterNatGatewayProfile deserializedManagedClusterNatGatewayProfile
                = new ManagedClusterNatGatewayProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("managedOutboundIPProfile".equals(fieldName)) {
                    deserializedManagedClusterNatGatewayProfile.managedOutboundIpProfile
                        = ManagedClusterManagedOutboundIpProfile.fromJson(reader);
                } else if ("effectiveOutboundIPs".equals(fieldName)) {
                    List<ResourceReference> effectiveOutboundIPs
                        = reader.readArray(reader1 -> ResourceReference.fromJson(reader1));
                    deserializedManagedClusterNatGatewayProfile.effectiveOutboundIPs = effectiveOutboundIPs;
                } else if ("idleTimeoutInMinutes".equals(fieldName)) {
                    deserializedManagedClusterNatGatewayProfile.idleTimeoutInMinutes
                        = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedClusterNatGatewayProfile;
        });
    }
}
