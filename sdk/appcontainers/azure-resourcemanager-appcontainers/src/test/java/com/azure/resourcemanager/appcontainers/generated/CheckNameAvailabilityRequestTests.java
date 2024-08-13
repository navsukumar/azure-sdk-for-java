// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.CheckNameAvailabilityRequest;
import org.junit.jupiter.api.Assertions;

public final class CheckNameAvailabilityRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CheckNameAvailabilityRequest model = BinaryData.fromString("{\"name\":\"qzbqjvsov\",\"type\":\"okacspk\"}")
            .toObject(CheckNameAvailabilityRequest.class);
        Assertions.assertEquals("qzbqjvsov", model.name());
        Assertions.assertEquals("okacspk", model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CheckNameAvailabilityRequest model
            = new CheckNameAvailabilityRequest().withName("qzbqjvsov").withType("okacspk");
        model = BinaryData.fromObject(model).toObject(CheckNameAvailabilityRequest.class);
        Assertions.assertEquals("qzbqjvsov", model.name());
        Assertions.assertEquals("okacspk", model.type());
    }
}
