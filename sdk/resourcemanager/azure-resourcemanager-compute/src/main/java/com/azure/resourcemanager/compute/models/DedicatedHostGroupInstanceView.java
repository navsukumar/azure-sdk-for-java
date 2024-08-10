// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The DedicatedHostGroupInstanceView model.
 */
@Fluent
public final class DedicatedHostGroupInstanceView implements JsonSerializable<DedicatedHostGroupInstanceView> {
    /*
     * List of instance view of the dedicated hosts under the dedicated host group.
     */
    private List<DedicatedHostInstanceViewWithName> hosts;

    /**
     * Creates an instance of DedicatedHostGroupInstanceView class.
     */
    public DedicatedHostGroupInstanceView() {
    }

    /**
     * Get the hosts property: List of instance view of the dedicated hosts under the dedicated host group.
     * 
     * @return the hosts value.
     */
    public List<DedicatedHostInstanceViewWithName> hosts() {
        return this.hosts;
    }

    /**
     * Set the hosts property: List of instance view of the dedicated hosts under the dedicated host group.
     * 
     * @param hosts the hosts value to set.
     * @return the DedicatedHostGroupInstanceView object itself.
     */
    public DedicatedHostGroupInstanceView withHosts(List<DedicatedHostInstanceViewWithName> hosts) {
        this.hosts = hosts;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hosts() != null) {
            hosts().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("hosts", this.hosts, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DedicatedHostGroupInstanceView from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DedicatedHostGroupInstanceView if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DedicatedHostGroupInstanceView.
     */
    public static DedicatedHostGroupInstanceView fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DedicatedHostGroupInstanceView deserializedDedicatedHostGroupInstanceView
                = new DedicatedHostGroupInstanceView();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("hosts".equals(fieldName)) {
                    List<DedicatedHostInstanceViewWithName> hosts
                        = reader.readArray(reader1 -> DedicatedHostInstanceViewWithName.fromJson(reader1));
                    deserializedDedicatedHostGroupInstanceView.hosts = hosts;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDedicatedHostGroupInstanceView;
        });
    }
}
