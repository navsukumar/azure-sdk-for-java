// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for Certificates Delete.
 */
public final class CertificatesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/DeleteCertificate.json
     */
    /**
     * Sample code: Delete Certificate.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteCertificate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getCertificates()
            .deleteWithResponse("testrg123", "testc6282", com.azure.core.util.Context.NONE);
    }
}
