// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.DailySchedule;
import org.junit.jupiter.api.Assertions;

public final class DailyScheduleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DailySchedule model = BinaryData.fromString(
            "{\"snapshotsToKeep\":510695304,\"hour\":1199723350,\"minute\":216115077,\"usedBytes\":2718040045935235650}")
            .toObject(DailySchedule.class);
        Assertions.assertEquals(510695304, model.snapshotsToKeep());
        Assertions.assertEquals(1199723350, model.hour());
        Assertions.assertEquals(216115077, model.minute());
        Assertions.assertEquals(2718040045935235650L, model.usedBytes());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DailySchedule model = new DailySchedule().withSnapshotsToKeep(510695304)
            .withHour(1199723350)
            .withMinute(216115077)
            .withUsedBytes(2718040045935235650L);
        model = BinaryData.fromObject(model).toObject(DailySchedule.class);
        Assertions.assertEquals(510695304, model.snapshotsToKeep());
        Assertions.assertEquals(1199723350, model.hour());
        Assertions.assertEquals(216115077, model.minute());
        Assertions.assertEquals(2718040045935235650L, model.usedBytes());
    }
}
