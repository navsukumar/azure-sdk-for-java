// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * deviceManagementTroubleshootingEvent
 * 
 * Event representing an general failure.
 */
@Fluent
public final class MicrosoftGraphDeviceManagementTroubleshootingEvent extends MicrosoftGraphEntity {
    /*
     * Id used for tracing the failure in the service.
     */
    private String correlationId;

    /*
     * Time when the event occurred .
     */
    private OffsetDateTime eventDateTime;

    /*
     * Event representing an general failure.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphDeviceManagementTroubleshootingEvent class.
     */
    public MicrosoftGraphDeviceManagementTroubleshootingEvent() {
    }

    /**
     * Get the correlationId property: Id used for tracing the failure in the service.
     * 
     * @return the correlationId value.
     */
    public String correlationId() {
        return this.correlationId;
    }

    /**
     * Set the correlationId property: Id used for tracing the failure in the service.
     * 
     * @param correlationId the correlationId value to set.
     * @return the MicrosoftGraphDeviceManagementTroubleshootingEvent object itself.
     */
    public MicrosoftGraphDeviceManagementTroubleshootingEvent withCorrelationId(String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     * Get the eventDateTime property: Time when the event occurred .
     * 
     * @return the eventDateTime value.
     */
    public OffsetDateTime eventDateTime() {
        return this.eventDateTime;
    }

    /**
     * Set the eventDateTime property: Time when the event occurred .
     * 
     * @param eventDateTime the eventDateTime value to set.
     * @return the MicrosoftGraphDeviceManagementTroubleshootingEvent object itself.
     */
    public MicrosoftGraphDeviceManagementTroubleshootingEvent withEventDateTime(OffsetDateTime eventDateTime) {
        this.eventDateTime = eventDateTime;
        return this;
    }

    /**
     * Get the additionalProperties property: Event representing an general failure.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Event representing an general failure.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphDeviceManagementTroubleshootingEvent object itself.
     */
    public MicrosoftGraphDeviceManagementTroubleshootingEvent
        withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphDeviceManagementTroubleshootingEvent withId(String id) {
        super.withId(id);
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
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeStringField("correlationId", this.correlationId);
        jsonWriter.writeStringField("eventDateTime",
            this.eventDateTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.eventDateTime));
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphDeviceManagementTroubleshootingEvent from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphDeviceManagementTroubleshootingEvent if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphDeviceManagementTroubleshootingEvent.
     */
    public static MicrosoftGraphDeviceManagementTroubleshootingEvent fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphDeviceManagementTroubleshootingEvent deserializedMicrosoftGraphDeviceManagementTroubleshootingEvent
                = new MicrosoftGraphDeviceManagementTroubleshootingEvent();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphDeviceManagementTroubleshootingEvent.withId(reader.getString());
                } else if ("correlationId".equals(fieldName)) {
                    deserializedMicrosoftGraphDeviceManagementTroubleshootingEvent.correlationId = reader.getString();
                } else if ("eventDateTime".equals(fieldName)) {
                    deserializedMicrosoftGraphDeviceManagementTroubleshootingEvent.eventDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphDeviceManagementTroubleshootingEvent.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphDeviceManagementTroubleshootingEvent;
        });
    }
}
