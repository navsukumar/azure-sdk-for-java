// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.ContainerAppsPatchResourceInner;

public final class ContainerAppsPatchResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ContainerAppsPatchResourceInner model = BinaryData.fromString(
            "{\"properties\":{\"targetEnvironmentId\":\"yj\",\"targetContainerAppId\":\"tpvopvpbdb\",\"targetRevisionId\":\"gqqihedsvqwt\",\"patchApplyStatus\":\"Canceled\",\"createdAt\":\"2021-06-02T15:24:18Z\",\"lastModifiedAt\":\"2021-08-17T17:54:59Z\",\"patchDetails\":[{\"targetContainerName\":\"ihsgq\",\"targetImage\":\"wdhohsdtmcdzsu\",\"lastDetectionTime\":\"2021-08-03T04:05:49Z\",\"detectionStatus\":\"Succeeded\",\"newImageName\":\"dxbzlmcmuap\",\"newLayer\":{\"name\":\"dbevwqqxeysko\",\"frameworkAndVersion\":\"zinkfkbgbzbowxeq\",\"osAndVersion\":\"ljmygvkzqkjjeokb\"},\"oldLayer\":{\"name\":\"ezrxcczurtleipqx\",\"frameworkAndVersion\":\"wvz\",\"osAndVersion\":\"zvd\"},\"patchType\":\"FrameworkSecurity\"},{\"targetContainerName\":\"d\",\"targetImage\":\"xzmqpnodawop\",\"lastDetectionTime\":\"2021-04-29T16:57Z\",\"detectionStatus\":\"Failed\",\"newImageName\":\"jptmcgsbost\",\"newLayer\":{\"name\":\"ndlatutmzlbi\",\"frameworkAndVersion\":\"lvfhrbbp\",\"osAndVersion\":\"qvcww\"},\"oldLayer\":{\"name\":\"r\",\"frameworkAndVersion\":\"chpp\",\"osAndVersion\":\"rsnm\"},\"patchType\":\"Other\"},{\"targetContainerName\":\"yzejnhlbk\",\"targetImage\":\"bzpcpiljhahzvec\",\"lastDetectionTime\":\"2021-11-30T16:41:47Z\",\"detectionStatus\":\"Succeeded\",\"newImageName\":\"nwieholewjw\",\"newLayer\":{\"name\":\"bwefqsfapaqtfer\",\"frameworkAndVersion\":\"wexjkmfxapjwogq\",\"osAndVersion\":\"o\"},\"oldLayer\":{\"name\":\"dcdab\",\"frameworkAndVersion\":\"wpwyawbz\",\"osAndVersion\":\"qbucljgkyexaoguy\"},\"patchType\":\"FrameworkSecurity\"},{\"targetContainerName\":\"ids\",\"targetImage\":\"ault\",\"lastDetectionTime\":\"2021-10-28T20:41:59Z\",\"detectionStatus\":\"RegistryLoginFailed\",\"newImageName\":\"um\",\"newLayer\":{\"name\":\"azlnqnmcjngzqdqx\",\"frameworkAndVersion\":\"jw\",\"osAndVersion\":\"yfu\"},\"oldLayer\":{\"name\":\"svtui\",\"frameworkAndVersion\":\"hajqglcfh\",\"osAndVersion\":\"rqryxynqn\"},\"patchType\":\"Other\"}]},\"id\":\"sovwxznptgoeiyb\",\"name\":\"abpfhvfs\",\"type\":\"kvntjlrigjkskyri\"}")
            .toObject(ContainerAppsPatchResourceInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ContainerAppsPatchResourceInner model = new ContainerAppsPatchResourceInner();
        model = BinaryData.fromObject(model).toObject(ContainerAppsPatchResourceInner.class);
    }
}
