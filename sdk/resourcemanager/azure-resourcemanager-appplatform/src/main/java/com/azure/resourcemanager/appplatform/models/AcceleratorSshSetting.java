// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Auth setting for SSH auth.
 */
@Fluent
public final class AcceleratorSshSetting extends AcceleratorAuthSetting {
    /*
     * The type of the auth setting.
     */
    private String authType = "SSH";

    /*
     * Public SSH Key of git repository.
     */
    private String hostKey;

    /*
     * SSH Key algorithm of git repository.
     */
    private String hostKeyAlgorithm;

    /*
     * Private SSH Key algorithm of git repository.
     */
    private String privateKey;

    /**
     * Creates an instance of AcceleratorSshSetting class.
     */
    public AcceleratorSshSetting() {
    }

    /**
     * Get the authType property: The type of the auth setting.
     * 
     * @return the authType value.
     */
    @Override
    public String authType() {
        return this.authType;
    }

    /**
     * Get the hostKey property: Public SSH Key of git repository.
     * 
     * @return the hostKey value.
     */
    public String hostKey() {
        return this.hostKey;
    }

    /**
     * Set the hostKey property: Public SSH Key of git repository.
     * 
     * @param hostKey the hostKey value to set.
     * @return the AcceleratorSshSetting object itself.
     */
    public AcceleratorSshSetting withHostKey(String hostKey) {
        this.hostKey = hostKey;
        return this;
    }

    /**
     * Get the hostKeyAlgorithm property: SSH Key algorithm of git repository.
     * 
     * @return the hostKeyAlgorithm value.
     */
    public String hostKeyAlgorithm() {
        return this.hostKeyAlgorithm;
    }

    /**
     * Set the hostKeyAlgorithm property: SSH Key algorithm of git repository.
     * 
     * @param hostKeyAlgorithm the hostKeyAlgorithm value to set.
     * @return the AcceleratorSshSetting object itself.
     */
    public AcceleratorSshSetting withHostKeyAlgorithm(String hostKeyAlgorithm) {
        this.hostKeyAlgorithm = hostKeyAlgorithm;
        return this;
    }

    /**
     * Get the privateKey property: Private SSH Key algorithm of git repository.
     * 
     * @return the privateKey value.
     */
    public String privateKey() {
        return this.privateKey;
    }

    /**
     * Set the privateKey property: Private SSH Key algorithm of git repository.
     * 
     * @param privateKey the privateKey value to set.
     * @return the AcceleratorSshSetting object itself.
     */
    public AcceleratorSshSetting withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("authType", this.authType);
        jsonWriter.writeStringField("hostKey", this.hostKey);
        jsonWriter.writeStringField("hostKeyAlgorithm", this.hostKeyAlgorithm);
        jsonWriter.writeStringField("privateKey", this.privateKey);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AcceleratorSshSetting from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AcceleratorSshSetting if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AcceleratorSshSetting.
     */
    public static AcceleratorSshSetting fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AcceleratorSshSetting deserializedAcceleratorSshSetting = new AcceleratorSshSetting();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("authType".equals(fieldName)) {
                    deserializedAcceleratorSshSetting.authType = reader.getString();
                } else if ("hostKey".equals(fieldName)) {
                    deserializedAcceleratorSshSetting.hostKey = reader.getString();
                } else if ("hostKeyAlgorithm".equals(fieldName)) {
                    deserializedAcceleratorSshSetting.hostKeyAlgorithm = reader.getString();
                } else if ("privateKey".equals(fieldName)) {
                    deserializedAcceleratorSshSetting.privateKey = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAcceleratorSshSetting;
        });
    }
}
