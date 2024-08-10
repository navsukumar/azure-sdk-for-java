// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Network settings of an agent pool.
 */
@Fluent
public final class AgentPoolNetworkProfile implements JsonSerializable<AgentPoolNetworkProfile> {
    /*
     * IPTags of instance-level public IPs.
     */
    private List<IpTag> nodePublicIpTags;

    /*
     * The port ranges that are allowed to access. The specified ranges are allowed to overlap.
     */
    private List<PortRange> allowedHostPorts;

    /*
     * The IDs of the application security groups which agent pool will associate when created.
     */
    private List<String> applicationSecurityGroups;

    /**
     * Creates an instance of AgentPoolNetworkProfile class.
     */
    public AgentPoolNetworkProfile() {
    }

    /**
     * Get the nodePublicIpTags property: IPTags of instance-level public IPs.
     * 
     * @return the nodePublicIpTags value.
     */
    public List<IpTag> nodePublicIpTags() {
        return this.nodePublicIpTags;
    }

    /**
     * Set the nodePublicIpTags property: IPTags of instance-level public IPs.
     * 
     * @param nodePublicIpTags the nodePublicIpTags value to set.
     * @return the AgentPoolNetworkProfile object itself.
     */
    public AgentPoolNetworkProfile withNodePublicIpTags(List<IpTag> nodePublicIpTags) {
        this.nodePublicIpTags = nodePublicIpTags;
        return this;
    }

    /**
     * Get the allowedHostPorts property: The port ranges that are allowed to access. The specified ranges are allowed
     * to overlap.
     * 
     * @return the allowedHostPorts value.
     */
    public List<PortRange> allowedHostPorts() {
        return this.allowedHostPorts;
    }

    /**
     * Set the allowedHostPorts property: The port ranges that are allowed to access. The specified ranges are allowed
     * to overlap.
     * 
     * @param allowedHostPorts the allowedHostPorts value to set.
     * @return the AgentPoolNetworkProfile object itself.
     */
    public AgentPoolNetworkProfile withAllowedHostPorts(List<PortRange> allowedHostPorts) {
        this.allowedHostPorts = allowedHostPorts;
        return this;
    }

    /**
     * Get the applicationSecurityGroups property: The IDs of the application security groups which agent pool will
     * associate when created.
     * 
     * @return the applicationSecurityGroups value.
     */
    public List<String> applicationSecurityGroups() {
        return this.applicationSecurityGroups;
    }

    /**
     * Set the applicationSecurityGroups property: The IDs of the application security groups which agent pool will
     * associate when created.
     * 
     * @param applicationSecurityGroups the applicationSecurityGroups value to set.
     * @return the AgentPoolNetworkProfile object itself.
     */
    public AgentPoolNetworkProfile withApplicationSecurityGroups(List<String> applicationSecurityGroups) {
        this.applicationSecurityGroups = applicationSecurityGroups;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (nodePublicIpTags() != null) {
            nodePublicIpTags().forEach(e -> e.validate());
        }
        if (allowedHostPorts() != null) {
            allowedHostPorts().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("nodePublicIPTags", this.nodePublicIpTags,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("allowedHostPorts", this.allowedHostPorts,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("applicationSecurityGroups", this.applicationSecurityGroups,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AgentPoolNetworkProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AgentPoolNetworkProfile if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AgentPoolNetworkProfile.
     */
    public static AgentPoolNetworkProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AgentPoolNetworkProfile deserializedAgentPoolNetworkProfile = new AgentPoolNetworkProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("nodePublicIPTags".equals(fieldName)) {
                    List<IpTag> nodePublicIpTags = reader.readArray(reader1 -> IpTag.fromJson(reader1));
                    deserializedAgentPoolNetworkProfile.nodePublicIpTags = nodePublicIpTags;
                } else if ("allowedHostPorts".equals(fieldName)) {
                    List<PortRange> allowedHostPorts = reader.readArray(reader1 -> PortRange.fromJson(reader1));
                    deserializedAgentPoolNetworkProfile.allowedHostPorts = allowedHostPorts;
                } else if ("applicationSecurityGroups".equals(fieldName)) {
                    List<String> applicationSecurityGroups = reader.readArray(reader1 -> reader1.getString());
                    deserializedAgentPoolNetworkProfile.applicationSecurityGroups = applicationSecurityGroups;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAgentPoolNetworkProfile;
        });
    }
}
