// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * AdhocBasedTriggerContext
 * 
 * Adhoc trigger context.
 */
@Fluent
public final class AdhocBasedTriggerContext extends TriggerContext {
    /*
     * Type of the specific object - used for deserializing
     */
    private String objectType = "AdhocBasedTriggerContext";

    /*
     * Tagging Criteria containing retention tag for adhoc backup.
     */
    private AdhocBasedTaggingCriteria taggingCriteria;

    /**
     * Creates an instance of AdhocBasedTriggerContext class.
     */
    public AdhocBasedTriggerContext() {
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
     * Get the taggingCriteria property: Tagging Criteria containing retention tag for adhoc backup.
     * 
     * @return the taggingCriteria value.
     */
    public AdhocBasedTaggingCriteria taggingCriteria() {
        return this.taggingCriteria;
    }

    /**
     * Set the taggingCriteria property: Tagging Criteria containing retention tag for adhoc backup.
     * 
     * @param taggingCriteria the taggingCriteria value to set.
     * @return the AdhocBasedTriggerContext object itself.
     */
    public AdhocBasedTriggerContext withTaggingCriteria(AdhocBasedTaggingCriteria taggingCriteria) {
        this.taggingCriteria = taggingCriteria;
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
        if (taggingCriteria() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property taggingCriteria in model AdhocBasedTriggerContext"));
        } else {
            taggingCriteria().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AdhocBasedTriggerContext.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("taggingCriteria", this.taggingCriteria);
        jsonWriter.writeStringField("objectType", this.objectType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AdhocBasedTriggerContext from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AdhocBasedTriggerContext if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AdhocBasedTriggerContext.
     */
    public static AdhocBasedTriggerContext fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AdhocBasedTriggerContext deserializedAdhocBasedTriggerContext = new AdhocBasedTriggerContext();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("taggingCriteria".equals(fieldName)) {
                    deserializedAdhocBasedTriggerContext.taggingCriteria = AdhocBasedTaggingCriteria.fromJson(reader);
                } else if ("objectType".equals(fieldName)) {
                    deserializedAdhocBasedTriggerContext.objectType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAdhocBasedTriggerContext;
        });
    }
}
