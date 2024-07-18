// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.accesscontrol.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Synapse role definition details.
 */
@Fluent
public final class SynapseRbacPermission implements JsonSerializable<SynapseRbacPermission> {
    /*
     * List of actions
     */
    private List<String> actions;

    /*
     * List of Not actions
     */
    private List<String> notActions;

    /*
     * List of data actions
     */
    private List<String> dataActions;

    /*
     * List of Not data actions
     */
    private List<String> notDataActions;

    /**
     * Creates an instance of SynapseRbacPermission class.
     */
    public SynapseRbacPermission() {
    }

    /**
     * Get the actions property: List of actions.
     * 
     * @return the actions value.
     */
    public List<String> getActions() {
        return this.actions;
    }

    /**
     * Set the actions property: List of actions.
     * 
     * @param actions the actions value to set.
     * @return the SynapseRbacPermission object itself.
     */
    public SynapseRbacPermission setActions(List<String> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Get the notActions property: List of Not actions.
     * 
     * @return the notActions value.
     */
    public List<String> getNotActions() {
        return this.notActions;
    }

    /**
     * Set the notActions property: List of Not actions.
     * 
     * @param notActions the notActions value to set.
     * @return the SynapseRbacPermission object itself.
     */
    public SynapseRbacPermission setNotActions(List<String> notActions) {
        this.notActions = notActions;
        return this;
    }

    /**
     * Get the dataActions property: List of data actions.
     * 
     * @return the dataActions value.
     */
    public List<String> getDataActions() {
        return this.dataActions;
    }

    /**
     * Set the dataActions property: List of data actions.
     * 
     * @param dataActions the dataActions value to set.
     * @return the SynapseRbacPermission object itself.
     */
    public SynapseRbacPermission setDataActions(List<String> dataActions) {
        this.dataActions = dataActions;
        return this;
    }

    /**
     * Get the notDataActions property: List of Not data actions.
     * 
     * @return the notDataActions value.
     */
    public List<String> getNotDataActions() {
        return this.notDataActions;
    }

    /**
     * Set the notDataActions property: List of Not data actions.
     * 
     * @param notDataActions the notDataActions value to set.
     * @return the SynapseRbacPermission object itself.
     */
    public SynapseRbacPermission setNotDataActions(List<String> notDataActions) {
        this.notDataActions = notDataActions;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("actions", this.actions, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("notActions", this.notActions, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("dataActions", this.dataActions, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("notDataActions", this.notDataActions,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SynapseRbacPermission from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SynapseRbacPermission if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SynapseRbacPermission.
     */
    public static SynapseRbacPermission fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SynapseRbacPermission deserializedSynapseRbacPermission = new SynapseRbacPermission();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("actions".equals(fieldName)) {
                    List<String> actions = reader.readArray(reader1 -> reader1.getString());
                    deserializedSynapseRbacPermission.actions = actions;
                } else if ("notActions".equals(fieldName)) {
                    List<String> notActions = reader.readArray(reader1 -> reader1.getString());
                    deserializedSynapseRbacPermission.notActions = notActions;
                } else if ("dataActions".equals(fieldName)) {
                    List<String> dataActions = reader.readArray(reader1 -> reader1.getString());
                    deserializedSynapseRbacPermission.dataActions = dataActions;
                } else if ("notDataActions".equals(fieldName)) {
                    List<String> notDataActions = reader.readArray(reader1 -> reader1.getString());
                    deserializedSynapseRbacPermission.notDataActions = notDataActions;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSynapseRbacPermission;
        });
    }
}
