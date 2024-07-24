// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.netapp.models.ProvisioningState;
import com.azure.resourcemanager.netapp.models.Type;
import java.io.IOException;
import java.util.Map;

/**
 * Quota Rule of a Volume.
 */
@Fluent
public final class VolumeQuotaRuleInner extends Resource {
    /*
     * Volume Quota Rule Properties
     */
    private VolumeQuotaRulesProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of VolumeQuotaRuleInner class.
     */
    public VolumeQuotaRuleInner() {
    }

    /**
     * Get the innerProperties property: Volume Quota Rule Properties.
     * 
     * @return the innerProperties value.
     */
    private VolumeQuotaRulesProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VolumeQuotaRuleInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VolumeQuotaRuleInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: Gets the status of the VolumeQuotaRule at the time the operation was called.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the quotaSizeInKiBs property: Size of quota.
     * 
     * @return the quotaSizeInKiBs value.
     */
    public Long quotaSizeInKiBs() {
        return this.innerProperties() == null ? null : this.innerProperties().quotaSizeInKiBs();
    }

    /**
     * Set the quotaSizeInKiBs property: Size of quota.
     * 
     * @param quotaSizeInKiBs the quotaSizeInKiBs value to set.
     * @return the VolumeQuotaRuleInner object itself.
     */
    public VolumeQuotaRuleInner withQuotaSizeInKiBs(Long quotaSizeInKiBs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeQuotaRulesProperties();
        }
        this.innerProperties().withQuotaSizeInKiBs(quotaSizeInKiBs);
        return this;
    }

    /**
     * Get the quotaType property: Type of quota.
     * 
     * @return the quotaType value.
     */
    public Type quotaType() {
        return this.innerProperties() == null ? null : this.innerProperties().quotaType();
    }

    /**
     * Set the quotaType property: Type of quota.
     * 
     * @param quotaType the quotaType value to set.
     * @return the VolumeQuotaRuleInner object itself.
     */
    public VolumeQuotaRuleInner withQuotaType(Type quotaType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeQuotaRulesProperties();
        }
        this.innerProperties().withQuotaType(quotaType);
        return this;
    }

    /**
     * Get the quotaTarget property: UserID/GroupID/SID based on the quota target type. UserID and groupID can be found
     * by running ‘id’ or ‘getent’ command for the user or group and SID can be found by running &lt;wmic useraccount
     * where name='user-name' get sid&gt;.
     * 
     * @return the quotaTarget value.
     */
    public String quotaTarget() {
        return this.innerProperties() == null ? null : this.innerProperties().quotaTarget();
    }

    /**
     * Set the quotaTarget property: UserID/GroupID/SID based on the quota target type. UserID and groupID can be found
     * by running ‘id’ or ‘getent’ command for the user or group and SID can be found by running &lt;wmic useraccount
     * where name='user-name' get sid&gt;.
     * 
     * @param quotaTarget the quotaTarget value to set.
     * @return the VolumeQuotaRuleInner object itself.
     */
    public VolumeQuotaRuleInner withQuotaTarget(String quotaTarget) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeQuotaRulesProperties();
        }
        this.innerProperties().withQuotaTarget(quotaTarget);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VolumeQuotaRuleInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VolumeQuotaRuleInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VolumeQuotaRuleInner.
     */
    public static VolumeQuotaRuleInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VolumeQuotaRuleInner deserializedVolumeQuotaRuleInner = new VolumeQuotaRuleInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedVolumeQuotaRuleInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedVolumeQuotaRuleInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedVolumeQuotaRuleInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedVolumeQuotaRuleInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedVolumeQuotaRuleInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedVolumeQuotaRuleInner.innerProperties = VolumeQuotaRulesProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedVolumeQuotaRuleInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVolumeQuotaRuleInner;
        });
    }
}
