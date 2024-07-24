// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.OperationDetailInner;
import com.azure.resourcemanager.appcontainers.models.AvailableOperations;
import com.azure.resourcemanager.appcontainers.models.OperationDisplay;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AvailableOperationsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AvailableOperations model = BinaryData.fromString(
            "{\"value\":[{\"name\":\"gfsxzec\",\"isDataAction\":false,\"display\":{\"provider\":\"ufykhvuhxepmru\",\"resource\":\"nabaobnslujd\",\"operation\":\"tymkmvguihywart\",\"description\":\"phkixkykxdssjpe\"},\"origin\":\"ucfx\"}],\"nextLink\":\"kkflrmymyincqlhr\"}")
            .toObject(AvailableOperations.class);
        Assertions.assertEquals("gfsxzec", model.value().get(0).name());
        Assertions.assertEquals(false, model.value().get(0).isDataAction());
        Assertions.assertEquals("ufykhvuhxepmru", model.value().get(0).display().provider());
        Assertions.assertEquals("nabaobnslujd", model.value().get(0).display().resource());
        Assertions.assertEquals("tymkmvguihywart", model.value().get(0).display().operation());
        Assertions.assertEquals("phkixkykxdssjpe", model.value().get(0).display().description());
        Assertions.assertEquals("ucfx", model.value().get(0).origin());
        Assertions.assertEquals("kkflrmymyincqlhr", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AvailableOperations model
            = new AvailableOperations().withValue(Arrays.asList(new OperationDetailInner().withName("gfsxzec")
                .withIsDataAction(false)
                .withDisplay(new OperationDisplay().withProvider("ufykhvuhxepmru")
                    .withResource("nabaobnslujd")
                    .withOperation("tymkmvguihywart")
                    .withDescription("phkixkykxdssjpe"))
                .withOrigin("ucfx"))).withNextLink("kkflrmymyincqlhr");
        model = BinaryData.fromObject(model).toObject(AvailableOperations.class);
        Assertions.assertEquals("gfsxzec", model.value().get(0).name());
        Assertions.assertEquals(false, model.value().get(0).isDataAction());
        Assertions.assertEquals("ufykhvuhxepmru", model.value().get(0).display().provider());
        Assertions.assertEquals("nabaobnslujd", model.value().get(0).display().resource());
        Assertions.assertEquals("tymkmvguihywart", model.value().get(0).display().operation());
        Assertions.assertEquals("phkixkykxdssjpe", model.value().get(0).display().description());
        Assertions.assertEquals("ucfx", model.value().get(0).origin());
        Assertions.assertEquals("kkflrmymyincqlhr", model.nextLink());
    }
}
