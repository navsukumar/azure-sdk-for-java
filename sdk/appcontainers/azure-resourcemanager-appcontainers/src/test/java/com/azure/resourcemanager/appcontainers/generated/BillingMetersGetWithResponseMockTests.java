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
import com.azure.resourcemanager.appcontainers.models.BillingMeterCollection;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class BillingMetersGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"value\":[{\"location\":\"p\",\"properties\":{\"category\":\"xelnwc\",\"meterType\":\"yjede\",\"displayName\":\"mlfmkqs\"},\"id\":\"zuawxtzxpuamwa\",\"name\":\"zxrvxcus\",\"type\":\"sphaivmxyasflvg\"},{\"location\":\"zwywako\",\"properties\":{\"category\":\"nsmjbl\",\"meterType\":\"jhlnymzotqyryu\",\"displayName\":\"bmqqvxmvw\"},\"id\":\"tayx\",\"name\":\"nsup\",\"type\":\"ujlzqnhcvsqltn\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ContainerAppsApiManager manager = ContainerAppsApiManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        BillingMeterCollection response
            = manager.billingMeters().getWithResponse("ujeickp", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals("p", response.value().get(0).location());
        Assertions.assertEquals("xelnwc", response.value().get(0).properties().category());
        Assertions.assertEquals("yjede", response.value().get(0).properties().meterType());
        Assertions.assertEquals("mlfmkqs", response.value().get(0).properties().displayName());
    }
}
