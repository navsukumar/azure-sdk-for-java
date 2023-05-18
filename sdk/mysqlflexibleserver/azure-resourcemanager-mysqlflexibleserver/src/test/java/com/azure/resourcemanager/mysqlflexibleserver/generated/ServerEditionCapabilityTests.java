// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.models.ServerEditionCapability;

public final class ServerEditionCapabilityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServerEditionCapability model =
            BinaryData
                .fromString(
                    "{\"name\":\"udxorrqn\",\"supportedStorageEditions\":[{\"name\":\"zvyifqrvkdvj\",\"minStorageSize\":3602114313463571295,\"maxStorageSize\":5675151701558960603,\"minBackupRetentionDays\":628578749185712506,\"maxBackupRetentionDays\":524078729547921435},{\"name\":\"n\",\"minStorageSize\":2611651142530368234,\"maxStorageSize\":3827252947498209847,\"minBackupRetentionDays\":9207665581714486982,\"maxBackupRetentionDays\":5624751011195276042}],\"supportedServerVersions\":[{\"name\":\"zb\",\"supportedSkus\":[]},{\"name\":\"ovm\",\"supportedSkus\":[]}]}")
                .toObject(ServerEditionCapability.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServerEditionCapability model = new ServerEditionCapability();
        model = BinaryData.fromObject(model).toObject(ServerEditionCapability.class);
    }
}
