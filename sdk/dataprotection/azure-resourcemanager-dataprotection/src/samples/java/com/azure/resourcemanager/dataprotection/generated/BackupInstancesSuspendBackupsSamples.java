// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.resourcemanager.dataprotection.models.SuspendBackupRequest;
import java.util.Arrays;

/**
 * Samples for BackupInstances SuspendBackups.
 */
public final class BackupInstancesSuspendBackupsSamples {
    /*
     * x-ms-original-file:
     * specification/dataprotection/resource-manager/Microsoft.DataProtection/stable/2024-04-01/examples/
     * BackupInstanceOperations/SuspendBackups.json
     */
    /**
     * Sample code: SuspendBackups.
     * 
     * @param manager Entry point to DataProtectionManager.
     */
    public static void suspendBackups(com.azure.resourcemanager.dataprotection.DataProtectionManager manager) {
        manager.backupInstances()
            .suspendBackups("testrg", "testvault", "testbi", null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/dataprotection/resource-manager/Microsoft.DataProtection/stable/2024-04-01/examples/
     * BackupInstanceOperations/SuspendBackup_ResourceGuardEnabled.json
     */
    /**
     * Sample code: SuspendBackups with MUA.
     * 
     * @param manager Entry point to DataProtectionManager.
     */
    public static void suspendBackupsWithMUA(com.azure.resourcemanager.dataprotection.DataProtectionManager manager) {
        manager.backupInstances()
            .suspendBackups("testrg", "testvault", "testbi",
                new SuspendBackupRequest().withResourceGuardOperationRequests(Arrays.asList(
                    "/subscriptions/754ec39f-8d2a-44cf-bfbf-13107ac85c36/resourcegroups/mua-testing/providers/Microsoft.DataProtection/resourceGuards/gvjreddy-test-ecy-rg-reader/dppDisableSuspendBackupsRequests/default")),
                com.azure.core.util.Context.NONE);
    }
}
