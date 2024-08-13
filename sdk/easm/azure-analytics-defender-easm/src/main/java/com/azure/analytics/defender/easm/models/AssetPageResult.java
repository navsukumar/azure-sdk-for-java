// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The page of assets that match the provided metric.
 */
@Immutable
public final class AssetPageResult implements JsonSerializable<AssetPageResult> {

    /*
     * The total number of items available in the full result set.
     */
    @Generated
    private Long totalElements;

    /*
     * The cursor mark to be used on the next request. Not set if using paging.
     */
    @Generated
    private String mark;

    /*
     * The link to access the next page of results. Not set if at the end of the result set.
     */
    @Generated
    private String nextLink;

    /*
     * The items in the current page of results.
     */
    @Generated
    private List<AssetResource> value;

    /**
     * Creates an instance of AssetPageResult class.
     */
    @Generated
    private AssetPageResult() {
    }

    /**
     * Get the totalElements property: The total number of items available in the full result set.
     *
     * @return the totalElements value.
     */
    @Generated
    public Long getTotalElements() {
        return this.totalElements;
    }

    /**
     * Get the mark property: The cursor mark to be used on the next request. Not set if using paging.
     *
     * @return the mark value.
     */
    @Generated
    public String getMark() {
        return this.mark;
    }

    /**
     * Get the nextLink property: The link to access the next page of results. Not set if at the end of the result set.
     *
     * @return the nextLink value.
     */
    @Generated
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Get the value property: The items in the current page of results.
     *
     * @return the value value.
     */
    @Generated
    public List<AssetResource> getValue() {
        return this.value;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("totalElements", this.totalElements);
        jsonWriter.writeStringField("mark", this.mark);
        jsonWriter.writeStringField("nextLink", this.nextLink);
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AssetPageResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AssetPageResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AssetPageResult.
     */
    @Generated
    public static AssetPageResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AssetPageResult deserializedAssetPageResult = new AssetPageResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("totalElements".equals(fieldName)) {
                    deserializedAssetPageResult.totalElements = reader.getNullable(JsonReader::getLong);
                } else if ("mark".equals(fieldName)) {
                    deserializedAssetPageResult.mark = reader.getString();
                } else if ("nextLink".equals(fieldName)) {
                    deserializedAssetPageResult.nextLink = reader.getString();
                } else if ("value".equals(fieldName)) {
                    List<AssetResource> value = reader.readArray(reader1 -> AssetResource.fromJson(reader1));
                    deserializedAssetPageResult.value = value;
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedAssetPageResult;
        });
    }
}
