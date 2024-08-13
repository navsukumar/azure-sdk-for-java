// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.DdosSettings;
import com.azure.resourcemanager.network.models.DeleteOptions;
import com.azure.resourcemanager.network.models.ExtendedLocation;
import com.azure.resourcemanager.network.models.IpAllocationMethod;
import com.azure.resourcemanager.network.models.IpTag;
import com.azure.resourcemanager.network.models.IpVersion;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.PublicIpAddressDnsSettings;
import com.azure.resourcemanager.network.models.PublicIpAddressMigrationPhase;
import com.azure.resourcemanager.network.models.PublicIpAddressSku;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Public IP address resource.
 */
@Fluent
public final class PublicIpAddressInner extends Resource {
    /*
     * The extended location of the public ip address.
     */
    private ExtendedLocation extendedLocation;

    /*
     * The public IP address SKU.
     */
    private PublicIpAddressSku sku;

    /*
     * Public IP address properties.
     */
    private PublicIpAddressPropertiesFormatInner innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /*
     * A list of availability zones denoting the IP allocated for the resource needs to come from.
     */
    private List<String> zones;

    /*
     * Resource ID.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of PublicIpAddressInner class.
     */
    public PublicIpAddressInner() {
    }

    /**
     * Get the extendedLocation property: The extended location of the public ip address.
     * 
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: The extended location of the public ip address.
     * 
     * @param extendedLocation the extendedLocation value to set.
     * @return the PublicIpAddressInner object itself.
     */
    public PublicIpAddressInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the sku property: The public IP address SKU.
     * 
     * @return the sku value.
     */
    public PublicIpAddressSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The public IP address SKU.
     * 
     * @param sku the sku value to set.
     * @return the PublicIpAddressInner object itself.
     */
    public PublicIpAddressInner withSku(PublicIpAddressSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the innerProperties property: Public IP address properties.
     * 
     * @return the innerProperties value.
     */
    private PublicIpAddressPropertiesFormatInner innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the zones property: A list of availability zones denoting the IP allocated for the resource needs to come
     * from.
     * 
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: A list of availability zones denoting the IP allocated for the resource needs to come
     * from.
     * 
     * @param zones the zones value to set.
     * @return the PublicIpAddressInner object itself.
     */
    public PublicIpAddressInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the id property: Resource ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     * 
     * @param id the id value to set.
     * @return the PublicIpAddressInner object itself.
     */
    public PublicIpAddressInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PublicIpAddressInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PublicIpAddressInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the publicIpAllocationMethod property: The public IP address allocation method.
     * 
     * @return the publicIpAllocationMethod value.
     */
    public IpAllocationMethod publicIpAllocationMethod() {
        return this.innerProperties() == null ? null : this.innerProperties().publicIpAllocationMethod();
    }

    /**
     * Set the publicIpAllocationMethod property: The public IP address allocation method.
     * 
     * @param publicIpAllocationMethod the publicIpAllocationMethod value to set.
     * @return the PublicIpAddressInner object itself.
     */
    public PublicIpAddressInner withPublicIpAllocationMethod(IpAllocationMethod publicIpAllocationMethod) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PublicIpAddressPropertiesFormatInner();
        }
        this.innerProperties().withPublicIpAllocationMethod(publicIpAllocationMethod);
        return this;
    }

    /**
     * Get the publicIpAddressVersion property: The public IP address version.
     * 
     * @return the publicIpAddressVersion value.
     */
    public IpVersion publicIpAddressVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().publicIpAddressVersion();
    }

    /**
     * Set the publicIpAddressVersion property: The public IP address version.
     * 
     * @param publicIpAddressVersion the publicIpAddressVersion value to set.
     * @return the PublicIpAddressInner object itself.
     */
    public PublicIpAddressInner withPublicIpAddressVersion(IpVersion publicIpAddressVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PublicIpAddressPropertiesFormatInner();
        }
        this.innerProperties().withPublicIpAddressVersion(publicIpAddressVersion);
        return this;
    }

    /**
     * Get the ipConfiguration property: The IP configuration associated with the public IP address.
     * 
     * @return the ipConfiguration value.
     */
    public IpConfigurationInner ipConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().ipConfiguration();
    }

    /**
     * Get the dnsSettings property: The FQDN of the DNS record associated with the public IP address.
     * 
     * @return the dnsSettings value.
     */
    public PublicIpAddressDnsSettings dnsSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().dnsSettings();
    }

    /**
     * Set the dnsSettings property: The FQDN of the DNS record associated with the public IP address.
     * 
     * @param dnsSettings the dnsSettings value to set.
     * @return the PublicIpAddressInner object itself.
     */
    public PublicIpAddressInner withDnsSettings(PublicIpAddressDnsSettings dnsSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PublicIpAddressPropertiesFormatInner();
        }
        this.innerProperties().withDnsSettings(dnsSettings);
        return this;
    }

    /**
     * Get the ddosSettings property: The DDoS protection custom policy associated with the public IP address.
     * 
     * @return the ddosSettings value.
     */
    public DdosSettings ddosSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().ddosSettings();
    }

    /**
     * Set the ddosSettings property: The DDoS protection custom policy associated with the public IP address.
     * 
     * @param ddosSettings the ddosSettings value to set.
     * @return the PublicIpAddressInner object itself.
     */
    public PublicIpAddressInner withDdosSettings(DdosSettings ddosSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PublicIpAddressPropertiesFormatInner();
        }
        this.innerProperties().withDdosSettings(ddosSettings);
        return this;
    }

    /**
     * Get the ipTags property: The list of tags associated with the public IP address.
     * 
     * @return the ipTags value.
     */
    public List<IpTag> ipTags() {
        return this.innerProperties() == null ? null : this.innerProperties().ipTags();
    }

    /**
     * Set the ipTags property: The list of tags associated with the public IP address.
     * 
     * @param ipTags the ipTags value to set.
     * @return the PublicIpAddressInner object itself.
     */
    public PublicIpAddressInner withIpTags(List<IpTag> ipTags) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PublicIpAddressPropertiesFormatInner();
        }
        this.innerProperties().withIpTags(ipTags);
        return this;
    }

    /**
     * Get the ipAddress property: The IP address associated with the public IP address resource.
     * 
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().ipAddress();
    }

    /**
     * Set the ipAddress property: The IP address associated with the public IP address resource.
     * 
     * @param ipAddress the ipAddress value to set.
     * @return the PublicIpAddressInner object itself.
     */
    public PublicIpAddressInner withIpAddress(String ipAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PublicIpAddressPropertiesFormatInner();
        }
        this.innerProperties().withIpAddress(ipAddress);
        return this;
    }

    /**
     * Get the publicIpPrefix property: The Public IP Prefix this Public IP Address should be allocated from.
     * 
     * @return the publicIpPrefix value.
     */
    public SubResource publicIpPrefix() {
        return this.innerProperties() == null ? null : this.innerProperties().publicIpPrefix();
    }

    /**
     * Set the publicIpPrefix property: The Public IP Prefix this Public IP Address should be allocated from.
     * 
     * @param publicIpPrefix the publicIpPrefix value to set.
     * @return the PublicIpAddressInner object itself.
     */
    public PublicIpAddressInner withPublicIpPrefix(SubResource publicIpPrefix) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PublicIpAddressPropertiesFormatInner();
        }
        this.innerProperties().withPublicIpPrefix(publicIpPrefix);
        return this;
    }

    /**
     * Get the idleTimeoutInMinutes property: The idle timeout of the public IP address.
     * 
     * @return the idleTimeoutInMinutes value.
     */
    public Integer idleTimeoutInMinutes() {
        return this.innerProperties() == null ? null : this.innerProperties().idleTimeoutInMinutes();
    }

    /**
     * Set the idleTimeoutInMinutes property: The idle timeout of the public IP address.
     * 
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set.
     * @return the PublicIpAddressInner object itself.
     */
    public PublicIpAddressInner withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PublicIpAddressPropertiesFormatInner();
        }
        this.innerProperties().withIdleTimeoutInMinutes(idleTimeoutInMinutes);
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the public IP address resource.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
    }

    /**
     * Get the provisioningState property: The provisioning state of the public IP address resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the servicePublicIpAddress property: The service public IP address of the public IP address resource.
     * 
     * @return the servicePublicIpAddress value.
     */
    public PublicIpAddressInner servicePublicIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().servicePublicIpAddress();
    }

    /**
     * Set the servicePublicIpAddress property: The service public IP address of the public IP address resource.
     * 
     * @param servicePublicIpAddress the servicePublicIpAddress value to set.
     * @return the PublicIpAddressInner object itself.
     */
    public PublicIpAddressInner withServicePublicIpAddress(PublicIpAddressInner servicePublicIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PublicIpAddressPropertiesFormatInner();
        }
        this.innerProperties().withServicePublicIpAddress(servicePublicIpAddress);
        return this;
    }

    /**
     * Get the natGateway property: The NatGateway for the Public IP address.
     * 
     * @return the natGateway value.
     */
    public NatGatewayInner natGateway() {
        return this.innerProperties() == null ? null : this.innerProperties().natGateway();
    }

    /**
     * Set the natGateway property: The NatGateway for the Public IP address.
     * 
     * @param natGateway the natGateway value to set.
     * @return the PublicIpAddressInner object itself.
     */
    public PublicIpAddressInner withNatGateway(NatGatewayInner natGateway) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PublicIpAddressPropertiesFormatInner();
        }
        this.innerProperties().withNatGateway(natGateway);
        return this;
    }

    /**
     * Get the migrationPhase property: Migration phase of Public IP Address.
     * 
     * @return the migrationPhase value.
     */
    public PublicIpAddressMigrationPhase migrationPhase() {
        return this.innerProperties() == null ? null : this.innerProperties().migrationPhase();
    }

    /**
     * Set the migrationPhase property: Migration phase of Public IP Address.
     * 
     * @param migrationPhase the migrationPhase value to set.
     * @return the PublicIpAddressInner object itself.
     */
    public PublicIpAddressInner withMigrationPhase(PublicIpAddressMigrationPhase migrationPhase) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PublicIpAddressPropertiesFormatInner();
        }
        this.innerProperties().withMigrationPhase(migrationPhase);
        return this;
    }

    /**
     * Get the linkedPublicIpAddress property: The linked public IP address of the public IP address resource.
     * 
     * @return the linkedPublicIpAddress value.
     */
    public PublicIpAddressInner linkedPublicIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().linkedPublicIpAddress();
    }

    /**
     * Set the linkedPublicIpAddress property: The linked public IP address of the public IP address resource.
     * 
     * @param linkedPublicIpAddress the linkedPublicIpAddress value to set.
     * @return the PublicIpAddressInner object itself.
     */
    public PublicIpAddressInner withLinkedPublicIpAddress(PublicIpAddressInner linkedPublicIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PublicIpAddressPropertiesFormatInner();
        }
        this.innerProperties().withLinkedPublicIpAddress(linkedPublicIpAddress);
        return this;
    }

    /**
     * Get the deleteOption property: Specify what happens to the public IP address when the VM using it is deleted.
     * 
     * @return the deleteOption value.
     */
    public DeleteOptions deleteOption() {
        return this.innerProperties() == null ? null : this.innerProperties().deleteOption();
    }

    /**
     * Set the deleteOption property: Specify what happens to the public IP address when the VM using it is deleted.
     * 
     * @param deleteOption the deleteOption value to set.
     * @return the PublicIpAddressInner object itself.
     */
    public PublicIpAddressInner withDeleteOption(DeleteOptions deleteOption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PublicIpAddressPropertiesFormatInner();
        }
        this.innerProperties().withDeleteOption(deleteOption);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
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
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("extendedLocation", this.extendedLocation);
        jsonWriter.writeJsonField("sku", this.sku);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeArrayField("zones", this.zones, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("id", this.id);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PublicIpAddressInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PublicIpAddressInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PublicIpAddressInner.
     */
    public static PublicIpAddressInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PublicIpAddressInner deserializedPublicIpAddressInner = new PublicIpAddressInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedPublicIpAddressInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedPublicIpAddressInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedPublicIpAddressInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedPublicIpAddressInner.withTags(tags);
                } else if ("extendedLocation".equals(fieldName)) {
                    deserializedPublicIpAddressInner.extendedLocation = ExtendedLocation.fromJson(reader);
                } else if ("sku".equals(fieldName)) {
                    deserializedPublicIpAddressInner.sku = PublicIpAddressSku.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedPublicIpAddressInner.innerProperties
                        = PublicIpAddressPropertiesFormatInner.fromJson(reader);
                } else if ("etag".equals(fieldName)) {
                    deserializedPublicIpAddressInner.etag = reader.getString();
                } else if ("zones".equals(fieldName)) {
                    List<String> zones = reader.readArray(reader1 -> reader1.getString());
                    deserializedPublicIpAddressInner.zones = zones;
                } else if ("id".equals(fieldName)) {
                    deserializedPublicIpAddressInner.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPublicIpAddressInner;
        });
    }
}
