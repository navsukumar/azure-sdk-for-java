// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.dataprotection.DataProtectionManager;
import com.azure.resourcemanager.dataprotection.models.CheckNameAvailabilityRequest;
import com.azure.resourcemanager.dataprotection.models.CheckNameAvailabilityResult;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class BackupVaultsCheckNameAvailabilityWithResponseMockTests {
    @Test
    public void testCheckNameAvailabilityWithResponse() throws Exception {
        String responseStr = "{\"message\":\"odbzevwrdnhf\",\"nameAvailable\":false,\"reason\":\"sjcswsmystuluqyp\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DataProtectionManager manager = DataProtectionManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        CheckNameAvailabilityResult response = manager.backupVaults()
            .checkNameAvailabilityWithResponse("nobaiyhddviacegf", "m",
                new CheckNameAvailabilityRequest().withName("fpmvmemfnczd").withType("vbalxlllc"),
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("odbzevwrdnhf", response.message());
        Assertions.assertEquals(false, response.nameAvailable());
        Assertions.assertEquals("sjcswsmystuluqyp", response.reason());
    }
}
