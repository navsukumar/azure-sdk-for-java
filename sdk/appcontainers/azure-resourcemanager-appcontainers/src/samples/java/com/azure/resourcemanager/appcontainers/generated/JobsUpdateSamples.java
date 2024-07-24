// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.resourcemanager.appcontainers.models.Container;
import com.azure.resourcemanager.appcontainers.models.ContainerAppProbe;
import com.azure.resourcemanager.appcontainers.models.ContainerAppProbeHttpGet;
import com.azure.resourcemanager.appcontainers.models.ContainerAppProbeHttpGetHttpHeadersItem;
import com.azure.resourcemanager.appcontainers.models.ContainerResources;
import com.azure.resourcemanager.appcontainers.models.InitContainer;
import com.azure.resourcemanager.appcontainers.models.Job;
import com.azure.resourcemanager.appcontainers.models.JobConfiguration;
import com.azure.resourcemanager.appcontainers.models.JobConfigurationManualTriggerConfig;
import com.azure.resourcemanager.appcontainers.models.JobPatchPropertiesProperties;
import com.azure.resourcemanager.appcontainers.models.JobTemplate;
import com.azure.resourcemanager.appcontainers.models.TriggerType;
import com.azure.resourcemanager.appcontainers.models.Type;
import java.util.Arrays;

/**
 * Samples for Jobs Update.
 */
public final class JobsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/app/resource-manager/Microsoft.App/preview/2024-02-02-preview/examples/Job_Patch.json
     */
    /**
     * Sample code: Patch Container Apps Job.
     * 
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void patchContainerAppsJob(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        Job resource = manager.jobs()
            .getByResourceGroupWithResponse("rg", "testcontainerAppsJob0", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withProperties(new JobPatchPropertiesProperties()
                .withConfiguration(new JobConfiguration().withTriggerType(TriggerType.MANUAL)
                    .withReplicaTimeout(10)
                    .withReplicaRetryLimit(10)
                    .withManualTriggerConfig(
                        new JobConfigurationManualTriggerConfig().withReplicaCompletionCount(1).withParallelism(4)))
                .withTemplate(new JobTemplate()
                    .withInitContainers(Arrays.asList(new InitContainer().withImage("repo/testcontainerAppsJob0:v4")
                        .withName("testinitcontainerAppsJob0")
                        .withCommand(Arrays.asList("/bin/sh"))
                        .withArgs(Arrays.asList("-c", "while true; do echo hello; sleep 10;done"))
                        .withResources(new ContainerResources().withCpu(0.2D).withMemory("100Mi"))))
                    .withContainers(Arrays.asList(new Container().withImage("repo/testcontainerAppsJob0:v1")
                        .withName("testcontainerAppsJob0")
                        .withProbes(Arrays.asList(new ContainerAppProbe()
                            .withHttpGet(new ContainerAppProbeHttpGet()
                                .withHttpHeaders(Arrays
                                    .asList(new ContainerAppProbeHttpGetHttpHeadersItem().withName("Custom-Header")
                                        .withValue("Awesome")))
                                .withPath("/health")
                                .withPort(8080))
                            .withInitialDelaySeconds(3)
                            .withPeriodSeconds(3)
                            .withType(Type.LIVENESS)))))))
            .apply();
    }
}
