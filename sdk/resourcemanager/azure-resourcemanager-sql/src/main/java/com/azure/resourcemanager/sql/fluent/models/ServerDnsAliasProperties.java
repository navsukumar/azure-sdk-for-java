// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Properties of a server DNS alias.
 */
@Immutable
public final class ServerDnsAliasProperties implements JsonSerializable<ServerDnsAliasProperties> {
    /*
     * The fully qualified DNS record for alias
     */
    private String azureDnsRecord;

    /**
     * Creates an instance of ServerDnsAliasProperties class.
     */
    public ServerDnsAliasProperties() {
    }

    /**
     * Get the azureDnsRecord property: The fully qualified DNS record for alias.
     * 
     * @return the azureDnsRecord value.
     */
    public String azureDnsRecord() {
        return this.azureDnsRecord;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServerDnsAliasProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServerDnsAliasProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ServerDnsAliasProperties.
     */
    public static ServerDnsAliasProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServerDnsAliasProperties deserializedServerDnsAliasProperties = new ServerDnsAliasProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("azureDnsRecord".equals(fieldName)) {
                    deserializedServerDnsAliasProperties.azureDnsRecord = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServerDnsAliasProperties;
        });
    }
}
