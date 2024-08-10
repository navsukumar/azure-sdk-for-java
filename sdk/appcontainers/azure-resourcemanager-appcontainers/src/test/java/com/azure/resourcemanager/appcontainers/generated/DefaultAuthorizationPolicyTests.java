// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.AllowedPrincipals;
import com.azure.resourcemanager.appcontainers.models.DefaultAuthorizationPolicy;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DefaultAuthorizationPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DefaultAuthorizationPolicy model = BinaryData.fromString(
            "{\"allowedPrincipals\":{\"groups\":[\"rxzxtheo\",\"usivye\",\"cciqihnhungbwjz\"],\"identities\":[\"ygxgispemvtz\",\"kufubljo\",\"xqeofjaeqjhqjba\",\"v\"]},\"allowedApplications\":[\"jqul\",\"gsntnbybkzgcwr\",\"clxxwrljdo\"]}")
            .toObject(DefaultAuthorizationPolicy.class);
        Assertions.assertEquals("rxzxtheo", model.allowedPrincipals().groups().get(0));
        Assertions.assertEquals("ygxgispemvtz", model.allowedPrincipals().identities().get(0));
        Assertions.assertEquals("jqul", model.allowedApplications().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DefaultAuthorizationPolicy model = new DefaultAuthorizationPolicy()
            .withAllowedPrincipals(
                new AllowedPrincipals().withGroups(Arrays.asList("rxzxtheo", "usivye", "cciqihnhungbwjz"))
                    .withIdentities(Arrays.asList("ygxgispemvtz", "kufubljo", "xqeofjaeqjhqjba", "v")))
            .withAllowedApplications(Arrays.asList("jqul", "gsntnbybkzgcwr", "clxxwrljdo"));
        model = BinaryData.fromObject(model).toObject(DefaultAuthorizationPolicy.class);
        Assertions.assertEquals("rxzxtheo", model.allowedPrincipals().groups().get(0));
        Assertions.assertEquals("ygxgispemvtz", model.allowedPrincipals().identities().get(0));
        Assertions.assertEquals("jqul", model.allowedApplications().get(0));
    }
}
