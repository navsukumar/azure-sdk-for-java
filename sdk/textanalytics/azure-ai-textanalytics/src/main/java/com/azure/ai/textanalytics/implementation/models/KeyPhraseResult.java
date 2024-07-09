// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The KeyPhraseResult model.
 */
@Fluent
public final class KeyPhraseResult extends PreBuiltResult {
    /*
     * Response by document
     */
    private List<KeyPhraseResultDocumentsItem> documents;

    /**
     * Creates an instance of KeyPhraseResult class.
     */
    public KeyPhraseResult() {
    }

    /**
     * Get the documents property: Response by document.
     * 
     * @return the documents value.
     */
    public List<KeyPhraseResultDocumentsItem> getDocuments() {
        return this.documents;
    }

    /**
     * Set the documents property: Response by document.
     * 
     * @param documents the documents value to set.
     * @return the KeyPhraseResult object itself.
     */
    public KeyPhraseResult setDocuments(List<KeyPhraseResultDocumentsItem> documents) {
        this.documents = documents;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyPhraseResult setErrors(List<DocumentError> errors) {
        super.setErrors(errors);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyPhraseResult setStatistics(RequestStatistics statistics) {
        super.setStatistics(statistics);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyPhraseResult setModelVersion(String modelVersion) {
        super.setModelVersion(modelVersion);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("errors", getErrors(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("modelVersion", getModelVersion());
        jsonWriter.writeJsonField("statistics", getStatistics());
        jsonWriter.writeArrayField("documents", this.documents, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KeyPhraseResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of KeyPhraseResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the KeyPhraseResult.
     */
    public static KeyPhraseResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            KeyPhraseResult deserializedKeyPhraseResult = new KeyPhraseResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("errors".equals(fieldName)) {
                    List<DocumentError> errors = reader.readArray(reader1 -> DocumentError.fromJson(reader1));
                    deserializedKeyPhraseResult.setErrors(errors);
                } else if ("modelVersion".equals(fieldName)) {
                    deserializedKeyPhraseResult.setModelVersion(reader.getString());
                } else if ("statistics".equals(fieldName)) {
                    deserializedKeyPhraseResult.setStatistics(RequestStatistics.fromJson(reader));
                } else if ("documents".equals(fieldName)) {
                    List<KeyPhraseResultDocumentsItem> documents
                        = reader.readArray(reader1 -> KeyPhraseResultDocumentsItem.fromJson(reader1));
                    deserializedKeyPhraseResult.documents = documents;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedKeyPhraseResult;
        });
    }
}
