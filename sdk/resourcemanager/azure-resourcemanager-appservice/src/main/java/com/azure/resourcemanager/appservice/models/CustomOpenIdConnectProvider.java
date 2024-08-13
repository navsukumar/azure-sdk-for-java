// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The configuration settings of the custom Open ID Connect provider.
 */
@Fluent
public final class CustomOpenIdConnectProvider implements JsonSerializable<CustomOpenIdConnectProvider> {
    /*
     * <code>false</code> if the custom Open ID provider provider should not be enabled; otherwise, <code>true</code>.
     */
    private Boolean enabled;

    /*
     * The configuration settings of the app registration for the custom Open ID Connect provider.
     */
    private OpenIdConnectRegistration registration;

    /*
     * The configuration settings of the login flow of the custom Open ID Connect provider.
     */
    private OpenIdConnectLogin login;

    /**
     * Creates an instance of CustomOpenIdConnectProvider class.
     */
    public CustomOpenIdConnectProvider() {
    }

    /**
     * Get the enabled property: &lt;code&gt;false&lt;/code&gt; if the custom Open ID provider provider should not be
     * enabled; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: &lt;code&gt;false&lt;/code&gt; if the custom Open ID provider provider should not be
     * enabled; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     * @param enabled the enabled value to set.
     * @return the CustomOpenIdConnectProvider object itself.
     */
    public CustomOpenIdConnectProvider withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the registration property: The configuration settings of the app registration for the custom Open ID Connect
     * provider.
     * 
     * @return the registration value.
     */
    public OpenIdConnectRegistration registration() {
        return this.registration;
    }

    /**
     * Set the registration property: The configuration settings of the app registration for the custom Open ID Connect
     * provider.
     * 
     * @param registration the registration value to set.
     * @return the CustomOpenIdConnectProvider object itself.
     */
    public CustomOpenIdConnectProvider withRegistration(OpenIdConnectRegistration registration) {
        this.registration = registration;
        return this;
    }

    /**
     * Get the login property: The configuration settings of the login flow of the custom Open ID Connect provider.
     * 
     * @return the login value.
     */
    public OpenIdConnectLogin login() {
        return this.login;
    }

    /**
     * Set the login property: The configuration settings of the login flow of the custom Open ID Connect provider.
     * 
     * @param login the login value to set.
     * @return the CustomOpenIdConnectProvider object itself.
     */
    public CustomOpenIdConnectProvider withLogin(OpenIdConnectLogin login) {
        this.login = login;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (registration() != null) {
            registration().validate();
        }
        if (login() != null) {
            login().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("enabled", this.enabled);
        jsonWriter.writeJsonField("registration", this.registration);
        jsonWriter.writeJsonField("login", this.login);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CustomOpenIdConnectProvider from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CustomOpenIdConnectProvider if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CustomOpenIdConnectProvider.
     */
    public static CustomOpenIdConnectProvider fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CustomOpenIdConnectProvider deserializedCustomOpenIdConnectProvider = new CustomOpenIdConnectProvider();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedCustomOpenIdConnectProvider.enabled = reader.getNullable(JsonReader::getBoolean);
                } else if ("registration".equals(fieldName)) {
                    deserializedCustomOpenIdConnectProvider.registration = OpenIdConnectRegistration.fromJson(reader);
                } else if ("login".equals(fieldName)) {
                    deserializedCustomOpenIdConnectProvider.login = OpenIdConnectLogin.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCustomOpenIdConnectProvider;
        });
    }
}
