// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * The properties of a elastic pool operation.
 */
@Immutable
public final class ElasticPoolOperationProperties implements JsonSerializable<ElasticPoolOperationProperties> {
    /*
     * The name of the elastic pool the operation is being performed on.
     */
    private String elasticPoolName;

    /*
     * The name of operation.
     */
    private String operation;

    /*
     * The friendly name of operation.
     */
    private String operationFriendlyName;

    /*
     * The percentage of the operation completed.
     */
    private Integer percentComplete;

    /*
     * The name of the server.
     */
    private String serverName;

    /*
     * The operation start time.
     */
    private OffsetDateTime startTime;

    /*
     * The operation state.
     */
    private String state;

    /*
     * The operation error code.
     */
    private Integer errorCode;

    /*
     * The operation error description.
     */
    private String errorDescription;

    /*
     * The operation error severity.
     */
    private Integer errorSeverity;

    /*
     * Whether or not the error is a user error.
     */
    private Boolean isUserError;

    /*
     * The estimated completion time of the operation.
     */
    private OffsetDateTime estimatedCompletionTime;

    /*
     * The operation description.
     */
    private String description;

    /*
     * Whether the operation can be cancelled.
     */
    private Boolean isCancellable;

    /**
     * Creates an instance of ElasticPoolOperationProperties class.
     */
    public ElasticPoolOperationProperties() {
    }

    /**
     * Get the elasticPoolName property: The name of the elastic pool the operation is being performed on.
     * 
     * @return the elasticPoolName value.
     */
    public String elasticPoolName() {
        return this.elasticPoolName;
    }

    /**
     * Get the operation property: The name of operation.
     * 
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Get the operationFriendlyName property: The friendly name of operation.
     * 
     * @return the operationFriendlyName value.
     */
    public String operationFriendlyName() {
        return this.operationFriendlyName;
    }

    /**
     * Get the percentComplete property: The percentage of the operation completed.
     * 
     * @return the percentComplete value.
     */
    public Integer percentComplete() {
        return this.percentComplete;
    }

    /**
     * Get the serverName property: The name of the server.
     * 
     * @return the serverName value.
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Get the startTime property: The operation start time.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the state property: The operation state.
     * 
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Get the errorCode property: The operation error code.
     * 
     * @return the errorCode value.
     */
    public Integer errorCode() {
        return this.errorCode;
    }

    /**
     * Get the errorDescription property: The operation error description.
     * 
     * @return the errorDescription value.
     */
    public String errorDescription() {
        return this.errorDescription;
    }

    /**
     * Get the errorSeverity property: The operation error severity.
     * 
     * @return the errorSeverity value.
     */
    public Integer errorSeverity() {
        return this.errorSeverity;
    }

    /**
     * Get the isUserError property: Whether or not the error is a user error.
     * 
     * @return the isUserError value.
     */
    public Boolean isUserError() {
        return this.isUserError;
    }

    /**
     * Get the estimatedCompletionTime property: The estimated completion time of the operation.
     * 
     * @return the estimatedCompletionTime value.
     */
    public OffsetDateTime estimatedCompletionTime() {
        return this.estimatedCompletionTime;
    }

    /**
     * Get the description property: The operation description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the isCancellable property: Whether the operation can be cancelled.
     * 
     * @return the isCancellable value.
     */
    public Boolean isCancellable() {
        return this.isCancellable;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ElasticPoolOperationProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ElasticPoolOperationProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ElasticPoolOperationProperties.
     */
    public static ElasticPoolOperationProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ElasticPoolOperationProperties deserializedElasticPoolOperationProperties
                = new ElasticPoolOperationProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("elasticPoolName".equals(fieldName)) {
                    deserializedElasticPoolOperationProperties.elasticPoolName = reader.getString();
                } else if ("operation".equals(fieldName)) {
                    deserializedElasticPoolOperationProperties.operation = reader.getString();
                } else if ("operationFriendlyName".equals(fieldName)) {
                    deserializedElasticPoolOperationProperties.operationFriendlyName = reader.getString();
                } else if ("percentComplete".equals(fieldName)) {
                    deserializedElasticPoolOperationProperties.percentComplete = reader.getNullable(JsonReader::getInt);
                } else if ("serverName".equals(fieldName)) {
                    deserializedElasticPoolOperationProperties.serverName = reader.getString();
                } else if ("startTime".equals(fieldName)) {
                    deserializedElasticPoolOperationProperties.startTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("state".equals(fieldName)) {
                    deserializedElasticPoolOperationProperties.state = reader.getString();
                } else if ("errorCode".equals(fieldName)) {
                    deserializedElasticPoolOperationProperties.errorCode = reader.getNullable(JsonReader::getInt);
                } else if ("errorDescription".equals(fieldName)) {
                    deserializedElasticPoolOperationProperties.errorDescription = reader.getString();
                } else if ("errorSeverity".equals(fieldName)) {
                    deserializedElasticPoolOperationProperties.errorSeverity = reader.getNullable(JsonReader::getInt);
                } else if ("isUserError".equals(fieldName)) {
                    deserializedElasticPoolOperationProperties.isUserError = reader.getNullable(JsonReader::getBoolean);
                } else if ("estimatedCompletionTime".equals(fieldName)) {
                    deserializedElasticPoolOperationProperties.estimatedCompletionTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("description".equals(fieldName)) {
                    deserializedElasticPoolOperationProperties.description = reader.getString();
                } else if ("isCancellable".equals(fieldName)) {
                    deserializedElasticPoolOperationProperties.isCancellable
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedElasticPoolOperationProperties;
        });
    }
}
