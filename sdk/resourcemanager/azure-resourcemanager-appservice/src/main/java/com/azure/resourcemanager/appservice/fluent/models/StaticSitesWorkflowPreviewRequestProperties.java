// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.models.StaticSiteBuildProperties;
import java.io.IOException;

/**
 * StaticSitesWorkflowPreviewRequest resource specific properties.
 */
@Fluent
public final class StaticSitesWorkflowPreviewRequestProperties
    implements JsonSerializable<StaticSitesWorkflowPreviewRequestProperties> {
    /*
     * URL for the repository of the static site.
     */
    private String repositoryUrl;

    /*
     * The target branch in the repository.
     */
    private String branch;

    /*
     * Build properties to configure on the repository.
     */
    private StaticSiteBuildProperties buildProperties;

    /**
     * Creates an instance of StaticSitesWorkflowPreviewRequestProperties class.
     */
    public StaticSitesWorkflowPreviewRequestProperties() {
    }

    /**
     * Get the repositoryUrl property: URL for the repository of the static site.
     * 
     * @return the repositoryUrl value.
     */
    public String repositoryUrl() {
        return this.repositoryUrl;
    }

    /**
     * Set the repositoryUrl property: URL for the repository of the static site.
     * 
     * @param repositoryUrl the repositoryUrl value to set.
     * @return the StaticSitesWorkflowPreviewRequestProperties object itself.
     */
    public StaticSitesWorkflowPreviewRequestProperties withRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
        return this;
    }

    /**
     * Get the branch property: The target branch in the repository.
     * 
     * @return the branch value.
     */
    public String branch() {
        return this.branch;
    }

    /**
     * Set the branch property: The target branch in the repository.
     * 
     * @param branch the branch value to set.
     * @return the StaticSitesWorkflowPreviewRequestProperties object itself.
     */
    public StaticSitesWorkflowPreviewRequestProperties withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Get the buildProperties property: Build properties to configure on the repository.
     * 
     * @return the buildProperties value.
     */
    public StaticSiteBuildProperties buildProperties() {
        return this.buildProperties;
    }

    /**
     * Set the buildProperties property: Build properties to configure on the repository.
     * 
     * @param buildProperties the buildProperties value to set.
     * @return the StaticSitesWorkflowPreviewRequestProperties object itself.
     */
    public StaticSitesWorkflowPreviewRequestProperties withBuildProperties(StaticSiteBuildProperties buildProperties) {
        this.buildProperties = buildProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (buildProperties() != null) {
            buildProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("repositoryUrl", this.repositoryUrl);
        jsonWriter.writeStringField("branch", this.branch);
        jsonWriter.writeJsonField("buildProperties", this.buildProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StaticSitesWorkflowPreviewRequestProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StaticSitesWorkflowPreviewRequestProperties if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StaticSitesWorkflowPreviewRequestProperties.
     */
    public static StaticSitesWorkflowPreviewRequestProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StaticSitesWorkflowPreviewRequestProperties deserializedStaticSitesWorkflowPreviewRequestProperties
                = new StaticSitesWorkflowPreviewRequestProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("repositoryUrl".equals(fieldName)) {
                    deserializedStaticSitesWorkflowPreviewRequestProperties.repositoryUrl = reader.getString();
                } else if ("branch".equals(fieldName)) {
                    deserializedStaticSitesWorkflowPreviewRequestProperties.branch = reader.getString();
                } else if ("buildProperties".equals(fieldName)) {
                    deserializedStaticSitesWorkflowPreviewRequestProperties.buildProperties
                        = StaticSiteBuildProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStaticSitesWorkflowPreviewRequestProperties;
        });
    }
}
