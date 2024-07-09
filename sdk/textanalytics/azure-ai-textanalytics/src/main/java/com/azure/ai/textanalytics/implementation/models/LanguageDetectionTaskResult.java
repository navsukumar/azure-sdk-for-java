// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The LanguageDetectionTaskResult model.
 */
@Fluent
public final class LanguageDetectionTaskResult extends AnalyzeTextTaskResult {
    /*
     * Enumeration of supported Text Analysis task results.
     */
    private AnalyzeTextTaskResultsKind kind = AnalyzeTextTaskResultsKind.LANGUAGE_DETECTION_RESULTS;

    /*
     * The results property.
     */
    private LanguageDetectionResult results;

    /**
     * Creates an instance of LanguageDetectionTaskResult class.
     */
    public LanguageDetectionTaskResult() {
    }

    /**
     * Get the kind property: Enumeration of supported Text Analysis task results.
     * 
     * @return the kind value.
     */
    @Override
    public AnalyzeTextTaskResultsKind getKind() {
        return this.kind;
    }

    /**
     * Get the results property: The results property.
     * 
     * @return the results value.
     */
    public LanguageDetectionResult getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     * 
     * @param results the results value to set.
     * @return the LanguageDetectionTaskResult object itself.
     */
    public LanguageDetectionTaskResult setResults(LanguageDetectionResult results) {
        this.results = results;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("results", this.results);
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LanguageDetectionTaskResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LanguageDetectionTaskResult if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the LanguageDetectionTaskResult.
     */
    public static LanguageDetectionTaskResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LanguageDetectionTaskResult deserializedLanguageDetectionTaskResult = new LanguageDetectionTaskResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("results".equals(fieldName)) {
                    deserializedLanguageDetectionTaskResult.results = LanguageDetectionResult.fromJson(reader);
                } else if ("kind".equals(fieldName)) {
                    deserializedLanguageDetectionTaskResult.kind
                        = AnalyzeTextTaskResultsKind.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLanguageDetectionTaskResult;
        });
    }
}
