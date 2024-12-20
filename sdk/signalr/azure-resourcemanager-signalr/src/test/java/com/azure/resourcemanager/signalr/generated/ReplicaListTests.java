// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.fluent.models.ReplicaInner;
import com.azure.resourcemanager.signalr.models.ReplicaList;
import com.azure.resourcemanager.signalr.models.ResourceSku;
import com.azure.resourcemanager.signalr.models.SignalRSkuTier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ReplicaListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReplicaList model = BinaryData.fromString(
            "{\"value\":[{\"sku\":{\"name\":\"zhezwwvaiq\",\"tier\":\"Free\",\"size\":\"fonkphhqyikvyla\",\"family\":\"avluwmncs\",\"capacity\":736005906},\"properties\":{\"provisioningState\":\"Succeeded\",\"regionEndpointEnabled\":\"vpo\",\"resourceStopped\":\"rsg\"},\"location\":\"b\",\"tags\":{\"njdgkynscliq\":\"zq\",\"mtk\":\"zvhxnk\",\"ppnvdxz\":\"bo\",\"hlfkqojpy\":\"hihfrbbcevqagtlt\"},\"id\":\"vgtrdcnifmzzs\",\"name\":\"ymbrnysuxmpraf\",\"type\":\"g\"},{\"sku\":{\"name\":\"hocxvdfffwafqrou\",\"tier\":\"Basic\",\"size\":\"avehhrvkbunzo\",\"family\":\"dhcxgkmoy\",\"capacity\":1284986304},\"properties\":{\"provisioningState\":\"Updating\",\"regionEndpointEnabled\":\"hmfdnbzydvfvfcj\",\"resourceStopped\":\"eoisrvhmgor\"},\"location\":\"ukiscvwmzhw\",\"tags\":{\"btgn\":\"faxvxil\",\"zqlqhyc\":\"nzeyqxtjj\",\"mieknlraria\":\"vodggxdbee\"},\"id\":\"wiuagydwqf\",\"name\":\"ylyrfgiagtco\",\"type\":\"ocqwogfnzjvus\"}],\"nextLink\":\"ld\"}")
            .toObject(ReplicaList.class);
        Assertions.assertEquals("b", model.value().get(0).location());
        Assertions.assertEquals("zq", model.value().get(0).tags().get("njdgkynscliq"));
        Assertions.assertEquals("zhezwwvaiq", model.value().get(0).sku().name());
        Assertions.assertEquals(SignalRSkuTier.FREE, model.value().get(0).sku().tier());
        Assertions.assertEquals(736005906, model.value().get(0).sku().capacity());
        Assertions.assertEquals("vpo", model.value().get(0).regionEndpointEnabled());
        Assertions.assertEquals("rsg", model.value().get(0).resourceStopped());
        Assertions.assertEquals("ld", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReplicaList model = new ReplicaList().withValue(Arrays.asList(
            new ReplicaInner().withLocation("b")
                .withTags(
                    mapOf("njdgkynscliq", "zq", "mtk", "zvhxnk", "ppnvdxz", "bo", "hlfkqojpy", "hihfrbbcevqagtlt"))
                .withSku(new ResourceSku().withName("zhezwwvaiq").withTier(SignalRSkuTier.FREE).withCapacity(736005906))
                .withRegionEndpointEnabled("vpo")
                .withResourceStopped("rsg"),
            new ReplicaInner().withLocation("ukiscvwmzhw")
                .withTags(mapOf("btgn", "faxvxil", "zqlqhyc", "nzeyqxtjj", "mieknlraria", "vodggxdbee"))
                .withSku(new ResourceSku().withName("hocxvdfffwafqrou")
                    .withTier(SignalRSkuTier.BASIC)
                    .withCapacity(1284986304))
                .withRegionEndpointEnabled("hmfdnbzydvfvfcj")
                .withResourceStopped("eoisrvhmgor")))
            .withNextLink("ld");
        model = BinaryData.fromObject(model).toObject(ReplicaList.class);
        Assertions.assertEquals("b", model.value().get(0).location());
        Assertions.assertEquals("zq", model.value().get(0).tags().get("njdgkynscliq"));
        Assertions.assertEquals("zhezwwvaiq", model.value().get(0).sku().name());
        Assertions.assertEquals(SignalRSkuTier.FREE, model.value().get(0).sku().tier());
        Assertions.assertEquals(736005906, model.value().get(0).sku().capacity());
        Assertions.assertEquals("vpo", model.value().get(0).regionEndpointEnabled());
        Assertions.assertEquals("rsg", model.value().get(0).resourceStopped());
        Assertions.assertEquals("ld", model.nextLink());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
