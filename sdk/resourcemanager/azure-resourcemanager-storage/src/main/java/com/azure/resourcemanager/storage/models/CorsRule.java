// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Specifies a CORS rule for the Blob service.
 */
@Fluent
public final class CorsRule implements JsonSerializable<CorsRule> {
    /*
     * Required if CorsRule element is present. A list of origin domains that will be allowed via CORS, or "*" to allow
     * all domains
     */
    private List<String> allowedOrigins;

    /*
     * Required if CorsRule element is present. A list of HTTP methods that are allowed to be executed by the origin.
     */
    private List<CorsRuleAllowedMethodsItem> allowedMethods;

    /*
     * Required if CorsRule element is present. The number of seconds that the client/browser should cache a preflight
     * response.
     */
    private int maxAgeInSeconds;

    /*
     * Required if CorsRule element is present. A list of response headers to expose to CORS clients.
     */
    private List<String> exposedHeaders;

    /*
     * Required if CorsRule element is present. A list of headers allowed to be part of the cross-origin request.
     */
    private List<String> allowedHeaders;

    /**
     * Creates an instance of CorsRule class.
     */
    public CorsRule() {
    }

    /**
     * Get the allowedOrigins property: Required if CorsRule element is present. A list of origin domains that will be
     * allowed via CORS, or "*" to allow all domains.
     * 
     * @return the allowedOrigins value.
     */
    public List<String> allowedOrigins() {
        return this.allowedOrigins;
    }

    /**
     * Set the allowedOrigins property: Required if CorsRule element is present. A list of origin domains that will be
     * allowed via CORS, or "*" to allow all domains.
     * 
     * @param allowedOrigins the allowedOrigins value to set.
     * @return the CorsRule object itself.
     */
    public CorsRule withAllowedOrigins(List<String> allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
        return this;
    }

    /**
     * Get the allowedMethods property: Required if CorsRule element is present. A list of HTTP methods that are allowed
     * to be executed by the origin.
     * 
     * @return the allowedMethods value.
     */
    public List<CorsRuleAllowedMethodsItem> allowedMethods() {
        return this.allowedMethods;
    }

    /**
     * Set the allowedMethods property: Required if CorsRule element is present. A list of HTTP methods that are allowed
     * to be executed by the origin.
     * 
     * @param allowedMethods the allowedMethods value to set.
     * @return the CorsRule object itself.
     */
    public CorsRule withAllowedMethods(List<CorsRuleAllowedMethodsItem> allowedMethods) {
        this.allowedMethods = allowedMethods;
        return this;
    }

    /**
     * Get the maxAgeInSeconds property: Required if CorsRule element is present. The number of seconds that the
     * client/browser should cache a preflight response.
     * 
     * @return the maxAgeInSeconds value.
     */
    public int maxAgeInSeconds() {
        return this.maxAgeInSeconds;
    }

    /**
     * Set the maxAgeInSeconds property: Required if CorsRule element is present. The number of seconds that the
     * client/browser should cache a preflight response.
     * 
     * @param maxAgeInSeconds the maxAgeInSeconds value to set.
     * @return the CorsRule object itself.
     */
    public CorsRule withMaxAgeInSeconds(int maxAgeInSeconds) {
        this.maxAgeInSeconds = maxAgeInSeconds;
        return this;
    }

    /**
     * Get the exposedHeaders property: Required if CorsRule element is present. A list of response headers to expose to
     * CORS clients.
     * 
     * @return the exposedHeaders value.
     */
    public List<String> exposedHeaders() {
        return this.exposedHeaders;
    }

    /**
     * Set the exposedHeaders property: Required if CorsRule element is present. A list of response headers to expose to
     * CORS clients.
     * 
     * @param exposedHeaders the exposedHeaders value to set.
     * @return the CorsRule object itself.
     */
    public CorsRule withExposedHeaders(List<String> exposedHeaders) {
        this.exposedHeaders = exposedHeaders;
        return this;
    }

    /**
     * Get the allowedHeaders property: Required if CorsRule element is present. A list of headers allowed to be part of
     * the cross-origin request.
     * 
     * @return the allowedHeaders value.
     */
    public List<String> allowedHeaders() {
        return this.allowedHeaders;
    }

    /**
     * Set the allowedHeaders property: Required if CorsRule element is present. A list of headers allowed to be part of
     * the cross-origin request.
     * 
     * @param allowedHeaders the allowedHeaders value to set.
     * @return the CorsRule object itself.
     */
    public CorsRule withAllowedHeaders(List<String> allowedHeaders) {
        this.allowedHeaders = allowedHeaders;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (allowedOrigins() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property allowedOrigins in model CorsRule"));
        }
        if (allowedMethods() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property allowedMethods in model CorsRule"));
        }
        if (exposedHeaders() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property exposedHeaders in model CorsRule"));
        }
        if (allowedHeaders() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property allowedHeaders in model CorsRule"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CorsRule.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("allowedOrigins", this.allowedOrigins,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("allowedMethods", this.allowedMethods,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        jsonWriter.writeIntField("maxAgeInSeconds", this.maxAgeInSeconds);
        jsonWriter.writeArrayField("exposedHeaders", this.exposedHeaders,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("allowedHeaders", this.allowedHeaders,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CorsRule from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CorsRule if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CorsRule.
     */
    public static CorsRule fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CorsRule deserializedCorsRule = new CorsRule();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("allowedOrigins".equals(fieldName)) {
                    List<String> allowedOrigins = reader.readArray(reader1 -> reader1.getString());
                    deserializedCorsRule.allowedOrigins = allowedOrigins;
                } else if ("allowedMethods".equals(fieldName)) {
                    List<CorsRuleAllowedMethodsItem> allowedMethods
                        = reader.readArray(reader1 -> CorsRuleAllowedMethodsItem.fromString(reader1.getString()));
                    deserializedCorsRule.allowedMethods = allowedMethods;
                } else if ("maxAgeInSeconds".equals(fieldName)) {
                    deserializedCorsRule.maxAgeInSeconds = reader.getInt();
                } else if ("exposedHeaders".equals(fieldName)) {
                    List<String> exposedHeaders = reader.readArray(reader1 -> reader1.getString());
                    deserializedCorsRule.exposedHeaders = exposedHeaders;
                } else if ("allowedHeaders".equals(fieldName)) {
                    List<String> allowedHeaders = reader.readArray(reader1 -> reader1.getString());
                    deserializedCorsRule.allowedHeaders = allowedHeaders;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCorsRule;
        });
    }
}
