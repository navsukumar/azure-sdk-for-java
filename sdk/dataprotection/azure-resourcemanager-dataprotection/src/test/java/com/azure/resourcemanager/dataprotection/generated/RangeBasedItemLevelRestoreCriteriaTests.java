// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.RangeBasedItemLevelRestoreCriteria;
import org.junit.jupiter.api.Assertions;

public final class RangeBasedItemLevelRestoreCriteriaTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RangeBasedItemLevelRestoreCriteria model = BinaryData.fromString(
            "{\"objectType\":\"RangeBasedItemLevelRestoreCriteria\",\"minMatchingValue\":\"ezzxscyhwzdgiruj\",\"maxMatchingValue\":\"bomvzzbtdcqv\"}")
            .toObject(RangeBasedItemLevelRestoreCriteria.class);
        Assertions.assertEquals("ezzxscyhwzdgiruj", model.minMatchingValue());
        Assertions.assertEquals("bomvzzbtdcqv", model.maxMatchingValue());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RangeBasedItemLevelRestoreCriteria model
            = new RangeBasedItemLevelRestoreCriteria().withMinMatchingValue("ezzxscyhwzdgiruj")
                .withMaxMatchingValue("bomvzzbtdcqv");
        model = BinaryData.fromObject(model).toObject(RangeBasedItemLevelRestoreCriteria.class);
        Assertions.assertEquals("ezzxscyhwzdgiruj", model.minMatchingValue());
        Assertions.assertEquals("bomvzzbtdcqv", model.maxMatchingValue());
    }
}
