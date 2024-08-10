// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.redis.fluent.models.UpgradeNotificationInner;
import java.io.IOException;
import java.util.List;

/**
 * The response of listUpgradeNotifications.
 */
@Fluent
public final class NotificationListResponse implements JsonSerializable<NotificationListResponse> {
    /*
     * List of all notifications.
     */
    private List<UpgradeNotificationInner> value;

    /*
     * Link for next set of notifications.
     */
    private String nextLink;

    /**
     * Creates an instance of NotificationListResponse class.
     */
    public NotificationListResponse() {
    }

    /**
     * Get the value property: List of all notifications.
     * 
     * @return the value value.
     */
    public List<UpgradeNotificationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of all notifications.
     * 
     * @param value the value value to set.
     * @return the NotificationListResponse object itself.
     */
    public NotificationListResponse withValue(List<UpgradeNotificationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link for next set of notifications.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NotificationListResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NotificationListResponse if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NotificationListResponse.
     */
    public static NotificationListResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NotificationListResponse deserializedNotificationListResponse = new NotificationListResponse();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<UpgradeNotificationInner> value
                        = reader.readArray(reader1 -> UpgradeNotificationInner.fromJson(reader1));
                    deserializedNotificationListResponse.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedNotificationListResponse.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNotificationListResponse;
        });
    }
}
