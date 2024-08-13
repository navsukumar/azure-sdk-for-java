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
 * Scale and concurrency settings for the function app triggers.
 */
@Fluent
public final class FunctionsScaleAndConcurrencyTriggers
    implements JsonSerializable<FunctionsScaleAndConcurrencyTriggers> {
    /*
     * Scale and concurrency settings for the HTTP trigger.
     */
    private FunctionsScaleAndConcurrencyTriggersHttp http;

    /**
     * Creates an instance of FunctionsScaleAndConcurrencyTriggers class.
     */
    public FunctionsScaleAndConcurrencyTriggers() {
    }

    /**
     * Get the http property: Scale and concurrency settings for the HTTP trigger.
     * 
     * @return the http value.
     */
    public FunctionsScaleAndConcurrencyTriggersHttp http() {
        return this.http;
    }

    /**
     * Set the http property: Scale and concurrency settings for the HTTP trigger.
     * 
     * @param http the http value to set.
     * @return the FunctionsScaleAndConcurrencyTriggers object itself.
     */
    public FunctionsScaleAndConcurrencyTriggers withHttp(FunctionsScaleAndConcurrencyTriggersHttp http) {
        this.http = http;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (http() != null) {
            http().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("http", this.http);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FunctionsScaleAndConcurrencyTriggers from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FunctionsScaleAndConcurrencyTriggers if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the FunctionsScaleAndConcurrencyTriggers.
     */
    public static FunctionsScaleAndConcurrencyTriggers fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FunctionsScaleAndConcurrencyTriggers deserializedFunctionsScaleAndConcurrencyTriggers
                = new FunctionsScaleAndConcurrencyTriggers();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("http".equals(fieldName)) {
                    deserializedFunctionsScaleAndConcurrencyTriggers.http
                        = FunctionsScaleAndConcurrencyTriggersHttp.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFunctionsScaleAndConcurrencyTriggers;
        });
    }
}
