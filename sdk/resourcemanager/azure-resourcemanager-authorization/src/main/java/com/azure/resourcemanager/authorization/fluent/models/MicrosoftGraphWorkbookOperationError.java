// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * workbookOperationError.
 */
@Fluent
public final class MicrosoftGraphWorkbookOperationError
    implements JsonSerializable<MicrosoftGraphWorkbookOperationError> {
    /*
     * The error code.
     */
    private String code;

    /*
     * workbookOperationError
     */
    private MicrosoftGraphWorkbookOperationError innerError;

    /*
     * The error message.
     */
    private String message;

    /*
     * workbookOperationError
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphWorkbookOperationError class.
     */
    public MicrosoftGraphWorkbookOperationError() {
    }

    /**
     * Get the code property: The error code.
     * 
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: The error code.
     * 
     * @param code the code value to set.
     * @return the MicrosoftGraphWorkbookOperationError object itself.
     */
    public MicrosoftGraphWorkbookOperationError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the innerError property: workbookOperationError.
     * 
     * @return the innerError value.
     */
    public MicrosoftGraphWorkbookOperationError innerError() {
        return this.innerError;
    }

    /**
     * Set the innerError property: workbookOperationError.
     * 
     * @param innerError the innerError value to set.
     * @return the MicrosoftGraphWorkbookOperationError object itself.
     */
    public MicrosoftGraphWorkbookOperationError withInnerError(MicrosoftGraphWorkbookOperationError innerError) {
        this.innerError = innerError;
        return this;
    }

    /**
     * Get the message property: The error message.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: The error message.
     * 
     * @param message the message value to set.
     * @return the MicrosoftGraphWorkbookOperationError object itself.
     */
    public MicrosoftGraphWorkbookOperationError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the additionalProperties property: workbookOperationError.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: workbookOperationError.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphWorkbookOperationError object itself.
     */
    public MicrosoftGraphWorkbookOperationError withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerError() != null) {
            innerError().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("code", this.code);
        jsonWriter.writeJsonField("innerError", this.innerError);
        jsonWriter.writeStringField("message", this.message);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphWorkbookOperationError from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphWorkbookOperationError if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphWorkbookOperationError.
     */
    public static MicrosoftGraphWorkbookOperationError fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphWorkbookOperationError deserializedMicrosoftGraphWorkbookOperationError
                = new MicrosoftGraphWorkbookOperationError();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("code".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookOperationError.code = reader.getString();
                } else if ("innerError".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookOperationError.innerError
                        = MicrosoftGraphWorkbookOperationError.fromJson(reader);
                } else if ("message".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookOperationError.message = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphWorkbookOperationError.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphWorkbookOperationError;
        });
    }
}
