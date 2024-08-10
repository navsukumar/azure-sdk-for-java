// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.AzureFirewallApplicationRuleCollection;
import com.azure.resourcemanager.network.models.AzureFirewallIpConfiguration;
import com.azure.resourcemanager.network.models.AzureFirewallIpGroups;
import com.azure.resourcemanager.network.models.AzureFirewallNatRuleCollection;
import com.azure.resourcemanager.network.models.AzureFirewallNetworkRuleCollection;
import com.azure.resourcemanager.network.models.AzureFirewallSku;
import com.azure.resourcemanager.network.models.AzureFirewallThreatIntelMode;
import com.azure.resourcemanager.network.models.HubIpAddresses;
import com.azure.resourcemanager.network.models.ProvisioningState;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Properties of the Azure Firewall.
 */
@Fluent
public final class AzureFirewallPropertiesFormat implements JsonSerializable<AzureFirewallPropertiesFormat> {
    /*
     * Collection of application rule collections used by Azure Firewall.
     */
    private List<AzureFirewallApplicationRuleCollection> applicationRuleCollections;

    /*
     * Collection of NAT rule collections used by Azure Firewall.
     */
    private List<AzureFirewallNatRuleCollection> natRuleCollections;

    /*
     * Collection of network rule collections used by Azure Firewall.
     */
    private List<AzureFirewallNetworkRuleCollection> networkRuleCollections;

    /*
     * IP configuration of the Azure Firewall resource.
     */
    private List<AzureFirewallIpConfiguration> ipConfigurations;

    /*
     * IP configuration of the Azure Firewall used for management traffic.
     */
    private AzureFirewallIpConfiguration managementIpConfiguration;

    /*
     * The provisioning state of the Azure firewall resource.
     */
    private ProvisioningState provisioningState;

    /*
     * The operation mode for Threat Intelligence.
     */
    private AzureFirewallThreatIntelMode threatIntelMode;

    /*
     * The virtualHub to which the firewall belongs.
     */
    private SubResource virtualHub;

    /*
     * The firewallPolicy associated with this azure firewall.
     */
    private SubResource firewallPolicy;

    /*
     * IP addresses associated with AzureFirewall.
     */
    private HubIpAddresses hubIpAddresses;

    /*
     * IpGroups associated with AzureFirewall.
     */
    private List<AzureFirewallIpGroups> ipGroups;

    /*
     * The Azure Firewall Resource SKU.
     */
    private AzureFirewallSku sku;

    /*
     * The additional properties used to further config this azure firewall.
     */
    private Map<String, String> additionalProperties;

    /**
     * Creates an instance of AzureFirewallPropertiesFormat class.
     */
    public AzureFirewallPropertiesFormat() {
    }

    /**
     * Get the applicationRuleCollections property: Collection of application rule collections used by Azure Firewall.
     * 
     * @return the applicationRuleCollections value.
     */
    public List<AzureFirewallApplicationRuleCollection> applicationRuleCollections() {
        return this.applicationRuleCollections;
    }

    /**
     * Set the applicationRuleCollections property: Collection of application rule collections used by Azure Firewall.
     * 
     * @param applicationRuleCollections the applicationRuleCollections value to set.
     * @return the AzureFirewallPropertiesFormat object itself.
     */
    public AzureFirewallPropertiesFormat
        withApplicationRuleCollections(List<AzureFirewallApplicationRuleCollection> applicationRuleCollections) {
        this.applicationRuleCollections = applicationRuleCollections;
        return this;
    }

    /**
     * Get the natRuleCollections property: Collection of NAT rule collections used by Azure Firewall.
     * 
     * @return the natRuleCollections value.
     */
    public List<AzureFirewallNatRuleCollection> natRuleCollections() {
        return this.natRuleCollections;
    }

    /**
     * Set the natRuleCollections property: Collection of NAT rule collections used by Azure Firewall.
     * 
     * @param natRuleCollections the natRuleCollections value to set.
     * @return the AzureFirewallPropertiesFormat object itself.
     */
    public AzureFirewallPropertiesFormat
        withNatRuleCollections(List<AzureFirewallNatRuleCollection> natRuleCollections) {
        this.natRuleCollections = natRuleCollections;
        return this;
    }

    /**
     * Get the networkRuleCollections property: Collection of network rule collections used by Azure Firewall.
     * 
     * @return the networkRuleCollections value.
     */
    public List<AzureFirewallNetworkRuleCollection> networkRuleCollections() {
        return this.networkRuleCollections;
    }

    /**
     * Set the networkRuleCollections property: Collection of network rule collections used by Azure Firewall.
     * 
     * @param networkRuleCollections the networkRuleCollections value to set.
     * @return the AzureFirewallPropertiesFormat object itself.
     */
    public AzureFirewallPropertiesFormat
        withNetworkRuleCollections(List<AzureFirewallNetworkRuleCollection> networkRuleCollections) {
        this.networkRuleCollections = networkRuleCollections;
        return this;
    }

    /**
     * Get the ipConfigurations property: IP configuration of the Azure Firewall resource.
     * 
     * @return the ipConfigurations value.
     */
    public List<AzureFirewallIpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set the ipConfigurations property: IP configuration of the Azure Firewall resource.
     * 
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the AzureFirewallPropertiesFormat object itself.
     */
    public AzureFirewallPropertiesFormat withIpConfigurations(List<AzureFirewallIpConfiguration> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get the managementIpConfiguration property: IP configuration of the Azure Firewall used for management traffic.
     * 
     * @return the managementIpConfiguration value.
     */
    public AzureFirewallIpConfiguration managementIpConfiguration() {
        return this.managementIpConfiguration;
    }

    /**
     * Set the managementIpConfiguration property: IP configuration of the Azure Firewall used for management traffic.
     * 
     * @param managementIpConfiguration the managementIpConfiguration value to set.
     * @return the AzureFirewallPropertiesFormat object itself.
     */
    public AzureFirewallPropertiesFormat
        withManagementIpConfiguration(AzureFirewallIpConfiguration managementIpConfiguration) {
        this.managementIpConfiguration = managementIpConfiguration;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the Azure firewall resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the threatIntelMode property: The operation mode for Threat Intelligence.
     * 
     * @return the threatIntelMode value.
     */
    public AzureFirewallThreatIntelMode threatIntelMode() {
        return this.threatIntelMode;
    }

    /**
     * Set the threatIntelMode property: The operation mode for Threat Intelligence.
     * 
     * @param threatIntelMode the threatIntelMode value to set.
     * @return the AzureFirewallPropertiesFormat object itself.
     */
    public AzureFirewallPropertiesFormat withThreatIntelMode(AzureFirewallThreatIntelMode threatIntelMode) {
        this.threatIntelMode = threatIntelMode;
        return this;
    }

    /**
     * Get the virtualHub property: The virtualHub to which the firewall belongs.
     * 
     * @return the virtualHub value.
     */
    public SubResource virtualHub() {
        return this.virtualHub;
    }

    /**
     * Set the virtualHub property: The virtualHub to which the firewall belongs.
     * 
     * @param virtualHub the virtualHub value to set.
     * @return the AzureFirewallPropertiesFormat object itself.
     */
    public AzureFirewallPropertiesFormat withVirtualHub(SubResource virtualHub) {
        this.virtualHub = virtualHub;
        return this;
    }

    /**
     * Get the firewallPolicy property: The firewallPolicy associated with this azure firewall.
     * 
     * @return the firewallPolicy value.
     */
    public SubResource firewallPolicy() {
        return this.firewallPolicy;
    }

    /**
     * Set the firewallPolicy property: The firewallPolicy associated with this azure firewall.
     * 
     * @param firewallPolicy the firewallPolicy value to set.
     * @return the AzureFirewallPropertiesFormat object itself.
     */
    public AzureFirewallPropertiesFormat withFirewallPolicy(SubResource firewallPolicy) {
        this.firewallPolicy = firewallPolicy;
        return this;
    }

    /**
     * Get the hubIpAddresses property: IP addresses associated with AzureFirewall.
     * 
     * @return the hubIpAddresses value.
     */
    public HubIpAddresses hubIpAddresses() {
        return this.hubIpAddresses;
    }

    /**
     * Set the hubIpAddresses property: IP addresses associated with AzureFirewall.
     * 
     * @param hubIpAddresses the hubIpAddresses value to set.
     * @return the AzureFirewallPropertiesFormat object itself.
     */
    public AzureFirewallPropertiesFormat withHubIpAddresses(HubIpAddresses hubIpAddresses) {
        this.hubIpAddresses = hubIpAddresses;
        return this;
    }

    /**
     * Get the ipGroups property: IpGroups associated with AzureFirewall.
     * 
     * @return the ipGroups value.
     */
    public List<AzureFirewallIpGroups> ipGroups() {
        return this.ipGroups;
    }

    /**
     * Get the sku property: The Azure Firewall Resource SKU.
     * 
     * @return the sku value.
     */
    public AzureFirewallSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The Azure Firewall Resource SKU.
     * 
     * @param sku the sku value to set.
     * @return the AzureFirewallPropertiesFormat object itself.
     */
    public AzureFirewallPropertiesFormat withSku(AzureFirewallSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the additionalProperties property: The additional properties used to further config this azure firewall.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, String> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: The additional properties used to further config this azure firewall.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the AzureFirewallPropertiesFormat object itself.
     */
    public AzureFirewallPropertiesFormat withAdditionalProperties(Map<String, String> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (applicationRuleCollections() != null) {
            applicationRuleCollections().forEach(e -> e.validate());
        }
        if (natRuleCollections() != null) {
            natRuleCollections().forEach(e -> e.validate());
        }
        if (networkRuleCollections() != null) {
            networkRuleCollections().forEach(e -> e.validate());
        }
        if (ipConfigurations() != null) {
            ipConfigurations().forEach(e -> e.validate());
        }
        if (managementIpConfiguration() != null) {
            managementIpConfiguration().validate();
        }
        if (hubIpAddresses() != null) {
            hubIpAddresses().validate();
        }
        if (ipGroups() != null) {
            ipGroups().forEach(e -> e.validate());
        }
        if (sku() != null) {
            sku().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("applicationRuleCollections", this.applicationRuleCollections,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("natRuleCollections", this.natRuleCollections,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("networkRuleCollections", this.networkRuleCollections,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("ipConfigurations", this.ipConfigurations,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("managementIpConfiguration", this.managementIpConfiguration);
        jsonWriter.writeStringField("threatIntelMode",
            this.threatIntelMode == null ? null : this.threatIntelMode.toString());
        jsonWriter.writeJsonField("virtualHub", this.virtualHub);
        jsonWriter.writeJsonField("firewallPolicy", this.firewallPolicy);
        jsonWriter.writeJsonField("hubIPAddresses", this.hubIpAddresses);
        jsonWriter.writeJsonField("sku", this.sku);
        jsonWriter.writeMapField("additionalProperties", this.additionalProperties,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureFirewallPropertiesFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureFirewallPropertiesFormat if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureFirewallPropertiesFormat.
     */
    public static AzureFirewallPropertiesFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureFirewallPropertiesFormat deserializedAzureFirewallPropertiesFormat
                = new AzureFirewallPropertiesFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("applicationRuleCollections".equals(fieldName)) {
                    List<AzureFirewallApplicationRuleCollection> applicationRuleCollections
                        = reader.readArray(reader1 -> AzureFirewallApplicationRuleCollection.fromJson(reader1));
                    deserializedAzureFirewallPropertiesFormat.applicationRuleCollections = applicationRuleCollections;
                } else if ("natRuleCollections".equals(fieldName)) {
                    List<AzureFirewallNatRuleCollection> natRuleCollections
                        = reader.readArray(reader1 -> AzureFirewallNatRuleCollection.fromJson(reader1));
                    deserializedAzureFirewallPropertiesFormat.natRuleCollections = natRuleCollections;
                } else if ("networkRuleCollections".equals(fieldName)) {
                    List<AzureFirewallNetworkRuleCollection> networkRuleCollections
                        = reader.readArray(reader1 -> AzureFirewallNetworkRuleCollection.fromJson(reader1));
                    deserializedAzureFirewallPropertiesFormat.networkRuleCollections = networkRuleCollections;
                } else if ("ipConfigurations".equals(fieldName)) {
                    List<AzureFirewallIpConfiguration> ipConfigurations
                        = reader.readArray(reader1 -> AzureFirewallIpConfiguration.fromJson(reader1));
                    deserializedAzureFirewallPropertiesFormat.ipConfigurations = ipConfigurations;
                } else if ("managementIpConfiguration".equals(fieldName)) {
                    deserializedAzureFirewallPropertiesFormat.managementIpConfiguration
                        = AzureFirewallIpConfiguration.fromJson(reader);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedAzureFirewallPropertiesFormat.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("threatIntelMode".equals(fieldName)) {
                    deserializedAzureFirewallPropertiesFormat.threatIntelMode
                        = AzureFirewallThreatIntelMode.fromString(reader.getString());
                } else if ("virtualHub".equals(fieldName)) {
                    deserializedAzureFirewallPropertiesFormat.virtualHub = SubResource.fromJson(reader);
                } else if ("firewallPolicy".equals(fieldName)) {
                    deserializedAzureFirewallPropertiesFormat.firewallPolicy = SubResource.fromJson(reader);
                } else if ("hubIPAddresses".equals(fieldName)) {
                    deserializedAzureFirewallPropertiesFormat.hubIpAddresses = HubIpAddresses.fromJson(reader);
                } else if ("ipGroups".equals(fieldName)) {
                    List<AzureFirewallIpGroups> ipGroups
                        = reader.readArray(reader1 -> AzureFirewallIpGroups.fromJson(reader1));
                    deserializedAzureFirewallPropertiesFormat.ipGroups = ipGroups;
                } else if ("sku".equals(fieldName)) {
                    deserializedAzureFirewallPropertiesFormat.sku = AzureFirewallSku.fromJson(reader);
                } else if ("additionalProperties".equals(fieldName)) {
                    Map<String, String> additionalProperties = reader.readMap(reader1 -> reader1.getString());
                    deserializedAzureFirewallPropertiesFormat.additionalProperties = additionalProperties;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureFirewallPropertiesFormat;
        });
    }
}
