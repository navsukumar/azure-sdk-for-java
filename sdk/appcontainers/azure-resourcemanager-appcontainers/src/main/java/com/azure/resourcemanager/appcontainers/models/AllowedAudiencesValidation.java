// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The configuration settings of the Allowed Audiences validation flow.
 */
@Fluent
public final class AllowedAudiencesValidation implements JsonSerializable<AllowedAudiencesValidation> {
    /*
     * The configuration settings of the allowed list of audiences from which to validate the JWT token.
     */
    private List<String> allowedAudiences;

    /**
     * Creates an instance of AllowedAudiencesValidation class.
     */
    public AllowedAudiencesValidation() {
    }

    /**
     * Get the allowedAudiences property: The configuration settings of the allowed list of audiences from which to
     * validate the JWT token.
     * 
     * @return the allowedAudiences value.
     */
    public List<String> allowedAudiences() {
        return this.allowedAudiences;
    }

    /**
     * Set the allowedAudiences property: The configuration settings of the allowed list of audiences from which to
     * validate the JWT token.
     * 
     * @param allowedAudiences the allowedAudiences value to set.
     * @return the AllowedAudiencesValidation object itself.
     */
    public AllowedAudiencesValidation withAllowedAudiences(List<String> allowedAudiences) {
        this.allowedAudiences = allowedAudiences;
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
        jsonWriter.writeArrayField("allowedAudiences", this.allowedAudiences,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AllowedAudiencesValidation from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AllowedAudiencesValidation if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AllowedAudiencesValidation.
     */
    public static AllowedAudiencesValidation fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AllowedAudiencesValidation deserializedAllowedAudiencesValidation = new AllowedAudiencesValidation();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("allowedAudiences".equals(fieldName)) {
                    List<String> allowedAudiences = reader.readArray(reader1 -> reader1.getString());
                    deserializedAllowedAudiencesValidation.allowedAudiences = allowedAudiences;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAllowedAudiencesValidation;
        });
    }
}
