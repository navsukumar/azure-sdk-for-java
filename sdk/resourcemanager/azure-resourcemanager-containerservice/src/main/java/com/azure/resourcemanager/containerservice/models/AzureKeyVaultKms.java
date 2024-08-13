// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Azure Key Vault key management service settings for the security profile.
 */
@Fluent
public final class AzureKeyVaultKms implements JsonSerializable<AzureKeyVaultKms> {
    /*
     * Whether to enable Azure Key Vault key management service. The default is false.
     */
    private Boolean enabled;

    /*
     * Identifier of Azure Key Vault key. See [key identifier
     * format](https://docs.microsoft.com/en-us/azure/key-vault/general/about-keys-secrets-certificates#vault-name-and-
     * object-name) for more details. When Azure Key Vault key management service is enabled, this field is required and
     * must be a valid key identifier. When Azure Key Vault key management service is disabled, leave the field empty.
     */
    private String keyId;

    /*
     * Network access of key vault. The possible values are `Public` and `Private`. `Public` means the key vault allows
     * public access from all networks. `Private` means the key vault disables public access and enables private link.
     * The default value is `Public`.
     */
    private KeyVaultNetworkAccessTypes keyVaultNetworkAccess;

    /*
     * Resource ID of key vault. When keyVaultNetworkAccess is `Private`, this field is required and must be a valid
     * resource ID. When keyVaultNetworkAccess is `Public`, leave the field empty.
     */
    private String keyVaultResourceId;

    /**
     * Creates an instance of AzureKeyVaultKms class.
     */
    public AzureKeyVaultKms() {
    }

    /**
     * Get the enabled property: Whether to enable Azure Key Vault key management service. The default is false.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Whether to enable Azure Key Vault key management service. The default is false.
     * 
     * @param enabled the enabled value to set.
     * @return the AzureKeyVaultKms object itself.
     */
    public AzureKeyVaultKms withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the keyId property: Identifier of Azure Key Vault key. See [key identifier
     * format](https://docs.microsoft.com/en-us/azure/key-vault/general/about-keys-secrets-certificates#vault-name-and-object-name)
     * for more details. When Azure Key Vault key management service is enabled, this field is required and must be a
     * valid key identifier. When Azure Key Vault key management service is disabled, leave the field empty.
     * 
     * @return the keyId value.
     */
    public String keyId() {
        return this.keyId;
    }

    /**
     * Set the keyId property: Identifier of Azure Key Vault key. See [key identifier
     * format](https://docs.microsoft.com/en-us/azure/key-vault/general/about-keys-secrets-certificates#vault-name-and-object-name)
     * for more details. When Azure Key Vault key management service is enabled, this field is required and must be a
     * valid key identifier. When Azure Key Vault key management service is disabled, leave the field empty.
     * 
     * @param keyId the keyId value to set.
     * @return the AzureKeyVaultKms object itself.
     */
    public AzureKeyVaultKms withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * Get the keyVaultNetworkAccess property: Network access of key vault. The possible values are `Public` and
     * `Private`. `Public` means the key vault allows public access from all networks. `Private` means the key vault
     * disables public access and enables private link. The default value is `Public`.
     * 
     * @return the keyVaultNetworkAccess value.
     */
    public KeyVaultNetworkAccessTypes keyVaultNetworkAccess() {
        return this.keyVaultNetworkAccess;
    }

    /**
     * Set the keyVaultNetworkAccess property: Network access of key vault. The possible values are `Public` and
     * `Private`. `Public` means the key vault allows public access from all networks. `Private` means the key vault
     * disables public access and enables private link. The default value is `Public`.
     * 
     * @param keyVaultNetworkAccess the keyVaultNetworkAccess value to set.
     * @return the AzureKeyVaultKms object itself.
     */
    public AzureKeyVaultKms withKeyVaultNetworkAccess(KeyVaultNetworkAccessTypes keyVaultNetworkAccess) {
        this.keyVaultNetworkAccess = keyVaultNetworkAccess;
        return this;
    }

    /**
     * Get the keyVaultResourceId property: Resource ID of key vault. When keyVaultNetworkAccess is `Private`, this
     * field is required and must be a valid resource ID. When keyVaultNetworkAccess is `Public`, leave the field empty.
     * 
     * @return the keyVaultResourceId value.
     */
    public String keyVaultResourceId() {
        return this.keyVaultResourceId;
    }

    /**
     * Set the keyVaultResourceId property: Resource ID of key vault. When keyVaultNetworkAccess is `Private`, this
     * field is required and must be a valid resource ID. When keyVaultNetworkAccess is `Public`, leave the field empty.
     * 
     * @param keyVaultResourceId the keyVaultResourceId value to set.
     * @return the AzureKeyVaultKms object itself.
     */
    public AzureKeyVaultKms withKeyVaultResourceId(String keyVaultResourceId) {
        this.keyVaultResourceId = keyVaultResourceId;
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
        jsonWriter.writeBooleanField("enabled", this.enabled);
        jsonWriter.writeStringField("keyId", this.keyId);
        jsonWriter.writeStringField("keyVaultNetworkAccess",
            this.keyVaultNetworkAccess == null ? null : this.keyVaultNetworkAccess.toString());
        jsonWriter.writeStringField("keyVaultResourceId", this.keyVaultResourceId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureKeyVaultKms from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureKeyVaultKms if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureKeyVaultKms.
     */
    public static AzureKeyVaultKms fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureKeyVaultKms deserializedAzureKeyVaultKms = new AzureKeyVaultKms();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedAzureKeyVaultKms.enabled = reader.getNullable(JsonReader::getBoolean);
                } else if ("keyId".equals(fieldName)) {
                    deserializedAzureKeyVaultKms.keyId = reader.getString();
                } else if ("keyVaultNetworkAccess".equals(fieldName)) {
                    deserializedAzureKeyVaultKms.keyVaultNetworkAccess
                        = KeyVaultNetworkAccessTypes.fromString(reader.getString());
                } else if ("keyVaultResourceId".equals(fieldName)) {
                    deserializedAzureKeyVaultKms.keyVaultResourceId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureKeyVaultKms;
        });
    }
}
