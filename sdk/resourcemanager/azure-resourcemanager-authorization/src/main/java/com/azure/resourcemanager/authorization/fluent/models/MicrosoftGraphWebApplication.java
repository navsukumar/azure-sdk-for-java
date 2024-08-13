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

/**
 * webApplication.
 */
@Fluent
public final class MicrosoftGraphWebApplication implements JsonSerializable<MicrosoftGraphWebApplication> {
    /*
     * Home page or landing page of the application.
     */
    private String homePageUrl;

    /*
     * implicitGrantSettings
     */
    private MicrosoftGraphImplicitGrantSettings implicitGrantSettings;

    /*
     * Specifies the URL that will be used by Microsoft's authorization service to logout an user using front-channel,
     * back-channel or SAML logout protocols.
     */
    private String logoutUrl;

    /*
     * Specifies the URLs where user tokens are sent for sign-in, or the redirect URIs where OAuth 2.0 authorization
     * codes and access tokens are sent.
     */
    private List<String> redirectUris;

    /*
     * webApplication
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphWebApplication class.
     */
    public MicrosoftGraphWebApplication() {
    }

    /**
     * Get the homePageUrl property: Home page or landing page of the application.
     * 
     * @return the homePageUrl value.
     */
    public String homePageUrl() {
        return this.homePageUrl;
    }

    /**
     * Set the homePageUrl property: Home page or landing page of the application.
     * 
     * @param homePageUrl the homePageUrl value to set.
     * @return the MicrosoftGraphWebApplication object itself.
     */
    public MicrosoftGraphWebApplication withHomePageUrl(String homePageUrl) {
        this.homePageUrl = homePageUrl;
        return this;
    }

    /**
     * Get the implicitGrantSettings property: implicitGrantSettings.
     * 
     * @return the implicitGrantSettings value.
     */
    public MicrosoftGraphImplicitGrantSettings implicitGrantSettings() {
        return this.implicitGrantSettings;
    }

    /**
     * Set the implicitGrantSettings property: implicitGrantSettings.
     * 
     * @param implicitGrantSettings the implicitGrantSettings value to set.
     * @return the MicrosoftGraphWebApplication object itself.
     */
    public MicrosoftGraphWebApplication
        withImplicitGrantSettings(MicrosoftGraphImplicitGrantSettings implicitGrantSettings) {
        this.implicitGrantSettings = implicitGrantSettings;
        return this;
    }

    /**
     * Get the logoutUrl property: Specifies the URL that will be used by Microsoft's authorization service to logout an
     * user using front-channel, back-channel or SAML logout protocols.
     * 
     * @return the logoutUrl value.
     */
    public String logoutUrl() {
        return this.logoutUrl;
    }

    /**
     * Set the logoutUrl property: Specifies the URL that will be used by Microsoft's authorization service to logout an
     * user using front-channel, back-channel or SAML logout protocols.
     * 
     * @param logoutUrl the logoutUrl value to set.
     * @return the MicrosoftGraphWebApplication object itself.
     */
    public MicrosoftGraphWebApplication withLogoutUrl(String logoutUrl) {
        this.logoutUrl = logoutUrl;
        return this;
    }

    /**
     * Get the redirectUris property: Specifies the URLs where user tokens are sent for sign-in, or the redirect URIs
     * where OAuth 2.0 authorization codes and access tokens are sent.
     * 
     * @return the redirectUris value.
     */
    public List<String> redirectUris() {
        return this.redirectUris;
    }

    /**
     * Set the redirectUris property: Specifies the URLs where user tokens are sent for sign-in, or the redirect URIs
     * where OAuth 2.0 authorization codes and access tokens are sent.
     * 
     * @param redirectUris the redirectUris value to set.
     * @return the MicrosoftGraphWebApplication object itself.
     */
    public MicrosoftGraphWebApplication withRedirectUris(List<String> redirectUris) {
        this.redirectUris = redirectUris;
        return this;
    }

    /**
     * Get the additionalProperties property: webApplication.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: webApplication.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphWebApplication object itself.
     */
    public MicrosoftGraphWebApplication withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (implicitGrantSettings() != null) {
            implicitGrantSettings().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("homePageUrl", this.homePageUrl);
        jsonWriter.writeJsonField("implicitGrantSettings", this.implicitGrantSettings);
        jsonWriter.writeStringField("logoutUrl", this.logoutUrl);
        jsonWriter.writeArrayField("redirectUris", this.redirectUris, (writer, element) -> writer.writeString(element));
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphWebApplication from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphWebApplication if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphWebApplication.
     */
    public static MicrosoftGraphWebApplication fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphWebApplication deserializedMicrosoftGraphWebApplication = new MicrosoftGraphWebApplication();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("homePageUrl".equals(fieldName)) {
                    deserializedMicrosoftGraphWebApplication.homePageUrl = reader.getString();
                } else if ("implicitGrantSettings".equals(fieldName)) {
                    deserializedMicrosoftGraphWebApplication.implicitGrantSettings
                        = MicrosoftGraphImplicitGrantSettings.fromJson(reader);
                } else if ("logoutUrl".equals(fieldName)) {
                    deserializedMicrosoftGraphWebApplication.logoutUrl = reader.getString();
                } else if ("redirectUris".equals(fieldName)) {
                    List<String> redirectUris = reader.readArray(reader1 -> reader1.getString());
                    deserializedMicrosoftGraphWebApplication.redirectUris = redirectUris;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphWebApplication.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphWebApplication;
        });
    }
}
