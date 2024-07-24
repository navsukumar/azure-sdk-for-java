// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The configuration settings of the login flow of users using ContainerApp Service Authentication/Authorization.
 */
@Fluent
public final class Login implements JsonSerializable<Login> {
    /*
     * The routes that specify the endpoints used for login and logout requests.
     */
    private LoginRoutes routes;

    /*
     * The configuration settings of the token store.
     */
    private TokenStore tokenStore;

    /*
     * <code>true</code> if the fragments from the request are preserved after the login request is made; otherwise,
     * <code>false</code>.
     */
    private Boolean preserveUrlFragmentsForLogins;

    /*
     * External URLs that can be redirected to as part of logging in or logging out of the app. Note that the query
     * string part of the URL is ignored.
     * This is an advanced setting typically only needed by Windows Store application backends.
     * Note that URLs within the current domain are always implicitly allowed.
     */
    private List<String> allowedExternalRedirectUrls;

    /*
     * The configuration settings of the session cookie's expiration.
     */
    private CookieExpiration cookieExpiration;

    /*
     * The configuration settings of the nonce used in the login flow.
     */
    private Nonce nonce;

    /**
     * Creates an instance of Login class.
     */
    public Login() {
    }

    /**
     * Get the routes property: The routes that specify the endpoints used for login and logout requests.
     * 
     * @return the routes value.
     */
    public LoginRoutes routes() {
        return this.routes;
    }

    /**
     * Set the routes property: The routes that specify the endpoints used for login and logout requests.
     * 
     * @param routes the routes value to set.
     * @return the Login object itself.
     */
    public Login withRoutes(LoginRoutes routes) {
        this.routes = routes;
        return this;
    }

    /**
     * Get the tokenStore property: The configuration settings of the token store.
     * 
     * @return the tokenStore value.
     */
    public TokenStore tokenStore() {
        return this.tokenStore;
    }

    /**
     * Set the tokenStore property: The configuration settings of the token store.
     * 
     * @param tokenStore the tokenStore value to set.
     * @return the Login object itself.
     */
    public Login withTokenStore(TokenStore tokenStore) {
        this.tokenStore = tokenStore;
        return this;
    }

    /**
     * Get the preserveUrlFragmentsForLogins property: &lt;code&gt;true&lt;/code&gt; if the fragments from the request
     * are preserved after the login request is made; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the preserveUrlFragmentsForLogins value.
     */
    public Boolean preserveUrlFragmentsForLogins() {
        return this.preserveUrlFragmentsForLogins;
    }

    /**
     * Set the preserveUrlFragmentsForLogins property: &lt;code&gt;true&lt;/code&gt; if the fragments from the request
     * are preserved after the login request is made; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @param preserveUrlFragmentsForLogins the preserveUrlFragmentsForLogins value to set.
     * @return the Login object itself.
     */
    public Login withPreserveUrlFragmentsForLogins(Boolean preserveUrlFragmentsForLogins) {
        this.preserveUrlFragmentsForLogins = preserveUrlFragmentsForLogins;
        return this;
    }

    /**
     * Get the allowedExternalRedirectUrls property: External URLs that can be redirected to as part of logging in or
     * logging out of the app. Note that the query string part of the URL is ignored.
     * This is an advanced setting typically only needed by Windows Store application backends.
     * Note that URLs within the current domain are always implicitly allowed.
     * 
     * @return the allowedExternalRedirectUrls value.
     */
    public List<String> allowedExternalRedirectUrls() {
        return this.allowedExternalRedirectUrls;
    }

    /**
     * Set the allowedExternalRedirectUrls property: External URLs that can be redirected to as part of logging in or
     * logging out of the app. Note that the query string part of the URL is ignored.
     * This is an advanced setting typically only needed by Windows Store application backends.
     * Note that URLs within the current domain are always implicitly allowed.
     * 
     * @param allowedExternalRedirectUrls the allowedExternalRedirectUrls value to set.
     * @return the Login object itself.
     */
    public Login withAllowedExternalRedirectUrls(List<String> allowedExternalRedirectUrls) {
        this.allowedExternalRedirectUrls = allowedExternalRedirectUrls;
        return this;
    }

    /**
     * Get the cookieExpiration property: The configuration settings of the session cookie's expiration.
     * 
     * @return the cookieExpiration value.
     */
    public CookieExpiration cookieExpiration() {
        return this.cookieExpiration;
    }

    /**
     * Set the cookieExpiration property: The configuration settings of the session cookie's expiration.
     * 
     * @param cookieExpiration the cookieExpiration value to set.
     * @return the Login object itself.
     */
    public Login withCookieExpiration(CookieExpiration cookieExpiration) {
        this.cookieExpiration = cookieExpiration;
        return this;
    }

    /**
     * Get the nonce property: The configuration settings of the nonce used in the login flow.
     * 
     * @return the nonce value.
     */
    public Nonce nonce() {
        return this.nonce;
    }

    /**
     * Set the nonce property: The configuration settings of the nonce used in the login flow.
     * 
     * @param nonce the nonce value to set.
     * @return the Login object itself.
     */
    public Login withNonce(Nonce nonce) {
        this.nonce = nonce;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (routes() != null) {
            routes().validate();
        }
        if (tokenStore() != null) {
            tokenStore().validate();
        }
        if (cookieExpiration() != null) {
            cookieExpiration().validate();
        }
        if (nonce() != null) {
            nonce().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("routes", this.routes);
        jsonWriter.writeJsonField("tokenStore", this.tokenStore);
        jsonWriter.writeBooleanField("preserveUrlFragmentsForLogins", this.preserveUrlFragmentsForLogins);
        jsonWriter.writeArrayField("allowedExternalRedirectUrls", this.allowedExternalRedirectUrls,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("cookieExpiration", this.cookieExpiration);
        jsonWriter.writeJsonField("nonce", this.nonce);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Login from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Login if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IOException If an error occurs while reading the Login.
     */
    public static Login fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Login deserializedLogin = new Login();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("routes".equals(fieldName)) {
                    deserializedLogin.routes = LoginRoutes.fromJson(reader);
                } else if ("tokenStore".equals(fieldName)) {
                    deserializedLogin.tokenStore = TokenStore.fromJson(reader);
                } else if ("preserveUrlFragmentsForLogins".equals(fieldName)) {
                    deserializedLogin.preserveUrlFragmentsForLogins = reader.getNullable(JsonReader::getBoolean);
                } else if ("allowedExternalRedirectUrls".equals(fieldName)) {
                    List<String> allowedExternalRedirectUrls = reader.readArray(reader1 -> reader1.getString());
                    deserializedLogin.allowedExternalRedirectUrls = allowedExternalRedirectUrls;
                } else if ("cookieExpiration".equals(fieldName)) {
                    deserializedLogin.cookieExpiration = CookieExpiration.fromJson(reader);
                } else if ("nonce".equals(fieldName)) {
                    deserializedLogin.nonce = Nonce.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLogin;
        });
    }
}
