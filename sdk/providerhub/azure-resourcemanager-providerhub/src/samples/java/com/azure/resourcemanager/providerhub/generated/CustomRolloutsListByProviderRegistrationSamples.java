// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.generated;

/** Samples for CustomRollouts ListByProviderRegistration. */
public final class CustomRolloutsListByProviderRegistrationSamples {
    /*
     * x-ms-original-file: specification/providerhub/resource-manager/Microsoft.ProviderHub/stable/2020-11-20/examples/CustomRollouts_ListByProviderRegistration.json
     */
    /**
     * Sample code: CustomRollouts_ListByProviderRegistration.
     *
     * @param manager Entry point to ProviderHubManager.
     */
    public static void customRolloutsListByProviderRegistration(
        com.azure.resourcemanager.providerhub.ProviderHubManager manager) {
        manager.customRollouts().listByProviderRegistration("Microsoft.Contoso", com.azure.core.util.Context.NONE);
    }
}