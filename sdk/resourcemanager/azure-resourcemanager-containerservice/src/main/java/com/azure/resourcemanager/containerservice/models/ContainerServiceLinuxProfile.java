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
 * Profile for Linux VMs in the container service cluster.
 */
@Fluent
public final class ContainerServiceLinuxProfile implements JsonSerializable<ContainerServiceLinuxProfile> {
    /*
     * The administrator username to use for Linux VMs.
     */
    private String adminUsername;

    /*
     * The SSH configuration for Linux-based VMs running on Azure.
     */
    private ContainerServiceSshConfiguration ssh;

    /**
     * Creates an instance of ContainerServiceLinuxProfile class.
     */
    public ContainerServiceLinuxProfile() {
    }

    /**
     * Get the adminUsername property: The administrator username to use for Linux VMs.
     * 
     * @return the adminUsername value.
     */
    public String adminUsername() {
        return this.adminUsername;
    }

    /**
     * Set the adminUsername property: The administrator username to use for Linux VMs.
     * 
     * @param adminUsername the adminUsername value to set.
     * @return the ContainerServiceLinuxProfile object itself.
     */
    public ContainerServiceLinuxProfile withAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
        return this;
    }

    /**
     * Get the ssh property: The SSH configuration for Linux-based VMs running on Azure.
     * 
     * @return the ssh value.
     */
    public ContainerServiceSshConfiguration ssh() {
        return this.ssh;
    }

    /**
     * Set the ssh property: The SSH configuration for Linux-based VMs running on Azure.
     * 
     * @param ssh the ssh value to set.
     * @return the ContainerServiceLinuxProfile object itself.
     */
    public ContainerServiceLinuxProfile withSsh(ContainerServiceSshConfiguration ssh) {
        this.ssh = ssh;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (adminUsername() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property adminUsername in model ContainerServiceLinuxProfile"));
        }
        if (ssh() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property ssh in model ContainerServiceLinuxProfile"));
        } else {
            ssh().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ContainerServiceLinuxProfile.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("adminUsername", this.adminUsername);
        jsonWriter.writeJsonField("ssh", this.ssh);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ContainerServiceLinuxProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ContainerServiceLinuxProfile if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ContainerServiceLinuxProfile.
     */
    public static ContainerServiceLinuxProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ContainerServiceLinuxProfile deserializedContainerServiceLinuxProfile = new ContainerServiceLinuxProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("adminUsername".equals(fieldName)) {
                    deserializedContainerServiceLinuxProfile.adminUsername = reader.getString();
                } else if ("ssh".equals(fieldName)) {
                    deserializedContainerServiceLinuxProfile.ssh = ContainerServiceSshConfiguration.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedContainerServiceLinuxProfile;
        });
    }
}
