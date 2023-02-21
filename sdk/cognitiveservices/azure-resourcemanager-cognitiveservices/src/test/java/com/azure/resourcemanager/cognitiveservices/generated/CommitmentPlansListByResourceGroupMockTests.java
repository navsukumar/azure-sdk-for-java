// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager;
import com.azure.resourcemanager.cognitiveservices.models.CommitmentPlan;
import com.azure.resourcemanager.cognitiveservices.models.HostingModel;
import com.azure.resourcemanager.cognitiveservices.models.SkuTier;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class CommitmentPlansListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"etag\":\"xvodhtnsir\",\"kind\":\"hzmme\",\"sku\":{\"name\":\"kdlpa\",\"tier\":\"Basic\",\"size\":\"x\",\"family\":\"ilcfxwmdboxd\",\"capacity\":1260487269},\"tags\":{\"cc\":\"ufqobrjlnac\",\"kizvytn\":\"knh\",\"aaeranokqgukk\":\"zvulj\",\"oylaxxul\":\"qnvb\"},\"location\":\"isdos\",\"properties\":{\"provisioningState\":\"Deleting\",\"commitmentPlanGuid\":\"vgjrwhr\",\"hostingModel\":\"DisconnectedContainer\",\"planType\":\"ytdc\",\"current\":{\"tier\":\"ccknfnwmbtmvp\",\"count\":1129070507,\"startDate\":\"ttzaefed\",\"endDate\":\"hchrphkmcrjdqn\"},\"autoRenew\":true,\"next\":{\"tier\":\"bg\",\"count\":130529973,\"startDate\":\"kdghrjeuutlwx\",\"endDate\":\"w\"},\"last\":{\"tier\":\"kvbwnhhtqlgeh\",\"count\":1490409574,\"startDate\":\"ifhpf\",\"endDate\":\"ajvgcxtxjcsheafi\"}},\"id\":\"ltugsresmkssjhoi\",\"name\":\"txfkfweg\",\"type\":\"rhptilluc\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        CognitiveServicesManager manager =
            CognitiveServicesManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<CommitmentPlan> response =
            manager.commitmentPlans().listByResourceGroup("cbslhhx", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("hzmme", response.iterator().next().kind());
        Assertions.assertEquals("kdlpa", response.iterator().next().sku().name());
        Assertions.assertEquals(SkuTier.BASIC, response.iterator().next().sku().tier());
        Assertions.assertEquals("x", response.iterator().next().sku().size());
        Assertions.assertEquals("ilcfxwmdboxd", response.iterator().next().sku().family());
        Assertions.assertEquals(1260487269, response.iterator().next().sku().capacity());
        Assertions.assertEquals("ufqobrjlnac", response.iterator().next().tags().get("cc"));
        Assertions.assertEquals("isdos", response.iterator().next().location());
        Assertions.assertEquals("vgjrwhr", response.iterator().next().properties().commitmentPlanGuid());
        Assertions
            .assertEquals(HostingModel.DISCONNECTED_CONTAINER, response.iterator().next().properties().hostingModel());
        Assertions.assertEquals("ytdc", response.iterator().next().properties().planType());
        Assertions.assertEquals("ccknfnwmbtmvp", response.iterator().next().properties().current().tier());
        Assertions.assertEquals(1129070507, response.iterator().next().properties().current().count());
        Assertions.assertEquals(true, response.iterator().next().properties().autoRenew());
        Assertions.assertEquals("bg", response.iterator().next().properties().next().tier());
        Assertions.assertEquals(130529973, response.iterator().next().properties().next().count());
    }
}
