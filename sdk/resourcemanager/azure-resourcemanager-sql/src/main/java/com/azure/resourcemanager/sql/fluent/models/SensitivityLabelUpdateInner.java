// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.sql.models.SensitivityLabelUpdateKind;
import java.io.IOException;

/**
 * A sensitivity label update operation.
 */
@Fluent
public final class SensitivityLabelUpdateInner extends ProxyResource {
    /*
     * Resource properties.
     */
    private SensitivityLabelUpdatePropertiesInner innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of SensitivityLabelUpdateInner class.
     */
    public SensitivityLabelUpdateInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     * 
     * @return the innerProperties value.
     */
    private SensitivityLabelUpdatePropertiesInner innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the op property: The op property.
     * 
     * @return the op value.
     */
    public SensitivityLabelUpdateKind op() {
        return this.innerProperties() == null ? null : this.innerProperties().op();
    }

    /**
     * Set the op property: The op property.
     * 
     * @param op the op value to set.
     * @return the SensitivityLabelUpdateInner object itself.
     */
    public SensitivityLabelUpdateInner withOp(SensitivityLabelUpdateKind op) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SensitivityLabelUpdatePropertiesInner();
        }
        this.innerProperties().withOp(op);
        return this;
    }

    /**
     * Get the schema property: Schema name of the column to update.
     * 
     * @return the schema value.
     */
    public String schema() {
        return this.innerProperties() == null ? null : this.innerProperties().schema();
    }

    /**
     * Set the schema property: Schema name of the column to update.
     * 
     * @param schema the schema value to set.
     * @return the SensitivityLabelUpdateInner object itself.
     */
    public SensitivityLabelUpdateInner withSchema(String schema) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SensitivityLabelUpdatePropertiesInner();
        }
        this.innerProperties().withSchema(schema);
        return this;
    }

    /**
     * Get the table property: Table name of the column to update.
     * 
     * @return the table value.
     */
    public String table() {
        return this.innerProperties() == null ? null : this.innerProperties().table();
    }

    /**
     * Set the table property: Table name of the column to update.
     * 
     * @param table the table value to set.
     * @return the SensitivityLabelUpdateInner object itself.
     */
    public SensitivityLabelUpdateInner withTable(String table) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SensitivityLabelUpdatePropertiesInner();
        }
        this.innerProperties().withTable(table);
        return this;
    }

    /**
     * Get the column property: Column name to update.
     * 
     * @return the column value.
     */
    public String column() {
        return this.innerProperties() == null ? null : this.innerProperties().column();
    }

    /**
     * Set the column property: Column name to update.
     * 
     * @param column the column value to set.
     * @return the SensitivityLabelUpdateInner object itself.
     */
    public SensitivityLabelUpdateInner withColumn(String column) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SensitivityLabelUpdatePropertiesInner();
        }
        this.innerProperties().withColumn(column);
        return this;
    }

    /**
     * Get the sensitivityLabel property: The sensitivity label information to apply on a column.
     * 
     * @return the sensitivityLabel value.
     */
    public SensitivityLabelInner sensitivityLabel() {
        return this.innerProperties() == null ? null : this.innerProperties().sensitivityLabel();
    }

    /**
     * Set the sensitivityLabel property: The sensitivity label information to apply on a column.
     * 
     * @param sensitivityLabel the sensitivityLabel value to set.
     * @return the SensitivityLabelUpdateInner object itself.
     */
    public SensitivityLabelUpdateInner withSensitivityLabel(SensitivityLabelInner sensitivityLabel) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SensitivityLabelUpdatePropertiesInner();
        }
        this.innerProperties().withSensitivityLabel(sensitivityLabel);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SensitivityLabelUpdateInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SensitivityLabelUpdateInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SensitivityLabelUpdateInner.
     */
    public static SensitivityLabelUpdateInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SensitivityLabelUpdateInner deserializedSensitivityLabelUpdateInner = new SensitivityLabelUpdateInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedSensitivityLabelUpdateInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedSensitivityLabelUpdateInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedSensitivityLabelUpdateInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedSensitivityLabelUpdateInner.innerProperties
                        = SensitivityLabelUpdatePropertiesInner.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSensitivityLabelUpdateInner;
        });
    }
}
