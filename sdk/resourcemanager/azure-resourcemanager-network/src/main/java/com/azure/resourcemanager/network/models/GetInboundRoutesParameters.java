// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The parameters specifying the connection resource whose inbound routes are being requested.
 */
@Fluent
public final class GetInboundRoutesParameters implements JsonSerializable<GetInboundRoutesParameters> {
    /*
     * The connection resource whose inbound routes are being requested.
     */
    private String resourceUri;

    /*
     * The type of the specified connection resource like ExpressRouteConnection, HubVirtualNetworkConnection,
     * VpnConnection and P2SConnection.
     */
    private String connectionType;

    /**
     * Creates an instance of GetInboundRoutesParameters class.
     */
    public GetInboundRoutesParameters() {
    }

    /**
     * Get the resourceUri property: The connection resource whose inbound routes are being requested.
     * 
     * @return the resourceUri value.
     */
    public String resourceUri() {
        return this.resourceUri;
    }

    /**
     * Set the resourceUri property: The connection resource whose inbound routes are being requested.
     * 
     * @param resourceUri the resourceUri value to set.
     * @return the GetInboundRoutesParameters object itself.
     */
    public GetInboundRoutesParameters withResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
        return this;
    }

    /**
     * Get the connectionType property: The type of the specified connection resource like ExpressRouteConnection,
     * HubVirtualNetworkConnection, VpnConnection and P2SConnection.
     * 
     * @return the connectionType value.
     */
    public String connectionType() {
        return this.connectionType;
    }

    /**
     * Set the connectionType property: The type of the specified connection resource like ExpressRouteConnection,
     * HubVirtualNetworkConnection, VpnConnection and P2SConnection.
     * 
     * @param connectionType the connectionType value to set.
     * @return the GetInboundRoutesParameters object itself.
     */
    public GetInboundRoutesParameters withConnectionType(String connectionType) {
        this.connectionType = connectionType;
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
        jsonWriter.writeStringField("resourceUri", this.resourceUri);
        jsonWriter.writeStringField("connectionType", this.connectionType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GetInboundRoutesParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GetInboundRoutesParameters if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GetInboundRoutesParameters.
     */
    public static GetInboundRoutesParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GetInboundRoutesParameters deserializedGetInboundRoutesParameters = new GetInboundRoutesParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resourceUri".equals(fieldName)) {
                    deserializedGetInboundRoutesParameters.resourceUri = reader.getString();
                } else if ("connectionType".equals(fieldName)) {
                    deserializedGetInboundRoutesParameters.connectionType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGetInboundRoutesParameters;
        });
    }
}
