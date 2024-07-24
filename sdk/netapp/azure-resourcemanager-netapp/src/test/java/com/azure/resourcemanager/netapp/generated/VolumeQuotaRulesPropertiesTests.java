// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.VolumeQuotaRulesProperties;
import com.azure.resourcemanager.netapp.models.Type;
import org.junit.jupiter.api.Assertions;

public final class VolumeQuotaRulesPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VolumeQuotaRulesProperties model = BinaryData.fromString(
            "{\"provisioningState\":\"Creating\",\"quotaSizeInKiBs\":8172148400531908792,\"quotaType\":\"IndividualGroupQuota\",\"quotaTarget\":\"dw\"}")
            .toObject(VolumeQuotaRulesProperties.class);
        Assertions.assertEquals(8172148400531908792L, model.quotaSizeInKiBs());
        Assertions.assertEquals(Type.INDIVIDUAL_GROUP_QUOTA, model.quotaType());
        Assertions.assertEquals("dw", model.quotaTarget());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VolumeQuotaRulesProperties model = new VolumeQuotaRulesProperties().withQuotaSizeInKiBs(8172148400531908792L)
            .withQuotaType(Type.INDIVIDUAL_GROUP_QUOTA)
            .withQuotaTarget("dw");
        model = BinaryData.fromObject(model).toObject(VolumeQuotaRulesProperties.class);
        Assertions.assertEquals(8172148400531908792L, model.quotaSizeInKiBs());
        Assertions.assertEquals(Type.INDIVIDUAL_GROUP_QUOTA, model.quotaType());
        Assertions.assertEquals("dw", model.quotaTarget());
    }
}
