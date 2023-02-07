// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.msi.generated;

import com.azure.resourcemanager.msi.fluent.models.FederatedIdentityCredentialInner;
import java.util.Arrays;

/** Samples for FederatedIdentityCredentials CreateOrUpdate. */
public final class FederatedIdentityCredentialsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/msi/resource-manager/Microsoft.ManagedIdentity/stable/2023-01-31/examples/FederatedIdentityCredentialCreate.json
     */
    /**
     * Sample code: FederatedIdentityCredentialCreate.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void federatedIdentityCredentialCreate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .identities()
            .manager()
            .serviceClient()
            .getFederatedIdentityCredentials()
            .createOrUpdateWithResponse(
                "rgName",
                "resourceName",
                "ficResourceName",
                new FederatedIdentityCredentialInner()
                    .withIssuer("https://oidc.prod-aks.azure.com/TenantGUID/IssuerGUID")
                    .withSubject("system:serviceaccount:ns:svcaccount")
                    .withAudiences(Arrays.asList("api://AzureADTokenExchange")),
                com.azure.core.util.Context.NONE);
    }
}