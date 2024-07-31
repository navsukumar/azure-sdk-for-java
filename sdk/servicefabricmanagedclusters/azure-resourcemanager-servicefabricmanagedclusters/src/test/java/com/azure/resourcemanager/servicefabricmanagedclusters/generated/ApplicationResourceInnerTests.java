// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabricmanagedclusters.fluent.models.ApplicationResourceInner;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ApplicationHealthPolicy;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ApplicationUpgradePolicy;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ApplicationUserAssignedIdentity;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.FailureAction;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ManagedIdentity;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ManagedIdentityType;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.RollingUpgradeMode;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.RollingUpgradeMonitoringPolicy;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ServiceTypeHealthPolicy;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.UserAssignedIdentity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ApplicationResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplicationResourceInner model = BinaryData.fromString(
            "{\"identity\":{\"principalId\":\"wnzlljfmppeeb\",\"tenantId\":\"gxsabkyq\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"rwpdappdsbdkvwrw\":{\"principalId\":\"c\",\"clientId\":\"zdzevndh\"},\"hocdgeab\":{\"principalId\":\"eusnhutj\",\"clientId\":\"tmrldhugjzzdatq\"}}},\"properties\":{\"provisioningState\":\"huticndvkao\",\"version\":\"yiftyhxhuro\",\"parameters\":{\"cukjf\":\"yxolniwp\",\"lryplwckbasyy\":\"giawx\",\"jkot\":\"nddhsgcbacph\"},\"upgradePolicy\":{\"applicationHealthPolicy\":{\"considerWarningAsError\":false,\"maxPercentUnhealthyDeployedApplications\":813482060,\"defaultServiceTypeHealthPolicy\":{\"maxPercentUnhealthyServices\":228751316,\"maxPercentUnhealthyPartitionsPerService\":2032457047,\"maxPercentUnhealthyReplicasPerPartition\":1299087346},\"serviceTypeHealthPolicyMap\":{\"yqkgfg\":{\"maxPercentUnhealthyServices\":250588386,\"maxPercentUnhealthyPartitionsPerService\":708367520,\"maxPercentUnhealthyReplicasPerPartition\":485783320},\"dgak\":{\"maxPercentUnhealthyServices\":1800206320,\"maxPercentUnhealthyPartitionsPerService\":1173503063,\"maxPercentUnhealthyReplicasPerPartition\":1193529949},\"xybz\":{\"maxPercentUnhealthyServices\":712813176,\"maxPercentUnhealthyPartitionsPerService\":186641812,\"maxPercentUnhealthyReplicasPerPartition\":1093417192}}},\"forceRestart\":false,\"rollingUpgradeMonitoringPolicy\":{\"failureAction\":\"Rollback\",\"healthCheckWaitDuration\":\"ytb\",\"healthCheckStableDuration\":\"iqfouflmmnkz\",\"healthCheckRetryTimeout\":\"modmglougpb\",\"upgradeTimeout\":\"wtmutduq\",\"upgradeDomainTimeout\":\"ta\"},\"instanceCloseDelayDuration\":52315490134475287,\"upgradeMode\":\"Monitored\",\"upgradeReplicaSetCheckTimeout\":8788787487119188648,\"recreateApplication\":true},\"managedIdentities\":[{\"name\":\"dosvqwhbmdgbbjf\",\"principalId\":\"dgmb\"},{\"name\":\"bexppb\",\"principalId\":\"tq\"}]},\"location\":\"ol\",\"tags\":{\"gjyjgzjaoyfhrtxi\":\"psalgbqux\",\"rkujy\":\"n\",\"rlyxwjkcprbnw\":\"vlejuvfqa\"},\"id\":\"gjvtbv\",\"name\":\"ysszdnrujqguh\",\"type\":\"uouq\"}")
            .toObject(ApplicationResourceInner.class);
        Assertions.assertEquals(ManagedIdentityType.SYSTEM_ASSIGNED, model.identity().type());
        Assertions.assertEquals("ol", model.location());
        Assertions.assertEquals("psalgbqux", model.tags().get("gjyjgzjaoyfhrtxi"));
        Assertions.assertEquals("yiftyhxhuro", model.version());
        Assertions.assertEquals("yxolniwp", model.parameters().get("cukjf"));
        Assertions.assertEquals(false, model.upgradePolicy().applicationHealthPolicy().considerWarningAsError());
        Assertions.assertEquals(813482060,
            model.upgradePolicy().applicationHealthPolicy().maxPercentUnhealthyDeployedApplications());
        Assertions.assertEquals(228751316,
            model.upgradePolicy()
                .applicationHealthPolicy()
                .defaultServiceTypeHealthPolicy()
                .maxPercentUnhealthyServices());
        Assertions.assertEquals(2032457047,
            model.upgradePolicy()
                .applicationHealthPolicy()
                .defaultServiceTypeHealthPolicy()
                .maxPercentUnhealthyPartitionsPerService());
        Assertions.assertEquals(1299087346,
            model.upgradePolicy()
                .applicationHealthPolicy()
                .defaultServiceTypeHealthPolicy()
                .maxPercentUnhealthyReplicasPerPartition());
        Assertions.assertEquals(250588386,
            model.upgradePolicy()
                .applicationHealthPolicy()
                .serviceTypeHealthPolicyMap()
                .get("yqkgfg")
                .maxPercentUnhealthyServices());
        Assertions.assertEquals(708367520,
            model.upgradePolicy()
                .applicationHealthPolicy()
                .serviceTypeHealthPolicyMap()
                .get("yqkgfg")
                .maxPercentUnhealthyPartitionsPerService());
        Assertions.assertEquals(485783320,
            model.upgradePolicy()
                .applicationHealthPolicy()
                .serviceTypeHealthPolicyMap()
                .get("yqkgfg")
                .maxPercentUnhealthyReplicasPerPartition());
        Assertions.assertEquals(false, model.upgradePolicy().forceRestart());
        Assertions.assertEquals(FailureAction.ROLLBACK,
            model.upgradePolicy().rollingUpgradeMonitoringPolicy().failureAction());
        Assertions.assertEquals("ytb",
            model.upgradePolicy().rollingUpgradeMonitoringPolicy().healthCheckWaitDuration());
        Assertions.assertEquals("iqfouflmmnkz",
            model.upgradePolicy().rollingUpgradeMonitoringPolicy().healthCheckStableDuration());
        Assertions.assertEquals("modmglougpb",
            model.upgradePolicy().rollingUpgradeMonitoringPolicy().healthCheckRetryTimeout());
        Assertions.assertEquals("wtmutduq", model.upgradePolicy().rollingUpgradeMonitoringPolicy().upgradeTimeout());
        Assertions.assertEquals("ta", model.upgradePolicy().rollingUpgradeMonitoringPolicy().upgradeDomainTimeout());
        Assertions.assertEquals(52315490134475287L, model.upgradePolicy().instanceCloseDelayDuration());
        Assertions.assertEquals(RollingUpgradeMode.MONITORED, model.upgradePolicy().upgradeMode());
        Assertions.assertEquals(8788787487119188648L, model.upgradePolicy().upgradeReplicaSetCheckTimeout());
        Assertions.assertEquals(true, model.upgradePolicy().recreateApplication());
        Assertions.assertEquals("dosvqwhbmdgbbjf", model.managedIdentities().get(0).name());
        Assertions.assertEquals("dgmb", model.managedIdentities().get(0).principalId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplicationResourceInner model
            = new ApplicationResourceInner()
                .withIdentity(
                    new ManagedIdentity().withType(ManagedIdentityType.SYSTEM_ASSIGNED)
                        .withUserAssignedIdentities(mapOf("rwpdappdsbdkvwrw", new UserAssignedIdentity(), "hocdgeab",
                            new UserAssignedIdentity())))
                .withLocation("ol")
                .withTags(mapOf("gjyjgzjaoyfhrtxi", "psalgbqux", "rkujy", "n", "rlyxwjkcprbnw", "vlejuvfqa"))
                .withVersion("yiftyhxhuro")
                .withParameters(mapOf("cukjf", "yxolniwp", "lryplwckbasyy", "giawx", "jkot", "nddhsgcbacph"))
                .withUpgradePolicy(new ApplicationUpgradePolicy()
                    .withApplicationHealthPolicy(new ApplicationHealthPolicy().withConsiderWarningAsError(false)
                        .withMaxPercentUnhealthyDeployedApplications(813482060)
                        .withDefaultServiceTypeHealthPolicy(
                            new ServiceTypeHealthPolicy().withMaxPercentUnhealthyServices(228751316)
                                .withMaxPercentUnhealthyPartitionsPerService(2032457047)
                                .withMaxPercentUnhealthyReplicasPerPartition(1299087346))
                        .withServiceTypeHealthPolicyMap(mapOf("yqkgfg",
                            new ServiceTypeHealthPolicy().withMaxPercentUnhealthyServices(250588386)
                                .withMaxPercentUnhealthyPartitionsPerService(708367520)
                                .withMaxPercentUnhealthyReplicasPerPartition(485783320),
                            "dgak",
                            new ServiceTypeHealthPolicy().withMaxPercentUnhealthyServices(1800206320)
                                .withMaxPercentUnhealthyPartitionsPerService(1173503063)
                                .withMaxPercentUnhealthyReplicasPerPartition(1193529949),
                            "xybz",
                            new ServiceTypeHealthPolicy().withMaxPercentUnhealthyServices(712813176)
                                .withMaxPercentUnhealthyPartitionsPerService(186641812)
                                .withMaxPercentUnhealthyReplicasPerPartition(1093417192))))
                    .withForceRestart(false)
                    .withRollingUpgradeMonitoringPolicy(
                        new RollingUpgradeMonitoringPolicy().withFailureAction(FailureAction.ROLLBACK)
                            .withHealthCheckWaitDuration("ytb")
                            .withHealthCheckStableDuration("iqfouflmmnkz")
                            .withHealthCheckRetryTimeout("modmglougpb")
                            .withUpgradeTimeout("wtmutduq")
                            .withUpgradeDomainTimeout("ta"))
                    .withInstanceCloseDelayDuration(52315490134475287L)
                    .withUpgradeMode(RollingUpgradeMode.MONITORED)
                    .withUpgradeReplicaSetCheckTimeout(8788787487119188648L)
                    .withRecreateApplication(true))
                .withManagedIdentities(Arrays.asList(
                    new ApplicationUserAssignedIdentity().withName("dosvqwhbmdgbbjf").withPrincipalId("dgmb"),
                    new ApplicationUserAssignedIdentity().withName("bexppb").withPrincipalId("tq")));
        model = BinaryData.fromObject(model).toObject(ApplicationResourceInner.class);
        Assertions.assertEquals(ManagedIdentityType.SYSTEM_ASSIGNED, model.identity().type());
        Assertions.assertEquals("ol", model.location());
        Assertions.assertEquals("psalgbqux", model.tags().get("gjyjgzjaoyfhrtxi"));
        Assertions.assertEquals("yiftyhxhuro", model.version());
        Assertions.assertEquals("yxolniwp", model.parameters().get("cukjf"));
        Assertions.assertEquals(false, model.upgradePolicy().applicationHealthPolicy().considerWarningAsError());
        Assertions.assertEquals(813482060,
            model.upgradePolicy().applicationHealthPolicy().maxPercentUnhealthyDeployedApplications());
        Assertions.assertEquals(228751316,
            model.upgradePolicy()
                .applicationHealthPolicy()
                .defaultServiceTypeHealthPolicy()
                .maxPercentUnhealthyServices());
        Assertions.assertEquals(2032457047,
            model.upgradePolicy()
                .applicationHealthPolicy()
                .defaultServiceTypeHealthPolicy()
                .maxPercentUnhealthyPartitionsPerService());
        Assertions.assertEquals(1299087346,
            model.upgradePolicy()
                .applicationHealthPolicy()
                .defaultServiceTypeHealthPolicy()
                .maxPercentUnhealthyReplicasPerPartition());
        Assertions.assertEquals(250588386,
            model.upgradePolicy()
                .applicationHealthPolicy()
                .serviceTypeHealthPolicyMap()
                .get("yqkgfg")
                .maxPercentUnhealthyServices());
        Assertions.assertEquals(708367520,
            model.upgradePolicy()
                .applicationHealthPolicy()
                .serviceTypeHealthPolicyMap()
                .get("yqkgfg")
                .maxPercentUnhealthyPartitionsPerService());
        Assertions.assertEquals(485783320,
            model.upgradePolicy()
                .applicationHealthPolicy()
                .serviceTypeHealthPolicyMap()
                .get("yqkgfg")
                .maxPercentUnhealthyReplicasPerPartition());
        Assertions.assertEquals(false, model.upgradePolicy().forceRestart());
        Assertions.assertEquals(FailureAction.ROLLBACK,
            model.upgradePolicy().rollingUpgradeMonitoringPolicy().failureAction());
        Assertions.assertEquals("ytb",
            model.upgradePolicy().rollingUpgradeMonitoringPolicy().healthCheckWaitDuration());
        Assertions.assertEquals("iqfouflmmnkz",
            model.upgradePolicy().rollingUpgradeMonitoringPolicy().healthCheckStableDuration());
        Assertions.assertEquals("modmglougpb",
            model.upgradePolicy().rollingUpgradeMonitoringPolicy().healthCheckRetryTimeout());
        Assertions.assertEquals("wtmutduq", model.upgradePolicy().rollingUpgradeMonitoringPolicy().upgradeTimeout());
        Assertions.assertEquals("ta", model.upgradePolicy().rollingUpgradeMonitoringPolicy().upgradeDomainTimeout());
        Assertions.assertEquals(52315490134475287L, model.upgradePolicy().instanceCloseDelayDuration());
        Assertions.assertEquals(RollingUpgradeMode.MONITORED, model.upgradePolicy().upgradeMode());
        Assertions.assertEquals(8788787487119188648L, model.upgradePolicy().upgradeReplicaSetCheckTimeout());
        Assertions.assertEquals(true, model.upgradePolicy().recreateApplication());
        Assertions.assertEquals("dosvqwhbmdgbbjf", model.managedIdentities().get(0).name());
        Assertions.assertEquals("dgmb", model.managedIdentities().get(0).principalId());
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
