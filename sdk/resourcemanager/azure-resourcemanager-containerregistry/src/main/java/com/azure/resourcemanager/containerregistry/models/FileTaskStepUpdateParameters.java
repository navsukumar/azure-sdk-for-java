// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The properties of updating a task step.
 */
@Fluent
public final class FileTaskStepUpdateParameters extends TaskStepUpdateParameters {
    /*
     * The type of the step.
     */
    private StepType type = StepType.FILE_TASK;

    /*
     * The task template/definition file path relative to the source context.
     */
    private String taskFilePath;

    /*
     * The values/parameters file path relative to the source context.
     */
    private String valuesFilePath;

    /*
     * The collection of overridable values that can be passed when running a task.
     */
    private List<SetValue> values;

    /**
     * Creates an instance of FileTaskStepUpdateParameters class.
     */
    public FileTaskStepUpdateParameters() {
    }

    /**
     * Get the type property: The type of the step.
     * 
     * @return the type value.
     */
    @Override
    public StepType type() {
        return this.type;
    }

    /**
     * Get the taskFilePath property: The task template/definition file path relative to the source context.
     * 
     * @return the taskFilePath value.
     */
    public String taskFilePath() {
        return this.taskFilePath;
    }

    /**
     * Set the taskFilePath property: The task template/definition file path relative to the source context.
     * 
     * @param taskFilePath the taskFilePath value to set.
     * @return the FileTaskStepUpdateParameters object itself.
     */
    public FileTaskStepUpdateParameters withTaskFilePath(String taskFilePath) {
        this.taskFilePath = taskFilePath;
        return this;
    }

    /**
     * Get the valuesFilePath property: The values/parameters file path relative to the source context.
     * 
     * @return the valuesFilePath value.
     */
    public String valuesFilePath() {
        return this.valuesFilePath;
    }

    /**
     * Set the valuesFilePath property: The values/parameters file path relative to the source context.
     * 
     * @param valuesFilePath the valuesFilePath value to set.
     * @return the FileTaskStepUpdateParameters object itself.
     */
    public FileTaskStepUpdateParameters withValuesFilePath(String valuesFilePath) {
        this.valuesFilePath = valuesFilePath;
        return this;
    }

    /**
     * Get the values property: The collection of overridable values that can be passed when running a task.
     * 
     * @return the values value.
     */
    public List<SetValue> values() {
        return this.values;
    }

    /**
     * Set the values property: The collection of overridable values that can be passed when running a task.
     * 
     * @param values the values value to set.
     * @return the FileTaskStepUpdateParameters object itself.
     */
    public FileTaskStepUpdateParameters withValues(List<SetValue> values) {
        this.values = values;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FileTaskStepUpdateParameters withContextPath(String contextPath) {
        super.withContextPath(contextPath);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FileTaskStepUpdateParameters withContextAccessToken(String contextAccessToken) {
        super.withContextAccessToken(contextAccessToken);
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
        if (values() != null) {
            values().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("contextPath", contextPath());
        jsonWriter.writeStringField("contextAccessToken", contextAccessToken());
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("taskFilePath", this.taskFilePath);
        jsonWriter.writeStringField("valuesFilePath", this.valuesFilePath);
        jsonWriter.writeArrayField("values", this.values, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FileTaskStepUpdateParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FileTaskStepUpdateParameters if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the FileTaskStepUpdateParameters.
     */
    public static FileTaskStepUpdateParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FileTaskStepUpdateParameters deserializedFileTaskStepUpdateParameters = new FileTaskStepUpdateParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("contextPath".equals(fieldName)) {
                    deserializedFileTaskStepUpdateParameters.withContextPath(reader.getString());
                } else if ("contextAccessToken".equals(fieldName)) {
                    deserializedFileTaskStepUpdateParameters.withContextAccessToken(reader.getString());
                } else if ("type".equals(fieldName)) {
                    deserializedFileTaskStepUpdateParameters.type = StepType.fromString(reader.getString());
                } else if ("taskFilePath".equals(fieldName)) {
                    deserializedFileTaskStepUpdateParameters.taskFilePath = reader.getString();
                } else if ("valuesFilePath".equals(fieldName)) {
                    deserializedFileTaskStepUpdateParameters.valuesFilePath = reader.getString();
                } else if ("values".equals(fieldName)) {
                    List<SetValue> values = reader.readArray(reader1 -> SetValue.fromJson(reader1));
                    deserializedFileTaskStepUpdateParameters.values = values;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFileTaskStepUpdateParameters;
        });
    }
}
