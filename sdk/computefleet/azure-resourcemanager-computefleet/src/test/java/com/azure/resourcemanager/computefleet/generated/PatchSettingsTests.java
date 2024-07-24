// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computefleet.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.computefleet.models.PatchSettings;
import com.azure.resourcemanager.computefleet.models.WindowsPatchAssessmentMode;
import com.azure.resourcemanager.computefleet.models.WindowsVMGuestPatchAutomaticByPlatformRebootSetting;
import com.azure.resourcemanager.computefleet.models.WindowsVMGuestPatchAutomaticByPlatformSettings;
import com.azure.resourcemanager.computefleet.models.WindowsVMGuestPatchMode;
import org.junit.jupiter.api.Assertions;

public final class PatchSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PatchSettings model = BinaryData.fromString(
            "{\"patchMode\":\"AutomaticByOS\",\"enableHotpatching\":false,\"assessmentMode\":\"ImageDefault\",\"automaticByPlatformSettings\":{\"rebootSetting\":\"Always\",\"bypassPlatformSafetyChecksOnUserSchedule\":false}}")
            .toObject(PatchSettings.class);
        Assertions.assertEquals(WindowsVMGuestPatchMode.AUTOMATIC_BY_OS, model.patchMode());
        Assertions.assertEquals(false, model.enableHotpatching());
        Assertions.assertEquals(WindowsPatchAssessmentMode.IMAGE_DEFAULT, model.assessmentMode());
        Assertions.assertEquals(WindowsVMGuestPatchAutomaticByPlatformRebootSetting.ALWAYS,
            model.automaticByPlatformSettings().rebootSetting());
        Assertions.assertEquals(false, model.automaticByPlatformSettings().bypassPlatformSafetyChecksOnUserSchedule());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PatchSettings model = new PatchSettings().withPatchMode(WindowsVMGuestPatchMode.AUTOMATIC_BY_OS)
            .withEnableHotpatching(false)
            .withAssessmentMode(WindowsPatchAssessmentMode.IMAGE_DEFAULT)
            .withAutomaticByPlatformSettings(new WindowsVMGuestPatchAutomaticByPlatformSettings()
                .withRebootSetting(WindowsVMGuestPatchAutomaticByPlatformRebootSetting.ALWAYS)
                .withBypassPlatformSafetyChecksOnUserSchedule(false));
        model = BinaryData.fromObject(model).toObject(PatchSettings.class);
        Assertions.assertEquals(WindowsVMGuestPatchMode.AUTOMATIC_BY_OS, model.patchMode());
        Assertions.assertEquals(false, model.enableHotpatching());
        Assertions.assertEquals(WindowsPatchAssessmentMode.IMAGE_DEFAULT, model.assessmentMode());
        Assertions.assertEquals(WindowsVMGuestPatchAutomaticByPlatformRebootSetting.ALWAYS,
            model.automaticByPlatformSettings().rebootSetting());
        Assertions.assertEquals(false, model.automaticByPlatformSettings().bypassPlatformSafetyChecksOnUserSchedule());
    }
}
