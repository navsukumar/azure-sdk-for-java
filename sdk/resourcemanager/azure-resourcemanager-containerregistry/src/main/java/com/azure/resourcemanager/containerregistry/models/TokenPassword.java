// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The password that will be used for authenticating the token of a container registry.
 */
@Fluent
public final class TokenPassword implements JsonSerializable<TokenPassword> {
    /*
     * The creation datetime of the password.
     */
    private OffsetDateTime creationTime;

    /*
     * The expiry datetime of the password.
     */
    private OffsetDateTime expiry;

    /*
     * The password name "password1" or "password2"
     */
    private TokenPasswordName name;

    /*
     * The password value.
     */
    private String value;

    /**
     * Creates an instance of TokenPassword class.
     */
    public TokenPassword() {
    }

    /**
     * Get the creationTime property: The creation datetime of the password.
     * 
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Set the creationTime property: The creation datetime of the password.
     * 
     * @param creationTime the creationTime value to set.
     * @return the TokenPassword object itself.
     */
    public TokenPassword withCreationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get the expiry property: The expiry datetime of the password.
     * 
     * @return the expiry value.
     */
    public OffsetDateTime expiry() {
        return this.expiry;
    }

    /**
     * Set the expiry property: The expiry datetime of the password.
     * 
     * @param expiry the expiry value to set.
     * @return the TokenPassword object itself.
     */
    public TokenPassword withExpiry(OffsetDateTime expiry) {
        this.expiry = expiry;
        return this;
    }

    /**
     * Get the name property: The password name "password1" or "password2".
     * 
     * @return the name value.
     */
    public TokenPasswordName name() {
        return this.name;
    }

    /**
     * Set the name property: The password name "password1" or "password2".
     * 
     * @param name the name value to set.
     * @return the TokenPassword object itself.
     */
    public TokenPassword withName(TokenPasswordName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: The password value.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
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
        jsonWriter.writeStringField("creationTime",
            this.creationTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.creationTime));
        jsonWriter.writeStringField("expiry",
            this.expiry == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.expiry));
        jsonWriter.writeStringField("name", this.name == null ? null : this.name.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TokenPassword from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TokenPassword if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the TokenPassword.
     */
    public static TokenPassword fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TokenPassword deserializedTokenPassword = new TokenPassword();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("creationTime".equals(fieldName)) {
                    deserializedTokenPassword.creationTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("expiry".equals(fieldName)) {
                    deserializedTokenPassword.expiry = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("name".equals(fieldName)) {
                    deserializedTokenPassword.name = TokenPasswordName.fromString(reader.getString());
                } else if ("value".equals(fieldName)) {
                    deserializedTokenPassword.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTokenPassword;
        });
    }
}
