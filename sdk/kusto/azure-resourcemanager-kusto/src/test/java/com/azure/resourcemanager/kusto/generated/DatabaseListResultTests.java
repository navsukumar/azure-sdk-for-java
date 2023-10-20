// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.DatabaseInner;
import com.azure.resourcemanager.kusto.models.DatabaseListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DatabaseListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatabaseListResult model =
            BinaryData
                .fromString(
                    "{\"nextLink\":\"ycduier\",\"value\":[{\"kind\":\"Database\",\"location\":\"y\",\"id\":\"vaolpsslqlf\",\"name\":\"mdnbbglzpswiy\",\"type\":\"mcwyhzdxssadb\"},{\"kind\":\"Database\",\"location\":\"nvdfznuda\",\"id\":\"dvxzbncblylpst\",\"name\":\"bhhxsrzdzuc\",\"type\":\"rsc\"},{\"kind\":\"Database\",\"location\":\"t\",\"id\":\"evfiwjmygt\",\"name\":\"sslswtmweriof\",\"type\":\"pyqs\"},{\"kind\":\"Database\",\"location\":\"wab\",\"id\":\"ets\",\"name\":\"hszhedplvwiwu\",\"type\":\"mwmbes\"}]}")
                .toObject(DatabaseListResult.class);
        Assertions.assertEquals("ycduier", model.nextLink());
        Assertions.assertEquals("y", model.value().get(0).location());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatabaseListResult model =
            new DatabaseListResult()
                .withNextLink("ycduier")
                .withValue(
                    Arrays
                        .asList(
                            new DatabaseInner().withLocation("y"),
                            new DatabaseInner().withLocation("nvdfznuda"),
                            new DatabaseInner().withLocation("t"),
                            new DatabaseInner().withLocation("wab")));
        model = BinaryData.fromObject(model).toObject(DatabaseListResult.class);
        Assertions.assertEquals("ycduier", model.nextLink());
        Assertions.assertEquals("y", model.value().get(0).location());
    }
}
