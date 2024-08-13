// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * attendee.
 */
@Fluent
public final class MicrosoftGraphAttendee extends MicrosoftGraphAttendeeBase {
    /*
     * timeSlot
     */
    private MicrosoftGraphTimeSlot proposedNewTime;

    /*
     * responseStatus
     */
    private MicrosoftGraphResponseStatus status;

    /*
     * attendee
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphAttendee class.
     */
    public MicrosoftGraphAttendee() {
    }

    /**
     * Get the proposedNewTime property: timeSlot.
     * 
     * @return the proposedNewTime value.
     */
    public MicrosoftGraphTimeSlot proposedNewTime() {
        return this.proposedNewTime;
    }

    /**
     * Set the proposedNewTime property: timeSlot.
     * 
     * @param proposedNewTime the proposedNewTime value to set.
     * @return the MicrosoftGraphAttendee object itself.
     */
    public MicrosoftGraphAttendee withProposedNewTime(MicrosoftGraphTimeSlot proposedNewTime) {
        this.proposedNewTime = proposedNewTime;
        return this;
    }

    /**
     * Get the status property: responseStatus.
     * 
     * @return the status value.
     */
    public MicrosoftGraphResponseStatus status() {
        return this.status;
    }

    /**
     * Set the status property: responseStatus.
     * 
     * @param status the status value to set.
     * @return the MicrosoftGraphAttendee object itself.
     */
    public MicrosoftGraphAttendee withStatus(MicrosoftGraphResponseStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the additionalProperties property: attendee.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: attendee.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphAttendee object itself.
     */
    public MicrosoftGraphAttendee withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphAttendee withType(MicrosoftGraphAttendeeType type) {
        super.withType(type);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphAttendee withEmailAddress(MicrosoftGraphEmailAddress emailAddress) {
        super.withEmailAddress(emailAddress);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (proposedNewTime() != null) {
            proposedNewTime().validate();
        }
        if (status() != null) {
            status().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("emailAddress", emailAddress());
        jsonWriter.writeStringField("type", type() == null ? null : type().toString());
        jsonWriter.writeJsonField("proposedNewTime", this.proposedNewTime);
        jsonWriter.writeJsonField("status", this.status);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphAttendee from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphAttendee if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphAttendee.
     */
    public static MicrosoftGraphAttendee fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphAttendee deserializedMicrosoftGraphAttendee = new MicrosoftGraphAttendee();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("emailAddress".equals(fieldName)) {
                    deserializedMicrosoftGraphAttendee.withEmailAddress(MicrosoftGraphEmailAddress.fromJson(reader));
                } else if ("type".equals(fieldName)) {
                    deserializedMicrosoftGraphAttendee
                        .withType(MicrosoftGraphAttendeeType.fromString(reader.getString()));
                } else if ("proposedNewTime".equals(fieldName)) {
                    deserializedMicrosoftGraphAttendee.proposedNewTime = MicrosoftGraphTimeSlot.fromJson(reader);
                } else if ("status".equals(fieldName)) {
                    deserializedMicrosoftGraphAttendee.status = MicrosoftGraphResponseStatus.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphAttendee.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphAttendee;
        });
    }
}
