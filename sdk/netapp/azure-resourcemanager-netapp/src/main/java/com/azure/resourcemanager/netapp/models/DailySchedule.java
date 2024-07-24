// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Daily Schedule properties.
 */
@Fluent
public final class DailySchedule implements JsonSerializable<DailySchedule> {
    /*
     * Daily snapshot count to keep
     */
    private Integer snapshotsToKeep;

    /*
     * Indicates which hour in UTC timezone a snapshot should be taken
     */
    private Integer hour;

    /*
     * Indicates which minute snapshot should be taken
     */
    private Integer minute;

    /*
     * Resource size in bytes, current storage usage for the volume in bytes
     */
    private Long usedBytes;

    /**
     * Creates an instance of DailySchedule class.
     */
    public DailySchedule() {
    }

    /**
     * Get the snapshotsToKeep property: Daily snapshot count to keep.
     * 
     * @return the snapshotsToKeep value.
     */
    public Integer snapshotsToKeep() {
        return this.snapshotsToKeep;
    }

    /**
     * Set the snapshotsToKeep property: Daily snapshot count to keep.
     * 
     * @param snapshotsToKeep the snapshotsToKeep value to set.
     * @return the DailySchedule object itself.
     */
    public DailySchedule withSnapshotsToKeep(Integer snapshotsToKeep) {
        this.snapshotsToKeep = snapshotsToKeep;
        return this;
    }

    /**
     * Get the hour property: Indicates which hour in UTC timezone a snapshot should be taken.
     * 
     * @return the hour value.
     */
    public Integer hour() {
        return this.hour;
    }

    /**
     * Set the hour property: Indicates which hour in UTC timezone a snapshot should be taken.
     * 
     * @param hour the hour value to set.
     * @return the DailySchedule object itself.
     */
    public DailySchedule withHour(Integer hour) {
        this.hour = hour;
        return this;
    }

    /**
     * Get the minute property: Indicates which minute snapshot should be taken.
     * 
     * @return the minute value.
     */
    public Integer minute() {
        return this.minute;
    }

    /**
     * Set the minute property: Indicates which minute snapshot should be taken.
     * 
     * @param minute the minute value to set.
     * @return the DailySchedule object itself.
     */
    public DailySchedule withMinute(Integer minute) {
        this.minute = minute;
        return this;
    }

    /**
     * Get the usedBytes property: Resource size in bytes, current storage usage for the volume in bytes.
     * 
     * @return the usedBytes value.
     */
    public Long usedBytes() {
        return this.usedBytes;
    }

    /**
     * Set the usedBytes property: Resource size in bytes, current storage usage for the volume in bytes.
     * 
     * @param usedBytes the usedBytes value to set.
     * @return the DailySchedule object itself.
     */
    public DailySchedule withUsedBytes(Long usedBytes) {
        this.usedBytes = usedBytes;
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
        jsonWriter.writeNumberField("snapshotsToKeep", this.snapshotsToKeep);
        jsonWriter.writeNumberField("hour", this.hour);
        jsonWriter.writeNumberField("minute", this.minute);
        jsonWriter.writeNumberField("usedBytes", this.usedBytes);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DailySchedule from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DailySchedule if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the DailySchedule.
     */
    public static DailySchedule fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DailySchedule deserializedDailySchedule = new DailySchedule();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("snapshotsToKeep".equals(fieldName)) {
                    deserializedDailySchedule.snapshotsToKeep = reader.getNullable(JsonReader::getInt);
                } else if ("hour".equals(fieldName)) {
                    deserializedDailySchedule.hour = reader.getNullable(JsonReader::getInt);
                } else if ("minute".equals(fieldName)) {
                    deserializedDailySchedule.minute = reader.getNullable(JsonReader::getInt);
                } else if ("usedBytes".equals(fieldName)) {
                    deserializedDailySchedule.usedBytes = reader.getNullable(JsonReader::getLong);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDailySchedule;
        });
    }
}
