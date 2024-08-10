// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.resourcemanager.sql.fluent.models.EncryptionProtectorInner;
import com.azure.resourcemanager.sql.models.EncryptionProtectorName;
import com.azure.resourcemanager.sql.models.ServerKeyType;

/**
 * Samples for EncryptionProtectors CreateOrUpdate.
 */
public final class EncryptionProtectorsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/
     * EncryptionProtectorCreateOrUpdateKeyVault.json
     */
    /**
     * Sample code: Update the encryption protector to key vault.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateTheEncryptionProtectorToKeyVault(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getEncryptionProtectors()
            .createOrUpdate("sqlcrudtest-7398", "sqlcrudtest-4645", EncryptionProtectorName.CURRENT,
                new EncryptionProtectorInner().withServerKeyName("fakeTokenPlaceholder")
                    .withServerKeyType(ServerKeyType.AZURE_KEY_VAULT)
                    .withAutoRotationEnabled(false),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/
     * EncryptionProtectorCreateOrUpdateServiceManaged.json
     */
    /**
     * Sample code: Update the encryption protector to service managed.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        updateTheEncryptionProtectorToServiceManaged(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getEncryptionProtectors()
            .createOrUpdate("sqlcrudtest-7398", "sqlcrudtest-4645", EncryptionProtectorName.CURRENT,
                new EncryptionProtectorInner().withServerKeyName("fakeTokenPlaceholder")
                    .withServerKeyType(ServerKeyType.SERVICE_MANAGED),
                com.azure.core.util.Context.NONE);
    }
}
