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
 * Specifies the web app that snapshot contents will be retrieved from.
 */
@Fluent
public final class SnapshotRecoverySource implements JsonSerializable<SnapshotRecoverySource> {
    /*
     * Geographical location of the source web app, e.g. SouthEastAsia, SouthCentralUS
     */
    private String location;

    /*
     * ARM resource ID of the source app.
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName} for production
     * slots and
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName}/slots/{
     * slotName} for other slots.
     */
    private String id;

    /**
     * Creates an instance of SnapshotRecoverySource class.
     */
    public SnapshotRecoverySource() {
    }

    /**
     * Get the location property: Geographical location of the source web app, e.g. SouthEastAsia, SouthCentralUS.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Geographical location of the source web app, e.g. SouthEastAsia, SouthCentralUS.
     * 
     * @param location the location value to set.
     * @return the SnapshotRecoverySource object itself.
     */
    public SnapshotRecoverySource withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the id property: ARM resource ID of the source app.
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName} for production
     * slots and
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName}/slots/{slotName}
     * for other slots.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: ARM resource ID of the source app.
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName} for production
     * slots and
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName}/slots/{slotName}
     * for other slots.
     * 
     * @param id the id value to set.
     * @return the SnapshotRecoverySource object itself.
     */
    public SnapshotRecoverySource withId(String id) {
        this.id = id;
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
        jsonWriter.writeStringField("location", this.location);
        jsonWriter.writeStringField("id", this.id);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SnapshotRecoverySource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SnapshotRecoverySource if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SnapshotRecoverySource.
     */
    public static SnapshotRecoverySource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SnapshotRecoverySource deserializedSnapshotRecoverySource = new SnapshotRecoverySource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("location".equals(fieldName)) {
                    deserializedSnapshotRecoverySource.location = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedSnapshotRecoverySource.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSnapshotRecoverySource;
        });
    }
}
