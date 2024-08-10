// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * StaticSiteUserProvidedFunctionAppARMResource resource specific properties.
 */
@Fluent
public final class StaticSiteUserProvidedFunctionAppArmResourceProperties
    implements JsonSerializable<StaticSiteUserProvidedFunctionAppArmResourceProperties> {
    /*
     * The resource id of the function app registered with the static site
     */
    private String functionAppResourceId;

    /*
     * The region of the function app registered with the static site
     */
    private String functionAppRegion;

    /*
     * The date and time on which the function app was registered with the static site.
     */
    private OffsetDateTime createdOn;

    /**
     * Creates an instance of StaticSiteUserProvidedFunctionAppArmResourceProperties class.
     */
    public StaticSiteUserProvidedFunctionAppArmResourceProperties() {
    }

    /**
     * Get the functionAppResourceId property: The resource id of the function app registered with the static site.
     * 
     * @return the functionAppResourceId value.
     */
    public String functionAppResourceId() {
        return this.functionAppResourceId;
    }

    /**
     * Set the functionAppResourceId property: The resource id of the function app registered with the static site.
     * 
     * @param functionAppResourceId the functionAppResourceId value to set.
     * @return the StaticSiteUserProvidedFunctionAppArmResourceProperties object itself.
     */
    public StaticSiteUserProvidedFunctionAppArmResourceProperties
        withFunctionAppResourceId(String functionAppResourceId) {
        this.functionAppResourceId = functionAppResourceId;
        return this;
    }

    /**
     * Get the functionAppRegion property: The region of the function app registered with the static site.
     * 
     * @return the functionAppRegion value.
     */
    public String functionAppRegion() {
        return this.functionAppRegion;
    }

    /**
     * Set the functionAppRegion property: The region of the function app registered with the static site.
     * 
     * @param functionAppRegion the functionAppRegion value to set.
     * @return the StaticSiteUserProvidedFunctionAppArmResourceProperties object itself.
     */
    public StaticSiteUserProvidedFunctionAppArmResourceProperties withFunctionAppRegion(String functionAppRegion) {
        this.functionAppRegion = functionAppRegion;
        return this;
    }

    /**
     * Get the createdOn property: The date and time on which the function app was registered with the static site.
     * 
     * @return the createdOn value.
     */
    public OffsetDateTime createdOn() {
        return this.createdOn;
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
        jsonWriter.writeStringField("functionAppResourceId", this.functionAppResourceId);
        jsonWriter.writeStringField("functionAppRegion", this.functionAppRegion);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StaticSiteUserProvidedFunctionAppArmResourceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StaticSiteUserProvidedFunctionAppArmResourceProperties if the JsonReader was pointing to
     * an instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StaticSiteUserProvidedFunctionAppArmResourceProperties.
     */
    public static StaticSiteUserProvidedFunctionAppArmResourceProperties fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            StaticSiteUserProvidedFunctionAppArmResourceProperties deserializedStaticSiteUserProvidedFunctionAppArmResourceProperties
                = new StaticSiteUserProvidedFunctionAppArmResourceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("functionAppResourceId".equals(fieldName)) {
                    deserializedStaticSiteUserProvidedFunctionAppArmResourceProperties.functionAppResourceId
                        = reader.getString();
                } else if ("functionAppRegion".equals(fieldName)) {
                    deserializedStaticSiteUserProvidedFunctionAppArmResourceProperties.functionAppRegion
                        = reader.getString();
                } else if ("createdOn".equals(fieldName)) {
                    deserializedStaticSiteUserProvidedFunctionAppArmResourceProperties.createdOn = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStaticSiteUserProvidedFunctionAppArmResourceProperties;
        });
    }
}
