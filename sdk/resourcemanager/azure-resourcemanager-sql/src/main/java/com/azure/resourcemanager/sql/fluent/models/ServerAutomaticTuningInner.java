// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.sql.models.AutomaticTuningServerMode;
import com.azure.resourcemanager.sql.models.AutomaticTuningServerOptions;
import java.io.IOException;
import java.util.Map;

/**
 * Server-level Automatic Tuning.
 */
@Fluent
public final class ServerAutomaticTuningInner extends ProxyResource {
    /*
     * Resource properties.
     */
    private AutomaticTuningServerProperties innerProperties;

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
     * Creates an instance of ServerAutomaticTuningInner class.
     */
    public ServerAutomaticTuningInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     * 
     * @return the innerProperties value.
     */
    private AutomaticTuningServerProperties innerProperties() {
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
     * Get the desiredState property: Automatic tuning desired state.
     * 
     * @return the desiredState value.
     */
    public AutomaticTuningServerMode desiredState() {
        return this.innerProperties() == null ? null : this.innerProperties().desiredState();
    }

    /**
     * Set the desiredState property: Automatic tuning desired state.
     * 
     * @param desiredState the desiredState value to set.
     * @return the ServerAutomaticTuningInner object itself.
     */
    public ServerAutomaticTuningInner withDesiredState(AutomaticTuningServerMode desiredState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AutomaticTuningServerProperties();
        }
        this.innerProperties().withDesiredState(desiredState);
        return this;
    }

    /**
     * Get the actualState property: Automatic tuning actual state.
     * 
     * @return the actualState value.
     */
    public AutomaticTuningServerMode actualState() {
        return this.innerProperties() == null ? null : this.innerProperties().actualState();
    }

    /**
     * Get the options property: Automatic tuning options definition.
     * 
     * @return the options value.
     */
    public Map<String, AutomaticTuningServerOptions> options() {
        return this.innerProperties() == null ? null : this.innerProperties().options();
    }

    /**
     * Set the options property: Automatic tuning options definition.
     * 
     * @param options the options value to set.
     * @return the ServerAutomaticTuningInner object itself.
     */
    public ServerAutomaticTuningInner withOptions(Map<String, AutomaticTuningServerOptions> options) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AutomaticTuningServerProperties();
        }
        this.innerProperties().withOptions(options);
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
     * Reads an instance of ServerAutomaticTuningInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServerAutomaticTuningInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ServerAutomaticTuningInner.
     */
    public static ServerAutomaticTuningInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServerAutomaticTuningInner deserializedServerAutomaticTuningInner = new ServerAutomaticTuningInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedServerAutomaticTuningInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedServerAutomaticTuningInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedServerAutomaticTuningInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedServerAutomaticTuningInner.innerProperties
                        = AutomaticTuningServerProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServerAutomaticTuningInner;
        });
    }
}
