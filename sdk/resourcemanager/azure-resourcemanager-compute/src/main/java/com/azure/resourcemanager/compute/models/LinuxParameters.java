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
import java.util.List;

/**
 * Input for InstallPatches on a Linux VM, as directly received by the API.
 */
@Fluent
public final class LinuxParameters implements JsonSerializable<LinuxParameters> {
    /*
     * The update classifications to select when installing patches for Linux.
     */
    private List<VMGuestPatchClassificationLinux> classificationsToInclude;

    /*
     * packages to include in the patch operation. Format: packageName_packageVersion
     */
    private List<String> packageNameMasksToInclude;

    /*
     * packages to exclude in the patch operation. Format: packageName_packageVersion
     */
    private List<String> packageNameMasksToExclude;

    /*
     * This is used as a maintenance run identifier for Auto VM Guest Patching in Linux.
     */
    private String maintenanceRunId;

    /**
     * Creates an instance of LinuxParameters class.
     */
    public LinuxParameters() {
    }

    /**
     * Get the classificationsToInclude property: The update classifications to select when installing patches for
     * Linux.
     * 
     * @return the classificationsToInclude value.
     */
    public List<VMGuestPatchClassificationLinux> classificationsToInclude() {
        return this.classificationsToInclude;
    }

    /**
     * Set the classificationsToInclude property: The update classifications to select when installing patches for
     * Linux.
     * 
     * @param classificationsToInclude the classificationsToInclude value to set.
     * @return the LinuxParameters object itself.
     */
    public LinuxParameters
        withClassificationsToInclude(List<VMGuestPatchClassificationLinux> classificationsToInclude) {
        this.classificationsToInclude = classificationsToInclude;
        return this;
    }

    /**
     * Get the packageNameMasksToInclude property: packages to include in the patch operation. Format:
     * packageName_packageVersion.
     * 
     * @return the packageNameMasksToInclude value.
     */
    public List<String> packageNameMasksToInclude() {
        return this.packageNameMasksToInclude;
    }

    /**
     * Set the packageNameMasksToInclude property: packages to include in the patch operation. Format:
     * packageName_packageVersion.
     * 
     * @param packageNameMasksToInclude the packageNameMasksToInclude value to set.
     * @return the LinuxParameters object itself.
     */
    public LinuxParameters withPackageNameMasksToInclude(List<String> packageNameMasksToInclude) {
        this.packageNameMasksToInclude = packageNameMasksToInclude;
        return this;
    }

    /**
     * Get the packageNameMasksToExclude property: packages to exclude in the patch operation. Format:
     * packageName_packageVersion.
     * 
     * @return the packageNameMasksToExclude value.
     */
    public List<String> packageNameMasksToExclude() {
        return this.packageNameMasksToExclude;
    }

    /**
     * Set the packageNameMasksToExclude property: packages to exclude in the patch operation. Format:
     * packageName_packageVersion.
     * 
     * @param packageNameMasksToExclude the packageNameMasksToExclude value to set.
     * @return the LinuxParameters object itself.
     */
    public LinuxParameters withPackageNameMasksToExclude(List<String> packageNameMasksToExclude) {
        this.packageNameMasksToExclude = packageNameMasksToExclude;
        return this;
    }

    /**
     * Get the maintenanceRunId property: This is used as a maintenance run identifier for Auto VM Guest Patching in
     * Linux.
     * 
     * @return the maintenanceRunId value.
     */
    public String maintenanceRunId() {
        return this.maintenanceRunId;
    }

    /**
     * Set the maintenanceRunId property: This is used as a maintenance run identifier for Auto VM Guest Patching in
     * Linux.
     * 
     * @param maintenanceRunId the maintenanceRunId value to set.
     * @return the LinuxParameters object itself.
     */
    public LinuxParameters withMaintenanceRunId(String maintenanceRunId) {
        this.maintenanceRunId = maintenanceRunId;
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
        jsonWriter.writeArrayField("classificationsToInclude", this.classificationsToInclude,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        jsonWriter.writeArrayField("packageNameMasksToInclude", this.packageNameMasksToInclude,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("packageNameMasksToExclude", this.packageNameMasksToExclude,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("maintenanceRunId", this.maintenanceRunId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LinuxParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LinuxParameters if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the LinuxParameters.
     */
    public static LinuxParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LinuxParameters deserializedLinuxParameters = new LinuxParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("classificationsToInclude".equals(fieldName)) {
                    List<VMGuestPatchClassificationLinux> classificationsToInclude
                        = reader.readArray(reader1 -> VMGuestPatchClassificationLinux.fromString(reader1.getString()));
                    deserializedLinuxParameters.classificationsToInclude = classificationsToInclude;
                } else if ("packageNameMasksToInclude".equals(fieldName)) {
                    List<String> packageNameMasksToInclude = reader.readArray(reader1 -> reader1.getString());
                    deserializedLinuxParameters.packageNameMasksToInclude = packageNameMasksToInclude;
                } else if ("packageNameMasksToExclude".equals(fieldName)) {
                    List<String> packageNameMasksToExclude = reader.readArray(reader1 -> reader1.getString());
                    deserializedLinuxParameters.packageNameMasksToExclude = packageNameMasksToExclude;
                } else if ("maintenanceRunId".equals(fieldName)) {
                    deserializedLinuxParameters.maintenanceRunId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLinuxParameters;
        });
    }
}
