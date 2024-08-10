// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Specifies additional settings to be applied when patch mode AutomaticByPlatform is selected in Linux patch settings.
 */
@Fluent
public final class LinuxVMGuestPatchAutomaticByPlatformSettings
    implements JsonSerializable<LinuxVMGuestPatchAutomaticByPlatformSettings> {
    /*
     * Specifies the reboot setting for all AutomaticByPlatform patch installation operations.
     */
    private LinuxVMGuestPatchAutomaticByPlatformRebootSetting rebootSetting;

    /*
     * Enables customer to schedule patching without accidental upgrades
     */
    private Boolean bypassPlatformSafetyChecksOnUserSchedule;

    /**
     * Creates an instance of LinuxVMGuestPatchAutomaticByPlatformSettings class.
     */
    public LinuxVMGuestPatchAutomaticByPlatformSettings() {
    }

    /**
     * Get the rebootSetting property: Specifies the reboot setting for all AutomaticByPlatform patch installation
     * operations.
     * 
     * @return the rebootSetting value.
     */
    public LinuxVMGuestPatchAutomaticByPlatformRebootSetting rebootSetting() {
        return this.rebootSetting;
    }

    /**
     * Set the rebootSetting property: Specifies the reboot setting for all AutomaticByPlatform patch installation
     * operations.
     * 
     * @param rebootSetting the rebootSetting value to set.
     * @return the LinuxVMGuestPatchAutomaticByPlatformSettings object itself.
     */
    public LinuxVMGuestPatchAutomaticByPlatformSettings
        withRebootSetting(LinuxVMGuestPatchAutomaticByPlatformRebootSetting rebootSetting) {
        this.rebootSetting = rebootSetting;
        return this;
    }

    /**
     * Get the bypassPlatformSafetyChecksOnUserSchedule property: Enables customer to schedule patching without
     * accidental upgrades.
     * 
     * @return the bypassPlatformSafetyChecksOnUserSchedule value.
     */
    public Boolean bypassPlatformSafetyChecksOnUserSchedule() {
        return this.bypassPlatformSafetyChecksOnUserSchedule;
    }

    /**
     * Set the bypassPlatformSafetyChecksOnUserSchedule property: Enables customer to schedule patching without
     * accidental upgrades.
     * 
     * @param bypassPlatformSafetyChecksOnUserSchedule the bypassPlatformSafetyChecksOnUserSchedule value to set.
     * @return the LinuxVMGuestPatchAutomaticByPlatformSettings object itself.
     */
    public LinuxVMGuestPatchAutomaticByPlatformSettings
        withBypassPlatformSafetyChecksOnUserSchedule(Boolean bypassPlatformSafetyChecksOnUserSchedule) {
        this.bypassPlatformSafetyChecksOnUserSchedule = bypassPlatformSafetyChecksOnUserSchedule;
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
        jsonWriter.writeStringField("rebootSetting", this.rebootSetting == null ? null : this.rebootSetting.toString());
        jsonWriter.writeBooleanField("bypassPlatformSafetyChecksOnUserSchedule",
            this.bypassPlatformSafetyChecksOnUserSchedule);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LinuxVMGuestPatchAutomaticByPlatformSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LinuxVMGuestPatchAutomaticByPlatformSettings if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LinuxVMGuestPatchAutomaticByPlatformSettings.
     */
    public static LinuxVMGuestPatchAutomaticByPlatformSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LinuxVMGuestPatchAutomaticByPlatformSettings deserializedLinuxVMGuestPatchAutomaticByPlatformSettings
                = new LinuxVMGuestPatchAutomaticByPlatformSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("rebootSetting".equals(fieldName)) {
                    deserializedLinuxVMGuestPatchAutomaticByPlatformSettings.rebootSetting
                        = LinuxVMGuestPatchAutomaticByPlatformRebootSetting.fromString(reader.getString());
                } else if ("bypassPlatformSafetyChecksOnUserSchedule".equals(fieldName)) {
                    deserializedLinuxVMGuestPatchAutomaticByPlatformSettings.bypassPlatformSafetyChecksOnUserSchedule
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLinuxVMGuestPatchAutomaticByPlatformSettings;
        });
    }
}
