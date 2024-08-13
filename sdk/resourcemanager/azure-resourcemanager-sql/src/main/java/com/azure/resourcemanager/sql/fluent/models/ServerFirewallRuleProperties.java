// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The properties of a server firewall rule.
 */
@Fluent
public final class ServerFirewallRuleProperties implements JsonSerializable<ServerFirewallRuleProperties> {
    /*
     * The start IP address of the firewall rule. Must be IPv4 format. Use value '0.0.0.0' for all Azure-internal IP
     * addresses.
     */
    private String startIpAddress;

    /*
     * The end IP address of the firewall rule. Must be IPv4 format. Must be greater than or equal to startIpAddress.
     * Use value '0.0.0.0' for all Azure-internal IP addresses.
     */
    private String endIpAddress;

    /**
     * Creates an instance of ServerFirewallRuleProperties class.
     */
    public ServerFirewallRuleProperties() {
    }

    /**
     * Get the startIpAddress property: The start IP address of the firewall rule. Must be IPv4 format. Use value
     * '0.0.0.0' for all Azure-internal IP addresses.
     * 
     * @return the startIpAddress value.
     */
    public String startIpAddress() {
        return this.startIpAddress;
    }

    /**
     * Set the startIpAddress property: The start IP address of the firewall rule. Must be IPv4 format. Use value
     * '0.0.0.0' for all Azure-internal IP addresses.
     * 
     * @param startIpAddress the startIpAddress value to set.
     * @return the ServerFirewallRuleProperties object itself.
     */
    public ServerFirewallRuleProperties withStartIpAddress(String startIpAddress) {
        this.startIpAddress = startIpAddress;
        return this;
    }

    /**
     * Get the endIpAddress property: The end IP address of the firewall rule. Must be IPv4 format. Must be greater than
     * or equal to startIpAddress. Use value '0.0.0.0' for all Azure-internal IP addresses.
     * 
     * @return the endIpAddress value.
     */
    public String endIpAddress() {
        return this.endIpAddress;
    }

    /**
     * Set the endIpAddress property: The end IP address of the firewall rule. Must be IPv4 format. Must be greater than
     * or equal to startIpAddress. Use value '0.0.0.0' for all Azure-internal IP addresses.
     * 
     * @param endIpAddress the endIpAddress value to set.
     * @return the ServerFirewallRuleProperties object itself.
     */
    public ServerFirewallRuleProperties withEndIpAddress(String endIpAddress) {
        this.endIpAddress = endIpAddress;
        return this;
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
        jsonWriter.writeStringField("startIpAddress", this.startIpAddress);
        jsonWriter.writeStringField("endIpAddress", this.endIpAddress);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServerFirewallRuleProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServerFirewallRuleProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ServerFirewallRuleProperties.
     */
    public static ServerFirewallRuleProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServerFirewallRuleProperties deserializedServerFirewallRuleProperties = new ServerFirewallRuleProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("startIpAddress".equals(fieldName)) {
                    deserializedServerFirewallRuleProperties.startIpAddress = reader.getString();
                } else if ("endIpAddress".equals(fieldName)) {
                    deserializedServerFirewallRuleProperties.endIpAddress = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServerFirewallRuleProperties;
        });
    }
}
