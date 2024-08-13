// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.trafficmanager.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Class representing a Traffic Manager Name Availability response.
 */
@Fluent
public final class TrafficManagerNameAvailabilityInner
    implements JsonSerializable<TrafficManagerNameAvailabilityInner> {
    /*
     * The relative name.
     */
    private String name;

    /*
     * Traffic Manager profile resource type.
     */
    private String type;

    /*
     * Describes whether the relative name is available or not.
     */
    private Boolean nameAvailable;

    /*
     * The reason why the name is not available, when applicable.
     */
    private String reason;

    /*
     * Descriptive message that explains why the name is not available, when applicable.
     */
    private String message;

    /**
     * Creates an instance of TrafficManagerNameAvailabilityInner class.
     */
    public TrafficManagerNameAvailabilityInner() {
    }

    /**
     * Get the name property: The relative name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The relative name.
     * 
     * @param name the name value to set.
     * @return the TrafficManagerNameAvailabilityInner object itself.
     */
    public TrafficManagerNameAvailabilityInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Traffic Manager profile resource type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Traffic Manager profile resource type.
     * 
     * @param type the type value to set.
     * @return the TrafficManagerNameAvailabilityInner object itself.
     */
    public TrafficManagerNameAvailabilityInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the nameAvailable property: Describes whether the relative name is available or not.
     * 
     * @return the nameAvailable value.
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Set the nameAvailable property: Describes whether the relative name is available or not.
     * 
     * @param nameAvailable the nameAvailable value to set.
     * @return the TrafficManagerNameAvailabilityInner object itself.
     */
    public TrafficManagerNameAvailabilityInner withNameAvailable(Boolean nameAvailable) {
        this.nameAvailable = nameAvailable;
        return this;
    }

    /**
     * Get the reason property: The reason why the name is not available, when applicable.
     * 
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason property: The reason why the name is not available, when applicable.
     * 
     * @param reason the reason value to set.
     * @return the TrafficManagerNameAvailabilityInner object itself.
     */
    public TrafficManagerNameAvailabilityInner withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get the message property: Descriptive message that explains why the name is not available, when applicable.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Descriptive message that explains why the name is not available, when applicable.
     * 
     * @param message the message value to set.
     * @return the TrafficManagerNameAvailabilityInner object itself.
     */
    public TrafficManagerNameAvailabilityInner withMessage(String message) {
        this.message = message;
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
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeBooleanField("nameAvailable", this.nameAvailable);
        jsonWriter.writeStringField("reason", this.reason);
        jsonWriter.writeStringField("message", this.message);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TrafficManagerNameAvailabilityInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TrafficManagerNameAvailabilityInner if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the TrafficManagerNameAvailabilityInner.
     */
    public static TrafficManagerNameAvailabilityInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TrafficManagerNameAvailabilityInner deserializedTrafficManagerNameAvailabilityInner
                = new TrafficManagerNameAvailabilityInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedTrafficManagerNameAvailabilityInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedTrafficManagerNameAvailabilityInner.type = reader.getString();
                } else if ("nameAvailable".equals(fieldName)) {
                    deserializedTrafficManagerNameAvailabilityInner.nameAvailable
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("reason".equals(fieldName)) {
                    deserializedTrafficManagerNameAvailabilityInner.reason = reader.getString();
                } else if ("message".equals(fieldName)) {
                    deserializedTrafficManagerNameAvailabilityInner.message = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTrafficManagerNameAvailabilityInner;
        });
    }
}
