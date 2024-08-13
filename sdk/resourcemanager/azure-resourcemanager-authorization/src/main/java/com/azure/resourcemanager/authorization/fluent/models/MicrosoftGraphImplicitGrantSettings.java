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
import java.util.Map;

/**
 * implicitGrantSettings.
 */
@Fluent
public final class MicrosoftGraphImplicitGrantSettings
    implements JsonSerializable<MicrosoftGraphImplicitGrantSettings> {
    /*
     * Specifies whether this web application can request an access token using the OAuth 2.0 implicit flow.
     */
    private Boolean enableAccessTokenIssuance;

    /*
     * Specifies whether this web application can request an ID token using the OAuth 2.0 implicit flow.
     */
    private Boolean enableIdTokenIssuance;

    /*
     * implicitGrantSettings
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphImplicitGrantSettings class.
     */
    public MicrosoftGraphImplicitGrantSettings() {
    }

    /**
     * Get the enableAccessTokenIssuance property: Specifies whether this web application can request an access token
     * using the OAuth 2.0 implicit flow.
     * 
     * @return the enableAccessTokenIssuance value.
     */
    public Boolean enableAccessTokenIssuance() {
        return this.enableAccessTokenIssuance;
    }

    /**
     * Set the enableAccessTokenIssuance property: Specifies whether this web application can request an access token
     * using the OAuth 2.0 implicit flow.
     * 
     * @param enableAccessTokenIssuance the enableAccessTokenIssuance value to set.
     * @return the MicrosoftGraphImplicitGrantSettings object itself.
     */
    public MicrosoftGraphImplicitGrantSettings withEnableAccessTokenIssuance(Boolean enableAccessTokenIssuance) {
        this.enableAccessTokenIssuance = enableAccessTokenIssuance;
        return this;
    }

    /**
     * Get the enableIdTokenIssuance property: Specifies whether this web application can request an ID token using the
     * OAuth 2.0 implicit flow.
     * 
     * @return the enableIdTokenIssuance value.
     */
    public Boolean enableIdTokenIssuance() {
        return this.enableIdTokenIssuance;
    }

    /**
     * Set the enableIdTokenIssuance property: Specifies whether this web application can request an ID token using the
     * OAuth 2.0 implicit flow.
     * 
     * @param enableIdTokenIssuance the enableIdTokenIssuance value to set.
     * @return the MicrosoftGraphImplicitGrantSettings object itself.
     */
    public MicrosoftGraphImplicitGrantSettings withEnableIdTokenIssuance(Boolean enableIdTokenIssuance) {
        this.enableIdTokenIssuance = enableIdTokenIssuance;
        return this;
    }

    /**
     * Get the additionalProperties property: implicitGrantSettings.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: implicitGrantSettings.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphImplicitGrantSettings object itself.
     */
    public MicrosoftGraphImplicitGrantSettings withAdditionalProperties(Map<String, Object> additionalProperties) {
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
        jsonWriter.writeBooleanField("enableAccessTokenIssuance", this.enableAccessTokenIssuance);
        jsonWriter.writeBooleanField("enableIdTokenIssuance", this.enableIdTokenIssuance);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphImplicitGrantSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphImplicitGrantSettings if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphImplicitGrantSettings.
     */
    public static MicrosoftGraphImplicitGrantSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphImplicitGrantSettings deserializedMicrosoftGraphImplicitGrantSettings
                = new MicrosoftGraphImplicitGrantSettings();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enableAccessTokenIssuance".equals(fieldName)) {
                    deserializedMicrosoftGraphImplicitGrantSettings.enableAccessTokenIssuance
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("enableIdTokenIssuance".equals(fieldName)) {
                    deserializedMicrosoftGraphImplicitGrantSettings.enableIdTokenIssuance
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphImplicitGrantSettings.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphImplicitGrantSettings;
        });
    }
}
