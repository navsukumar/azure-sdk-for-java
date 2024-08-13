// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Sample utterance.
 */
@Fluent
public final class SampleUtterance implements JsonSerializable<SampleUtterance> {
    /*
     * Text attribute of sample utterance.
     */
    private String text;

    /*
     * Links attribute of sample utterance.
     */
    private List<String> links;

    /*
     * Question id of sample utterance (for stackoverflow questions titles).
     */
    private String qid;

    /**
     * Creates an instance of SampleUtterance class.
     */
    public SampleUtterance() {
    }

    /**
     * Get the text property: Text attribute of sample utterance.
     * 
     * @return the text value.
     */
    public String text() {
        return this.text;
    }

    /**
     * Set the text property: Text attribute of sample utterance.
     * 
     * @param text the text value to set.
     * @return the SampleUtterance object itself.
     */
    public SampleUtterance withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the links property: Links attribute of sample utterance.
     * 
     * @return the links value.
     */
    public List<String> links() {
        return this.links;
    }

    /**
     * Set the links property: Links attribute of sample utterance.
     * 
     * @param links the links value to set.
     * @return the SampleUtterance object itself.
     */
    public SampleUtterance withLinks(List<String> links) {
        this.links = links;
        return this;
    }

    /**
     * Get the qid property: Question id of sample utterance (for stackoverflow questions titles).
     * 
     * @return the qid value.
     */
    public String qid() {
        return this.qid;
    }

    /**
     * Set the qid property: Question id of sample utterance (for stackoverflow questions titles).
     * 
     * @param qid the qid value to set.
     * @return the SampleUtterance object itself.
     */
    public SampleUtterance withQid(String qid) {
        this.qid = qid;
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
        jsonWriter.writeStringField("text", this.text);
        jsonWriter.writeArrayField("links", this.links, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("qid", this.qid);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SampleUtterance from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SampleUtterance if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SampleUtterance.
     */
    public static SampleUtterance fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SampleUtterance deserializedSampleUtterance = new SampleUtterance();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("text".equals(fieldName)) {
                    deserializedSampleUtterance.text = reader.getString();
                } else if ("links".equals(fieldName)) {
                    List<String> links = reader.readArray(reader1 -> reader1.getString());
                    deserializedSampleUtterance.links = links;
                } else if ("qid".equals(fieldName)) {
                    deserializedSampleUtterance.qid = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSampleUtterance;
        });
    }
}
