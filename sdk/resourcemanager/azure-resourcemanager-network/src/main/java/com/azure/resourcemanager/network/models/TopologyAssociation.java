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
 * Resources that have an association with the parent resource.
 */
@Fluent
public final class TopologyAssociation implements JsonSerializable<TopologyAssociation> {
    /*
     * The name of the resource that is associated with the parent resource.
     */
    private String name;

    /*
     * The ID of the resource that is associated with the parent resource.
     */
    private String resourceId;

    /*
     * The association type of the child resource to the parent resource.
     */
    private AssociationType associationType;

    /**
     * Creates an instance of TopologyAssociation class.
     */
    public TopologyAssociation() {
    }

    /**
     * Get the name property: The name of the resource that is associated with the parent resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is associated with the parent resource.
     * 
     * @param name the name value to set.
     * @return the TopologyAssociation object itself.
     */
    public TopologyAssociation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the resourceId property: The ID of the resource that is associated with the parent resource.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The ID of the resource that is associated with the parent resource.
     * 
     * @param resourceId the resourceId value to set.
     * @return the TopologyAssociation object itself.
     */
    public TopologyAssociation withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the associationType property: The association type of the child resource to the parent resource.
     * 
     * @return the associationType value.
     */
    public AssociationType associationType() {
        return this.associationType;
    }

    /**
     * Set the associationType property: The association type of the child resource to the parent resource.
     * 
     * @param associationType the associationType value to set.
     * @return the TopologyAssociation object itself.
     */
    public TopologyAssociation withAssociationType(AssociationType associationType) {
        this.associationType = associationType;
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
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("resourceId", this.resourceId);
        jsonWriter.writeStringField("associationType",
            this.associationType == null ? null : this.associationType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TopologyAssociation from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TopologyAssociation if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the TopologyAssociation.
     */
    public static TopologyAssociation fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TopologyAssociation deserializedTopologyAssociation = new TopologyAssociation();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedTopologyAssociation.name = reader.getString();
                } else if ("resourceId".equals(fieldName)) {
                    deserializedTopologyAssociation.resourceId = reader.getString();
                } else if ("associationType".equals(fieldName)) {
                    deserializedTopologyAssociation.associationType = AssociationType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTopologyAssociation;
        });
    }
}
