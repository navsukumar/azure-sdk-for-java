// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.models.RequestMatchPattern;
import org.junit.jupiter.api.Assertions;

public final class RequestMatchPatternTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RequestMatchPattern model =
            BinaryData
                .fromString("{\"path\":\"hsgcbacphejkot\",\"method\":\"qgoulznd\"}")
                .toObject(RequestMatchPattern.class);
        Assertions.assertEquals("hsgcbacphejkot", model.path());
        Assertions.assertEquals("qgoulznd", model.method());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RequestMatchPattern model = new RequestMatchPattern().withPath("hsgcbacphejkot").withMethod("qgoulznd");
        model = BinaryData.fromObject(model).toObject(RequestMatchPattern.class);
        Assertions.assertEquals("hsgcbacphejkot", model.path());
        Assertions.assertEquals("qgoulznd", model.method());
    }
}
