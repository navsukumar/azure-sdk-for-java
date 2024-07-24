// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * StorageSetting
 * 
 * Storage setting.
 */
@Fluent
public final class StorageSetting implements JsonSerializable<StorageSetting> {
    /*
     * Gets or sets the type of the datastore.
     */
    private StorageSettingStoreTypes datastoreType;

    /*
     * Gets or sets the type.
     */
    private StorageSettingTypes type;

    /**
     * Creates an instance of StorageSetting class.
     */
    public StorageSetting() {
    }

    /**
     * Get the datastoreType property: Gets or sets the type of the datastore.
     * 
     * @return the datastoreType value.
     */
    public StorageSettingStoreTypes datastoreType() {
        return this.datastoreType;
    }

    /**
     * Set the datastoreType property: Gets or sets the type of the datastore.
     * 
     * @param datastoreType the datastoreType value to set.
     * @return the StorageSetting object itself.
     */
    public StorageSetting withDatastoreType(StorageSettingStoreTypes datastoreType) {
        this.datastoreType = datastoreType;
        return this;
    }

    /**
     * Get the type property: Gets or sets the type.
     * 
     * @return the type value.
     */
    public StorageSettingTypes type() {
        return this.type;
    }

    /**
     * Set the type property: Gets or sets the type.
     * 
     * @param type the type value to set.
     * @return the StorageSetting object itself.
     */
    public StorageSetting withType(StorageSettingTypes type) {
        this.type = type;
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
        jsonWriter.writeStringField("datastoreType", this.datastoreType == null ? null : this.datastoreType.toString());
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StorageSetting from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StorageSetting if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the StorageSetting.
     */
    public static StorageSetting fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StorageSetting deserializedStorageSetting = new StorageSetting();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("datastoreType".equals(fieldName)) {
                    deserializedStorageSetting.datastoreType = StorageSettingStoreTypes.fromString(reader.getString());
                } else if ("type".equals(fieldName)) {
                    deserializedStorageSetting.type = StorageSettingTypes.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStorageSetting;
        });
    }
}
