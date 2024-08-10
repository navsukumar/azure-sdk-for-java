// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.FirewallPolicyRuleCollection;
import java.io.IOException;
import java.util.List;

/**
 * Rule Collection Group resource.
 */
@Fluent
public final class FirewallPolicyRuleCollectionGroupDraftInner extends SubResource {
    /*
     * The properties of the firewall policy rule collection group.
     */
    private FirewallPolicyRuleCollectionGroupDraftProperties innerProperties;

    /*
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     */
    private String name;

    /*
     * Rule Group type.
     */
    private String type;

    /**
     * Creates an instance of FirewallPolicyRuleCollectionGroupDraftInner class.
     */
    public FirewallPolicyRuleCollectionGroupDraftInner() {
    }

    /**
     * Get the innerProperties property: The properties of the firewall policy rule collection group.
     * 
     * @return the innerProperties value.
     */
    private FirewallPolicyRuleCollectionGroupDraftProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     * 
     * @param name the name value to set.
     * @return the FirewallPolicyRuleCollectionGroupDraftInner object itself.
     */
    public FirewallPolicyRuleCollectionGroupDraftInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Rule Group type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FirewallPolicyRuleCollectionGroupDraftInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the size property: A read-only string that represents the size of the
     * FirewallPolicyRuleCollectionGroupProperties in MB. (ex 1.2MB).
     * 
     * @return the size value.
     */
    public String size() {
        return this.innerProperties() == null ? null : this.innerProperties().size();
    }

    /**
     * Get the priority property: Priority of the Firewall Policy Rule Collection Group resource.
     * 
     * @return the priority value.
     */
    public Integer priority() {
        return this.innerProperties() == null ? null : this.innerProperties().priority();
    }

    /**
     * Set the priority property: Priority of the Firewall Policy Rule Collection Group resource.
     * 
     * @param priority the priority value to set.
     * @return the FirewallPolicyRuleCollectionGroupDraftInner object itself.
     */
    public FirewallPolicyRuleCollectionGroupDraftInner withPriority(Integer priority) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FirewallPolicyRuleCollectionGroupDraftProperties();
        }
        this.innerProperties().withPriority(priority);
        return this;
    }

    /**
     * Get the ruleCollections property: Group of Firewall Policy rule collections.
     * 
     * @return the ruleCollections value.
     */
    public List<FirewallPolicyRuleCollection> ruleCollections() {
        return this.innerProperties() == null ? null : this.innerProperties().ruleCollections();
    }

    /**
     * Set the ruleCollections property: Group of Firewall Policy rule collections.
     * 
     * @param ruleCollections the ruleCollections value to set.
     * @return the FirewallPolicyRuleCollectionGroupDraftInner object itself.
     */
    public FirewallPolicyRuleCollectionGroupDraftInner
        withRuleCollections(List<FirewallPolicyRuleCollection> ruleCollections) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FirewallPolicyRuleCollectionGroupDraftProperties();
        }
        this.innerProperties().withRuleCollections(ruleCollections);
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
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FirewallPolicyRuleCollectionGroupDraftInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FirewallPolicyRuleCollectionGroupDraftInner if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the FirewallPolicyRuleCollectionGroupDraftInner.
     */
    public static FirewallPolicyRuleCollectionGroupDraftInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FirewallPolicyRuleCollectionGroupDraftInner deserializedFirewallPolicyRuleCollectionGroupDraftInner
                = new FirewallPolicyRuleCollectionGroupDraftInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedFirewallPolicyRuleCollectionGroupDraftInner.withId(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedFirewallPolicyRuleCollectionGroupDraftInner.innerProperties
                        = FirewallPolicyRuleCollectionGroupDraftProperties.fromJson(reader);
                } else if ("name".equals(fieldName)) {
                    deserializedFirewallPolicyRuleCollectionGroupDraftInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedFirewallPolicyRuleCollectionGroupDraftInner.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFirewallPolicyRuleCollectionGroupDraftInner;
        });
    }
}
