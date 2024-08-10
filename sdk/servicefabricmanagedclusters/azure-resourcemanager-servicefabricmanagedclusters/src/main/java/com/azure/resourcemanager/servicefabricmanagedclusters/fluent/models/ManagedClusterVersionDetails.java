// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.OsType;
import java.io.IOException;

/**
 * The detail of the Service Fabric runtime version result.
 */
@Fluent
public final class ManagedClusterVersionDetails implements JsonSerializable<ManagedClusterVersionDetails> {
    /*
     * The Service Fabric runtime version of the cluster.
     */
    private String clusterCodeVersion;

    /*
     * The date of expiry of support of the version.
     */
    private String supportExpiryUtc;

    /*
     * Cluster operating system, the default will be Windows
     */
    private OsType osType;

    /**
     * Creates an instance of ManagedClusterVersionDetails class.
     */
    public ManagedClusterVersionDetails() {
    }

    /**
     * Get the clusterCodeVersion property: The Service Fabric runtime version of the cluster.
     * 
     * @return the clusterCodeVersion value.
     */
    public String clusterCodeVersion() {
        return this.clusterCodeVersion;
    }

    /**
     * Set the clusterCodeVersion property: The Service Fabric runtime version of the cluster.
     * 
     * @param clusterCodeVersion the clusterCodeVersion value to set.
     * @return the ManagedClusterVersionDetails object itself.
     */
    public ManagedClusterVersionDetails withClusterCodeVersion(String clusterCodeVersion) {
        this.clusterCodeVersion = clusterCodeVersion;
        return this;
    }

    /**
     * Get the supportExpiryUtc property: The date of expiry of support of the version.
     * 
     * @return the supportExpiryUtc value.
     */
    public String supportExpiryUtc() {
        return this.supportExpiryUtc;
    }

    /**
     * Set the supportExpiryUtc property: The date of expiry of support of the version.
     * 
     * @param supportExpiryUtc the supportExpiryUtc value to set.
     * @return the ManagedClusterVersionDetails object itself.
     */
    public ManagedClusterVersionDetails withSupportExpiryUtc(String supportExpiryUtc) {
        this.supportExpiryUtc = supportExpiryUtc;
        return this;
    }

    /**
     * Get the osType property: Cluster operating system, the default will be Windows.
     * 
     * @return the osType value.
     */
    public OsType osType() {
        return this.osType;
    }

    /**
     * Set the osType property: Cluster operating system, the default will be Windows.
     * 
     * @param osType the osType value to set.
     * @return the ManagedClusterVersionDetails object itself.
     */
    public ManagedClusterVersionDetails withOsType(OsType osType) {
        this.osType = osType;
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
        jsonWriter.writeStringField("clusterCodeVersion", this.clusterCodeVersion);
        jsonWriter.writeStringField("supportExpiryUtc", this.supportExpiryUtc);
        jsonWriter.writeStringField("osType", this.osType == null ? null : this.osType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedClusterVersionDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedClusterVersionDetails if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ManagedClusterVersionDetails.
     */
    public static ManagedClusterVersionDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedClusterVersionDetails deserializedManagedClusterVersionDetails = new ManagedClusterVersionDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("clusterCodeVersion".equals(fieldName)) {
                    deserializedManagedClusterVersionDetails.clusterCodeVersion = reader.getString();
                } else if ("supportExpiryUtc".equals(fieldName)) {
                    deserializedManagedClusterVersionDetails.supportExpiryUtc = reader.getString();
                } else if ("osType".equals(fieldName)) {
                    deserializedManagedClusterVersionDetails.osType = OsType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedClusterVersionDetails;
        });
    }
}
