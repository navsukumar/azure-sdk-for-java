// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The ObservedPortState model.
 */
@Immutable
public final class ObservedPortState extends ObservedValue {

    /*
     * The value property.
     */
    @Generated
    private ObservedPortStateValue value;

    /*
     * The port property.
     */
    @Generated
    private Integer port;

    /*
     * The firstSeen property.
     */
    @Generated
    private OffsetDateTime firstSeen;

    /*
     * The lastSeen property.
     */
    @Generated
    private OffsetDateTime lastSeen;

    /*
     * The count property.
     */
    @Generated
    private Long count;

    /*
     * The recent property.
     */
    @Generated
    private Boolean recent;

    /**
     * Creates an instance of ObservedPortState class.
     */
    @Generated
    private ObservedPortState() {
    }

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    @Generated
    public ObservedPortStateValue getValue() {
        return this.value;
    }

    /**
     * Get the port property: The port property.
     *
     * @return the port value.
     */
    @Generated
    public Integer getPort() {
        return this.port;
    }

    /**
     * Get the firstSeen property: The firstSeen property.
     *
     * @return the firstSeen value.
     */
    @Generated
    @Override
    public OffsetDateTime getFirstSeen() {
        return this.firstSeen;
    }

    /**
     * Get the lastSeen property: The lastSeen property.
     *
     * @return the lastSeen value.
     */
    @Generated
    @Override
    public OffsetDateTime getLastSeen() {
        return this.lastSeen;
    }

    /**
     * Get the count property: The count property.
     *
     * @return the count value.
     */
    @Generated
    @Override
    public Long getCount() {
        return this.count;
    }

    /**
     * Get the recent property: The recent property.
     *
     * @return the recent value.
     */
    @Generated
    @Override
    public Boolean isRecent() {
        return this.recent;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("firstSeen",
            getFirstSeen() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(getFirstSeen()));
        jsonWriter.writeStringField("lastSeen",
            getLastSeen() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(getLastSeen()));
        jsonWriter.writeNumberField("count", getCount());
        jsonWriter.writeBooleanField("recent", isRecent());
        jsonWriter.writeStringField("value", this.value == null ? null : this.value.toString());
        jsonWriter.writeNumberField("port", this.port);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ObservedPortState from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ObservedPortState if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ObservedPortState.
     */
    @Generated
    public static ObservedPortState fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ObservedPortState deserializedObservedPortState = new ObservedPortState();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("firstSeen".equals(fieldName)) {
                    deserializedObservedPortState.firstSeen = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("lastSeen".equals(fieldName)) {
                    deserializedObservedPortState.lastSeen = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("count".equals(fieldName)) {
                    deserializedObservedPortState.count = reader.getNullable(JsonReader::getLong);
                } else if ("recent".equals(fieldName)) {
                    deserializedObservedPortState.recent = reader.getNullable(JsonReader::getBoolean);
                } else if ("value".equals(fieldName)) {
                    deserializedObservedPortState.value = ObservedPortStateValue.fromString(reader.getString());
                } else if ("port".equals(fieldName)) {
                    deserializedObservedPortState.port = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedObservedPortState;
        });
    }
}
