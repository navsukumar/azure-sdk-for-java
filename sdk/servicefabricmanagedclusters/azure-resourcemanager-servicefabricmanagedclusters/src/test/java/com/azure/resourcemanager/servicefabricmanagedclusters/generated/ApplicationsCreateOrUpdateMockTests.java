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
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ApplicationHealthPolicy;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ApplicationResource;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ApplicationUpgradePolicy;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ApplicationUserAssignedIdentity;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.FailureAction;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ManagedIdentity;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ManagedIdentityType;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.RollingUpgradeMode;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.RollingUpgradeMonitoringPolicy;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ServiceTypeHealthPolicy;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.UserAssignedIdentity;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ApplicationsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"identity\":{\"principalId\":\"eycxcktpiymertee\",\"tenantId\":\"mx\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"mxvavrefdee\":{\"principalId\":\"zddrt\",\"clientId\":\"doj\"},\"ibabxvititvtzeex\":{\"principalId\":\"ecuijpxtxs\",\"clientId\":\"prtujwsawdd\"},\"gsfjac\":{\"principalId\":\"oxtfglecdmdqbwp\",\"clientId\":\"q\"},\"gzrcxfailcfxwmdb\":{\"principalId\":\"lhhxudbxvodhtnsi\",\"clientId\":\"dhzmmesckdlp\"}}},\"properties\":{\"provisioningState\":\"Succeeded\",\"version\":\"lnacgcc\",\"parameters\":{\"lj\":\"hxkizvytnrzv\"},\"upgradePolicy\":{\"applicationHealthPolicy\":{\"considerWarningAsError\":true,\"maxPercentUnhealthyDeployedApplications\":1023796809,\"defaultServiceTypeHealthPolicy\":{\"maxPercentUnhealthyServices\":538617301,\"maxPercentUnhealthyPartitionsPerService\":244729787,\"maxPercentUnhealthyReplicasPerPartition\":644888013},\"serviceTypeHealthPolicyMap\":{\"jqnv\":{\"maxPercentUnhealthyServices\":1236565917,\"maxPercentUnhealthyPartitionsPerService\":1809453689,\"maxPercentUnhealthyReplicasPerPartition\":578630229},\"laxxulc\":{\"maxPercentUnhealthyServices\":2004582271,\"maxPercentUnhealthyPartitionsPerService\":2081479279,\"maxPercentUnhealthyReplicasPerPartition\":387687877},\"osfjbjsv\":{\"maxPercentUnhealthyServices\":1187739755,\"maxPercentUnhealthyPartitionsPerService\":1094688808,\"maxPercentUnhealthyReplicasPerPartition\":1171006213}}},\"forceRestart\":true,\"rollingUpgradeMonitoringPolicy\":{\"failureAction\":\"Rollback\",\"healthCheckWaitDuration\":\"r\",\"healthCheckStableDuration\":\"vyc\",\"healthCheckRetryTimeout\":\"t\",\"upgradeTimeout\":\"c\",\"upgradeDomainTimeout\":\"xgccknfnw\"},\"instanceCloseDelayDuration\":3132711740281855287,\"upgradeMode\":\"UnmonitoredAuto\",\"upgradeReplicaSetCheckTimeout\":7985677682216812459,\"recreateApplication\":false},\"managedIdentities\":[{\"name\":\"zaefedxihc\",\"principalId\":\"rphkmcrjdqnsdfz\"},{\"name\":\"bg\",\"principalId\":\"gkylkdghr\"}]},\"location\":\"uutlwxezwzhok\",\"tags\":{\"ehgpp\":\"nhhtql\",\"csheafidltugsr\":\"pifhpfeoajvgcxtx\",\"h\":\"smkss\",\"egprhptil\":\"iftxfkf\"},\"id\":\"cbiqtgdqoh\",\"name\":\"cwsldri\",\"type\":\"etpwbralll\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ServiceFabricManagedClustersManager manager = ServiceFabricManagedClustersManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ApplicationResource response = manager.applications()
            .define("zhyrmewipmve")
            .withExistingManagedcluster("vetnwsdtutn", "lduycv")
            .withRegion("zybbj")
            .withTags(mapOf("xkyxvxevblbj", "jks"))
            .withIdentity(new ManagedIdentity().withType(ManagedIdentityType.SYSTEM_ASSIGNED)
                .withUserAssignedIdentities(
                    mapOf("qsxvmhf", new UserAssignedIdentity(), "hudypohyuemsl", new UserAssignedIdentity(), "nygq",
                        new UserAssignedIdentity(), "hqlyvijo", new UserAssignedIdentity())))
            .withVersion("yzunbixxrtikv")
            .withParameters(mapOf("soxfrken", "pgclrciv", "ka", "pmyyefrpmpdnqq", "vmm", "ao"))
            .withUpgradePolicy(new ApplicationUpgradePolicy()
                .withApplicationHealthPolicy(new ApplicationHealthPolicy().withConsiderWarningAsError(false)
                    .withMaxPercentUnhealthyDeployedApplications(483847293)
                    .withDefaultServiceTypeHealthPolicy(
                        new ServiceTypeHealthPolicy().withMaxPercentUnhealthyServices(1189799815)
                            .withMaxPercentUnhealthyPartitionsPerService(1464484826)
                            .withMaxPercentUnhealthyReplicasPerPartition(1516123032))
                    .withServiceTypeHealthPolicyMap(mapOf("nitgvkxlz",
                        new ServiceTypeHealthPolicy().withMaxPercentUnhealthyServices(1084640594)
                            .withMaxPercentUnhealthyPartitionsPerService(1572923585)
                            .withMaxPercentUnhealthyReplicasPerPartition(910896257),
                        "fegcea",
                        new ServiceTypeHealthPolicy().withMaxPercentUnhealthyServices(1806013013)
                            .withMaxPercentUnhealthyPartitionsPerService(758932441)
                            .withMaxPercentUnhealthyReplicasPerPartition(739587374),
                        "hcans",
                        new ServiceTypeHealthPolicy().withMaxPercentUnhealthyServices(2015220530)
                            .withMaxPercentUnhealthyPartitionsPerService(608530050)
                            .withMaxPercentUnhealthyReplicasPerPartition(1594639015))))
                .withForceRestart(false)
                .withRollingUpgradeMonitoringPolicy(
                    new RollingUpgradeMonitoringPolicy().withFailureAction(FailureAction.MANUAL)
                        .withHealthCheckWaitDuration("hlwigdivbkbxg")
                        .withHealthCheckStableDuration("mf")
                        .withHealthCheckRetryTimeout("juwasqvdaeyyguxa")
                        .withUpgradeTimeout("jsqzhzbezk")
                        .withUpgradeDomainTimeout("imsidxasicddyvvj"))
                .withInstanceCloseDelayDuration(3644953268271163513L)
                .withUpgradeMode(RollingUpgradeMode.MONITORED)
                .withUpgradeReplicaSetCheckTimeout(1822149977556506496L)
                .withRecreateApplication(false))
            .withManagedIdentities(
                Arrays.asList(new ApplicationUserAssignedIdentity().withName("atjeaahh").withPrincipalId("jhhn")))
            .create();

        Assertions.assertEquals(ManagedIdentityType.SYSTEM_ASSIGNED, response.identity().type());
        Assertions.assertEquals("uutlwxezwzhok", response.location());
        Assertions.assertEquals("nhhtql", response.tags().get("ehgpp"));
        Assertions.assertEquals("lnacgcc", response.version());
        Assertions.assertEquals("hxkizvytnrzv", response.parameters().get("lj"));
        Assertions.assertEquals(true, response.upgradePolicy().applicationHealthPolicy().considerWarningAsError());
        Assertions.assertEquals(1023796809,
            response.upgradePolicy().applicationHealthPolicy().maxPercentUnhealthyDeployedApplications());
        Assertions.assertEquals(538617301,
            response.upgradePolicy()
                .applicationHealthPolicy()
                .defaultServiceTypeHealthPolicy()
                .maxPercentUnhealthyServices());
        Assertions.assertEquals(244729787,
            response.upgradePolicy()
                .applicationHealthPolicy()
                .defaultServiceTypeHealthPolicy()
                .maxPercentUnhealthyPartitionsPerService());
        Assertions.assertEquals(644888013,
            response.upgradePolicy()
                .applicationHealthPolicy()
                .defaultServiceTypeHealthPolicy()
                .maxPercentUnhealthyReplicasPerPartition());
        Assertions.assertEquals(1236565917,
            response.upgradePolicy()
                .applicationHealthPolicy()
                .serviceTypeHealthPolicyMap()
                .get("jqnv")
                .maxPercentUnhealthyServices());
        Assertions.assertEquals(1809453689,
            response.upgradePolicy()
                .applicationHealthPolicy()
                .serviceTypeHealthPolicyMap()
                .get("jqnv")
                .maxPercentUnhealthyPartitionsPerService());
        Assertions.assertEquals(578630229,
            response.upgradePolicy()
                .applicationHealthPolicy()
                .serviceTypeHealthPolicyMap()
                .get("jqnv")
                .maxPercentUnhealthyReplicasPerPartition());
        Assertions.assertEquals(true, response.upgradePolicy().forceRestart());
        Assertions.assertEquals(FailureAction.ROLLBACK,
            response.upgradePolicy().rollingUpgradeMonitoringPolicy().failureAction());
        Assertions.assertEquals("r",
            response.upgradePolicy().rollingUpgradeMonitoringPolicy().healthCheckWaitDuration());
        Assertions.assertEquals("vyc",
            response.upgradePolicy().rollingUpgradeMonitoringPolicy().healthCheckStableDuration());
        Assertions.assertEquals("t",
            response.upgradePolicy().rollingUpgradeMonitoringPolicy().healthCheckRetryTimeout());
        Assertions.assertEquals("c", response.upgradePolicy().rollingUpgradeMonitoringPolicy().upgradeTimeout());
        Assertions.assertEquals("xgccknfnw",
            response.upgradePolicy().rollingUpgradeMonitoringPolicy().upgradeDomainTimeout());
        Assertions.assertEquals(3132711740281855287L, response.upgradePolicy().instanceCloseDelayDuration());
        Assertions.assertEquals(RollingUpgradeMode.UNMONITORED_AUTO, response.upgradePolicy().upgradeMode());
        Assertions.assertEquals(7985677682216812459L, response.upgradePolicy().upgradeReplicaSetCheckTimeout());
        Assertions.assertEquals(false, response.upgradePolicy().recreateApplication());
        Assertions.assertEquals("zaefedxihc", response.managedIdentities().get(0).name());
        Assertions.assertEquals("rphkmcrjdqnsdfz", response.managedIdentities().get(0).principalId());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
