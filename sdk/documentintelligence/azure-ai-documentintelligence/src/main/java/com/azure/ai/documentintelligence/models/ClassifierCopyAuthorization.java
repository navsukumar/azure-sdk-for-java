// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.documentintelligence.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Authorization to copy a document classifier to the specified target resource and
 * classifierId.
 */
@Immutable
public final class ClassifierCopyAuthorization implements JsonSerializable<ClassifierCopyAuthorization> {
    /*
     * ID of the target Azure resource where the document classifier should be copied to.
     */
    @Generated
    private final String targetResourceId;

    /*
     * Location of the target Azure resource where the document classifier should be copied
     * to.
     */
    @Generated
    private final String targetResourceRegion;

    /*
     * Identifier of the target document classifier.
     */
    @Generated
    private final String targetClassifierId;

    /*
     * URL of the copied document classifier in the target account.
     */
    @Generated
    private final String targetClassifierLocation;

    /*
     * Token used to authorize the request.
     */
    @Generated
    private final String accessToken;

    /*
     * Date/time when the access token expires.
     */
    @Generated
    private final OffsetDateTime expirationDateTime;

    /**
     * Creates an instance of ClassifierCopyAuthorization class.
     * 
     * @param targetResourceId the targetResourceId value to set.
     * @param targetResourceRegion the targetResourceRegion value to set.
     * @param targetClassifierId the targetClassifierId value to set.
     * @param targetClassifierLocation the targetClassifierLocation value to set.
     * @param accessToken the accessToken value to set.
     * @param expirationDateTime the expirationDateTime value to set.
     */
    @Generated
    public ClassifierCopyAuthorization(String targetResourceId, String targetResourceRegion, String targetClassifierId,
        String targetClassifierLocation, String accessToken, OffsetDateTime expirationDateTime) {
        this.targetResourceId = targetResourceId;
        this.targetResourceRegion = targetResourceRegion;
        this.targetClassifierId = targetClassifierId;
        this.targetClassifierLocation = targetClassifierLocation;
        this.accessToken = accessToken;
        this.expirationDateTime = expirationDateTime;
    }

    /**
     * Get the targetResourceId property: ID of the target Azure resource where the document classifier should be copied
     * to.
     * 
     * @return the targetResourceId value.
     */
    @Generated
    public String getTargetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Get the targetResourceRegion property: Location of the target Azure resource where the document classifier should
     * be copied
     * to.
     * 
     * @return the targetResourceRegion value.
     */
    @Generated
    public String getTargetResourceRegion() {
        return this.targetResourceRegion;
    }

    /**
     * Get the targetClassifierId property: Identifier of the target document classifier.
     * 
     * @return the targetClassifierId value.
     */
    @Generated
    public String getTargetClassifierId() {
        return this.targetClassifierId;
    }

    /**
     * Get the targetClassifierLocation property: URL of the copied document classifier in the target account.
     * 
     * @return the targetClassifierLocation value.
     */
    @Generated
    public String getTargetClassifierLocation() {
        return this.targetClassifierLocation;
    }

    /**
     * Get the accessToken property: Token used to authorize the request.
     * 
     * @return the accessToken value.
     */
    @Generated
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * Get the expirationDateTime property: Date/time when the access token expires.
     * 
     * @return the expirationDateTime value.
     */
    @Generated
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("targetResourceId", this.targetResourceId);
        jsonWriter.writeStringField("targetResourceRegion", this.targetResourceRegion);
        jsonWriter.writeStringField("targetClassifierId", this.targetClassifierId);
        jsonWriter.writeStringField("targetClassifierLocation", this.targetClassifierLocation);
        jsonWriter.writeStringField("accessToken", this.accessToken);
        jsonWriter.writeStringField("expirationDateTime",
            this.expirationDateTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.expirationDateTime));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClassifierCopyAuthorization from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClassifierCopyAuthorization if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ClassifierCopyAuthorization.
     */
    @Generated
    public static ClassifierCopyAuthorization fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String targetResourceId = null;
            String targetResourceRegion = null;
            String targetClassifierId = null;
            String targetClassifierLocation = null;
            String accessToken = null;
            OffsetDateTime expirationDateTime = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("targetResourceId".equals(fieldName)) {
                    targetResourceId = reader.getString();
                } else if ("targetResourceRegion".equals(fieldName)) {
                    targetResourceRegion = reader.getString();
                } else if ("targetClassifierId".equals(fieldName)) {
                    targetClassifierId = reader.getString();
                } else if ("targetClassifierLocation".equals(fieldName)) {
                    targetClassifierLocation = reader.getString();
                } else if ("accessToken".equals(fieldName)) {
                    accessToken = reader.getString();
                } else if ("expirationDateTime".equals(fieldName)) {
                    expirationDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }
            return new ClassifierCopyAuthorization(targetResourceId, targetResourceRegion, targetClassifierId,
                targetClassifierLocation, accessToken, expirationDateTime);
        });
    }
}
