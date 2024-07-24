// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.RecoveryPointDataStoreDetails;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class RecoveryPointDataStoreDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecoveryPointDataStoreDetails model = BinaryData.fromString(
            "{\"creationTime\":\"2021-11-04T08:30:12Z\",\"expiryTime\":\"2021-01-09T07:06:25Z\",\"id\":\"h\",\"metaData\":\"sx\",\"state\":\"pelol\",\"type\":\"vk\",\"visible\":true,\"rehydrationExpiryTime\":\"2021-02-05T20:48:24Z\",\"rehydrationStatus\":\"CREATE_IN_PROGRESS\"}")
            .toObject(RecoveryPointDataStoreDetails.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-04T08:30:12Z"), model.creationTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-09T07:06:25Z"), model.expiryTime());
        Assertions.assertEquals("h", model.id());
        Assertions.assertEquals("sx", model.metadata());
        Assertions.assertEquals("pelol", model.state());
        Assertions.assertEquals("vk", model.type());
        Assertions.assertEquals(true, model.visible());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecoveryPointDataStoreDetails model
            = new RecoveryPointDataStoreDetails().withCreationTime(OffsetDateTime.parse("2021-11-04T08:30:12Z"))
                .withExpiryTime(OffsetDateTime.parse("2021-01-09T07:06:25Z"))
                .withId("h")
                .withMetadata("sx")
                .withState("pelol")
                .withType("vk")
                .withVisible(true);
        model = BinaryData.fromObject(model).toObject(RecoveryPointDataStoreDetails.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-04T08:30:12Z"), model.creationTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-09T07:06:25Z"), model.expiryTime());
        Assertions.assertEquals("h", model.id());
        Assertions.assertEquals("sx", model.metadata());
        Assertions.assertEquals("pelol", model.state());
        Assertions.assertEquals("vk", model.type());
        Assertions.assertEquals(true, model.visible());
    }
}
