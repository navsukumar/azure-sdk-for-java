// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabricmanagedclusters.fluent.models.NodeTypeAvailableSkuInner;

public final class NodeTypeAvailableSkuInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NodeTypeAvailableSkuInner model = BinaryData.fromString(
            "{\"resourceType\":\"gaojf\",\"sku\":{\"name\":\"cotmr\",\"tier\":\"irctymoxoftpipiw\"},\"capacity\":{\"minimum\":422952763,\"maximum\":1967043899,\"default\":481120097,\"scaleType\":\"None\"}}")
            .toObject(NodeTypeAvailableSkuInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NodeTypeAvailableSkuInner model = new NodeTypeAvailableSkuInner();
        model = BinaryData.fromObject(model).toObject(NodeTypeAvailableSkuInner.class);
    }
}
