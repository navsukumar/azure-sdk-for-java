// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.containerregistry.models.ProvisioningState;
import com.azure.resourcemanager.containerregistry.models.TokenCredentialsProperties;
import com.azure.resourcemanager.containerregistry.models.TokenStatus;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * An object that represents a token for a container registry.
 */
@Fluent
public final class TokenInner extends ProxyResource {
    /*
     * The properties of the token.
     */
    private TokenProperties innerProperties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    private SystemData systemData;

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
     * Creates an instance of TokenInner class.
     */
    public TokenInner() {
    }

    /**
     * Get the innerProperties property: The properties of the token.
     * 
     * @return the innerProperties value.
     */
    private TokenProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
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
     * Get the creationDate property: The creation date of scope map.
     * 
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.innerProperties() == null ? null : this.innerProperties().creationDate();
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the scopeMapId property: The resource ID of the scope map to which the token will be associated with.
     * 
     * @return the scopeMapId value.
     */
    public String scopeMapId() {
        return this.innerProperties() == null ? null : this.innerProperties().scopeMapId();
    }

    /**
     * Set the scopeMapId property: The resource ID of the scope map to which the token will be associated with.
     * 
     * @param scopeMapId the scopeMapId value to set.
     * @return the TokenInner object itself.
     */
    public TokenInner withScopeMapId(String scopeMapId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TokenProperties();
        }
        this.innerProperties().withScopeMapId(scopeMapId);
        return this;
    }

    /**
     * Get the credentials property: The credentials that can be used for authenticating the token.
     * 
     * @return the credentials value.
     */
    public TokenCredentialsProperties credentials() {
        return this.innerProperties() == null ? null : this.innerProperties().credentials();
    }

    /**
     * Set the credentials property: The credentials that can be used for authenticating the token.
     * 
     * @param credentials the credentials value to set.
     * @return the TokenInner object itself.
     */
    public TokenInner withCredentials(TokenCredentialsProperties credentials) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TokenProperties();
        }
        this.innerProperties().withCredentials(credentials);
        return this;
    }

    /**
     * Get the status property: The status of the token example enabled or disabled.
     * 
     * @return the status value.
     */
    public TokenStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Set the status property: The status of the token example enabled or disabled.
     * 
     * @param status the status value to set.
     * @return the TokenInner object itself.
     */
    public TokenInner withStatus(TokenStatus status) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TokenProperties();
        }
        this.innerProperties().withStatus(status);
        return this;
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
     * Reads an instance of TokenInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TokenInner if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TokenInner.
     */
    public static TokenInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TokenInner deserializedTokenInner = new TokenInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedTokenInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedTokenInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedTokenInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedTokenInner.innerProperties = TokenProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedTokenInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTokenInner;
        });
    }
}
