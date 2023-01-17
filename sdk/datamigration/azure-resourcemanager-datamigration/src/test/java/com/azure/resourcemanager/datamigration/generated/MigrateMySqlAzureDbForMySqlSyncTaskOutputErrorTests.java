// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datamigration.models.MigrateMySqlAzureDbForMySqlSyncTaskOutputError;

public final class MigrateMySqlAzureDbForMySqlSyncTaskOutputErrorTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MigrateMySqlAzureDbForMySqlSyncTaskOutputError model =
            BinaryData
                .fromString(
                    "{\"resultType\":\"ErrorOutput\",\"error\":{\"message\":\"dut\",\"actionableMessage\":\"ormrlxqtvcofudfl\",\"filePath\":\"gj\",\"lineNumber\":\"gdknnqv\",\"hResult\":1989846717,\"stackTrace\":\"qntorudsgsahmkyc\"},\"id\":\"auwjuetaebu\"}")
                .toObject(MigrateMySqlAzureDbForMySqlSyncTaskOutputError.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MigrateMySqlAzureDbForMySqlSyncTaskOutputError model = new MigrateMySqlAzureDbForMySqlSyncTaskOutputError();
        model = BinaryData.fromObject(model).toObject(MigrateMySqlAzureDbForMySqlSyncTaskOutputError.class);
    }
}
