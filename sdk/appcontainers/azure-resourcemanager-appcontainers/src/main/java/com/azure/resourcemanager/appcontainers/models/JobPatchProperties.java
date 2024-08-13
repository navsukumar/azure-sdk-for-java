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
 * Container Apps Job resource specific properties.
 */
@Fluent
public final class JobPatchProperties implements JsonSerializable<JobPatchProperties> {
    /*
     * Managed identities needed by a container app job to interact with other Azure services to not maintain any
     * secrets or credentials in code.
     */
    private ManagedServiceIdentity identity;

    /*
     * Resource tags.
     */
    private Map<String, String> tags;

    /*
     * The properties property.
     */
    private JobPatchPropertiesProperties properties;

    /**
     * Creates an instance of JobPatchProperties class.
     */
    public JobPatchProperties() {
    }

    /**
     * Get the identity property: Managed identities needed by a container app job to interact with other Azure services
     * to not maintain any secrets or credentials in code.
     * 
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Managed identities needed by a container app job to interact with other Azure services
     * to not maintain any secrets or credentials in code.
     * 
     * @param identity the identity value to set.
     * @return the JobPatchProperties object itself.
     */
    public JobPatchProperties withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     * 
     * @param tags the tags value to set.
     * @return the JobPatchProperties object itself.
     */
    public JobPatchProperties withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the properties property: The properties property.
     * 
     * @return the properties value.
     */
    public JobPatchPropertiesProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties property.
     * 
     * @param properties the properties value to set.
     * @return the JobPatchProperties object itself.
     */
    public JobPatchProperties withProperties(JobPatchPropertiesProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("identity", this.identity);
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of JobPatchProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of JobPatchProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the JobPatchProperties.
     */
    public static JobPatchProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            JobPatchProperties deserializedJobPatchProperties = new JobPatchProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("identity".equals(fieldName)) {
                    deserializedJobPatchProperties.identity = ManagedServiceIdentity.fromJson(reader);
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedJobPatchProperties.tags = tags;
                } else if ("properties".equals(fieldName)) {
                    deserializedJobPatchProperties.properties = JobPatchPropertiesProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedJobPatchProperties;
        });
    }
}
