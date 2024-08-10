// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ClusterUpgradeDeltaHealthPolicy;
import org.junit.jupiter.api.Assertions;

public final class ClusterUpgradeDeltaHealthPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterUpgradeDeltaHealthPolicy model = BinaryData.fromString(
            "{\"maxPercentDeltaUnhealthyNodes\":549865384,\"maxPercentUpgradeDomainDeltaUnhealthyNodes\":1223650177,\"maxPercentDeltaUnhealthyApplications\":413629222}")
            .toObject(ClusterUpgradeDeltaHealthPolicy.class);
        Assertions.assertEquals(549865384, model.maxPercentDeltaUnhealthyNodes());
        Assertions.assertEquals(1223650177, model.maxPercentUpgradeDomainDeltaUnhealthyNodes());
        Assertions.assertEquals(413629222, model.maxPercentDeltaUnhealthyApplications());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterUpgradeDeltaHealthPolicy model
            = new ClusterUpgradeDeltaHealthPolicy().withMaxPercentDeltaUnhealthyNodes(549865384)
                .withMaxPercentUpgradeDomainDeltaUnhealthyNodes(1223650177)
                .withMaxPercentDeltaUnhealthyApplications(413629222);
        model = BinaryData.fromObject(model).toObject(ClusterUpgradeDeltaHealthPolicy.class);
        Assertions.assertEquals(549865384, model.maxPercentDeltaUnhealthyNodes());
        Assertions.assertEquals(1223650177, model.maxPercentUpgradeDomainDeltaUnhealthyNodes());
        Assertions.assertEquals(413629222, model.maxPercentDeltaUnhealthyApplications());
    }
}
