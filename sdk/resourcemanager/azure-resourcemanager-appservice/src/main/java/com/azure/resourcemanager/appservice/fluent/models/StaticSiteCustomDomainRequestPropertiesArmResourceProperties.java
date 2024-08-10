// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * StaticSiteCustomDomainRequestPropertiesARMResource resource specific properties.
 */
@Fluent
public final class StaticSiteCustomDomainRequestPropertiesArmResourceProperties
    implements JsonSerializable<StaticSiteCustomDomainRequestPropertiesArmResourceProperties> {
    /*
     * Validation method for adding a custom domain
     */
    private String validationMethod;

    /**
     * Creates an instance of StaticSiteCustomDomainRequestPropertiesArmResourceProperties class.
     */
    public StaticSiteCustomDomainRequestPropertiesArmResourceProperties() {
    }

    /**
     * Get the validationMethod property: Validation method for adding a custom domain.
     * 
     * @return the validationMethod value.
     */
    public String validationMethod() {
        return this.validationMethod;
    }

    /**
     * Set the validationMethod property: Validation method for adding a custom domain.
     * 
     * @param validationMethod the validationMethod value to set.
     * @return the StaticSiteCustomDomainRequestPropertiesArmResourceProperties object itself.
     */
    public StaticSiteCustomDomainRequestPropertiesArmResourceProperties withValidationMethod(String validationMethod) {
        this.validationMethod = validationMethod;
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
        jsonWriter.writeStringField("validationMethod", this.validationMethod);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StaticSiteCustomDomainRequestPropertiesArmResourceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StaticSiteCustomDomainRequestPropertiesArmResourceProperties if the JsonReader was
     * pointing to an instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the
     * StaticSiteCustomDomainRequestPropertiesArmResourceProperties.
     */
    public static StaticSiteCustomDomainRequestPropertiesArmResourceProperties fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            StaticSiteCustomDomainRequestPropertiesArmResourceProperties deserializedStaticSiteCustomDomainRequestPropertiesArmResourceProperties
                = new StaticSiteCustomDomainRequestPropertiesArmResourceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("validationMethod".equals(fieldName)) {
                    deserializedStaticSiteCustomDomainRequestPropertiesArmResourceProperties.validationMethod
                        = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStaticSiteCustomDomainRequestPropertiesArmResourceProperties;
        });
    }
}
