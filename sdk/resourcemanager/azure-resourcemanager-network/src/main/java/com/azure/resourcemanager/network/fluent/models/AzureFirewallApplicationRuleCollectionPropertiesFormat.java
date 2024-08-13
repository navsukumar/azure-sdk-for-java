// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.AzureFirewallApplicationRule;
import com.azure.resourcemanager.network.models.AzureFirewallRCAction;
import com.azure.resourcemanager.network.models.ProvisioningState;
import java.io.IOException;
import java.util.List;

/**
 * Properties of the application rule collection.
 */
@Fluent
public final class AzureFirewallApplicationRuleCollectionPropertiesFormat
    implements JsonSerializable<AzureFirewallApplicationRuleCollectionPropertiesFormat> {
    /*
     * Priority of the application rule collection resource.
     */
    private Integer priority;

    /*
     * The action type of a rule collection.
     */
    private AzureFirewallRCAction action;

    /*
     * Collection of rules used by a application rule collection.
     */
    private List<AzureFirewallApplicationRule> rules;

    /*
     * The provisioning state of the application rule collection resource.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of AzureFirewallApplicationRuleCollectionPropertiesFormat class.
     */
    public AzureFirewallApplicationRuleCollectionPropertiesFormat() {
    }

    /**
     * Get the priority property: Priority of the application rule collection resource.
     * 
     * @return the priority value.
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Priority of the application rule collection resource.
     * 
     * @param priority the priority value to set.
     * @return the AzureFirewallApplicationRuleCollectionPropertiesFormat object itself.
     */
    public AzureFirewallApplicationRuleCollectionPropertiesFormat withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the action property: The action type of a rule collection.
     * 
     * @return the action value.
     */
    public AzureFirewallRCAction action() {
        return this.action;
    }

    /**
     * Set the action property: The action type of a rule collection.
     * 
     * @param action the action value to set.
     * @return the AzureFirewallApplicationRuleCollectionPropertiesFormat object itself.
     */
    public AzureFirewallApplicationRuleCollectionPropertiesFormat withAction(AzureFirewallRCAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get the rules property: Collection of rules used by a application rule collection.
     * 
     * @return the rules value.
     */
    public List<AzureFirewallApplicationRule> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: Collection of rules used by a application rule collection.
     * 
     * @param rules the rules value to set.
     * @return the AzureFirewallApplicationRuleCollectionPropertiesFormat object itself.
     */
    public AzureFirewallApplicationRuleCollectionPropertiesFormat withRules(List<AzureFirewallApplicationRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the application rule collection resource.
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
        if (action() != null) {
            action().validate();
        }
        if (rules() != null) {
            rules().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("priority", this.priority);
        jsonWriter.writeJsonField("action", this.action);
        jsonWriter.writeArrayField("rules", this.rules, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureFirewallApplicationRuleCollectionPropertiesFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureFirewallApplicationRuleCollectionPropertiesFormat if the JsonReader was pointing to
     * an instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureFirewallApplicationRuleCollectionPropertiesFormat.
     */
    public static AzureFirewallApplicationRuleCollectionPropertiesFormat fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            AzureFirewallApplicationRuleCollectionPropertiesFormat deserializedAzureFirewallApplicationRuleCollectionPropertiesFormat
                = new AzureFirewallApplicationRuleCollectionPropertiesFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("priority".equals(fieldName)) {
                    deserializedAzureFirewallApplicationRuleCollectionPropertiesFormat.priority
                        = reader.getNullable(JsonReader::getInt);
                } else if ("action".equals(fieldName)) {
                    deserializedAzureFirewallApplicationRuleCollectionPropertiesFormat.action
                        = AzureFirewallRCAction.fromJson(reader);
                } else if ("rules".equals(fieldName)) {
                    List<AzureFirewallApplicationRule> rules
                        = reader.readArray(reader1 -> AzureFirewallApplicationRule.fromJson(reader1));
                    deserializedAzureFirewallApplicationRuleCollectionPropertiesFormat.rules = rules;
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedAzureFirewallApplicationRuleCollectionPropertiesFormat.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureFirewallApplicationRuleCollectionPropertiesFormat;
        });
    }
}
