// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.resourcemanager.kusto.models.CallerRole;
import com.azure.resourcemanager.kusto.models.ReadOnlyFollowingDatabase;
import com.azure.resourcemanager.kusto.models.ReadWriteDatabase;
import java.time.Duration;

/** Samples for Databases CreateOrUpdate. */
public final class DatabasesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/azure-kusto/resource-manager/Microsoft.Kusto/stable/2023-08-15/examples/KustoDatabaseReadonlyUpdate.json
     */
    /**
     * Sample code: Kusto ReadOnly database update.
     *
     * @param manager Entry point to KustoManager.
     */
    public static void kustoReadOnlyDatabaseUpdate(com.azure.resourcemanager.kusto.KustoManager manager) {
        manager
            .databases()
            .createOrUpdate(
                "kustorptest",
                "kustoCluster",
                "kustoReadOnlyDatabase",
                new ReadOnlyFollowingDatabase().withLocation("westus").withHotCachePeriod(Duration.parse("P1D")),
                null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/azure-kusto/resource-manager/Microsoft.Kusto/stable/2023-08-15/examples/KustoDatabasesCreateOrUpdate.json
     */
    /**
     * Sample code: Kusto ReadWrite database create or update.
     *
     * @param manager Entry point to KustoManager.
     */
    public static void kustoReadWriteDatabaseCreateOrUpdate(com.azure.resourcemanager.kusto.KustoManager manager) {
        manager
            .databases()
            .createOrUpdate(
                "kustorptest",
                "kustoCluster",
                "KustoDatabase8",
                new ReadWriteDatabase().withLocation("westus").withSoftDeletePeriod(Duration.parse("P1D")),
                CallerRole.ADMIN,
                com.azure.core.util.Context.NONE);
    }
}
