// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The configuration settings of the storage of the tokens if a file system is used.
 */
@Fluent
public final class FileSystemTokenStore implements JsonSerializable<FileSystemTokenStore> {
    /*
     * The directory in which the tokens will be stored.
     */
    private String directory;

    /**
     * Creates an instance of FileSystemTokenStore class.
     */
    public FileSystemTokenStore() {
    }

    /**
     * Get the directory property: The directory in which the tokens will be stored.
     * 
     * @return the directory value.
     */
    public String directory() {
        return this.directory;
    }

    /**
     * Set the directory property: The directory in which the tokens will be stored.
     * 
     * @param directory the directory value to set.
     * @return the FileSystemTokenStore object itself.
     */
    public FileSystemTokenStore withDirectory(String directory) {
        this.directory = directory;
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
        jsonWriter.writeStringField("directory", this.directory);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FileSystemTokenStore from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FileSystemTokenStore if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the FileSystemTokenStore.
     */
    public static FileSystemTokenStore fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FileSystemTokenStore deserializedFileSystemTokenStore = new FileSystemTokenStore();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("directory".equals(fieldName)) {
                    deserializedFileSystemTokenStore.directory = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFileSystemTokenStore;
        });
    }
}
