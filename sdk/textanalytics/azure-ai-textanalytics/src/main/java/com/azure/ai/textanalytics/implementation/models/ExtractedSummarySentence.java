// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The ExtractedSummarySentence model.
 */
@Fluent
public final class ExtractedSummarySentence implements JsonSerializable<ExtractedSummarySentence> {
    /*
     * The extracted sentence text.
     */
    private String text;

    /*
     * A double value representing the relevance of the sentence within the summary. Higher values indicate higher importance.
     */
    private double rankScore;

    /*
     * The sentence offset from the start of the document, based on the value of the parameter StringIndexType.
     */
    private int offset;

    /*
     * The length of the sentence.
     */
    private int length;

    /**
     * Creates an instance of ExtractedSummarySentence class.
     */
    public ExtractedSummarySentence() {
    }

    /**
     * Get the text property: The extracted sentence text.
     * 
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Set the text property: The extracted sentence text.
     * 
     * @param text the text value to set.
     * @return the ExtractedSummarySentence object itself.
     */
    public ExtractedSummarySentence setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the rankScore property: A double value representing the relevance of the sentence within the summary. Higher
     * values indicate higher importance.
     * 
     * @return the rankScore value.
     */
    public double getRankScore() {
        return this.rankScore;
    }

    /**
     * Set the rankScore property: A double value representing the relevance of the sentence within the summary. Higher
     * values indicate higher importance.
     * 
     * @param rankScore the rankScore value to set.
     * @return the ExtractedSummarySentence object itself.
     */
    public ExtractedSummarySentence setRankScore(double rankScore) {
        this.rankScore = rankScore;
        return this;
    }

    /**
     * Get the offset property: The sentence offset from the start of the document, based on the value of the parameter
     * StringIndexType.
     * 
     * @return the offset value.
     */
    public int getOffset() {
        return this.offset;
    }

    /**
     * Set the offset property: The sentence offset from the start of the document, based on the value of the parameter
     * StringIndexType.
     * 
     * @param offset the offset value to set.
     * @return the ExtractedSummarySentence object itself.
     */
    public ExtractedSummarySentence setOffset(int offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Get the length property: The length of the sentence.
     * 
     * @return the length value.
     */
    public int getLength() {
        return this.length;
    }

    /**
     * Set the length property: The length of the sentence.
     * 
     * @param length the length value to set.
     * @return the ExtractedSummarySentence object itself.
     */
    public ExtractedSummarySentence setLength(int length) {
        this.length = length;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("text", this.text);
        jsonWriter.writeDoubleField("rankScore", this.rankScore);
        jsonWriter.writeIntField("offset", this.offset);
        jsonWriter.writeIntField("length", this.length);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExtractedSummarySentence from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExtractedSummarySentence if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ExtractedSummarySentence.
     */
    public static ExtractedSummarySentence fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExtractedSummarySentence deserializedExtractedSummarySentence = new ExtractedSummarySentence();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("text".equals(fieldName)) {
                    deserializedExtractedSummarySentence.text = reader.getString();
                } else if ("rankScore".equals(fieldName)) {
                    deserializedExtractedSummarySentence.rankScore = reader.getDouble();
                } else if ("offset".equals(fieldName)) {
                    deserializedExtractedSummarySentence.offset = reader.getInt();
                } else if ("length".equals(fieldName)) {
                    deserializedExtractedSummarySentence.length = reader.getInt();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExtractedSummarySentence;
        });
    }
}
