// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Details of single instance of redis.
 */
@Immutable
public final class RedisInstanceDetails implements JsonSerializable<RedisInstanceDetails> {
    /*
     * Redis instance SSL port.
     */
    private Integer sslPort;

    /*
     * If enableNonSslPort is true, provides Redis instance Non-SSL port.
     */
    private Integer nonSslPort;

    /*
     * If the Cache uses availability zones, specifies availability zone where this instance is located.
     */
    private String zone;

    /*
     * If clustering is enabled, the Shard ID of Redis Instance
     */
    private Integer shardId;

    /*
     * Specifies whether the instance is a primary node.
     */
    private Boolean isMaster;

    /*
     * Specifies whether the instance is a primary node.
     */
    private Boolean isPrimary;

    /**
     * Creates an instance of RedisInstanceDetails class.
     */
    public RedisInstanceDetails() {
    }

    /**
     * Get the sslPort property: Redis instance SSL port.
     * 
     * @return the sslPort value.
     */
    public Integer sslPort() {
        return this.sslPort;
    }

    /**
     * Get the nonSslPort property: If enableNonSslPort is true, provides Redis instance Non-SSL port.
     * 
     * @return the nonSslPort value.
     */
    public Integer nonSslPort() {
        return this.nonSslPort;
    }

    /**
     * Get the zone property: If the Cache uses availability zones, specifies availability zone where this instance is
     * located.
     * 
     * @return the zone value.
     */
    public String zone() {
        return this.zone;
    }

    /**
     * Get the shardId property: If clustering is enabled, the Shard ID of Redis Instance.
     * 
     * @return the shardId value.
     */
    public Integer shardId() {
        return this.shardId;
    }

    /**
     * Get the isMaster property: Specifies whether the instance is a primary node.
     * 
     * @return the isMaster value.
     */
    public Boolean isMaster() {
        return this.isMaster;
    }

    /**
     * Get the isPrimary property: Specifies whether the instance is a primary node.
     * 
     * @return the isPrimary value.
     */
    public Boolean isPrimary() {
        return this.isPrimary;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RedisInstanceDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RedisInstanceDetails if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RedisInstanceDetails.
     */
    public static RedisInstanceDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RedisInstanceDetails deserializedRedisInstanceDetails = new RedisInstanceDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sslPort".equals(fieldName)) {
                    deserializedRedisInstanceDetails.sslPort = reader.getNullable(JsonReader::getInt);
                } else if ("nonSslPort".equals(fieldName)) {
                    deserializedRedisInstanceDetails.nonSslPort = reader.getNullable(JsonReader::getInt);
                } else if ("zone".equals(fieldName)) {
                    deserializedRedisInstanceDetails.zone = reader.getString();
                } else if ("shardId".equals(fieldName)) {
                    deserializedRedisInstanceDetails.shardId = reader.getNullable(JsonReader::getInt);
                } else if ("isMaster".equals(fieldName)) {
                    deserializedRedisInstanceDetails.isMaster = reader.getNullable(JsonReader::getBoolean);
                } else if ("isPrimary".equals(fieldName)) {
                    deserializedRedisInstanceDetails.isPrimary = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRedisInstanceDetails;
        });
    }
}
