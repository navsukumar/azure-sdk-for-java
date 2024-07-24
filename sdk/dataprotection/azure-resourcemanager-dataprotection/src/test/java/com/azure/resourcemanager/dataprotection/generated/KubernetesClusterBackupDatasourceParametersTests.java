// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.KubernetesClusterBackupDatasourceParameters;
import com.azure.resourcemanager.dataprotection.models.NamespacedNameResource;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class KubernetesClusterBackupDatasourceParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        KubernetesClusterBackupDatasourceParameters model = BinaryData.fromString(
            "{\"objectType\":\"KubernetesClusterBackupDatasourceParameters\",\"snapshotVolumes\":false,\"includeClusterScopeResources\":true,\"includedNamespaces\":[\"yrqufegxuvwz\",\"bnhlmc\"],\"excludedNamespaces\":[\"dn\"],\"includedResourceTypes\":[\"vgbmhr\",\"xkw\",\"yijejvegrhbpnaix\",\"xccbdreaxhcex\"],\"excludedResourceTypes\":[\"vqahqkghtpwi\",\"nhyjsv\",\"ycxzbfvoo\",\"vrvmtgjqppyost\"],\"labelSelectors\":[\"zm\"],\"backupHookReferences\":[{\"name\":\"ipn\",\"namespace\":\"kmcwaekrrjreafx\"},{\"name\":\"gumhjglikkxws\",\"namespace\":\"lbqpvuzlmvfelf\"}]}")
            .toObject(KubernetesClusterBackupDatasourceParameters.class);
        Assertions.assertEquals(false, model.snapshotVolumes());
        Assertions.assertEquals(true, model.includeClusterScopeResources());
        Assertions.assertEquals("yrqufegxuvwz", model.includedNamespaces().get(0));
        Assertions.assertEquals("dn", model.excludedNamespaces().get(0));
        Assertions.assertEquals("vgbmhr", model.includedResourceTypes().get(0));
        Assertions.assertEquals("vqahqkghtpwi", model.excludedResourceTypes().get(0));
        Assertions.assertEquals("zm", model.labelSelectors().get(0));
        Assertions.assertEquals("ipn", model.backupHookReferences().get(0).name());
        Assertions.assertEquals("kmcwaekrrjreafx", model.backupHookReferences().get(0).namespace());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        KubernetesClusterBackupDatasourceParameters model
            = new KubernetesClusterBackupDatasourceParameters().withSnapshotVolumes(false)
                .withIncludeClusterScopeResources(true)
                .withIncludedNamespaces(Arrays.asList("yrqufegxuvwz", "bnhlmc"))
                .withExcludedNamespaces(Arrays.asList("dn"))
                .withIncludedResourceTypes(Arrays.asList("vgbmhr", "xkw", "yijejvegrhbpnaix", "xccbdreaxhcex"))
                .withExcludedResourceTypes(Arrays.asList("vqahqkghtpwi", "nhyjsv", "ycxzbfvoo", "vrvmtgjqppyost"))
                .withLabelSelectors(Arrays.asList("zm"))
                .withBackupHookReferences(
                    Arrays.asList(new NamespacedNameResource().withName("ipn").withNamespace("kmcwaekrrjreafx"),
                        new NamespacedNameResource().withName("gumhjglikkxws").withNamespace("lbqpvuzlmvfelf")));
        model = BinaryData.fromObject(model).toObject(KubernetesClusterBackupDatasourceParameters.class);
        Assertions.assertEquals(false, model.snapshotVolumes());
        Assertions.assertEquals(true, model.includeClusterScopeResources());
        Assertions.assertEquals("yrqufegxuvwz", model.includedNamespaces().get(0));
        Assertions.assertEquals("dn", model.excludedNamespaces().get(0));
        Assertions.assertEquals("vgbmhr", model.includedResourceTypes().get(0));
        Assertions.assertEquals("vqahqkghtpwi", model.excludedResourceTypes().get(0));
        Assertions.assertEquals("zm", model.labelSelectors().get(0));
        Assertions.assertEquals("ipn", model.backupHookReferences().get(0).name());
        Assertions.assertEquals("kmcwaekrrjreafx", model.backupHookReferences().get(0).namespace());
    }
}
