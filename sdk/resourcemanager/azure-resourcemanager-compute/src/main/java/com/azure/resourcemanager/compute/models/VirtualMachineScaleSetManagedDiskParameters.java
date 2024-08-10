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
 * Describes the parameters of a ScaleSet managed disk.
 */
@Fluent
public final class VirtualMachineScaleSetManagedDiskParameters
    implements JsonSerializable<VirtualMachineScaleSetManagedDiskParameters> {
    /*
     * Specifies the storage account type for the managed disk. NOTE: UltraSSD_LRS can only be used with data disks, it
     * cannot be used with OS Disk.
     */
    private StorageAccountTypes storageAccountType;

    /*
     * Specifies the customer managed disk encryption set resource id for the managed disk.
     */
    private DiskEncryptionSetParameters diskEncryptionSet;

    /*
     * Specifies the security profile for the managed disk.
     */
    private VMDiskSecurityProfile securityProfile;

    /**
     * Creates an instance of VirtualMachineScaleSetManagedDiskParameters class.
     */
    public VirtualMachineScaleSetManagedDiskParameters() {
    }

    /**
     * Get the storageAccountType property: Specifies the storage account type for the managed disk. NOTE: UltraSSD_LRS
     * can only be used with data disks, it cannot be used with OS Disk.
     * 
     * @return the storageAccountType value.
     */
    public StorageAccountTypes storageAccountType() {
        return this.storageAccountType;
    }

    /**
     * Set the storageAccountType property: Specifies the storage account type for the managed disk. NOTE: UltraSSD_LRS
     * can only be used with data disks, it cannot be used with OS Disk.
     * 
     * @param storageAccountType the storageAccountType value to set.
     * @return the VirtualMachineScaleSetManagedDiskParameters object itself.
     */
    public VirtualMachineScaleSetManagedDiskParameters withStorageAccountType(StorageAccountTypes storageAccountType) {
        this.storageAccountType = storageAccountType;
        return this;
    }

    /**
     * Get the diskEncryptionSet property: Specifies the customer managed disk encryption set resource id for the
     * managed disk.
     * 
     * @return the diskEncryptionSet value.
     */
    public DiskEncryptionSetParameters diskEncryptionSet() {
        return this.diskEncryptionSet;
    }

    /**
     * Set the diskEncryptionSet property: Specifies the customer managed disk encryption set resource id for the
     * managed disk.
     * 
     * @param diskEncryptionSet the diskEncryptionSet value to set.
     * @return the VirtualMachineScaleSetManagedDiskParameters object itself.
     */
    public VirtualMachineScaleSetManagedDiskParameters
        withDiskEncryptionSet(DiskEncryptionSetParameters diskEncryptionSet) {
        this.diskEncryptionSet = diskEncryptionSet;
        return this;
    }

    /**
     * Get the securityProfile property: Specifies the security profile for the managed disk.
     * 
     * @return the securityProfile value.
     */
    public VMDiskSecurityProfile securityProfile() {
        return this.securityProfile;
    }

    /**
     * Set the securityProfile property: Specifies the security profile for the managed disk.
     * 
     * @param securityProfile the securityProfile value to set.
     * @return the VirtualMachineScaleSetManagedDiskParameters object itself.
     */
    public VirtualMachineScaleSetManagedDiskParameters withSecurityProfile(VMDiskSecurityProfile securityProfile) {
        this.securityProfile = securityProfile;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (diskEncryptionSet() != null) {
            diskEncryptionSet().validate();
        }
        if (securityProfile() != null) {
            securityProfile().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("storageAccountType",
            this.storageAccountType == null ? null : this.storageAccountType.toString());
        jsonWriter.writeJsonField("diskEncryptionSet", this.diskEncryptionSet);
        jsonWriter.writeJsonField("securityProfile", this.securityProfile);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualMachineScaleSetManagedDiskParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualMachineScaleSetManagedDiskParameters if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualMachineScaleSetManagedDiskParameters.
     */
    public static VirtualMachineScaleSetManagedDiskParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualMachineScaleSetManagedDiskParameters deserializedVirtualMachineScaleSetManagedDiskParameters
                = new VirtualMachineScaleSetManagedDiskParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("storageAccountType".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetManagedDiskParameters.storageAccountType
                        = StorageAccountTypes.fromString(reader.getString());
                } else if ("diskEncryptionSet".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetManagedDiskParameters.diskEncryptionSet
                        = DiskEncryptionSetParameters.fromJson(reader);
                } else if ("securityProfile".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetManagedDiskParameters.securityProfile
                        = VMDiskSecurityProfile.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualMachineScaleSetManagedDiskParameters;
        });
    }
}
