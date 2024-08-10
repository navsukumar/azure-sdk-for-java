// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.generated;

import com.azure.resourcemanager.dns.fluent.models.RecordSetInner;
import com.azure.resourcemanager.dns.models.RecordType;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for RecordSets Update.
 */
public final class RecordSetsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/PatchMXRecordset.json
     */
    /**
     * Sample code: Patch MX recordset.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void patchMXRecordset(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.dnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .updateWithResponse("rg1", "zone1", "record1", RecordType.MX,
                new RecordSetInner().withMetadata(mapOf("key2", "fakeTokenPlaceholder")), null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/PatchNSRecordset.json
     */
    /**
     * Sample code: Patch NS recordset.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void patchNSRecordset(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.dnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .updateWithResponse("rg1", "zone1", "record1", RecordType.NS,
                new RecordSetInner().withMetadata(mapOf("key2", "fakeTokenPlaceholder")), null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/PatchPTRRecordset.json
     */
    /**
     * Sample code: Patch PTR recordset.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void patchPTRRecordset(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.dnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .updateWithResponse("rg1", "0.0.127.in-addr.arpa", "1", RecordType.PTR,
                new RecordSetInner().withMetadata(mapOf("key2", "fakeTokenPlaceholder")), null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/PatchSOARecordset.json
     */
    /**
     * Sample code: Patch SOA recordset.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void patchSOARecordset(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.dnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .updateWithResponse("rg1", "zone1", "@", RecordType.SOA,
                new RecordSetInner().withMetadata(mapOf("key2", "fakeTokenPlaceholder")), null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/PatchARecordset.json
     */
    /**
     * Sample code: Patch A recordset.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void patchARecordset(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.dnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .updateWithResponse("rg1", "zone1", "record1", RecordType.A,
                new RecordSetInner().withMetadata(mapOf("key2", "fakeTokenPlaceholder")), null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/PatchTXTRecordset.json
     */
    /**
     * Sample code: Patch TXT recordset.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void patchTXTRecordset(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.dnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .updateWithResponse("rg1", "zone1", "record1", RecordType.TXT,
                new RecordSetInner().withMetadata(mapOf("key2", "fakeTokenPlaceholder")), null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/PatchCaaRecordset.json
     */
    /**
     * Sample code: Patch CAA recordset.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void patchCAARecordset(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.dnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .updateWithResponse("rg1", "zone1", "record1", RecordType.CAA,
                new RecordSetInner().withMetadata(mapOf("key2", "fakeTokenPlaceholder")), null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/PatchAAAARecordset.json
     */
    /**
     * Sample code: Patch AAAA recordset.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void patchAAAARecordset(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.dnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .updateWithResponse("rg1", "zone1", "record1", RecordType.AAAA,
                new RecordSetInner().withMetadata(mapOf("key2", "fakeTokenPlaceholder")), null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/PatchCNAMERecordset.json
     */
    /**
     * Sample code: Patch CNAME recordset.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void patchCNAMERecordset(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.dnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .updateWithResponse("rg1", "zone1", "record1", RecordType.CNAME,
                new RecordSetInner().withMetadata(mapOf("key2", "fakeTokenPlaceholder")), null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/PatchSRVRecordset.json
     */
    /**
     * Sample code: Patch SRV recordset.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void patchSRVRecordset(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.dnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .updateWithResponse("rg1", "zone1", "record1", RecordType.SRV,
                new RecordSetInner().withMetadata(mapOf("key2", "fakeTokenPlaceholder")), null,
                com.azure.core.util.Context.NONE);
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
