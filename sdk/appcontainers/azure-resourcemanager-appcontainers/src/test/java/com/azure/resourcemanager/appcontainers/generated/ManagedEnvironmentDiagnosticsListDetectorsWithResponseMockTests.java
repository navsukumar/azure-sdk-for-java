// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.appcontainers.ContainerAppsApiManager;
import com.azure.resourcemanager.appcontainers.models.DiagnosticsCollection;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ManagedEnvironmentDiagnosticsListDetectorsWithResponseMockTests {
    @Test
    public void testListDetectorsWithResponse() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"metadata\":{\"id\":\"nkyhf\",\"name\":\"vsqxfxjelgcmpzqj\",\"description\":\"hqxu\",\"author\":\"vcacoyv\",\"category\":\"bsizus\",\"supportTopicList\":[{},{},{}],\"analysisTypes\":[\"scmnlziji\"],\"type\":\"ehgmvflnwyv\",\"score\":78.07501},\"dataset\":[{},{},{}],\"status\":{\"message\":\"niylyly\",\"statusId\":1965919560},\"dataProviderMetadata\":{\"providerName\":\"tgqztwhghmup\",\"propertyBag\":[{},{},{},{}]}},\"id\":\"tcdxabbujftaben\",\"name\":\"bklqpxz\",\"type\":\"cafeddw\"},{\"properties\":{\"metadata\":{\"id\":\"a\",\"name\":\"xud\",\"description\":\"hgookrtalvnbwgpb\",\"author\":\"eluclvdjj\",\"category\":\"yrdnqod\",\"supportTopicList\":[{},{}],\"analysisTypes\":[\"hqfaqnvz\"],\"type\":\"gyipem\",\"score\":57.573597},\"dataset\":[{}],\"status\":{\"message\":\"zuejd\",\"statusId\":2069987266},\"dataProviderMetadata\":{\"providerName\":\"ghwzhomewjjstli\",\"propertyBag\":[{},{},{}]}},\"id\":\"wmoaiancznvodrrs\",\"name\":\"blxydkxr\",\"type\":\"vvbxiwkgfbqljnq\"},{\"properties\":{\"metadata\":{\"id\":\"h\",\"name\":\"okulehurqlrqf\",\"description\":\"weyurkphyjd\",\"author\":\"av\",\"category\":\"qdbrxmrgc\",\"supportTopicList\":[{}],\"analysisTypes\":[\"kiyfjjkbajbusc\"],\"type\":\"uusioycblev\",\"score\":36.174137},\"dataset\":[{},{},{}],\"status\":{\"message\":\"xkyxlzgs\",\"statusId\":733092764},\"dataProviderMetadata\":{\"providerName\":\"ltafhbzffo\",\"propertyBag\":[{}]}},\"id\":\"jlzqsczpgvdwnapf\",\"name\":\"qwowftptnuw\",\"type\":\"tkschgcgqyhl\"}],\"nextLink\":\"eyqrhv\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ContainerAppsApiManager manager = ContainerAppsApiManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        DiagnosticsCollection response = manager.managedEnvironmentDiagnostics()
            .listDetectorsWithResponse("zpyglqdhmrj", "ralcxpjbyypsj", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("scmnlziji", response.value().get(0).properties().metadata().analysisTypes().get(0));
        Assertions.assertEquals("niylyly", response.value().get(0).properties().status().message());
        Assertions.assertEquals(1965919560, response.value().get(0).properties().status().statusId());
        Assertions.assertEquals("tgqztwhghmup",
            response.value().get(0).properties().dataProviderMetadata().providerName());
    }
}
