// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.models.SiteExtensionType;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * SiteExtensionInfo resource specific properties.
 */
@Fluent
public final class SiteExtensionInfoProperties implements JsonSerializable<SiteExtensionInfoProperties> {
    /*
     * Site extension ID.
     */
    private String extensionId;

    /*
     * The title property.
     */
    private String title;

    /*
     * Site extension type.
     */
    private SiteExtensionType extensionType;

    /*
     * Summary description.
     */
    private String summary;

    /*
     * Detailed description.
     */
    private String description;

    /*
     * Version information.
     */
    private String version;

    /*
     * Extension URL.
     */
    private String extensionUrl;

    /*
     * Project URL.
     */
    private String projectUrl;

    /*
     * Icon URL.
     */
    private String iconUrl;

    /*
     * License URL.
     */
    private String licenseUrl;

    /*
     * Feed URL.
     */
    private String feedUrl;

    /*
     * List of authors.
     */
    private List<String> authors;

    /*
     * Installer command line parameters.
     */
    private String installerCommandLineParams;

    /*
     * Published timestamp.
     */
    private OffsetDateTime publishedDateTime;

    /*
     * Count of downloads.
     */
    private Integer downloadCount;

    /*
     * <code>true</code> if the local version is the latest version; <code>false</code> otherwise.
     */
    private Boolean localIsLatestVersion;

    /*
     * Local path.
     */
    private String localPath;

    /*
     * Installed timestamp.
     */
    private OffsetDateTime installedDateTime;

    /*
     * Provisioning state.
     */
    private String provisioningState;

    /*
     * Site Extension comment.
     */
    private String comment;

    /**
     * Creates an instance of SiteExtensionInfoProperties class.
     */
    public SiteExtensionInfoProperties() {
    }

    /**
     * Get the extensionId property: Site extension ID.
     * 
     * @return the extensionId value.
     */
    public String extensionId() {
        return this.extensionId;
    }

    /**
     * Set the extensionId property: Site extension ID.
     * 
     * @param extensionId the extensionId value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withExtensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    /**
     * Get the title property: The title property.
     * 
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title property: The title property.
     * 
     * @param title the title value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the extensionType property: Site extension type.
     * 
     * @return the extensionType value.
     */
    public SiteExtensionType extensionType() {
        return this.extensionType;
    }

    /**
     * Set the extensionType property: Site extension type.
     * 
     * @param extensionType the extensionType value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withExtensionType(SiteExtensionType extensionType) {
        this.extensionType = extensionType;
        return this;
    }

    /**
     * Get the summary property: Summary description.
     * 
     * @return the summary value.
     */
    public String summary() {
        return this.summary;
    }

    /**
     * Set the summary property: Summary description.
     * 
     * @param summary the summary value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Get the description property: Detailed description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Detailed description.
     * 
     * @param description the description value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the version property: Version information.
     * 
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Version information.
     * 
     * @param version the version value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the extensionUrl property: Extension URL.
     * 
     * @return the extensionUrl value.
     */
    public String extensionUrl() {
        return this.extensionUrl;
    }

    /**
     * Set the extensionUrl property: Extension URL.
     * 
     * @param extensionUrl the extensionUrl value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withExtensionUrl(String extensionUrl) {
        this.extensionUrl = extensionUrl;
        return this;
    }

    /**
     * Get the projectUrl property: Project URL.
     * 
     * @return the projectUrl value.
     */
    public String projectUrl() {
        return this.projectUrl;
    }

    /**
     * Set the projectUrl property: Project URL.
     * 
     * @param projectUrl the projectUrl value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withProjectUrl(String projectUrl) {
        this.projectUrl = projectUrl;
        return this;
    }

    /**
     * Get the iconUrl property: Icon URL.
     * 
     * @return the iconUrl value.
     */
    public String iconUrl() {
        return this.iconUrl;
    }

    /**
     * Set the iconUrl property: Icon URL.
     * 
     * @param iconUrl the iconUrl value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    /**
     * Get the licenseUrl property: License URL.
     * 
     * @return the licenseUrl value.
     */
    public String licenseUrl() {
        return this.licenseUrl;
    }

    /**
     * Set the licenseUrl property: License URL.
     * 
     * @param licenseUrl the licenseUrl value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl;
        return this;
    }

    /**
     * Get the feedUrl property: Feed URL.
     * 
     * @return the feedUrl value.
     */
    public String feedUrl() {
        return this.feedUrl;
    }

    /**
     * Set the feedUrl property: Feed URL.
     * 
     * @param feedUrl the feedUrl value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withFeedUrl(String feedUrl) {
        this.feedUrl = feedUrl;
        return this;
    }

    /**
     * Get the authors property: List of authors.
     * 
     * @return the authors value.
     */
    public List<String> authors() {
        return this.authors;
    }

    /**
     * Set the authors property: List of authors.
     * 
     * @param authors the authors value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withAuthors(List<String> authors) {
        this.authors = authors;
        return this;
    }

    /**
     * Get the installerCommandLineParams property: Installer command line parameters.
     * 
     * @return the installerCommandLineParams value.
     */
    public String installerCommandLineParams() {
        return this.installerCommandLineParams;
    }

    /**
     * Set the installerCommandLineParams property: Installer command line parameters.
     * 
     * @param installerCommandLineParams the installerCommandLineParams value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withInstallerCommandLineParams(String installerCommandLineParams) {
        this.installerCommandLineParams = installerCommandLineParams;
        return this;
    }

    /**
     * Get the publishedDateTime property: Published timestamp.
     * 
     * @return the publishedDateTime value.
     */
    public OffsetDateTime publishedDateTime() {
        return this.publishedDateTime;
    }

    /**
     * Set the publishedDateTime property: Published timestamp.
     * 
     * @param publishedDateTime the publishedDateTime value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withPublishedDateTime(OffsetDateTime publishedDateTime) {
        this.publishedDateTime = publishedDateTime;
        return this;
    }

    /**
     * Get the downloadCount property: Count of downloads.
     * 
     * @return the downloadCount value.
     */
    public Integer downloadCount() {
        return this.downloadCount;
    }

    /**
     * Set the downloadCount property: Count of downloads.
     * 
     * @param downloadCount the downloadCount value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
        return this;
    }

    /**
     * Get the localIsLatestVersion property: &lt;code&gt;true&lt;/code&gt; if the local version is the latest version;
     * &lt;code&gt;false&lt;/code&gt; otherwise.
     * 
     * @return the localIsLatestVersion value.
     */
    public Boolean localIsLatestVersion() {
        return this.localIsLatestVersion;
    }

    /**
     * Set the localIsLatestVersion property: &lt;code&gt;true&lt;/code&gt; if the local version is the latest version;
     * &lt;code&gt;false&lt;/code&gt; otherwise.
     * 
     * @param localIsLatestVersion the localIsLatestVersion value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withLocalIsLatestVersion(Boolean localIsLatestVersion) {
        this.localIsLatestVersion = localIsLatestVersion;
        return this;
    }

    /**
     * Get the localPath property: Local path.
     * 
     * @return the localPath value.
     */
    public String localPath() {
        return this.localPath;
    }

    /**
     * Set the localPath property: Local path.
     * 
     * @param localPath the localPath value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withLocalPath(String localPath) {
        this.localPath = localPath;
        return this;
    }

    /**
     * Get the installedDateTime property: Installed timestamp.
     * 
     * @return the installedDateTime value.
     */
    public OffsetDateTime installedDateTime() {
        return this.installedDateTime;
    }

    /**
     * Set the installedDateTime property: Installed timestamp.
     * 
     * @param installedDateTime the installedDateTime value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withInstalledDateTime(OffsetDateTime installedDateTime) {
        this.installedDateTime = installedDateTime;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning state.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the comment property: Site Extension comment.
     * 
     * @return the comment value.
     */
    public String comment() {
        return this.comment;
    }

    /**
     * Set the comment property: Site Extension comment.
     * 
     * @param comment the comment value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withComment(String comment) {
        this.comment = comment;
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
        jsonWriter.writeStringField("extension_id", this.extensionId);
        jsonWriter.writeStringField("title", this.title);
        jsonWriter.writeStringField("extension_type",
            this.extensionType == null ? null : this.extensionType.toString());
        jsonWriter.writeStringField("summary", this.summary);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("version", this.version);
        jsonWriter.writeStringField("extension_url", this.extensionUrl);
        jsonWriter.writeStringField("project_url", this.projectUrl);
        jsonWriter.writeStringField("icon_url", this.iconUrl);
        jsonWriter.writeStringField("license_url", this.licenseUrl);
        jsonWriter.writeStringField("feed_url", this.feedUrl);
        jsonWriter.writeArrayField("authors", this.authors, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("installer_command_line_params", this.installerCommandLineParams);
        jsonWriter.writeStringField("published_date_time",
            this.publishedDateTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.publishedDateTime));
        jsonWriter.writeNumberField("download_count", this.downloadCount);
        jsonWriter.writeBooleanField("local_is_latest_version", this.localIsLatestVersion);
        jsonWriter.writeStringField("local_path", this.localPath);
        jsonWriter.writeStringField("installed_date_time",
            this.installedDateTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.installedDateTime));
        jsonWriter.writeStringField("provisioningState", this.provisioningState);
        jsonWriter.writeStringField("comment", this.comment);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SiteExtensionInfoProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SiteExtensionInfoProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SiteExtensionInfoProperties.
     */
    public static SiteExtensionInfoProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SiteExtensionInfoProperties deserializedSiteExtensionInfoProperties = new SiteExtensionInfoProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("extension_id".equals(fieldName)) {
                    deserializedSiteExtensionInfoProperties.extensionId = reader.getString();
                } else if ("title".equals(fieldName)) {
                    deserializedSiteExtensionInfoProperties.title = reader.getString();
                } else if ("extension_type".equals(fieldName)) {
                    deserializedSiteExtensionInfoProperties.extensionType
                        = SiteExtensionType.fromString(reader.getString());
                } else if ("summary".equals(fieldName)) {
                    deserializedSiteExtensionInfoProperties.summary = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedSiteExtensionInfoProperties.description = reader.getString();
                } else if ("version".equals(fieldName)) {
                    deserializedSiteExtensionInfoProperties.version = reader.getString();
                } else if ("extension_url".equals(fieldName)) {
                    deserializedSiteExtensionInfoProperties.extensionUrl = reader.getString();
                } else if ("project_url".equals(fieldName)) {
                    deserializedSiteExtensionInfoProperties.projectUrl = reader.getString();
                } else if ("icon_url".equals(fieldName)) {
                    deserializedSiteExtensionInfoProperties.iconUrl = reader.getString();
                } else if ("license_url".equals(fieldName)) {
                    deserializedSiteExtensionInfoProperties.licenseUrl = reader.getString();
                } else if ("feed_url".equals(fieldName)) {
                    deserializedSiteExtensionInfoProperties.feedUrl = reader.getString();
                } else if ("authors".equals(fieldName)) {
                    List<String> authors = reader.readArray(reader1 -> reader1.getString());
                    deserializedSiteExtensionInfoProperties.authors = authors;
                } else if ("installer_command_line_params".equals(fieldName)) {
                    deserializedSiteExtensionInfoProperties.installerCommandLineParams = reader.getString();
                } else if ("published_date_time".equals(fieldName)) {
                    deserializedSiteExtensionInfoProperties.publishedDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("download_count".equals(fieldName)) {
                    deserializedSiteExtensionInfoProperties.downloadCount = reader.getNullable(JsonReader::getInt);
                } else if ("local_is_latest_version".equals(fieldName)) {
                    deserializedSiteExtensionInfoProperties.localIsLatestVersion
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("local_path".equals(fieldName)) {
                    deserializedSiteExtensionInfoProperties.localPath = reader.getString();
                } else if ("installed_date_time".equals(fieldName)) {
                    deserializedSiteExtensionInfoProperties.installedDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedSiteExtensionInfoProperties.provisioningState = reader.getString();
                } else if ("comment".equals(fieldName)) {
                    deserializedSiteExtensionInfoProperties.comment = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSiteExtensionInfoProperties;
        });
    }
}
