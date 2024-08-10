// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.Access;
import java.io.IOException;

/**
 * Results of IP flow verification on the target resource.
 */
@Fluent
public final class VerificationIpFlowResultInner implements JsonSerializable<VerificationIpFlowResultInner> {
    /*
     * Indicates whether the traffic is allowed or denied.
     */
    private Access access;

    /*
     * Name of the rule. If input is not matched against any security rule, it is not displayed.
     */
    private String ruleName;

    /**
     * Creates an instance of VerificationIpFlowResultInner class.
     */
    public VerificationIpFlowResultInner() {
    }

    /**
     * Get the access property: Indicates whether the traffic is allowed or denied.
     * 
     * @return the access value.
     */
    public Access access() {
        return this.access;
    }

    /**
     * Set the access property: Indicates whether the traffic is allowed or denied.
     * 
     * @param access the access value to set.
     * @return the VerificationIpFlowResultInner object itself.
     */
    public VerificationIpFlowResultInner withAccess(Access access) {
        this.access = access;
        return this;
    }

    /**
     * Get the ruleName property: Name of the rule. If input is not matched against any security rule, it is not
     * displayed.
     * 
     * @return the ruleName value.
     */
    public String ruleName() {
        return this.ruleName;
    }

    /**
     * Set the ruleName property: Name of the rule. If input is not matched against any security rule, it is not
     * displayed.
     * 
     * @param ruleName the ruleName value to set.
     * @return the VerificationIpFlowResultInner object itself.
     */
    public VerificationIpFlowResultInner withRuleName(String ruleName) {
        this.ruleName = ruleName;
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
        jsonWriter.writeStringField("access", this.access == null ? null : this.access.toString());
        jsonWriter.writeStringField("ruleName", this.ruleName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VerificationIpFlowResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VerificationIpFlowResultInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VerificationIpFlowResultInner.
     */
    public static VerificationIpFlowResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VerificationIpFlowResultInner deserializedVerificationIpFlowResultInner
                = new VerificationIpFlowResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("access".equals(fieldName)) {
                    deserializedVerificationIpFlowResultInner.access = Access.fromString(reader.getString());
                } else if ("ruleName".equals(fieldName)) {
                    deserializedVerificationIpFlowResultInner.ruleName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVerificationIpFlowResultInner;
        });
    }
}
