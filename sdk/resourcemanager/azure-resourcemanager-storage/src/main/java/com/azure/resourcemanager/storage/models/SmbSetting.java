// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Setting for SMB protocol.
 */
@Fluent
public final class SmbSetting implements JsonSerializable<SmbSetting> {
    /*
     * Multichannel setting. Applies to Premium FileStorage only.
     */
    private Multichannel multichannel;

    /*
     * SMB protocol versions supported by server. Valid values are SMB2.1, SMB3.0, SMB3.1.1. Should be passed as a
     * string with delimiter ';'.
     */
    private String versions;

    /*
     * SMB authentication methods supported by server. Valid values are NTLMv2, Kerberos. Should be passed as a string
     * with delimiter ';'.
     */
    private String authenticationMethods;

    /*
     * Kerberos ticket encryption supported by server. Valid values are RC4-HMAC, AES-256. Should be passed as a string
     * with delimiter ';'
     */
    private String kerberosTicketEncryption;

    /*
     * SMB channel encryption supported by server. Valid values are AES-128-CCM, AES-128-GCM, AES-256-GCM. Should be
     * passed as a string with delimiter ';'.
     */
    private String channelEncryption;

    /**
     * Creates an instance of SmbSetting class.
     */
    public SmbSetting() {
    }

    /**
     * Get the multichannel property: Multichannel setting. Applies to Premium FileStorage only.
     * 
     * @return the multichannel value.
     */
    public Multichannel multichannel() {
        return this.multichannel;
    }

    /**
     * Set the multichannel property: Multichannel setting. Applies to Premium FileStorage only.
     * 
     * @param multichannel the multichannel value to set.
     * @return the SmbSetting object itself.
     */
    public SmbSetting withMultichannel(Multichannel multichannel) {
        this.multichannel = multichannel;
        return this;
    }

    /**
     * Get the versions property: SMB protocol versions supported by server. Valid values are SMB2.1, SMB3.0, SMB3.1.1.
     * Should be passed as a string with delimiter ';'.
     * 
     * @return the versions value.
     */
    public String versions() {
        return this.versions;
    }

    /**
     * Set the versions property: SMB protocol versions supported by server. Valid values are SMB2.1, SMB3.0, SMB3.1.1.
     * Should be passed as a string with delimiter ';'.
     * 
     * @param versions the versions value to set.
     * @return the SmbSetting object itself.
     */
    public SmbSetting withVersions(String versions) {
        this.versions = versions;
        return this;
    }

    /**
     * Get the authenticationMethods property: SMB authentication methods supported by server. Valid values are NTLMv2,
     * Kerberos. Should be passed as a string with delimiter ';'.
     * 
     * @return the authenticationMethods value.
     */
    public String authenticationMethods() {
        return this.authenticationMethods;
    }

    /**
     * Set the authenticationMethods property: SMB authentication methods supported by server. Valid values are NTLMv2,
     * Kerberos. Should be passed as a string with delimiter ';'.
     * 
     * @param authenticationMethods the authenticationMethods value to set.
     * @return the SmbSetting object itself.
     */
    public SmbSetting withAuthenticationMethods(String authenticationMethods) {
        this.authenticationMethods = authenticationMethods;
        return this;
    }

    /**
     * Get the kerberosTicketEncryption property: Kerberos ticket encryption supported by server. Valid values are
     * RC4-HMAC, AES-256. Should be passed as a string with delimiter ';'.
     * 
     * @return the kerberosTicketEncryption value.
     */
    public String kerberosTicketEncryption() {
        return this.kerberosTicketEncryption;
    }

    /**
     * Set the kerberosTicketEncryption property: Kerberos ticket encryption supported by server. Valid values are
     * RC4-HMAC, AES-256. Should be passed as a string with delimiter ';'.
     * 
     * @param kerberosTicketEncryption the kerberosTicketEncryption value to set.
     * @return the SmbSetting object itself.
     */
    public SmbSetting withKerberosTicketEncryption(String kerberosTicketEncryption) {
        this.kerberosTicketEncryption = kerberosTicketEncryption;
        return this;
    }

    /**
     * Get the channelEncryption property: SMB channel encryption supported by server. Valid values are AES-128-CCM,
     * AES-128-GCM, AES-256-GCM. Should be passed as a string with delimiter ';'.
     * 
     * @return the channelEncryption value.
     */
    public String channelEncryption() {
        return this.channelEncryption;
    }

    /**
     * Set the channelEncryption property: SMB channel encryption supported by server. Valid values are AES-128-CCM,
     * AES-128-GCM, AES-256-GCM. Should be passed as a string with delimiter ';'.
     * 
     * @param channelEncryption the channelEncryption value to set.
     * @return the SmbSetting object itself.
     */
    public SmbSetting withChannelEncryption(String channelEncryption) {
        this.channelEncryption = channelEncryption;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (multichannel() != null) {
            multichannel().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("multichannel", this.multichannel);
        jsonWriter.writeStringField("versions", this.versions);
        jsonWriter.writeStringField("authenticationMethods", this.authenticationMethods);
        jsonWriter.writeStringField("kerberosTicketEncryption", this.kerberosTicketEncryption);
        jsonWriter.writeStringField("channelEncryption", this.channelEncryption);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SmbSetting from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SmbSetting if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the SmbSetting.
     */
    public static SmbSetting fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SmbSetting deserializedSmbSetting = new SmbSetting();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("multichannel".equals(fieldName)) {
                    deserializedSmbSetting.multichannel = Multichannel.fromJson(reader);
                } else if ("versions".equals(fieldName)) {
                    deserializedSmbSetting.versions = reader.getString();
                } else if ("authenticationMethods".equals(fieldName)) {
                    deserializedSmbSetting.authenticationMethods = reader.getString();
                } else if ("kerberosTicketEncryption".equals(fieldName)) {
                    deserializedSmbSetting.kerberosTicketEncryption = reader.getString();
                } else if ("channelEncryption".equals(fieldName)) {
                    deserializedSmbSetting.channelEncryption = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSmbSetting;
        });
    }
}
