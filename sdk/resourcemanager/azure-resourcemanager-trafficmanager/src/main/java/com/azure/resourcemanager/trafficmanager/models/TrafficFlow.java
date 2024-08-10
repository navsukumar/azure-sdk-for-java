// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.trafficmanager.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Class representing a Traffic Manager HeatMap traffic flow properties.
 */
@Fluent
public final class TrafficFlow implements JsonSerializable<TrafficFlow> {
    /*
     * The IP address that this query experience originated from.
     */
    private String sourceIp;

    /*
     * The approximate latitude that these queries originated from.
     */
    private Double latitude;

    /*
     * The approximate longitude that these queries originated from.
     */
    private Double longitude;

    /*
     * The query experiences produced in this HeatMap calculation.
     */
    private List<QueryExperience> queryExperiences;

    /**
     * Creates an instance of TrafficFlow class.
     */
    public TrafficFlow() {
    }

    /**
     * Get the sourceIp property: The IP address that this query experience originated from.
     * 
     * @return the sourceIp value.
     */
    public String sourceIp() {
        return this.sourceIp;
    }

    /**
     * Set the sourceIp property: The IP address that this query experience originated from.
     * 
     * @param sourceIp the sourceIp value to set.
     * @return the TrafficFlow object itself.
     */
    public TrafficFlow withSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }

    /**
     * Get the latitude property: The approximate latitude that these queries originated from.
     * 
     * @return the latitude value.
     */
    public Double latitude() {
        return this.latitude;
    }

    /**
     * Set the latitude property: The approximate latitude that these queries originated from.
     * 
     * @param latitude the latitude value to set.
     * @return the TrafficFlow object itself.
     */
    public TrafficFlow withLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Get the longitude property: The approximate longitude that these queries originated from.
     * 
     * @return the longitude value.
     */
    public Double longitude() {
        return this.longitude;
    }

    /**
     * Set the longitude property: The approximate longitude that these queries originated from.
     * 
     * @param longitude the longitude value to set.
     * @return the TrafficFlow object itself.
     */
    public TrafficFlow withLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * Get the queryExperiences property: The query experiences produced in this HeatMap calculation.
     * 
     * @return the queryExperiences value.
     */
    public List<QueryExperience> queryExperiences() {
        return this.queryExperiences;
    }

    /**
     * Set the queryExperiences property: The query experiences produced in this HeatMap calculation.
     * 
     * @param queryExperiences the queryExperiences value to set.
     * @return the TrafficFlow object itself.
     */
    public TrafficFlow withQueryExperiences(List<QueryExperience> queryExperiences) {
        this.queryExperiences = queryExperiences;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (queryExperiences() != null) {
            queryExperiences().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("sourceIp", this.sourceIp);
        jsonWriter.writeNumberField("latitude", this.latitude);
        jsonWriter.writeNumberField("longitude", this.longitude);
        jsonWriter.writeArrayField("queryExperiences", this.queryExperiences,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TrafficFlow from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TrafficFlow if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the TrafficFlow.
     */
    public static TrafficFlow fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TrafficFlow deserializedTrafficFlow = new TrafficFlow();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceIp".equals(fieldName)) {
                    deserializedTrafficFlow.sourceIp = reader.getString();
                } else if ("latitude".equals(fieldName)) {
                    deserializedTrafficFlow.latitude = reader.getNullable(JsonReader::getDouble);
                } else if ("longitude".equals(fieldName)) {
                    deserializedTrafficFlow.longitude = reader.getNullable(JsonReader::getDouble);
                } else if ("queryExperiences".equals(fieldName)) {
                    List<QueryExperience> queryExperiences
                        = reader.readArray(reader1 -> QueryExperience.fromJson(reader1));
                    deserializedTrafficFlow.queryExperiences = queryExperiences;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTrafficFlow;
        });
    }
}
