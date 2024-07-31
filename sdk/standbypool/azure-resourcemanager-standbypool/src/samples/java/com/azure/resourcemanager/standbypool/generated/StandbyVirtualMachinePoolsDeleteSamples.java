// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.generated;

/**
 * Samples for StandbyVirtualMachinePools Delete.
 */
public final class StandbyVirtualMachinePoolsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/standbypool/StandbyPool.Management/examples/2024-03-01-preview/StandbyVirtualMachinePools_Delete.
     * json
     */
    /**
     * Sample code: StandbyVirtualMachinePools_Delete.
     * 
     * @param manager Entry point to StandbyPoolManager.
     */
    public static void
        standbyVirtualMachinePoolsDelete(com.azure.resourcemanager.standbypool.StandbyPoolManager manager) {
        manager.standbyVirtualMachinePools().delete("rgstandbypool", "pool", com.azure.core.util.Context.NONE);
    }
}
