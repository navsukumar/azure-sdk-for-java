// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Properties in ServiceResourceCreateUpdateParameters.
 */
@Fluent
public class ServiceResourceCreateUpdateProperties implements JsonSerializable<ServiceResourceCreateUpdateProperties> {
    /*
     * ServiceType for the service.
     */
    private ServiceType serviceType = ServiceType.fromString("ServiceResourceCreateUpdateProperties");

    /*
     * Instance type for the service.
     */
    private ServiceSize instanceSize;

    /*
     * Instance count for the service.
     */
    private Integer instanceCount;

    /**
     * Creates an instance of ServiceResourceCreateUpdateProperties class.
     */
    public ServiceResourceCreateUpdateProperties() {
    }

    /**
     * Get the serviceType property: ServiceType for the service.
     * 
     * @return the serviceType value.
     */
    public ServiceType serviceType() {
        return this.serviceType;
    }

    /**
     * Get the instanceSize property: Instance type for the service.
     * 
     * @return the instanceSize value.
     */
    public ServiceSize instanceSize() {
        return this.instanceSize;
    }

    /**
     * Set the instanceSize property: Instance type for the service.
     * 
     * @param instanceSize the instanceSize value to set.
     * @return the ServiceResourceCreateUpdateProperties object itself.
     */
    public ServiceResourceCreateUpdateProperties withInstanceSize(ServiceSize instanceSize) {
        this.instanceSize = instanceSize;
        return this;
    }

    /**
     * Get the instanceCount property: Instance count for the service.
     * 
     * @return the instanceCount value.
     */
    public Integer instanceCount() {
        return this.instanceCount;
    }

    /**
     * Set the instanceCount property: Instance count for the service.
     * 
     * @param instanceCount the instanceCount value to set.
     * @return the ServiceResourceCreateUpdateProperties object itself.
     */
    public ServiceResourceCreateUpdateProperties withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
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
        jsonWriter.writeStringField("serviceType", this.serviceType == null ? null : this.serviceType.toString());
        jsonWriter.writeStringField("instanceSize", this.instanceSize == null ? null : this.instanceSize.toString());
        jsonWriter.writeNumberField("instanceCount", this.instanceCount);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServiceResourceCreateUpdateProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServiceResourceCreateUpdateProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ServiceResourceCreateUpdateProperties.
     */
    public static ServiceResourceCreateUpdateProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("serviceType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("DataTransfer".equals(discriminatorValue)) {
                    return DataTransferServiceResourceCreateUpdateParameters.fromJson(readerToUse.reset());
                } else if ("SqlDedicatedGateway".equals(discriminatorValue)) {
                    return SqlDedicatedGatewayServiceResourceCreateUpdateParameters.fromJson(readerToUse.reset());
                } else if ("GraphAPICompute".equals(discriminatorValue)) {
                    return GraphApiComputeServiceResourceCreateUpdateParameters.fromJson(readerToUse.reset());
                } else if ("MaterializedViewsBuilder".equals(discriminatorValue)) {
                    return MaterializedViewsBuilderServiceResourceCreateUpdateParameters.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static ServiceResourceCreateUpdateProperties fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServiceResourceCreateUpdateProperties deserializedServiceResourceCreateUpdateProperties
                = new ServiceResourceCreateUpdateProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("serviceType".equals(fieldName)) {
                    deserializedServiceResourceCreateUpdateProperties.serviceType
                        = ServiceType.fromString(reader.getString());
                } else if ("instanceSize".equals(fieldName)) {
                    deserializedServiceResourceCreateUpdateProperties.instanceSize
                        = ServiceSize.fromString(reader.getString());
                } else if ("instanceCount".equals(fieldName)) {
                    deserializedServiceResourceCreateUpdateProperties.instanceCount
                        = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServiceResourceCreateUpdateProperties;
        });
    }
}
