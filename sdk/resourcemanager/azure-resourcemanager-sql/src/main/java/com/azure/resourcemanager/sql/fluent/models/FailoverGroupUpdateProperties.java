// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.sql.models.FailoverGroupReadOnlyEndpoint;
import com.azure.resourcemanager.sql.models.FailoverGroupReadWriteEndpoint;
import java.io.IOException;
import java.util.List;

/**
 * Properties of a failover group update.
 */
@Fluent
public final class FailoverGroupUpdateProperties implements JsonSerializable<FailoverGroupUpdateProperties> {
    /*
     * Read-write endpoint of the failover group instance.
     */
    private FailoverGroupReadWriteEndpoint readWriteEndpoint;

    /*
     * Read-only endpoint of the failover group instance.
     */
    private FailoverGroupReadOnlyEndpoint readOnlyEndpoint;

    /*
     * List of databases in the failover group.
     */
    private List<String> databases;

    /**
     * Creates an instance of FailoverGroupUpdateProperties class.
     */
    public FailoverGroupUpdateProperties() {
    }

    /**
     * Get the readWriteEndpoint property: Read-write endpoint of the failover group instance.
     * 
     * @return the readWriteEndpoint value.
     */
    public FailoverGroupReadWriteEndpoint readWriteEndpoint() {
        return this.readWriteEndpoint;
    }

    /**
     * Set the readWriteEndpoint property: Read-write endpoint of the failover group instance.
     * 
     * @param readWriteEndpoint the readWriteEndpoint value to set.
     * @return the FailoverGroupUpdateProperties object itself.
     */
    public FailoverGroupUpdateProperties withReadWriteEndpoint(FailoverGroupReadWriteEndpoint readWriteEndpoint) {
        this.readWriteEndpoint = readWriteEndpoint;
        return this;
    }

    /**
     * Get the readOnlyEndpoint property: Read-only endpoint of the failover group instance.
     * 
     * @return the readOnlyEndpoint value.
     */
    public FailoverGroupReadOnlyEndpoint readOnlyEndpoint() {
        return this.readOnlyEndpoint;
    }

    /**
     * Set the readOnlyEndpoint property: Read-only endpoint of the failover group instance.
     * 
     * @param readOnlyEndpoint the readOnlyEndpoint value to set.
     * @return the FailoverGroupUpdateProperties object itself.
     */
    public FailoverGroupUpdateProperties withReadOnlyEndpoint(FailoverGroupReadOnlyEndpoint readOnlyEndpoint) {
        this.readOnlyEndpoint = readOnlyEndpoint;
        return this;
    }

    /**
     * Get the databases property: List of databases in the failover group.
     * 
     * @return the databases value.
     */
    public List<String> databases() {
        return this.databases;
    }

    /**
     * Set the databases property: List of databases in the failover group.
     * 
     * @param databases the databases value to set.
     * @return the FailoverGroupUpdateProperties object itself.
     */
    public FailoverGroupUpdateProperties withDatabases(List<String> databases) {
        this.databases = databases;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (readWriteEndpoint() != null) {
            readWriteEndpoint().validate();
        }
        if (readOnlyEndpoint() != null) {
            readOnlyEndpoint().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("readWriteEndpoint", this.readWriteEndpoint);
        jsonWriter.writeJsonField("readOnlyEndpoint", this.readOnlyEndpoint);
        jsonWriter.writeArrayField("databases", this.databases, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FailoverGroupUpdateProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FailoverGroupUpdateProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the FailoverGroupUpdateProperties.
     */
    public static FailoverGroupUpdateProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FailoverGroupUpdateProperties deserializedFailoverGroupUpdateProperties
                = new FailoverGroupUpdateProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("readWriteEndpoint".equals(fieldName)) {
                    deserializedFailoverGroupUpdateProperties.readWriteEndpoint
                        = FailoverGroupReadWriteEndpoint.fromJson(reader);
                } else if ("readOnlyEndpoint".equals(fieldName)) {
                    deserializedFailoverGroupUpdateProperties.readOnlyEndpoint
                        = FailoverGroupReadOnlyEndpoint.fromJson(reader);
                } else if ("databases".equals(fieldName)) {
                    List<String> databases = reader.readArray(reader1 -> reader1.getString());
                    deserializedFailoverGroupUpdateProperties.databases = databases;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFailoverGroupUpdateProperties;
        });
    }
}
