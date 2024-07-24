// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.AzureBackupRestoreRequest;
import com.azure.resourcemanager.dataprotection.models.CrossRegionRestoreDetails;
import com.azure.resourcemanager.dataprotection.models.IdentityDetails;
import com.azure.resourcemanager.dataprotection.models.RecoveryOption;
import com.azure.resourcemanager.dataprotection.models.RestoreTargetInfoBase;
import com.azure.resourcemanager.dataprotection.models.SourceDataStoreType;
import com.azure.resourcemanager.dataprotection.models.ValidateCrossRegionRestoreRequestObject;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ValidateCrossRegionRestoreRequestObjectTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ValidateCrossRegionRestoreRequestObject model = BinaryData.fromString(
            "{\"restoreRequestObject\":{\"objectType\":\"AzureBackupRestoreRequest\",\"restoreTargetInfo\":{\"objectType\":\"RestoreTargetInfoBase\",\"recoveryOption\":\"FailIfExists\",\"restoreLocation\":\"plwzbhvgyugu\"},\"sourceDataStoreType\":\"OperationalStore\",\"sourceResourceId\":\"mkfssxqukkfplgm\",\"resourceGuardOperationRequests\":[\"nkjzkdeslpvlop\",\"i\",\"ighxpk\"],\"identityDetails\":{\"useSystemAssignedIdentity\":true,\"userAssignedIdentityArmUrl\":\"iuebbaumny\"}},\"crossRegionRestoreDetails\":{\"sourceRegion\":\"upedeojnabckhs\",\"sourceBackupInstanceId\":\"txp\"}}")
            .toObject(ValidateCrossRegionRestoreRequestObject.class);
        Assertions.assertEquals(RecoveryOption.FAIL_IF_EXISTS,
            model.restoreRequestObject().restoreTargetInfo().recoveryOption());
        Assertions.assertEquals("plwzbhvgyugu", model.restoreRequestObject().restoreTargetInfo().restoreLocation());
        Assertions.assertEquals(SourceDataStoreType.OPERATIONAL_STORE,
            model.restoreRequestObject().sourceDataStoreType());
        Assertions.assertEquals("mkfssxqukkfplgm", model.restoreRequestObject().sourceResourceId());
        Assertions.assertEquals("nkjzkdeslpvlop", model.restoreRequestObject().resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(true, model.restoreRequestObject().identityDetails().useSystemAssignedIdentity());
        Assertions.assertEquals("iuebbaumny",
            model.restoreRequestObject().identityDetails().userAssignedIdentityArmUrl());
        Assertions.assertEquals("upedeojnabckhs", model.crossRegionRestoreDetails().sourceRegion());
        Assertions.assertEquals("txp", model.crossRegionRestoreDetails().sourceBackupInstanceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ValidateCrossRegionRestoreRequestObject model
            = new ValidateCrossRegionRestoreRequestObject()
                .withRestoreRequestObject(new AzureBackupRestoreRequest()
                    .withRestoreTargetInfo(new RestoreTargetInfoBase().withRecoveryOption(RecoveryOption.FAIL_IF_EXISTS)
                        .withRestoreLocation("plwzbhvgyugu"))
                    .withSourceDataStoreType(SourceDataStoreType.OPERATIONAL_STORE)
                    .withSourceResourceId("mkfssxqukkfplgm")
                    .withResourceGuardOperationRequests(Arrays.asList("nkjzkdeslpvlop", "i", "ighxpk"))
                    .withIdentityDetails(new IdentityDetails().withUseSystemAssignedIdentity(true)
                        .withUserAssignedIdentityArmUrl("iuebbaumny")))
                .withCrossRegionRestoreDetails(new CrossRegionRestoreDetails().withSourceRegion("upedeojnabckhs")
                    .withSourceBackupInstanceId("txp"));
        model = BinaryData.fromObject(model).toObject(ValidateCrossRegionRestoreRequestObject.class);
        Assertions.assertEquals(RecoveryOption.FAIL_IF_EXISTS,
            model.restoreRequestObject().restoreTargetInfo().recoveryOption());
        Assertions.assertEquals("plwzbhvgyugu", model.restoreRequestObject().restoreTargetInfo().restoreLocation());
        Assertions.assertEquals(SourceDataStoreType.OPERATIONAL_STORE,
            model.restoreRequestObject().sourceDataStoreType());
        Assertions.assertEquals("mkfssxqukkfplgm", model.restoreRequestObject().sourceResourceId());
        Assertions.assertEquals("nkjzkdeslpvlop", model.restoreRequestObject().resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(true, model.restoreRequestObject().identityDetails().useSystemAssignedIdentity());
        Assertions.assertEquals("iuebbaumny",
            model.restoreRequestObject().identityDetails().userAssignedIdentityArmUrl());
        Assertions.assertEquals("upedeojnabckhs", model.crossRegionRestoreDetails().sourceRegion());
        Assertions.assertEquals("txp", model.crossRegionRestoreDetails().sourceBackupInstanceId());
    }
}
