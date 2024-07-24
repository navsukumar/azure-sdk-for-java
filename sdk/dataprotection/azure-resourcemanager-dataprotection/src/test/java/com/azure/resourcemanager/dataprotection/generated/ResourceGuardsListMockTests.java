// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.dataprotection.DataProtectionManager;
import com.azure.resourcemanager.dataprotection.models.ResourceGuardResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ResourceGuardsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningState\":\"Succeeded\",\"allowAutoApprovals\":false,\"resourceGuardOperations\":[{\"vaultCriticalOperation\":\"gxq\",\"requestResourceType\":\"yrtltlaprltzkat\"}],\"vaultCriticalOperationExclusionList\":[\"mznnbsoqeqalarvl\"],\"description\":\"un\"},\"eTag\":\"gfebwlnb\",\"location\":\"yreeudz\",\"tags\":{\"glgou\":\"bpdqmjxlyy\",\"yuojqtobaxk\":\"tlmj\",\"lbfjkwr\":\"eytu\",\"hsyrqunj\":\"snkq\"},\"id\":\"hdenxaulk\",\"name\":\"akdkifmjnnawtqab\",\"type\":\"xuckpggqoweyir\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DataProtectionManager manager = DataProtectionManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ResourceGuardResource> response = manager.resourceGuards().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("yreeudz", response.iterator().next().location());
        Assertions.assertEquals("bpdqmjxlyy", response.iterator().next().tags().get("glgou"));
        Assertions.assertEquals("gfebwlnb", response.iterator().next().etag());
        Assertions.assertEquals("mznnbsoqeqalarvl",
            response.iterator().next().properties().vaultCriticalOperationExclusionList().get(0));
    }
}
