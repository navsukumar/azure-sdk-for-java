// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elastic.fluent.models.ElasticTrafficFilterResponseInner;
import com.azure.resourcemanager.elastic.models.ElasticTrafficFilter;
import com.azure.resourcemanager.elastic.models.Type;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ElasticTrafficFilterResponseInnerTests {
    @Test
    public void testDeserialize() {
        ElasticTrafficFilterResponseInner model =
            BinaryData
                .fromString(
                    "{\"rulesets\":[{\"id\":\"kwlzuvccfwnfn\",\"name\":\"cfionl\",\"description\":\"x\",\"region\":\"qgtz\",\"type\":\"azure_private_endpoint\",\"includeByDefault\":false,\"rules\":[]},{\"id\":\"wxrjfeallnwsub\",\"name\":\"njampm\",\"description\":\"nzscxa\",\"region\":\"ooch\",\"type\":\"ip\",\"includeByDefault\":true,\"rules\":[]},{\"id\":\"vlrxnjeaseiph\",\"name\":\"f\",\"description\":\"keyyi\",\"region\":\"jbdlwtgrhpdjpju\",\"type\":\"ip\",\"includeByDefault\":true,\"rules\":[]},{\"id\":\"qyeg\",\"name\":\"lhbxxhejjzzvdud\",\"description\":\"dslfhotwmcy\",\"region\":\"wlbjnpgacftade\",\"type\":\"azure_private_endpoint\",\"includeByDefault\":true,\"rules\":[]}]}")
                .toObject(ElasticTrafficFilterResponseInner.class);
        Assertions.assertEquals("kwlzuvccfwnfn", model.rulesets().get(0).id());
        Assertions.assertEquals("cfionl", model.rulesets().get(0).name());
        Assertions.assertEquals("x", model.rulesets().get(0).description());
        Assertions.assertEquals("qgtz", model.rulesets().get(0).region());
        Assertions.assertEquals(Type.AZURE_PRIVATE_ENDPOINT, model.rulesets().get(0).type());
        Assertions.assertEquals(false, model.rulesets().get(0).includeByDefault());
    }

    @Test
    public void testSerialize() {
        ElasticTrafficFilterResponseInner model =
            new ElasticTrafficFilterResponseInner()
                .withRulesets(
                    Arrays
                        .asList(
                            new ElasticTrafficFilter()
                                .withId("kwlzuvccfwnfn")
                                .withName("cfionl")
                                .withDescription("x")
                                .withRegion("qgtz")
                                .withType(Type.AZURE_PRIVATE_ENDPOINT)
                                .withIncludeByDefault(false)
                                .withRules(Arrays.asList()),
                            new ElasticTrafficFilter()
                                .withId("wxrjfeallnwsub")
                                .withName("njampm")
                                .withDescription("nzscxa")
                                .withRegion("ooch")
                                .withType(Type.IP)
                                .withIncludeByDefault(true)
                                .withRules(Arrays.asList()),
                            new ElasticTrafficFilter()
                                .withId("vlrxnjeaseiph")
                                .withName("f")
                                .withDescription("keyyi")
                                .withRegion("jbdlwtgrhpdjpju")
                                .withType(Type.IP)
                                .withIncludeByDefault(true)
                                .withRules(Arrays.asList()),
                            new ElasticTrafficFilter()
                                .withId("qyeg")
                                .withName("lhbxxhejjzzvdud")
                                .withDescription("dslfhotwmcy")
                                .withRegion("wlbjnpgacftade")
                                .withType(Type.AZURE_PRIVATE_ENDPOINT)
                                .withIncludeByDefault(true)
                                .withRules(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(ElasticTrafficFilterResponseInner.class);
        Assertions.assertEquals("kwlzuvccfwnfn", model.rulesets().get(0).id());
        Assertions.assertEquals("cfionl", model.rulesets().get(0).name());
        Assertions.assertEquals("x", model.rulesets().get(0).description());
        Assertions.assertEquals("qgtz", model.rulesets().get(0).region());
        Assertions.assertEquals(Type.AZURE_PRIVATE_ENDPOINT, model.rulesets().get(0).type());
        Assertions.assertEquals(false, model.rulesets().get(0).includeByDefault());
    }
}