// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.compute.models.DataAccessAuthMode;
import com.azure.resourcemanager.compute.models.Encryption;
import com.azure.resourcemanager.compute.models.EncryptionSettingsCollection;
import com.azure.resourcemanager.compute.models.NetworkAccessPolicy;
import com.azure.resourcemanager.compute.models.OperatingSystemTypes;
import com.azure.resourcemanager.compute.models.PropertyUpdatesInProgress;
import com.azure.resourcemanager.compute.models.PublicNetworkAccess;
import com.azure.resourcemanager.compute.models.PurchasePlanAutoGenerated;
import com.azure.resourcemanager.compute.models.SupportedCapabilities;
import java.io.IOException;

/**
 * Disk resource update properties.
 */
@Fluent
public final class DiskUpdateProperties implements JsonSerializable<DiskUpdateProperties> {
    /*
     * the Operating System type.
     */
    private OperatingSystemTypes osType;

    /*
     * If creationData.createOption is Empty, this field is mandatory and it indicates the size of the disk to create.
     * If this field is present for updates or creation with other options, it indicates a resize. Resizes are only
     * allowed if the disk is not attached to a running VM, and can only increase the disk's size.
     */
    private Integer diskSizeGB;

    /*
     * Encryption settings collection used be Azure Disk Encryption, can contain multiple encryption settings per disk
     * or snapshot.
     */
    private EncryptionSettingsCollection encryptionSettingsCollection;

    /*
     * The number of IOPS allowed for this disk; only settable for UltraSSD disks. One operation can transfer between 4k
     * and 256k bytes.
     */
    private Long diskIopsReadWrite;

    /*
     * The bandwidth allowed for this disk; only settable for UltraSSD disks. MBps means millions of bytes per second -
     * MB here uses the ISO notation, of powers of 10.
     */
    private Long diskMBpsReadWrite;

    /*
     * The total number of IOPS that will be allowed across all VMs mounting the shared disk as ReadOnly. One operation
     * can transfer between 4k and 256k bytes.
     */
    private Long diskIopsReadOnly;

    /*
     * The total throughput (MBps) that will be allowed across all VMs mounting the shared disk as ReadOnly. MBps means
     * millions of bytes per second - MB here uses the ISO notation, of powers of 10.
     */
    private Long diskMBpsReadOnly;

    /*
     * The maximum number of VMs that can attach to the disk at the same time. Value greater than one indicates a disk
     * that can be mounted on multiple VMs at the same time.
     */
    private Integer maxShares;

    /*
     * Encryption property can be used to encrypt data at rest with customer managed keys or platform managed keys.
     */
    private Encryption encryption;

    /*
     * Policy for accessing the disk via network.
     */
    private NetworkAccessPolicy networkAccessPolicy;

    /*
     * ARM id of the DiskAccess resource for using private endpoints on disks.
     */
    private String diskAccessId;

    /*
     * Performance tier of the disk (e.g, P4, S10) as described here:
     * https://azure.microsoft.com/en-us/pricing/details/managed-disks/. Does not apply to Ultra disks.
     */
    private String tier;

    /*
     * Set to true to enable bursting beyond the provisioned performance target of the disk. Bursting is disabled by
     * default. Does not apply to Ultra disks.
     */
    private Boolean burstingEnabled;

    /*
     * Purchase plan information to be added on the OS disk
     */
    private PurchasePlanAutoGenerated purchasePlan;

    /*
     * List of supported capabilities to be added on the OS disk.
     */
    private SupportedCapabilities supportedCapabilities;

    /*
     * Properties of the disk for which update is pending.
     */
    private PropertyUpdatesInProgress propertyUpdatesInProgress;

    /*
     * Indicates the OS on a disk supports hibernation.
     */
    private Boolean supportsHibernation;

    /*
     * Policy for controlling export on the disk.
     */
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * Additional authentication requirements when exporting or uploading to a disk or snapshot.
     */
    private DataAccessAuthMode dataAccessAuthMode;

    /*
     * Setting this property to true improves reliability and performance of data disks that are frequently (more than 5
     * times a day) by detached from one virtual machine and attached to another. This property should not be set for
     * disks that are not detached and attached frequently as it causes the disks to not align with the fault domain of
     * the virtual machine.
     */
    private Boolean optimizedForFrequentAttach;

    /**
     * Creates an instance of DiskUpdateProperties class.
     */
    public DiskUpdateProperties() {
    }

    /**
     * Get the osType property: the Operating System type.
     * 
     * @return the osType value.
     */
    public OperatingSystemTypes osType() {
        return this.osType;
    }

    /**
     * Set the osType property: the Operating System type.
     * 
     * @param osType the osType value to set.
     * @return the DiskUpdateProperties object itself.
     */
    public DiskUpdateProperties withOsType(OperatingSystemTypes osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the diskSizeGB property: If creationData.createOption is Empty, this field is mandatory and it indicates the
     * size of the disk to create. If this field is present for updates or creation with other options, it indicates a
     * resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's
     * size.
     * 
     * @return the diskSizeGB value.
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set the diskSizeGB property: If creationData.createOption is Empty, this field is mandatory and it indicates the
     * size of the disk to create. If this field is present for updates or creation with other options, it indicates a
     * resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's
     * size.
     * 
     * @param diskSizeGB the diskSizeGB value to set.
     * @return the DiskUpdateProperties object itself.
     */
    public DiskUpdateProperties withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the encryptionSettingsCollection property: Encryption settings collection used be Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     * 
     * @return the encryptionSettingsCollection value.
     */
    public EncryptionSettingsCollection encryptionSettingsCollection() {
        return this.encryptionSettingsCollection;
    }

    /**
     * Set the encryptionSettingsCollection property: Encryption settings collection used be Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     * 
     * @param encryptionSettingsCollection the encryptionSettingsCollection value to set.
     * @return the DiskUpdateProperties object itself.
     */
    public DiskUpdateProperties
        withEncryptionSettingsCollection(EncryptionSettingsCollection encryptionSettingsCollection) {
        this.encryptionSettingsCollection = encryptionSettingsCollection;
        return this;
    }

    /**
     * Get the diskIopsReadWrite property: The number of IOPS allowed for this disk; only settable for UltraSSD disks.
     * One operation can transfer between 4k and 256k bytes.
     * 
     * @return the diskIopsReadWrite value.
     */
    public Long diskIopsReadWrite() {
        return this.diskIopsReadWrite;
    }

    /**
     * Set the diskIopsReadWrite property: The number of IOPS allowed for this disk; only settable for UltraSSD disks.
     * One operation can transfer between 4k and 256k bytes.
     * 
     * @param diskIopsReadWrite the diskIopsReadWrite value to set.
     * @return the DiskUpdateProperties object itself.
     */
    public DiskUpdateProperties withDiskIopsReadWrite(Long diskIopsReadWrite) {
        this.diskIopsReadWrite = diskIopsReadWrite;
        return this;
    }

    /**
     * Get the diskMBpsReadWrite property: The bandwidth allowed for this disk; only settable for UltraSSD disks. MBps
     * means millions of bytes per second - MB here uses the ISO notation, of powers of 10.
     * 
     * @return the diskMBpsReadWrite value.
     */
    public Long diskMBpsReadWrite() {
        return this.diskMBpsReadWrite;
    }

    /**
     * Set the diskMBpsReadWrite property: The bandwidth allowed for this disk; only settable for UltraSSD disks. MBps
     * means millions of bytes per second - MB here uses the ISO notation, of powers of 10.
     * 
     * @param diskMBpsReadWrite the diskMBpsReadWrite value to set.
     * @return the DiskUpdateProperties object itself.
     */
    public DiskUpdateProperties withDiskMBpsReadWrite(Long diskMBpsReadWrite) {
        this.diskMBpsReadWrite = diskMBpsReadWrite;
        return this;
    }

    /**
     * Get the diskIopsReadOnly property: The total number of IOPS that will be allowed across all VMs mounting the
     * shared disk as ReadOnly. One operation can transfer between 4k and 256k bytes.
     * 
     * @return the diskIopsReadOnly value.
     */
    public Long diskIopsReadOnly() {
        return this.diskIopsReadOnly;
    }

    /**
     * Set the diskIopsReadOnly property: The total number of IOPS that will be allowed across all VMs mounting the
     * shared disk as ReadOnly. One operation can transfer between 4k and 256k bytes.
     * 
     * @param diskIopsReadOnly the diskIopsReadOnly value to set.
     * @return the DiskUpdateProperties object itself.
     */
    public DiskUpdateProperties withDiskIopsReadOnly(Long diskIopsReadOnly) {
        this.diskIopsReadOnly = diskIopsReadOnly;
        return this;
    }

    /**
     * Get the diskMBpsReadOnly property: The total throughput (MBps) that will be allowed across all VMs mounting the
     * shared disk as ReadOnly. MBps means millions of bytes per second - MB here uses the ISO notation, of powers of
     * 10.
     * 
     * @return the diskMBpsReadOnly value.
     */
    public Long diskMBpsReadOnly() {
        return this.diskMBpsReadOnly;
    }

    /**
     * Set the diskMBpsReadOnly property: The total throughput (MBps) that will be allowed across all VMs mounting the
     * shared disk as ReadOnly. MBps means millions of bytes per second - MB here uses the ISO notation, of powers of
     * 10.
     * 
     * @param diskMBpsReadOnly the diskMBpsReadOnly value to set.
     * @return the DiskUpdateProperties object itself.
     */
    public DiskUpdateProperties withDiskMBpsReadOnly(Long diskMBpsReadOnly) {
        this.diskMBpsReadOnly = diskMBpsReadOnly;
        return this;
    }

    /**
     * Get the maxShares property: The maximum number of VMs that can attach to the disk at the same time. Value greater
     * than one indicates a disk that can be mounted on multiple VMs at the same time.
     * 
     * @return the maxShares value.
     */
    public Integer maxShares() {
        return this.maxShares;
    }

    /**
     * Set the maxShares property: The maximum number of VMs that can attach to the disk at the same time. Value greater
     * than one indicates a disk that can be mounted on multiple VMs at the same time.
     * 
     * @param maxShares the maxShares value to set.
     * @return the DiskUpdateProperties object itself.
     */
    public DiskUpdateProperties withMaxShares(Integer maxShares) {
        this.maxShares = maxShares;
        return this;
    }

    /**
     * Get the encryption property: Encryption property can be used to encrypt data at rest with customer managed keys
     * or platform managed keys.
     * 
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: Encryption property can be used to encrypt data at rest with customer managed keys
     * or platform managed keys.
     * 
     * @param encryption the encryption value to set.
     * @return the DiskUpdateProperties object itself.
     */
    public DiskUpdateProperties withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the networkAccessPolicy property: Policy for accessing the disk via network.
     * 
     * @return the networkAccessPolicy value.
     */
    public NetworkAccessPolicy networkAccessPolicy() {
        return this.networkAccessPolicy;
    }

    /**
     * Set the networkAccessPolicy property: Policy for accessing the disk via network.
     * 
     * @param networkAccessPolicy the networkAccessPolicy value to set.
     * @return the DiskUpdateProperties object itself.
     */
    public DiskUpdateProperties withNetworkAccessPolicy(NetworkAccessPolicy networkAccessPolicy) {
        this.networkAccessPolicy = networkAccessPolicy;
        return this;
    }

    /**
     * Get the diskAccessId property: ARM id of the DiskAccess resource for using private endpoints on disks.
     * 
     * @return the diskAccessId value.
     */
    public String diskAccessId() {
        return this.diskAccessId;
    }

    /**
     * Set the diskAccessId property: ARM id of the DiskAccess resource for using private endpoints on disks.
     * 
     * @param diskAccessId the diskAccessId value to set.
     * @return the DiskUpdateProperties object itself.
     */
    public DiskUpdateProperties withDiskAccessId(String diskAccessId) {
        this.diskAccessId = diskAccessId;
        return this;
    }

    /**
     * Get the tier property: Performance tier of the disk (e.g, P4, S10) as described here:
     * https://azure.microsoft.com/en-us/pricing/details/managed-disks/. Does not apply to Ultra disks.
     * 
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the tier property: Performance tier of the disk (e.g, P4, S10) as described here:
     * https://azure.microsoft.com/en-us/pricing/details/managed-disks/. Does not apply to Ultra disks.
     * 
     * @param tier the tier value to set.
     * @return the DiskUpdateProperties object itself.
     */
    public DiskUpdateProperties withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the burstingEnabled property: Set to true to enable bursting beyond the provisioned performance target of the
     * disk. Bursting is disabled by default. Does not apply to Ultra disks.
     * 
     * @return the burstingEnabled value.
     */
    public Boolean burstingEnabled() {
        return this.burstingEnabled;
    }

    /**
     * Set the burstingEnabled property: Set to true to enable bursting beyond the provisioned performance target of the
     * disk. Bursting is disabled by default. Does not apply to Ultra disks.
     * 
     * @param burstingEnabled the burstingEnabled value to set.
     * @return the DiskUpdateProperties object itself.
     */
    public DiskUpdateProperties withBurstingEnabled(Boolean burstingEnabled) {
        this.burstingEnabled = burstingEnabled;
        return this;
    }

    /**
     * Get the purchasePlan property: Purchase plan information to be added on the OS disk.
     * 
     * @return the purchasePlan value.
     */
    public PurchasePlanAutoGenerated purchasePlan() {
        return this.purchasePlan;
    }

    /**
     * Set the purchasePlan property: Purchase plan information to be added on the OS disk.
     * 
     * @param purchasePlan the purchasePlan value to set.
     * @return the DiskUpdateProperties object itself.
     */
    public DiskUpdateProperties withPurchasePlan(PurchasePlanAutoGenerated purchasePlan) {
        this.purchasePlan = purchasePlan;
        return this;
    }

    /**
     * Get the supportedCapabilities property: List of supported capabilities to be added on the OS disk.
     * 
     * @return the supportedCapabilities value.
     */
    public SupportedCapabilities supportedCapabilities() {
        return this.supportedCapabilities;
    }

    /**
     * Set the supportedCapabilities property: List of supported capabilities to be added on the OS disk.
     * 
     * @param supportedCapabilities the supportedCapabilities value to set.
     * @return the DiskUpdateProperties object itself.
     */
    public DiskUpdateProperties withSupportedCapabilities(SupportedCapabilities supportedCapabilities) {
        this.supportedCapabilities = supportedCapabilities;
        return this;
    }

    /**
     * Get the propertyUpdatesInProgress property: Properties of the disk for which update is pending.
     * 
     * @return the propertyUpdatesInProgress value.
     */
    public PropertyUpdatesInProgress propertyUpdatesInProgress() {
        return this.propertyUpdatesInProgress;
    }

    /**
     * Get the supportsHibernation property: Indicates the OS on a disk supports hibernation.
     * 
     * @return the supportsHibernation value.
     */
    public Boolean supportsHibernation() {
        return this.supportsHibernation;
    }

    /**
     * Set the supportsHibernation property: Indicates the OS on a disk supports hibernation.
     * 
     * @param supportsHibernation the supportsHibernation value to set.
     * @return the DiskUpdateProperties object itself.
     */
    public DiskUpdateProperties withSupportsHibernation(Boolean supportsHibernation) {
        this.supportsHibernation = supportsHibernation;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Policy for controlling export on the disk.
     * 
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Policy for controlling export on the disk.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the DiskUpdateProperties object itself.
     */
    public DiskUpdateProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the dataAccessAuthMode property: Additional authentication requirements when exporting or uploading to a disk
     * or snapshot.
     * 
     * @return the dataAccessAuthMode value.
     */
    public DataAccessAuthMode dataAccessAuthMode() {
        return this.dataAccessAuthMode;
    }

    /**
     * Set the dataAccessAuthMode property: Additional authentication requirements when exporting or uploading to a disk
     * or snapshot.
     * 
     * @param dataAccessAuthMode the dataAccessAuthMode value to set.
     * @return the DiskUpdateProperties object itself.
     */
    public DiskUpdateProperties withDataAccessAuthMode(DataAccessAuthMode dataAccessAuthMode) {
        this.dataAccessAuthMode = dataAccessAuthMode;
        return this;
    }

    /**
     * Get the optimizedForFrequentAttach property: Setting this property to true improves reliability and performance
     * of data disks that are frequently (more than 5 times a day) by detached from one virtual machine and attached to
     * another. This property should not be set for disks that are not detached and attached frequently as it causes the
     * disks to not align with the fault domain of the virtual machine.
     * 
     * @return the optimizedForFrequentAttach value.
     */
    public Boolean optimizedForFrequentAttach() {
        return this.optimizedForFrequentAttach;
    }

    /**
     * Set the optimizedForFrequentAttach property: Setting this property to true improves reliability and performance
     * of data disks that are frequently (more than 5 times a day) by detached from one virtual machine and attached to
     * another. This property should not be set for disks that are not detached and attached frequently as it causes the
     * disks to not align with the fault domain of the virtual machine.
     * 
     * @param optimizedForFrequentAttach the optimizedForFrequentAttach value to set.
     * @return the DiskUpdateProperties object itself.
     */
    public DiskUpdateProperties withOptimizedForFrequentAttach(Boolean optimizedForFrequentAttach) {
        this.optimizedForFrequentAttach = optimizedForFrequentAttach;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (encryptionSettingsCollection() != null) {
            encryptionSettingsCollection().validate();
        }
        if (encryption() != null) {
            encryption().validate();
        }
        if (purchasePlan() != null) {
            purchasePlan().validate();
        }
        if (supportedCapabilities() != null) {
            supportedCapabilities().validate();
        }
        if (propertyUpdatesInProgress() != null) {
            propertyUpdatesInProgress().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("osType", this.osType == null ? null : this.osType.toString());
        jsonWriter.writeNumberField("diskSizeGB", this.diskSizeGB);
        jsonWriter.writeJsonField("encryptionSettingsCollection", this.encryptionSettingsCollection);
        jsonWriter.writeNumberField("diskIOPSReadWrite", this.diskIopsReadWrite);
        jsonWriter.writeNumberField("diskMBpsReadWrite", this.diskMBpsReadWrite);
        jsonWriter.writeNumberField("diskIOPSReadOnly", this.diskIopsReadOnly);
        jsonWriter.writeNumberField("diskMBpsReadOnly", this.diskMBpsReadOnly);
        jsonWriter.writeNumberField("maxShares", this.maxShares);
        jsonWriter.writeJsonField("encryption", this.encryption);
        jsonWriter.writeStringField("networkAccessPolicy",
            this.networkAccessPolicy == null ? null : this.networkAccessPolicy.toString());
        jsonWriter.writeStringField("diskAccessId", this.diskAccessId);
        jsonWriter.writeStringField("tier", this.tier);
        jsonWriter.writeBooleanField("burstingEnabled", this.burstingEnabled);
        jsonWriter.writeJsonField("purchasePlan", this.purchasePlan);
        jsonWriter.writeJsonField("supportedCapabilities", this.supportedCapabilities);
        jsonWriter.writeBooleanField("supportsHibernation", this.supportsHibernation);
        jsonWriter.writeStringField("publicNetworkAccess",
            this.publicNetworkAccess == null ? null : this.publicNetworkAccess.toString());
        jsonWriter.writeStringField("dataAccessAuthMode",
            this.dataAccessAuthMode == null ? null : this.dataAccessAuthMode.toString());
        jsonWriter.writeBooleanField("optimizedForFrequentAttach", this.optimizedForFrequentAttach);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DiskUpdateProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DiskUpdateProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DiskUpdateProperties.
     */
    public static DiskUpdateProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DiskUpdateProperties deserializedDiskUpdateProperties = new DiskUpdateProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("osType".equals(fieldName)) {
                    deserializedDiskUpdateProperties.osType = OperatingSystemTypes.fromString(reader.getString());
                } else if ("diskSizeGB".equals(fieldName)) {
                    deserializedDiskUpdateProperties.diskSizeGB = reader.getNullable(JsonReader::getInt);
                } else if ("encryptionSettingsCollection".equals(fieldName)) {
                    deserializedDiskUpdateProperties.encryptionSettingsCollection
                        = EncryptionSettingsCollection.fromJson(reader);
                } else if ("diskIOPSReadWrite".equals(fieldName)) {
                    deserializedDiskUpdateProperties.diskIopsReadWrite = reader.getNullable(JsonReader::getLong);
                } else if ("diskMBpsReadWrite".equals(fieldName)) {
                    deserializedDiskUpdateProperties.diskMBpsReadWrite = reader.getNullable(JsonReader::getLong);
                } else if ("diskIOPSReadOnly".equals(fieldName)) {
                    deserializedDiskUpdateProperties.diskIopsReadOnly = reader.getNullable(JsonReader::getLong);
                } else if ("diskMBpsReadOnly".equals(fieldName)) {
                    deserializedDiskUpdateProperties.diskMBpsReadOnly = reader.getNullable(JsonReader::getLong);
                } else if ("maxShares".equals(fieldName)) {
                    deserializedDiskUpdateProperties.maxShares = reader.getNullable(JsonReader::getInt);
                } else if ("encryption".equals(fieldName)) {
                    deserializedDiskUpdateProperties.encryption = Encryption.fromJson(reader);
                } else if ("networkAccessPolicy".equals(fieldName)) {
                    deserializedDiskUpdateProperties.networkAccessPolicy
                        = NetworkAccessPolicy.fromString(reader.getString());
                } else if ("diskAccessId".equals(fieldName)) {
                    deserializedDiskUpdateProperties.diskAccessId = reader.getString();
                } else if ("tier".equals(fieldName)) {
                    deserializedDiskUpdateProperties.tier = reader.getString();
                } else if ("burstingEnabled".equals(fieldName)) {
                    deserializedDiskUpdateProperties.burstingEnabled = reader.getNullable(JsonReader::getBoolean);
                } else if ("purchasePlan".equals(fieldName)) {
                    deserializedDiskUpdateProperties.purchasePlan = PurchasePlanAutoGenerated.fromJson(reader);
                } else if ("supportedCapabilities".equals(fieldName)) {
                    deserializedDiskUpdateProperties.supportedCapabilities = SupportedCapabilities.fromJson(reader);
                } else if ("propertyUpdatesInProgress".equals(fieldName)) {
                    deserializedDiskUpdateProperties.propertyUpdatesInProgress
                        = PropertyUpdatesInProgress.fromJson(reader);
                } else if ("supportsHibernation".equals(fieldName)) {
                    deserializedDiskUpdateProperties.supportsHibernation = reader.getNullable(JsonReader::getBoolean);
                } else if ("publicNetworkAccess".equals(fieldName)) {
                    deserializedDiskUpdateProperties.publicNetworkAccess
                        = PublicNetworkAccess.fromString(reader.getString());
                } else if ("dataAccessAuthMode".equals(fieldName)) {
                    deserializedDiskUpdateProperties.dataAccessAuthMode
                        = DataAccessAuthMode.fromString(reader.getString());
                } else if ("optimizedForFrequentAttach".equals(fieldName)) {
                    deserializedDiskUpdateProperties.optimizedForFrequentAttach
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDiskUpdateProperties;
        });
    }
}
