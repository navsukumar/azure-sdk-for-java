// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appcontainers.models.Secret;
import java.io.IOException;
import java.util.List;

/**
 * Container Apps Job Secrets Collection ARM resource.
 */
@Fluent
public final class JobSecretsCollectionInner implements JsonSerializable<JobSecretsCollectionInner> {
    /*
     * Collection of resources.
     */
    private List<Secret> value;

    /**
     * Creates an instance of JobSecretsCollectionInner class.
     */
    public JobSecretsCollectionInner() {
    }

    /**
     * Get the value property: Collection of resources.
     * 
     * @return the value value.
     */
    public List<Secret> value() {
        return this.value;
    }

    /**
     * Set the value property: Collection of resources.
     * 
     * @param value the value value to set.
     * @return the JobSecretsCollectionInner object itself.
     */
    public JobSecretsCollectionInner withValue(List<Secret> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(
                    new IllegalArgumentException("Missing required property value in model JobSecretsCollectionInner"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(JobSecretsCollectionInner.class);

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
     * Reads an instance of JobSecretsCollectionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of JobSecretsCollectionInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the JobSecretsCollectionInner.
     */
    public static JobSecretsCollectionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            JobSecretsCollectionInner deserializedJobSecretsCollectionInner = new JobSecretsCollectionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<Secret> value = reader.readArray(reader1 -> Secret.fromJson(reader1));
                    deserializedJobSecretsCollectionInner.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedJobSecretsCollectionInner;
        });
    }
}
