// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.models.DeploymentBuildStatus;
import com.azure.resourcemanager.appservice.models.ErrorEntity;
import java.io.IOException;
import java.util.List;

/**
 * CsmDeploymentStatus resource specific properties.
 */
@Fluent
public final class CsmDeploymentStatusProperties implements JsonSerializable<CsmDeploymentStatusProperties> {
    /*
     * Deployment operation id.
     */
    private String deploymentId;

    /*
     * Deployment build status.
     */
    private DeploymentBuildStatus status;

    /*
     * Number of site instances currently being provisioned.
     */
    private Integer numberOfInstancesInProgress;

    /*
     * Number of site instances provisioned successfully.
     */
    private Integer numberOfInstancesSuccessful;

    /*
     * Number of site instances failed to provision.
     */
    private Integer numberOfInstancesFailed;

    /*
     * List of URLs pointing to logs for instances which failed to provision.
     */
    private List<String> failedInstancesLogs;

    /*
     * List of errors.
     */
    private List<ErrorEntity> errors;

    /**
     * Creates an instance of CsmDeploymentStatusProperties class.
     */
    public CsmDeploymentStatusProperties() {
    }

    /**
     * Get the deploymentId property: Deployment operation id.
     * 
     * @return the deploymentId value.
     */
    public String deploymentId() {
        return this.deploymentId;
    }

    /**
     * Set the deploymentId property: Deployment operation id.
     * 
     * @param deploymentId the deploymentId value to set.
     * @return the CsmDeploymentStatusProperties object itself.
     */
    public CsmDeploymentStatusProperties withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * Get the status property: Deployment build status.
     * 
     * @return the status value.
     */
    public DeploymentBuildStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Deployment build status.
     * 
     * @param status the status value to set.
     * @return the CsmDeploymentStatusProperties object itself.
     */
    public CsmDeploymentStatusProperties withStatus(DeploymentBuildStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the numberOfInstancesInProgress property: Number of site instances currently being provisioned.
     * 
     * @return the numberOfInstancesInProgress value.
     */
    public Integer numberOfInstancesInProgress() {
        return this.numberOfInstancesInProgress;
    }

    /**
     * Set the numberOfInstancesInProgress property: Number of site instances currently being provisioned.
     * 
     * @param numberOfInstancesInProgress the numberOfInstancesInProgress value to set.
     * @return the CsmDeploymentStatusProperties object itself.
     */
    public CsmDeploymentStatusProperties withNumberOfInstancesInProgress(Integer numberOfInstancesInProgress) {
        this.numberOfInstancesInProgress = numberOfInstancesInProgress;
        return this;
    }

    /**
     * Get the numberOfInstancesSuccessful property: Number of site instances provisioned successfully.
     * 
     * @return the numberOfInstancesSuccessful value.
     */
    public Integer numberOfInstancesSuccessful() {
        return this.numberOfInstancesSuccessful;
    }

    /**
     * Set the numberOfInstancesSuccessful property: Number of site instances provisioned successfully.
     * 
     * @param numberOfInstancesSuccessful the numberOfInstancesSuccessful value to set.
     * @return the CsmDeploymentStatusProperties object itself.
     */
    public CsmDeploymentStatusProperties withNumberOfInstancesSuccessful(Integer numberOfInstancesSuccessful) {
        this.numberOfInstancesSuccessful = numberOfInstancesSuccessful;
        return this;
    }

    /**
     * Get the numberOfInstancesFailed property: Number of site instances failed to provision.
     * 
     * @return the numberOfInstancesFailed value.
     */
    public Integer numberOfInstancesFailed() {
        return this.numberOfInstancesFailed;
    }

    /**
     * Set the numberOfInstancesFailed property: Number of site instances failed to provision.
     * 
     * @param numberOfInstancesFailed the numberOfInstancesFailed value to set.
     * @return the CsmDeploymentStatusProperties object itself.
     */
    public CsmDeploymentStatusProperties withNumberOfInstancesFailed(Integer numberOfInstancesFailed) {
        this.numberOfInstancesFailed = numberOfInstancesFailed;
        return this;
    }

    /**
     * Get the failedInstancesLogs property: List of URLs pointing to logs for instances which failed to provision.
     * 
     * @return the failedInstancesLogs value.
     */
    public List<String> failedInstancesLogs() {
        return this.failedInstancesLogs;
    }

    /**
     * Set the failedInstancesLogs property: List of URLs pointing to logs for instances which failed to provision.
     * 
     * @param failedInstancesLogs the failedInstancesLogs value to set.
     * @return the CsmDeploymentStatusProperties object itself.
     */
    public CsmDeploymentStatusProperties withFailedInstancesLogs(List<String> failedInstancesLogs) {
        this.failedInstancesLogs = failedInstancesLogs;
        return this;
    }

    /**
     * Get the errors property: List of errors.
     * 
     * @return the errors value.
     */
    public List<ErrorEntity> errors() {
        return this.errors;
    }

    /**
     * Set the errors property: List of errors.
     * 
     * @param errors the errors value to set.
     * @return the CsmDeploymentStatusProperties object itself.
     */
    public CsmDeploymentStatusProperties withErrors(List<ErrorEntity> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (errors() != null) {
            errors().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("deploymentId", this.deploymentId);
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        jsonWriter.writeNumberField("numberOfInstancesInProgress", this.numberOfInstancesInProgress);
        jsonWriter.writeNumberField("numberOfInstancesSuccessful", this.numberOfInstancesSuccessful);
        jsonWriter.writeNumberField("numberOfInstancesFailed", this.numberOfInstancesFailed);
        jsonWriter.writeArrayField("failedInstancesLogs", this.failedInstancesLogs,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("errors", this.errors, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CsmDeploymentStatusProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CsmDeploymentStatusProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CsmDeploymentStatusProperties.
     */
    public static CsmDeploymentStatusProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CsmDeploymentStatusProperties deserializedCsmDeploymentStatusProperties
                = new CsmDeploymentStatusProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("deploymentId".equals(fieldName)) {
                    deserializedCsmDeploymentStatusProperties.deploymentId = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedCsmDeploymentStatusProperties.status
                        = DeploymentBuildStatus.fromString(reader.getString());
                } else if ("numberOfInstancesInProgress".equals(fieldName)) {
                    deserializedCsmDeploymentStatusProperties.numberOfInstancesInProgress
                        = reader.getNullable(JsonReader::getInt);
                } else if ("numberOfInstancesSuccessful".equals(fieldName)) {
                    deserializedCsmDeploymentStatusProperties.numberOfInstancesSuccessful
                        = reader.getNullable(JsonReader::getInt);
                } else if ("numberOfInstancesFailed".equals(fieldName)) {
                    deserializedCsmDeploymentStatusProperties.numberOfInstancesFailed
                        = reader.getNullable(JsonReader::getInt);
                } else if ("failedInstancesLogs".equals(fieldName)) {
                    List<String> failedInstancesLogs = reader.readArray(reader1 -> reader1.getString());
                    deserializedCsmDeploymentStatusProperties.failedInstancesLogs = failedInstancesLogs;
                } else if ("errors".equals(fieldName)) {
                    List<ErrorEntity> errors = reader.readArray(reader1 -> ErrorEntity.fromJson(reader1));
                    deserializedCsmDeploymentStatusProperties.errors = errors;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCsmDeploymentStatusProperties;
        });
    }
}
