// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes an Operating System disk.
 */
@Fluent
public final class ImageOSDisk extends ImageDisk {
    /*
     * This property allows you to specify the type of the OS that is included in the disk if creating a VM from a
     * custom image. Possible values are: **Windows,** **Linux.**
     */
    private OperatingSystemTypes osType;

    /*
     * The OS State. For managed images, use Generalized.
     */
    private OperatingSystemStateTypes osState;

    /**
     * Creates an instance of ImageOSDisk class.
     */
    public ImageOSDisk() {
    }

    /**
     * Get the osType property: This property allows you to specify the type of the OS that is included in the disk if
     * creating a VM from a custom image. Possible values are: **Windows,** **Linux.**.
     * 
     * @return the osType value.
     */
    public OperatingSystemTypes osType() {
        return this.osType;
    }

    /**
     * Set the osType property: This property allows you to specify the type of the OS that is included in the disk if
     * creating a VM from a custom image. Possible values are: **Windows,** **Linux.**.
     * 
     * @param osType the osType value to set.
     * @return the ImageOSDisk object itself.
     */
    public ImageOSDisk withOsType(OperatingSystemTypes osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the osState property: The OS State. For managed images, use Generalized.
     * 
     * @return the osState value.
     */
    public OperatingSystemStateTypes osState() {
        return this.osState;
    }

    /**
     * Set the osState property: The OS State. For managed images, use Generalized.
     * 
     * @param osState the osState value to set.
     * @return the ImageOSDisk object itself.
     */
    public ImageOSDisk withOsState(OperatingSystemStateTypes osState) {
        this.osState = osState;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageOSDisk withSnapshot(SubResource snapshot) {
        super.withSnapshot(snapshot);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageOSDisk withManagedDisk(SubResource managedDisk) {
        super.withManagedDisk(managedDisk);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageOSDisk withBlobUri(String blobUri) {
        super.withBlobUri(blobUri);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageOSDisk withCaching(CachingTypes caching) {
        super.withCaching(caching);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageOSDisk withDiskSizeGB(Integer diskSizeGB) {
        super.withDiskSizeGB(diskSizeGB);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageOSDisk withStorageAccountType(StorageAccountTypes storageAccountType) {
        super.withStorageAccountType(storageAccountType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageOSDisk withDiskEncryptionSet(DiskEncryptionSetParameters diskEncryptionSet) {
        super.withDiskEncryptionSet(diskEncryptionSet);
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
        if (osType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property osType in model ImageOSDisk"));
        }
        if (osState() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property osState in model ImageOSDisk"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ImageOSDisk.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("snapshot", snapshot());
        jsonWriter.writeJsonField("managedDisk", managedDisk());
        jsonWriter.writeStringField("blobUri", blobUri());
        jsonWriter.writeStringField("caching", caching() == null ? null : caching().toString());
        jsonWriter.writeNumberField("diskSizeGB", diskSizeGB());
        jsonWriter.writeStringField("storageAccountType",
            storageAccountType() == null ? null : storageAccountType().toString());
        jsonWriter.writeJsonField("diskEncryptionSet", diskEncryptionSet());
        jsonWriter.writeStringField("osType", this.osType == null ? null : this.osType.toString());
        jsonWriter.writeStringField("osState", this.osState == null ? null : this.osState.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ImageOSDisk from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ImageOSDisk if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ImageOSDisk.
     */
    public static ImageOSDisk fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ImageOSDisk deserializedImageOSDisk = new ImageOSDisk();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("snapshot".equals(fieldName)) {
                    deserializedImageOSDisk.withSnapshot(SubResource.fromJson(reader));
                } else if ("managedDisk".equals(fieldName)) {
                    deserializedImageOSDisk.withManagedDisk(SubResource.fromJson(reader));
                } else if ("blobUri".equals(fieldName)) {
                    deserializedImageOSDisk.withBlobUri(reader.getString());
                } else if ("caching".equals(fieldName)) {
                    deserializedImageOSDisk.withCaching(CachingTypes.fromString(reader.getString()));
                } else if ("diskSizeGB".equals(fieldName)) {
                    deserializedImageOSDisk.withDiskSizeGB(reader.getNullable(JsonReader::getInt));
                } else if ("storageAccountType".equals(fieldName)) {
                    deserializedImageOSDisk.withStorageAccountType(StorageAccountTypes.fromString(reader.getString()));
                } else if ("diskEncryptionSet".equals(fieldName)) {
                    deserializedImageOSDisk.withDiskEncryptionSet(DiskEncryptionSetParameters.fromJson(reader));
                } else if ("osType".equals(fieldName)) {
                    deserializedImageOSDisk.osType = OperatingSystemTypes.fromString(reader.getString());
                } else if ("osState".equals(fieldName)) {
                    deserializedImageOSDisk.osState = OperatingSystemStateTypes.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedImageOSDisk;
        });
    }
}
