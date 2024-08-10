// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * appRole.
 */
@Fluent
public final class MicrosoftGraphAppRole implements JsonSerializable<MicrosoftGraphAppRole> {
    /*
     * Specifies whether this app role can be assigned to users and groups (by setting to ['User']), to other
     * application's (by setting to ['Application'], or both (by setting to ['User', 'Application']). App roles
     * supporting assignment to other applications' service principals are also known as application permissions. The
     * 'Application' value is only supported for app roles defined on application entities.
     */
    private List<String> allowedMemberTypes;

    /*
     * The description for the app role. This is displayed when the app role is being assigned and, if the app role
     * functions as an application permission, during consent experiences.
     */
    private String description;

    /*
     * Display name for the permission that appears in the app role assignment and consent experiences.
     */
    private String displayName;

    /*
     * Unique role identifier inside the appRoles collection. When creating a new app role, a new Guid identifier must
     * be provided.
     */
    private UUID id;

    /*
     * When creating or updating an app role, this must be set to true (which is the default). To delete a role, this
     * must first be set to false. At that point, in a subsequent call, this role may be removed.
     */
    private Boolean isEnabled;

    /*
     * Specifies if the app role is defined on the application object or on the servicePrincipal entity. Must not be
     * included in any POST or PATCH requests. Read-only.
     */
    private String origin;

    /*
     * Specifies the value to include in the roles claim in ID tokens and access tokens authenticating an assigned user
     * or service principal. Must not exceed 120 characters in length. Allowed characters are : ! # $ % & ' ( ) * + , -
     * . / : ; = ? @ [ ] ^ + _ { } ~, as well as characters in the ranges 0-9, A-Z and a-z. Any other character,
     * including the space character, are not allowed.
     */
    private String value;

    /*
     * appRole
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphAppRole class.
     */
    public MicrosoftGraphAppRole() {
    }

    /**
     * Get the allowedMemberTypes property: Specifies whether this app role can be assigned to users and groups (by
     * setting to ['User']), to other application's (by setting to ['Application'], or both (by setting to ['User',
     * 'Application']). App roles supporting assignment to other applications' service principals are also known as
     * application permissions. The 'Application' value is only supported for app roles defined on application entities.
     * 
     * @return the allowedMemberTypes value.
     */
    public List<String> allowedMemberTypes() {
        return this.allowedMemberTypes;
    }

    /**
     * Set the allowedMemberTypes property: Specifies whether this app role can be assigned to users and groups (by
     * setting to ['User']), to other application's (by setting to ['Application'], or both (by setting to ['User',
     * 'Application']). App roles supporting assignment to other applications' service principals are also known as
     * application permissions. The 'Application' value is only supported for app roles defined on application entities.
     * 
     * @param allowedMemberTypes the allowedMemberTypes value to set.
     * @return the MicrosoftGraphAppRole object itself.
     */
    public MicrosoftGraphAppRole withAllowedMemberTypes(List<String> allowedMemberTypes) {
        this.allowedMemberTypes = allowedMemberTypes;
        return this;
    }

    /**
     * Get the description property: The description for the app role. This is displayed when the app role is being
     * assigned and, if the app role functions as an application permission, during consent experiences.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description for the app role. This is displayed when the app role is being
     * assigned and, if the app role functions as an application permission, during consent experiences.
     * 
     * @param description the description value to set.
     * @return the MicrosoftGraphAppRole object itself.
     */
    public MicrosoftGraphAppRole withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the displayName property: Display name for the permission that appears in the app role assignment and consent
     * experiences.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name for the permission that appears in the app role assignment and consent
     * experiences.
     * 
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphAppRole object itself.
     */
    public MicrosoftGraphAppRole withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the id property: Unique role identifier inside the appRoles collection. When creating a new app role, a new
     * Guid identifier must be provided.
     * 
     * @return the id value.
     */
    public UUID id() {
        return this.id;
    }

    /**
     * Set the id property: Unique role identifier inside the appRoles collection. When creating a new app role, a new
     * Guid identifier must be provided.
     * 
     * @param id the id value to set.
     * @return the MicrosoftGraphAppRole object itself.
     */
    public MicrosoftGraphAppRole withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Get the isEnabled property: When creating or updating an app role, this must be set to true (which is the
     * default). To delete a role, this must first be set to false. At that point, in a subsequent call, this role may
     * be removed.
     * 
     * @return the isEnabled value.
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set the isEnabled property: When creating or updating an app role, this must be set to true (which is the
     * default). To delete a role, this must first be set to false. At that point, in a subsequent call, this role may
     * be removed.
     * 
     * @param isEnabled the isEnabled value to set.
     * @return the MicrosoftGraphAppRole object itself.
     */
    public MicrosoftGraphAppRole withIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Get the origin property: Specifies if the app role is defined on the application object or on the
     * servicePrincipal entity. Must not be included in any POST or PATCH requests. Read-only.
     * 
     * @return the origin value.
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set the origin property: Specifies if the app role is defined on the application object or on the
     * servicePrincipal entity. Must not be included in any POST or PATCH requests. Read-only.
     * 
     * @param origin the origin value to set.
     * @return the MicrosoftGraphAppRole object itself.
     */
    public MicrosoftGraphAppRole withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get the value property: Specifies the value to include in the roles claim in ID tokens and access tokens
     * authenticating an assigned user or service principal. Must not exceed 120 characters in length. Allowed
     * characters are : ! # $ % &amp; ' ( ) * + , - . / : ; = ? &#064; [ ] ^ + _ { } ~, as well as characters in the
     * ranges 0-9, A-Z and a-z. Any other character, including the space character, are not allowed.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Specifies the value to include in the roles claim in ID tokens and access tokens
     * authenticating an assigned user or service principal. Must not exceed 120 characters in length. Allowed
     * characters are : ! # $ % &amp; ' ( ) * + , - . / : ; = ? &#064; [ ] ^ + _ { } ~, as well as characters in the
     * ranges 0-9, A-Z and a-z. Any other character, including the space character, are not allowed.
     * 
     * @param value the value value to set.
     * @return the MicrosoftGraphAppRole object itself.
     */
    public MicrosoftGraphAppRole withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the additionalProperties property: appRole.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: appRole.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphAppRole object itself.
     */
    public MicrosoftGraphAppRole withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
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
        jsonWriter.writeArrayField("allowedMemberTypes", this.allowedMemberTypes,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeStringField("id", Objects.toString(this.id, null));
        jsonWriter.writeBooleanField("isEnabled", this.isEnabled);
        jsonWriter.writeStringField("origin", this.origin);
        jsonWriter.writeStringField("value", this.value);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphAppRole from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphAppRole if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphAppRole.
     */
    public static MicrosoftGraphAppRole fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphAppRole deserializedMicrosoftGraphAppRole = new MicrosoftGraphAppRole();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("allowedMemberTypes".equals(fieldName)) {
                    List<String> allowedMemberTypes = reader.readArray(reader1 -> reader1.getString());
                    deserializedMicrosoftGraphAppRole.allowedMemberTypes = allowedMemberTypes;
                } else if ("description".equals(fieldName)) {
                    deserializedMicrosoftGraphAppRole.description = reader.getString();
                } else if ("displayName".equals(fieldName)) {
                    deserializedMicrosoftGraphAppRole.displayName = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphAppRole.id
                        = reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString()));
                } else if ("isEnabled".equals(fieldName)) {
                    deserializedMicrosoftGraphAppRole.isEnabled = reader.getNullable(JsonReader::getBoolean);
                } else if ("origin".equals(fieldName)) {
                    deserializedMicrosoftGraphAppRole.origin = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedMicrosoftGraphAppRole.value = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphAppRole.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphAppRole;
        });
    }
}
