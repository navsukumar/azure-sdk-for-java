// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.MoveCost;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ServiceCorrelationScheme;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ServiceLoadMetricWeight;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ServicePackageActivationMode;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ServiceResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ServicesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"serviceKind\":\"ServiceResourceProperties\",\"provisioningState\":\"rimrs\",\"serviceTypeName\":\"pteecjme\",\"partitionDescription\":{\"partitionScheme\":\"Partition\"},\"servicePackageActivationMode\":\"SharedProcess\",\"serviceDnsName\":\"tvasy\",\"placementConstraints\":\"xdza\",\"correlationScheme\":[{\"scheme\":\"NonAlignedAffinity\",\"serviceName\":\"oohgu\"},{\"scheme\":\"NonAlignedAffinity\",\"serviceName\":\"uzboyjathw\"},{\"scheme\":\"NonAlignedAffinity\",\"serviceName\":\"olbaemwmdx\"},{\"scheme\":\"NonAlignedAffinity\",\"serviceName\":\"bwjscjpahlxveab\"}],\"serviceLoadMetrics\":[{\"name\":\"nmwmqtibx\",\"weight\":\"Low\",\"primaryDefaultLoad\":462307774,\"secondaryDefaultLoad\":460830566,\"defaultLoad\":1410442260},{\"name\":\"ttadijae\",\"weight\":\"Low\",\"primaryDefaultLoad\":1336092586,\"secondaryDefaultLoad\":1646368480,\"defaultLoad\":647971020},{\"name\":\"pndzaapmudqmeq\",\"weight\":\"Zero\",\"primaryDefaultLoad\":1749633474,\"secondaryDefaultLoad\":1859384102,\"defaultLoad\":674250391},{\"name\":\"wyxebeybpmzz\",\"weight\":\"Low\",\"primaryDefaultLoad\":1813435999,\"secondaryDefaultLoad\":639795933,\"defaultLoad\":1808729813}],\"servicePlacementPolicies\":[{\"type\":\"ServicePlacementPolicy\"}],\"defaultMoveCost\":\"Low\",\"scalingPolicies\":[{\"scalingMechanism\":{\"kind\":\"ScalingMechanism\"},\"scalingTrigger\":{\"kind\":\"ScalingTrigger\"}},{\"scalingMechanism\":{\"kind\":\"ScalingMechanism\"},\"scalingTrigger\":{\"kind\":\"ScalingTrigger\"}}]},\"location\":\"qaqhvseufu\",\"tags\":{\"jqfrddgamquh\":\"xpdlcgqlsis\",\"sjuivfcdisyir\":\"os\",\"ujrtrhqvwr\":\"xzhczexrxz\"},\"id\":\"khgn\",\"name\":\"nzonzl\",\"type\":\"piqywnc\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ServiceFabricManagedClustersManager manager = ServiceFabricManagedClustersManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ServiceResource response = manager.services()
            .getWithResponse("bphbqzmizakakank", "p", "n", "zhajoylhjlmuo", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("xdza", response.properties().placementConstraints());
        Assertions.assertEquals(ServiceCorrelationScheme.NON_ALIGNED_AFFINITY,
            response.properties().correlationScheme().get(0).scheme());
        Assertions.assertEquals("oohgu", response.properties().correlationScheme().get(0).serviceName());
        Assertions.assertEquals("nmwmqtibx", response.properties().serviceLoadMetrics().get(0).name());
        Assertions.assertEquals(ServiceLoadMetricWeight.LOW,
            response.properties().serviceLoadMetrics().get(0).weight());
        Assertions.assertEquals(462307774, response.properties().serviceLoadMetrics().get(0).primaryDefaultLoad());
        Assertions.assertEquals(460830566, response.properties().serviceLoadMetrics().get(0).secondaryDefaultLoad());
        Assertions.assertEquals(1410442260, response.properties().serviceLoadMetrics().get(0).defaultLoad());
        Assertions.assertEquals(MoveCost.LOW, response.properties().defaultMoveCost());
        Assertions.assertEquals("pteecjme", response.properties().serviceTypeName());
        Assertions.assertEquals(ServicePackageActivationMode.SHARED_PROCESS,
            response.properties().servicePackageActivationMode());
        Assertions.assertEquals("tvasy", response.properties().serviceDnsName());
        Assertions.assertEquals("qaqhvseufu", response.location());
        Assertions.assertEquals("xpdlcgqlsis", response.tags().get("jqfrddgamquh"));
    }
}
