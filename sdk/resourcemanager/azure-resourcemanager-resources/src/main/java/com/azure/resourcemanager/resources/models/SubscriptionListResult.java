// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.resources.fluent.models.SubscriptionInner;
import java.io.IOException;
import java.util.List;

/**
 * Subscription list operation response.
 */
@Fluent
public final class SubscriptionListResult implements JsonSerializable<SubscriptionListResult> {
    /*
     * An array of subscriptions.
     */
    private List<SubscriptionInner> value;

    /*
     * The URL to get the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of SubscriptionListResult class.
     */
    public SubscriptionListResult() {
    }

    /**
     * Get the value property: An array of subscriptions.
     * 
     * @return the value value.
     */
    public List<SubscriptionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of subscriptions.
     * 
     * @param value the value value to set.
     * @return the SubscriptionListResult object itself.
     */
    public SubscriptionListResult withValue(List<SubscriptionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the SubscriptionListResult object itself.
     */
    public SubscriptionListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
        if (nextLink() == null) {
            throw LOGGER.atError()
                .log(
                    new IllegalArgumentException("Missing required property nextLink in model SubscriptionListResult"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SubscriptionListResult.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("nextLink", this.nextLink);
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SubscriptionListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SubscriptionListResult if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SubscriptionListResult.
     */
    public static SubscriptionListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SubscriptionListResult deserializedSubscriptionListResult = new SubscriptionListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("nextLink".equals(fieldName)) {
                    deserializedSubscriptionListResult.nextLink = reader.getString();
                } else if ("value".equals(fieldName)) {
                    List<SubscriptionInner> value = reader.readArray(reader1 -> SubscriptionInner.fromJson(reader1));
                    deserializedSubscriptionListResult.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSubscriptionListResult;
        });
    }
}
