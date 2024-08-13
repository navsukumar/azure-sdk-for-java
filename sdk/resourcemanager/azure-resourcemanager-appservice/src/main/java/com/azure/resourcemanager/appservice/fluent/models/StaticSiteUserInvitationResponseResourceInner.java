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
import java.time.OffsetDateTime;

/**
 * Static sites user roles invitation link resource.
 */
@Fluent
public final class StaticSiteUserInvitationResponseResourceInner extends ProxyOnlyResource {
    /*
     * StaticSiteUserInvitationResponseResource resource specific properties
     */
    private StaticSiteUserInvitationResponseResourceProperties innerProperties;

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
     * Creates an instance of StaticSiteUserInvitationResponseResourceInner class.
     */
    public StaticSiteUserInvitationResponseResourceInner() {
    }

    /**
     * Get the innerProperties property: StaticSiteUserInvitationResponseResource resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private StaticSiteUserInvitationResponseResourceProperties innerProperties() {
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
    public StaticSiteUserInvitationResponseResourceInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the expiresOn property: The expiration time of the invitation.
     * 
     * @return the expiresOn value.
     */
    public OffsetDateTime expiresOn() {
        return this.innerProperties() == null ? null : this.innerProperties().expiresOn();
    }

    /**
     * Get the invitationUrl property: The url for the invitation link.
     * 
     * @return the invitationUrl value.
     */
    public String invitationUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().invitationUrl();
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
     * Reads an instance of StaticSiteUserInvitationResponseResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StaticSiteUserInvitationResponseResourceInner if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the StaticSiteUserInvitationResponseResourceInner.
     */
    public static StaticSiteUserInvitationResponseResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StaticSiteUserInvitationResponseResourceInner deserializedStaticSiteUserInvitationResponseResourceInner
                = new StaticSiteUserInvitationResponseResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedStaticSiteUserInvitationResponseResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedStaticSiteUserInvitationResponseResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedStaticSiteUserInvitationResponseResourceInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedStaticSiteUserInvitationResponseResourceInner.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedStaticSiteUserInvitationResponseResourceInner.innerProperties
                        = StaticSiteUserInvitationResponseResourceProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStaticSiteUserInvitationResponseResourceInner;
        });
    }
}
