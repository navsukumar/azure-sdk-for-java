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
import com.azure.resourcemanager.appcontainers.models.ContainerAppSecret;
import java.io.IOException;
import java.util.List;

/**
 * Container App Secrets Collection ARM resource.
 */
@Fluent
public final class SecretsCollectionInner implements JsonSerializable<SecretsCollectionInner> {
    /*
     * Collection of resources.
     */
    private List<ContainerAppSecret> value;

    /**
     * Creates an instance of SecretsCollectionInner class.
     */
    public SecretsCollectionInner() {
    }

    /**
     * Get the value property: Collection of resources.
     * 
     * @return the value value.
     */
    public List<ContainerAppSecret> value() {
        return this.value;
    }

    /**
     * Set the value property: Collection of resources.
     * 
     * @param value the value value to set.
     * @return the SecretsCollectionInner object itself.
     */
    public SecretsCollectionInner withValue(List<ContainerAppSecret> value) {
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
                .log(new IllegalArgumentException("Missing required property value in model SecretsCollectionInner"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SecretsCollectionInner.class);

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
     * Reads an instance of SecretsCollectionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SecretsCollectionInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SecretsCollectionInner.
     */
    public static SecretsCollectionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SecretsCollectionInner deserializedSecretsCollectionInner = new SecretsCollectionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ContainerAppSecret> value = reader.readArray(reader1 -> ContainerAppSecret.fromJson(reader1));
                    deserializedSecretsCollectionInner.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSecretsCollectionInner;
        });
    }
}
