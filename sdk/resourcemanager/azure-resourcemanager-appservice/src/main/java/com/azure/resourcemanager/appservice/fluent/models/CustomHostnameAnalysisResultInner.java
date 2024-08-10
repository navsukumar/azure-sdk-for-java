// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.models.DnsVerificationTestResult;
import com.azure.resourcemanager.appservice.models.ErrorEntity;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import java.io.IOException;
import java.util.List;

/**
 * Custom domain analysis.
 */
@Fluent
public final class CustomHostnameAnalysisResultInner extends ProxyOnlyResource {
    /*
     * CustomHostnameAnalysisResult resource specific properties
     */
    private CustomHostnameAnalysisResultProperties innerProperties;

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
     * Creates an instance of CustomHostnameAnalysisResultInner class.
     */
    public CustomHostnameAnalysisResultInner() {
    }

    /**
     * Get the innerProperties property: CustomHostnameAnalysisResult resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private CustomHostnameAnalysisResultProperties innerProperties() {
        return this.innerProperties;
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
    public CustomHostnameAnalysisResultInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the isHostnameAlreadyVerified property: &lt;code&gt;true&lt;/code&gt; if hostname is already verified;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the isHostnameAlreadyVerified value.
     */
    public Boolean isHostnameAlreadyVerified() {
        return this.innerProperties() == null ? null : this.innerProperties().isHostnameAlreadyVerified();
    }

    /**
     * Get the customDomainVerificationTest property: DNS verification test result.
     * 
     * @return the customDomainVerificationTest value.
     */
    public DnsVerificationTestResult customDomainVerificationTest() {
        return this.innerProperties() == null ? null : this.innerProperties().customDomainVerificationTest();
    }

    /**
     * Get the customDomainVerificationFailureInfo property: Raw failure information if DNS verification fails.
     * 
     * @return the customDomainVerificationFailureInfo value.
     */
    public ErrorEntity customDomainVerificationFailureInfo() {
        return this.innerProperties() == null ? null : this.innerProperties().customDomainVerificationFailureInfo();
    }

    /**
     * Get the hasConflictOnScaleUnit property: &lt;code&gt;true&lt;/code&gt; if there is a conflict on a scale unit;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the hasConflictOnScaleUnit value.
     */
    public Boolean hasConflictOnScaleUnit() {
        return this.innerProperties() == null ? null : this.innerProperties().hasConflictOnScaleUnit();
    }

    /**
     * Get the hasConflictAcrossSubscription property: &lt;code&gt;true&lt;/code&gt; if there is a conflict across
     * subscriptions; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the hasConflictAcrossSubscription value.
     */
    public Boolean hasConflictAcrossSubscription() {
        return this.innerProperties() == null ? null : this.innerProperties().hasConflictAcrossSubscription();
    }

    /**
     * Get the conflictingAppResourceId property: Name of the conflicting app on scale unit if it's within the same
     * subscription.
     * 
     * @return the conflictingAppResourceId value.
     */
    public String conflictingAppResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().conflictingAppResourceId();
    }

    /**
     * Get the cNameRecords property: CName records controller can see for this hostname.
     * 
     * @return the cNameRecords value.
     */
    public List<String> cNameRecords() {
        return this.innerProperties() == null ? null : this.innerProperties().cNameRecords();
    }

    /**
     * Set the cNameRecords property: CName records controller can see for this hostname.
     * 
     * @param cNameRecords the cNameRecords value to set.
     * @return the CustomHostnameAnalysisResultInner object itself.
     */
    public CustomHostnameAnalysisResultInner withCNameRecords(List<String> cNameRecords) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomHostnameAnalysisResultProperties();
        }
        this.innerProperties().withCNameRecords(cNameRecords);
        return this;
    }

    /**
     * Get the txtRecords property: TXT records controller can see for this hostname.
     * 
     * @return the txtRecords value.
     */
    public List<String> txtRecords() {
        return this.innerProperties() == null ? null : this.innerProperties().txtRecords();
    }

    /**
     * Set the txtRecords property: TXT records controller can see for this hostname.
     * 
     * @param txtRecords the txtRecords value to set.
     * @return the CustomHostnameAnalysisResultInner object itself.
     */
    public CustomHostnameAnalysisResultInner withTxtRecords(List<String> txtRecords) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomHostnameAnalysisResultProperties();
        }
        this.innerProperties().withTxtRecords(txtRecords);
        return this;
    }

    /**
     * Get the aRecords property: A records controller can see for this hostname.
     * 
     * @return the aRecords value.
     */
    public List<String> aRecords() {
        return this.innerProperties() == null ? null : this.innerProperties().aRecords();
    }

    /**
     * Set the aRecords property: A records controller can see for this hostname.
     * 
     * @param aRecords the aRecords value to set.
     * @return the CustomHostnameAnalysisResultInner object itself.
     */
    public CustomHostnameAnalysisResultInner withARecords(List<String> aRecords) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomHostnameAnalysisResultProperties();
        }
        this.innerProperties().withARecords(aRecords);
        return this;
    }

    /**
     * Get the alternateCNameRecords property: Alternate CName records controller can see for this hostname.
     * 
     * @return the alternateCNameRecords value.
     */
    public List<String> alternateCNameRecords() {
        return this.innerProperties() == null ? null : this.innerProperties().alternateCNameRecords();
    }

    /**
     * Set the alternateCNameRecords property: Alternate CName records controller can see for this hostname.
     * 
     * @param alternateCNameRecords the alternateCNameRecords value to set.
     * @return the CustomHostnameAnalysisResultInner object itself.
     */
    public CustomHostnameAnalysisResultInner withAlternateCNameRecords(List<String> alternateCNameRecords) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomHostnameAnalysisResultProperties();
        }
        this.innerProperties().withAlternateCNameRecords(alternateCNameRecords);
        return this;
    }

    /**
     * Get the alternateTxtRecords property: Alternate TXT records controller can see for this hostname.
     * 
     * @return the alternateTxtRecords value.
     */
    public List<String> alternateTxtRecords() {
        return this.innerProperties() == null ? null : this.innerProperties().alternateTxtRecords();
    }

    /**
     * Set the alternateTxtRecords property: Alternate TXT records controller can see for this hostname.
     * 
     * @param alternateTxtRecords the alternateTxtRecords value to set.
     * @return the CustomHostnameAnalysisResultInner object itself.
     */
    public CustomHostnameAnalysisResultInner withAlternateTxtRecords(List<String> alternateTxtRecords) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomHostnameAnalysisResultProperties();
        }
        this.innerProperties().withAlternateTxtRecords(alternateTxtRecords);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", kind());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CustomHostnameAnalysisResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CustomHostnameAnalysisResultInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CustomHostnameAnalysisResultInner.
     */
    public static CustomHostnameAnalysisResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CustomHostnameAnalysisResultInner deserializedCustomHostnameAnalysisResultInner
                = new CustomHostnameAnalysisResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedCustomHostnameAnalysisResultInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedCustomHostnameAnalysisResultInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedCustomHostnameAnalysisResultInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedCustomHostnameAnalysisResultInner.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedCustomHostnameAnalysisResultInner.innerProperties
                        = CustomHostnameAnalysisResultProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCustomHostnameAnalysisResultInner;
        });
    }
}
