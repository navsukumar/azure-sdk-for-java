// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.sql.fluent.models.IPv6FirewallRuleInner;
import java.io.IOException;
import java.util.List;

/**
 * The response to a list IPv6 firewall rules request.
 */
@Immutable
public final class IPv6FirewallRuleListResult implements JsonSerializable<IPv6FirewallRuleListResult> {
    /*
     * Array of results.
     */
    private List<IPv6FirewallRuleInner> value;

    /*
     * Link to retrieve next page of results.
     */
    private String nextLink;

    /**
     * Creates an instance of IPv6FirewallRuleListResult class.
     */
    public IPv6FirewallRuleListResult() {
    }

    /**
     * Get the value property: Array of results.
     * 
     * @return the value value.
     */
    public List<IPv6FirewallRuleInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: Link to retrieve next page of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IPv6FirewallRuleListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IPv6FirewallRuleListResult if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the IPv6FirewallRuleListResult.
     */
    public static IPv6FirewallRuleListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IPv6FirewallRuleListResult deserializedIPv6FirewallRuleListResult = new IPv6FirewallRuleListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<IPv6FirewallRuleInner> value
                        = reader.readArray(reader1 -> IPv6FirewallRuleInner.fromJson(reader1));
                    deserializedIPv6FirewallRuleListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedIPv6FirewallRuleListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIPv6FirewallRuleListResult;
        });
    }
}
