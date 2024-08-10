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
 * Column definition.
 */
@Fluent
public final class DataTableResponseColumn implements JsonSerializable<DataTableResponseColumn> {
    /*
     * Name of the column
     */
    private String columnName;

    /*
     * Data type which looks like 'String' or 'Int32'.
     */
    private String dataType;

    /*
     * Column Type
     */
    private String columnType;

    /**
     * Creates an instance of DataTableResponseColumn class.
     */
    public DataTableResponseColumn() {
    }

    /**
     * Get the columnName property: Name of the column.
     * 
     * @return the columnName value.
     */
    public String columnName() {
        return this.columnName;
    }

    /**
     * Set the columnName property: Name of the column.
     * 
     * @param columnName the columnName value to set.
     * @return the DataTableResponseColumn object itself.
     */
    public DataTableResponseColumn withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * Get the dataType property: Data type which looks like 'String' or 'Int32'.
     * 
     * @return the dataType value.
     */
    public String dataType() {
        return this.dataType;
    }

    /**
     * Set the dataType property: Data type which looks like 'String' or 'Int32'.
     * 
     * @param dataType the dataType value to set.
     * @return the DataTableResponseColumn object itself.
     */
    public DataTableResponseColumn withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * Get the columnType property: Column Type.
     * 
     * @return the columnType value.
     */
    public String columnType() {
        return this.columnType;
    }

    /**
     * Set the columnType property: Column Type.
     * 
     * @param columnType the columnType value to set.
     * @return the DataTableResponseColumn object itself.
     */
    public DataTableResponseColumn withColumnType(String columnType) {
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
     * Reads an instance of DataTableResponseColumn from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataTableResponseColumn if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DataTableResponseColumn.
     */
    public static DataTableResponseColumn fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataTableResponseColumn deserializedDataTableResponseColumn = new DataTableResponseColumn();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("columnName".equals(fieldName)) {
                    deserializedDataTableResponseColumn.columnName = reader.getString();
                } else if ("dataType".equals(fieldName)) {
                    deserializedDataTableResponseColumn.dataType = reader.getString();
                } else if ("columnType".equals(fieldName)) {
                    deserializedDataTableResponseColumn.columnType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataTableResponseColumn;
        });
    }
}
