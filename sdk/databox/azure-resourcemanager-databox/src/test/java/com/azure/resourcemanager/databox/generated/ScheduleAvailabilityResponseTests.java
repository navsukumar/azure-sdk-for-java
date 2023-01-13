// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databox.models.ScheduleAvailabilityResponse;

public final class ScheduleAvailabilityResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScheduleAvailabilityResponse model =
            BinaryData
                .fromString("{\"availableDates\":[\"2021-04-10T12:35:25Z\"]}")
                .toObject(ScheduleAvailabilityResponse.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScheduleAvailabilityResponse model = new ScheduleAvailabilityResponse();
        model = BinaryData.fromObject(model).toObject(ScheduleAvailabilityResponse.class);
    }
}