// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * An optional field under "Rewrite Action". It lets you capture and modify the value(s) of a specific header when
 * multiple headers with the same name exist. Currently supported for Set-Cookie Response header only. For more details,
 * visit https://aka.ms/appgwheadercrud.
 */
@Fluent
public final class HeaderValueMatcher implements JsonSerializable<HeaderValueMatcher> {
    /*
     * The pattern, either fixed string or regular expression, that evaluates if a header value should be selected for
     * rewrite.
     */
    private String pattern;

    /*
     * Setting this parameter to truth value with force the pattern to do a case in-sensitive comparison.
     */
    private Boolean ignoreCase;

    /*
     * Setting this value as truth will force to check the negation of the condition given by the user in the pattern
     * field.
     */
    private Boolean negate;

    /**
     * Creates an instance of HeaderValueMatcher class.
     */
    public HeaderValueMatcher() {
    }

    /**
     * Get the pattern property: The pattern, either fixed string or regular expression, that evaluates if a header
     * value should be selected for rewrite.
     * 
     * @return the pattern value.
     */
    public String pattern() {
        return this.pattern;
    }

    /**
     * Set the pattern property: The pattern, either fixed string or regular expression, that evaluates if a header
     * value should be selected for rewrite.
     * 
     * @param pattern the pattern value to set.
     * @return the HeaderValueMatcher object itself.
     */
    public HeaderValueMatcher withPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * Get the ignoreCase property: Setting this parameter to truth value with force the pattern to do a case
     * in-sensitive comparison.
     * 
     * @return the ignoreCase value.
     */
    public Boolean ignoreCase() {
        return this.ignoreCase;
    }

    /**
     * Set the ignoreCase property: Setting this parameter to truth value with force the pattern to do a case
     * in-sensitive comparison.
     * 
     * @param ignoreCase the ignoreCase value to set.
     * @return the HeaderValueMatcher object itself.
     */
    public HeaderValueMatcher withIgnoreCase(Boolean ignoreCase) {
        this.ignoreCase = ignoreCase;
        return this;
    }

    /**
     * Get the negate property: Setting this value as truth will force to check the negation of the condition given by
     * the user in the pattern field.
     * 
     * @return the negate value.
     */
    public Boolean negate() {
        return this.negate;
    }

    /**
     * Set the negate property: Setting this value as truth will force to check the negation of the condition given by
     * the user in the pattern field.
     * 
     * @param negate the negate value to set.
     * @return the HeaderValueMatcher object itself.
     */
    public HeaderValueMatcher withNegate(Boolean negate) {
        this.negate = negate;
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
        jsonWriter.writeStringField("pattern", this.pattern);
        jsonWriter.writeBooleanField("ignoreCase", this.ignoreCase);
        jsonWriter.writeBooleanField("negate", this.negate);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HeaderValueMatcher from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HeaderValueMatcher if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the HeaderValueMatcher.
     */
    public static HeaderValueMatcher fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HeaderValueMatcher deserializedHeaderValueMatcher = new HeaderValueMatcher();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("pattern".equals(fieldName)) {
                    deserializedHeaderValueMatcher.pattern = reader.getString();
                } else if ("ignoreCase".equals(fieldName)) {
                    deserializedHeaderValueMatcher.ignoreCase = reader.getNullable(JsonReader::getBoolean);
                } else if ("negate".equals(fieldName)) {
                    deserializedHeaderValueMatcher.negate = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHeaderValueMatcher;
        });
    }
}
