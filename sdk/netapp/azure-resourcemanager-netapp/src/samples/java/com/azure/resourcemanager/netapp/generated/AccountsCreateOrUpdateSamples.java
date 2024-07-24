// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.resourcemanager.netapp.models.ActiveDirectory;
import java.util.Arrays;

/**
 * Samples for Accounts CreateOrUpdate.
 */
public final class AccountsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/netapp/resource-manager/Microsoft.NetApp/stable/2023-11-01/examples/Accounts_CreateOrUpdate.json
     */
    /**
     * Sample code: Accounts_CreateOrUpdate.
     * 
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void accountsCreateOrUpdate(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.accounts().define("account1").withRegion("eastus").withExistingResourceGroup("myRG").create();
    }

    /*
     * x-ms-original-file:
     * specification/netapp/resource-manager/Microsoft.NetApp/stable/2023-11-01/examples/Accounts_CreateOrUpdateAD.json
     */
    /**
     * Sample code: Accounts_CreateOrUpdateWithActiveDirectory.
     * 
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void
        accountsCreateOrUpdateWithActiveDirectory(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.accounts()
            .define("account1")
            .withRegion("eastus")
            .withExistingResourceGroup("myRG")
            .withActiveDirectories(Arrays.asList(new ActiveDirectory().withUsername("ad_user_name")
                .withPassword("fakeTokenPlaceholder")
                .withDomain("10.10.10.3")
                .withDns("10.10.10.3")
                .withSmbServerName("SMBServer")
                .withOrganizationalUnit("OU=Engineering")
                .withSite("SiteName")
                .withAesEncryption(true)
                .withLdapSigning(false)
                .withLdapOverTls(false)))
            .create();
    }
}
