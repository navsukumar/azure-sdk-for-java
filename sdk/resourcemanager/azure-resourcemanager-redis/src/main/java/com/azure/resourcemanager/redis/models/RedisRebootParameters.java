// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Specifies which Redis node(s) to reboot.
 */
@Fluent
public final class RedisRebootParameters implements JsonSerializable<RedisRebootParameters> {
    /*
     * Which Redis node(s) to reboot. Depending on this value data loss is possible.
     */
    private RebootType rebootType;

    /*
     * If clustering is enabled, the ID of the shard to be rebooted.
     */
    private Integer shardId;

    /*
     * A list of redis instances to reboot, specified by per-instance SSL ports or non-SSL ports.
     */
    private List<Integer> ports;

    /**
     * Creates an instance of RedisRebootParameters class.
     */
    public RedisRebootParameters() {
    }

    /**
     * Get the rebootType property: Which Redis node(s) to reboot. Depending on this value data loss is possible.
     * 
     * @return the rebootType value.
     */
    public RebootType rebootType() {
        return this.rebootType;
    }

    /**
     * Set the rebootType property: Which Redis node(s) to reboot. Depending on this value data loss is possible.
     * 
     * @param rebootType the rebootType value to set.
     * @return the RedisRebootParameters object itself.
     */
    public RedisRebootParameters withRebootType(RebootType rebootType) {
        this.rebootType = rebootType;
        return this;
    }

    /**
     * Get the shardId property: If clustering is enabled, the ID of the shard to be rebooted.
     * 
     * @return the shardId value.
     */
    public Integer shardId() {
        return this.shardId;
    }

    /**
     * Set the shardId property: If clustering is enabled, the ID of the shard to be rebooted.
     * 
     * @param shardId the shardId value to set.
     * @return the RedisRebootParameters object itself.
     */
    public RedisRebootParameters withShardId(Integer shardId) {
        this.shardId = shardId;
        return this;
    }

    /**
     * Get the ports property: A list of redis instances to reboot, specified by per-instance SSL ports or non-SSL
     * ports.
     * 
     * @return the ports value.
     */
    public List<Integer> ports() {
        return this.ports;
    }

    /**
     * Set the ports property: A list of redis instances to reboot, specified by per-instance SSL ports or non-SSL
     * ports.
     * 
     * @param ports the ports value to set.
     * @return the RedisRebootParameters object itself.
     */
    public RedisRebootParameters withPorts(List<Integer> ports) {
        this.ports = ports;
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
        jsonWriter.writeStringField("rebootType", this.rebootType == null ? null : this.rebootType.toString());
        jsonWriter.writeNumberField("shardId", this.shardId);
        jsonWriter.writeArrayField("ports", this.ports, (writer, element) -> writer.writeInt(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RedisRebootParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RedisRebootParameters if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RedisRebootParameters.
     */
    public static RedisRebootParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RedisRebootParameters deserializedRedisRebootParameters = new RedisRebootParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("rebootType".equals(fieldName)) {
                    deserializedRedisRebootParameters.rebootType = RebootType.fromString(reader.getString());
                } else if ("shardId".equals(fieldName)) {
                    deserializedRedisRebootParameters.shardId = reader.getNullable(JsonReader::getInt);
                } else if ("ports".equals(fieldName)) {
                    List<Integer> ports = reader.readArray(reader1 -> reader1.getInt());
                    deserializedRedisRebootParameters.ports = ports;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRedisRebootParameters;
        });
    }
}
