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
import java.util.List;

/**
 * ThreatIntel Whitelist for Firewall Policy.
 */
@Fluent
public final class FirewallPolicyThreatIntelWhitelist implements JsonSerializable<FirewallPolicyThreatIntelWhitelist> {
    /*
     * List of IP addresses for the ThreatIntel Whitelist.
     */
    private List<String> ipAddresses;

    /*
     * List of FQDNs for the ThreatIntel Whitelist.
     */
    private List<String> fqdns;

    /**
     * Creates an instance of FirewallPolicyThreatIntelWhitelist class.
     */
    public FirewallPolicyThreatIntelWhitelist() {
    }

    /**
     * Get the ipAddresses property: List of IP addresses for the ThreatIntel Whitelist.
     * 
     * @return the ipAddresses value.
     */
    public List<String> ipAddresses() {
        return this.ipAddresses;
    }

    /**
     * Set the ipAddresses property: List of IP addresses for the ThreatIntel Whitelist.
     * 
     * @param ipAddresses the ipAddresses value to set.
     * @return the FirewallPolicyThreatIntelWhitelist object itself.
     */
    public FirewallPolicyThreatIntelWhitelist withIpAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
        return this;
    }

    /**
     * Get the fqdns property: List of FQDNs for the ThreatIntel Whitelist.
     * 
     * @return the fqdns value.
     */
    public List<String> fqdns() {
        return this.fqdns;
    }

    /**
     * Set the fqdns property: List of FQDNs for the ThreatIntel Whitelist.
     * 
     * @param fqdns the fqdns value to set.
     * @return the FirewallPolicyThreatIntelWhitelist object itself.
     */
    public FirewallPolicyThreatIntelWhitelist withFqdns(List<String> fqdns) {
        this.fqdns = fqdns;
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
        jsonWriter.writeArrayField("ipAddresses", this.ipAddresses, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("fqdns", this.fqdns, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FirewallPolicyThreatIntelWhitelist from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FirewallPolicyThreatIntelWhitelist if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the FirewallPolicyThreatIntelWhitelist.
     */
    public static FirewallPolicyThreatIntelWhitelist fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FirewallPolicyThreatIntelWhitelist deserializedFirewallPolicyThreatIntelWhitelist
                = new FirewallPolicyThreatIntelWhitelist();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("ipAddresses".equals(fieldName)) {
                    List<String> ipAddresses = reader.readArray(reader1 -> reader1.getString());
                    deserializedFirewallPolicyThreatIntelWhitelist.ipAddresses = ipAddresses;
                } else if ("fqdns".equals(fieldName)) {
                    List<String> fqdns = reader.readArray(reader1 -> reader1.getString());
                    deserializedFirewallPolicyThreatIntelWhitelist.fqdns = fqdns;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFirewallPolicyThreatIntelWhitelist;
        });
    }
}
