// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupEngineBaseResource;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class BackupEnginesListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"backupEngineType\":\"BackupEngineBase\",\"friendlyName\":\"p\",\"backupManagementType\":\"AzureStorage\",\"registrationStatus\":\"ythqkkwhbgxvel\",\"backupEngineState\":\"ulnxdmnit\",\"healthStatus\":\"jdtvmclyymffhmj\",\"canReRegister\":true,\"backupEngineId\":\"yx\",\"dpmVersion\":\"uvrzmzqmzjqrb\",\"azureBackupAgentVersion\":\"vnmdyfoeboj\",\"isAzureBackupAgentUpgradeAvailable\":false,\"isDpmUpgradeAvailable\":false,\"extendedInfo\":{\"databaseName\":\"ohoqkpjtnqjilayw\",\"protectedItemsCount\":732015238,\"protectedServersCount\":223895093,\"diskCount\":1236384116,\"usedDiskSpace\":8.866298413872986,\"availableDiskSpace\":61.33773835781709,\"refreshedAt\":\"2021-06-24T20:20:39Z\",\"azureProtectedInstances\":1172997704}},\"eTag\":\"lfylnkkbjpjvlyw\",\"location\":\"tmfwobbjwhl\",\"tags\":{\"zgczeu\":\"fnqzocr\"},\"id\":\"tgxdncaqt\",\"name\":\"iekoif\",\"type\":\"vnyttzgi\"}]}";

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

        RecoveryServicesBackupManager manager =
            RecoveryServicesBackupManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<BackupEngineBaseResource> response =
            manager
                .backupEngines()
                .list("pqtwloesqrggvrb", "yrukoi", "aciduwjleip", "lh", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("tmfwobbjwhl", response.iterator().next().location());
        Assertions.assertEquals("fnqzocr", response.iterator().next().tags().get("zgczeu"));
        Assertions.assertEquals("p", response.iterator().next().properties().friendlyName());
        Assertions
            .assertEquals(
                BackupManagementType.AZURE_STORAGE, response.iterator().next().properties().backupManagementType());
        Assertions.assertEquals("ythqkkwhbgxvel", response.iterator().next().properties().registrationStatus());
        Assertions.assertEquals("ulnxdmnit", response.iterator().next().properties().backupEngineState());
        Assertions.assertEquals("jdtvmclyymffhmj", response.iterator().next().properties().healthStatus());
        Assertions.assertEquals(true, response.iterator().next().properties().canReRegister());
        Assertions.assertEquals("yx", response.iterator().next().properties().backupEngineId());
        Assertions.assertEquals("uvrzmzqmzjqrb", response.iterator().next().properties().dpmVersion());
        Assertions.assertEquals("vnmdyfoeboj", response.iterator().next().properties().azureBackupAgentVersion());
        Assertions.assertEquals(false, response.iterator().next().properties().isAzureBackupAgentUpgradeAvailable());
        Assertions.assertEquals(false, response.iterator().next().properties().isDpmUpgradeAvailable());
        Assertions
            .assertEquals("ohoqkpjtnqjilayw", response.iterator().next().properties().extendedInfo().databaseName());
        Assertions
            .assertEquals(732015238, response.iterator().next().properties().extendedInfo().protectedItemsCount());
        Assertions
            .assertEquals(223895093, response.iterator().next().properties().extendedInfo().protectedServersCount());
        Assertions.assertEquals(1236384116, response.iterator().next().properties().extendedInfo().diskCount());
        Assertions
            .assertEquals(8.866298413872986D, response.iterator().next().properties().extendedInfo().usedDiskSpace());
        Assertions
            .assertEquals(
                61.33773835781709D, response.iterator().next().properties().extendedInfo().availableDiskSpace());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-06-24T20:20:39Z"),
                response.iterator().next().properties().extendedInfo().refreshedAt());
        Assertions
            .assertEquals(1172997704, response.iterator().next().properties().extendedInfo().azureProtectedInstances());
        Assertions.assertEquals("lfylnkkbjpjvlyw", response.iterator().next().etag());
    }
}