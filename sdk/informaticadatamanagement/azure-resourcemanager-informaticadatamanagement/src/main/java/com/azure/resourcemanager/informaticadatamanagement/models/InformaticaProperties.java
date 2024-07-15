// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Properties of the Informatica organization.
 */
@Fluent
public final class InformaticaProperties implements JsonSerializable<InformaticaProperties> {
    /*
     * Organization id
     */
    private String organizationId;

    /*
     * Organization name
     */
    private String organizationName;

    /*
     * Informatica organization region
     */
    private String informaticaRegion;

    /*
     * Single sing on URL for informatica organization
     */
    private String singleSignOnUrl;

    /**
     * Creates an instance of InformaticaProperties class.
     */
    public InformaticaProperties() {
    }

    /**
     * Get the organizationId property: Organization id.
     * 
     * @return the organizationId value.
     */
    public String organizationId() {
        return this.organizationId;
    }

    /**
     * Set the organizationId property: Organization id.
     * 
     * @param organizationId the organizationId value to set.
     * @return the InformaticaProperties object itself.
     */
    public InformaticaProperties withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * Get the organizationName property: Organization name.
     * 
     * @return the organizationName value.
     */
    public String organizationName() {
        return this.organizationName;
    }

    /**
     * Set the organizationName property: Organization name.
     * 
     * @param organizationName the organizationName value to set.
     * @return the InformaticaProperties object itself.
     */
    public InformaticaProperties withOrganizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    /**
     * Get the informaticaRegion property: Informatica organization region.
     * 
     * @return the informaticaRegion value.
     */
    public String informaticaRegion() {
        return this.informaticaRegion;
    }

    /**
     * Set the informaticaRegion property: Informatica organization region.
     * 
     * @param informaticaRegion the informaticaRegion value to set.
     * @return the InformaticaProperties object itself.
     */
    public InformaticaProperties withInformaticaRegion(String informaticaRegion) {
        this.informaticaRegion = informaticaRegion;
        return this;
    }

    /**
     * Get the singleSignOnUrl property: Single sing on URL for informatica organization.
     * 
     * @return the singleSignOnUrl value.
     */
    public String singleSignOnUrl() {
        return this.singleSignOnUrl;
    }

    /**
     * Set the singleSignOnUrl property: Single sing on URL for informatica organization.
     * 
     * @param singleSignOnUrl the singleSignOnUrl value to set.
     * @return the InformaticaProperties object itself.
     */
    public InformaticaProperties withSingleSignOnUrl(String singleSignOnUrl) {
        this.singleSignOnUrl = singleSignOnUrl;
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
        jsonWriter.writeStringField("organizationId", this.organizationId);
        jsonWriter.writeStringField("organizationName", this.organizationName);
        jsonWriter.writeStringField("informaticaRegion", this.informaticaRegion);
        jsonWriter.writeStringField("singleSignOnUrl", this.singleSignOnUrl);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of InformaticaProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of InformaticaProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the InformaticaProperties.
     */
    public static InformaticaProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            InformaticaProperties deserializedInformaticaProperties = new InformaticaProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("organizationId".equals(fieldName)) {
                    deserializedInformaticaProperties.organizationId = reader.getString();
                } else if ("organizationName".equals(fieldName)) {
                    deserializedInformaticaProperties.organizationName = reader.getString();
                } else if ("informaticaRegion".equals(fieldName)) {
                    deserializedInformaticaProperties.informaticaRegion = reader.getString();
                } else if ("singleSignOnUrl".equals(fieldName)) {
                    deserializedInformaticaProperties.singleSignOnUrl = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedInformaticaProperties;
        });
    }
}
