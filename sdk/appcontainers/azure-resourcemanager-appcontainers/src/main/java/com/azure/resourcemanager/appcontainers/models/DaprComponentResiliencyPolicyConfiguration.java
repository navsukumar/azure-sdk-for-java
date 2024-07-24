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

/**
 * Dapr Component Resiliency Policy Configuration.
 */
@Fluent
public final class DaprComponentResiliencyPolicyConfiguration
    implements JsonSerializable<DaprComponentResiliencyPolicyConfiguration> {
    /*
     * The optional HTTP retry policy configuration
     */
    private DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration httpRetryPolicy;

    /*
     * The optional timeout policy configuration
     */
    private DaprComponentResiliencyPolicyTimeoutPolicyConfiguration timeoutPolicy;

    /*
     * The optional circuit breaker policy configuration
     */
    private DaprComponentResiliencyPolicyCircuitBreakerPolicyConfiguration circuitBreakerPolicy;

    /**
     * Creates an instance of DaprComponentResiliencyPolicyConfiguration class.
     */
    public DaprComponentResiliencyPolicyConfiguration() {
    }

    /**
     * Get the httpRetryPolicy property: The optional HTTP retry policy configuration.
     * 
     * @return the httpRetryPolicy value.
     */
    public DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration httpRetryPolicy() {
        return this.httpRetryPolicy;
    }

    /**
     * Set the httpRetryPolicy property: The optional HTTP retry policy configuration.
     * 
     * @param httpRetryPolicy the httpRetryPolicy value to set.
     * @return the DaprComponentResiliencyPolicyConfiguration object itself.
     */
    public DaprComponentResiliencyPolicyConfiguration
        withHttpRetryPolicy(DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration httpRetryPolicy) {
        this.httpRetryPolicy = httpRetryPolicy;
        return this;
    }

    /**
     * Get the timeoutPolicy property: The optional timeout policy configuration.
     * 
     * @return the timeoutPolicy value.
     */
    public DaprComponentResiliencyPolicyTimeoutPolicyConfiguration timeoutPolicy() {
        return this.timeoutPolicy;
    }

    /**
     * Set the timeoutPolicy property: The optional timeout policy configuration.
     * 
     * @param timeoutPolicy the timeoutPolicy value to set.
     * @return the DaprComponentResiliencyPolicyConfiguration object itself.
     */
    public DaprComponentResiliencyPolicyConfiguration
        withTimeoutPolicy(DaprComponentResiliencyPolicyTimeoutPolicyConfiguration timeoutPolicy) {
        this.timeoutPolicy = timeoutPolicy;
        return this;
    }

    /**
     * Get the circuitBreakerPolicy property: The optional circuit breaker policy configuration.
     * 
     * @return the circuitBreakerPolicy value.
     */
    public DaprComponentResiliencyPolicyCircuitBreakerPolicyConfiguration circuitBreakerPolicy() {
        return this.circuitBreakerPolicy;
    }

    /**
     * Set the circuitBreakerPolicy property: The optional circuit breaker policy configuration.
     * 
     * @param circuitBreakerPolicy the circuitBreakerPolicy value to set.
     * @return the DaprComponentResiliencyPolicyConfiguration object itself.
     */
    public DaprComponentResiliencyPolicyConfiguration
        withCircuitBreakerPolicy(DaprComponentResiliencyPolicyCircuitBreakerPolicyConfiguration circuitBreakerPolicy) {
        this.circuitBreakerPolicy = circuitBreakerPolicy;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (httpRetryPolicy() != null) {
            httpRetryPolicy().validate();
        }
        if (timeoutPolicy() != null) {
            timeoutPolicy().validate();
        }
        if (circuitBreakerPolicy() != null) {
            circuitBreakerPolicy().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("httpRetryPolicy", this.httpRetryPolicy);
        jsonWriter.writeJsonField("timeoutPolicy", this.timeoutPolicy);
        jsonWriter.writeJsonField("circuitBreakerPolicy", this.circuitBreakerPolicy);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DaprComponentResiliencyPolicyConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DaprComponentResiliencyPolicyConfiguration if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DaprComponentResiliencyPolicyConfiguration.
     */
    public static DaprComponentResiliencyPolicyConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DaprComponentResiliencyPolicyConfiguration deserializedDaprComponentResiliencyPolicyConfiguration
                = new DaprComponentResiliencyPolicyConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("httpRetryPolicy".equals(fieldName)) {
                    deserializedDaprComponentResiliencyPolicyConfiguration.httpRetryPolicy
                        = DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration.fromJson(reader);
                } else if ("timeoutPolicy".equals(fieldName)) {
                    deserializedDaprComponentResiliencyPolicyConfiguration.timeoutPolicy
                        = DaprComponentResiliencyPolicyTimeoutPolicyConfiguration.fromJson(reader);
                } else if ("circuitBreakerPolicy".equals(fieldName)) {
                    deserializedDaprComponentResiliencyPolicyConfiguration.circuitBreakerPolicy
                        = DaprComponentResiliencyPolicyCircuitBreakerPolicyConfiguration.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDaprComponentResiliencyPolicyConfiguration;
        });
    }
}
