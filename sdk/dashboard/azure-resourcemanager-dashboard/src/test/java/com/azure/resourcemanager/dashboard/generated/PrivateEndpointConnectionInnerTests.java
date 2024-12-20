// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dashboard.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dashboard.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.dashboard.models.PrivateEndpoint;
import com.azure.resourcemanager.dashboard.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.dashboard.models.PrivateLinkServiceConnectionState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionInner model = BinaryData.fromString(
            "{\"properties\":{\"privateEndpoint\":{\"id\":\"njaqwixjspro\"},\"privateLinkServiceConnectionState\":{\"status\":\"Approved\",\"description\":\"utegjvwmfdats\",\"actionsRequired\":\"dvpjhulsuuvmk\"},\"groupIds\":[\"k\",\"wfndiodjpsl\"],\"provisioningState\":\"Creating\"},\"id\":\"pvwryoqpsoacc\",\"name\":\"azakl\",\"type\":\"lahbcryff\"}")
            .toObject(PrivateEndpointConnectionInner.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.APPROVED,
            model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("utegjvwmfdats", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("dvpjhulsuuvmk", model.privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals("k", model.groupIds().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionInner model
            = new PrivateEndpointConnectionInner().withPrivateEndpoint(new PrivateEndpoint())
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionState().withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                        .withDescription("utegjvwmfdats")
                        .withActionsRequired("dvpjhulsuuvmk"))
                .withGroupIds(Arrays.asList("k", "wfndiodjpsl"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionInner.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.APPROVED,
            model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("utegjvwmfdats", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("dvpjhulsuuvmk", model.privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals("k", model.groupIds().get(0));
    }
}
