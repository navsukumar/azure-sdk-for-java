// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Configuration to bind a ContainerApp to a dev ContainerApp Service.
 */
@Fluent
public final class ServiceBind implements JsonSerializable<ServiceBind> {
    /*
     * Resource id of the target service
     */
    private String serviceId;

    /*
     * Name of the service bind
     */
    private String name;

    /*
     * Type of the client to be used to connect to the service
     */
    private String clientType;

    /*
     * Customized keys for customizing injected values to the app
     */
    private Map<String, String> customizedKeys;

    /**
     * Creates an instance of ServiceBind class.
     */
    public ServiceBind() {
    }

    /**
     * Get the serviceId property: Resource id of the target service.
     * 
     * @return the serviceId value.
     */
    public String serviceId() {
        return this.serviceId;
    }

    /**
     * Set the serviceId property: Resource id of the target service.
     * 
     * @param serviceId the serviceId value to set.
     * @return the ServiceBind object itself.
     */
    public ServiceBind withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * Get the name property: Name of the service bind.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the service bind.
     * 
     * @param name the name value to set.
     * @return the ServiceBind object itself.
     */
    public ServiceBind withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the clientType property: Type of the client to be used to connect to the service.
     * 
     * @return the clientType value.
     */
    public String clientType() {
        return this.clientType;
    }

    /**
     * Set the clientType property: Type of the client to be used to connect to the service.
     * 
     * @param clientType the clientType value to set.
     * @return the ServiceBind object itself.
     */
    public ServiceBind withClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }

    /**
     * Get the customizedKeys property: Customized keys for customizing injected values to the app.
     * 
     * @return the customizedKeys value.
     */
    public Map<String, String> customizedKeys() {
        return this.customizedKeys;
    }

    /**
     * Set the customizedKeys property: Customized keys for customizing injected values to the app.
     * 
     * @param customizedKeys the customizedKeys value to set.
     * @return the ServiceBind object itself.
     */
    public ServiceBind withCustomizedKeys(Map<String, String> customizedKeys) {
        this.customizedKeys = customizedKeys;
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
        jsonWriter.writeStringField("serviceId", this.serviceId);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("clientType", this.clientType);
        jsonWriter.writeMapField("customizedKeys", this.customizedKeys,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServiceBind from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServiceBind if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ServiceBind.
     */
    public static ServiceBind fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServiceBind deserializedServiceBind = new ServiceBind();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("serviceId".equals(fieldName)) {
                    deserializedServiceBind.serviceId = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedServiceBind.name = reader.getString();
                } else if ("clientType".equals(fieldName)) {
                    deserializedServiceBind.clientType = reader.getString();
                } else if ("customizedKeys".equals(fieldName)) {
                    Map<String, String> customizedKeys = reader.readMap(reader1 -> reader1.getString());
                    deserializedServiceBind.customizedKeys = customizedKeys;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServiceBind;
        });
    }
}
