// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.sql.fluent.models.FirewallRuleInner;
import java.io.IOException;
import java.util.List;

/**
 * A list of server firewall rules.
 */
@Fluent
public final class FirewallRuleList implements JsonSerializable<FirewallRuleList> {
    /*
     * The values property.
     */
    private List<FirewallRuleInner> values;

    /**
     * Creates an instance of FirewallRuleList class.
     */
    public FirewallRuleList() {
    }

    /**
     * Get the values property: The values property.
     * 
     * @return the values value.
     */
    public List<FirewallRuleInner> values() {
        return this.values;
    }

    /**
     * Set the values property: The values property.
     * 
     * @param values the values value to set.
     * @return the FirewallRuleList object itself.
     */
    public FirewallRuleList withValues(List<FirewallRuleInner> values) {
        this.values = values;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (values() != null) {
            values().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("values", this.values, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FirewallRuleList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FirewallRuleList if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the FirewallRuleList.
     */
    public static FirewallRuleList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FirewallRuleList deserializedFirewallRuleList = new FirewallRuleList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("values".equals(fieldName)) {
                    List<FirewallRuleInner> values = reader.readArray(reader1 -> FirewallRuleInner.fromJson(reader1));
                    deserializedFirewallRuleList.values = values;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFirewallRuleList;
        });
    }
}
