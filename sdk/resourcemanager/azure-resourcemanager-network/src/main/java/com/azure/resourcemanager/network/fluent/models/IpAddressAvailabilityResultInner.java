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
import java.util.List;

/**
 * Response for CheckIPAddressAvailability API service call.
 */
@Fluent
public final class IpAddressAvailabilityResultInner implements JsonSerializable<IpAddressAvailabilityResultInner> {
    /*
     * Private IP address availability.
     */
    private Boolean available;

    /*
     * Contains other available private IP addresses if the asked for address is taken.
     */
    private List<String> availableIpAddresses;

    /*
     * Private IP address platform reserved.
     */
    private Boolean isPlatformReserved;

    /**
     * Creates an instance of IpAddressAvailabilityResultInner class.
     */
    public IpAddressAvailabilityResultInner() {
    }

    /**
     * Get the available property: Private IP address availability.
     * 
     * @return the available value.
     */
    public Boolean available() {
        return this.available;
    }

    /**
     * Set the available property: Private IP address availability.
     * 
     * @param available the available value to set.
     * @return the IpAddressAvailabilityResultInner object itself.
     */
    public IpAddressAvailabilityResultInner withAvailable(Boolean available) {
        this.available = available;
        return this;
    }

    /**
     * Get the availableIpAddresses property: Contains other available private IP addresses if the asked for address is
     * taken.
     * 
     * @return the availableIpAddresses value.
     */
    public List<String> availableIpAddresses() {
        return this.availableIpAddresses;
    }

    /**
     * Set the availableIpAddresses property: Contains other available private IP addresses if the asked for address is
     * taken.
     * 
     * @param availableIpAddresses the availableIpAddresses value to set.
     * @return the IpAddressAvailabilityResultInner object itself.
     */
    public IpAddressAvailabilityResultInner withAvailableIpAddresses(List<String> availableIpAddresses) {
        this.availableIpAddresses = availableIpAddresses;
        return this;
    }

    /**
     * Get the isPlatformReserved property: Private IP address platform reserved.
     * 
     * @return the isPlatformReserved value.
     */
    public Boolean isPlatformReserved() {
        return this.isPlatformReserved;
    }

    /**
     * Set the isPlatformReserved property: Private IP address platform reserved.
     * 
     * @param isPlatformReserved the isPlatformReserved value to set.
     * @return the IpAddressAvailabilityResultInner object itself.
     */
    public IpAddressAvailabilityResultInner withIsPlatformReserved(Boolean isPlatformReserved) {
        this.isPlatformReserved = isPlatformReserved;
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
        jsonWriter.writeBooleanField("available", this.available);
        jsonWriter.writeArrayField("availableIPAddresses", this.availableIpAddresses,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeBooleanField("isPlatformReserved", this.isPlatformReserved);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IpAddressAvailabilityResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IpAddressAvailabilityResultInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the IpAddressAvailabilityResultInner.
     */
    public static IpAddressAvailabilityResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IpAddressAvailabilityResultInner deserializedIpAddressAvailabilityResultInner
                = new IpAddressAvailabilityResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("available".equals(fieldName)) {
                    deserializedIpAddressAvailabilityResultInner.available = reader.getNullable(JsonReader::getBoolean);
                } else if ("availableIPAddresses".equals(fieldName)) {
                    List<String> availableIpAddresses = reader.readArray(reader1 -> reader1.getString());
                    deserializedIpAddressAvailabilityResultInner.availableIpAddresses = availableIpAddresses;
                } else if ("isPlatformReserved".equals(fieldName)) {
                    deserializedIpAddressAvailabilityResultInner.isPlatformReserved
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIpAddressAvailabilityResultInner;
        });
    }
}
