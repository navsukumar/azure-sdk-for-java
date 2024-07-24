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
 * Dapr PubSub Bulk Subscription Options.
 */
@Fluent
public final class DaprSubscriptionBulkSubscribeOptions
    implements JsonSerializable<DaprSubscriptionBulkSubscribeOptions> {
    /*
     * Enable bulk subscription
     */
    private Boolean enabled;

    /*
     * Maximum number of messages to deliver in a bulk message.
     */
    private Integer maxMessagesCount;

    /*
     * Maximum duration in milliseconds to wait before a bulk message is sent to the app.
     */
    private Integer maxAwaitDurationMs;

    /**
     * Creates an instance of DaprSubscriptionBulkSubscribeOptions class.
     */
    public DaprSubscriptionBulkSubscribeOptions() {
    }

    /**
     * Get the enabled property: Enable bulk subscription.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Enable bulk subscription.
     * 
     * @param enabled the enabled value to set.
     * @return the DaprSubscriptionBulkSubscribeOptions object itself.
     */
    public DaprSubscriptionBulkSubscribeOptions withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the maxMessagesCount property: Maximum number of messages to deliver in a bulk message.
     * 
     * @return the maxMessagesCount value.
     */
    public Integer maxMessagesCount() {
        return this.maxMessagesCount;
    }

    /**
     * Set the maxMessagesCount property: Maximum number of messages to deliver in a bulk message.
     * 
     * @param maxMessagesCount the maxMessagesCount value to set.
     * @return the DaprSubscriptionBulkSubscribeOptions object itself.
     */
    public DaprSubscriptionBulkSubscribeOptions withMaxMessagesCount(Integer maxMessagesCount) {
        this.maxMessagesCount = maxMessagesCount;
        return this;
    }

    /**
     * Get the maxAwaitDurationMs property: Maximum duration in milliseconds to wait before a bulk message is sent to
     * the app.
     * 
     * @return the maxAwaitDurationMs value.
     */
    public Integer maxAwaitDurationMs() {
        return this.maxAwaitDurationMs;
    }

    /**
     * Set the maxAwaitDurationMs property: Maximum duration in milliseconds to wait before a bulk message is sent to
     * the app.
     * 
     * @param maxAwaitDurationMs the maxAwaitDurationMs value to set.
     * @return the DaprSubscriptionBulkSubscribeOptions object itself.
     */
    public DaprSubscriptionBulkSubscribeOptions withMaxAwaitDurationMs(Integer maxAwaitDurationMs) {
        this.maxAwaitDurationMs = maxAwaitDurationMs;
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
        jsonWriter.writeBooleanField("enabled", this.enabled);
        jsonWriter.writeNumberField("maxMessagesCount", this.maxMessagesCount);
        jsonWriter.writeNumberField("maxAwaitDurationMs", this.maxAwaitDurationMs);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DaprSubscriptionBulkSubscribeOptions from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DaprSubscriptionBulkSubscribeOptions if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DaprSubscriptionBulkSubscribeOptions.
     */
    public static DaprSubscriptionBulkSubscribeOptions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DaprSubscriptionBulkSubscribeOptions deserializedDaprSubscriptionBulkSubscribeOptions
                = new DaprSubscriptionBulkSubscribeOptions();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedDaprSubscriptionBulkSubscribeOptions.enabled
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("maxMessagesCount".equals(fieldName)) {
                    deserializedDaprSubscriptionBulkSubscribeOptions.maxMessagesCount
                        = reader.getNullable(JsonReader::getInt);
                } else if ("maxAwaitDurationMs".equals(fieldName)) {
                    deserializedDaprSubscriptionBulkSubscribeOptions.maxAwaitDurationMs
                        = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDaprSubscriptionBulkSubscribeOptions;
        });
    }
}
