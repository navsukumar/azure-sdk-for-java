// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.ContainerAppsBuildResourceInner;

public final class ContainerAppsBuildResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ContainerAppsBuildResourceInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"Failed\",\"buildStatus\":\"Canceled\",\"destinationContainerRegistry\":{\"server\":\"ckdlpag\",\"image\":\"cxfailcfxwmdboxd\"},\"configuration\":{\"baseOs\":\"ft\",\"platform\":\"qobr\",\"platformVersion\":\"nac\",\"environmentVariables\":[{\"name\":\"kknhxkizvytnrzv\",\"value\":\"lj\"},{\"name\":\"aaeranokqgukk\",\"value\":\"qnvb\"},{\"name\":\"oylaxxul\",\"value\":\"disdosfjbjsvgj\"}],\"preBuildSteps\":[{\"description\":\"yvycytdclxgcckn\",\"scripts\":[\"mbtmvpdvjdhttzae\",\"edxihchrphkmcrj\",\"qnsdfzpbgtgky\",\"kdghrjeuutlwx\"],\"httpGet\":{\"url\":\"w\",\"fileName\":\"okvbwnhhtqlgehg\",\"headers\":[\"pifhpfeoajvgcxtx\",\"csheafidltugsr\",\"smkss\",\"h\"]}},{\"description\":\"ftxfkf\",\"scripts\":[\"prhptillu\"],\"httpGet\":{\"url\":\"iqtgdqoh\",\"fileName\":\"wsldrizetpwbr\",\"headers\":[\"libph\",\"qzmiza\",\"a\",\"ankjpdnjzh\"]}}]},\"logStreamEndpoint\":\"oylhjlmuoyxprimr\"},\"id\":\"pteecjme\",\"name\":\"slstvasy\",\"type\":\"wxdzaumweoohgu\"}")
            .toObject(ContainerAppsBuildResourceInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ContainerAppsBuildResourceInner model = new ContainerAppsBuildResourceInner();
        model = BinaryData.fromObject(model).toObject(ContainerAppsBuildResourceInner.class);
    }
}
