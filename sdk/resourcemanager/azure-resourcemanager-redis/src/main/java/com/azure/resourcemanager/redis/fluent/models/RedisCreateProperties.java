// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.redis.models.PublicNetworkAccess;
import com.azure.resourcemanager.redis.models.RedisCommonProperties;
import com.azure.resourcemanager.redis.models.RedisConfiguration;
import com.azure.resourcemanager.redis.models.Sku;
import com.azure.resourcemanager.redis.models.TlsVersion;
import com.azure.resourcemanager.redis.models.UpdateChannel;
import java.io.IOException;
import java.util.Map;

/**
 * Properties supplied to Create Redis operation.
 */
@Fluent
public class RedisCreateProperties extends RedisCommonProperties {
    /*
     * The SKU of the Redis cache to deploy.
     */
    private Sku sku;

    /*
     * The full resource ID of a subnet in a virtual network to deploy the Redis cache in. Example format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/Microsoft.{Network|ClassicNetwork}/
     * VirtualNetworks/vnet1/subnets/subnet1
     */
    private String subnetId;

    /*
     * Static IP address. Optionally, may be specified when deploying a Redis cache inside an existing Azure Virtual
     * Network; auto assigned by default.
     */
    private String staticIp;

    /**
     * Creates an instance of RedisCreateProperties class.
     */
    public RedisCreateProperties() {
    }

    /**
     * Get the sku property: The SKU of the Redis cache to deploy.
     * 
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU of the Redis cache to deploy.
     * 
     * @param sku the sku value to set.
     * @return the RedisCreateProperties object itself.
     */
    public RedisCreateProperties withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the subnetId property: The full resource ID of a subnet in a virtual network to deploy the Redis cache in.
     * Example format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/Microsoft.{Network|ClassicNetwork}/VirtualNetworks/vnet1/subnets/subnet1.
     * 
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the subnetId property: The full resource ID of a subnet in a virtual network to deploy the Redis cache in.
     * Example format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/Microsoft.{Network|ClassicNetwork}/VirtualNetworks/vnet1/subnets/subnet1.
     * 
     * @param subnetId the subnetId value to set.
     * @return the RedisCreateProperties object itself.
     */
    public RedisCreateProperties withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Get the staticIp property: Static IP address. Optionally, may be specified when deploying a Redis cache inside an
     * existing Azure Virtual Network; auto assigned by default.
     * 
     * @return the staticIp value.
     */
    public String staticIp() {
        return this.staticIp;
    }

    /**
     * Set the staticIp property: Static IP address. Optionally, may be specified when deploying a Redis cache inside an
     * existing Azure Virtual Network; auto assigned by default.
     * 
     * @param staticIp the staticIp value to set.
     * @return the RedisCreateProperties object itself.
     */
    public RedisCreateProperties withStaticIp(String staticIp) {
        this.staticIp = staticIp;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedisCreateProperties withRedisConfiguration(RedisConfiguration redisConfiguration) {
        super.withRedisConfiguration(redisConfiguration);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedisCreateProperties withRedisVersion(String redisVersion) {
        super.withRedisVersion(redisVersion);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedisCreateProperties withEnableNonSslPort(Boolean enableNonSslPort) {
        super.withEnableNonSslPort(enableNonSslPort);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedisCreateProperties withReplicasPerMaster(Integer replicasPerMaster) {
        super.withReplicasPerMaster(replicasPerMaster);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedisCreateProperties withReplicasPerPrimary(Integer replicasPerPrimary) {
        super.withReplicasPerPrimary(replicasPerPrimary);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedisCreateProperties withTenantSettings(Map<String, String> tenantSettings) {
        super.withTenantSettings(tenantSettings);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedisCreateProperties withShardCount(Integer shardCount) {
        super.withShardCount(shardCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedisCreateProperties withMinimumTlsVersion(TlsVersion minimumTlsVersion) {
        super.withMinimumTlsVersion(minimumTlsVersion);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedisCreateProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        super.withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedisCreateProperties withUpdateChannel(UpdateChannel updateChannel) {
        super.withUpdateChannel(updateChannel);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedisCreateProperties withDisableAccessKeyAuthentication(Boolean disableAccessKeyAuthentication) {
        super.withDisableAccessKeyAuthentication(disableAccessKeyAuthentication);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property sku in model RedisCreateProperties"));
        } else {
            sku().validate();
        }
        if (redisConfiguration() != null) {
            redisConfiguration().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RedisCreateProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("redisConfiguration", redisConfiguration());
        jsonWriter.writeStringField("redisVersion", redisVersion());
        jsonWriter.writeBooleanField("enableNonSslPort", enableNonSslPort());
        jsonWriter.writeNumberField("replicasPerMaster", replicasPerMaster());
        jsonWriter.writeNumberField("replicasPerPrimary", replicasPerPrimary());
        jsonWriter.writeMapField("tenantSettings", tenantSettings(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeNumberField("shardCount", shardCount());
        jsonWriter.writeStringField("minimumTlsVersion",
            minimumTlsVersion() == null ? null : minimumTlsVersion().toString());
        jsonWriter.writeStringField("publicNetworkAccess",
            publicNetworkAccess() == null ? null : publicNetworkAccess().toString());
        jsonWriter.writeStringField("updateChannel", updateChannel() == null ? null : updateChannel().toString());
        jsonWriter.writeBooleanField("disableAccessKeyAuthentication", disableAccessKeyAuthentication());
        jsonWriter.writeJsonField("sku", this.sku);
        jsonWriter.writeStringField("subnetId", this.subnetId);
        jsonWriter.writeStringField("staticIP", this.staticIp);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RedisCreateProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RedisCreateProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RedisCreateProperties.
     */
    public static RedisCreateProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RedisCreateProperties deserializedRedisCreateProperties = new RedisCreateProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("redisConfiguration".equals(fieldName)) {
                    deserializedRedisCreateProperties.withRedisConfiguration(RedisConfiguration.fromJson(reader));
                } else if ("redisVersion".equals(fieldName)) {
                    deserializedRedisCreateProperties.withRedisVersion(reader.getString());
                } else if ("enableNonSslPort".equals(fieldName)) {
                    deserializedRedisCreateProperties.withEnableNonSslPort(reader.getNullable(JsonReader::getBoolean));
                } else if ("replicasPerMaster".equals(fieldName)) {
                    deserializedRedisCreateProperties.withReplicasPerMaster(reader.getNullable(JsonReader::getInt));
                } else if ("replicasPerPrimary".equals(fieldName)) {
                    deserializedRedisCreateProperties.withReplicasPerPrimary(reader.getNullable(JsonReader::getInt));
                } else if ("tenantSettings".equals(fieldName)) {
                    Map<String, String> tenantSettings = reader.readMap(reader1 -> reader1.getString());
                    deserializedRedisCreateProperties.withTenantSettings(tenantSettings);
                } else if ("shardCount".equals(fieldName)) {
                    deserializedRedisCreateProperties.withShardCount(reader.getNullable(JsonReader::getInt));
                } else if ("minimumTlsVersion".equals(fieldName)) {
                    deserializedRedisCreateProperties.withMinimumTlsVersion(TlsVersion.fromString(reader.getString()));
                } else if ("publicNetworkAccess".equals(fieldName)) {
                    deserializedRedisCreateProperties
                        .withPublicNetworkAccess(PublicNetworkAccess.fromString(reader.getString()));
                } else if ("updateChannel".equals(fieldName)) {
                    deserializedRedisCreateProperties.withUpdateChannel(UpdateChannel.fromString(reader.getString()));
                } else if ("disableAccessKeyAuthentication".equals(fieldName)) {
                    deserializedRedisCreateProperties
                        .withDisableAccessKeyAuthentication(reader.getNullable(JsonReader::getBoolean));
                } else if ("sku".equals(fieldName)) {
                    deserializedRedisCreateProperties.sku = Sku.fromJson(reader);
                } else if ("subnetId".equals(fieldName)) {
                    deserializedRedisCreateProperties.subnetId = reader.getString();
                } else if ("staticIP".equals(fieldName)) {
                    deserializedRedisCreateProperties.staticIp = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRedisCreateProperties;
        });
    }
}
