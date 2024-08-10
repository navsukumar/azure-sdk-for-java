// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The approval settings.
 */
@Fluent
public final class ApprovalSettings implements JsonSerializable<ApprovalSettings> {
    /*
     * Determines whether approval is required or not.
     */
    private Boolean isApprovalRequired;

    /*
     * Determines whether approval is required for assignment extension.
     */
    private Boolean isApprovalRequiredForExtension;

    /*
     * Determine whether requestor justification is required.
     */
    private Boolean isRequestorJustificationRequired;

    /*
     * The type of rule
     */
    private ApprovalMode approvalMode;

    /*
     * The approval stages of the request.
     */
    private List<ApprovalStage> approvalStages;

    /**
     * Creates an instance of ApprovalSettings class.
     */
    public ApprovalSettings() {
    }

    /**
     * Get the isApprovalRequired property: Determines whether approval is required or not.
     * 
     * @return the isApprovalRequired value.
     */
    public Boolean isApprovalRequired() {
        return this.isApprovalRequired;
    }

    /**
     * Set the isApprovalRequired property: Determines whether approval is required or not.
     * 
     * @param isApprovalRequired the isApprovalRequired value to set.
     * @return the ApprovalSettings object itself.
     */
    public ApprovalSettings withIsApprovalRequired(Boolean isApprovalRequired) {
        this.isApprovalRequired = isApprovalRequired;
        return this;
    }

    /**
     * Get the isApprovalRequiredForExtension property: Determines whether approval is required for assignment
     * extension.
     * 
     * @return the isApprovalRequiredForExtension value.
     */
    public Boolean isApprovalRequiredForExtension() {
        return this.isApprovalRequiredForExtension;
    }

    /**
     * Set the isApprovalRequiredForExtension property: Determines whether approval is required for assignment
     * extension.
     * 
     * @param isApprovalRequiredForExtension the isApprovalRequiredForExtension value to set.
     * @return the ApprovalSettings object itself.
     */
    public ApprovalSettings withIsApprovalRequiredForExtension(Boolean isApprovalRequiredForExtension) {
        this.isApprovalRequiredForExtension = isApprovalRequiredForExtension;
        return this;
    }

    /**
     * Get the isRequestorJustificationRequired property: Determine whether requestor justification is required.
     * 
     * @return the isRequestorJustificationRequired value.
     */
    public Boolean isRequestorJustificationRequired() {
        return this.isRequestorJustificationRequired;
    }

    /**
     * Set the isRequestorJustificationRequired property: Determine whether requestor justification is required.
     * 
     * @param isRequestorJustificationRequired the isRequestorJustificationRequired value to set.
     * @return the ApprovalSettings object itself.
     */
    public ApprovalSettings withIsRequestorJustificationRequired(Boolean isRequestorJustificationRequired) {
        this.isRequestorJustificationRequired = isRequestorJustificationRequired;
        return this;
    }

    /**
     * Get the approvalMode property: The type of rule.
     * 
     * @return the approvalMode value.
     */
    public ApprovalMode approvalMode() {
        return this.approvalMode;
    }

    /**
     * Set the approvalMode property: The type of rule.
     * 
     * @param approvalMode the approvalMode value to set.
     * @return the ApprovalSettings object itself.
     */
    public ApprovalSettings withApprovalMode(ApprovalMode approvalMode) {
        this.approvalMode = approvalMode;
        return this;
    }

    /**
     * Get the approvalStages property: The approval stages of the request.
     * 
     * @return the approvalStages value.
     */
    public List<ApprovalStage> approvalStages() {
        return this.approvalStages;
    }

    /**
     * Set the approvalStages property: The approval stages of the request.
     * 
     * @param approvalStages the approvalStages value to set.
     * @return the ApprovalSettings object itself.
     */
    public ApprovalSettings withApprovalStages(List<ApprovalStage> approvalStages) {
        this.approvalStages = approvalStages;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (approvalStages() != null) {
            approvalStages().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("isApprovalRequired", this.isApprovalRequired);
        jsonWriter.writeBooleanField("isApprovalRequiredForExtension", this.isApprovalRequiredForExtension);
        jsonWriter.writeBooleanField("isRequestorJustificationRequired", this.isRequestorJustificationRequired);
        jsonWriter.writeStringField("approvalMode", this.approvalMode == null ? null : this.approvalMode.toString());
        jsonWriter.writeArrayField("approvalStages", this.approvalStages,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApprovalSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApprovalSettings if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApprovalSettings.
     */
    public static ApprovalSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApprovalSettings deserializedApprovalSettings = new ApprovalSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("isApprovalRequired".equals(fieldName)) {
                    deserializedApprovalSettings.isApprovalRequired = reader.getNullable(JsonReader::getBoolean);
                } else if ("isApprovalRequiredForExtension".equals(fieldName)) {
                    deserializedApprovalSettings.isApprovalRequiredForExtension
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("isRequestorJustificationRequired".equals(fieldName)) {
                    deserializedApprovalSettings.isRequestorJustificationRequired
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("approvalMode".equals(fieldName)) {
                    deserializedApprovalSettings.approvalMode = ApprovalMode.fromString(reader.getString());
                } else if ("approvalStages".equals(fieldName)) {
                    List<ApprovalStage> approvalStages = reader.readArray(reader1 -> ApprovalStage.fromJson(reader1));
                    deserializedApprovalSettings.approvalStages = approvalStages;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApprovalSettings;
        });
    }
}
