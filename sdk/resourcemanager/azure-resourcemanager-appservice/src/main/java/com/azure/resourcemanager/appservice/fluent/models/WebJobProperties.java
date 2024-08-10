// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.models.WebJobType;
import java.io.IOException;
import java.util.Map;

/**
 * WebJob resource specific properties.
 */
@Fluent
public final class WebJobProperties implements JsonSerializable<WebJobProperties> {
    /*
     * Run command.
     */
    private String runCommand;

    /*
     * Job URL.
     */
    private String url;

    /*
     * Extra Info URL.
     */
    private String extraInfoUrl;

    /*
     * Job type.
     */
    private WebJobType webJobType;

    /*
     * Error information.
     */
    private String error;

    /*
     * Using SDK?
     */
    private Boolean usingSdk;

    /*
     * Job settings.
     */
    private Map<String, Object> settings;

    /**
     * Creates an instance of WebJobProperties class.
     */
    public WebJobProperties() {
    }

    /**
     * Get the runCommand property: Run command.
     * 
     * @return the runCommand value.
     */
    public String runCommand() {
        return this.runCommand;
    }

    /**
     * Set the runCommand property: Run command.
     * 
     * @param runCommand the runCommand value to set.
     * @return the WebJobProperties object itself.
     */
    public WebJobProperties withRunCommand(String runCommand) {
        this.runCommand = runCommand;
        return this;
    }

    /**
     * Get the url property: Job URL.
     * 
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: Job URL.
     * 
     * @param url the url value to set.
     * @return the WebJobProperties object itself.
     */
    public WebJobProperties withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the extraInfoUrl property: Extra Info URL.
     * 
     * @return the extraInfoUrl value.
     */
    public String extraInfoUrl() {
        return this.extraInfoUrl;
    }

    /**
     * Set the extraInfoUrl property: Extra Info URL.
     * 
     * @param extraInfoUrl the extraInfoUrl value to set.
     * @return the WebJobProperties object itself.
     */
    public WebJobProperties withExtraInfoUrl(String extraInfoUrl) {
        this.extraInfoUrl = extraInfoUrl;
        return this;
    }

    /**
     * Get the webJobType property: Job type.
     * 
     * @return the webJobType value.
     */
    public WebJobType webJobType() {
        return this.webJobType;
    }

    /**
     * Set the webJobType property: Job type.
     * 
     * @param webJobType the webJobType value to set.
     * @return the WebJobProperties object itself.
     */
    public WebJobProperties withWebJobType(WebJobType webJobType) {
        this.webJobType = webJobType;
        return this;
    }

    /**
     * Get the error property: Error information.
     * 
     * @return the error value.
     */
    public String error() {
        return this.error;
    }

    /**
     * Set the error property: Error information.
     * 
     * @param error the error value to set.
     * @return the WebJobProperties object itself.
     */
    public WebJobProperties withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * Get the usingSdk property: Using SDK?.
     * 
     * @return the usingSdk value.
     */
    public Boolean usingSdk() {
        return this.usingSdk;
    }

    /**
     * Set the usingSdk property: Using SDK?.
     * 
     * @param usingSdk the usingSdk value to set.
     * @return the WebJobProperties object itself.
     */
    public WebJobProperties withUsingSdk(Boolean usingSdk) {
        this.usingSdk = usingSdk;
        return this;
    }

    /**
     * Get the settings property: Job settings.
     * 
     * @return the settings value.
     */
    public Map<String, Object> settings() {
        return this.settings;
    }

    /**
     * Set the settings property: Job settings.
     * 
     * @param settings the settings value to set.
     * @return the WebJobProperties object itself.
     */
    public WebJobProperties withSettings(Map<String, Object> settings) {
        this.settings = settings;
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
        jsonWriter.writeStringField("run_command", this.runCommand);
        jsonWriter.writeStringField("url", this.url);
        jsonWriter.writeStringField("extra_info_url", this.extraInfoUrl);
        jsonWriter.writeStringField("web_job_type", this.webJobType == null ? null : this.webJobType.toString());
        jsonWriter.writeStringField("error", this.error);
        jsonWriter.writeBooleanField("using_sdk", this.usingSdk);
        jsonWriter.writeMapField("settings", this.settings, (writer, element) -> writer.writeUntyped(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WebJobProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WebJobProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the WebJobProperties.
     */
    public static WebJobProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WebJobProperties deserializedWebJobProperties = new WebJobProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("run_command".equals(fieldName)) {
                    deserializedWebJobProperties.runCommand = reader.getString();
                } else if ("url".equals(fieldName)) {
                    deserializedWebJobProperties.url = reader.getString();
                } else if ("extra_info_url".equals(fieldName)) {
                    deserializedWebJobProperties.extraInfoUrl = reader.getString();
                } else if ("web_job_type".equals(fieldName)) {
                    deserializedWebJobProperties.webJobType = WebJobType.fromString(reader.getString());
                } else if ("error".equals(fieldName)) {
                    deserializedWebJobProperties.error = reader.getString();
                } else if ("using_sdk".equals(fieldName)) {
                    deserializedWebJobProperties.usingSdk = reader.getNullable(JsonReader::getBoolean);
                } else if ("settings".equals(fieldName)) {
                    Map<String, Object> settings = reader.readMap(reader1 -> reader1.readUntyped());
                    deserializedWebJobProperties.settings = settings;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWebJobProperties;
        });
    }
}
