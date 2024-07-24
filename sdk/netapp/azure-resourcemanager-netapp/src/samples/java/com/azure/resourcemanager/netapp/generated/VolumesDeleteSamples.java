// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

/**
 * Samples for Volumes Delete.
 */
public final class VolumesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/netapp/resource-manager/Microsoft.NetApp/stable/2023-11-01/examples/Volumes_Delete.json
     */
    /**
     * Sample code: Volumes_Delete.
     * 
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void volumesDelete(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.volumes().delete("myRG", "account1", "pool1", "volume1", null, com.azure.core.util.Context.NONE);
    }
}
