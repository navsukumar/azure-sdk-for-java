// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.models.EnableStatusEnum;
import com.azure.resourcemanager.mysqlflexibleserver.models.Storage;
import org.junit.jupiter.api.Assertions;

public final class StorageTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Storage model =
            BinaryData
                .fromString(
                    "{\"storageSizeGB\":1338183758,\"iops\":837766841,\"autoGrow\":\"Disabled\",\"logOnDisk\":\"Disabled\",\"storageSku\":\"owskanyktz\",\"autoIoScaling\":\"Enabled\"}")
                .toObject(Storage.class);
        Assertions.assertEquals(1338183758, model.storageSizeGB());
        Assertions.assertEquals(837766841, model.iops());
        Assertions.assertEquals(EnableStatusEnum.DISABLED, model.autoGrow());
        Assertions.assertEquals(EnableStatusEnum.DISABLED, model.logOnDisk());
        Assertions.assertEquals(EnableStatusEnum.ENABLED, model.autoIoScaling());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Storage model =
            new Storage()
                .withStorageSizeGB(1338183758)
                .withIops(837766841)
                .withAutoGrow(EnableStatusEnum.DISABLED)
                .withLogOnDisk(EnableStatusEnum.DISABLED)
                .withAutoIoScaling(EnableStatusEnum.ENABLED);
        model = BinaryData.fromObject(model).toObject(Storage.class);
        Assertions.assertEquals(1338183758, model.storageSizeGB());
        Assertions.assertEquals(837766841, model.iops());
        Assertions.assertEquals(EnableStatusEnum.DISABLED, model.autoGrow());
        Assertions.assertEquals(EnableStatusEnum.DISABLED, model.logOnDisk());
        Assertions.assertEquals(EnableStatusEnum.ENABLED, model.autoIoScaling());
    }
}
