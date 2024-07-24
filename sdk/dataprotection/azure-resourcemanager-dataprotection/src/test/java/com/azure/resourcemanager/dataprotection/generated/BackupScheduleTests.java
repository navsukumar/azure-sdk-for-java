// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.BackupSchedule;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class BackupScheduleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupSchedule model = BinaryData
            .fromString("{\"repeatingTimeIntervals\":[\"wjchrdg\",\"ihxumwctondzj\"],\"timeZone\":\"udfdlwgg\"}")
            .toObject(BackupSchedule.class);
        Assertions.assertEquals("wjchrdg", model.repeatingTimeIntervals().get(0));
        Assertions.assertEquals("udfdlwgg", model.timeZone());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupSchedule model
            = new BackupSchedule().withRepeatingTimeIntervals(Arrays.asList("wjchrdg", "ihxumwctondzj"))
                .withTimeZone("udfdlwgg");
        model = BinaryData.fromObject(model).toObject(BackupSchedule.class);
        Assertions.assertEquals("wjchrdg", model.repeatingTimeIntervals().get(0));
        Assertions.assertEquals("udfdlwgg", model.timeZone());
    }
}
