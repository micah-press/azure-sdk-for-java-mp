// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkanalytics.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.networkanalytics.NetworkAnalyticsManager;
import com.azure.resourcemanager.networkanalytics.models.DataProductsCatalog;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class DataProductsCatalogsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningState\":\"Succeeded\",\"publishers\":[{\"publisherName\":\"bpbewtghfgb\",\"dataProducts\":[{\"dataProductName\":\"gw\",\"description\":\"zvlvqhjkbegib\",\"dataProductVersions\":[]}]},{\"publisherName\":\"nmxiebwwaloayqc\",\"dataProducts\":[{\"dataProductName\":\"rtzju\",\"description\":\"gwyzm\",\"dataProductVersions\":[]}]},{\"publisherName\":\"txon\",\"dataProducts\":[{\"dataProductName\":\"ts\",\"description\":\"vjcbpwxqpsrknf\",\"dataProductVersions\":[]},{\"dataProductName\":\"guvriuhprwmd\",\"description\":\"vxqtayriwwroyqbe\",\"dataProductVersions\":[]},{\"dataProductName\":\"rmcqiby\",\"description\":\"nojvknmefqsg\",\"dataProductVersions\":[]},{\"dataProductName\":\"vah\",\"description\":\"pjyzhpv\",\"dataProductVersions\":[]}]},{\"publisherName\":\"qzcjrvxdj\",\"dataProducts\":[{\"dataProductName\":\"mwlxk\",\"description\":\"ug\",\"dataProductVersions\":[]},{\"dataProductName\":\"hzovawjvzunlut\",\"description\":\"nnprn\",\"dataProductVersions\":[]},{\"dataProductName\":\"i\",\"description\":\"eilpjzuaejxdu\",\"dataProductVersions\":[]},{\"dataProductName\":\"tskzbbtdzumveek\",\"description\":\"pwo\",\"dataProductVersions\":[]}]}]},\"id\":\"hkfpbs\",\"name\":\"yofd\",\"type\":\"luu\"}]}";

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

        NetworkAnalyticsManager manager = NetworkAnalyticsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<DataProductsCatalog> response
            = manager.dataProductsCatalogs().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("bpbewtghfgb",
            response.iterator().next().properties().publishers().get(0).publisherName());
        Assertions.assertEquals("gw",
            response.iterator().next().properties().publishers().get(0).dataProducts().get(0).dataProductName());
        Assertions.assertEquals("zvlvqhjkbegib",
            response.iterator().next().properties().publishers().get(0).dataProducts().get(0).description());
    }
}
