// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.mediaservices.MediaServicesManager;
import com.azure.resourcemanager.mediaservices.models.StorageEncryptedAssetDecryptionData;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class AssetsGetEncryptionKeyWithResponseMockTests {
    @Test
    public void testGetEncryptionKeyWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"assetFileEncryptionMetadata\":[{\"initializationVector\":\"mifrygznmma\",\"assetFileName\":\"izkzobgo\",\"assetFileId\":\"bc4d205f-5639-4d64-a905-c5294ccc037b\"},{\"initializationVector\":\"lhslnelxieixyn\",\"assetFileName\":\"xecwcro\",\"assetFileId\":\"8393c01d-69dc-48eb-a6c4-da494886a006\"},{\"initializationVector\":\"hslhca\",\"assetFileName\":\"u\",\"assetFileId\":\"8193eeda-091b-4d11-b205-7fa6be37fb32\"},{\"initializationVector\":\"fdwfmvigorqj\",\"assetFileName\":\"tzh\",\"assetFileId\":\"b8b38735-35a1-4f31-863e-18299bcde12f\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        MediaServicesManager manager =
            MediaServicesManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        StorageEncryptedAssetDecryptionData response =
            manager
                .assets()
                .getEncryptionKeyWithResponse(
                    "abpfhvfs", "kvntjlrigjkskyri", "ovzidsx", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("mifrygznmma", response.assetFileEncryptionMetadata().get(0).initializationVector());
        Assertions.assertEquals("izkzobgo", response.assetFileEncryptionMetadata().get(0).assetFileName());
        Assertions
            .assertEquals(
                UUID.fromString("bc4d205f-5639-4d64-a905-c5294ccc037b"),
                response.assetFileEncryptionMetadata().get(0).assetFileId());
    }
}
