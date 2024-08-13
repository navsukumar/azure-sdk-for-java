// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes the target region information.
 */
@Fluent
public final class TargetRegion implements JsonSerializable<TargetRegion> {
    /*
     * The name of the region.
     */
    private String name;

    /*
     * The number of replicas of the Image Version to be created per region. This property is updatable.
     */
    private Integer regionalReplicaCount;

    /*
     * Specifies the storage account type to be used to store the image. This property is not updatable.
     */
    private StorageAccountType storageAccountType;

    /*
     * Optional. Allows users to provide customer managed keys for encrypting the OS and data disks in the gallery
     * artifact.
     */
    private EncryptionImages encryption;

    /*
     * Contains the flag setting to hide an image when users specify version='latest'
     */
    private Boolean excludeFromLatest;

    /**
     * Creates an instance of TargetRegion class.
     */
    public TargetRegion() {
    }

    /**
     * Get the name property: The name of the region.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the region.
     * 
     * @param name the name value to set.
     * @return the TargetRegion object itself.
     */
    public TargetRegion withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the regionalReplicaCount property: The number of replicas of the Image Version to be created per region. This
     * property is updatable.
     * 
     * @return the regionalReplicaCount value.
     */
    public Integer regionalReplicaCount() {
        return this.regionalReplicaCount;
    }

    /**
     * Set the regionalReplicaCount property: The number of replicas of the Image Version to be created per region. This
     * property is updatable.
     * 
     * @param regionalReplicaCount the regionalReplicaCount value to set.
     * @return the TargetRegion object itself.
     */
    public TargetRegion withRegionalReplicaCount(Integer regionalReplicaCount) {
        this.regionalReplicaCount = regionalReplicaCount;
        return this;
    }

    /**
     * Get the storageAccountType property: Specifies the storage account type to be used to store the image. This
     * property is not updatable.
     * 
     * @return the storageAccountType value.
     */
    public StorageAccountType storageAccountType() {
        return this.storageAccountType;
    }

    /**
     * Set the storageAccountType property: Specifies the storage account type to be used to store the image. This
     * property is not updatable.
     * 
     * @param storageAccountType the storageAccountType value to set.
     * @return the TargetRegion object itself.
     */
    public TargetRegion withStorageAccountType(StorageAccountType storageAccountType) {
        this.storageAccountType = storageAccountType;
        return this;
    }

    /**
     * Get the encryption property: Optional. Allows users to provide customer managed keys for encrypting the OS and
     * data disks in the gallery artifact.
     * 
     * @return the encryption value.
     */
    public EncryptionImages encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: Optional. Allows users to provide customer managed keys for encrypting the OS and
     * data disks in the gallery artifact.
     * 
     * @param encryption the encryption value to set.
     * @return the TargetRegion object itself.
     */
    public TargetRegion withEncryption(EncryptionImages encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the excludeFromLatest property: Contains the flag setting to hide an image when users specify
     * version='latest'.
     * 
     * @return the excludeFromLatest value.
     */
    public Boolean excludeFromLatest() {
        return this.excludeFromLatest;
    }

    /**
     * Set the excludeFromLatest property: Contains the flag setting to hide an image when users specify
     * version='latest'.
     * 
     * @param excludeFromLatest the excludeFromLatest value to set.
     * @return the TargetRegion object itself.
     */
    public TargetRegion withExcludeFromLatest(Boolean excludeFromLatest) {
        this.excludeFromLatest = excludeFromLatest;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model TargetRegion"));
        }
        if (encryption() != null) {
            encryption().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TargetRegion.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeNumberField("regionalReplicaCount", this.regionalReplicaCount);
        jsonWriter.writeStringField("storageAccountType",
            this.storageAccountType == null ? null : this.storageAccountType.toString());
        jsonWriter.writeJsonField("encryption", this.encryption);
        jsonWriter.writeBooleanField("excludeFromLatest", this.excludeFromLatest);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TargetRegion from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TargetRegion if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TargetRegion.
     */
    public static TargetRegion fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TargetRegion deserializedTargetRegion = new TargetRegion();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedTargetRegion.name = reader.getString();
                } else if ("regionalReplicaCount".equals(fieldName)) {
                    deserializedTargetRegion.regionalReplicaCount = reader.getNullable(JsonReader::getInt);
                } else if ("storageAccountType".equals(fieldName)) {
                    deserializedTargetRegion.storageAccountType = StorageAccountType.fromString(reader.getString());
                } else if ("encryption".equals(fieldName)) {
                    deserializedTargetRegion.encryption = EncryptionImages.fromJson(reader);
                } else if ("excludeFromLatest".equals(fieldName)) {
                    deserializedTargetRegion.excludeFromLatest = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTargetRegion;
        });
    }
}
