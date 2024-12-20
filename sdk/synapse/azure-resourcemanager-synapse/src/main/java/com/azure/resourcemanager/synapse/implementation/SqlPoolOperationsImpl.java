// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.SqlPoolOperationsClient;
import com.azure.resourcemanager.synapse.fluent.models.SqlPoolOperationInner;
import com.azure.resourcemanager.synapse.models.SqlPoolOperation;
import com.azure.resourcemanager.synapse.models.SqlPoolOperations;

public final class SqlPoolOperationsImpl implements SqlPoolOperations {
    private static final ClientLogger LOGGER = new ClientLogger(SqlPoolOperationsImpl.class);

    private final SqlPoolOperationsClient innerClient;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public SqlPoolOperationsImpl(SqlPoolOperationsClient innerClient,
        com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SqlPoolOperation> list(String resourceGroupName, String workspaceName, String sqlPoolName) {
        PagedIterable<SqlPoolOperationInner> inner
            = this.serviceClient().list(resourceGroupName, workspaceName, sqlPoolName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SqlPoolOperationImpl(inner1, this.manager()));
    }

    public PagedIterable<SqlPoolOperation> list(String resourceGroupName, String workspaceName, String sqlPoolName,
        Context context) {
        PagedIterable<SqlPoolOperationInner> inner
            = this.serviceClient().list(resourceGroupName, workspaceName, sqlPoolName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SqlPoolOperationImpl(inner1, this.manager()));
    }

    private SqlPoolOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}
