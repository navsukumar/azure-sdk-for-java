// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for WebApps GetBackupStatus.
 */
public final class WebAppsGetBackupStatusSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/GetWebAppBackup.json
     */
    /**
     * Sample code: Get web app backup.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getWebAppBackup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getWebApps()
            .getBackupStatusWithResponse("testrg123", "sitef6141", "12345", com.azure.core.util.Context.NONE);
    }
}
