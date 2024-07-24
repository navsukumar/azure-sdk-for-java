// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Diagnostics data column.
 */
@Fluent
public final class DiagnosticDataTableResponseColumn implements JsonSerializable<DiagnosticDataTableResponseColumn> {
    /*
     * Column name
     */
    private String columnName;

    /*
     * Data type of the column
     */
    private String dataType;

    /*
     * Column type
     */
    private String columnType;

    /**
     * Creates an instance of DiagnosticDataTableResponseColumn class.
     */
    public DiagnosticDataTableResponseColumn() {
    }

    /**
     * Get the columnName property: Column name.
     * 
     * @return the columnName value.
     */
    public String columnName() {
        return this.columnName;
    }

    /**
     * Set the columnName property: Column name.
     * 
     * @param columnName the columnName value to set.
     * @return the DiagnosticDataTableResponseColumn object itself.
     */
    public DiagnosticDataTableResponseColumn withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * Get the dataType property: Data type of the column.
     * 
     * @return the dataType value.
     */
    public String dataType() {
        return this.dataType;
    }

    /**
     * Set the dataType property: Data type of the column.
     * 
     * @param dataType the dataType value to set.
     * @return the DiagnosticDataTableResponseColumn object itself.
     */
    public DiagnosticDataTableResponseColumn withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * Get the columnType property: Column type.
     * 
     * @return the columnType value.
     */
    public String columnType() {
        return this.columnType;
    }

    /**
     * Set the columnType property: Column type.
     * 
     * @param columnType the columnType value to set.
     * @return the DiagnosticDataTableResponseColumn object itself.
     */
    public DiagnosticDataTableResponseColumn withColumnType(String columnType) {
        this.columnType = columnType;
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
        jsonWriter.writeStringField("columnName", this.columnName);
        jsonWriter.writeStringField("dataType", this.dataType);
        jsonWriter.writeStringField("columnType", this.columnType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DiagnosticDataTableResponseColumn from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DiagnosticDataTableResponseColumn if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DiagnosticDataTableResponseColumn.
     */
    public static DiagnosticDataTableResponseColumn fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DiagnosticDataTableResponseColumn deserializedDiagnosticDataTableResponseColumn
                = new DiagnosticDataTableResponseColumn();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("columnName".equals(fieldName)) {
                    deserializedDiagnosticDataTableResponseColumn.columnName = reader.getString();
                } else if ("dataType".equals(fieldName)) {
                    deserializedDiagnosticDataTableResponseColumn.dataType = reader.getString();
                } else if ("columnType".equals(fieldName)) {
                    deserializedDiagnosticDataTableResponseColumn.columnType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDiagnosticDataTableResponseColumn;
        });
    }
}
