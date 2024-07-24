// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.ChownMode;
import com.azure.resourcemanager.netapp.models.ExportPolicyRule;
import com.azure.resourcemanager.netapp.models.VolumePatchPropertiesExportPolicy;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class VolumePatchPropertiesExportPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VolumePatchPropertiesExportPolicy model = BinaryData.fromString(
            "{\"rules\":[{\"ruleIndex\":1488418313,\"unixReadOnly\":true,\"unixReadWrite\":false,\"kerberos5ReadOnly\":false,\"kerberos5ReadWrite\":false,\"kerberos5iReadOnly\":true,\"kerberos5iReadWrite\":true,\"kerberos5pReadOnly\":false,\"kerberos5pReadWrite\":true,\"cifs\":true,\"nfsv3\":false,\"nfsv41\":false,\"allowedClients\":\"luicpdggkzzlvmbm\",\"hasRootAccess\":false,\"chownMode\":\"Unrestricted\"},{\"ruleIndex\":488174706,\"unixReadOnly\":true,\"unixReadWrite\":false,\"kerberos5ReadOnly\":false,\"kerberos5ReadWrite\":false,\"kerberos5iReadOnly\":false,\"kerberos5iReadWrite\":false,\"kerberos5pReadOnly\":true,\"kerberos5pReadWrite\":true,\"cifs\":true,\"nfsv3\":true,\"nfsv41\":false,\"allowedClients\":\"akcp\",\"hasRootAccess\":false,\"chownMode\":\"Restricted\"}]}")
            .toObject(VolumePatchPropertiesExportPolicy.class);
        Assertions.assertEquals(1488418313, model.rules().get(0).ruleIndex());
        Assertions.assertEquals(true, model.rules().get(0).unixReadOnly());
        Assertions.assertEquals(false, model.rules().get(0).unixReadWrite());
        Assertions.assertEquals(false, model.rules().get(0).kerberos5ReadOnly());
        Assertions.assertEquals(false, model.rules().get(0).kerberos5ReadWrite());
        Assertions.assertEquals(true, model.rules().get(0).kerberos5IReadOnly());
        Assertions.assertEquals(true, model.rules().get(0).kerberos5IReadWrite());
        Assertions.assertEquals(false, model.rules().get(0).kerberos5PReadOnly());
        Assertions.assertEquals(true, model.rules().get(0).kerberos5PReadWrite());
        Assertions.assertEquals(true, model.rules().get(0).cifs());
        Assertions.assertEquals(false, model.rules().get(0).nfsv3());
        Assertions.assertEquals(false, model.rules().get(0).nfsv41());
        Assertions.assertEquals("luicpdggkzzlvmbm", model.rules().get(0).allowedClients());
        Assertions.assertEquals(false, model.rules().get(0).hasRootAccess());
        Assertions.assertEquals(ChownMode.UNRESTRICTED, model.rules().get(0).chownMode());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VolumePatchPropertiesExportPolicy model = new VolumePatchPropertiesExportPolicy().withRules(Arrays.asList(
            new ExportPolicyRule().withRuleIndex(1488418313)
                .withUnixReadOnly(true)
                .withUnixReadWrite(false)
                .withKerberos5ReadOnly(false)
                .withKerberos5ReadWrite(false)
                .withKerberos5IReadOnly(true)
                .withKerberos5IReadWrite(true)
                .withKerberos5PReadOnly(false)
                .withKerberos5PReadWrite(true)
                .withCifs(true)
                .withNfsv3(false)
                .withNfsv41(false)
                .withAllowedClients("luicpdggkzzlvmbm")
                .withHasRootAccess(false)
                .withChownMode(ChownMode.UNRESTRICTED),
            new ExportPolicyRule().withRuleIndex(488174706)
                .withUnixReadOnly(true)
                .withUnixReadWrite(false)
                .withKerberos5ReadOnly(false)
                .withKerberos5ReadWrite(false)
                .withKerberos5IReadOnly(false)
                .withKerberos5IReadWrite(false)
                .withKerberos5PReadOnly(true)
                .withKerberos5PReadWrite(true)
                .withCifs(true)
                .withNfsv3(true)
                .withNfsv41(false)
                .withAllowedClients("akcp")
                .withHasRootAccess(false)
                .withChownMode(ChownMode.RESTRICTED)));
        model = BinaryData.fromObject(model).toObject(VolumePatchPropertiesExportPolicy.class);
        Assertions.assertEquals(1488418313, model.rules().get(0).ruleIndex());
        Assertions.assertEquals(true, model.rules().get(0).unixReadOnly());
        Assertions.assertEquals(false, model.rules().get(0).unixReadWrite());
        Assertions.assertEquals(false, model.rules().get(0).kerberos5ReadOnly());
        Assertions.assertEquals(false, model.rules().get(0).kerberos5ReadWrite());
        Assertions.assertEquals(true, model.rules().get(0).kerberos5IReadOnly());
        Assertions.assertEquals(true, model.rules().get(0).kerberos5IReadWrite());
        Assertions.assertEquals(false, model.rules().get(0).kerberos5PReadOnly());
        Assertions.assertEquals(true, model.rules().get(0).kerberos5PReadWrite());
        Assertions.assertEquals(true, model.rules().get(0).cifs());
        Assertions.assertEquals(false, model.rules().get(0).nfsv3());
        Assertions.assertEquals(false, model.rules().get(0).nfsv41());
        Assertions.assertEquals("luicpdggkzzlvmbm", model.rules().get(0).allowedClients());
        Assertions.assertEquals(false, model.rules().get(0).hasRootAccess());
        Assertions.assertEquals(ChownMode.UNRESTRICTED, model.rules().get(0).chownMode());
    }
}
