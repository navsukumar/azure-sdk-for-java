// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devopsinfrastructure.models.ResourceSkuLocationInfo;
import org.junit.jupiter.api.Assertions;

public final class ResourceSkuLocationInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceSkuLocationInfo model = BinaryData.fromString(
            "{\"location\":\"mygtdssls\",\"zones\":[\"mweriofzpy\",\"semwabnet\",\"hhszh\"],\"zoneDetails\":[{\"name\":[\"lvwiwubmwmbesl\",\"nkww\",\"pp\",\"flcxoga\"],\"capabilities\":[{\"name\":\"onz\",\"value\":\"nsikvmkqzeqqkdl\"},{\"name\":\"fzxmhhvhgureodkw\",\"value\":\"bdagxt\"},{\"name\":\"bqdxbx\",\"value\":\"akbogqxndlkzgxh\"}]}]}")
            .toObject(ResourceSkuLocationInfo.class);
        Assertions.assertEquals("mygtdssls", model.location());
        Assertions.assertEquals("mweriofzpy", model.zones().get(0));
        Assertions.assertEquals("lvwiwubmwmbesl", model.zoneDetails().get(0).name().get(0));
        Assertions.assertEquals("onz", model.zoneDetails().get(0).capabilities().get(0).name());
        Assertions.assertEquals("nsikvmkqzeqqkdl", model.zoneDetails().get(0).capabilities().get(0).value());
    }
}
