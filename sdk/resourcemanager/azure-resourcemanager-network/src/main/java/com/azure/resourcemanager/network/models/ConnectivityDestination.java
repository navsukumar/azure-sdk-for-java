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

/**
 * Parameters that define destination of connection.
 */
@Fluent
public final class ConnectivityDestination implements JsonSerializable<ConnectivityDestination> {
    /*
     * The ID of the resource to which a connection attempt will be made.
     */
    private String resourceId;

    /*
     * The IP address or URI the resource to which a connection attempt will be made.
     */
    private String address;

    /*
     * Port on which check connectivity will be performed.
     */
    private Integer port;

    /**
     * Creates an instance of ConnectivityDestination class.
     */
    public ConnectivityDestination() {
    }

    /**
     * Get the resourceId property: The ID of the resource to which a connection attempt will be made.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The ID of the resource to which a connection attempt will be made.
     * 
     * @param resourceId the resourceId value to set.
     * @return the ConnectivityDestination object itself.
     */
    public ConnectivityDestination withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the address property: The IP address or URI the resource to which a connection attempt will be made.
     * 
     * @return the address value.
     */
    public String address() {
        return this.address;
    }

    /**
     * Set the address property: The IP address or URI the resource to which a connection attempt will be made.
     * 
     * @param address the address value to set.
     * @return the ConnectivityDestination object itself.
     */
    public ConnectivityDestination withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get the port property: Port on which check connectivity will be performed.
     * 
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: Port on which check connectivity will be performed.
     * 
     * @param port the port value to set.
     * @return the ConnectivityDestination object itself.
     */
    public ConnectivityDestination withPort(Integer port) {
        this.port = port;
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
        jsonWriter.writeStringField("resourceId", this.resourceId);
        jsonWriter.writeStringField("address", this.address);
        jsonWriter.writeNumberField("port", this.port);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConnectivityDestination from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConnectivityDestination if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ConnectivityDestination.
     */
    public static ConnectivityDestination fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConnectivityDestination deserializedConnectivityDestination = new ConnectivityDestination();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resourceId".equals(fieldName)) {
                    deserializedConnectivityDestination.resourceId = reader.getString();
                } else if ("address".equals(fieldName)) {
                    deserializedConnectivityDestination.address = reader.getString();
                } else if ("port".equals(fieldName)) {
                    deserializedConnectivityDestination.port = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConnectivityDestination;
        });
    }
}
