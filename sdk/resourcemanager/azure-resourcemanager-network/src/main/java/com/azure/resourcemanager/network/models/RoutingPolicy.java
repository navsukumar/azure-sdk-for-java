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
import java.util.List;

/**
 * The routing policy object used in a RoutingIntent resource.
 */
@Fluent
public final class RoutingPolicy implements JsonSerializable<RoutingPolicy> {
    /*
     * The unique name for the routing policy.
     */
    private String name;

    /*
     * List of all destinations which this routing policy is applicable to (for example: Internet, PrivateTraffic).
     */
    private List<String> destinations;

    /*
     * The next hop resource id on which this routing policy is applicable to.
     */
    private String nextHop;

    /**
     * Creates an instance of RoutingPolicy class.
     */
    public RoutingPolicy() {
    }

    /**
     * Get the name property: The unique name for the routing policy.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The unique name for the routing policy.
     * 
     * @param name the name value to set.
     * @return the RoutingPolicy object itself.
     */
    public RoutingPolicy withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the destinations property: List of all destinations which this routing policy is applicable to (for example:
     * Internet, PrivateTraffic).
     * 
     * @return the destinations value.
     */
    public List<String> destinations() {
        return this.destinations;
    }

    /**
     * Set the destinations property: List of all destinations which this routing policy is applicable to (for example:
     * Internet, PrivateTraffic).
     * 
     * @param destinations the destinations value to set.
     * @return the RoutingPolicy object itself.
     */
    public RoutingPolicy withDestinations(List<String> destinations) {
        this.destinations = destinations;
        return this;
    }

    /**
     * Get the nextHop property: The next hop resource id on which this routing policy is applicable to.
     * 
     * @return the nextHop value.
     */
    public String nextHop() {
        return this.nextHop;
    }

    /**
     * Set the nextHop property: The next hop resource id on which this routing policy is applicable to.
     * 
     * @param nextHop the nextHop value to set.
     * @return the RoutingPolicy object itself.
     */
    public RoutingPolicy withNextHop(String nextHop) {
        this.nextHop = nextHop;
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
                .log(new IllegalArgumentException("Missing required property name in model RoutingPolicy"));
        }
        if (destinations() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property destinations in model RoutingPolicy"));
        }
        if (nextHop() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property nextHop in model RoutingPolicy"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RoutingPolicy.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeArrayField("destinations", this.destinations, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("nextHop", this.nextHop);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RoutingPolicy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RoutingPolicy if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RoutingPolicy.
     */
    public static RoutingPolicy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RoutingPolicy deserializedRoutingPolicy = new RoutingPolicy();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedRoutingPolicy.name = reader.getString();
                } else if ("destinations".equals(fieldName)) {
                    List<String> destinations = reader.readArray(reader1 -> reader1.getString());
                    deserializedRoutingPolicy.destinations = destinations;
                } else if ("nextHop".equals(fieldName)) {
                    deserializedRoutingPolicy.nextHop = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRoutingPolicy;
        });
    }
}
