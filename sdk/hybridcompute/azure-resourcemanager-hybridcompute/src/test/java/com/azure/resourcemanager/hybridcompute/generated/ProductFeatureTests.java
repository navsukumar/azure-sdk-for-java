// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.LicenseProfileSubscriptionStatus;
import com.azure.resourcemanager.hybridcompute.models.ProductFeature;
import org.junit.jupiter.api.Assertions;

public final class ProductFeatureTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProductFeature model = BinaryData.fromString(
            "{\"name\":\"clhocohsl\",\"subscriptionStatus\":\"Unknown\",\"enrollmentDate\":\"2021-02-15T02:43:43Z\",\"billingStartDate\":\"2021-07-24T18:30Z\",\"disenrollmentDate\":\"2021-07-27T15:10:57Z\",\"billingEndDate\":\"2021-09-05T06:09:57Z\"}")
            .toObject(ProductFeature.class);
        Assertions.assertEquals("clhocohsl", model.name());
        Assertions.assertEquals(LicenseProfileSubscriptionStatus.UNKNOWN, model.subscriptionStatus());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProductFeature model = new ProductFeature().withName("clhocohsl")
            .withSubscriptionStatus(LicenseProfileSubscriptionStatus.UNKNOWN);
        model = BinaryData.fromObject(model).toObject(ProductFeature.class);
        Assertions.assertEquals("clhocohsl", model.name());
        Assertions.assertEquals(LicenseProfileSubscriptionStatus.UNKNOWN, model.subscriptionStatus());
    }
}
