// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.resources.models.DeploymentStacksTemplateLink;
import java.io.IOException;

/**
 * Export Template specific properties of the Deployment stack.
 */
@Fluent
public final class DeploymentStackTemplateDefinitionInner
    implements JsonSerializable<DeploymentStackTemplateDefinitionInner> {
    /*
     * The template content. Use this element to pass the template syntax directly in the request rather than link to an
     * existing template. It can be a JObject or well-formed JSON string. Use either the templateLink property or the
     * template property, but not both.
     */
    private Object template;

    /*
     * The URI of the template. Use either the templateLink property or the template property, but not both.
     */
    private DeploymentStacksTemplateLink templateLink;

    /**
     * Creates an instance of DeploymentStackTemplateDefinitionInner class.
     */
    public DeploymentStackTemplateDefinitionInner() {
    }

    /**
     * Get the template property: The template content. Use this element to pass the template syntax directly in the
     * request rather than link to an existing template. It can be a JObject or well-formed JSON string. Use either the
     * templateLink property or the template property, but not both.
     * 
     * @return the template value.
     */
    public Object template() {
        return this.template;
    }

    /**
     * Set the template property: The template content. Use this element to pass the template syntax directly in the
     * request rather than link to an existing template. It can be a JObject or well-formed JSON string. Use either the
     * templateLink property or the template property, but not both.
     * 
     * @param template the template value to set.
     * @return the DeploymentStackTemplateDefinitionInner object itself.
     */
    public DeploymentStackTemplateDefinitionInner withTemplate(Object template) {
        this.template = template;
        return this;
    }

    /**
     * Get the templateLink property: The URI of the template. Use either the templateLink property or the template
     * property, but not both.
     * 
     * @return the templateLink value.
     */
    public DeploymentStacksTemplateLink templateLink() {
        return this.templateLink;
    }

    /**
     * Set the templateLink property: The URI of the template. Use either the templateLink property or the template
     * property, but not both.
     * 
     * @param templateLink the templateLink value to set.
     * @return the DeploymentStackTemplateDefinitionInner object itself.
     */
    public DeploymentStackTemplateDefinitionInner withTemplateLink(DeploymentStacksTemplateLink templateLink) {
        this.templateLink = templateLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (templateLink() != null) {
            templateLink().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("template", this.template);
        jsonWriter.writeJsonField("templateLink", this.templateLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DeploymentStackTemplateDefinitionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DeploymentStackTemplateDefinitionInner if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DeploymentStackTemplateDefinitionInner.
     */
    public static DeploymentStackTemplateDefinitionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DeploymentStackTemplateDefinitionInner deserializedDeploymentStackTemplateDefinitionInner
                = new DeploymentStackTemplateDefinitionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("template".equals(fieldName)) {
                    deserializedDeploymentStackTemplateDefinitionInner.template = reader.readUntyped();
                } else if ("templateLink".equals(fieldName)) {
                    deserializedDeploymentStackTemplateDefinitionInner.templateLink
                        = DeploymentStacksTemplateLink.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDeploymentStackTemplateDefinitionInner;
        });
    }
}
