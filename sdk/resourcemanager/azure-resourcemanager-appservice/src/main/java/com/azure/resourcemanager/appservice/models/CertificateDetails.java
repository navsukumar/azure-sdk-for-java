// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * SSL certificate details.
 */
@Immutable
public final class CertificateDetails implements JsonSerializable<CertificateDetails> {
    /*
     * Certificate Version.
     */
    private Integer version;

    /*
     * Certificate Serial Number.
     */
    private String serialNumber;

    /*
     * Certificate Thumbprint.
     */
    private String thumbprint;

    /*
     * Certificate Subject.
     */
    private String subject;

    /*
     * Date Certificate is valid from.
     */
    private OffsetDateTime notBefore;

    /*
     * Date Certificate is valid to.
     */
    private OffsetDateTime notAfter;

    /*
     * Certificate Signature algorithm.
     */
    private String signatureAlgorithm;

    /*
     * Certificate Issuer.
     */
    private String issuer;

    /*
     * Raw certificate data.
     */
    private String rawData;

    /**
     * Creates an instance of CertificateDetails class.
     */
    public CertificateDetails() {
    }

    /**
     * Get the version property: Certificate Version.
     * 
     * @return the version value.
     */
    public Integer version() {
        return this.version;
    }

    /**
     * Get the serialNumber property: Certificate Serial Number.
     * 
     * @return the serialNumber value.
     */
    public String serialNumber() {
        return this.serialNumber;
    }

    /**
     * Get the thumbprint property: Certificate Thumbprint.
     * 
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Get the subject property: Certificate Subject.
     * 
     * @return the subject value.
     */
    public String subject() {
        return this.subject;
    }

    /**
     * Get the notBefore property: Date Certificate is valid from.
     * 
     * @return the notBefore value.
     */
    public OffsetDateTime notBefore() {
        return this.notBefore;
    }

    /**
     * Get the notAfter property: Date Certificate is valid to.
     * 
     * @return the notAfter value.
     */
    public OffsetDateTime notAfter() {
        return this.notAfter;
    }

    /**
     * Get the signatureAlgorithm property: Certificate Signature algorithm.
     * 
     * @return the signatureAlgorithm value.
     */
    public String signatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    /**
     * Get the issuer property: Certificate Issuer.
     * 
     * @return the issuer value.
     */
    public String issuer() {
        return this.issuer;
    }

    /**
     * Get the rawData property: Raw certificate data.
     * 
     * @return the rawData value.
     */
    public String rawData() {
        return this.rawData;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CertificateDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CertificateDetails if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the CertificateDetails.
     */
    public static CertificateDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CertificateDetails deserializedCertificateDetails = new CertificateDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("version".equals(fieldName)) {
                    deserializedCertificateDetails.version = reader.getNullable(JsonReader::getInt);
                } else if ("serialNumber".equals(fieldName)) {
                    deserializedCertificateDetails.serialNumber = reader.getString();
                } else if ("thumbprint".equals(fieldName)) {
                    deserializedCertificateDetails.thumbprint = reader.getString();
                } else if ("subject".equals(fieldName)) {
                    deserializedCertificateDetails.subject = reader.getString();
                } else if ("notBefore".equals(fieldName)) {
                    deserializedCertificateDetails.notBefore = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("notAfter".equals(fieldName)) {
                    deserializedCertificateDetails.notAfter = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("signatureAlgorithm".equals(fieldName)) {
                    deserializedCertificateDetails.signatureAlgorithm = reader.getString();
                } else if ("issuer".equals(fieldName)) {
                    deserializedCertificateDetails.issuer = reader.getString();
                } else if ("rawData".equals(fieldName)) {
                    deserializedCertificateDetails.rawData = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCertificateDetails;
        });
    }
}
