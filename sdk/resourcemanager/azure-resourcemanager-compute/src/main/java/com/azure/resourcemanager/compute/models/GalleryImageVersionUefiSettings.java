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
 * Contains UEFI settings for the image version.
 */
@Fluent
public final class GalleryImageVersionUefiSettings implements JsonSerializable<GalleryImageVersionUefiSettings> {
    /*
     * The name of the template(s) that contains default UEFI key signatures that will be added to the image.
     */
    private List<UefiSignatureTemplateName> signatureTemplateNames;

    /*
     * Additional UEFI key signatures that will be added to the image in addition to the signature templates
     */
    private UefiKeySignatures additionalSignatures;

    /**
     * Creates an instance of GalleryImageVersionUefiSettings class.
     */
    public GalleryImageVersionUefiSettings() {
    }

    /**
     * Get the signatureTemplateNames property: The name of the template(s) that contains default UEFI key signatures
     * that will be added to the image.
     * 
     * @return the signatureTemplateNames value.
     */
    public List<UefiSignatureTemplateName> signatureTemplateNames() {
        return this.signatureTemplateNames;
    }

    /**
     * Set the signatureTemplateNames property: The name of the template(s) that contains default UEFI key signatures
     * that will be added to the image.
     * 
     * @param signatureTemplateNames the signatureTemplateNames value to set.
     * @return the GalleryImageVersionUefiSettings object itself.
     */
    public GalleryImageVersionUefiSettings
        withSignatureTemplateNames(List<UefiSignatureTemplateName> signatureTemplateNames) {
        this.signatureTemplateNames = signatureTemplateNames;
        return this;
    }

    /**
     * Get the additionalSignatures property: Additional UEFI key signatures that will be added to the image in addition
     * to the signature templates.
     * 
     * @return the additionalSignatures value.
     */
    public UefiKeySignatures additionalSignatures() {
        return this.additionalSignatures;
    }

    /**
     * Set the additionalSignatures property: Additional UEFI key signatures that will be added to the image in addition
     * to the signature templates.
     * 
     * @param additionalSignatures the additionalSignatures value to set.
     * @return the GalleryImageVersionUefiSettings object itself.
     */
    public GalleryImageVersionUefiSettings withAdditionalSignatures(UefiKeySignatures additionalSignatures) {
        this.additionalSignatures = additionalSignatures;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (additionalSignatures() != null) {
            additionalSignatures().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("signatureTemplateNames", this.signatureTemplateNames,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        jsonWriter.writeJsonField("additionalSignatures", this.additionalSignatures);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GalleryImageVersionUefiSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GalleryImageVersionUefiSettings if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GalleryImageVersionUefiSettings.
     */
    public static GalleryImageVersionUefiSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GalleryImageVersionUefiSettings deserializedGalleryImageVersionUefiSettings
                = new GalleryImageVersionUefiSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("signatureTemplateNames".equals(fieldName)) {
                    List<UefiSignatureTemplateName> signatureTemplateNames
                        = reader.readArray(reader1 -> UefiSignatureTemplateName.fromString(reader1.getString()));
                    deserializedGalleryImageVersionUefiSettings.signatureTemplateNames = signatureTemplateNames;
                } else if ("additionalSignatures".equals(fieldName)) {
                    deserializedGalleryImageVersionUefiSettings.additionalSignatures
                        = UefiKeySignatures.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGalleryImageVersionUefiSettings;
        });
    }
}
