// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

import com.azure.resourcemanager.containerservice.fluent.models.AgentPoolInner;
import com.azure.resourcemanager.containerservice.models.AgentPoolMode;
import com.azure.resourcemanager.containerservice.models.AgentPoolWindowsProfile;
import com.azure.resourcemanager.containerservice.models.Code;
import com.azure.resourcemanager.containerservice.models.CreationData;
import com.azure.resourcemanager.containerservice.models.GpuInstanceProfile;
import com.azure.resourcemanager.containerservice.models.KubeletConfig;
import com.azure.resourcemanager.containerservice.models.LinuxOSConfig;
import com.azure.resourcemanager.containerservice.models.OSDiskType;
import com.azure.resourcemanager.containerservice.models.OSSku;
import com.azure.resourcemanager.containerservice.models.OSType;
import com.azure.resourcemanager.containerservice.models.PowerState;
import com.azure.resourcemanager.containerservice.models.ScaleSetEvictionPolicy;
import com.azure.resourcemanager.containerservice.models.ScaleSetPriority;
import com.azure.resourcemanager.containerservice.models.SysctlConfig;
import com.azure.resourcemanager.containerservice.models.WorkloadRuntime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for AgentPools CreateOrUpdate.
 */
public final class AgentPoolsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2024-05-01/examples/
     * AgentPoolsCreate_EnableFIPS.json
     */
    /**
     * Sample code: Create Agent Pool with FIPS enabled OS.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createAgentPoolWithFIPSEnabledOS(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.kubernetesClusters()
            .manager()
            .serviceClient()
            .getAgentPools()
            .createOrUpdate("rg1", "clustername1", "agentpool1",
                new AgentPoolInner().withCount(3)
                    .withVmSize("Standard_DS2_v2")
                    .withOsType(OSType.LINUX)
                    .withOrchestratorVersion("")
                    .withEnableFips(true),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2024-05-01/examples/
     * AgentPools_Update.json
     */
    /**
     * Sample code: Update Agent Pool.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateAgentPool(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.kubernetesClusters()
            .manager()
            .serviceClient()
            .getAgentPools()
            .createOrUpdate("rg1", "clustername1", "agentpool1",
                new AgentPoolInner().withCount(3)
                    .withVmSize("Standard_DS1_v2")
                    .withOsType(OSType.LINUX)
                    .withMaxCount(2)
                    .withMinCount(2)
                    .withEnableAutoScaling(true)
                    .withOrchestratorVersion("")
                    .withScaleSetPriority(ScaleSetPriority.SPOT)
                    .withScaleSetEvictionPolicy(ScaleSetEvictionPolicy.DELETE)
                    .withNodeTaints(Arrays.asList("Key1=Value1:NoSchedule")),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2024-05-01/examples/
     * AgentPoolsCreate_GPUMIG.json
     */
    /**
     * Sample code: Create Agent Pool with GPUMIG.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createAgentPoolWithGPUMIG(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.kubernetesClusters()
            .manager()
            .serviceClient()
            .getAgentPools()
            .createOrUpdate("rg1", "clustername1", "agentpool1",
                new AgentPoolInner().withCount(3)
                    .withVmSize("Standard_ND96asr_v4")
                    .withOsType(OSType.LINUX)
                    .withOrchestratorVersion("")
                    .withKubeletConfig(new KubeletConfig().withCpuManagerPolicy("static")
                        .withCpuCfsQuota(true)
                        .withCpuCfsQuotaPeriod("200ms")
                        .withImageGcHighThreshold(90)
                        .withImageGcLowThreshold(70)
                        .withTopologyManagerPolicy("best-effort")
                        .withAllowedUnsafeSysctls(Arrays.asList("kernel.msg*", "net.core.somaxconn"))
                        .withFailSwapOn(false))
                    .withLinuxOSConfig(new LinuxOSConfig()
                        .withSysctls(new SysctlConfig().withNetCoreWmemDefault(12345)
                            .withNetIpv4TcpTwReuse(true)
                            .withNetIpv4IpLocalPortRange("20000 60000")
                            .withKernelThreadsMax(99999))
                        .withTransparentHugePageEnabled("always")
                        .withTransparentHugePageDefrag("madvise")
                        .withSwapFileSizeMB(1500))
                    .withGpuInstanceProfile(GpuInstanceProfile.MIG2G),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2024-05-01/examples/
     * AgentPoolsCreate_WindowsOSSKU.json
     */
    /**
     * Sample code: Create Agent Pool with Windows OSSKU.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createAgentPoolWithWindowsOSSKU(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.kubernetesClusters()
            .manager()
            .serviceClient()
            .getAgentPools()
            .createOrUpdate("rg1", "clustername1", "wnp2",
                new AgentPoolInner().withCount(3)
                    .withVmSize("Standard_D4s_v3")
                    .withOsType(OSType.WINDOWS)
                    .withOsSku(OSSku.WINDOWS2022)
                    .withOrchestratorVersion("1.23.3"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2024-05-01/examples/
     * AgentPoolsCreate_DedicatedHostGroup.json
     */
    /**
     * Sample code: Create Agent Pool with Dedicated Host Group.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createAgentPoolWithDedicatedHostGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.kubernetesClusters()
            .manager()
            .serviceClient()
            .getAgentPools()
            .createOrUpdate("rg1", "clustername1", "agentpool1", new AgentPoolInner().withCount(3)
                .withVmSize("Standard_DS2_v2")
                .withOsType(OSType.LINUX)
                .withOrchestratorVersion("")
                .withHostGroupId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg/providers/Microsoft.Compute/hostGroups/hostgroup1"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2024-05-01/examples/
     * AgentPoolsCreate_Update.json
     */
    /**
     * Sample code: Create/Update Agent Pool.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createUpdateAgentPool(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.kubernetesClusters()
            .manager()
            .serviceClient()
            .getAgentPools()
            .createOrUpdate("rg1", "clustername1", "agentpool1",
                new AgentPoolInner().withCount(3)
                    .withVmSize("Standard_DS1_v2")
                    .withOsType(OSType.LINUX)
                    .withMode(AgentPoolMode.USER)
                    .withOrchestratorVersion("")
                    .withScaleSetPriority(ScaleSetPriority.SPOT)
                    .withScaleSetEvictionPolicy(ScaleSetEvictionPolicy.DELETE)
                    .withTags(mapOf("name1", "val1"))
                    .withNodeLabels(mapOf("key1", "fakeTokenPlaceholder"))
                    .withNodeTaints(Arrays.asList("Key1=Value1:NoSchedule")),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2024-05-01/examples/
     * AgentPoolsCreate_WindowsDisableOutboundNAT.json
     */
    /**
     * Sample code: Create Windows Agent Pool with disabling OutboundNAT.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        createWindowsAgentPoolWithDisablingOutboundNAT(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.kubernetesClusters()
            .manager()
            .serviceClient()
            .getAgentPools()
            .createOrUpdate("rg1", "clustername1", "wnp2",
                new AgentPoolInner().withCount(3)
                    .withVmSize("Standard_D4s_v3")
                    .withOsType(OSType.WINDOWS)
                    .withOsSku(OSSku.WINDOWS2022)
                    .withOrchestratorVersion("1.23.8")
                    .withWindowsProfile(new AgentPoolWindowsProfile().withDisableOutboundNat(true)),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2024-05-01/examples/
     * AgentPools_Start.json
     */
    /**
     * Sample code: Start Agent Pool.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void startAgentPool(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.kubernetesClusters()
            .manager()
            .serviceClient()
            .getAgentPools()
            .createOrUpdate("rg1", "clustername1", "agentpool1",
                new AgentPoolInner().withPowerState(new PowerState().withCode(Code.RUNNING)),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2024-05-01/examples/
     * AgentPoolsCreate_Spot.json
     */
    /**
     * Sample code: Create Spot Agent Pool.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createSpotAgentPool(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.kubernetesClusters()
            .manager()
            .serviceClient()
            .getAgentPools()
            .createOrUpdate("rg1", "clustername1", "agentpool1",
                new AgentPoolInner().withCount(3)
                    .withVmSize("Standard_DS1_v2")
                    .withOsType(OSType.LINUX)
                    .withOrchestratorVersion("")
                    .withScaleSetPriority(ScaleSetPriority.SPOT)
                    .withScaleSetEvictionPolicy(ScaleSetEvictionPolicy.DELETE)
                    .withTags(mapOf("name1", "val1"))
                    .withNodeLabels(mapOf("key1", "fakeTokenPlaceholder"))
                    .withNodeTaints(Arrays.asList("Key1=Value1:NoSchedule")),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2024-05-01/examples/
     * AgentPoolsCreate_Ephemeral.json
     */
    /**
     * Sample code: Create Agent Pool with Ephemeral OS Disk.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createAgentPoolWithEphemeralOSDisk(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.kubernetesClusters()
            .manager()
            .serviceClient()
            .getAgentPools()
            .createOrUpdate("rg1", "clustername1", "agentpool1",
                new AgentPoolInner().withCount(3)
                    .withVmSize("Standard_DS2_v2")
                    .withOsDiskSizeGB(64)
                    .withOsDiskType(OSDiskType.EPHEMERAL)
                    .withOsType(OSType.LINUX)
                    .withOrchestratorVersion(""),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2024-05-01/examples/
     * AgentPoolsCreate_EnableEncryptionAtHost.json
     */
    /**
     * Sample code: Create Agent Pool with EncryptionAtHost enabled.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        createAgentPoolWithEncryptionAtHostEnabled(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.kubernetesClusters()
            .manager()
            .serviceClient()
            .getAgentPools()
            .createOrUpdate("rg1", "clustername1", "agentpool1",
                new AgentPoolInner().withCount(3)
                    .withVmSize("Standard_DS2_v2")
                    .withOsType(OSType.LINUX)
                    .withOrchestratorVersion("")
                    .withEnableEncryptionAtHost(true),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2024-05-01/examples/
     * AgentPoolsCreate_EnableUltraSSD.json
     */
    /**
     * Sample code: Create Agent Pool with UltraSSD enabled.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createAgentPoolWithUltraSSDEnabled(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.kubernetesClusters()
            .manager()
            .serviceClient()
            .getAgentPools()
            .createOrUpdate("rg1", "clustername1", "agentpool1",
                new AgentPoolInner().withCount(3)
                    .withVmSize("Standard_DS2_v2")
                    .withOsType(OSType.LINUX)
                    .withOrchestratorVersion("")
                    .withEnableUltraSsd(true),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2024-05-01/examples/
     * AgentPoolsCreate_WasmWasi.json
     */
    /**
     * Sample code: Create Agent Pool with Krustlet and the WASI runtime.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        createAgentPoolWithKrustletAndTheWASIRuntime(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.kubernetesClusters()
            .manager()
            .serviceClient()
            .getAgentPools()
            .createOrUpdate("rg1", "clustername1", "agentpool1",
                new AgentPoolInner().withCount(3)
                    .withVmSize("Standard_DS2_v2")
                    .withOsDiskSizeGB(64)
                    .withWorkloadRuntime(WorkloadRuntime.WASM_WASI)
                    .withOsType(OSType.LINUX)
                    .withMode(AgentPoolMode.USER)
                    .withOrchestratorVersion(""),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2024-05-01/examples/
     * AgentPoolsCreate_Snapshot.json
     */
    /**
     * Sample code: Create Agent Pool using an agent pool snapshot.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createAgentPoolUsingAnAgentPoolSnapshot(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.kubernetesClusters()
            .manager()
            .serviceClient()
            .getAgentPools()
            .createOrUpdate("rg1", "clustername1", "agentpool1", new AgentPoolInner().withCount(3)
                .withVmSize("Standard_DS2_v2")
                .withOsType(OSType.LINUX)
                .withOrchestratorVersion("")
                .withEnableFips(true)
                .withCreationData(new CreationData().withSourceResourceId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.ContainerService/snapshots/snapshot1")),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2024-05-01/examples/
     * AgentPoolsCreate_PPG.json
     */
    /**
     * Sample code: Create Agent Pool with PPG.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createAgentPoolWithPPG(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.kubernetesClusters()
            .manager()
            .serviceClient()
            .getAgentPools()
            .createOrUpdate("rg1", "clustername1", "agentpool1", new AgentPoolInner().withCount(3)
                .withVmSize("Standard_DS2_v2")
                .withOsType(OSType.LINUX)
                .withOrchestratorVersion("")
                .withProximityPlacementGroupId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.Compute/proximityPlacementGroups/ppg1"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2024-05-01/examples/
     * AgentPoolsCreate_CustomNodeConfig.json
     */
    /**
     * Sample code: Create Agent Pool with KubeletConfig and LinuxOSConfig.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        createAgentPoolWithKubeletConfigAndLinuxOSConfig(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.kubernetesClusters()
            .manager()
            .serviceClient()
            .getAgentPools()
            .createOrUpdate("rg1", "clustername1", "agentpool1",
                new AgentPoolInner().withCount(3)
                    .withVmSize("Standard_DS2_v2")
                    .withOsType(OSType.LINUX)
                    .withOrchestratorVersion("")
                    .withKubeletConfig(new KubeletConfig().withCpuManagerPolicy("static")
                        .withCpuCfsQuota(true)
                        .withCpuCfsQuotaPeriod("200ms")
                        .withImageGcHighThreshold(90)
                        .withImageGcLowThreshold(70)
                        .withTopologyManagerPolicy("best-effort")
                        .withAllowedUnsafeSysctls(Arrays.asList("kernel.msg*", "net.core.somaxconn"))
                        .withFailSwapOn(false))
                    .withLinuxOSConfig(new LinuxOSConfig()
                        .withSysctls(new SysctlConfig().withNetCoreWmemDefault(12345)
                            .withNetIpv4TcpTwReuse(true)
                            .withNetIpv4IpLocalPortRange("20000 60000")
                            .withKernelThreadsMax(99999))
                        .withTransparentHugePageEnabled("always")
                        .withTransparentHugePageDefrag("madvise")
                        .withSwapFileSizeMB(1500)),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2024-05-01/examples/
     * AgentPools_Stop.json
     */
    /**
     * Sample code: Stop Agent Pool.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void stopAgentPool(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.kubernetesClusters()
            .manager()
            .serviceClient()
            .getAgentPools()
            .createOrUpdate("rg1", "clustername1", "agentpool1",
                new AgentPoolInner().withPowerState(new PowerState().withCode(Code.STOPPED)),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2024-05-01/examples/
     * AgentPoolsCreate_CRG.json
     */
    /**
     * Sample code: Create Agent Pool with Capacity Reservation Group.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        createAgentPoolWithCapacityReservationGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.kubernetesClusters()
            .manager()
            .serviceClient()
            .getAgentPools()
            .createOrUpdate("rg1", "clustername1", "agentpool1", new AgentPoolInner().withCount(3)
                .withVmSize("Standard_DS2_v2")
                .withOsType(OSType.LINUX)
                .withOrchestratorVersion("")
                .withCapacityReservationGroupId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.Compute/CapacityReservationGroups/crg1"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2024-05-01/examples/
     * AgentPoolsCreate_OSSKU.json
     */
    /**
     * Sample code: Create Agent Pool with OSSKU.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createAgentPoolWithOSSKU(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.kubernetesClusters()
            .manager()
            .serviceClient()
            .getAgentPools()
            .createOrUpdate("rg1", "clustername1", "agentpool1",
                new AgentPoolInner().withCount(3)
                    .withVmSize("Standard_DS2_v2")
                    .withOsType(OSType.LINUX)
                    .withOsSku(OSSku.AZURE_LINUX)
                    .withOrchestratorVersion("")
                    .withKubeletConfig(new KubeletConfig().withCpuManagerPolicy("static")
                        .withCpuCfsQuota(true)
                        .withCpuCfsQuotaPeriod("200ms")
                        .withImageGcHighThreshold(90)
                        .withImageGcLowThreshold(70)
                        .withTopologyManagerPolicy("best-effort")
                        .withAllowedUnsafeSysctls(Arrays.asList("kernel.msg*", "net.core.somaxconn"))
                        .withFailSwapOn(false))
                    .withLinuxOSConfig(new LinuxOSConfig()
                        .withSysctls(new SysctlConfig().withNetCoreWmemDefault(12345)
                            .withNetIpv4TcpTwReuse(true)
                            .withNetIpv4IpLocalPortRange("20000 60000")
                            .withKernelThreadsMax(99999))
                        .withTransparentHugePageEnabled("always")
                        .withTransparentHugePageDefrag("madvise")
                        .withSwapFileSizeMB(1500)),
                com.azure.core.util.Context.NONE);
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
