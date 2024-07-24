// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.netapp.NetAppFilesManager;
import com.azure.resourcemanager.netapp.models.CapacityPool;
import com.azure.resourcemanager.netapp.models.EncryptionType;
import com.azure.resourcemanager.netapp.models.QosType;
import com.azure.resourcemanager.netapp.models.ServiceLevel;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PoolsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"etag\":\"cpwpg\",\"properties\":{\"poolId\":\"rc\",\"size\":6730804470286938055,\"serviceLevel\":\"Premium\",\"provisioningState\":\"xfrk\",\"totalThroughputMibps\":83.817444,\"utilizedThroughputMibps\":0.6317258,\"qosType\":\"Manual\",\"coolAccess\":true,\"encryptionType\":\"Single\"},\"location\":\"pdnqqskawaoqvmmb\",\"tags\":{\"qlkzme\":\"fr\"},\"id\":\"nitgvkxlz\",\"name\":\"qdrfegcealzxwhc\",\"type\":\"nsymoyqhlwigd\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NetAppFilesManager manager = NetAppFilesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        CapacityPool response
            = manager.pools().getWithResponse("wivkxo", "zunbixx", "ti", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals("pdnqqskawaoqvmmb", response.location());
        Assertions.assertEquals("fr", response.tags().get("qlkzme"));
        Assertions.assertEquals(6730804470286938055L, response.size());
        Assertions.assertEquals(ServiceLevel.PREMIUM, response.serviceLevel());
        Assertions.assertEquals(QosType.MANUAL, response.qosType());
        Assertions.assertEquals(true, response.coolAccess());
        Assertions.assertEquals(EncryptionType.SINGLE, response.encryptionType());
    }
}
