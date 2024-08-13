// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * P2S Vpn connection detailed health written to sas url.
 */
@Fluent
public final class P2SVpnConnectionHealthInner implements JsonSerializable<P2SVpnConnectionHealthInner> {
    /*
     * Returned sas url of the blob to which the p2s vpn connection detailed health will be written.
     */
    private String sasUrl;

    /**
     * Creates an instance of P2SVpnConnectionHealthInner class.
     */
    public P2SVpnConnectionHealthInner() {
    }

    /**
     * Get the sasUrl property: Returned sas url of the blob to which the p2s vpn connection detailed health will be
     * written.
     * 
     * @return the sasUrl value.
     */
    public String sasUrl() {
        return this.sasUrl;
    }

    /**
     * Set the sasUrl property: Returned sas url of the blob to which the p2s vpn connection detailed health will be
     * written.
     * 
     * @param sasUrl the sasUrl value to set.
     * @return the P2SVpnConnectionHealthInner object itself.
     */
    public P2SVpnConnectionHealthInner withSasUrl(String sasUrl) {
        this.sasUrl = sasUrl;
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
        jsonWriter.writeStringField("sasUrl", this.sasUrl);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of P2SVpnConnectionHealthInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of P2SVpnConnectionHealthInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the P2SVpnConnectionHealthInner.
     */
    public static P2SVpnConnectionHealthInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            P2SVpnConnectionHealthInner deserializedP2SVpnConnectionHealthInner = new P2SVpnConnectionHealthInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sasUrl".equals(fieldName)) {
                    deserializedP2SVpnConnectionHealthInner.sasUrl = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedP2SVpnConnectionHealthInner;
        });
    }
}
