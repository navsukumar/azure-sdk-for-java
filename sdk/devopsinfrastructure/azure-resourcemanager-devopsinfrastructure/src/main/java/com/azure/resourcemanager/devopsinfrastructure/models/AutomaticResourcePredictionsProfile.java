// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The stand-by agent scheme is determined based on historical demand.
 */
@Fluent
public final class AutomaticResourcePredictionsProfile extends ResourcePredictionsProfile {
    /*
     * Determines how the stand-by scheme should be provided.
     */
    private ResourcePredictionsProfileType kind = ResourcePredictionsProfileType.AUTOMATIC;

    /*
     * Determines the balance between cost and performance.
     */
    private PredictionPreference predictionPreference;

    /**
     * Creates an instance of AutomaticResourcePredictionsProfile class.
     */
    public AutomaticResourcePredictionsProfile() {
    }

    /**
     * Get the kind property: Determines how the stand-by scheme should be provided.
     * 
     * @return the kind value.
     */
    @Override
    public ResourcePredictionsProfileType kind() {
        return this.kind;
    }

    /**
     * Get the predictionPreference property: Determines the balance between cost and performance.
     * 
     * @return the predictionPreference value.
     */
    public PredictionPreference predictionPreference() {
        return this.predictionPreference;
    }

    /**
     * Set the predictionPreference property: Determines the balance between cost and performance.
     * 
     * @param predictionPreference the predictionPreference value to set.
     * @return the AutomaticResourcePredictionsProfile object itself.
     */
    public AutomaticResourcePredictionsProfile withPredictionPreference(PredictionPreference predictionPreference) {
        this.predictionPreference = predictionPreference;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        jsonWriter.writeStringField("predictionPreference",
            this.predictionPreference == null ? null : this.predictionPreference.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AutomaticResourcePredictionsProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AutomaticResourcePredictionsProfile if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AutomaticResourcePredictionsProfile.
     */
    public static AutomaticResourcePredictionsProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AutomaticResourcePredictionsProfile deserializedAutomaticResourcePredictionsProfile
                = new AutomaticResourcePredictionsProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("kind".equals(fieldName)) {
                    deserializedAutomaticResourcePredictionsProfile.kind
                        = ResourcePredictionsProfileType.fromString(reader.getString());
                } else if ("predictionPreference".equals(fieldName)) {
                    deserializedAutomaticResourcePredictionsProfile.predictionPreference
                        = PredictionPreference.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAutomaticResourcePredictionsProfile;
        });
    }
}
