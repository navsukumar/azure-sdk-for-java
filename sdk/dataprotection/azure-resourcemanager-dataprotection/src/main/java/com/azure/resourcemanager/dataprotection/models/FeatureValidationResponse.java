// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.dataprotection.fluent.models.FeatureValidationResponseBaseInner;
import java.io.IOException;
import java.util.List;

/**
 * Feature Validation Response.
 */
@Fluent
public final class FeatureValidationResponse extends FeatureValidationResponseBaseInner {
    /*
     * Type of the specific object - used for deserializing
     */
    private String objectType = "FeatureValidationResponse";

    /*
     * backup support feature type.
     */
    private FeatureType featureType;

    /*
     * Response features
     */
    private List<SupportedFeature> features;

    /**
     * Creates an instance of FeatureValidationResponse class.
     */
    public FeatureValidationResponse() {
    }

    /**
     * Get the objectType property: Type of the specific object - used for deserializing.
     * 
     * @return the objectType value.
     */
    @Override
    public String objectType() {
        return this.objectType;
    }

    /**
     * Get the featureType property: backup support feature type.
     * 
     * @return the featureType value.
     */
    public FeatureType featureType() {
        return this.featureType;
    }

    /**
     * Set the featureType property: backup support feature type.
     * 
     * @param featureType the featureType value to set.
     * @return the FeatureValidationResponse object itself.
     */
    public FeatureValidationResponse withFeatureType(FeatureType featureType) {
        this.featureType = featureType;
        return this;
    }

    /**
     * Get the features property: Response features.
     * 
     * @return the features value.
     */
    public List<SupportedFeature> features() {
        return this.features;
    }

    /**
     * Set the features property: Response features.
     * 
     * @param features the features value to set.
     * @return the FeatureValidationResponse object itself.
     */
    public FeatureValidationResponse withFeatures(List<SupportedFeature> features) {
        this.features = features;
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
        if (features() != null) {
            features().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("objectType", this.objectType);
        jsonWriter.writeStringField("featureType", this.featureType == null ? null : this.featureType.toString());
        jsonWriter.writeArrayField("features", this.features, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FeatureValidationResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FeatureValidationResponse if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the FeatureValidationResponse.
     */
    public static FeatureValidationResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FeatureValidationResponse deserializedFeatureValidationResponse = new FeatureValidationResponse();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("objectType".equals(fieldName)) {
                    deserializedFeatureValidationResponse.objectType = reader.getString();
                } else if ("featureType".equals(fieldName)) {
                    deserializedFeatureValidationResponse.featureType = FeatureType.fromString(reader.getString());
                } else if ("features".equals(fieldName)) {
                    List<SupportedFeature> features = reader.readArray(reader1 -> SupportedFeature.fromJson(reader1));
                    deserializedFeatureValidationResponse.features = features;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFeatureValidationResponse;
        });
    }
}
