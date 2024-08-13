// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Deployment dependency information.
 */
@Fluent
public final class Dependency implements JsonSerializable<Dependency> {
    /*
     * The list of dependencies.
     */
    private List<BasicDependency> dependsOn;

    /*
     * The ID of the dependency.
     */
    private String id;

    /*
     * The dependency resource type.
     */
    private String resourceType;

    /*
     * The dependency resource name.
     */
    private String resourceName;

    /**
     * Creates an instance of Dependency class.
     */
    public Dependency() {
    }

    /**
     * Get the dependsOn property: The list of dependencies.
     * 
     * @return the dependsOn value.
     */
    public List<BasicDependency> dependsOn() {
        return this.dependsOn;
    }

    /**
     * Set the dependsOn property: The list of dependencies.
     * 
     * @param dependsOn the dependsOn value to set.
     * @return the Dependency object itself.
     */
    public Dependency withDependsOn(List<BasicDependency> dependsOn) {
        this.dependsOn = dependsOn;
        return this;
    }

    /**
     * Get the id property: The ID of the dependency.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The ID of the dependency.
     * 
     * @param id the id value to set.
     * @return the Dependency object itself.
     */
    public Dependency withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the resourceType property: The dependency resource type.
     * 
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: The dependency resource type.
     * 
     * @param resourceType the resourceType value to set.
     * @return the Dependency object itself.
     */
    public Dependency withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the resourceName property: The dependency resource name.
     * 
     * @return the resourceName value.
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Set the resourceName property: The dependency resource name.
     * 
     * @param resourceName the resourceName value to set.
     * @return the Dependency object itself.
     */
    public Dependency withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dependsOn() != null) {
            dependsOn().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("dependsOn", this.dependsOn, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("resourceType", this.resourceType);
        jsonWriter.writeStringField("resourceName", this.resourceName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Dependency from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Dependency if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the Dependency.
     */
    public static Dependency fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Dependency deserializedDependency = new Dependency();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dependsOn".equals(fieldName)) {
                    List<BasicDependency> dependsOn = reader.readArray(reader1 -> BasicDependency.fromJson(reader1));
                    deserializedDependency.dependsOn = dependsOn;
                } else if ("id".equals(fieldName)) {
                    deserializedDependency.id = reader.getString();
                } else if ("resourceType".equals(fieldName)) {
                    deserializedDependency.resourceType = reader.getString();
                } else if ("resourceName".equals(fieldName)) {
                    deserializedDependency.resourceName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDependency;
        });
    }
}
