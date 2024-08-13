// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.fluent.models.LoadBalancingRuleInner;
import java.io.IOException;
import java.util.List;

/**
 * Response for ListLoadBalancingRule API service call.
 */
@Fluent
public final class LoadBalancerLoadBalancingRuleListResult
    implements JsonSerializable<LoadBalancerLoadBalancingRuleListResult> {
    /*
     * A list of load balancing rules in a load balancer.
     */
    private List<LoadBalancingRuleInner> value;

    /*
     * The URL to get the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of LoadBalancerLoadBalancingRuleListResult class.
     */
    public LoadBalancerLoadBalancingRuleListResult() {
    }

    /**
     * Get the value property: A list of load balancing rules in a load balancer.
     * 
     * @return the value value.
     */
    public List<LoadBalancingRuleInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of load balancing rules in a load balancer.
     * 
     * @param value the value value to set.
     * @return the LoadBalancerLoadBalancingRuleListResult object itself.
     */
    public LoadBalancerLoadBalancingRuleListResult withValue(List<LoadBalancingRuleInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LoadBalancerLoadBalancingRuleListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LoadBalancerLoadBalancingRuleListResult if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LoadBalancerLoadBalancingRuleListResult.
     */
    public static LoadBalancerLoadBalancingRuleListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LoadBalancerLoadBalancingRuleListResult deserializedLoadBalancerLoadBalancingRuleListResult
                = new LoadBalancerLoadBalancingRuleListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<LoadBalancingRuleInner> value
                        = reader.readArray(reader1 -> LoadBalancingRuleInner.fromJson(reader1));
                    deserializedLoadBalancerLoadBalancingRuleListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedLoadBalancerLoadBalancingRuleListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLoadBalancerLoadBalancingRuleListResult;
        });
    }
}
