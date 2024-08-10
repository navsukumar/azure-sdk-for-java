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
import java.util.List;

/**
 * Country details.
 */
@Fluent
public final class AvailableProvidersListCountry implements JsonSerializable<AvailableProvidersListCountry> {
    /*
     * The country name.
     */
    private String countryName;

    /*
     * A list of Internet service providers.
     */
    private List<String> providers;

    /*
     * List of available states in the country.
     */
    private List<AvailableProvidersListState> states;

    /**
     * Creates an instance of AvailableProvidersListCountry class.
     */
    public AvailableProvidersListCountry() {
    }

    /**
     * Get the countryName property: The country name.
     * 
     * @return the countryName value.
     */
    public String countryName() {
        return this.countryName;
    }

    /**
     * Set the countryName property: The country name.
     * 
     * @param countryName the countryName value to set.
     * @return the AvailableProvidersListCountry object itself.
     */
    public AvailableProvidersListCountry withCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    /**
     * Get the providers property: A list of Internet service providers.
     * 
     * @return the providers value.
     */
    public List<String> providers() {
        return this.providers;
    }

    /**
     * Set the providers property: A list of Internet service providers.
     * 
     * @param providers the providers value to set.
     * @return the AvailableProvidersListCountry object itself.
     */
    public AvailableProvidersListCountry withProviders(List<String> providers) {
        this.providers = providers;
        return this;
    }

    /**
     * Get the states property: List of available states in the country.
     * 
     * @return the states value.
     */
    public List<AvailableProvidersListState> states() {
        return this.states;
    }

    /**
     * Set the states property: List of available states in the country.
     * 
     * @param states the states value to set.
     * @return the AvailableProvidersListCountry object itself.
     */
    public AvailableProvidersListCountry withStates(List<AvailableProvidersListState> states) {
        this.states = states;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (states() != null) {
            states().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("countryName", this.countryName);
        jsonWriter.writeArrayField("providers", this.providers, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("states", this.states, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AvailableProvidersListCountry from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AvailableProvidersListCountry if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AvailableProvidersListCountry.
     */
    public static AvailableProvidersListCountry fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AvailableProvidersListCountry deserializedAvailableProvidersListCountry
                = new AvailableProvidersListCountry();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("countryName".equals(fieldName)) {
                    deserializedAvailableProvidersListCountry.countryName = reader.getString();
                } else if ("providers".equals(fieldName)) {
                    List<String> providers = reader.readArray(reader1 -> reader1.getString());
                    deserializedAvailableProvidersListCountry.providers = providers;
                } else if ("states".equals(fieldName)) {
                    List<AvailableProvidersListState> states
                        = reader.readArray(reader1 -> AvailableProvidersListState.fromJson(reader1));
                    deserializedAvailableProvidersListCountry.states = states;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAvailableProvidersListCountry;
        });
    }
}
