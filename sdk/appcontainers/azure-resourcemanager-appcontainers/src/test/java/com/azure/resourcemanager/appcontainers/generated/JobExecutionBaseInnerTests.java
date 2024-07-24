// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.JobExecutionBaseInner;
import org.junit.jupiter.api.Assertions;

public final class JobExecutionBaseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JobExecutionBaseInner model = BinaryData.fromString("{\"name\":\"peuknijd\",\"id\":\"yespydjfbocyv\"}")
            .toObject(JobExecutionBaseInner.class);
        Assertions.assertEquals("peuknijd", model.name());
        Assertions.assertEquals("yespydjfbocyv", model.id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JobExecutionBaseInner model = new JobExecutionBaseInner().withName("peuknijd").withId("yespydjfbocyv");
        model = BinaryData.fromObject(model).toObject(JobExecutionBaseInner.class);
        Assertions.assertEquals("peuknijd", model.name());
        Assertions.assertEquals("yespydjfbocyv", model.id());
    }
}
