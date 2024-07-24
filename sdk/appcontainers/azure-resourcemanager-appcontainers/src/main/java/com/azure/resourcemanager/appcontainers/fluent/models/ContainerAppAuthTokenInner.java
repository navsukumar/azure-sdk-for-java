// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * Container App Auth Token.
 */
@Fluent
public final class ContainerAppAuthTokenInner extends Resource {
    /*
     * Container App auth token resource specific properties
     */
    private ContainerAppAuthTokenProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of ContainerAppAuthTokenInner class.
     */
    public ContainerAppAuthTokenInner() {
    }

    /**
     * Get the innerProperties property: Container App auth token resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private ContainerAppAuthTokenProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContainerAppAuthTokenInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContainerAppAuthTokenInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the token property: Auth token value.
     * 
     * @return the token value.
     */
    public String token() {
        return this.innerProperties() == null ? null : this.innerProperties().token();
    }

    /**
     * Get the expires property: Token expiration date.
     * 
     * @return the expires value.
     */
    public OffsetDateTime expires() {
        return this.innerProperties() == null ? null : this.innerProperties().expires();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ContainerAppAuthTokenInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ContainerAppAuthTokenInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ContainerAppAuthTokenInner.
     */
    public static ContainerAppAuthTokenInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ContainerAppAuthTokenInner deserializedContainerAppAuthTokenInner = new ContainerAppAuthTokenInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedContainerAppAuthTokenInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedContainerAppAuthTokenInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedContainerAppAuthTokenInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedContainerAppAuthTokenInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedContainerAppAuthTokenInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedContainerAppAuthTokenInner.innerProperties
                        = ContainerAppAuthTokenProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedContainerAppAuthTokenInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedContainerAppAuthTokenInner;
        });
    }
}
