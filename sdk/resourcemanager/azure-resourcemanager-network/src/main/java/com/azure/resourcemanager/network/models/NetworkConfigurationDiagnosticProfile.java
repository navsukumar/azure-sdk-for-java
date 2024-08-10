// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Parameters to compare with network configuration.
 */
@Fluent
public final class NetworkConfigurationDiagnosticProfile
    implements JsonSerializable<NetworkConfigurationDiagnosticProfile> {
    /*
     * The direction of the traffic.
     */
    private Direction direction;

    /*
     * Protocol to be verified on. Accepted values are '*', TCP, UDP.
     */
    private String protocol;

    /*
     * Traffic source. Accepted values are '*', IP Address/CIDR, Service Tag.
     */
    private String source;

    /*
     * Traffic destination. Accepted values are: '*', IP Address/CIDR, Service Tag.
     */
    private String destination;

    /*
     * Traffic destination port. Accepted values are '*' and a single port in the range (0 - 65535).
     */
    private String destinationPort;

    /**
     * Creates an instance of NetworkConfigurationDiagnosticProfile class.
     */
    public NetworkConfigurationDiagnosticProfile() {
    }

    /**
     * Get the direction property: The direction of the traffic.
     * 
     * @return the direction value.
     */
    public Direction direction() {
        return this.direction;
    }

    /**
     * Set the direction property: The direction of the traffic.
     * 
     * @param direction the direction value to set.
     * @return the NetworkConfigurationDiagnosticProfile object itself.
     */
    public NetworkConfigurationDiagnosticProfile withDirection(Direction direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Get the protocol property: Protocol to be verified on. Accepted values are '*', TCP, UDP.
     * 
     * @return the protocol value.
     */
    public String protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: Protocol to be verified on. Accepted values are '*', TCP, UDP.
     * 
     * @param protocol the protocol value to set.
     * @return the NetworkConfigurationDiagnosticProfile object itself.
     */
    public NetworkConfigurationDiagnosticProfile withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the source property: Traffic source. Accepted values are '*', IP Address/CIDR, Service Tag.
     * 
     * @return the source value.
     */
    public String source() {
        return this.source;
    }

    /**
     * Set the source property: Traffic source. Accepted values are '*', IP Address/CIDR, Service Tag.
     * 
     * @param source the source value to set.
     * @return the NetworkConfigurationDiagnosticProfile object itself.
     */
    public NetworkConfigurationDiagnosticProfile withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the destination property: Traffic destination. Accepted values are: '*', IP Address/CIDR, Service Tag.
     * 
     * @return the destination value.
     */
    public String destination() {
        return this.destination;
    }

    /**
     * Set the destination property: Traffic destination. Accepted values are: '*', IP Address/CIDR, Service Tag.
     * 
     * @param destination the destination value to set.
     * @return the NetworkConfigurationDiagnosticProfile object itself.
     */
    public NetworkConfigurationDiagnosticProfile withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Get the destinationPort property: Traffic destination port. Accepted values are '*' and a single port in the
     * range (0 - 65535).
     * 
     * @return the destinationPort value.
     */
    public String destinationPort() {
        return this.destinationPort;
    }

    /**
     * Set the destinationPort property: Traffic destination port. Accepted values are '*' and a single port in the
     * range (0 - 65535).
     * 
     * @param destinationPort the destinationPort value to set.
     * @return the NetworkConfigurationDiagnosticProfile object itself.
     */
    public NetworkConfigurationDiagnosticProfile withDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (direction() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property direction in model NetworkConfigurationDiagnosticProfile"));
        }
        if (protocol() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property protocol in model NetworkConfigurationDiagnosticProfile"));
        }
        if (source() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property source in model NetworkConfigurationDiagnosticProfile"));
        }
        if (destination() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property destination in model NetworkConfigurationDiagnosticProfile"));
        }
        if (destinationPort() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property destinationPort in model NetworkConfigurationDiagnosticProfile"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NetworkConfigurationDiagnosticProfile.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("direction", this.direction == null ? null : this.direction.toString());
        jsonWriter.writeStringField("protocol", this.protocol);
        jsonWriter.writeStringField("source", this.source);
        jsonWriter.writeStringField("destination", this.destination);
        jsonWriter.writeStringField("destinationPort", this.destinationPort);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkConfigurationDiagnosticProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkConfigurationDiagnosticProfile if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the NetworkConfigurationDiagnosticProfile.
     */
    public static NetworkConfigurationDiagnosticProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkConfigurationDiagnosticProfile deserializedNetworkConfigurationDiagnosticProfile
                = new NetworkConfigurationDiagnosticProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("direction".equals(fieldName)) {
                    deserializedNetworkConfigurationDiagnosticProfile.direction
                        = Direction.fromString(reader.getString());
                } else if ("protocol".equals(fieldName)) {
                    deserializedNetworkConfigurationDiagnosticProfile.protocol = reader.getString();
                } else if ("source".equals(fieldName)) {
                    deserializedNetworkConfigurationDiagnosticProfile.source = reader.getString();
                } else if ("destination".equals(fieldName)) {
                    deserializedNetworkConfigurationDiagnosticProfile.destination = reader.getString();
                } else if ("destinationPort".equals(fieldName)) {
                    deserializedNetworkConfigurationDiagnosticProfile.destinationPort = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkConfigurationDiagnosticProfile;
        });
    }
}
