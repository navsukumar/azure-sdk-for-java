// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * OpenShiftManagedClusterMaterPoolProfile contains configuration for OpenShift master VMs.
 */
@Fluent
public final class OpenShiftManagedClusterMasterPoolProfile
    implements JsonSerializable<OpenShiftManagedClusterMasterPoolProfile> {
    /*
     * Unique name of the master pool profile in the context of the subscription and resource group.
     */
    private String name;

    /*
     * Number of masters (VMs) to host docker containers. The default value is 3.
     */
    private int count;

    /*
     * Size of agent VMs.
     */
    private OpenShiftContainerServiceVMSize vmSize;

    /*
     * Subnet CIDR for the peering.
     */
    private String subnetCidr;

    /*
     * OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     */
    private OSType osType;

    /**
     * Creates an instance of OpenShiftManagedClusterMasterPoolProfile class.
     */
    public OpenShiftManagedClusterMasterPoolProfile() {
    }

    /**
     * Get the name property: Unique name of the master pool profile in the context of the subscription and resource
     * group.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Unique name of the master pool profile in the context of the subscription and resource
     * group.
     * 
     * @param name the name value to set.
     * @return the OpenShiftManagedClusterMasterPoolProfile object itself.
     */
    public OpenShiftManagedClusterMasterPoolProfile withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the count property: Number of masters (VMs) to host docker containers. The default value is 3.
     * 
     * @return the count value.
     */
    public int count() {
        return this.count;
    }

    /**
     * Set the count property: Number of masters (VMs) to host docker containers. The default value is 3.
     * 
     * @param count the count value to set.
     * @return the OpenShiftManagedClusterMasterPoolProfile object itself.
     */
    public OpenShiftManagedClusterMasterPoolProfile withCount(int count) {
        this.count = count;
        return this;
    }

    /**
     * Get the vmSize property: Size of agent VMs.
     * 
     * @return the vmSize value.
     */
    public OpenShiftContainerServiceVMSize vmSize() {
        return this.vmSize;
    }

    /**
     * Set the vmSize property: Size of agent VMs.
     * 
     * @param vmSize the vmSize value to set.
     * @return the OpenShiftManagedClusterMasterPoolProfile object itself.
     */
    public OpenShiftManagedClusterMasterPoolProfile withVmSize(OpenShiftContainerServiceVMSize vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get the subnetCidr property: Subnet CIDR for the peering.
     * 
     * @return the subnetCidr value.
     */
    public String subnetCidr() {
        return this.subnetCidr;
    }

    /**
     * Set the subnetCidr property: Subnet CIDR for the peering.
     * 
     * @param subnetCidr the subnetCidr value to set.
     * @return the OpenShiftManagedClusterMasterPoolProfile object itself.
     */
    public OpenShiftManagedClusterMasterPoolProfile withSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
        return this;
    }

    /**
     * Get the osType property: OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     * 
     * @return the osType value.
     */
    public OSType osType() {
        return this.osType;
    }

    /**
     * Set the osType property: OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     * 
     * @param osType the osType value to set.
     * @return the OpenShiftManagedClusterMasterPoolProfile object itself.
     */
    public OpenShiftManagedClusterMasterPoolProfile withOsType(OSType osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vmSize() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property vmSize in model OpenShiftManagedClusterMasterPoolProfile"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(OpenShiftManagedClusterMasterPoolProfile.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("count", this.count);
        jsonWriter.writeStringField("vmSize", this.vmSize == null ? null : this.vmSize.toString());
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("subnetCidr", this.subnetCidr);
        jsonWriter.writeStringField("osType", this.osType == null ? null : this.osType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OpenShiftManagedClusterMasterPoolProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OpenShiftManagedClusterMasterPoolProfile if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the OpenShiftManagedClusterMasterPoolProfile.
     */
    public static OpenShiftManagedClusterMasterPoolProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OpenShiftManagedClusterMasterPoolProfile deserializedOpenShiftManagedClusterMasterPoolProfile
                = new OpenShiftManagedClusterMasterPoolProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("count".equals(fieldName)) {
                    deserializedOpenShiftManagedClusterMasterPoolProfile.count = reader.getInt();
                } else if ("vmSize".equals(fieldName)) {
                    deserializedOpenShiftManagedClusterMasterPoolProfile.vmSize
                        = OpenShiftContainerServiceVMSize.fromString(reader.getString());
                } else if ("name".equals(fieldName)) {
                    deserializedOpenShiftManagedClusterMasterPoolProfile.name = reader.getString();
                } else if ("subnetCidr".equals(fieldName)) {
                    deserializedOpenShiftManagedClusterMasterPoolProfile.subnetCidr = reader.getString();
                } else if ("osType".equals(fieldName)) {
                    deserializedOpenShiftManagedClusterMasterPoolProfile.osType = OSType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOpenShiftManagedClusterMasterPoolProfile;
        });
    }
}
