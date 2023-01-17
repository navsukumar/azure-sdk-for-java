// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datamigration.models.ReportableException;
import org.junit.jupiter.api.Assertions;

public final class ReportableExceptionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReportableException model =
            BinaryData
                .fromString(
                    "{\"message\":\"dobpxjmflbvvn\",\"actionableMessage\":\"rkcciwwzjuqk\",\"filePath\":\"sa\",\"lineNumber\":\"wkuofoskghsauu\",\"hResult\":1525008184,\"stackTrace\":\"vxieduugidyj\"}")
                .toObject(ReportableException.class);
        Assertions.assertEquals("rkcciwwzjuqk", model.actionableMessage());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReportableException model = new ReportableException().withActionableMessage("rkcciwwzjuqk");
        model = BinaryData.fromObject(model).toObject(ReportableException.class);
        Assertions.assertEquals("rkcciwwzjuqk", model.actionableMessage());
    }
}
