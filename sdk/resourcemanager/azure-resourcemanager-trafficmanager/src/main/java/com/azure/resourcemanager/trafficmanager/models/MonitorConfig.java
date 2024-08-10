// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.trafficmanager.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Class containing endpoint monitoring settings in a Traffic Manager profile.
 */
@Fluent
public final class MonitorConfig implements JsonSerializable<MonitorConfig> {
    /*
     * The profile-level monitoring status of the Traffic Manager profile.
     */
    private ProfileMonitorStatus profileMonitorStatus;

    /*
     * The protocol (HTTP, HTTPS or TCP) used to probe for endpoint health.
     */
    private MonitorProtocol protocol;

    /*
     * The TCP port used to probe for endpoint health.
     */
    private Long port;

    /*
     * The path relative to the endpoint domain name used to probe for endpoint health.
     */
    private String path;

    /*
     * The monitor interval for endpoints in this profile. This is the interval at which Traffic Manager will check the
     * health of each endpoint in this profile.
     */
    private Long intervalInSeconds;

    /*
     * The monitor timeout for endpoints in this profile. This is the time that Traffic Manager allows endpoints in this
     * profile to response to the health check.
     */
    private Long timeoutInSeconds;

    /*
     * The number of consecutive failed health check that Traffic Manager tolerates before declaring an endpoint in this
     * profile Degraded after the next failed health check.
     */
    private Long toleratedNumberOfFailures;

    /*
     * List of custom headers.
     */
    private List<MonitorConfigCustomHeadersItem> customHeaders;

    /*
     * List of expected status code ranges.
     */
    private List<MonitorConfigExpectedStatusCodeRangesItem> expectedStatusCodeRanges;

    /**
     * Creates an instance of MonitorConfig class.
     */
    public MonitorConfig() {
    }

    /**
     * Get the profileMonitorStatus property: The profile-level monitoring status of the Traffic Manager profile.
     * 
     * @return the profileMonitorStatus value.
     */
    public ProfileMonitorStatus profileMonitorStatus() {
        return this.profileMonitorStatus;
    }

    /**
     * Set the profileMonitorStatus property: The profile-level monitoring status of the Traffic Manager profile.
     * 
     * @param profileMonitorStatus the profileMonitorStatus value to set.
     * @return the MonitorConfig object itself.
     */
    public MonitorConfig withProfileMonitorStatus(ProfileMonitorStatus profileMonitorStatus) {
        this.profileMonitorStatus = profileMonitorStatus;
        return this;
    }

    /**
     * Get the protocol property: The protocol (HTTP, HTTPS or TCP) used to probe for endpoint health.
     * 
     * @return the protocol value.
     */
    public MonitorProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: The protocol (HTTP, HTTPS or TCP) used to probe for endpoint health.
     * 
     * @param protocol the protocol value to set.
     * @return the MonitorConfig object itself.
     */
    public MonitorConfig withProtocol(MonitorProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the port property: The TCP port used to probe for endpoint health.
     * 
     * @return the port value.
     */
    public Long port() {
        return this.port;
    }

    /**
     * Set the port property: The TCP port used to probe for endpoint health.
     * 
     * @param port the port value to set.
     * @return the MonitorConfig object itself.
     */
    public MonitorConfig withPort(Long port) {
        this.port = port;
        return this;
    }

    /**
     * Get the path property: The path relative to the endpoint domain name used to probe for endpoint health.
     * 
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: The path relative to the endpoint domain name used to probe for endpoint health.
     * 
     * @param path the path value to set.
     * @return the MonitorConfig object itself.
     */
    public MonitorConfig withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the intervalInSeconds property: The monitor interval for endpoints in this profile. This is the interval at
     * which Traffic Manager will check the health of each endpoint in this profile.
     * 
     * @return the intervalInSeconds value.
     */
    public Long intervalInSeconds() {
        return this.intervalInSeconds;
    }

    /**
     * Set the intervalInSeconds property: The monitor interval for endpoints in this profile. This is the interval at
     * which Traffic Manager will check the health of each endpoint in this profile.
     * 
     * @param intervalInSeconds the intervalInSeconds value to set.
     * @return the MonitorConfig object itself.
     */
    public MonitorConfig withIntervalInSeconds(Long intervalInSeconds) {
        this.intervalInSeconds = intervalInSeconds;
        return this;
    }

    /**
     * Get the timeoutInSeconds property: The monitor timeout for endpoints in this profile. This is the time that
     * Traffic Manager allows endpoints in this profile to response to the health check.
     * 
     * @return the timeoutInSeconds value.
     */
    public Long timeoutInSeconds() {
        return this.timeoutInSeconds;
    }

    /**
     * Set the timeoutInSeconds property: The monitor timeout for endpoints in this profile. This is the time that
     * Traffic Manager allows endpoints in this profile to response to the health check.
     * 
     * @param timeoutInSeconds the timeoutInSeconds value to set.
     * @return the MonitorConfig object itself.
     */
    public MonitorConfig withTimeoutInSeconds(Long timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
        return this;
    }

    /**
     * Get the toleratedNumberOfFailures property: The number of consecutive failed health check that Traffic Manager
     * tolerates before declaring an endpoint in this profile Degraded after the next failed health check.
     * 
     * @return the toleratedNumberOfFailures value.
     */
    public Long toleratedNumberOfFailures() {
        return this.toleratedNumberOfFailures;
    }

    /**
     * Set the toleratedNumberOfFailures property: The number of consecutive failed health check that Traffic Manager
     * tolerates before declaring an endpoint in this profile Degraded after the next failed health check.
     * 
     * @param toleratedNumberOfFailures the toleratedNumberOfFailures value to set.
     * @return the MonitorConfig object itself.
     */
    public MonitorConfig withToleratedNumberOfFailures(Long toleratedNumberOfFailures) {
        this.toleratedNumberOfFailures = toleratedNumberOfFailures;
        return this;
    }

    /**
     * Get the customHeaders property: List of custom headers.
     * 
     * @return the customHeaders value.
     */
    public List<MonitorConfigCustomHeadersItem> customHeaders() {
        return this.customHeaders;
    }

    /**
     * Set the customHeaders property: List of custom headers.
     * 
     * @param customHeaders the customHeaders value to set.
     * @return the MonitorConfig object itself.
     */
    public MonitorConfig withCustomHeaders(List<MonitorConfigCustomHeadersItem> customHeaders) {
        this.customHeaders = customHeaders;
        return this;
    }

    /**
     * Get the expectedStatusCodeRanges property: List of expected status code ranges.
     * 
     * @return the expectedStatusCodeRanges value.
     */
    public List<MonitorConfigExpectedStatusCodeRangesItem> expectedStatusCodeRanges() {
        return this.expectedStatusCodeRanges;
    }

    /**
     * Set the expectedStatusCodeRanges property: List of expected status code ranges.
     * 
     * @param expectedStatusCodeRanges the expectedStatusCodeRanges value to set.
     * @return the MonitorConfig object itself.
     */
    public MonitorConfig
        withExpectedStatusCodeRanges(List<MonitorConfigExpectedStatusCodeRangesItem> expectedStatusCodeRanges) {
        this.expectedStatusCodeRanges = expectedStatusCodeRanges;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (customHeaders() != null) {
            customHeaders().forEach(e -> e.validate());
        }
        if (expectedStatusCodeRanges() != null) {
            expectedStatusCodeRanges().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("profileMonitorStatus",
            this.profileMonitorStatus == null ? null : this.profileMonitorStatus.toString());
        jsonWriter.writeStringField("protocol", this.protocol == null ? null : this.protocol.toString());
        jsonWriter.writeNumberField("port", this.port);
        jsonWriter.writeStringField("path", this.path);
        jsonWriter.writeNumberField("intervalInSeconds", this.intervalInSeconds);
        jsonWriter.writeNumberField("timeoutInSeconds", this.timeoutInSeconds);
        jsonWriter.writeNumberField("toleratedNumberOfFailures", this.toleratedNumberOfFailures);
        jsonWriter.writeArrayField("customHeaders", this.customHeaders, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("expectedStatusCodeRanges", this.expectedStatusCodeRanges,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MonitorConfig from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MonitorConfig if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MonitorConfig.
     */
    public static MonitorConfig fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MonitorConfig deserializedMonitorConfig = new MonitorConfig();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("profileMonitorStatus".equals(fieldName)) {
                    deserializedMonitorConfig.profileMonitorStatus
                        = ProfileMonitorStatus.fromString(reader.getString());
                } else if ("protocol".equals(fieldName)) {
                    deserializedMonitorConfig.protocol = MonitorProtocol.fromString(reader.getString());
                } else if ("port".equals(fieldName)) {
                    deserializedMonitorConfig.port = reader.getNullable(JsonReader::getLong);
                } else if ("path".equals(fieldName)) {
                    deserializedMonitorConfig.path = reader.getString();
                } else if ("intervalInSeconds".equals(fieldName)) {
                    deserializedMonitorConfig.intervalInSeconds = reader.getNullable(JsonReader::getLong);
                } else if ("timeoutInSeconds".equals(fieldName)) {
                    deserializedMonitorConfig.timeoutInSeconds = reader.getNullable(JsonReader::getLong);
                } else if ("toleratedNumberOfFailures".equals(fieldName)) {
                    deserializedMonitorConfig.toleratedNumberOfFailures = reader.getNullable(JsonReader::getLong);
                } else if ("customHeaders".equals(fieldName)) {
                    List<MonitorConfigCustomHeadersItem> customHeaders
                        = reader.readArray(reader1 -> MonitorConfigCustomHeadersItem.fromJson(reader1));
                    deserializedMonitorConfig.customHeaders = customHeaders;
                } else if ("expectedStatusCodeRanges".equals(fieldName)) {
                    List<MonitorConfigExpectedStatusCodeRangesItem> expectedStatusCodeRanges
                        = reader.readArray(reader1 -> MonitorConfigExpectedStatusCodeRangesItem.fromJson(reader1));
                    deserializedMonitorConfig.expectedStatusCodeRanges = expectedStatusCodeRanges;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMonitorConfig;
        });
    }
}
