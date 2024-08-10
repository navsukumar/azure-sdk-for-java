// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.ExpressRoutePortsBillingType;
import com.azure.resourcemanager.network.models.ExpressRoutePortsEncapsulation;
import com.azure.resourcemanager.network.models.ProvisioningState;
import java.io.IOException;
import java.util.List;

/**
 * ExpressRoutePort Properties
 * 
 * Properties specific to ExpressRoutePort resources.
 */
@Fluent
public final class ExpressRoutePortPropertiesFormat implements JsonSerializable<ExpressRoutePortPropertiesFormat> {
    /*
     * The name of the peering location that the ExpressRoutePort is mapped to physically.
     */
    private String peeringLocation;

    /*
     * Bandwidth of procured ports in Gbps.
     */
    private Integer bandwidthInGbps;

    /*
     * Aggregate Gbps of associated circuit bandwidths.
     */
    private Float provisionedBandwidthInGbps;

    /*
     * Maximum transmission unit of the physical port pair(s).
     */
    private String mtu;

    /*
     * Encapsulation method on physical ports.
     */
    private ExpressRoutePortsEncapsulation encapsulation;

    /*
     * Ether type of the physical port.
     */
    private String etherType;

    /*
     * Date of the physical port allocation to be used in Letter of Authorization.
     */
    private String allocationDate;

    /*
     * The set of physical links of the ExpressRoutePort resource.
     */
    private List<ExpressRouteLinkInner> links;

    /*
     * Reference the ExpressRoute circuit(s) that are provisioned on this ExpressRoutePort resource.
     */
    private List<SubResource> circuits;

    /*
     * The provisioning state of the express route port resource.
     */
    private ProvisioningState provisioningState;

    /*
     * The resource GUID property of the express route port resource.
     */
    private String resourceGuid;

    /*
     * The billing type of the ExpressRoutePort resource.
     */
    private ExpressRoutePortsBillingType billingType;

    /**
     * Creates an instance of ExpressRoutePortPropertiesFormat class.
     */
    public ExpressRoutePortPropertiesFormat() {
    }

    /**
     * Get the peeringLocation property: The name of the peering location that the ExpressRoutePort is mapped to
     * physically.
     * 
     * @return the peeringLocation value.
     */
    public String peeringLocation() {
        return this.peeringLocation;
    }

    /**
     * Set the peeringLocation property: The name of the peering location that the ExpressRoutePort is mapped to
     * physically.
     * 
     * @param peeringLocation the peeringLocation value to set.
     * @return the ExpressRoutePortPropertiesFormat object itself.
     */
    public ExpressRoutePortPropertiesFormat withPeeringLocation(String peeringLocation) {
        this.peeringLocation = peeringLocation;
        return this;
    }

    /**
     * Get the bandwidthInGbps property: Bandwidth of procured ports in Gbps.
     * 
     * @return the bandwidthInGbps value.
     */
    public Integer bandwidthInGbps() {
        return this.bandwidthInGbps;
    }

    /**
     * Set the bandwidthInGbps property: Bandwidth of procured ports in Gbps.
     * 
     * @param bandwidthInGbps the bandwidthInGbps value to set.
     * @return the ExpressRoutePortPropertiesFormat object itself.
     */
    public ExpressRoutePortPropertiesFormat withBandwidthInGbps(Integer bandwidthInGbps) {
        this.bandwidthInGbps = bandwidthInGbps;
        return this;
    }

    /**
     * Get the provisionedBandwidthInGbps property: Aggregate Gbps of associated circuit bandwidths.
     * 
     * @return the provisionedBandwidthInGbps value.
     */
    public Float provisionedBandwidthInGbps() {
        return this.provisionedBandwidthInGbps;
    }

    /**
     * Get the mtu property: Maximum transmission unit of the physical port pair(s).
     * 
     * @return the mtu value.
     */
    public String mtu() {
        return this.mtu;
    }

    /**
     * Get the encapsulation property: Encapsulation method on physical ports.
     * 
     * @return the encapsulation value.
     */
    public ExpressRoutePortsEncapsulation encapsulation() {
        return this.encapsulation;
    }

    /**
     * Set the encapsulation property: Encapsulation method on physical ports.
     * 
     * @param encapsulation the encapsulation value to set.
     * @return the ExpressRoutePortPropertiesFormat object itself.
     */
    public ExpressRoutePortPropertiesFormat withEncapsulation(ExpressRoutePortsEncapsulation encapsulation) {
        this.encapsulation = encapsulation;
        return this;
    }

    /**
     * Get the etherType property: Ether type of the physical port.
     * 
     * @return the etherType value.
     */
    public String etherType() {
        return this.etherType;
    }

    /**
     * Get the allocationDate property: Date of the physical port allocation to be used in Letter of Authorization.
     * 
     * @return the allocationDate value.
     */
    public String allocationDate() {
        return this.allocationDate;
    }

    /**
     * Get the links property: The set of physical links of the ExpressRoutePort resource.
     * 
     * @return the links value.
     */
    public List<ExpressRouteLinkInner> links() {
        return this.links;
    }

    /**
     * Set the links property: The set of physical links of the ExpressRoutePort resource.
     * 
     * @param links the links value to set.
     * @return the ExpressRoutePortPropertiesFormat object itself.
     */
    public ExpressRoutePortPropertiesFormat withLinks(List<ExpressRouteLinkInner> links) {
        this.links = links;
        return this;
    }

    /**
     * Get the circuits property: Reference the ExpressRoute circuit(s) that are provisioned on this ExpressRoutePort
     * resource.
     * 
     * @return the circuits value.
     */
    public List<SubResource> circuits() {
        return this.circuits;
    }

    /**
     * Get the provisioningState property: The provisioning state of the express route port resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the express route port resource.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the billingType property: The billing type of the ExpressRoutePort resource.
     * 
     * @return the billingType value.
     */
    public ExpressRoutePortsBillingType billingType() {
        return this.billingType;
    }

    /**
     * Set the billingType property: The billing type of the ExpressRoutePort resource.
     * 
     * @param billingType the billingType value to set.
     * @return the ExpressRoutePortPropertiesFormat object itself.
     */
    public ExpressRoutePortPropertiesFormat withBillingType(ExpressRoutePortsBillingType billingType) {
        this.billingType = billingType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (links() != null) {
            links().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("peeringLocation", this.peeringLocation);
        jsonWriter.writeNumberField("bandwidthInGbps", this.bandwidthInGbps);
        jsonWriter.writeStringField("encapsulation", this.encapsulation == null ? null : this.encapsulation.toString());
        jsonWriter.writeArrayField("links", this.links, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("billingType", this.billingType == null ? null : this.billingType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExpressRoutePortPropertiesFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExpressRoutePortPropertiesFormat if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExpressRoutePortPropertiesFormat.
     */
    public static ExpressRoutePortPropertiesFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExpressRoutePortPropertiesFormat deserializedExpressRoutePortPropertiesFormat
                = new ExpressRoutePortPropertiesFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("peeringLocation".equals(fieldName)) {
                    deserializedExpressRoutePortPropertiesFormat.peeringLocation = reader.getString();
                } else if ("bandwidthInGbps".equals(fieldName)) {
                    deserializedExpressRoutePortPropertiesFormat.bandwidthInGbps
                        = reader.getNullable(JsonReader::getInt);
                } else if ("provisionedBandwidthInGbps".equals(fieldName)) {
                    deserializedExpressRoutePortPropertiesFormat.provisionedBandwidthInGbps
                        = reader.getNullable(JsonReader::getFloat);
                } else if ("mtu".equals(fieldName)) {
                    deserializedExpressRoutePortPropertiesFormat.mtu = reader.getString();
                } else if ("encapsulation".equals(fieldName)) {
                    deserializedExpressRoutePortPropertiesFormat.encapsulation
                        = ExpressRoutePortsEncapsulation.fromString(reader.getString());
                } else if ("etherType".equals(fieldName)) {
                    deserializedExpressRoutePortPropertiesFormat.etherType = reader.getString();
                } else if ("allocationDate".equals(fieldName)) {
                    deserializedExpressRoutePortPropertiesFormat.allocationDate = reader.getString();
                } else if ("links".equals(fieldName)) {
                    List<ExpressRouteLinkInner> links
                        = reader.readArray(reader1 -> ExpressRouteLinkInner.fromJson(reader1));
                    deserializedExpressRoutePortPropertiesFormat.links = links;
                } else if ("circuits".equals(fieldName)) {
                    List<SubResource> circuits = reader.readArray(reader1 -> SubResource.fromJson(reader1));
                    deserializedExpressRoutePortPropertiesFormat.circuits = circuits;
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedExpressRoutePortPropertiesFormat.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("resourceGuid".equals(fieldName)) {
                    deserializedExpressRoutePortPropertiesFormat.resourceGuid = reader.getString();
                } else if ("billingType".equals(fieldName)) {
                    deserializedExpressRoutePortPropertiesFormat.billingType
                        = ExpressRoutePortsBillingType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExpressRoutePortPropertiesFormat;
        });
    }
}
