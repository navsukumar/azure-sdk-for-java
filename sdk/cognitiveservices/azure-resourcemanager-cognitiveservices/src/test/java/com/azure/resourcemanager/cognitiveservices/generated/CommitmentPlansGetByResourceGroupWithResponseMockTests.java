// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
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

public final class CommitmentPlansGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"etag\":\"kzmegnitgvkxlz\",\"kind\":\"drf\",\"sku\":{\"name\":\"cealzxwh\",\"tier\":\"Standard\",\"size\":\"ymo\",\"family\":\"hlwigdivbkbxg\",\"capacity\":1748093072},\"tags\":{\"e\":\"uwasqvd\",\"uxakjsqzhzbezk\":\"y\",\"kgfmocwahpq\":\"imsidxasicddyvvj\",\"jhhn\":\"atjeaahh\"},\"location\":\"zybbj\",\"properties\":{\"provisioningState\":\"Moving\",\"commitmentPlanGuid\":\"syxkyxvxevblb\",\"hostingModel\":\"DisconnectedContainer\",\"planType\":\"ljlageuaulxu\",\"current\":{\"tier\":\"jbnkpp\",\"count\":915753980,\"startDate\":\"lsvxeizz\",\"endDate\":\"klnsrmffey\"},\"autoRenew\":false,\"next\":{\"tier\":\"piymerteea\",\"count\":1192403212,\"startDate\":\"ekkkzd\",\"endDate\":\"tkgdojbmxva\"},\"last\":{\"tier\":\"fdeesvecuijpxtx\",\"count\":1101105605,\"startDate\":\"tujwsawdd\",\"endDate\":\"babxvitit\"}},\"id\":\"tzeexav\",\"name\":\"xtfglecdmdqb\",\"type\":\"pypqtgsfj\"}";

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

        CommitmentPlan response =
            manager
                .commitmentPlans()
                .getByResourceGroupWithResponse("qvmmbn", "qfr", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("drf", response.kind());
        Assertions.assertEquals("cealzxwh", response.sku().name());
        Assertions.assertEquals(SkuTier.STANDARD, response.sku().tier());
        Assertions.assertEquals("ymo", response.sku().size());
        Assertions.assertEquals("hlwigdivbkbxg", response.sku().family());
        Assertions.assertEquals(1748093072, response.sku().capacity());
        Assertions.assertEquals("uwasqvd", response.tags().get("e"));
        Assertions.assertEquals("zybbj", response.location());
        Assertions.assertEquals("syxkyxvxevblb", response.properties().commitmentPlanGuid());
        Assertions.assertEquals(HostingModel.DISCONNECTED_CONTAINER, response.properties().hostingModel());
        Assertions.assertEquals("ljlageuaulxu", response.properties().planType());
        Assertions.assertEquals("jbnkpp", response.properties().current().tier());
        Assertions.assertEquals(915753980, response.properties().current().count());
        Assertions.assertEquals(false, response.properties().autoRenew());
        Assertions.assertEquals("piymerteea", response.properties().next().tier());
        Assertions.assertEquals(1192403212, response.properties().next().count());
    }
}
