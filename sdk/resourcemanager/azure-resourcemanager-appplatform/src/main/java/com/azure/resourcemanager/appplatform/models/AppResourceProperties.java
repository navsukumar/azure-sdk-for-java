// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * App resource properties payload.
 */
@Fluent
public final class AppResourceProperties implements JsonSerializable<AppResourceProperties> {
    /*
     * Indicates whether the App exposes public endpoint
     */
    private Boolean publicProperty;

    /*
     * URL of the App
     */
    private String url;

    /*
     * Collection of addons
     */
    private Map<String, Map<String, Object>> addonConfigs;

    /*
     * Provisioning state of the App
     */
    private AppResourceProvisioningState provisioningState;

    /*
     * Fully qualified dns Name.
     */
    private String fqdn;

    /*
     * Indicate if only https is allowed.
     */
    private Boolean httpsOnly;

    /*
     * Temporary disk settings
     */
    private TemporaryDisk temporaryDisk;

    /*
     * Persistent disk settings
     */
    private PersistentDisk persistentDisk;

    /*
     * List of custom persistent disks
     */
    private List<CustomPersistentDiskResource> customPersistentDisks;

    /*
     * Indicate if end to end TLS is enabled.
     */
    private Boolean enableEndToEndTls;

    /*
     * Collection of loaded certificates
     */
    private List<LoadedCertificate> loadedCertificates;

    /*
     * Additional App settings in vnet injection instance
     */
    private AppVNetAddons vnetAddons;

    /*
     * App ingress settings payload.
     */
    private IngressSettings ingressSettings;

    /**
     * Creates an instance of AppResourceProperties class.
     */
    public AppResourceProperties() {
    }

    /**
     * Get the publicProperty property: Indicates whether the App exposes public endpoint.
     * 
     * @return the publicProperty value.
     */
    public Boolean publicProperty() {
        return this.publicProperty;
    }

    /**
     * Set the publicProperty property: Indicates whether the App exposes public endpoint.
     * 
     * @param publicProperty the publicProperty value to set.
     * @return the AppResourceProperties object itself.
     */
    public AppResourceProperties withPublicProperty(Boolean publicProperty) {
        this.publicProperty = publicProperty;
        return this;
    }

    /**
     * Get the url property: URL of the App.
     * 
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Get the addonConfigs property: Collection of addons.
     * 
     * @return the addonConfigs value.
     */
    public Map<String, Map<String, Object>> addonConfigs() {
        return this.addonConfigs;
    }

    /**
     * Set the addonConfigs property: Collection of addons.
     * 
     * @param addonConfigs the addonConfigs value to set.
     * @return the AppResourceProperties object itself.
     */
    public AppResourceProperties withAddonConfigs(Map<String, Map<String, Object>> addonConfigs) {
        this.addonConfigs = addonConfigs;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the App.
     * 
     * @return the provisioningState value.
     */
    public AppResourceProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the fqdn property: Fully qualified dns Name.
     * 
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Get the httpsOnly property: Indicate if only https is allowed.
     * 
     * @return the httpsOnly value.
     */
    public Boolean httpsOnly() {
        return this.httpsOnly;
    }

    /**
     * Set the httpsOnly property: Indicate if only https is allowed.
     * 
     * @param httpsOnly the httpsOnly value to set.
     * @return the AppResourceProperties object itself.
     */
    public AppResourceProperties withHttpsOnly(Boolean httpsOnly) {
        this.httpsOnly = httpsOnly;
        return this;
    }

    /**
     * Get the temporaryDisk property: Temporary disk settings.
     * 
     * @return the temporaryDisk value.
     */
    public TemporaryDisk temporaryDisk() {
        return this.temporaryDisk;
    }

    /**
     * Set the temporaryDisk property: Temporary disk settings.
     * 
     * @param temporaryDisk the temporaryDisk value to set.
     * @return the AppResourceProperties object itself.
     */
    public AppResourceProperties withTemporaryDisk(TemporaryDisk temporaryDisk) {
        this.temporaryDisk = temporaryDisk;
        return this;
    }

    /**
     * Get the persistentDisk property: Persistent disk settings.
     * 
     * @return the persistentDisk value.
     */
    public PersistentDisk persistentDisk() {
        return this.persistentDisk;
    }

    /**
     * Set the persistentDisk property: Persistent disk settings.
     * 
     * @param persistentDisk the persistentDisk value to set.
     * @return the AppResourceProperties object itself.
     */
    public AppResourceProperties withPersistentDisk(PersistentDisk persistentDisk) {
        this.persistentDisk = persistentDisk;
        return this;
    }

    /**
     * Get the customPersistentDisks property: List of custom persistent disks.
     * 
     * @return the customPersistentDisks value.
     */
    public List<CustomPersistentDiskResource> customPersistentDisks() {
        return this.customPersistentDisks;
    }

    /**
     * Set the customPersistentDisks property: List of custom persistent disks.
     * 
     * @param customPersistentDisks the customPersistentDisks value to set.
     * @return the AppResourceProperties object itself.
     */
    public AppResourceProperties withCustomPersistentDisks(List<CustomPersistentDiskResource> customPersistentDisks) {
        this.customPersistentDisks = customPersistentDisks;
        return this;
    }

    /**
     * Get the enableEndToEndTls property: Indicate if end to end TLS is enabled.
     * 
     * @return the enableEndToEndTls value.
     */
    public Boolean enableEndToEndTls() {
        return this.enableEndToEndTls;
    }

    /**
     * Set the enableEndToEndTls property: Indicate if end to end TLS is enabled.
     * 
     * @param enableEndToEndTls the enableEndToEndTls value to set.
     * @return the AppResourceProperties object itself.
     */
    public AppResourceProperties withEnableEndToEndTls(Boolean enableEndToEndTls) {
        this.enableEndToEndTls = enableEndToEndTls;
        return this;
    }

    /**
     * Get the loadedCertificates property: Collection of loaded certificates.
     * 
     * @return the loadedCertificates value.
     */
    public List<LoadedCertificate> loadedCertificates() {
        return this.loadedCertificates;
    }

    /**
     * Set the loadedCertificates property: Collection of loaded certificates.
     * 
     * @param loadedCertificates the loadedCertificates value to set.
     * @return the AppResourceProperties object itself.
     */
    public AppResourceProperties withLoadedCertificates(List<LoadedCertificate> loadedCertificates) {
        this.loadedCertificates = loadedCertificates;
        return this;
    }

    /**
     * Get the vnetAddons property: Additional App settings in vnet injection instance.
     * 
     * @return the vnetAddons value.
     */
    public AppVNetAddons vnetAddons() {
        return this.vnetAddons;
    }

    /**
     * Set the vnetAddons property: Additional App settings in vnet injection instance.
     * 
     * @param vnetAddons the vnetAddons value to set.
     * @return the AppResourceProperties object itself.
     */
    public AppResourceProperties withVnetAddons(AppVNetAddons vnetAddons) {
        this.vnetAddons = vnetAddons;
        return this;
    }

    /**
     * Get the ingressSettings property: App ingress settings payload.
     * 
     * @return the ingressSettings value.
     */
    public IngressSettings ingressSettings() {
        return this.ingressSettings;
    }

    /**
     * Set the ingressSettings property: App ingress settings payload.
     * 
     * @param ingressSettings the ingressSettings value to set.
     * @return the AppResourceProperties object itself.
     */
    public AppResourceProperties withIngressSettings(IngressSettings ingressSettings) {
        this.ingressSettings = ingressSettings;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (temporaryDisk() != null) {
            temporaryDisk().validate();
        }
        if (persistentDisk() != null) {
            persistentDisk().validate();
        }
        if (customPersistentDisks() != null) {
            customPersistentDisks().forEach(e -> e.validate());
        }
        if (loadedCertificates() != null) {
            loadedCertificates().forEach(e -> e.validate());
        }
        if (vnetAddons() != null) {
            vnetAddons().validate();
        }
        if (ingressSettings() != null) {
            ingressSettings().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("public", this.publicProperty);
        jsonWriter.writeMapField("addonConfigs", this.addonConfigs,
            (writer, element) -> writer.writeMap(element, (writer1, element1) -> writer1.writeUntyped(element1)));
        jsonWriter.writeBooleanField("httpsOnly", this.httpsOnly);
        jsonWriter.writeJsonField("temporaryDisk", this.temporaryDisk);
        jsonWriter.writeJsonField("persistentDisk", this.persistentDisk);
        jsonWriter.writeArrayField("customPersistentDisks", this.customPersistentDisks,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeBooleanField("enableEndToEndTLS", this.enableEndToEndTls);
        jsonWriter.writeArrayField("loadedCertificates", this.loadedCertificates,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("vnetAddons", this.vnetAddons);
        jsonWriter.writeJsonField("ingressSettings", this.ingressSettings);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AppResourceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AppResourceProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AppResourceProperties.
     */
    public static AppResourceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AppResourceProperties deserializedAppResourceProperties = new AppResourceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("public".equals(fieldName)) {
                    deserializedAppResourceProperties.publicProperty = reader.getNullable(JsonReader::getBoolean);
                } else if ("url".equals(fieldName)) {
                    deserializedAppResourceProperties.url = reader.getString();
                } else if ("addonConfigs".equals(fieldName)) {
                    Map<String, Map<String, Object>> addonConfigs
                        = reader.readMap(reader1 -> reader1.readMap(reader2 -> reader2.readUntyped()));
                    deserializedAppResourceProperties.addonConfigs = addonConfigs;
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedAppResourceProperties.provisioningState
                        = AppResourceProvisioningState.fromString(reader.getString());
                } else if ("fqdn".equals(fieldName)) {
                    deserializedAppResourceProperties.fqdn = reader.getString();
                } else if ("httpsOnly".equals(fieldName)) {
                    deserializedAppResourceProperties.httpsOnly = reader.getNullable(JsonReader::getBoolean);
                } else if ("temporaryDisk".equals(fieldName)) {
                    deserializedAppResourceProperties.temporaryDisk = TemporaryDisk.fromJson(reader);
                } else if ("persistentDisk".equals(fieldName)) {
                    deserializedAppResourceProperties.persistentDisk = PersistentDisk.fromJson(reader);
                } else if ("customPersistentDisks".equals(fieldName)) {
                    List<CustomPersistentDiskResource> customPersistentDisks
                        = reader.readArray(reader1 -> CustomPersistentDiskResource.fromJson(reader1));
                    deserializedAppResourceProperties.customPersistentDisks = customPersistentDisks;
                } else if ("enableEndToEndTLS".equals(fieldName)) {
                    deserializedAppResourceProperties.enableEndToEndTls = reader.getNullable(JsonReader::getBoolean);
                } else if ("loadedCertificates".equals(fieldName)) {
                    List<LoadedCertificate> loadedCertificates
                        = reader.readArray(reader1 -> LoadedCertificate.fromJson(reader1));
                    deserializedAppResourceProperties.loadedCertificates = loadedCertificates;
                } else if ("vnetAddons".equals(fieldName)) {
                    deserializedAppResourceProperties.vnetAddons = AppVNetAddons.fromJson(reader);
                } else if ("ingressSettings".equals(fieldName)) {
                    deserializedAppResourceProperties.ingressSettings = IngressSettings.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAppResourceProperties;
        });
    }
}
