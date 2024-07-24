// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computefleet.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes the public IP Sku. It can only be set with OrchestrationMode as
 * Flexible.
 */
@Fluent
public final class PublicIPAddressSku implements JsonSerializable<PublicIPAddressSku> {
    /*
     * Specify public IP sku name
     */
    private PublicIPAddressSkuName name;

    /*
     * Specify public IP sku tier
     */
    private PublicIPAddressSkuTier tier;

    /**
     * Creates an instance of PublicIPAddressSku class.
     */
    public PublicIPAddressSku() {
    }

    /**
     * Get the name property: Specify public IP sku name.
     * 
     * @return the name value.
     */
    public PublicIPAddressSkuName name() {
        return this.name;
    }

    /**
     * Set the name property: Specify public IP sku name.
     * 
     * @param name the name value to set.
     * @return the PublicIPAddressSku object itself.
     */
    public PublicIPAddressSku withName(PublicIPAddressSkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: Specify public IP sku tier.
     * 
     * @return the tier value.
     */
    public PublicIPAddressSkuTier tier() {
        return this.tier;
    }

    /**
     * Set the tier property: Specify public IP sku tier.
     * 
     * @param tier the tier value to set.
     * @return the PublicIPAddressSku object itself.
     */
    public PublicIPAddressSku withTier(PublicIPAddressSkuTier tier) {
        this.tier = tier;
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
        jsonWriter.writeStringField("name", this.name == null ? null : this.name.toString());
        jsonWriter.writeStringField("tier", this.tier == null ? null : this.tier.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PublicIPAddressSku from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PublicIPAddressSku if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the PublicIPAddressSku.
     */
    public static PublicIPAddressSku fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PublicIPAddressSku deserializedPublicIPAddressSku = new PublicIPAddressSku();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedPublicIPAddressSku.name = PublicIPAddressSkuName.fromString(reader.getString());
                } else if ("tier".equals(fieldName)) {
                    deserializedPublicIPAddressSku.tier = PublicIPAddressSkuTier.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPublicIPAddressSku;
        });
    }
}
