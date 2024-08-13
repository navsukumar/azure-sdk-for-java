// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.compute.models.CapacityReservationInstanceView;
import com.azure.resourcemanager.compute.models.SubResourceReadOnly;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Properties of the Capacity reservation.
 */
@Immutable
public final class CapacityReservationProperties implements JsonSerializable<CapacityReservationProperties> {
    /*
     * A unique id generated and assigned to the capacity reservation by the platform which does not change throughout
     * the lifetime of the resource.
     */
    private String reservationId;

    /*
     * Specifies the value of fault domain count that Capacity Reservation supports for requested VM size. **Note:** The
     * fault domain count specified for a resource (like virtual machines scale set) must be less than or equal to this
     * value if it deploys using capacity reservation. Minimum api-version: 2022-08-01.
     */
    private Integer platformFaultDomainCount;

    /*
     * A list of all virtual machine resource ids that are associated with the capacity reservation.
     */
    private List<SubResourceReadOnly> virtualMachinesAssociated;

    /*
     * The date time when the capacity reservation was last updated.
     */
    private OffsetDateTime provisioningTime;

    /*
     * The provisioning state, which only appears in the response.
     */
    private String provisioningState;

    /*
     * The Capacity reservation instance view.
     */
    private CapacityReservationInstanceView instanceView;

    /*
     * Specifies the time at which the Capacity Reservation resource was created. Minimum api-version: 2021-11-01.
     */
    private OffsetDateTime timeCreated;

    /**
     * Creates an instance of CapacityReservationProperties class.
     */
    public CapacityReservationProperties() {
    }

    /**
     * Get the reservationId property: A unique id generated and assigned to the capacity reservation by the platform
     * which does not change throughout the lifetime of the resource.
     * 
     * @return the reservationId value.
     */
    public String reservationId() {
        return this.reservationId;
    }

    /**
     * Get the platformFaultDomainCount property: Specifies the value of fault domain count that Capacity Reservation
     * supports for requested VM size. **Note:** The fault domain count specified for a resource (like virtual machines
     * scale set) must be less than or equal to this value if it deploys using capacity reservation. Minimum
     * api-version: 2022-08-01.
     * 
     * @return the platformFaultDomainCount value.
     */
    public Integer platformFaultDomainCount() {
        return this.platformFaultDomainCount;
    }

    /**
     * Get the virtualMachinesAssociated property: A list of all virtual machine resource ids that are associated with
     * the capacity reservation.
     * 
     * @return the virtualMachinesAssociated value.
     */
    public List<SubResourceReadOnly> virtualMachinesAssociated() {
        return this.virtualMachinesAssociated;
    }

    /**
     * Get the provisioningTime property: The date time when the capacity reservation was last updated.
     * 
     * @return the provisioningTime value.
     */
    public OffsetDateTime provisioningTime() {
        return this.provisioningTime;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the instanceView property: The Capacity reservation instance view.
     * 
     * @return the instanceView value.
     */
    public CapacityReservationInstanceView instanceView() {
        return this.instanceView;
    }

    /**
     * Get the timeCreated property: Specifies the time at which the Capacity Reservation resource was created. Minimum
     * api-version: 2021-11-01.
     * 
     * @return the timeCreated value.
     */
    public OffsetDateTime timeCreated() {
        return this.timeCreated;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (virtualMachinesAssociated() != null) {
            virtualMachinesAssociated().forEach(e -> e.validate());
        }
        if (instanceView() != null) {
            instanceView().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CapacityReservationProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CapacityReservationProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CapacityReservationProperties.
     */
    public static CapacityReservationProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CapacityReservationProperties deserializedCapacityReservationProperties
                = new CapacityReservationProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("reservationId".equals(fieldName)) {
                    deserializedCapacityReservationProperties.reservationId = reader.getString();
                } else if ("platformFaultDomainCount".equals(fieldName)) {
                    deserializedCapacityReservationProperties.platformFaultDomainCount
                        = reader.getNullable(JsonReader::getInt);
                } else if ("virtualMachinesAssociated".equals(fieldName)) {
                    List<SubResourceReadOnly> virtualMachinesAssociated
                        = reader.readArray(reader1 -> SubResourceReadOnly.fromJson(reader1));
                    deserializedCapacityReservationProperties.virtualMachinesAssociated = virtualMachinesAssociated;
                } else if ("provisioningTime".equals(fieldName)) {
                    deserializedCapacityReservationProperties.provisioningTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedCapacityReservationProperties.provisioningState = reader.getString();
                } else if ("instanceView".equals(fieldName)) {
                    deserializedCapacityReservationProperties.instanceView
                        = CapacityReservationInstanceView.fromJson(reader);
                } else if ("timeCreated".equals(fieldName)) {
                    deserializedCapacityReservationProperties.timeCreated = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCapacityReservationProperties;
        });
    }
}
