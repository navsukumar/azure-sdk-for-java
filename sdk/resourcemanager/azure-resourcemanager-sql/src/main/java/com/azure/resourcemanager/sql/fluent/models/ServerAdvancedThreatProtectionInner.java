// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.sql.models.AdvancedThreatProtectionState;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * A server Advanced Threat Protection.
 */
@Fluent
public final class ServerAdvancedThreatProtectionInner extends ProxyResource {
    /*
     * SystemData of AdvancedThreatProtectionResource.
     */
    private SystemData systemData;

    /*
     * Resource properties.
     */
    private AdvancedThreatProtectionProperties innerProperties;

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
     * Creates an instance of ServerAdvancedThreatProtectionInner class.
     */
    public ServerAdvancedThreatProtectionInner() {
    }

    /**
     * Get the systemData property: SystemData of AdvancedThreatProtectionResource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the innerProperties property: Resource properties.
     * 
     * @return the innerProperties value.
     */
    private AdvancedThreatProtectionProperties innerProperties() {
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
     * Get the state property: Specifies the state of the Advanced Threat Protection, whether it is enabled or disabled
     * or a state has not been applied yet on the specific database or server.
     * 
     * @return the state value.
     */
    public AdvancedThreatProtectionState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Set the state property: Specifies the state of the Advanced Threat Protection, whether it is enabled or disabled
     * or a state has not been applied yet on the specific database or server.
     * 
     * @param state the state value to set.
     * @return the ServerAdvancedThreatProtectionInner object itself.
     */
    public ServerAdvancedThreatProtectionInner withState(AdvancedThreatProtectionState state) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AdvancedThreatProtectionProperties();
        }
        this.innerProperties().withState(state);
        return this;
    }

    /**
     * Get the creationTime property: Specifies the UTC creation time of the policy.
     * 
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.innerProperties() == null ? null : this.innerProperties().creationTime();
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
     * Reads an instance of ServerAdvancedThreatProtectionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServerAdvancedThreatProtectionInner if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ServerAdvancedThreatProtectionInner.
     */
    public static ServerAdvancedThreatProtectionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServerAdvancedThreatProtectionInner deserializedServerAdvancedThreatProtectionInner
                = new ServerAdvancedThreatProtectionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedServerAdvancedThreatProtectionInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedServerAdvancedThreatProtectionInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedServerAdvancedThreatProtectionInner.type = reader.getString();
                } else if ("systemData".equals(fieldName)) {
                    deserializedServerAdvancedThreatProtectionInner.systemData = SystemData.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedServerAdvancedThreatProtectionInner.innerProperties
                        = AdvancedThreatProtectionProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServerAdvancedThreatProtectionInner;
        });
    }
}
