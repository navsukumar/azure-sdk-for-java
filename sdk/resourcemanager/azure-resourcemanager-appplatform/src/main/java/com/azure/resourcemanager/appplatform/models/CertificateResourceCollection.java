// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appplatform.fluent.models.CertificateResourceInner;
import java.io.IOException;
import java.util.List;

/**
 * Collection compose of certificate resources list and a possible link for next page.
 */
@Fluent
public final class CertificateResourceCollection implements JsonSerializable<CertificateResourceCollection> {
    /*
     * The certificate resources list.
     */
    private List<CertificateResourceInner> value;

    /*
     * The link to next page of certificate list.
     */
    private String nextLink;

    /**
     * Creates an instance of CertificateResourceCollection class.
     */
    public CertificateResourceCollection() {
    }

    /**
     * Get the value property: The certificate resources list.
     * 
     * @return the value value.
     */
    public List<CertificateResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The certificate resources list.
     * 
     * @param value the value value to set.
     * @return the CertificateResourceCollection object itself.
     */
    public CertificateResourceCollection withValue(List<CertificateResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to next page of certificate list.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to next page of certificate list.
     * 
     * @param nextLink the nextLink value to set.
     * @return the CertificateResourceCollection object itself.
     */
    public CertificateResourceCollection withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CertificateResourceCollection from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CertificateResourceCollection if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CertificateResourceCollection.
     */
    public static CertificateResourceCollection fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CertificateResourceCollection deserializedCertificateResourceCollection
                = new CertificateResourceCollection();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<CertificateResourceInner> value
                        = reader.readArray(reader1 -> CertificateResourceInner.fromJson(reader1));
                    deserializedCertificateResourceCollection.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedCertificateResourceCollection.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCertificateResourceCollection;
        });
    }
}
