// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Resource type managed by the resource provider.
 */
@Fluent
public final class ProviderResourceType implements JsonSerializable<ProviderResourceType> {
    /*
     * The resource type.
     */
    private String resourceType;

    /*
     * The collection of locations where this resource type can be created.
     */
    private List<String> locations;

    /*
     * The location mappings that are supported by this resource type.
     */
    private List<ProviderExtendedLocation> locationMappings;

    /*
     * The aliases that are supported by this resource type.
     */
    private List<Alias> aliases;

    /*
     * The API version.
     */
    private List<String> apiVersions;

    /*
     * The default API version.
     */
    private String defaultApiVersion;

    /*
     * The zoneMappings property.
     */
    private List<ZoneMapping> zoneMappings;

    /*
     * The API profiles for the resource provider.
     */
    private List<ApiProfile> apiProfiles;

    /*
     * The additional capabilities offered by this resource type.
     */
    private String capabilities;

    /*
     * The properties.
     */
    private Map<String, String> properties;

    /**
     * Creates an instance of ProviderResourceType class.
     */
    public ProviderResourceType() {
    }

    /**
     * Get the resourceType property: The resource type.
     * 
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: The resource type.
     * 
     * @param resourceType the resourceType value to set.
     * @return the ProviderResourceType object itself.
     */
    public ProviderResourceType withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the locations property: The collection of locations where this resource type can be created.
     * 
     * @return the locations value.
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Set the locations property: The collection of locations where this resource type can be created.
     * 
     * @param locations the locations value to set.
     * @return the ProviderResourceType object itself.
     */
    public ProviderResourceType withLocations(List<String> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get the locationMappings property: The location mappings that are supported by this resource type.
     * 
     * @return the locationMappings value.
     */
    public List<ProviderExtendedLocation> locationMappings() {
        return this.locationMappings;
    }

    /**
     * Set the locationMappings property: The location mappings that are supported by this resource type.
     * 
     * @param locationMappings the locationMappings value to set.
     * @return the ProviderResourceType object itself.
     */
    public ProviderResourceType withLocationMappings(List<ProviderExtendedLocation> locationMappings) {
        this.locationMappings = locationMappings;
        return this;
    }

    /**
     * Get the aliases property: The aliases that are supported by this resource type.
     * 
     * @return the aliases value.
     */
    public List<Alias> aliases() {
        return this.aliases;
    }

    /**
     * Set the aliases property: The aliases that are supported by this resource type.
     * 
     * @param aliases the aliases value to set.
     * @return the ProviderResourceType object itself.
     */
    public ProviderResourceType withAliases(List<Alias> aliases) {
        this.aliases = aliases;
        return this;
    }

    /**
     * Get the apiVersions property: The API version.
     * 
     * @return the apiVersions value.
     */
    public List<String> apiVersions() {
        return this.apiVersions;
    }

    /**
     * Set the apiVersions property: The API version.
     * 
     * @param apiVersions the apiVersions value to set.
     * @return the ProviderResourceType object itself.
     */
    public ProviderResourceType withApiVersions(List<String> apiVersions) {
        this.apiVersions = apiVersions;
        return this;
    }

    /**
     * Get the defaultApiVersion property: The default API version.
     * 
     * @return the defaultApiVersion value.
     */
    public String defaultApiVersion() {
        return this.defaultApiVersion;
    }

    /**
     * Get the zoneMappings property: The zoneMappings property.
     * 
     * @return the zoneMappings value.
     */
    public List<ZoneMapping> zoneMappings() {
        return this.zoneMappings;
    }

    /**
     * Set the zoneMappings property: The zoneMappings property.
     * 
     * @param zoneMappings the zoneMappings value to set.
     * @return the ProviderResourceType object itself.
     */
    public ProviderResourceType withZoneMappings(List<ZoneMapping> zoneMappings) {
        this.zoneMappings = zoneMappings;
        return this;
    }

    /**
     * Get the apiProfiles property: The API profiles for the resource provider.
     * 
     * @return the apiProfiles value.
     */
    public List<ApiProfile> apiProfiles() {
        return this.apiProfiles;
    }

    /**
     * Get the capabilities property: The additional capabilities offered by this resource type.
     * 
     * @return the capabilities value.
     */
    public String capabilities() {
        return this.capabilities;
    }

    /**
     * Set the capabilities property: The additional capabilities offered by this resource type.
     * 
     * @param capabilities the capabilities value to set.
     * @return the ProviderResourceType object itself.
     */
    public ProviderResourceType withCapabilities(String capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Get the properties property: The properties.
     * 
     * @return the properties value.
     */
    public Map<String, String> properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties.
     * 
     * @param properties the properties value to set.
     * @return the ProviderResourceType object itself.
     */
    public ProviderResourceType withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (locationMappings() != null) {
            locationMappings().forEach(e -> e.validate());
        }
        if (aliases() != null) {
            aliases().forEach(e -> e.validate());
        }
        if (zoneMappings() != null) {
            zoneMappings().forEach(e -> e.validate());
        }
        if (apiProfiles() != null) {
            apiProfiles().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("resourceType", this.resourceType);
        jsonWriter.writeArrayField("locations", this.locations, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("locationMappings", this.locationMappings,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("aliases", this.aliases, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("apiVersions", this.apiVersions, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("zoneMappings", this.zoneMappings, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("capabilities", this.capabilities);
        jsonWriter.writeMapField("properties", this.properties, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProviderResourceType from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProviderResourceType if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ProviderResourceType.
     */
    public static ProviderResourceType fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProviderResourceType deserializedProviderResourceType = new ProviderResourceType();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resourceType".equals(fieldName)) {
                    deserializedProviderResourceType.resourceType = reader.getString();
                } else if ("locations".equals(fieldName)) {
                    List<String> locations = reader.readArray(reader1 -> reader1.getString());
                    deserializedProviderResourceType.locations = locations;
                } else if ("locationMappings".equals(fieldName)) {
                    List<ProviderExtendedLocation> locationMappings
                        = reader.readArray(reader1 -> ProviderExtendedLocation.fromJson(reader1));
                    deserializedProviderResourceType.locationMappings = locationMappings;
                } else if ("aliases".equals(fieldName)) {
                    List<Alias> aliases = reader.readArray(reader1 -> Alias.fromJson(reader1));
                    deserializedProviderResourceType.aliases = aliases;
                } else if ("apiVersions".equals(fieldName)) {
                    List<String> apiVersions = reader.readArray(reader1 -> reader1.getString());
                    deserializedProviderResourceType.apiVersions = apiVersions;
                } else if ("defaultApiVersion".equals(fieldName)) {
                    deserializedProviderResourceType.defaultApiVersion = reader.getString();
                } else if ("zoneMappings".equals(fieldName)) {
                    List<ZoneMapping> zoneMappings = reader.readArray(reader1 -> ZoneMapping.fromJson(reader1));
                    deserializedProviderResourceType.zoneMappings = zoneMappings;
                } else if ("apiProfiles".equals(fieldName)) {
                    List<ApiProfile> apiProfiles = reader.readArray(reader1 -> ApiProfile.fromJson(reader1));
                    deserializedProviderResourceType.apiProfiles = apiProfiles;
                } else if ("capabilities".equals(fieldName)) {
                    deserializedProviderResourceType.capabilities = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    Map<String, String> properties = reader.readMap(reader1 -> reader1.getString());
                    deserializedProviderResourceType.properties = properties;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProviderResourceType;
        });
    }
}
