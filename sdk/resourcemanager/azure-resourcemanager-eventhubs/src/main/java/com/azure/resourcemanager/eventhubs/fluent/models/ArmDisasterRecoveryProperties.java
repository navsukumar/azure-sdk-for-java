// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.eventhubs.models.ProvisioningStateDR;
import com.azure.resourcemanager.eventhubs.models.RoleDisasterRecovery;
import java.io.IOException;

/**
 * Properties required to the Create Or Update Alias(Disaster Recovery configurations).
 */
@Fluent
public final class ArmDisasterRecoveryProperties implements JsonSerializable<ArmDisasterRecoveryProperties> {
    /*
     * Provisioning state of the Alias(Disaster Recovery configuration) - possible values 'Accepted' or 'Succeeded' or
     * 'Failed'
     */
    private ProvisioningStateDR provisioningState;

    /*
     * ARM Id of the Primary/Secondary eventhub namespace name, which is part of GEO DR pairing
     */
    private String partnerNamespace;

    /*
     * Alternate name specified when alias and namespace names are same.
     */
    private String alternateName;

    /*
     * role of namespace in GEO DR - possible values 'Primary' or 'PrimaryNotReplicating' or 'Secondary'
     */
    private RoleDisasterRecovery role;

    /*
     * Number of entities pending to be replicated.
     */
    private Long pendingReplicationOperationsCount;

    /**
     * Creates an instance of ArmDisasterRecoveryProperties class.
     */
    public ArmDisasterRecoveryProperties() {
    }

    /**
     * Get the provisioningState property: Provisioning state of the Alias(Disaster Recovery configuration) - possible
     * values 'Accepted' or 'Succeeded' or 'Failed'.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningStateDR provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the partnerNamespace property: ARM Id of the Primary/Secondary eventhub namespace name, which is part of GEO
     * DR pairing.
     * 
     * @return the partnerNamespace value.
     */
    public String partnerNamespace() {
        return this.partnerNamespace;
    }

    /**
     * Set the partnerNamespace property: ARM Id of the Primary/Secondary eventhub namespace name, which is part of GEO
     * DR pairing.
     * 
     * @param partnerNamespace the partnerNamespace value to set.
     * @return the ArmDisasterRecoveryProperties object itself.
     */
    public ArmDisasterRecoveryProperties withPartnerNamespace(String partnerNamespace) {
        this.partnerNamespace = partnerNamespace;
        return this;
    }

    /**
     * Get the alternateName property: Alternate name specified when alias and namespace names are same.
     * 
     * @return the alternateName value.
     */
    public String alternateName() {
        return this.alternateName;
    }

    /**
     * Set the alternateName property: Alternate name specified when alias and namespace names are same.
     * 
     * @param alternateName the alternateName value to set.
     * @return the ArmDisasterRecoveryProperties object itself.
     */
    public ArmDisasterRecoveryProperties withAlternateName(String alternateName) {
        this.alternateName = alternateName;
        return this;
    }

    /**
     * Get the role property: role of namespace in GEO DR - possible values 'Primary' or 'PrimaryNotReplicating' or
     * 'Secondary'.
     * 
     * @return the role value.
     */
    public RoleDisasterRecovery role() {
        return this.role;
    }

    /**
     * Get the pendingReplicationOperationsCount property: Number of entities pending to be replicated.
     * 
     * @return the pendingReplicationOperationsCount value.
     */
    public Long pendingReplicationOperationsCount() {
        return this.pendingReplicationOperationsCount;
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
        jsonWriter.writeStringField("partnerNamespace", this.partnerNamespace);
        jsonWriter.writeStringField("alternateName", this.alternateName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ArmDisasterRecoveryProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ArmDisasterRecoveryProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ArmDisasterRecoveryProperties.
     */
    public static ArmDisasterRecoveryProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ArmDisasterRecoveryProperties deserializedArmDisasterRecoveryProperties
                = new ArmDisasterRecoveryProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedArmDisasterRecoveryProperties.provisioningState
                        = ProvisioningStateDR.fromString(reader.getString());
                } else if ("partnerNamespace".equals(fieldName)) {
                    deserializedArmDisasterRecoveryProperties.partnerNamespace = reader.getString();
                } else if ("alternateName".equals(fieldName)) {
                    deserializedArmDisasterRecoveryProperties.alternateName = reader.getString();
                } else if ("role".equals(fieldName)) {
                    deserializedArmDisasterRecoveryProperties.role
                        = RoleDisasterRecovery.fromString(reader.getString());
                } else if ("pendingReplicationOperationsCount".equals(fieldName)) {
                    deserializedArmDisasterRecoveryProperties.pendingReplicationOperationsCount
                        = reader.getNullable(JsonReader::getLong);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedArmDisasterRecoveryProperties;
        });
    }
}
