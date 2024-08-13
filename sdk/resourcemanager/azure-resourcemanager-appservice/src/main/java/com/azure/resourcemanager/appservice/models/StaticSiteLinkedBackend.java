// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Static Site Linked Backend ARM resource.
 */
@Fluent
public final class StaticSiteLinkedBackend implements JsonSerializable<StaticSiteLinkedBackend> {
    /*
     * The resource id of the backend linked to the static site
     */
    private String backendResourceId;

    /*
     * The region of the backend linked to the static site
     */
    private String region;

    /*
     * The date and time on which the backend was linked to the static site.
     */
    private OffsetDateTime createdOn;

    /*
     * The provisioning state of the linking process.
     */
    private String provisioningState;

    /**
     * Creates an instance of StaticSiteLinkedBackend class.
     */
    public StaticSiteLinkedBackend() {
    }

    /**
     * Get the backendResourceId property: The resource id of the backend linked to the static site.
     * 
     * @return the backendResourceId value.
     */
    public String backendResourceId() {
        return this.backendResourceId;
    }

    /**
     * Set the backendResourceId property: The resource id of the backend linked to the static site.
     * 
     * @param backendResourceId the backendResourceId value to set.
     * @return the StaticSiteLinkedBackend object itself.
     */
    public StaticSiteLinkedBackend withBackendResourceId(String backendResourceId) {
        this.backendResourceId = backendResourceId;
        return this;
    }

    /**
     * Get the region property: The region of the backend linked to the static site.
     * 
     * @return the region value.
     */
    public String region() {
        return this.region;
    }

    /**
     * Set the region property: The region of the backend linked to the static site.
     * 
     * @param region the region value to set.
     * @return the StaticSiteLinkedBackend object itself.
     */
    public StaticSiteLinkedBackend withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get the createdOn property: The date and time on which the backend was linked to the static site.
     * 
     * @return the createdOn value.
     */
    public OffsetDateTime createdOn() {
        return this.createdOn;
    }

    /**
     * Get the provisioningState property: The provisioning state of the linking process.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
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
        jsonWriter.writeStringField("backendResourceId", this.backendResourceId);
        jsonWriter.writeStringField("region", this.region);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StaticSiteLinkedBackend from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StaticSiteLinkedBackend if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StaticSiteLinkedBackend.
     */
    public static StaticSiteLinkedBackend fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StaticSiteLinkedBackend deserializedStaticSiteLinkedBackend = new StaticSiteLinkedBackend();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("backendResourceId".equals(fieldName)) {
                    deserializedStaticSiteLinkedBackend.backendResourceId = reader.getString();
                } else if ("region".equals(fieldName)) {
                    deserializedStaticSiteLinkedBackend.region = reader.getString();
                } else if ("createdOn".equals(fieldName)) {
                    deserializedStaticSiteLinkedBackend.createdOn = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedStaticSiteLinkedBackend.provisioningState = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStaticSiteLinkedBackend;
        });
    }
}
