// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.containerregistry.models.WebhookAction;
import com.azure.resourcemanager.containerregistry.models.WebhookStatus;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * The parameters for creating the properties of a webhook.
 */
@Fluent
public final class WebhookPropertiesCreateParameters implements JsonSerializable<WebhookPropertiesCreateParameters> {
    /*
     * The service URI for the webhook to post notifications.
     */
    private String serviceUri;

    /*
     * Custom headers that will be added to the webhook notifications.
     */
    private Map<String, String> customHeaders;

    /*
     * The status of the webhook at the time the operation was called.
     */
    private WebhookStatus status;

    /*
     * The scope of repositories where the event can be triggered. For example, 'foo:*' means events for all tags under
     * repository 'foo'. 'foo:bar' means events for 'foo:bar' only. 'foo' is equivalent to 'foo:latest'. Empty means all
     * events.
     */
    private String scope;

    /*
     * The list of actions that trigger the webhook to post notifications.
     */
    private List<WebhookAction> actions;

    /**
     * Creates an instance of WebhookPropertiesCreateParameters class.
     */
    public WebhookPropertiesCreateParameters() {
    }

    /**
     * Get the serviceUri property: The service URI for the webhook to post notifications.
     * 
     * @return the serviceUri value.
     */
    public String serviceUri() {
        return this.serviceUri;
    }

    /**
     * Set the serviceUri property: The service URI for the webhook to post notifications.
     * 
     * @param serviceUri the serviceUri value to set.
     * @return the WebhookPropertiesCreateParameters object itself.
     */
    public WebhookPropertiesCreateParameters withServiceUri(String serviceUri) {
        this.serviceUri = serviceUri;
        return this;
    }

    /**
     * Get the customHeaders property: Custom headers that will be added to the webhook notifications.
     * 
     * @return the customHeaders value.
     */
    public Map<String, String> customHeaders() {
        return this.customHeaders;
    }

    /**
     * Set the customHeaders property: Custom headers that will be added to the webhook notifications.
     * 
     * @param customHeaders the customHeaders value to set.
     * @return the WebhookPropertiesCreateParameters object itself.
     */
    public WebhookPropertiesCreateParameters withCustomHeaders(Map<String, String> customHeaders) {
        this.customHeaders = customHeaders;
        return this;
    }

    /**
     * Get the status property: The status of the webhook at the time the operation was called.
     * 
     * @return the status value.
     */
    public WebhookStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the webhook at the time the operation was called.
     * 
     * @param status the status value to set.
     * @return the WebhookPropertiesCreateParameters object itself.
     */
    public WebhookPropertiesCreateParameters withStatus(WebhookStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the scope property: The scope of repositories where the event can be triggered. For example, 'foo:*' means
     * events for all tags under repository 'foo'. 'foo:bar' means events for 'foo:bar' only. 'foo' is equivalent to
     * 'foo:latest'. Empty means all events.
     * 
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: The scope of repositories where the event can be triggered. For example, 'foo:*' means
     * events for all tags under repository 'foo'. 'foo:bar' means events for 'foo:bar' only. 'foo' is equivalent to
     * 'foo:latest'. Empty means all events.
     * 
     * @param scope the scope value to set.
     * @return the WebhookPropertiesCreateParameters object itself.
     */
    public WebhookPropertiesCreateParameters withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the actions property: The list of actions that trigger the webhook to post notifications.
     * 
     * @return the actions value.
     */
    public List<WebhookAction> actions() {
        return this.actions;
    }

    /**
     * Set the actions property: The list of actions that trigger the webhook to post notifications.
     * 
     * @param actions the actions value to set.
     * @return the WebhookPropertiesCreateParameters object itself.
     */
    public WebhookPropertiesCreateParameters withActions(List<WebhookAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (serviceUri() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property serviceUri in model WebhookPropertiesCreateParameters"));
        }
        if (actions() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property actions in model WebhookPropertiesCreateParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WebhookPropertiesCreateParameters.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("serviceUri", this.serviceUri);
        jsonWriter.writeArrayField("actions", this.actions,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        jsonWriter.writeMapField("customHeaders", this.customHeaders, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        jsonWriter.writeStringField("scope", this.scope);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WebhookPropertiesCreateParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WebhookPropertiesCreateParameters if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the WebhookPropertiesCreateParameters.
     */
    public static WebhookPropertiesCreateParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WebhookPropertiesCreateParameters deserializedWebhookPropertiesCreateParameters
                = new WebhookPropertiesCreateParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("serviceUri".equals(fieldName)) {
                    deserializedWebhookPropertiesCreateParameters.serviceUri = reader.getString();
                } else if ("actions".equals(fieldName)) {
                    List<WebhookAction> actions
                        = reader.readArray(reader1 -> WebhookAction.fromString(reader1.getString()));
                    deserializedWebhookPropertiesCreateParameters.actions = actions;
                } else if ("customHeaders".equals(fieldName)) {
                    Map<String, String> customHeaders = reader.readMap(reader1 -> reader1.getString());
                    deserializedWebhookPropertiesCreateParameters.customHeaders = customHeaders;
                } else if ("status".equals(fieldName)) {
                    deserializedWebhookPropertiesCreateParameters.status = WebhookStatus.fromString(reader.getString());
                } else if ("scope".equals(fieldName)) {
                    deserializedWebhookPropertiesCreateParameters.scope = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWebhookPropertiesCreateParameters;
        });
    }
}
