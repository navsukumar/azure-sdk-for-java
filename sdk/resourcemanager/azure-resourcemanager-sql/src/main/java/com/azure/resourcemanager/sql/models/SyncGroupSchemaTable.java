// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Properties of table in sync group schema.
 */
@Fluent
public final class SyncGroupSchemaTable implements JsonSerializable<SyncGroupSchemaTable> {
    /*
     * List of columns in sync group schema.
     */
    private List<SyncGroupSchemaTableColumn> columns;

    /*
     * Quoted name of sync group schema table.
     */
    private String quotedName;

    /**
     * Creates an instance of SyncGroupSchemaTable class.
     */
    public SyncGroupSchemaTable() {
    }

    /**
     * Get the columns property: List of columns in sync group schema.
     * 
     * @return the columns value.
     */
    public List<SyncGroupSchemaTableColumn> columns() {
        return this.columns;
    }

    /**
     * Set the columns property: List of columns in sync group schema.
     * 
     * @param columns the columns value to set.
     * @return the SyncGroupSchemaTable object itself.
     */
    public SyncGroupSchemaTable withColumns(List<SyncGroupSchemaTableColumn> columns) {
        this.columns = columns;
        return this;
    }

    /**
     * Get the quotedName property: Quoted name of sync group schema table.
     * 
     * @return the quotedName value.
     */
    public String quotedName() {
        return this.quotedName;
    }

    /**
     * Set the quotedName property: Quoted name of sync group schema table.
     * 
     * @param quotedName the quotedName value to set.
     * @return the SyncGroupSchemaTable object itself.
     */
    public SyncGroupSchemaTable withQuotedName(String quotedName) {
        this.quotedName = quotedName;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (columns() != null) {
            columns().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("columns", this.columns, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("quotedName", this.quotedName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SyncGroupSchemaTable from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SyncGroupSchemaTable if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SyncGroupSchemaTable.
     */
    public static SyncGroupSchemaTable fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SyncGroupSchemaTable deserializedSyncGroupSchemaTable = new SyncGroupSchemaTable();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("columns".equals(fieldName)) {
                    List<SyncGroupSchemaTableColumn> columns
                        = reader.readArray(reader1 -> SyncGroupSchemaTableColumn.fromJson(reader1));
                    deserializedSyncGroupSchemaTable.columns = columns;
                } else if ("quotedName".equals(fieldName)) {
                    deserializedSyncGroupSchemaTable.quotedName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSyncGroupSchemaTable;
        });
    }
}
