// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.servicebus.models.Encryption;
import com.azure.resourcemanager.servicebus.models.Identity;
import com.azure.resourcemanager.servicebus.models.SBSku;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * Description of a namespace resource.
 */
@Fluent
public final class SBNamespaceInner extends Resource {
    /*
     * Properties of SKU
     */
    private SBSku sku;

    /*
     * Properties of BYOK Identity description
     */
    private Identity identity;

    /*
     * The system meta data relating to this resource.
     */
    private SystemData systemData;

    /*
     * Properties of the namespace.
     */
    private SBNamespaceProperties innerProperties;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of SBNamespaceInner class.
     */
    public SBNamespaceInner() {
    }

    /**
     * Get the sku property: Properties of SKU.
     * 
     * @return the sku value.
     */
    public SBSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Properties of SKU.
     * 
     * @param sku the sku value to set.
     * @return the SBNamespaceInner object itself.
     */
    public SBNamespaceInner withSku(SBSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the identity property: Properties of BYOK Identity description.
     * 
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Properties of BYOK Identity description.
     * 
     * @param identity the identity value to set.
     * @return the SBNamespaceInner object itself.
     */
    public SBNamespaceInner withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the systemData property: The system meta data relating to this resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the innerProperties property: Properties of the namespace.
     * 
     * @return the innerProperties value.
     */
    private SBNamespaceProperties innerProperties() {
        return this.innerProperties;
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
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
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
     * {@inheritDoc}
     */
    @Override
    public SBNamespaceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SBNamespaceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the namespace.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the status property: Status of the namespace.
     * 
     * @return the status value.
     */
    public String status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the createdAt property: The time the namespace was created.
     * 
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.innerProperties() == null ? null : this.innerProperties().createdAt();
    }

    /**
     * Get the updatedAt property: The time the namespace was updated.
     * 
     * @return the updatedAt value.
     */
    public OffsetDateTime updatedAt() {
        return this.innerProperties() == null ? null : this.innerProperties().updatedAt();
    }

    /**
     * Get the serviceBusEndpoint property: Endpoint you can use to perform Service Bus operations.
     * 
     * @return the serviceBusEndpoint value.
     */
    public String serviceBusEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceBusEndpoint();
    }

    /**
     * Get the metricId property: Identifier for Azure Insights metrics.
     * 
     * @return the metricId value.
     */
    public String metricId() {
        return this.innerProperties() == null ? null : this.innerProperties().metricId();
    }

    /**
     * Get the zoneRedundant property: Enabling this property creates a Premium Service Bus Namespace in regions
     * supported availability zones.
     * 
     * @return the zoneRedundant value.
     */
    public Boolean zoneRedundant() {
        return this.innerProperties() == null ? null : this.innerProperties().zoneRedundant();
    }

    /**
     * Set the zoneRedundant property: Enabling this property creates a Premium Service Bus Namespace in regions
     * supported availability zones.
     * 
     * @param zoneRedundant the zoneRedundant value to set.
     * @return the SBNamespaceInner object itself.
     */
    public SBNamespaceInner withZoneRedundant(Boolean zoneRedundant) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SBNamespaceProperties();
        }
        this.innerProperties().withZoneRedundant(zoneRedundant);
        return this;
    }

    /**
     * Get the encryption property: Properties of BYOK Encryption description.
     * 
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.innerProperties() == null ? null : this.innerProperties().encryption();
    }

    /**
     * Set the encryption property: Properties of BYOK Encryption description.
     * 
     * @param encryption the encryption value to set.
     * @return the SBNamespaceInner object itself.
     */
    public SBNamespaceInner withEncryption(Encryption encryption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SBNamespaceProperties();
        }
        this.innerProperties().withEncryption(encryption);
        return this;
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint connections.
     * 
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpointConnections();
    }

    /**
     * Set the privateEndpointConnections property: List of private endpoint connections.
     * 
     * @param privateEndpointConnections the privateEndpointConnections value to set.
     * @return the SBNamespaceInner object itself.
     */
    public SBNamespaceInner
        withPrivateEndpointConnections(List<PrivateEndpointConnectionInner> privateEndpointConnections) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SBNamespaceProperties();
        }
        this.innerProperties().withPrivateEndpointConnections(privateEndpointConnections);
        return this;
    }

    /**
     * Get the disableLocalAuth property: This property disables SAS authentication for the Service Bus namespace.
     * 
     * @return the disableLocalAuth value.
     */
    public Boolean disableLocalAuth() {
        return this.innerProperties() == null ? null : this.innerProperties().disableLocalAuth();
    }

    /**
     * Set the disableLocalAuth property: This property disables SAS authentication for the Service Bus namespace.
     * 
     * @param disableLocalAuth the disableLocalAuth value to set.
     * @return the SBNamespaceInner object itself.
     */
    public SBNamespaceInner withDisableLocalAuth(Boolean disableLocalAuth) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SBNamespaceProperties();
        }
        this.innerProperties().withDisableLocalAuth(disableLocalAuth);
        return this;
    }

    /**
     * Get the alternateName property: Alternate name for namespace.
     * 
     * @return the alternateName value.
     */
    public String alternateName() {
        return this.innerProperties() == null ? null : this.innerProperties().alternateName();
    }

    /**
     * Set the alternateName property: Alternate name for namespace.
     * 
     * @param alternateName the alternateName value to set.
     * @return the SBNamespaceInner object itself.
     */
    public SBNamespaceInner withAlternateName(String alternateName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SBNamespaceProperties();
        }
        this.innerProperties().withAlternateName(alternateName);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
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
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("sku", this.sku);
        jsonWriter.writeJsonField("identity", this.identity);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SBNamespaceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SBNamespaceInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SBNamespaceInner.
     */
    public static SBNamespaceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SBNamespaceInner deserializedSBNamespaceInner = new SBNamespaceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedSBNamespaceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedSBNamespaceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedSBNamespaceInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedSBNamespaceInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedSBNamespaceInner.withTags(tags);
                } else if ("sku".equals(fieldName)) {
                    deserializedSBNamespaceInner.sku = SBSku.fromJson(reader);
                } else if ("identity".equals(fieldName)) {
                    deserializedSBNamespaceInner.identity = Identity.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedSBNamespaceInner.systemData = SystemData.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedSBNamespaceInner.innerProperties = SBNamespaceProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSBNamespaceInner;
        });
    }
}
