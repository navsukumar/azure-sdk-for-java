// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.fluent.models.SecurityRuleInner;
import java.io.IOException;
import java.util.List;

/**
 * Subnet and it's custom security rules.
 */
@Fluent
public final class SubnetAssociation implements JsonSerializable<SubnetAssociation> {
    /*
     * Subnet ID.
     */
    private String id;

    /*
     * Collection of custom security rules.
     */
    private List<SecurityRuleInner> securityRules;

    /**
     * Creates an instance of SubnetAssociation class.
     */
    public SubnetAssociation() {
    }

    /**
     * Get the id property: Subnet ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the securityRules property: Collection of custom security rules.
     * 
     * @return the securityRules value.
     */
    public List<SecurityRuleInner> securityRules() {
        return this.securityRules;
    }

    /**
     * Set the securityRules property: Collection of custom security rules.
     * 
     * @param securityRules the securityRules value to set.
     * @return the SubnetAssociation object itself.
     */
    public SubnetAssociation withSecurityRules(List<SecurityRuleInner> securityRules) {
        this.securityRules = securityRules;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (securityRules() != null) {
            securityRules().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("securityRules", this.securityRules, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SubnetAssociation from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SubnetAssociation if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SubnetAssociation.
     */
    public static SubnetAssociation fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SubnetAssociation deserializedSubnetAssociation = new SubnetAssociation();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedSubnetAssociation.id = reader.getString();
                } else if ("securityRules".equals(fieldName)) {
                    List<SecurityRuleInner> securityRules
                        = reader.readArray(reader1 -> SecurityRuleInner.fromJson(reader1));
                    deserializedSubnetAssociation.securityRules = securityRules;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSubnetAssociation;
        });
    }
}
