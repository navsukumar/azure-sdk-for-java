// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Properties of ExpressRouteProviderPort.
 */
@Fluent
public final class ExpressRouteProviderPortProperties implements JsonSerializable<ExpressRouteProviderPortProperties> {
    /*
     * The name of the port pair.
     */
    private String portPairDescriptor;

    /*
     * The name of the primary port.
     */
    private String primaryAzurePort;

    /*
     * The name of the secondary port.
     */
    private String secondaryAzurePort;

    /*
     * The peering location of the port pair.
     */
    private String peeringLocation;

    /*
     * Overprovisioning factor for the port pair.
     */
    private Integer overprovisionFactor;

    /*
     * Bandwidth of the port in Mbps
     */
    private Integer portBandwidthInMbps;

    /*
     * Used Bandwidth of the port in Mbps
     */
    private Integer usedBandwidthInMbps;

    /*
     * Remaining Bandwidth of the port in Mbps
     */
    private Integer remainingBandwidthInMbps;

    /**
     * Creates an instance of ExpressRouteProviderPortProperties class.
     */
    public ExpressRouteProviderPortProperties() {
    }

    /**
     * Get the portPairDescriptor property: The name of the port pair.
     * 
     * @return the portPairDescriptor value.
     */
    public String portPairDescriptor() {
        return this.portPairDescriptor;
    }

    /**
     * Get the primaryAzurePort property: The name of the primary port.
     * 
     * @return the primaryAzurePort value.
     */
    public String primaryAzurePort() {
        return this.primaryAzurePort;
    }

    /**
     * Get the secondaryAzurePort property: The name of the secondary port.
     * 
     * @return the secondaryAzurePort value.
     */
    public String secondaryAzurePort() {
        return this.secondaryAzurePort;
    }

    /**
     * Get the peeringLocation property: The peering location of the port pair.
     * 
     * @return the peeringLocation value.
     */
    public String peeringLocation() {
        return this.peeringLocation;
    }

    /**
     * Set the peeringLocation property: The peering location of the port pair.
     * 
     * @param peeringLocation the peeringLocation value to set.
     * @return the ExpressRouteProviderPortProperties object itself.
     */
    public ExpressRouteProviderPortProperties withPeeringLocation(String peeringLocation) {
        this.peeringLocation = peeringLocation;
        return this;
    }

    /**
     * Get the overprovisionFactor property: Overprovisioning factor for the port pair.
     * 
     * @return the overprovisionFactor value.
     */
    public Integer overprovisionFactor() {
        return this.overprovisionFactor;
    }

    /**
     * Set the overprovisionFactor property: Overprovisioning factor for the port pair.
     * 
     * @param overprovisionFactor the overprovisionFactor value to set.
     * @return the ExpressRouteProviderPortProperties object itself.
     */
    public ExpressRouteProviderPortProperties withOverprovisionFactor(Integer overprovisionFactor) {
        this.overprovisionFactor = overprovisionFactor;
        return this;
    }

    /**
     * Get the portBandwidthInMbps property: Bandwidth of the port in Mbps.
     * 
     * @return the portBandwidthInMbps value.
     */
    public Integer portBandwidthInMbps() {
        return this.portBandwidthInMbps;
    }

    /**
     * Set the portBandwidthInMbps property: Bandwidth of the port in Mbps.
     * 
     * @param portBandwidthInMbps the portBandwidthInMbps value to set.
     * @return the ExpressRouteProviderPortProperties object itself.
     */
    public ExpressRouteProviderPortProperties withPortBandwidthInMbps(Integer portBandwidthInMbps) {
        this.portBandwidthInMbps = portBandwidthInMbps;
        return this;
    }

    /**
     * Get the usedBandwidthInMbps property: Used Bandwidth of the port in Mbps.
     * 
     * @return the usedBandwidthInMbps value.
     */
    public Integer usedBandwidthInMbps() {
        return this.usedBandwidthInMbps;
    }

    /**
     * Set the usedBandwidthInMbps property: Used Bandwidth of the port in Mbps.
     * 
     * @param usedBandwidthInMbps the usedBandwidthInMbps value to set.
     * @return the ExpressRouteProviderPortProperties object itself.
     */
    public ExpressRouteProviderPortProperties withUsedBandwidthInMbps(Integer usedBandwidthInMbps) {
        this.usedBandwidthInMbps = usedBandwidthInMbps;
        return this;
    }

    /**
     * Get the remainingBandwidthInMbps property: Remaining Bandwidth of the port in Mbps.
     * 
     * @return the remainingBandwidthInMbps value.
     */
    public Integer remainingBandwidthInMbps() {
        return this.remainingBandwidthInMbps;
    }

    /**
     * Set the remainingBandwidthInMbps property: Remaining Bandwidth of the port in Mbps.
     * 
     * @param remainingBandwidthInMbps the remainingBandwidthInMbps value to set.
     * @return the ExpressRouteProviderPortProperties object itself.
     */
    public ExpressRouteProviderPortProperties withRemainingBandwidthInMbps(Integer remainingBandwidthInMbps) {
        this.remainingBandwidthInMbps = remainingBandwidthInMbps;
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
        jsonWriter.writeStringField("peeringLocation", this.peeringLocation);
        jsonWriter.writeNumberField("overprovisionFactor", this.overprovisionFactor);
        jsonWriter.writeNumberField("portBandwidthInMbps", this.portBandwidthInMbps);
        jsonWriter.writeNumberField("usedBandwidthInMbps", this.usedBandwidthInMbps);
        jsonWriter.writeNumberField("remainingBandwidthInMbps", this.remainingBandwidthInMbps);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExpressRouteProviderPortProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExpressRouteProviderPortProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExpressRouteProviderPortProperties.
     */
    public static ExpressRouteProviderPortProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExpressRouteProviderPortProperties deserializedExpressRouteProviderPortProperties
                = new ExpressRouteProviderPortProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("portPairDescriptor".equals(fieldName)) {
                    deserializedExpressRouteProviderPortProperties.portPairDescriptor = reader.getString();
                } else if ("primaryAzurePort".equals(fieldName)) {
                    deserializedExpressRouteProviderPortProperties.primaryAzurePort = reader.getString();
                } else if ("secondaryAzurePort".equals(fieldName)) {
                    deserializedExpressRouteProviderPortProperties.secondaryAzurePort = reader.getString();
                } else if ("peeringLocation".equals(fieldName)) {
                    deserializedExpressRouteProviderPortProperties.peeringLocation = reader.getString();
                } else if ("overprovisionFactor".equals(fieldName)) {
                    deserializedExpressRouteProviderPortProperties.overprovisionFactor
                        = reader.getNullable(JsonReader::getInt);
                } else if ("portBandwidthInMbps".equals(fieldName)) {
                    deserializedExpressRouteProviderPortProperties.portBandwidthInMbps
                        = reader.getNullable(JsonReader::getInt);
                } else if ("usedBandwidthInMbps".equals(fieldName)) {
                    deserializedExpressRouteProviderPortProperties.usedBandwidthInMbps
                        = reader.getNullable(JsonReader::getInt);
                } else if ("remainingBandwidthInMbps".equals(fieldName)) {
                    deserializedExpressRouteProviderPortProperties.remainingBandwidthInMbps
                        = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExpressRouteProviderPortProperties;
        });
    }
}
