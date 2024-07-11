// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.chat.implementation.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;

import java.io.IOException;
import java.util.List;

/** The MultiStatusResponse model. */
@Immutable
public final class MultiStatusResponse implements JsonSerializable<MultiStatusResponse> {
    /*
     * The list of status information for each resource in the request.
     */
    private List<IndividualStatusResponse> multipleStatus;

    /**
     * Get the multipleStatus property: The list of status information for each resource in the request.
     *
     * @return the multipleStatus value.
     */
    public List<IndividualStatusResponse> getMultipleStatus() {
        return this.multipleStatus;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SendChatMessageOptions from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SendChatMessageOptions if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SendChatMessageOptions.
     */
    public static MultiStatusResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            final MultiStatusResponse response = new MultiStatusResponse();
            while (jsonReader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("multipleStatus".equals(fieldName)) {
                    response.multipleStatus = reader.readArray(IndividualStatusResponse::fromJson);
                } else {
                    reader.skipChildren();
                }
            }
            return response;
        });
    }
}
