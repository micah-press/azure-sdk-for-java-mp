// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.implementation;

import com.azure.resourcemanager.iothub.fluent.models.EndpointHealthDataInner;
import com.azure.resourcemanager.iothub.models.EndpointHealthData;
import com.azure.resourcemanager.iothub.models.EndpointHealthStatus;
import java.time.OffsetDateTime;

public final class EndpointHealthDataImpl implements EndpointHealthData {
    private EndpointHealthDataInner innerObject;

    private final com.azure.resourcemanager.iothub.IotHubManager serviceManager;

    EndpointHealthDataImpl(EndpointHealthDataInner innerObject,
        com.azure.resourcemanager.iothub.IotHubManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String endpointId() {
        return this.innerModel().endpointId();
    }

    public EndpointHealthStatus healthStatus() {
        return this.innerModel().healthStatus();
    }

    public String lastKnownError() {
        return this.innerModel().lastKnownError();
    }

    public OffsetDateTime lastKnownErrorTime() {
        return this.innerModel().lastKnownErrorTime();
    }

    public OffsetDateTime lastSuccessfulSendAttemptTime() {
        return this.innerModel().lastSuccessfulSendAttemptTime();
    }

    public OffsetDateTime lastSendAttemptTime() {
        return this.innerModel().lastSendAttemptTime();
    }

    public EndpointHealthDataInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.iothub.IotHubManager manager() {
        return this.serviceManager;
    }
}
