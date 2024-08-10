// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import java.io.IOException;

/**
 * Hybrid Connection for an App Service app.
 */
@Fluent
public final class RelayServiceConnectionEntityInner extends ProxyOnlyResource {
    /*
     * RelayServiceConnectionEntity resource specific properties
     */
    private RelayServiceConnectionEntityProperties innerProperties;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of RelayServiceConnectionEntityInner class.
     */
    public RelayServiceConnectionEntityInner() {
    }

    /**
     * Get the innerProperties property: RelayServiceConnectionEntity resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private RelayServiceConnectionEntityProperties innerProperties() {
        return this.innerProperties;
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
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
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
     * {@inheritDoc}
     */
    @Override
    public RelayServiceConnectionEntityInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the entityName property: The entityName property.
     * 
     * @return the entityName value.
     */
    public String entityName() {
        return this.innerProperties() == null ? null : this.innerProperties().entityName();
    }

    /**
     * Set the entityName property: The entityName property.
     * 
     * @param entityName the entityName value to set.
     * @return the RelayServiceConnectionEntityInner object itself.
     */
    public RelayServiceConnectionEntityInner withEntityName(String entityName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RelayServiceConnectionEntityProperties();
        }
        this.innerProperties().withEntityName(entityName);
        return this;
    }

    /**
     * Get the entityConnectionString property: The entityConnectionString property.
     * 
     * @return the entityConnectionString value.
     */
    public String entityConnectionString() {
        return this.innerProperties() == null ? null : this.innerProperties().entityConnectionString();
    }

    /**
     * Set the entityConnectionString property: The entityConnectionString property.
     * 
     * @param entityConnectionString the entityConnectionString value to set.
     * @return the RelayServiceConnectionEntityInner object itself.
     */
    public RelayServiceConnectionEntityInner withEntityConnectionString(String entityConnectionString) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RelayServiceConnectionEntityProperties();
        }
        this.innerProperties().withEntityConnectionString(entityConnectionString);
        return this;
    }

    /**
     * Get the resourceType property: The resourceType property.
     * 
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceType();
    }

    /**
     * Set the resourceType property: The resourceType property.
     * 
     * @param resourceType the resourceType value to set.
     * @return the RelayServiceConnectionEntityInner object itself.
     */
    public RelayServiceConnectionEntityInner withResourceType(String resourceType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RelayServiceConnectionEntityProperties();
        }
        this.innerProperties().withResourceType(resourceType);
        return this;
    }

    /**
     * Get the resourceConnectionString property: The resourceConnectionString property.
     * 
     * @return the resourceConnectionString value.
     */
    public String resourceConnectionString() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceConnectionString();
    }

    /**
     * Set the resourceConnectionString property: The resourceConnectionString property.
     * 
     * @param resourceConnectionString the resourceConnectionString value to set.
     * @return the RelayServiceConnectionEntityInner object itself.
     */
    public RelayServiceConnectionEntityInner withResourceConnectionString(String resourceConnectionString) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RelayServiceConnectionEntityProperties();
        }
        this.innerProperties().withResourceConnectionString(resourceConnectionString);
        return this;
    }

    /**
     * Get the hostname property: The hostname property.
     * 
     * @return the hostname value.
     */
    public String hostname() {
        return this.innerProperties() == null ? null : this.innerProperties().hostname();
    }

    /**
     * Set the hostname property: The hostname property.
     * 
     * @param hostname the hostname value to set.
     * @return the RelayServiceConnectionEntityInner object itself.
     */
    public RelayServiceConnectionEntityInner withHostname(String hostname) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RelayServiceConnectionEntityProperties();
        }
        this.innerProperties().withHostname(hostname);
        return this;
    }

    /**
     * Get the port property: The port property.
     * 
     * @return the port value.
     */
    public Integer port() {
        return this.innerProperties() == null ? null : this.innerProperties().port();
    }

    /**
     * Set the port property: The port property.
     * 
     * @param port the port value to set.
     * @return the RelayServiceConnectionEntityInner object itself.
     */
    public RelayServiceConnectionEntityInner withPort(Integer port) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RelayServiceConnectionEntityProperties();
        }
        this.innerProperties().withPort(port);
        return this;
    }

    /**
     * Get the biztalkUri property: The biztalkUri property.
     * 
     * @return the biztalkUri value.
     */
    public String biztalkUri() {
        return this.innerProperties() == null ? null : this.innerProperties().biztalkUri();
    }

    /**
     * Set the biztalkUri property: The biztalkUri property.
     * 
     * @param biztalkUri the biztalkUri value to set.
     * @return the RelayServiceConnectionEntityInner object itself.
     */
    public RelayServiceConnectionEntityInner withBiztalkUri(String biztalkUri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RelayServiceConnectionEntityProperties();
        }
        this.innerProperties().withBiztalkUri(biztalkUri);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
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
        jsonWriter.writeStringField("kind", kind());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RelayServiceConnectionEntityInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RelayServiceConnectionEntityInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RelayServiceConnectionEntityInner.
     */
    public static RelayServiceConnectionEntityInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RelayServiceConnectionEntityInner deserializedRelayServiceConnectionEntityInner
                = new RelayServiceConnectionEntityInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedRelayServiceConnectionEntityInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedRelayServiceConnectionEntityInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedRelayServiceConnectionEntityInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedRelayServiceConnectionEntityInner.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedRelayServiceConnectionEntityInner.innerProperties
                        = RelayServiceConnectionEntityProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRelayServiceConnectionEntityInner;
        });
    }
}
