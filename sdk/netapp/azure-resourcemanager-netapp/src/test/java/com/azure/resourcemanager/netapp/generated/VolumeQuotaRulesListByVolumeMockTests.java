// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.netapp.NetAppFilesManager;
import com.azure.resourcemanager.netapp.models.Type;
import com.azure.resourcemanager.netapp.models.VolumeQuotaRule;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class VolumeQuotaRulesListByVolumeMockTests {
    @Test
    public void testListByVolume() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningState\":\"Succeeded\",\"quotaSizeInKiBs\":4706724990573713348,\"quotaType\":\"DefaultUserQuota\",\"quotaTarget\":\"knlqwzdvpiwhxqsz\"},\"location\":\"maajquhuxylr\",\"tags\":{\"jbmzyospspsh\":\"ty\"},\"id\":\"kfkyjp\",\"name\":\"sp\",\"type\":\"pssdfppyogtie\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NetAppFilesManager manager = NetAppFilesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<VolumeQuotaRule> response = manager.volumeQuotaRules()
            .listByVolume("w", "auunfprnjletlx", "mr", "ddoui", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("maajquhuxylr", response.iterator().next().location());
        Assertions.assertEquals("ty", response.iterator().next().tags().get("jbmzyospspsh"));
        Assertions.assertEquals(4706724990573713348L, response.iterator().next().quotaSizeInKiBs());
        Assertions.assertEquals(Type.DEFAULT_USER_QUOTA, response.iterator().next().quotaType());
        Assertions.assertEquals("knlqwzdvpiwhxqsz", response.iterator().next().quotaTarget());
    }
}
