// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.netapp.fluent.models.AccountProperties;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * NetApp account patch resource.
 */
@Fluent
public final class NetAppAccountPatch extends Resource {
    /*
     * NetApp Account properties
     */
    private AccountProperties innerProperties;

    /*
     * The identity used for the resource.
     */
    private ManagedServiceIdentity identity;

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
     * Creates an instance of NetAppAccountPatch class.
     */
    public NetAppAccountPatch() {
    }

    /**
     * Get the innerProperties property: NetApp Account properties.
     * 
     * @return the innerProperties value.
     */
    private AccountProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the identity property: The identity used for the resource.
     * 
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity used for the resource.
     * 
     * @param identity the identity value to set.
     * @return the NetAppAccountPatch object itself.
     */
    public NetAppAccountPatch withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
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
    public NetAppAccountPatch withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetAppAccountPatch withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: Azure lifecycle management.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the activeDirectories property: Active Directories.
     * 
     * @return the activeDirectories value.
     */
    public List<ActiveDirectory> activeDirectories() {
        return this.innerProperties() == null ? null : this.innerProperties().activeDirectories();
    }

    /**
     * Set the activeDirectories property: Active Directories.
     * 
     * @param activeDirectories the activeDirectories value to set.
     * @return the NetAppAccountPatch object itself.
     */
    public NetAppAccountPatch withActiveDirectories(List<ActiveDirectory> activeDirectories) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccountProperties();
        }
        this.innerProperties().withActiveDirectories(activeDirectories);
        return this;
    }

    /**
     * Get the encryption property: Encryption settings.
     * 
     * @return the encryption value.
     */
    public AccountEncryption encryption() {
        return this.innerProperties() == null ? null : this.innerProperties().encryption();
    }

    /**
     * Set the encryption property: Encryption settings.
     * 
     * @param encryption the encryption value to set.
     * @return the NetAppAccountPatch object itself.
     */
    public NetAppAccountPatch withEncryption(AccountEncryption encryption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccountProperties();
        }
        this.innerProperties().withEncryption(encryption);
        return this;
    }

    /**
     * Get the disableShowmount property: Shows the status of disableShowmount for all volumes under the subscription,
     * null equals false.
     * 
     * @return the disableShowmount value.
     */
    public Boolean disableShowmount() {
        return this.innerProperties() == null ? null : this.innerProperties().disableShowmount();
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
        if (identity() != null) {
            identity().validate();
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
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeJsonField("identity", this.identity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetAppAccountPatch from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetAppAccountPatch if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the NetAppAccountPatch.
     */
    public static NetAppAccountPatch fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetAppAccountPatch deserializedNetAppAccountPatch = new NetAppAccountPatch();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedNetAppAccountPatch.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedNetAppAccountPatch.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedNetAppAccountPatch.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedNetAppAccountPatch.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedNetAppAccountPatch.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedNetAppAccountPatch.innerProperties = AccountProperties.fromJson(reader);
                } else if ("identity".equals(fieldName)) {
                    deserializedNetAppAccountPatch.identity = ManagedServiceIdentity.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetAppAccountPatch;
        });
    }
}
