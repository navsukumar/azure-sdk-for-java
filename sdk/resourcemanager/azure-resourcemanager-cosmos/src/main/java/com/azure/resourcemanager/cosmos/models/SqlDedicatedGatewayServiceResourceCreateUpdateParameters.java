// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Parameters for Create or Update request for SqlDedicatedGatewayServiceResource.
 */
@Fluent
public final class SqlDedicatedGatewayServiceResourceCreateUpdateParameters
    extends ServiceResourceCreateUpdateProperties {
    /*
     * ServiceType for the service.
     */
    private ServiceType serviceType = ServiceType.SQL_DEDICATED_GATEWAY;

    /*
     * DedicatedGatewayType for the service.
     */
    private DedicatedGatewayType dedicatedGatewayType;

    /**
     * Creates an instance of SqlDedicatedGatewayServiceResourceCreateUpdateParameters class.
     */
    public SqlDedicatedGatewayServiceResourceCreateUpdateParameters() {
    }

    /**
     * Get the serviceType property: ServiceType for the service.
     * 
     * @return the serviceType value.
     */
    @Override
    public ServiceType serviceType() {
        return this.serviceType;
    }

    /**
     * Get the dedicatedGatewayType property: DedicatedGatewayType for the service.
     * 
     * @return the dedicatedGatewayType value.
     */
    public DedicatedGatewayType dedicatedGatewayType() {
        return this.dedicatedGatewayType;
    }

    /**
     * Set the dedicatedGatewayType property: DedicatedGatewayType for the service.
     * 
     * @param dedicatedGatewayType the dedicatedGatewayType value to set.
     * @return the SqlDedicatedGatewayServiceResourceCreateUpdateParameters object itself.
     */
    public SqlDedicatedGatewayServiceResourceCreateUpdateParameters
        withDedicatedGatewayType(DedicatedGatewayType dedicatedGatewayType) {
        this.dedicatedGatewayType = dedicatedGatewayType;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlDedicatedGatewayServiceResourceCreateUpdateParameters withInstanceSize(ServiceSize instanceSize) {
        super.withInstanceSize(instanceSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlDedicatedGatewayServiceResourceCreateUpdateParameters withInstanceCount(Integer instanceCount) {
        super.withInstanceCount(instanceCount);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("instanceSize", instanceSize() == null ? null : instanceSize().toString());
        jsonWriter.writeNumberField("instanceCount", instanceCount());
        jsonWriter.writeStringField("serviceType", this.serviceType == null ? null : this.serviceType.toString());
        jsonWriter.writeStringField("dedicatedGatewayType",
            this.dedicatedGatewayType == null ? null : this.dedicatedGatewayType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SqlDedicatedGatewayServiceResourceCreateUpdateParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SqlDedicatedGatewayServiceResourceCreateUpdateParameters if the JsonReader was pointing to
     * an instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the
     * SqlDedicatedGatewayServiceResourceCreateUpdateParameters.
     */
    public static SqlDedicatedGatewayServiceResourceCreateUpdateParameters fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            SqlDedicatedGatewayServiceResourceCreateUpdateParameters deserializedSqlDedicatedGatewayServiceResourceCreateUpdateParameters
                = new SqlDedicatedGatewayServiceResourceCreateUpdateParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("instanceSize".equals(fieldName)) {
                    deserializedSqlDedicatedGatewayServiceResourceCreateUpdateParameters
                        .withInstanceSize(ServiceSize.fromString(reader.getString()));
                } else if ("instanceCount".equals(fieldName)) {
                    deserializedSqlDedicatedGatewayServiceResourceCreateUpdateParameters
                        .withInstanceCount(reader.getNullable(JsonReader::getInt));
                } else if ("serviceType".equals(fieldName)) {
                    deserializedSqlDedicatedGatewayServiceResourceCreateUpdateParameters.serviceType
                        = ServiceType.fromString(reader.getString());
                } else if ("dedicatedGatewayType".equals(fieldName)) {
                    deserializedSqlDedicatedGatewayServiceResourceCreateUpdateParameters.dedicatedGatewayType
                        = DedicatedGatewayType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSqlDedicatedGatewayServiceResourceCreateUpdateParameters;
        });
    }
}
