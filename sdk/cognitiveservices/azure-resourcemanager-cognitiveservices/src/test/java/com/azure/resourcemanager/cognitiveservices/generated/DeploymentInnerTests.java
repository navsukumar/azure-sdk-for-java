// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.fluent.models.DeploymentInner;
import com.azure.resourcemanager.cognitiveservices.models.DeploymentModel;
import com.azure.resourcemanager.cognitiveservices.models.DeploymentProperties;
import com.azure.resourcemanager.cognitiveservices.models.DeploymentScaleSettings;
import com.azure.resourcemanager.cognitiveservices.models.DeploymentScaleType;
import org.junit.jupiter.api.Assertions;

public final class DeploymentInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DeploymentInner model =
            BinaryData
                .fromString(
                    "{\"etag\":\"ilvpnppfuflrwd\",\"properties\":{\"provisioningState\":\"Succeeded\",\"model\":{\"format\":\"jrxs\",\"name\":\"afcnih\",\"version\":\"qapnedgfbcv\"},\"scaleSettings\":{\"scaleType\":\"Standard\",\"capacity\":1489059266,\"activeCapacity\":346770564},\"capabilities\":{\"sotbob\":\"vdrhvoo\",\"ld\":\"dopcjwvnh\",\"twuoegrpkhjwni\":\"mgxcxrslpm\"},\"raiPolicyName\":\"sluicpdggkzz\",\"callRateLimit\":{\"count\":62.88767,\"renewalPeriod\":89.78058,\"rules\":[]}},\"id\":\"modfvuefywsbpfvm\",\"name\":\"yhrfouyftaakcpw\",\"type\":\"yzvqt\"}")
                .toObject(DeploymentInner.class);
        Assertions.assertEquals("jrxs", model.properties().model().format());
        Assertions.assertEquals("afcnih", model.properties().model().name());
        Assertions.assertEquals("qapnedgfbcv", model.properties().model().version());
        Assertions.assertEquals(DeploymentScaleType.STANDARD, model.properties().scaleSettings().scaleType());
        Assertions.assertEquals(1489059266, model.properties().scaleSettings().capacity());
        Assertions.assertEquals("sluicpdggkzz", model.properties().raiPolicyName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DeploymentInner model =
            new DeploymentInner()
                .withProperties(
                    new DeploymentProperties()
                        .withModel(
                            new DeploymentModel().withFormat("jrxs").withName("afcnih").withVersion("qapnedgfbcv"))
                        .withScaleSettings(
                            new DeploymentScaleSettings()
                                .withScaleType(DeploymentScaleType.STANDARD)
                                .withCapacity(1489059266))
                        .withRaiPolicyName("sluicpdggkzz"));
        model = BinaryData.fromObject(model).toObject(DeploymentInner.class);
        Assertions.assertEquals("jrxs", model.properties().model().format());
        Assertions.assertEquals("afcnih", model.properties().model().name());
        Assertions.assertEquals("qapnedgfbcv", model.properties().model().version());
        Assertions.assertEquals(DeploymentScaleType.STANDARD, model.properties().scaleSettings().scaleType());
        Assertions.assertEquals(1489059266, model.properties().scaleSettings().capacity());
        Assertions.assertEquals("sluicpdggkzz", model.properties().raiPolicyName());
    }
}
