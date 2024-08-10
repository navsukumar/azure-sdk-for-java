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
 * Vpn Profile Response for package generation.
 */
@Fluent
public final class VpnProfileResponseInner implements JsonSerializable<VpnProfileResponseInner> {
    /*
     * URL to the VPN profile.
     */
    private String profileUrl;

    /**
     * Creates an instance of VpnProfileResponseInner class.
     */
    public VpnProfileResponseInner() {
    }

    /**
     * Get the profileUrl property: URL to the VPN profile.
     * 
     * @return the profileUrl value.
     */
    public String profileUrl() {
        return this.profileUrl;
    }

    /**
     * Set the profileUrl property: URL to the VPN profile.
     * 
     * @param profileUrl the profileUrl value to set.
     * @return the VpnProfileResponseInner object itself.
     */
    public VpnProfileResponseInner withProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
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
        jsonWriter.writeStringField("profileUrl", this.profileUrl);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VpnProfileResponseInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VpnProfileResponseInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VpnProfileResponseInner.
     */
    public static VpnProfileResponseInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VpnProfileResponseInner deserializedVpnProfileResponseInner = new VpnProfileResponseInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("profileUrl".equals(fieldName)) {
                    deserializedVpnProfileResponseInner.profileUrl = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVpnProfileResponseInner;
        });
    }
}
