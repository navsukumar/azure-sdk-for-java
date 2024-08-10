// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

/**
 * The publishing profile of a gallery image version.
 */
@Fluent
public final class GalleryApplicationVersionPublishingProfile extends GalleryArtifactPublishingProfileBase {
    /*
     * The source image from which the Image Version is going to be created.
     */
    private UserArtifactSource source;

    /*
     * The manageActions property.
     */
    private UserArtifactManage manageActions;

    /*
     * Additional settings for the VM app that contains the target package and config file name when it is deployed to
     * target VM or VM scale set.
     */
    private UserArtifactSettings settings;

    /*
     * Optional. Additional settings to pass to the vm-application-manager extension. For advanced use only.
     */
    private Map<String, String> advancedSettings;

    /*
     * Optional. Whether or not this application reports health.
     */
    private Boolean enableHealthCheck;

    /*
     * A list of custom actions that can be performed with this Gallery Application Version.
     */
    private List<GalleryApplicationCustomAction> customActions;

    /*
     * The timestamp for when the gallery image version is published.
     */
    private OffsetDateTime publishedDate;

    /**
     * Creates an instance of GalleryApplicationVersionPublishingProfile class.
     */
    public GalleryApplicationVersionPublishingProfile() {
    }

    /**
     * Get the source property: The source image from which the Image Version is going to be created.
     * 
     * @return the source value.
     */
    public UserArtifactSource source() {
        return this.source;
    }

    /**
     * Set the source property: The source image from which the Image Version is going to be created.
     * 
     * @param source the source value to set.
     * @return the GalleryApplicationVersionPublishingProfile object itself.
     */
    public GalleryApplicationVersionPublishingProfile withSource(UserArtifactSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the manageActions property: The manageActions property.
     * 
     * @return the manageActions value.
     */
    public UserArtifactManage manageActions() {
        return this.manageActions;
    }

    /**
     * Set the manageActions property: The manageActions property.
     * 
     * @param manageActions the manageActions value to set.
     * @return the GalleryApplicationVersionPublishingProfile object itself.
     */
    public GalleryApplicationVersionPublishingProfile withManageActions(UserArtifactManage manageActions) {
        this.manageActions = manageActions;
        return this;
    }

    /**
     * Get the settings property: Additional settings for the VM app that contains the target package and config file
     * name when it is deployed to target VM or VM scale set.
     * 
     * @return the settings value.
     */
    public UserArtifactSettings settings() {
        return this.settings;
    }

    /**
     * Set the settings property: Additional settings for the VM app that contains the target package and config file
     * name when it is deployed to target VM or VM scale set.
     * 
     * @param settings the settings value to set.
     * @return the GalleryApplicationVersionPublishingProfile object itself.
     */
    public GalleryApplicationVersionPublishingProfile withSettings(UserArtifactSettings settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Get the advancedSettings property: Optional. Additional settings to pass to the vm-application-manager extension.
     * For advanced use only.
     * 
     * @return the advancedSettings value.
     */
    public Map<String, String> advancedSettings() {
        return this.advancedSettings;
    }

    /**
     * Set the advancedSettings property: Optional. Additional settings to pass to the vm-application-manager extension.
     * For advanced use only.
     * 
     * @param advancedSettings the advancedSettings value to set.
     * @return the GalleryApplicationVersionPublishingProfile object itself.
     */
    public GalleryApplicationVersionPublishingProfile withAdvancedSettings(Map<String, String> advancedSettings) {
        this.advancedSettings = advancedSettings;
        return this;
    }

    /**
     * Get the enableHealthCheck property: Optional. Whether or not this application reports health.
     * 
     * @return the enableHealthCheck value.
     */
    public Boolean enableHealthCheck() {
        return this.enableHealthCheck;
    }

    /**
     * Set the enableHealthCheck property: Optional. Whether or not this application reports health.
     * 
     * @param enableHealthCheck the enableHealthCheck value to set.
     * @return the GalleryApplicationVersionPublishingProfile object itself.
     */
    public GalleryApplicationVersionPublishingProfile withEnableHealthCheck(Boolean enableHealthCheck) {
        this.enableHealthCheck = enableHealthCheck;
        return this;
    }

    /**
     * Get the customActions property: A list of custom actions that can be performed with this Gallery Application
     * Version.
     * 
     * @return the customActions value.
     */
    public List<GalleryApplicationCustomAction> customActions() {
        return this.customActions;
    }

    /**
     * Set the customActions property: A list of custom actions that can be performed with this Gallery Application
     * Version.
     * 
     * @param customActions the customActions value to set.
     * @return the GalleryApplicationVersionPublishingProfile object itself.
     */
    public GalleryApplicationVersionPublishingProfile
        withCustomActions(List<GalleryApplicationCustomAction> customActions) {
        this.customActions = customActions;
        return this;
    }

    /**
     * Get the publishedDate property: The timestamp for when the gallery image version is published.
     * 
     * @return the publishedDate value.
     */
    @Override
    public OffsetDateTime publishedDate() {
        return this.publishedDate;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GalleryApplicationVersionPublishingProfile withTargetRegions(List<TargetRegion> targetRegions) {
        super.withTargetRegions(targetRegions);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GalleryApplicationVersionPublishingProfile withReplicaCount(Integer replicaCount) {
        super.withReplicaCount(replicaCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GalleryApplicationVersionPublishingProfile withExcludeFromLatest(Boolean excludeFromLatest) {
        super.withExcludeFromLatest(excludeFromLatest);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GalleryApplicationVersionPublishingProfile withEndOfLifeDate(OffsetDateTime endOfLifeDate) {
        super.withEndOfLifeDate(endOfLifeDate);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GalleryApplicationVersionPublishingProfile withStorageAccountType(StorageAccountType storageAccountType) {
        super.withStorageAccountType(storageAccountType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GalleryApplicationVersionPublishingProfile withReplicationMode(ReplicationMode replicationMode) {
        super.withReplicationMode(replicationMode);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GalleryApplicationVersionPublishingProfile
        withTargetExtendedLocations(List<GalleryTargetExtendedLocation> targetExtendedLocations) {
        super.withTargetExtendedLocations(targetExtendedLocations);
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
        if (source() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property source in model GalleryApplicationVersionPublishingProfile"));
        } else {
            source().validate();
        }
        if (manageActions() != null) {
            manageActions().validate();
        }
        if (settings() != null) {
            settings().validate();
        }
        if (customActions() != null) {
            customActions().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GalleryApplicationVersionPublishingProfile.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("targetRegions", targetRegions(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeNumberField("replicaCount", replicaCount());
        jsonWriter.writeBooleanField("excludeFromLatest", excludeFromLatest());
        jsonWriter.writeStringField("endOfLifeDate",
            endOfLifeDate() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(endOfLifeDate()));
        jsonWriter.writeStringField("storageAccountType",
            storageAccountType() == null ? null : storageAccountType().toString());
        jsonWriter.writeStringField("replicationMode", replicationMode() == null ? null : replicationMode().toString());
        jsonWriter.writeArrayField("targetExtendedLocations", targetExtendedLocations(),
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("source", this.source);
        jsonWriter.writeJsonField("manageActions", this.manageActions);
        jsonWriter.writeJsonField("settings", this.settings);
        jsonWriter.writeMapField("advancedSettings", this.advancedSettings,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeBooleanField("enableHealthCheck", this.enableHealthCheck);
        jsonWriter.writeArrayField("customActions", this.customActions, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GalleryApplicationVersionPublishingProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GalleryApplicationVersionPublishingProfile if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the GalleryApplicationVersionPublishingProfile.
     */
    public static GalleryApplicationVersionPublishingProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GalleryApplicationVersionPublishingProfile deserializedGalleryApplicationVersionPublishingProfile
                = new GalleryApplicationVersionPublishingProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("targetRegions".equals(fieldName)) {
                    List<TargetRegion> targetRegions = reader.readArray(reader1 -> TargetRegion.fromJson(reader1));
                    deserializedGalleryApplicationVersionPublishingProfile.withTargetRegions(targetRegions);
                } else if ("replicaCount".equals(fieldName)) {
                    deserializedGalleryApplicationVersionPublishingProfile
                        .withReplicaCount(reader.getNullable(JsonReader::getInt));
                } else if ("excludeFromLatest".equals(fieldName)) {
                    deserializedGalleryApplicationVersionPublishingProfile
                        .withExcludeFromLatest(reader.getNullable(JsonReader::getBoolean));
                } else if ("publishedDate".equals(fieldName)) {
                    deserializedGalleryApplicationVersionPublishingProfile.publishedDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("endOfLifeDate".equals(fieldName)) {
                    deserializedGalleryApplicationVersionPublishingProfile.withEndOfLifeDate(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("storageAccountType".equals(fieldName)) {
                    deserializedGalleryApplicationVersionPublishingProfile
                        .withStorageAccountType(StorageAccountType.fromString(reader.getString()));
                } else if ("replicationMode".equals(fieldName)) {
                    deserializedGalleryApplicationVersionPublishingProfile
                        .withReplicationMode(ReplicationMode.fromString(reader.getString()));
                } else if ("targetExtendedLocations".equals(fieldName)) {
                    List<GalleryTargetExtendedLocation> targetExtendedLocations
                        = reader.readArray(reader1 -> GalleryTargetExtendedLocation.fromJson(reader1));
                    deserializedGalleryApplicationVersionPublishingProfile
                        .withTargetExtendedLocations(targetExtendedLocations);
                } else if ("source".equals(fieldName)) {
                    deserializedGalleryApplicationVersionPublishingProfile.source = UserArtifactSource.fromJson(reader);
                } else if ("manageActions".equals(fieldName)) {
                    deserializedGalleryApplicationVersionPublishingProfile.manageActions
                        = UserArtifactManage.fromJson(reader);
                } else if ("settings".equals(fieldName)) {
                    deserializedGalleryApplicationVersionPublishingProfile.settings
                        = UserArtifactSettings.fromJson(reader);
                } else if ("advancedSettings".equals(fieldName)) {
                    Map<String, String> advancedSettings = reader.readMap(reader1 -> reader1.getString());
                    deserializedGalleryApplicationVersionPublishingProfile.advancedSettings = advancedSettings;
                } else if ("enableHealthCheck".equals(fieldName)) {
                    deserializedGalleryApplicationVersionPublishingProfile.enableHealthCheck
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("customActions".equals(fieldName)) {
                    List<GalleryApplicationCustomAction> customActions
                        = reader.readArray(reader1 -> GalleryApplicationCustomAction.fromJson(reader1));
                    deserializedGalleryApplicationVersionPublishingProfile.customActions = customActions;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGalleryApplicationVersionPublishingProfile;
        });
    }
}
