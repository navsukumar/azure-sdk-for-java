// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Uploaded Jar binary for a deployment.
 */
@Fluent
public final class JarUploadedUserSourceInfo extends UploadedUserSourceInfo {
    /*
     * Type of the source uploaded
     */
    private String type = "Jar";

    /*
     * Runtime version of the Jar file
     */
    private String runtimeVersion;

    /*
     * JVM parameter
     */
    private String jvmOptions;

    /**
     * Creates an instance of JarUploadedUserSourceInfo class.
     */
    public JarUploadedUserSourceInfo() {
    }

    /**
     * Get the type property: Type of the source uploaded.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the runtimeVersion property: Runtime version of the Jar file.
     * 
     * @return the runtimeVersion value.
     */
    public String runtimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * Set the runtimeVersion property: Runtime version of the Jar file.
     * 
     * @param runtimeVersion the runtimeVersion value to set.
     * @return the JarUploadedUserSourceInfo object itself.
     */
    public JarUploadedUserSourceInfo withRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
        return this;
    }

    /**
     * Get the jvmOptions property: JVM parameter.
     * 
     * @return the jvmOptions value.
     */
    public String jvmOptions() {
        return this.jvmOptions;
    }

    /**
     * Set the jvmOptions property: JVM parameter.
     * 
     * @param jvmOptions the jvmOptions value to set.
     * @return the JarUploadedUserSourceInfo object itself.
     */
    public JarUploadedUserSourceInfo withJvmOptions(String jvmOptions) {
        this.jvmOptions = jvmOptions;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JarUploadedUserSourceInfo withRelativePath(String relativePath) {
        super.withRelativePath(relativePath);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JarUploadedUserSourceInfo withVersion(String version) {
        super.withVersion(version);
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
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("version", version());
        jsonWriter.writeStringField("relativePath", relativePath());
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("runtimeVersion", this.runtimeVersion);
        jsonWriter.writeStringField("jvmOptions", this.jvmOptions);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of JarUploadedUserSourceInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of JarUploadedUserSourceInfo if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the JarUploadedUserSourceInfo.
     */
    public static JarUploadedUserSourceInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            JarUploadedUserSourceInfo deserializedJarUploadedUserSourceInfo = new JarUploadedUserSourceInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("version".equals(fieldName)) {
                    deserializedJarUploadedUserSourceInfo.withVersion(reader.getString());
                } else if ("relativePath".equals(fieldName)) {
                    deserializedJarUploadedUserSourceInfo.withRelativePath(reader.getString());
                } else if ("type".equals(fieldName)) {
                    deserializedJarUploadedUserSourceInfo.type = reader.getString();
                } else if ("runtimeVersion".equals(fieldName)) {
                    deserializedJarUploadedUserSourceInfo.runtimeVersion = reader.getString();
                } else if ("jvmOptions".equals(fieldName)) {
                    deserializedJarUploadedUserSourceInfo.jvmOptions = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedJarUploadedUserSourceInfo;
        });
    }
}
