// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for ConnectionMonitors Query.
 */
public final class ConnectionMonitorsQuerySamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-01-01/examples/
     * NetworkWatcherConnectionMonitorQuery.json
     */
    /**
     * Sample code: Query connection monitor.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void queryConnectionMonitor(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getConnectionMonitors()
            .query("rg1", "nw1", "cm1", com.azure.core.util.Context.NONE);
    }
}
