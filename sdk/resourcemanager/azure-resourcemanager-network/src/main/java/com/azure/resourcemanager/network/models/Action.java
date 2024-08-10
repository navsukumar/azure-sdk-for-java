// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Action to be taken on a route matching a RouteMap criterion.
 */
@Fluent
public final class Action implements JsonSerializable<Action> {
    /*
     * Type of action to be taken. Supported types are 'Remove', 'Add', 'Replace', and 'Drop.'
     */
    private RouteMapActionType type;

    /*
     * List of parameters relevant to the action.For instance if type is drop then parameters has list of prefixes to be
     * dropped.If type is add, parameters would have list of ASN numbers to be added
     */
    private List<Parameter> parameters;

    /**
     * Creates an instance of Action class.
     */
    public Action() {
    }

    /**
     * Get the type property: Type of action to be taken. Supported types are 'Remove', 'Add', 'Replace', and 'Drop.'.
     * 
     * @return the type value.
     */
    public RouteMapActionType type() {
        return this.type;
    }

    /**
     * Set the type property: Type of action to be taken. Supported types are 'Remove', 'Add', 'Replace', and 'Drop.'.
     * 
     * @param type the type value to set.
     * @return the Action object itself.
     */
    public Action withType(RouteMapActionType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the parameters property: List of parameters relevant to the action.For instance if type is drop then
     * parameters has list of prefixes to be dropped.If type is add, parameters would have list of ASN numbers to be
     * added.
     * 
     * @return the parameters value.
     */
    public List<Parameter> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: List of parameters relevant to the action.For instance if type is drop then
     * parameters has list of prefixes to be dropped.If type is add, parameters would have list of ASN numbers to be
     * added.
     * 
     * @param parameters the parameters value to set.
     * @return the Action object itself.
     */
    public Action withParameters(List<Parameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (parameters() != null) {
            parameters().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeArrayField("parameters", this.parameters, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Action from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Action if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IOException If an error occurs while reading the Action.
     */
    public static Action fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Action deserializedAction = new Action();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedAction.type = RouteMapActionType.fromString(reader.getString());
                } else if ("parameters".equals(fieldName)) {
                    List<Parameter> parameters = reader.readArray(reader1 -> Parameter.fromJson(reader1));
                    deserializedAction.parameters = parameters;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAction;
        });
    }
}
