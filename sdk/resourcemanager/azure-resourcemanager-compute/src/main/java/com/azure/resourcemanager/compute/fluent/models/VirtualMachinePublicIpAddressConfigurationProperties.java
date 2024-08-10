// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.compute.models.DeleteOptions;
import com.azure.resourcemanager.compute.models.IpVersions;
import com.azure.resourcemanager.compute.models.PublicIpAllocationMethod;
import com.azure.resourcemanager.compute.models.VirtualMachineIpTag;
import com.azure.resourcemanager.compute.models.VirtualMachinePublicIpAddressDnsSettingsConfiguration;
import java.io.IOException;
import java.util.List;

/**
 * Describes a virtual machines IP Configuration's PublicIPAddress configuration.
 */
@Fluent
public final class VirtualMachinePublicIpAddressConfigurationProperties
    implements JsonSerializable<VirtualMachinePublicIpAddressConfigurationProperties> {
    /*
     * The idle timeout of the public IP address.
     */
    private Integer idleTimeoutInMinutes;

    /*
     * Specify what happens to the public IP address when the VM is deleted
     */
    private DeleteOptions deleteOption;

    /*
     * The dns settings to be applied on the publicIP addresses .
     */
    private VirtualMachinePublicIpAddressDnsSettingsConfiguration dnsSettings;

    /*
     * The list of IP tags associated with the public IP address.
     */
    private List<VirtualMachineIpTag> ipTags;

    /*
     * The PublicIPPrefix from which to allocate publicIP addresses.
     */
    private SubResource publicIpPrefix;

    /*
     * Available from Api-Version 2019-07-01 onwards, it represents whether the specific ipconfiguration is IPv4 or
     * IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     */
    private IpVersions publicIpAddressVersion;

    /*
     * Specify the public IP allocation type
     */
    private PublicIpAllocationMethod publicIpAllocationMethod;

    /**
     * Creates an instance of VirtualMachinePublicIpAddressConfigurationProperties class.
     */
    public VirtualMachinePublicIpAddressConfigurationProperties() {
    }

    /**
     * Get the idleTimeoutInMinutes property: The idle timeout of the public IP address.
     * 
     * @return the idleTimeoutInMinutes value.
     */
    public Integer idleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }

    /**
     * Set the idleTimeoutInMinutes property: The idle timeout of the public IP address.
     * 
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set.
     * @return the VirtualMachinePublicIpAddressConfigurationProperties object itself.
     */
    public VirtualMachinePublicIpAddressConfigurationProperties withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        return this;
    }

    /**
     * Get the deleteOption property: Specify what happens to the public IP address when the VM is deleted.
     * 
     * @return the deleteOption value.
     */
    public DeleteOptions deleteOption() {
        return this.deleteOption;
    }

    /**
     * Set the deleteOption property: Specify what happens to the public IP address when the VM is deleted.
     * 
     * @param deleteOption the deleteOption value to set.
     * @return the VirtualMachinePublicIpAddressConfigurationProperties object itself.
     */
    public VirtualMachinePublicIpAddressConfigurationProperties withDeleteOption(DeleteOptions deleteOption) {
        this.deleteOption = deleteOption;
        return this;
    }

    /**
     * Get the dnsSettings property: The dns settings to be applied on the publicIP addresses .
     * 
     * @return the dnsSettings value.
     */
    public VirtualMachinePublicIpAddressDnsSettingsConfiguration dnsSettings() {
        return this.dnsSettings;
    }

    /**
     * Set the dnsSettings property: The dns settings to be applied on the publicIP addresses .
     * 
     * @param dnsSettings the dnsSettings value to set.
     * @return the VirtualMachinePublicIpAddressConfigurationProperties object itself.
     */
    public VirtualMachinePublicIpAddressConfigurationProperties
        withDnsSettings(VirtualMachinePublicIpAddressDnsSettingsConfiguration dnsSettings) {
        this.dnsSettings = dnsSettings;
        return this;
    }

    /**
     * Get the ipTags property: The list of IP tags associated with the public IP address.
     * 
     * @return the ipTags value.
     */
    public List<VirtualMachineIpTag> ipTags() {
        return this.ipTags;
    }

    /**
     * Set the ipTags property: The list of IP tags associated with the public IP address.
     * 
     * @param ipTags the ipTags value to set.
     * @return the VirtualMachinePublicIpAddressConfigurationProperties object itself.
     */
    public VirtualMachinePublicIpAddressConfigurationProperties withIpTags(List<VirtualMachineIpTag> ipTags) {
        this.ipTags = ipTags;
        return this;
    }

    /**
     * Get the publicIpPrefix property: The PublicIPPrefix from which to allocate publicIP addresses.
     * 
     * @return the publicIpPrefix value.
     */
    public SubResource publicIpPrefix() {
        return this.publicIpPrefix;
    }

    /**
     * Set the publicIpPrefix property: The PublicIPPrefix from which to allocate publicIP addresses.
     * 
     * @param publicIpPrefix the publicIpPrefix value to set.
     * @return the VirtualMachinePublicIpAddressConfigurationProperties object itself.
     */
    public VirtualMachinePublicIpAddressConfigurationProperties withPublicIpPrefix(SubResource publicIpPrefix) {
        this.publicIpPrefix = publicIpPrefix;
        return this;
    }

    /**
     * Get the publicIpAddressVersion property: Available from Api-Version 2019-07-01 onwards, it represents whether the
     * specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     * 
     * @return the publicIpAddressVersion value.
     */
    public IpVersions publicIpAddressVersion() {
        return this.publicIpAddressVersion;
    }

    /**
     * Set the publicIpAddressVersion property: Available from Api-Version 2019-07-01 onwards, it represents whether the
     * specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     * 
     * @param publicIpAddressVersion the publicIpAddressVersion value to set.
     * @return the VirtualMachinePublicIpAddressConfigurationProperties object itself.
     */
    public VirtualMachinePublicIpAddressConfigurationProperties
        withPublicIpAddressVersion(IpVersions publicIpAddressVersion) {
        this.publicIpAddressVersion = publicIpAddressVersion;
        return this;
    }

    /**
     * Get the publicIpAllocationMethod property: Specify the public IP allocation type.
     * 
     * @return the publicIpAllocationMethod value.
     */
    public PublicIpAllocationMethod publicIpAllocationMethod() {
        return this.publicIpAllocationMethod;
    }

    /**
     * Set the publicIpAllocationMethod property: Specify the public IP allocation type.
     * 
     * @param publicIpAllocationMethod the publicIpAllocationMethod value to set.
     * @return the VirtualMachinePublicIpAddressConfigurationProperties object itself.
     */
    public VirtualMachinePublicIpAddressConfigurationProperties
        withPublicIpAllocationMethod(PublicIpAllocationMethod publicIpAllocationMethod) {
        this.publicIpAllocationMethod = publicIpAllocationMethod;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dnsSettings() != null) {
            dnsSettings().validate();
        }
        if (ipTags() != null) {
            ipTags().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("idleTimeoutInMinutes", this.idleTimeoutInMinutes);
        jsonWriter.writeStringField("deleteOption", this.deleteOption == null ? null : this.deleteOption.toString());
        jsonWriter.writeJsonField("dnsSettings", this.dnsSettings);
        jsonWriter.writeArrayField("ipTags", this.ipTags, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("publicIPPrefix", this.publicIpPrefix);
        jsonWriter.writeStringField("publicIPAddressVersion",
            this.publicIpAddressVersion == null ? null : this.publicIpAddressVersion.toString());
        jsonWriter.writeStringField("publicIPAllocationMethod",
            this.publicIpAllocationMethod == null ? null : this.publicIpAllocationMethod.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualMachinePublicIpAddressConfigurationProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualMachinePublicIpAddressConfigurationProperties if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualMachinePublicIpAddressConfigurationProperties.
     */
    public static VirtualMachinePublicIpAddressConfigurationProperties fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualMachinePublicIpAddressConfigurationProperties deserializedVirtualMachinePublicIpAddressConfigurationProperties
                = new VirtualMachinePublicIpAddressConfigurationProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("idleTimeoutInMinutes".equals(fieldName)) {
                    deserializedVirtualMachinePublicIpAddressConfigurationProperties.idleTimeoutInMinutes
                        = reader.getNullable(JsonReader::getInt);
                } else if ("deleteOption".equals(fieldName)) {
                    deserializedVirtualMachinePublicIpAddressConfigurationProperties.deleteOption
                        = DeleteOptions.fromString(reader.getString());
                } else if ("dnsSettings".equals(fieldName)) {
                    deserializedVirtualMachinePublicIpAddressConfigurationProperties.dnsSettings
                        = VirtualMachinePublicIpAddressDnsSettingsConfiguration.fromJson(reader);
                } else if ("ipTags".equals(fieldName)) {
                    List<VirtualMachineIpTag> ipTags
                        = reader.readArray(reader1 -> VirtualMachineIpTag.fromJson(reader1));
                    deserializedVirtualMachinePublicIpAddressConfigurationProperties.ipTags = ipTags;
                } else if ("publicIPPrefix".equals(fieldName)) {
                    deserializedVirtualMachinePublicIpAddressConfigurationProperties.publicIpPrefix
                        = SubResource.fromJson(reader);
                } else if ("publicIPAddressVersion".equals(fieldName)) {
                    deserializedVirtualMachinePublicIpAddressConfigurationProperties.publicIpAddressVersion
                        = IpVersions.fromString(reader.getString());
                } else if ("publicIPAllocationMethod".equals(fieldName)) {
                    deserializedVirtualMachinePublicIpAddressConfigurationProperties.publicIpAllocationMethod
                        = PublicIpAllocationMethod.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualMachinePublicIpAddressConfigurationProperties;
        });
    }
}
