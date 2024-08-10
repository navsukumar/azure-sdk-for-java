// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Certificate resource specific properties.
 */
@Fluent
public final class CertificateProperties implements JsonSerializable<CertificateProperties> {
    /*
     * Provisioning state of the certificate.
     */
    private CertificateProvisioningState provisioningState;

    /*
     * Certificate password.
     */
    private String password;

    /*
     * Subject name of the certificate.
     */
    private String subjectName;

    /*
     * Subject alternative names the certificate applies to.
     */
    private List<String> subjectAlternativeNames;

    /*
     * PFX or PEM blob
     */
    private byte[] value;

    /*
     * Certificate issuer.
     */
    private String issuer;

    /*
     * Certificate issue Date.
     */
    private OffsetDateTime issueDate;

    /*
     * Certificate expiration date.
     */
    private OffsetDateTime expirationDate;

    /*
     * Certificate thumbprint.
     */
    private String thumbprint;

    /*
     * Is the certificate valid?.
     */
    private Boolean valid;

    /*
     * Public key hash.
     */
    private String publicKeyHash;

    /**
     * Creates an instance of CertificateProperties class.
     */
    public CertificateProperties() {
    }

    /**
     * Get the provisioningState property: Provisioning state of the certificate.
     * 
     * @return the provisioningState value.
     */
    public CertificateProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the password property: Certificate password.
     * 
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: Certificate password.
     * 
     * @param password the password value to set.
     * @return the CertificateProperties object itself.
     */
    public CertificateProperties withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the subjectName property: Subject name of the certificate.
     * 
     * @return the subjectName value.
     */
    public String subjectName() {
        return this.subjectName;
    }

    /**
     * Get the subjectAlternativeNames property: Subject alternative names the certificate applies to.
     * 
     * @return the subjectAlternativeNames value.
     */
    public List<String> subjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }

    /**
     * Get the value property: PFX or PEM blob.
     * 
     * @return the value value.
     */
    public byte[] value() {
        return CoreUtils.clone(this.value);
    }

    /**
     * Set the value property: PFX or PEM blob.
     * 
     * @param value the value value to set.
     * @return the CertificateProperties object itself.
     */
    public CertificateProperties withValue(byte[] value) {
        this.value = CoreUtils.clone(value);
        return this;
    }

    /**
     * Get the issuer property: Certificate issuer.
     * 
     * @return the issuer value.
     */
    public String issuer() {
        return this.issuer;
    }

    /**
     * Get the issueDate property: Certificate issue Date.
     * 
     * @return the issueDate value.
     */
    public OffsetDateTime issueDate() {
        return this.issueDate;
    }

    /**
     * Get the expirationDate property: Certificate expiration date.
     * 
     * @return the expirationDate value.
     */
    public OffsetDateTime expirationDate() {
        return this.expirationDate;
    }

    /**
     * Get the thumbprint property: Certificate thumbprint.
     * 
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Get the valid property: Is the certificate valid?.
     * 
     * @return the valid value.
     */
    public Boolean valid() {
        return this.valid;
    }

    /**
     * Get the publicKeyHash property: Public key hash.
     * 
     * @return the publicKeyHash value.
     */
    public String publicKeyHash() {
        return this.publicKeyHash;
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
        jsonWriter.writeStringField("password", this.password);
        jsonWriter.writeBinaryField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CertificateProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CertificateProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CertificateProperties.
     */
    public static CertificateProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CertificateProperties deserializedCertificateProperties = new CertificateProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedCertificateProperties.provisioningState
                        = CertificateProvisioningState.fromString(reader.getString());
                } else if ("password".equals(fieldName)) {
                    deserializedCertificateProperties.password = reader.getString();
                } else if ("subjectName".equals(fieldName)) {
                    deserializedCertificateProperties.subjectName = reader.getString();
                } else if ("subjectAlternativeNames".equals(fieldName)) {
                    List<String> subjectAlternativeNames = reader.readArray(reader1 -> reader1.getString());
                    deserializedCertificateProperties.subjectAlternativeNames = subjectAlternativeNames;
                } else if ("value".equals(fieldName)) {
                    deserializedCertificateProperties.value = reader.getBinary();
                } else if ("issuer".equals(fieldName)) {
                    deserializedCertificateProperties.issuer = reader.getString();
                } else if ("issueDate".equals(fieldName)) {
                    deserializedCertificateProperties.issueDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("expirationDate".equals(fieldName)) {
                    deserializedCertificateProperties.expirationDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("thumbprint".equals(fieldName)) {
                    deserializedCertificateProperties.thumbprint = reader.getString();
                } else if ("valid".equals(fieldName)) {
                    deserializedCertificateProperties.valid = reader.getNullable(JsonReader::getBoolean);
                } else if ("publicKeyHash".equals(fieldName)) {
                    deserializedCertificateProperties.publicKeyHash = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCertificateProperties;
        });
    }
}
