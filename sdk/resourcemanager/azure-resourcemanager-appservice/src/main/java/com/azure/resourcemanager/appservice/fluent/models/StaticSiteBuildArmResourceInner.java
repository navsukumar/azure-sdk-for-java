// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.models.BuildStatus;
import com.azure.resourcemanager.appservice.models.DatabaseConnectionOverview;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.azure.resourcemanager.appservice.models.StaticSiteLinkedBackend;
import com.azure.resourcemanager.appservice.models.StaticSiteUserProvidedFunctionApp;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Static Site Build ARM resource.
 */
@Fluent
public final class StaticSiteBuildArmResourceInner extends ProxyOnlyResource {
    /*
     * StaticSiteBuildARMResource resource specific properties
     */
    private StaticSiteBuildArmResourceProperties innerProperties;

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
     * Creates an instance of StaticSiteBuildArmResourceInner class.
     */
    public StaticSiteBuildArmResourceInner() {
    }

    /**
     * Get the innerProperties property: StaticSiteBuildARMResource resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private StaticSiteBuildArmResourceProperties innerProperties() {
        return this.innerProperties;
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
    public StaticSiteBuildArmResourceInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the buildId property: An identifier for the static site build.
     * 
     * @return the buildId value.
     */
    public String buildId() {
        return this.innerProperties() == null ? null : this.innerProperties().buildId();
    }

    /**
     * Get the sourceBranch property: The source branch.
     * 
     * @return the sourceBranch value.
     */
    public String sourceBranch() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceBranch();
    }

    /**
     * Get the pullRequestTitle property: The title of a pull request that a static site build is related to.
     * 
     * @return the pullRequestTitle value.
     */
    public String pullRequestTitle() {
        return this.innerProperties() == null ? null : this.innerProperties().pullRequestTitle();
    }

    /**
     * Get the hostname property: The hostname for a static site build.
     * 
     * @return the hostname value.
     */
    public String hostname() {
        return this.innerProperties() == null ? null : this.innerProperties().hostname();
    }

    /**
     * Get the createdTimeUtc property: When this build was created.
     * 
     * @return the createdTimeUtc value.
     */
    public OffsetDateTime createdTimeUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().createdTimeUtc();
    }

    /**
     * Get the lastUpdatedOn property: When this build was updated.
     * 
     * @return the lastUpdatedOn value.
     */
    public OffsetDateTime lastUpdatedOn() {
        return this.innerProperties() == null ? null : this.innerProperties().lastUpdatedOn();
    }

    /**
     * Get the status property: The status of the static site build.
     * 
     * @return the status value.
     */
    public BuildStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the userProvidedFunctionApps property: User provided function apps registered with the static site build.
     * 
     * @return the userProvidedFunctionApps value.
     */
    public List<StaticSiteUserProvidedFunctionApp> userProvidedFunctionApps() {
        return this.innerProperties() == null ? null : this.innerProperties().userProvidedFunctionApps();
    }

    /**
     * Get the linkedBackends property: Backends linked to the static side build.
     * 
     * @return the linkedBackends value.
     */
    public List<StaticSiteLinkedBackend> linkedBackends() {
        return this.innerProperties() == null ? null : this.innerProperties().linkedBackends();
    }

    /**
     * Get the databaseConnections property: Database connections for the static site build.
     * 
     * @return the databaseConnections value.
     */
    public List<DatabaseConnectionOverview> databaseConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().databaseConnections();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
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
        jsonWriter.writeStringField("kind", kind());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StaticSiteBuildArmResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StaticSiteBuildArmResourceInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the StaticSiteBuildArmResourceInner.
     */
    public static StaticSiteBuildArmResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StaticSiteBuildArmResourceInner deserializedStaticSiteBuildArmResourceInner
                = new StaticSiteBuildArmResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedStaticSiteBuildArmResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedStaticSiteBuildArmResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedStaticSiteBuildArmResourceInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedStaticSiteBuildArmResourceInner.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedStaticSiteBuildArmResourceInner.innerProperties
                        = StaticSiteBuildArmResourceProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStaticSiteBuildArmResourceInner;
        });
    }
}
