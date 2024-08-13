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
 * Parameters that define the IP flow to be verified.
 */
@Fluent
public final class VerificationIpFlowParameters implements JsonSerializable<VerificationIpFlowParameters> {
    /*
     * The ID of the target resource to perform next-hop on.
     */
    private String targetResourceId;

    /*
     * The direction of the packet represented as a 5-tuple.
     */
    private Direction direction;

    /*
     * Protocol to be verified on.
     */
    private IpFlowProtocol protocol;

    /*
     * The local port. Acceptable values are a single integer in the range (0-65535). Support for * for the source port,
     * which depends on the direction.
     */
    private String localPort;

    /*
     * The remote port. Acceptable values are a single integer in the range (0-65535). Support for * for the source
     * port, which depends on the direction.
     */
    private String remotePort;

    /*
     * The local IP address. Acceptable values are valid IPv4 addresses.
     */
    private String localIpAddress;

    /*
     * The remote IP address. Acceptable values are valid IPv4 addresses.
     */
    private String remoteIpAddress;

    /*
     * The NIC ID. (If VM has multiple NICs and IP forwarding is enabled on any of them, then this parameter must be
     * specified. Otherwise optional).
     */
    private String targetNicResourceId;

    /**
     * Creates an instance of VerificationIpFlowParameters class.
     */
    public VerificationIpFlowParameters() {
    }

    /**
     * Get the targetResourceId property: The ID of the target resource to perform next-hop on.
     * 
     * @return the targetResourceId value.
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the targetResourceId property: The ID of the target resource to perform next-hop on.
     * 
     * @param targetResourceId the targetResourceId value to set.
     * @return the VerificationIpFlowParameters object itself.
     */
    public VerificationIpFlowParameters withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * Get the direction property: The direction of the packet represented as a 5-tuple.
     * 
     * @return the direction value.
     */
    public Direction direction() {
        return this.direction;
    }

    /**
     * Set the direction property: The direction of the packet represented as a 5-tuple.
     * 
     * @param direction the direction value to set.
     * @return the VerificationIpFlowParameters object itself.
     */
    public VerificationIpFlowParameters withDirection(Direction direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Get the protocol property: Protocol to be verified on.
     * 
     * @return the protocol value.
     */
    public IpFlowProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: Protocol to be verified on.
     * 
     * @param protocol the protocol value to set.
     * @return the VerificationIpFlowParameters object itself.
     */
    public VerificationIpFlowParameters withProtocol(IpFlowProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the localPort property: The local port. Acceptable values are a single integer in the range (0-65535).
     * Support for * for the source port, which depends on the direction.
     * 
     * @return the localPort value.
     */
    public String localPort() {
        return this.localPort;
    }

    /**
     * Set the localPort property: The local port. Acceptable values are a single integer in the range (0-65535).
     * Support for * for the source port, which depends on the direction.
     * 
     * @param localPort the localPort value to set.
     * @return the VerificationIpFlowParameters object itself.
     */
    public VerificationIpFlowParameters withLocalPort(String localPort) {
        this.localPort = localPort;
        return this;
    }

    /**
     * Get the remotePort property: The remote port. Acceptable values are a single integer in the range (0-65535).
     * Support for * for the source port, which depends on the direction.
     * 
     * @return the remotePort value.
     */
    public String remotePort() {
        return this.remotePort;
    }

    /**
     * Set the remotePort property: The remote port. Acceptable values are a single integer in the range (0-65535).
     * Support for * for the source port, which depends on the direction.
     * 
     * @param remotePort the remotePort value to set.
     * @return the VerificationIpFlowParameters object itself.
     */
    public VerificationIpFlowParameters withRemotePort(String remotePort) {
        this.remotePort = remotePort;
        return this;
    }

    /**
     * Get the localIpAddress property: The local IP address. Acceptable values are valid IPv4 addresses.
     * 
     * @return the localIpAddress value.
     */
    public String localIpAddress() {
        return this.localIpAddress;
    }

    /**
     * Set the localIpAddress property: The local IP address. Acceptable values are valid IPv4 addresses.
     * 
     * @param localIpAddress the localIpAddress value to set.
     * @return the VerificationIpFlowParameters object itself.
     */
    public VerificationIpFlowParameters withLocalIpAddress(String localIpAddress) {
        this.localIpAddress = localIpAddress;
        return this;
    }

    /**
     * Get the remoteIpAddress property: The remote IP address. Acceptable values are valid IPv4 addresses.
     * 
     * @return the remoteIpAddress value.
     */
    public String remoteIpAddress() {
        return this.remoteIpAddress;
    }

    /**
     * Set the remoteIpAddress property: The remote IP address. Acceptable values are valid IPv4 addresses.
     * 
     * @param remoteIpAddress the remoteIpAddress value to set.
     * @return the VerificationIpFlowParameters object itself.
     */
    public VerificationIpFlowParameters withRemoteIpAddress(String remoteIpAddress) {
        this.remoteIpAddress = remoteIpAddress;
        return this;
    }

    /**
     * Get the targetNicResourceId property: The NIC ID. (If VM has multiple NICs and IP forwarding is enabled on any of
     * them, then this parameter must be specified. Otherwise optional).
     * 
     * @return the targetNicResourceId value.
     */
    public String targetNicResourceId() {
        return this.targetNicResourceId;
    }

    /**
     * Set the targetNicResourceId property: The NIC ID. (If VM has multiple NICs and IP forwarding is enabled on any of
     * them, then this parameter must be specified. Otherwise optional).
     * 
     * @param targetNicResourceId the targetNicResourceId value to set.
     * @return the VerificationIpFlowParameters object itself.
     */
    public VerificationIpFlowParameters withTargetNicResourceId(String targetNicResourceId) {
        this.targetNicResourceId = targetNicResourceId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (targetResourceId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property targetResourceId in model VerificationIpFlowParameters"));
        }
        if (direction() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property direction in model VerificationIpFlowParameters"));
        }
        if (protocol() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property protocol in model VerificationIpFlowParameters"));
        }
        if (localPort() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property localPort in model VerificationIpFlowParameters"));
        }
        if (remotePort() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property remotePort in model VerificationIpFlowParameters"));
        }
        if (localIpAddress() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property localIpAddress in model VerificationIpFlowParameters"));
        }
        if (remoteIpAddress() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property remoteIpAddress in model VerificationIpFlowParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VerificationIpFlowParameters.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("targetResourceId", this.targetResourceId);
        jsonWriter.writeStringField("direction", this.direction == null ? null : this.direction.toString());
        jsonWriter.writeStringField("protocol", this.protocol == null ? null : this.protocol.toString());
        jsonWriter.writeStringField("localPort", this.localPort);
        jsonWriter.writeStringField("remotePort", this.remotePort);
        jsonWriter.writeStringField("localIPAddress", this.localIpAddress);
        jsonWriter.writeStringField("remoteIPAddress", this.remoteIpAddress);
        jsonWriter.writeStringField("targetNicResourceId", this.targetNicResourceId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VerificationIpFlowParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VerificationIpFlowParameters if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VerificationIpFlowParameters.
     */
    public static VerificationIpFlowParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VerificationIpFlowParameters deserializedVerificationIpFlowParameters = new VerificationIpFlowParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("targetResourceId".equals(fieldName)) {
                    deserializedVerificationIpFlowParameters.targetResourceId = reader.getString();
                } else if ("direction".equals(fieldName)) {
                    deserializedVerificationIpFlowParameters.direction = Direction.fromString(reader.getString());
                } else if ("protocol".equals(fieldName)) {
                    deserializedVerificationIpFlowParameters.protocol = IpFlowProtocol.fromString(reader.getString());
                } else if ("localPort".equals(fieldName)) {
                    deserializedVerificationIpFlowParameters.localPort = reader.getString();
                } else if ("remotePort".equals(fieldName)) {
                    deserializedVerificationIpFlowParameters.remotePort = reader.getString();
                } else if ("localIPAddress".equals(fieldName)) {
                    deserializedVerificationIpFlowParameters.localIpAddress = reader.getString();
                } else if ("remoteIPAddress".equals(fieldName)) {
                    deserializedVerificationIpFlowParameters.remoteIpAddress = reader.getString();
                } else if ("targetNicResourceId".equals(fieldName)) {
                    deserializedVerificationIpFlowParameters.targetNicResourceId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVerificationIpFlowParameters;
        });
    }
}
