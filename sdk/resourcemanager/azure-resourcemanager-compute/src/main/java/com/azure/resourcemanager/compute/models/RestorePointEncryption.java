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

/**
 * Encryption at rest settings for disk restore point. It is an optional property that can be specified in the input
 * while creating a restore point.
 */
@Fluent
public final class RestorePointEncryption implements JsonSerializable<RestorePointEncryption> {
    /*
     * Describes the parameter of customer managed disk encryption set resource id that can be specified for disk.
     * **Note:** The disk encryption set resource id can only be specified for managed disk. Please refer
     * https://aka.ms/mdssewithcmkoverview for more details.
     */
    private DiskEncryptionSetParameters diskEncryptionSet;

    /*
     * The type of key used to encrypt the data of the disk restore point.
     */
    private RestorePointEncryptionType type;

    /**
     * Creates an instance of RestorePointEncryption class.
     */
    public RestorePointEncryption() {
    }

    /**
     * Get the diskEncryptionSet property: Describes the parameter of customer managed disk encryption set resource id
     * that can be specified for disk. **Note:** The disk encryption set resource id can only be specified for managed
     * disk. Please refer https://aka.ms/mdssewithcmkoverview for more details.
     * 
     * @return the diskEncryptionSet value.
     */
    public DiskEncryptionSetParameters diskEncryptionSet() {
        return this.diskEncryptionSet;
    }

    /**
     * Set the diskEncryptionSet property: Describes the parameter of customer managed disk encryption set resource id
     * that can be specified for disk. **Note:** The disk encryption set resource id can only be specified for managed
     * disk. Please refer https://aka.ms/mdssewithcmkoverview for more details.
     * 
     * @param diskEncryptionSet the diskEncryptionSet value to set.
     * @return the RestorePointEncryption object itself.
     */
    public RestorePointEncryption withDiskEncryptionSet(DiskEncryptionSetParameters diskEncryptionSet) {
        this.diskEncryptionSet = diskEncryptionSet;
        return this;
    }

    /**
     * Get the type property: The type of key used to encrypt the data of the disk restore point.
     * 
     * @return the type value.
     */
    public RestorePointEncryptionType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of key used to encrypt the data of the disk restore point.
     * 
     * @param type the type value to set.
     * @return the RestorePointEncryption object itself.
     */
    public RestorePointEncryption withType(RestorePointEncryptionType type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (diskEncryptionSet() != null) {
            diskEncryptionSet().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("diskEncryptionSet", this.diskEncryptionSet);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RestorePointEncryption from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RestorePointEncryption if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RestorePointEncryption.
     */
    public static RestorePointEncryption fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RestorePointEncryption deserializedRestorePointEncryption = new RestorePointEncryption();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("diskEncryptionSet".equals(fieldName)) {
                    deserializedRestorePointEncryption.diskEncryptionSet = DiskEncryptionSetParameters.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    deserializedRestorePointEncryption.type = RestorePointEncryptionType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRestorePointEncryption;
        });
    }
}
