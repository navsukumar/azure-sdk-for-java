// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.appcontainers.ContainerAppsApiManager;
import com.azure.resourcemanager.appcontainers.models.ContainerAppsPatchResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ContainerAppsPatchesListByContainerAppMockTests {
    @Test
    public void testListByContainerApp() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"targetEnvironmentId\":\"jguwrjmwvv\",\"targetContainerAppId\":\"uqkxximwgxqld\",\"targetRevisionId\":\"otjgxieqfkyfhi\",\"patchApplyStatus\":\"Canceled\",\"createdAt\":\"2021-06-02T14:31:58Z\",\"lastModifiedAt\":\"2021-01-22T23:04:26Z\",\"patchDetails\":[{\"targetContainerName\":\"ynvskpajbmgeume\",\"targetImage\":\"mj\",\"lastDetectionTime\":\"2021-05-21T03:12:39Z\",\"detectionStatus\":\"Failed\",\"newImageName\":\"ccwkqmtx\",\"newLayer\":{\"name\":\"qis\",\"frameworkAndVersion\":\"p\",\"osAndVersion\":\"gftrqrejdaahuqim\"},\"oldLayer\":{\"name\":\"hlf\",\"frameworkAndVersion\":\"muifmuadjnfsn\",\"osAndVersion\":\"kiioshj\"},\"patchType\":\"OSSecurity\"},{\"targetContainerName\":\"etybnxgzt\",\"targetImage\":\"cg\",\"lastDetectionTime\":\"2020-12-23T19:28:58Z\",\"detectionStatus\":\"Failed\",\"newImageName\":\"hfjv\",\"newLayer\":{\"name\":\"j\",\"frameworkAndVersion\":\"becuvlbefvwcl\",\"osAndVersion\":\"xpyl\"},\"oldLayer\":{\"name\":\"x\",\"frameworkAndVersion\":\"wpsyxjij\",\"osAndVersion\":\"pdvrbkerdkdkga\"},\"patchType\":\"Other\"}]},\"id\":\"xildfkcefey\",\"name\":\"zqp\",\"type\":\"oisfmnaybdjn\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ContainerAppsApiManager manager = ContainerAppsApiManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ContainerAppsPatchResource> response = manager.containerAppsPatches()
            .listByContainerApp("ccgrvkcxzznn", "i", "ersejeg", com.azure.core.util.Context.NONE);

    }
}
