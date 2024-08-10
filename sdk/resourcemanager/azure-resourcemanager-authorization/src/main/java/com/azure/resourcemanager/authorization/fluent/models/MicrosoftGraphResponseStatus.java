// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * responseStatus.
 */
@Fluent
public final class MicrosoftGraphResponseStatus implements JsonSerializable<MicrosoftGraphResponseStatus> {
    /*
     * responseType
     */
    private MicrosoftGraphResponseType response;

    /*
     * The date and time that the response was returned. It uses ISO 8601 format and is always in UTC time. For example,
     * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    private OffsetDateTime time;

    /*
     * responseStatus
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphResponseStatus class.
     */
    public MicrosoftGraphResponseStatus() {
    }

    /**
     * Get the response property: responseType.
     * 
     * @return the response value.
     */
    public MicrosoftGraphResponseType response() {
        return this.response;
    }

    /**
     * Set the response property: responseType.
     * 
     * @param response the response value to set.
     * @return the MicrosoftGraphResponseStatus object itself.
     */
    public MicrosoftGraphResponseStatus withResponse(MicrosoftGraphResponseType response) {
        this.response = response;
        return this;
    }

    /**
     * Get the time property: The date and time that the response was returned. It uses ISO 8601 format and is always in
     * UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
     * 
     * @return the time value.
     */
    public OffsetDateTime time() {
        return this.time;
    }

    /**
     * Set the time property: The date and time that the response was returned. It uses ISO 8601 format and is always in
     * UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
     * 
     * @param time the time value to set.
     * @return the MicrosoftGraphResponseStatus object itself.
     */
    public MicrosoftGraphResponseStatus withTime(OffsetDateTime time) {
        this.time = time;
        return this;
    }

    /**
     * Get the additionalProperties property: responseStatus.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: responseStatus.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphResponseStatus object itself.
     */
    public MicrosoftGraphResponseStatus withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
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
        jsonWriter.writeStringField("response", this.response == null ? null : this.response.toString());
        jsonWriter.writeStringField("time",
            this.time == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.time));
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphResponseStatus from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphResponseStatus if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphResponseStatus.
     */
    public static MicrosoftGraphResponseStatus fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphResponseStatus deserializedMicrosoftGraphResponseStatus = new MicrosoftGraphResponseStatus();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("response".equals(fieldName)) {
                    deserializedMicrosoftGraphResponseStatus.response
                        = MicrosoftGraphResponseType.fromString(reader.getString());
                } else if ("time".equals(fieldName)) {
                    deserializedMicrosoftGraphResponseStatus.time = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphResponseStatus.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphResponseStatus;
        });
    }
}
