// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.models.VpnPacketCaptureStartParameters;

/**
 * Samples for VirtualNetworkGatewayConnections StartPacketCapture.
 */
public final class VirtualNetworkGatewayConnectionsStartPacketCaptureSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-01-01/examples/
     * VirtualNetworkGatewayConnectionStartPacketCapture.json
     */
    /**
     * Sample code: Start packet capture on virtual network gateway connection without filter.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void startPacketCaptureOnVirtualNetworkGatewayConnectionWithoutFilter(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVirtualNetworkGatewayConnections()
            .startPacketCapture("rg1", "vpngwcn1", null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-01-01/examples/
     * VirtualNetworkGatewayConnectionStartPacketCaptureFilterData.json
     */
    /**
     * Sample code: Start packet capture on virtual network gateway connection with filter.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void startPacketCaptureOnVirtualNetworkGatewayConnectionWithFilter(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVirtualNetworkGatewayConnections()
            .startPacketCapture("rg1", "vpngwcn1", new VpnPacketCaptureStartParameters().withFilterData(
                "{'TracingFlags': 11,'MaxPacketBufferSize': 120,'MaxFileSize': 200,'Filters': [{'SourceSubnets': ['20.1.1.0/24'],'DestinationSubnets': ['10.1.1.0/24'],'SourcePort': [500],'DestinationPort': [4500],'Protocol': 6,'TcpFlags': 16,'CaptureSingleDirectionTrafficOnly': true}]}"),
                com.azure.core.util.Context.NONE);
    }
}
