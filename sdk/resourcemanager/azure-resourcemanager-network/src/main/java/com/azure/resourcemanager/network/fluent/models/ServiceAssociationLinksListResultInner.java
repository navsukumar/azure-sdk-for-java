// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.ServiceAssociationLink;
import java.io.IOException;
import java.util.List;

/**
 * Response for ServiceAssociationLinks_List operation.
 */
@Fluent
public final class ServiceAssociationLinksListResultInner
    implements JsonSerializable<ServiceAssociationLinksListResultInner> {
    /*
     * The service association links in a subnet.
     */
    private List<ServiceAssociationLink> value;

    /*
     * The URL to get the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of ServiceAssociationLinksListResultInner class.
     */
    public ServiceAssociationLinksListResultInner() {
    }

    /**
     * Get the value property: The service association links in a subnet.
     * 
     * @return the value value.
     */
    public List<ServiceAssociationLink> value() {
        return this.value;
    }

    /**
     * Set the value property: The service association links in a subnet.
     * 
     * @param value the value value to set.
     * @return the ServiceAssociationLinksListResultInner object itself.
     */
    public ServiceAssociationLinksListResultInner withValue(List<ServiceAssociationLink> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServiceAssociationLinksListResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServiceAssociationLinksListResultInner if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ServiceAssociationLinksListResultInner.
     */
    public static ServiceAssociationLinksListResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServiceAssociationLinksListResultInner deserializedServiceAssociationLinksListResultInner
                = new ServiceAssociationLinksListResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ServiceAssociationLink> value
                        = reader.readArray(reader1 -> ServiceAssociationLink.fromJson(reader1));
                    deserializedServiceAssociationLinksListResultInner.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedServiceAssociationLinksListResultInner.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServiceAssociationLinksListResultInner;
        });
    }
}
