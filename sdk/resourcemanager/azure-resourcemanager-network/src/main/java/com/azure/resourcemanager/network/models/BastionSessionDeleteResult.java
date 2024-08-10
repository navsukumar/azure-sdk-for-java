// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.fluent.models.BastionSessionStateInner;
import java.io.IOException;
import java.util.List;

/**
 * Response for DisconnectActiveSessions.
 */
@Fluent
public final class BastionSessionDeleteResult implements JsonSerializable<BastionSessionDeleteResult> {
    /*
     * List of sessions with their corresponding state.
     */
    private List<BastionSessionStateInner> value;

    /*
     * The URL to get the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of BastionSessionDeleteResult class.
     */
    public BastionSessionDeleteResult() {
    }

    /**
     * Get the value property: List of sessions with their corresponding state.
     * 
     * @return the value value.
     */
    public List<BastionSessionStateInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of sessions with their corresponding state.
     * 
     * @param value the value value to set.
     * @return the BastionSessionDeleteResult object itself.
     */
    public BastionSessionDeleteResult withValue(List<BastionSessionStateInner> value) {
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
     * @return the BastionSessionDeleteResult object itself.
     */
    public BastionSessionDeleteResult withNextLink(String nextLink) {
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
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BastionSessionDeleteResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BastionSessionDeleteResult if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the BastionSessionDeleteResult.
     */
    public static BastionSessionDeleteResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BastionSessionDeleteResult deserializedBastionSessionDeleteResult = new BastionSessionDeleteResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<BastionSessionStateInner> value
                        = reader.readArray(reader1 -> BastionSessionStateInner.fromJson(reader1));
                    deserializedBastionSessionDeleteResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedBastionSessionDeleteResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBastionSessionDeleteResult;
        });
    }
}
