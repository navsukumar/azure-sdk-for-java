// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Describes a network security rule.
 */
@Fluent
public final class NetworkSecurityRule implements JsonSerializable<NetworkSecurityRule> {
    /*
     * Network security rule name.
     */
    private String name;

    /*
     * Network security rule description.
     */
    private String description;

    /*
     * Network protocol this rule applies to.
     */
    private NsgProtocol protocol;

    /*
     * The CIDR or source IP ranges.
     */
    private List<String> sourceAddressPrefixes;

    /*
     * The destination address prefixes. CIDR or destination IP ranges.
     */
    private List<String> destinationAddressPrefixes;

    /*
     * The source port ranges.
     */
    private List<String> sourcePortRanges;

    /*
     * The destination port ranges.
     */
    private List<String> destinationPortRanges;

    /*
     * The CIDR or source IP range. Asterisk '*' can also be used to match all source IPs. Default tags such as
     * 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used. If this is an ingress rule, specifies
     * where network traffic originates from.
     */
    private String sourceAddressPrefix;

    /*
     * The destination address prefix. CIDR or destination IP range. Asterisk '*' can also be used to match all source
     * IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used.
     */
    private String destinationAddressPrefix;

    /*
     * The source port or range. Integer or range between 0 and 65535. Asterisk '*' can also be used to match all ports.
     */
    private String sourcePortRange;

    /*
     * he destination port or range. Integer or range between 0 and 65535. Asterisk '*' can also be used to match all
     * ports.
     */
    private String destinationPortRange;

    /*
     * The network traffic is allowed or denied.
     */
    private Access access;

    /*
     * The priority of the rule. The value can be in the range 1000 to 3000. Values outside this range are reserved for
     * Service Fabric ManagerCluster Resource Provider. The priority number must be unique for each rule in the
     * collection. The lower the priority number, the higher the priority of the rule.
     */
    private int priority;

    /*
     * Network security rule direction.
     */
    private Direction direction;

    /**
     * Creates an instance of NetworkSecurityRule class.
     */
    public NetworkSecurityRule() {
    }

    /**
     * Get the name property: Network security rule name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Network security rule name.
     * 
     * @param name the name value to set.
     * @return the NetworkSecurityRule object itself.
     */
    public NetworkSecurityRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: Network security rule description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Network security rule description.
     * 
     * @param description the description value to set.
     * @return the NetworkSecurityRule object itself.
     */
    public NetworkSecurityRule withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the protocol property: Network protocol this rule applies to.
     * 
     * @return the protocol value.
     */
    public NsgProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: Network protocol this rule applies to.
     * 
     * @param protocol the protocol value to set.
     * @return the NetworkSecurityRule object itself.
     */
    public NetworkSecurityRule withProtocol(NsgProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the sourceAddressPrefixes property: The CIDR or source IP ranges.
     * 
     * @return the sourceAddressPrefixes value.
     */
    public List<String> sourceAddressPrefixes() {
        return this.sourceAddressPrefixes;
    }

    /**
     * Set the sourceAddressPrefixes property: The CIDR or source IP ranges.
     * 
     * @param sourceAddressPrefixes the sourceAddressPrefixes value to set.
     * @return the NetworkSecurityRule object itself.
     */
    public NetworkSecurityRule withSourceAddressPrefixes(List<String> sourceAddressPrefixes) {
        this.sourceAddressPrefixes = sourceAddressPrefixes;
        return this;
    }

    /**
     * Get the destinationAddressPrefixes property: The destination address prefixes. CIDR or destination IP ranges.
     * 
     * @return the destinationAddressPrefixes value.
     */
    public List<String> destinationAddressPrefixes() {
        return this.destinationAddressPrefixes;
    }

    /**
     * Set the destinationAddressPrefixes property: The destination address prefixes. CIDR or destination IP ranges.
     * 
     * @param destinationAddressPrefixes the destinationAddressPrefixes value to set.
     * @return the NetworkSecurityRule object itself.
     */
    public NetworkSecurityRule withDestinationAddressPrefixes(List<String> destinationAddressPrefixes) {
        this.destinationAddressPrefixes = destinationAddressPrefixes;
        return this;
    }

    /**
     * Get the sourcePortRanges property: The source port ranges.
     * 
     * @return the sourcePortRanges value.
     */
    public List<String> sourcePortRanges() {
        return this.sourcePortRanges;
    }

    /**
     * Set the sourcePortRanges property: The source port ranges.
     * 
     * @param sourcePortRanges the sourcePortRanges value to set.
     * @return the NetworkSecurityRule object itself.
     */
    public NetworkSecurityRule withSourcePortRanges(List<String> sourcePortRanges) {
        this.sourcePortRanges = sourcePortRanges;
        return this;
    }

    /**
     * Get the destinationPortRanges property: The destination port ranges.
     * 
     * @return the destinationPortRanges value.
     */
    public List<String> destinationPortRanges() {
        return this.destinationPortRanges;
    }

    /**
     * Set the destinationPortRanges property: The destination port ranges.
     * 
     * @param destinationPortRanges the destinationPortRanges value to set.
     * @return the NetworkSecurityRule object itself.
     */
    public NetworkSecurityRule withDestinationPortRanges(List<String> destinationPortRanges) {
        this.destinationPortRanges = destinationPortRanges;
        return this;
    }

    /**
     * Get the sourceAddressPrefix property: The CIDR or source IP range. Asterisk '*' can also be used to match all
     * source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used. If this
     * is an ingress rule, specifies where network traffic originates from.
     * 
     * @return the sourceAddressPrefix value.
     */
    public String sourceAddressPrefix() {
        return this.sourceAddressPrefix;
    }

    /**
     * Set the sourceAddressPrefix property: The CIDR or source IP range. Asterisk '*' can also be used to match all
     * source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used. If this
     * is an ingress rule, specifies where network traffic originates from.
     * 
     * @param sourceAddressPrefix the sourceAddressPrefix value to set.
     * @return the NetworkSecurityRule object itself.
     */
    public NetworkSecurityRule withSourceAddressPrefix(String sourceAddressPrefix) {
        this.sourceAddressPrefix = sourceAddressPrefix;
        return this;
    }

    /**
     * Get the destinationAddressPrefix property: The destination address prefix. CIDR or destination IP range. Asterisk
     * '*' can also be used to match all source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and
     * 'Internet' can also be used.
     * 
     * @return the destinationAddressPrefix value.
     */
    public String destinationAddressPrefix() {
        return this.destinationAddressPrefix;
    }

    /**
     * Set the destinationAddressPrefix property: The destination address prefix. CIDR or destination IP range. Asterisk
     * '*' can also be used to match all source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and
     * 'Internet' can also be used.
     * 
     * @param destinationAddressPrefix the destinationAddressPrefix value to set.
     * @return the NetworkSecurityRule object itself.
     */
    public NetworkSecurityRule withDestinationAddressPrefix(String destinationAddressPrefix) {
        this.destinationAddressPrefix = destinationAddressPrefix;
        return this;
    }

    /**
     * Get the sourcePortRange property: The source port or range. Integer or range between 0 and 65535. Asterisk '*'
     * can also be used to match all ports.
     * 
     * @return the sourcePortRange value.
     */
    public String sourcePortRange() {
        return this.sourcePortRange;
    }

    /**
     * Set the sourcePortRange property: The source port or range. Integer or range between 0 and 65535. Asterisk '*'
     * can also be used to match all ports.
     * 
     * @param sourcePortRange the sourcePortRange value to set.
     * @return the NetworkSecurityRule object itself.
     */
    public NetworkSecurityRule withSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }

    /**
     * Get the destinationPortRange property: he destination port or range. Integer or range between 0 and 65535.
     * Asterisk '*' can also be used to match all ports.
     * 
     * @return the destinationPortRange value.
     */
    public String destinationPortRange() {
        return this.destinationPortRange;
    }

    /**
     * Set the destinationPortRange property: he destination port or range. Integer or range between 0 and 65535.
     * Asterisk '*' can also be used to match all ports.
     * 
     * @param destinationPortRange the destinationPortRange value to set.
     * @return the NetworkSecurityRule object itself.
     */
    public NetworkSecurityRule withDestinationPortRange(String destinationPortRange) {
        this.destinationPortRange = destinationPortRange;
        return this;
    }

    /**
     * Get the access property: The network traffic is allowed or denied.
     * 
     * @return the access value.
     */
    public Access access() {
        return this.access;
    }

    /**
     * Set the access property: The network traffic is allowed or denied.
     * 
     * @param access the access value to set.
     * @return the NetworkSecurityRule object itself.
     */
    public NetworkSecurityRule withAccess(Access access) {
        this.access = access;
        return this;
    }

    /**
     * Get the priority property: The priority of the rule. The value can be in the range 1000 to 3000. Values outside
     * this range are reserved for Service Fabric ManagerCluster Resource Provider. The priority number must be unique
     * for each rule in the collection. The lower the priority number, the higher the priority of the rule.
     * 
     * @return the priority value.
     */
    public int priority() {
        return this.priority;
    }

    /**
     * Set the priority property: The priority of the rule. The value can be in the range 1000 to 3000. Values outside
     * this range are reserved for Service Fabric ManagerCluster Resource Provider. The priority number must be unique
     * for each rule in the collection. The lower the priority number, the higher the priority of the rule.
     * 
     * @param priority the priority value to set.
     * @return the NetworkSecurityRule object itself.
     */
    public NetworkSecurityRule withPriority(int priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the direction property: Network security rule direction.
     * 
     * @return the direction value.
     */
    public Direction direction() {
        return this.direction;
    }

    /**
     * Set the direction property: Network security rule direction.
     * 
     * @param direction the direction value to set.
     * @return the NetworkSecurityRule object itself.
     */
    public NetworkSecurityRule withDirection(Direction direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model NetworkSecurityRule"));
        }
        if (protocol() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property protocol in model NetworkSecurityRule"));
        }
        if (access() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property access in model NetworkSecurityRule"));
        }
        if (direction() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property direction in model NetworkSecurityRule"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NetworkSecurityRule.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("protocol", this.protocol == null ? null : this.protocol.toString());
        jsonWriter.writeStringField("access", this.access == null ? null : this.access.toString());
        jsonWriter.writeIntField("priority", this.priority);
        jsonWriter.writeStringField("direction", this.direction == null ? null : this.direction.toString());
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeArrayField("sourceAddressPrefixes", this.sourceAddressPrefixes,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("destinationAddressPrefixes", this.destinationAddressPrefixes,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("sourcePortRanges", this.sourcePortRanges,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("destinationPortRanges", this.destinationPortRanges,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("sourceAddressPrefix", this.sourceAddressPrefix);
        jsonWriter.writeStringField("destinationAddressPrefix", this.destinationAddressPrefix);
        jsonWriter.writeStringField("sourcePortRange", this.sourcePortRange);
        jsonWriter.writeStringField("destinationPortRange", this.destinationPortRange);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkSecurityRule from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkSecurityRule if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the NetworkSecurityRule.
     */
    public static NetworkSecurityRule fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkSecurityRule deserializedNetworkSecurityRule = new NetworkSecurityRule();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedNetworkSecurityRule.name = reader.getString();
                } else if ("protocol".equals(fieldName)) {
                    deserializedNetworkSecurityRule.protocol = NsgProtocol.fromString(reader.getString());
                } else if ("access".equals(fieldName)) {
                    deserializedNetworkSecurityRule.access = Access.fromString(reader.getString());
                } else if ("priority".equals(fieldName)) {
                    deserializedNetworkSecurityRule.priority = reader.getInt();
                } else if ("direction".equals(fieldName)) {
                    deserializedNetworkSecurityRule.direction = Direction.fromString(reader.getString());
                } else if ("description".equals(fieldName)) {
                    deserializedNetworkSecurityRule.description = reader.getString();
                } else if ("sourceAddressPrefixes".equals(fieldName)) {
                    List<String> sourceAddressPrefixes = reader.readArray(reader1 -> reader1.getString());
                    deserializedNetworkSecurityRule.sourceAddressPrefixes = sourceAddressPrefixes;
                } else if ("destinationAddressPrefixes".equals(fieldName)) {
                    List<String> destinationAddressPrefixes = reader.readArray(reader1 -> reader1.getString());
                    deserializedNetworkSecurityRule.destinationAddressPrefixes = destinationAddressPrefixes;
                } else if ("sourcePortRanges".equals(fieldName)) {
                    List<String> sourcePortRanges = reader.readArray(reader1 -> reader1.getString());
                    deserializedNetworkSecurityRule.sourcePortRanges = sourcePortRanges;
                } else if ("destinationPortRanges".equals(fieldName)) {
                    List<String> destinationPortRanges = reader.readArray(reader1 -> reader1.getString());
                    deserializedNetworkSecurityRule.destinationPortRanges = destinationPortRanges;
                } else if ("sourceAddressPrefix".equals(fieldName)) {
                    deserializedNetworkSecurityRule.sourceAddressPrefix = reader.getString();
                } else if ("destinationAddressPrefix".equals(fieldName)) {
                    deserializedNetworkSecurityRule.destinationAddressPrefix = reader.getString();
                } else if ("sourcePortRange".equals(fieldName)) {
                    deserializedNetworkSecurityRule.sourcePortRange = reader.getString();
                } else if ("destinationPortRange".equals(fieldName)) {
                    deserializedNetworkSecurityRule.destinationPortRange = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkSecurityRule;
        });
    }
}
