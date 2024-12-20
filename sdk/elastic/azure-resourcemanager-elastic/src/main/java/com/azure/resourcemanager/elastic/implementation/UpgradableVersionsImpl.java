// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.elastic.fluent.UpgradableVersionsClient;
import com.azure.resourcemanager.elastic.fluent.models.UpgradableVersionsListInner;
import com.azure.resourcemanager.elastic.models.UpgradableVersions;
import com.azure.resourcemanager.elastic.models.UpgradableVersionsList;

public final class UpgradableVersionsImpl implements UpgradableVersions {
    private static final ClientLogger LOGGER = new ClientLogger(UpgradableVersionsImpl.class);

    private final UpgradableVersionsClient innerClient;

    private final com.azure.resourcemanager.elastic.ElasticManager serviceManager;

    public UpgradableVersionsImpl(UpgradableVersionsClient innerClient,
        com.azure.resourcemanager.elastic.ElasticManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<UpgradableVersionsList> detailsWithResponse(String resourceGroupName, String monitorName,
        Context context) {
        Response<UpgradableVersionsListInner> inner
            = this.serviceClient().detailsWithResponse(resourceGroupName, monitorName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new UpgradableVersionsListImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public UpgradableVersionsList details(String resourceGroupName, String monitorName) {
        UpgradableVersionsListInner inner = this.serviceClient().details(resourceGroupName, monitorName);
        if (inner != null) {
            return new UpgradableVersionsListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private UpgradableVersionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.elastic.ElasticManager manager() {
        return this.serviceManager;
    }
}
