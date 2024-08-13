// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Define match variables.
 */
@Fluent
public final class MatchVariable implements JsonSerializable<MatchVariable> {
    /*
     * Match Variable.
     */
    private WebApplicationFirewallMatchVariable variableName;

    /*
     * The selector of match variable.
     */
    private String selector;

    /**
     * Creates an instance of MatchVariable class.
     */
    public MatchVariable() {
    }

    /**
     * Get the variableName property: Match Variable.
     * 
     * @return the variableName value.
     */
    public WebApplicationFirewallMatchVariable variableName() {
        return this.variableName;
    }

    /**
     * Set the variableName property: Match Variable.
     * 
     * @param variableName the variableName value to set.
     * @return the MatchVariable object itself.
     */
    public MatchVariable withVariableName(WebApplicationFirewallMatchVariable variableName) {
        this.variableName = variableName;
        return this;
    }

    /**
     * Get the selector property: The selector of match variable.
     * 
     * @return the selector value.
     */
    public String selector() {
        return this.selector;
    }

    /**
     * Set the selector property: The selector of match variable.
     * 
     * @param selector the selector value to set.
     * @return the MatchVariable object itself.
     */
    public MatchVariable withSelector(String selector) {
        this.selector = selector;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (variableName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property variableName in model MatchVariable"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MatchVariable.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("variableName", this.variableName == null ? null : this.variableName.toString());
        jsonWriter.writeStringField("selector", this.selector);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MatchVariable from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MatchVariable if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MatchVariable.
     */
    public static MatchVariable fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MatchVariable deserializedMatchVariable = new MatchVariable();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("variableName".equals(fieldName)) {
                    deserializedMatchVariable.variableName
                        = WebApplicationFirewallMatchVariable.fromString(reader.getString());
                } else if ("selector".equals(fieldName)) {
                    deserializedMatchVariable.selector = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMatchVariable;
        });
    }
}
