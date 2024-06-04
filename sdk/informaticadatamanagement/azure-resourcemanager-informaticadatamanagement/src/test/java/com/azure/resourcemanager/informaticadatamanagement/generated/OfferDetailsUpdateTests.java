// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.informaticadatamanagement.models.OfferDetailsUpdate;
import org.junit.jupiter.api.Assertions;

public final class OfferDetailsUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OfferDetailsUpdate model = BinaryData.fromString(
            "{\"publisherId\":\"i\",\"offerId\":\"xhqyudxorrqnb\",\"planId\":\"czvyifq\",\"planName\":\"kdvjsll\",\"termUnit\":\"vvdfwatkpnpul\",\"termId\":\"xbczwtruwiqz\"}")
            .toObject(OfferDetailsUpdate.class);
        Assertions.assertEquals("i", model.publisherId());
        Assertions.assertEquals("xhqyudxorrqnb", model.offerId());
        Assertions.assertEquals("czvyifq", model.planId());
        Assertions.assertEquals("kdvjsll", model.planName());
        Assertions.assertEquals("vvdfwatkpnpul", model.termUnit());
        Assertions.assertEquals("xbczwtruwiqz", model.termId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OfferDetailsUpdate model = new OfferDetailsUpdate().withPublisherId("i")
            .withOfferId("xhqyudxorrqnb")
            .withPlanId("czvyifq")
            .withPlanName("kdvjsll")
            .withTermUnit("vvdfwatkpnpul")
            .withTermId("xbczwtruwiqz");
        model = BinaryData.fromObject(model).toObject(OfferDetailsUpdate.class);
        Assertions.assertEquals("i", model.publisherId());
        Assertions.assertEquals("xhqyudxorrqnb", model.offerId());
        Assertions.assertEquals("czvyifq", model.planId());
        Assertions.assertEquals("kdvjsll", model.planName());
        Assertions.assertEquals("vvdfwatkpnpul", model.termUnit());
        Assertions.assertEquals("xbczwtruwiqz", model.termId());
    }
}
