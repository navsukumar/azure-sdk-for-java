// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.sql.models.ColumnDataType;
import com.azure.resourcemanager.sql.models.TableTemporalType;
import java.io.IOException;

/**
 * Database column properties.
 */
@Fluent
public final class DatabaseColumnProperties implements JsonSerializable<DatabaseColumnProperties> {
    /*
     * The column data type.
     */
    private ColumnDataType columnType;

    /*
     * The table temporal type.
     */
    private TableTemporalType temporalType;

    /*
     * Whether or not the column belongs to a memory optimized table.
     */
    private Boolean memoryOptimized;

    /*
     * Whether or not the column is computed.
     */
    private Boolean isComputed;

    /**
     * Creates an instance of DatabaseColumnProperties class.
     */
    public DatabaseColumnProperties() {
    }

    /**
     * Get the columnType property: The column data type.
     * 
     * @return the columnType value.
     */
    public ColumnDataType columnType() {
        return this.columnType;
    }

    /**
     * Set the columnType property: The column data type.
     * 
     * @param columnType the columnType value to set.
     * @return the DatabaseColumnProperties object itself.
     */
    public DatabaseColumnProperties withColumnType(ColumnDataType columnType) {
        this.columnType = columnType;
        return this;
    }

    /**
     * Get the temporalType property: The table temporal type.
     * 
     * @return the temporalType value.
     */
    public TableTemporalType temporalType() {
        return this.temporalType;
    }

    /**
     * Set the temporalType property: The table temporal type.
     * 
     * @param temporalType the temporalType value to set.
     * @return the DatabaseColumnProperties object itself.
     */
    public DatabaseColumnProperties withTemporalType(TableTemporalType temporalType) {
        this.temporalType = temporalType;
        return this;
    }

    /**
     * Get the memoryOptimized property: Whether or not the column belongs to a memory optimized table.
     * 
     * @return the memoryOptimized value.
     */
    public Boolean memoryOptimized() {
        return this.memoryOptimized;
    }

    /**
     * Set the memoryOptimized property: Whether or not the column belongs to a memory optimized table.
     * 
     * @param memoryOptimized the memoryOptimized value to set.
     * @return the DatabaseColumnProperties object itself.
     */
    public DatabaseColumnProperties withMemoryOptimized(Boolean memoryOptimized) {
        this.memoryOptimized = memoryOptimized;
        return this;
    }

    /**
     * Get the isComputed property: Whether or not the column is computed.
     * 
     * @return the isComputed value.
     */
    public Boolean isComputed() {
        return this.isComputed;
    }

    /**
     * Set the isComputed property: Whether or not the column is computed.
     * 
     * @param isComputed the isComputed value to set.
     * @return the DatabaseColumnProperties object itself.
     */
    public DatabaseColumnProperties withIsComputed(Boolean isComputed) {
        this.isComputed = isComputed;
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
        jsonWriter.writeStringField("columnType", this.columnType == null ? null : this.columnType.toString());
        jsonWriter.writeStringField("temporalType", this.temporalType == null ? null : this.temporalType.toString());
        jsonWriter.writeBooleanField("memoryOptimized", this.memoryOptimized);
        jsonWriter.writeBooleanField("isComputed", this.isComputed);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DatabaseColumnProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DatabaseColumnProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DatabaseColumnProperties.
     */
    public static DatabaseColumnProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DatabaseColumnProperties deserializedDatabaseColumnProperties = new DatabaseColumnProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("columnType".equals(fieldName)) {
                    deserializedDatabaseColumnProperties.columnType = ColumnDataType.fromString(reader.getString());
                } else if ("temporalType".equals(fieldName)) {
                    deserializedDatabaseColumnProperties.temporalType
                        = TableTemporalType.fromString(reader.getString());
                } else if ("memoryOptimized".equals(fieldName)) {
                    deserializedDatabaseColumnProperties.memoryOptimized = reader.getNullable(JsonReader::getBoolean);
                } else if ("isComputed".equals(fieldName)) {
                    deserializedDatabaseColumnProperties.isComputed = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDatabaseColumnProperties;
        });
    }
}
