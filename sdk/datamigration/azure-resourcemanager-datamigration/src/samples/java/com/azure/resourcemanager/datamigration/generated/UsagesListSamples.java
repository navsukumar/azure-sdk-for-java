// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

/** Samples for Usages List. */
public final class UsagesListSamples {
    /*
     * x-ms-original-file: specification/datamigration/resource-manager/Microsoft.DataMigration/stable/2018-04-19/examples/Usages_List.json
     */
    /**
     * Sample code: Services_Usages.
     *
     * @param manager Entry point to DataMigrationManager.
     */
    public static void servicesUsages(com.azure.resourcemanager.datamigration.DataMigrationManager manager) {
        manager.usages().list("westus", com.azure.core.util.Context.NONE);
    }
}
