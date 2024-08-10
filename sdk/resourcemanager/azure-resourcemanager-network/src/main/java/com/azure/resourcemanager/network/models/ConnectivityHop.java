// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Information about a hop between the source and the destination.
 */
@Immutable
public final class ConnectivityHop implements JsonSerializable<ConnectivityHop> {
    /*
     * The type of the hop.
     */
    private String type;

    /*
     * The ID of the hop.
     */
    private String id;

    /*
     * The IP address of the hop.
     */
    private String address;

    /*
     * The ID of the resource corresponding to this hop.
     */
    private String resourceId;

    /*
     * List of next hop identifiers.
     */
    private List<String> nextHopIds;

    /*
     * List of previous hop identifiers.
     */
    private List<String> previousHopIds;

    /*
     * List of hop links.
     */
    private List<HopLink> links;

    /*
     * List of previous hop links.
     */
    private List<HopLink> previousLinks;

    /*
     * List of issues.
     */
    private List<ConnectivityIssue> issues;

    /**
     * Creates an instance of ConnectivityHop class.
     */
    public ConnectivityHop() {
    }

    /**
     * Get the type property: The type of the hop.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the id property: The ID of the hop.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the address property: The IP address of the hop.
     * 
     * @return the address value.
     */
    public String address() {
        return this.address;
    }

    /**
     * Get the resourceId property: The ID of the resource corresponding to this hop.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Get the nextHopIds property: List of next hop identifiers.
     * 
     * @return the nextHopIds value.
     */
    public List<String> nextHopIds() {
        return this.nextHopIds;
    }

    /**
     * Get the previousHopIds property: List of previous hop identifiers.
     * 
     * @return the previousHopIds value.
     */
    public List<String> previousHopIds() {
        return this.previousHopIds;
    }

    /**
     * Get the links property: List of hop links.
     * 
     * @return the links value.
     */
    public List<HopLink> links() {
        return this.links;
    }

    /**
     * Get the previousLinks property: List of previous hop links.
     * 
     * @return the previousLinks value.
     */
    public List<HopLink> previousLinks() {
        return this.previousLinks;
    }

    /**
     * Get the issues property: List of issues.
     * 
     * @return the issues value.
     */
    public List<ConnectivityIssue> issues() {
        return this.issues;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (links() != null) {
            links().forEach(e -> e.validate());
        }
        if (previousLinks() != null) {
            previousLinks().forEach(e -> e.validate());
        }
        if (issues() != null) {
            issues().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConnectivityHop from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConnectivityHop if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ConnectivityHop.
     */
    public static ConnectivityHop fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConnectivityHop deserializedConnectivityHop = new ConnectivityHop();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedConnectivityHop.type = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedConnectivityHop.id = reader.getString();
                } else if ("address".equals(fieldName)) {
                    deserializedConnectivityHop.address = reader.getString();
                } else if ("resourceId".equals(fieldName)) {
                    deserializedConnectivityHop.resourceId = reader.getString();
                } else if ("nextHopIds".equals(fieldName)) {
                    List<String> nextHopIds = reader.readArray(reader1 -> reader1.getString());
                    deserializedConnectivityHop.nextHopIds = nextHopIds;
                } else if ("previousHopIds".equals(fieldName)) {
                    List<String> previousHopIds = reader.readArray(reader1 -> reader1.getString());
                    deserializedConnectivityHop.previousHopIds = previousHopIds;
                } else if ("links".equals(fieldName)) {
                    List<HopLink> links = reader.readArray(reader1 -> HopLink.fromJson(reader1));
                    deserializedConnectivityHop.links = links;
                } else if ("previousLinks".equals(fieldName)) {
                    List<HopLink> previousLinks = reader.readArray(reader1 -> HopLink.fromJson(reader1));
                    deserializedConnectivityHop.previousLinks = previousLinks;
                } else if ("issues".equals(fieldName)) {
                    List<ConnectivityIssue> issues = reader.readArray(reader1 -> ConnectivityIssue.fromJson(reader1));
                    deserializedConnectivityHop.issues = issues;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConnectivityHop;
        });
    }
}
