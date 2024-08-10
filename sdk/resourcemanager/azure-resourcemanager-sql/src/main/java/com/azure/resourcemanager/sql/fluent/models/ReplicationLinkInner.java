// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.sql.models.ReplicationLinkType;
import com.azure.resourcemanager.sql.models.ReplicationRole;
import com.azure.resourcemanager.sql.models.ReplicationState;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * A replication link.
 */
@Immutable
public final class ReplicationLinkInner extends ProxyResource {
    /*
     * Resource properties.
     */
    private ReplicationLinkProperties innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of ReplicationLinkInner class.
     */
    public ReplicationLinkInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     * 
     * @return the innerProperties value.
     */
    private ReplicationLinkProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the partnerServer property: Resource partner server.
     * 
     * @return the partnerServer value.
     */
    public String partnerServer() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerServer();
    }

    /**
     * Get the partnerDatabase property: Resource partner database.
     * 
     * @return the partnerDatabase value.
     */
    public String partnerDatabase() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerDatabase();
    }

    /**
     * Get the partnerLocation property: Resource partner location.
     * 
     * @return the partnerLocation value.
     */
    public String partnerLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerLocation();
    }

    /**
     * Get the role property: Local replication role.
     * 
     * @return the role value.
     */
    public ReplicationRole role() {
        return this.innerProperties() == null ? null : this.innerProperties().role();
    }

    /**
     * Get the partnerRole property: Partner replication role.
     * 
     * @return the partnerRole value.
     */
    public ReplicationRole partnerRole() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerRole();
    }

    /**
     * Get the replicationMode property: Replication mode.
     * 
     * @return the replicationMode value.
     */
    public String replicationMode() {
        return this.innerProperties() == null ? null : this.innerProperties().replicationMode();
    }

    /**
     * Get the startTime property: Time at which the link was created.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.innerProperties() == null ? null : this.innerProperties().startTime();
    }

    /**
     * Get the percentComplete property: Seeding completion percentage for the link.
     * 
     * @return the percentComplete value.
     */
    public Integer percentComplete() {
        return this.innerProperties() == null ? null : this.innerProperties().percentComplete();
    }

    /**
     * Get the replicationState property: Replication state (PENDING, SEEDING, CATCHUP, SUSPENDED).
     * 
     * @return the replicationState value.
     */
    public ReplicationState replicationState() {
        return this.innerProperties() == null ? null : this.innerProperties().replicationState();
    }

    /**
     * Get the isTerminationAllowed property: Whether the user is currently allowed to terminate the link.
     * 
     * @return the isTerminationAllowed value.
     */
    public Boolean isTerminationAllowed() {
        return this.innerProperties() == null ? null : this.innerProperties().isTerminationAllowed();
    }

    /**
     * Get the linkType property: Link type (GEO, NAMED, STANDBY).
     * 
     * @return the linkType value.
     */
    public ReplicationLinkType linkType() {
        return this.innerProperties() == null ? null : this.innerProperties().linkType();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ReplicationLinkInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ReplicationLinkInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ReplicationLinkInner.
     */
    public static ReplicationLinkInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ReplicationLinkInner deserializedReplicationLinkInner = new ReplicationLinkInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedReplicationLinkInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedReplicationLinkInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedReplicationLinkInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedReplicationLinkInner.innerProperties = ReplicationLinkProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedReplicationLinkInner;
        });
    }
}
