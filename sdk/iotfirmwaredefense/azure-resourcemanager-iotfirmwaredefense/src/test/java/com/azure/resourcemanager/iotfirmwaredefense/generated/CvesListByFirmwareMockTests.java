// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.iotfirmwaredefense.IoTFirmwareDefenseManager;
import com.azure.resourcemanager.iotfirmwaredefense.models.CveResource;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class CvesListByFirmwareMockTests {
    @Test
    public void testListByFirmware() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"properties\":{\"cveId\":\"pnapnyiropuh\",\"component\":{\"componentId\":\"vpgylgqgitxmed\",\"name\":\"c\",\"version\":\"ynqwwncwzzhxgk\"},\"severity\":\"mgucna\",\"name\":\"t\",\"cvssScore\":\"ellwptfdy\",\"cvssVersion\":\"fqbuaceopzf\",\"cvssV2Score\":\"hhuao\",\"cvssV3Score\":\"pcqeqx\",\"links\":[{\"href\":\"ahzxctobgbk\",\"label\":\"oizpostmgrcfbun\"}],\"description\":\"fqjhhkxbpvjymj\"},\"id\":\"xjyngudivk\",\"name\":\"tswb\",\"type\":\"qzvszjf\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        IoTFirmwareDefenseManager manager = IoTFirmwareDefenseManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<CveResource> response
            = manager.cves().listByFirmware("o", "hb", "xknalaulppg", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("pnapnyiropuh", response.iterator().next().cveId());
        Assertions.assertEquals("vpgylgqgitxmed", response.iterator().next().component().componentId());
        Assertions.assertEquals("c", response.iterator().next().component().name());
        Assertions.assertEquals("ynqwwncwzzhxgk", response.iterator().next().component().version());
        Assertions.assertEquals("mgucna", response.iterator().next().severity());
        Assertions.assertEquals("t", response.iterator().next().namePropertiesName());
        Assertions.assertEquals("ellwptfdy", response.iterator().next().cvssScore());
        Assertions.assertEquals("fqbuaceopzf", response.iterator().next().cvssVersion());
        Assertions.assertEquals("hhuao", response.iterator().next().cvssV2Score());
        Assertions.assertEquals("pcqeqx", response.iterator().next().cvssV3Score());
        Assertions.assertEquals("fqjhhkxbpvjymj", response.iterator().next().description());
    }
}
