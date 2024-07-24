// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.BackupPolicyPatch;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class BackupPolicyPatchTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupPolicyPatch model = BinaryData.fromString(
            "{\"properties\":{\"backupPolicyId\":\"bbqwrvtldg\",\"provisioningState\":\"pgvmpipaslthaqfx\",\"dailyBackupsToKeep\":400254725,\"weeklyBackupsToKeep\":236380813,\"monthlyBackupsToKeep\":1174161651,\"volumesAssigned\":1781178234,\"enabled\":false,\"volumeBackups\":[{\"volumeName\":\"drhneuyow\",\"volumeResourceId\":\"d\",\"backupsCount\":110101001,\"policyEnabled\":true},{\"volumeName\":\"bi\",\"volumeResourceId\":\"gpikpzimejza\",\"backupsCount\":108512766,\"policyEnabled\":false}]},\"location\":\"iavrm\",\"tags\":{\"frl\":\"nokixrjqcirgz\"},\"id\":\"zszrnwoiindfpw\",\"name\":\"jylwbtlhflsj\",\"type\":\"dhszfjv\"}")
            .toObject(BackupPolicyPatch.class);
        Assertions.assertEquals("iavrm", model.location());
        Assertions.assertEquals("nokixrjqcirgz", model.tags().get("frl"));
        Assertions.assertEquals(400254725, model.dailyBackupsToKeep());
        Assertions.assertEquals(236380813, model.weeklyBackupsToKeep());
        Assertions.assertEquals(1174161651, model.monthlyBackupsToKeep());
        Assertions.assertEquals(false, model.enabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupPolicyPatch model = new BackupPolicyPatch().withLocation("iavrm")
            .withTags(mapOf("frl", "nokixrjqcirgz"))
            .withDailyBackupsToKeep(400254725)
            .withWeeklyBackupsToKeep(236380813)
            .withMonthlyBackupsToKeep(1174161651)
            .withEnabled(false);
        model = BinaryData.fromObject(model).toObject(BackupPolicyPatch.class);
        Assertions.assertEquals("iavrm", model.location());
        Assertions.assertEquals("nokixrjqcirgz", model.tags().get("frl"));
        Assertions.assertEquals(400254725, model.dailyBackupsToKeep());
        Assertions.assertEquals(236380813, model.weeklyBackupsToKeep());
        Assertions.assertEquals(1174161651, model.monthlyBackupsToKeep());
        Assertions.assertEquals(false, model.enabled());
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
