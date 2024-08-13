// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * IP security restriction on an app.
 */
@Fluent
public final class IpSecurityRestriction implements JsonSerializable<IpSecurityRestriction> {
    /*
     * IP address the security restriction is valid for.
     * It can be in form of pure ipv4 address (required SubnetMask property) or
     * CIDR notation such as ipv4/mask (leading bit match). For CIDR,
     * SubnetMask property must not be specified.
     */
    private String ipAddress;

    /*
     * Subnet mask for the range of IP addresses the restriction is valid for.
     */
    private String subnetMask;

    /*
     * Virtual network resource id
     */
    private String vnetSubnetResourceId;

    /*
     * (internal) Vnet traffic tag
     */
    private Integer vnetTrafficTag;

    /*
     * (internal) Subnet traffic tag
     */
    private Integer subnetTrafficTag;

    /*
     * Allow or Deny access for this IP range.
     */
    private String action;

    /*
     * Defines what this IP filter will be used for. This is to support IP filtering on proxies.
     */
    private IpFilterTag tag;

    /*
     * Priority of IP restriction rule.
     */
    private Integer priority;

    /*
     * IP restriction rule name.
     */
    private String name;

    /*
     * IP restriction rule description.
     */
    private String description;

    /*
     * IP restriction rule headers.
     * X-Forwarded-Host (https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Forwarded-Host#Examples).
     * The matching logic is ..
     * - If the property is null or empty (default), all hosts(or lack of) are allowed.
     * - A value is compared using ordinal-ignore-case (excluding port number).
     * - Subdomain wildcards are permitted but don't match the root domain. For example, *.contoso.com matches the
     * subdomain foo.contoso.com
     * but not the root domain contoso.com or multi-level foo.bar.contoso.com
     * - Unicode host names are allowed but are converted to Punycode for matching.
     * 
     * X-Forwarded-For (https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Forwarded-For#Examples).
     * The matching logic is ..
     * - If the property is null or empty (default), any forwarded-for chains (or lack of) are allowed.
     * - If any address (excluding port number) in the chain (comma separated) matches the CIDR defined by the property.
     * 
     * X-Azure-FDID and X-FD-HealthProbe.
     * The matching logic is exact match.
     */
    private Map<String, List<String>> headers;

    /**
     * Creates an instance of IpSecurityRestriction class.
     */
    public IpSecurityRestriction() {
    }

    /**
     * Get the ipAddress property: IP address the security restriction is valid for.
     * It can be in form of pure ipv4 address (required SubnetMask property) or
     * CIDR notation such as ipv4/mask (leading bit match). For CIDR,
     * SubnetMask property must not be specified.
     * 
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress property: IP address the security restriction is valid for.
     * It can be in form of pure ipv4 address (required SubnetMask property) or
     * CIDR notation such as ipv4/mask (leading bit match). For CIDR,
     * SubnetMask property must not be specified.
     * 
     * @param ipAddress the ipAddress value to set.
     * @return the IpSecurityRestriction object itself.
     */
    public IpSecurityRestriction withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the subnetMask property: Subnet mask for the range of IP addresses the restriction is valid for.
     * 
     * @return the subnetMask value.
     */
    public String subnetMask() {
        return this.subnetMask;
    }

    /**
     * Set the subnetMask property: Subnet mask for the range of IP addresses the restriction is valid for.
     * 
     * @param subnetMask the subnetMask value to set.
     * @return the IpSecurityRestriction object itself.
     */
    public IpSecurityRestriction withSubnetMask(String subnetMask) {
        this.subnetMask = subnetMask;
        return this;
    }

    /**
     * Get the vnetSubnetResourceId property: Virtual network resource id.
     * 
     * @return the vnetSubnetResourceId value.
     */
    public String vnetSubnetResourceId() {
        return this.vnetSubnetResourceId;
    }

    /**
     * Set the vnetSubnetResourceId property: Virtual network resource id.
     * 
     * @param vnetSubnetResourceId the vnetSubnetResourceId value to set.
     * @return the IpSecurityRestriction object itself.
     */
    public IpSecurityRestriction withVnetSubnetResourceId(String vnetSubnetResourceId) {
        this.vnetSubnetResourceId = vnetSubnetResourceId;
        return this;
    }

    /**
     * Get the vnetTrafficTag property: (internal) Vnet traffic tag.
     * 
     * @return the vnetTrafficTag value.
     */
    public Integer vnetTrafficTag() {
        return this.vnetTrafficTag;
    }

    /**
     * Set the vnetTrafficTag property: (internal) Vnet traffic tag.
     * 
     * @param vnetTrafficTag the vnetTrafficTag value to set.
     * @return the IpSecurityRestriction object itself.
     */
    public IpSecurityRestriction withVnetTrafficTag(Integer vnetTrafficTag) {
        this.vnetTrafficTag = vnetTrafficTag;
        return this;
    }

    /**
     * Get the subnetTrafficTag property: (internal) Subnet traffic tag.
     * 
     * @return the subnetTrafficTag value.
     */
    public Integer subnetTrafficTag() {
        return this.subnetTrafficTag;
    }

    /**
     * Set the subnetTrafficTag property: (internal) Subnet traffic tag.
     * 
     * @param subnetTrafficTag the subnetTrafficTag value to set.
     * @return the IpSecurityRestriction object itself.
     */
    public IpSecurityRestriction withSubnetTrafficTag(Integer subnetTrafficTag) {
        this.subnetTrafficTag = subnetTrafficTag;
        return this;
    }

    /**
     * Get the action property: Allow or Deny access for this IP range.
     * 
     * @return the action value.
     */
    public String action() {
        return this.action;
    }

    /**
     * Set the action property: Allow or Deny access for this IP range.
     * 
     * @param action the action value to set.
     * @return the IpSecurityRestriction object itself.
     */
    public IpSecurityRestriction withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * Get the tag property: Defines what this IP filter will be used for. This is to support IP filtering on proxies.
     * 
     * @return the tag value.
     */
    public IpFilterTag tag() {
        return this.tag;
    }

    /**
     * Set the tag property: Defines what this IP filter will be used for. This is to support IP filtering on proxies.
     * 
     * @param tag the tag value to set.
     * @return the IpSecurityRestriction object itself.
     */
    public IpSecurityRestriction withTag(IpFilterTag tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Get the priority property: Priority of IP restriction rule.
     * 
     * @return the priority value.
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Priority of IP restriction rule.
     * 
     * @param priority the priority value to set.
     * @return the IpSecurityRestriction object itself.
     */
    public IpSecurityRestriction withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the name property: IP restriction rule name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: IP restriction rule name.
     * 
     * @param name the name value to set.
     * @return the IpSecurityRestriction object itself.
     */
    public IpSecurityRestriction withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: IP restriction rule description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: IP restriction rule description.
     * 
     * @param description the description value to set.
     * @return the IpSecurityRestriction object itself.
     */
    public IpSecurityRestriction withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the headers property: IP restriction rule headers.
     * X-Forwarded-Host (https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Forwarded-Host#Examples).
     * The matching logic is ..
     * - If the property is null or empty (default), all hosts(or lack of) are allowed.
     * - A value is compared using ordinal-ignore-case (excluding port number).
     * - Subdomain wildcards are permitted but don't match the root domain. For example, *.contoso.com matches the
     * subdomain foo.contoso.com
     * but not the root domain contoso.com or multi-level foo.bar.contoso.com
     * - Unicode host names are allowed but are converted to Punycode for matching.
     * 
     * X-Forwarded-For (https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Forwarded-For#Examples).
     * The matching logic is ..
     * - If the property is null or empty (default), any forwarded-for chains (or lack of) are allowed.
     * - If any address (excluding port number) in the chain (comma separated) matches the CIDR defined by the property.
     * 
     * X-Azure-FDID and X-FD-HealthProbe.
     * The matching logic is exact match.
     * 
     * @return the headers value.
     */
    public Map<String, List<String>> headers() {
        return this.headers;
    }

    /**
     * Set the headers property: IP restriction rule headers.
     * X-Forwarded-Host (https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Forwarded-Host#Examples).
     * The matching logic is ..
     * - If the property is null or empty (default), all hosts(or lack of) are allowed.
     * - A value is compared using ordinal-ignore-case (excluding port number).
     * - Subdomain wildcards are permitted but don't match the root domain. For example, *.contoso.com matches the
     * subdomain foo.contoso.com
     * but not the root domain contoso.com or multi-level foo.bar.contoso.com
     * - Unicode host names are allowed but are converted to Punycode for matching.
     * 
     * X-Forwarded-For (https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Forwarded-For#Examples).
     * The matching logic is ..
     * - If the property is null or empty (default), any forwarded-for chains (or lack of) are allowed.
     * - If any address (excluding port number) in the chain (comma separated) matches the CIDR defined by the property.
     * 
     * X-Azure-FDID and X-FD-HealthProbe.
     * The matching logic is exact match.
     * 
     * @param headers the headers value to set.
     * @return the IpSecurityRestriction object itself.
     */
    public IpSecurityRestriction withHeaders(Map<String, List<String>> headers) {
        this.headers = headers;
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
        jsonWriter.writeStringField("ipAddress", this.ipAddress);
        jsonWriter.writeStringField("subnetMask", this.subnetMask);
        jsonWriter.writeStringField("vnetSubnetResourceId", this.vnetSubnetResourceId);
        jsonWriter.writeNumberField("vnetTrafficTag", this.vnetTrafficTag);
        jsonWriter.writeNumberField("subnetTrafficTag", this.subnetTrafficTag);
        jsonWriter.writeStringField("action", this.action);
        jsonWriter.writeStringField("tag", this.tag == null ? null : this.tag.toString());
        jsonWriter.writeNumberField("priority", this.priority);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeMapField("headers", this.headers,
            (writer, element) -> writer.writeArray(element, (writer1, element1) -> writer1.writeString(element1)));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IpSecurityRestriction from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IpSecurityRestriction if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the IpSecurityRestriction.
     */
    public static IpSecurityRestriction fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IpSecurityRestriction deserializedIpSecurityRestriction = new IpSecurityRestriction();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("ipAddress".equals(fieldName)) {
                    deserializedIpSecurityRestriction.ipAddress = reader.getString();
                } else if ("subnetMask".equals(fieldName)) {
                    deserializedIpSecurityRestriction.subnetMask = reader.getString();
                } else if ("vnetSubnetResourceId".equals(fieldName)) {
                    deserializedIpSecurityRestriction.vnetSubnetResourceId = reader.getString();
                } else if ("vnetTrafficTag".equals(fieldName)) {
                    deserializedIpSecurityRestriction.vnetTrafficTag = reader.getNullable(JsonReader::getInt);
                } else if ("subnetTrafficTag".equals(fieldName)) {
                    deserializedIpSecurityRestriction.subnetTrafficTag = reader.getNullable(JsonReader::getInt);
                } else if ("action".equals(fieldName)) {
                    deserializedIpSecurityRestriction.action = reader.getString();
                } else if ("tag".equals(fieldName)) {
                    deserializedIpSecurityRestriction.tag = IpFilterTag.fromString(reader.getString());
                } else if ("priority".equals(fieldName)) {
                    deserializedIpSecurityRestriction.priority = reader.getNullable(JsonReader::getInt);
                } else if ("name".equals(fieldName)) {
                    deserializedIpSecurityRestriction.name = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedIpSecurityRestriction.description = reader.getString();
                } else if ("headers".equals(fieldName)) {
                    Map<String, List<String>> headers
                        = reader.readMap(reader1 -> reader1.readArray(reader2 -> reader2.getString()));
                    deserializedIpSecurityRestriction.headers = headers;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIpSecurityRestriction;
        });
    }
}
