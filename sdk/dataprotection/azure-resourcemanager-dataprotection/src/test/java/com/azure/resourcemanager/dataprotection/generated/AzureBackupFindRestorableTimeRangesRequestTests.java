// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.AzureBackupFindRestorableTimeRangesRequest;
import com.azure.resourcemanager.dataprotection.models.RestoreSourceDataStoreType;
import org.junit.jupiter.api.Assertions;

public final class AzureBackupFindRestorableTimeRangesRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBackupFindRestorableTimeRangesRequest model = BinaryData
            .fromString(
                "{\"sourceDataStoreType\":\"VaultStore\",\"startTime\":\"ylgqgitxmedjvcsl\",\"endTime\":\"qwwncw\"}")
            .toObject(AzureBackupFindRestorableTimeRangesRequest.class);
        Assertions.assertEquals(RestoreSourceDataStoreType.VAULT_STORE, model.sourceDataStoreType());
        Assertions.assertEquals("ylgqgitxmedjvcsl", model.startTime());
        Assertions.assertEquals("qwwncw", model.endTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBackupFindRestorableTimeRangesRequest model = new AzureBackupFindRestorableTimeRangesRequest()
            .withSourceDataStoreType(RestoreSourceDataStoreType.VAULT_STORE)
            .withStartTime("ylgqgitxmedjvcsl")
            .withEndTime("qwwncw");
        model = BinaryData.fromObject(model).toObject(AzureBackupFindRestorableTimeRangesRequest.class);
        Assertions.assertEquals(RestoreSourceDataStoreType.VAULT_STORE, model.sourceDataStoreType());
        Assertions.assertEquals("ylgqgitxmedjvcsl", model.startTime());
        Assertions.assertEquals("qwwncw", model.endTime());
    }
}
