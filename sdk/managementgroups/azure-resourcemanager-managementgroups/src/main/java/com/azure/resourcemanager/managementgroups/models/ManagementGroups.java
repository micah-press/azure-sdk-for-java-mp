// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of ManagementGroups.
 */
public interface ManagementGroups {
    /**
     * List management groups for the authenticated user.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the result of the request to list management groups as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<ManagementGroupInfo> list();

    /**
     * List management groups for the authenticated user.
     * 
     * @param cacheControl Indicates whether the request should utilize any caches. Populate the header with 'no-cache'
     * value to bypass existing caches.
     * @param skiptoken Page continuation token is only used if a previous operation returned a partial result.
     * If a previous response contains a nextLink element, the value of the nextLink element will include a token
     * parameter that specifies a starting point to use for subsequent calls.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the result of the request to list management groups as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<ManagementGroupInfo> list(String cacheControl, String skiptoken, Context context);

    /**
     * Get the details of the management group.
     * 
     * @param groupId Management Group ID.
     * @param expand The $expand=children query string parameter allows clients to request inclusion of children in the
     * response payload. $expand=path includes the path from the root group to the current group. $expand=ancestors
     * includes the ancestor Ids of the current group.
     * @param recurse The $recurse=true query string parameter allows clients to request inclusion of entire hierarchy
     * in the response payload. Note that $expand=children must be passed up if $recurse is set to true.
     * @param filter A filter which allows the exclusion of subscriptions from results (i.e. '$filter=children.childType
     * ne Subscription').
     * @param cacheControl Indicates whether the request should utilize any caches. Populate the header with 'no-cache'
     * value to bypass existing caches.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the management group along with {@link Response}.
     */
    Response<ManagementGroup> getWithResponse(String groupId, ManagementGroupExpandType expand, Boolean recurse,
        String filter, String cacheControl, Context context);

    /**
     * Get the details of the management group.
     * 
     * @param groupId Management Group ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the management group.
     */
    ManagementGroup get(String groupId);

    /**
     * Create or update a management group.
     * If a management group is already created and a subsequent create request is issued with different properties, the
     * management group properties will be updated.
     * 
     * @param groupId Management Group ID.
     * @param createManagementGroupRequest Management group creation parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the management group details.
     */
    ManagementGroup createOrUpdate(String groupId, CreateManagementGroupRequest createManagementGroupRequest);

    /**
     * Create or update a management group.
     * If a management group is already created and a subsequent create request is issued with different properties, the
     * management group properties will be updated.
     * 
     * @param groupId Management Group ID.
     * @param createManagementGroupRequest Management group creation parameters.
     * @param cacheControl Indicates whether the request should utilize any caches. Populate the header with 'no-cache'
     * value to bypass existing caches.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the management group details.
     */
    ManagementGroup createOrUpdate(String groupId, CreateManagementGroupRequest createManagementGroupRequest,
        String cacheControl, Context context);

    /**
     * Update a management group.
     * 
     * @param groupId Management Group ID.
     * @param patchGroupRequest Management group patch parameters.
     * @param cacheControl Indicates whether the request should utilize any caches. Populate the header with 'no-cache'
     * value to bypass existing caches.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the management group details along with {@link Response}.
     */
    Response<ManagementGroup> updateWithResponse(String groupId, PatchManagementGroupRequest patchGroupRequest,
        String cacheControl, Context context);

    /**
     * Update a management group.
     * 
     * @param groupId Management Group ID.
     * @param patchGroupRequest Management group patch parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the management group details.
     */
    ManagementGroup update(String groupId, PatchManagementGroupRequest patchGroupRequest);

    /**
     * Delete management group.
     * If a management group contains child resources, the request will fail.
     * 
     * @param groupId Management Group ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the results of Azure-AsyncOperation.
     */
    AzureAsyncOperationResults deleteByResourceGroup(String groupId);

    /**
     * Delete management group.
     * If a management group contains child resources, the request will fail.
     * 
     * @param groupId Management Group ID.
     * @param cacheControl Indicates whether the request should utilize any caches. Populate the header with 'no-cache'
     * value to bypass existing caches.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the results of Azure-AsyncOperation.
     */
    AzureAsyncOperationResults delete(String groupId, String cacheControl, Context context);

    /**
     * List all entities that descend from a management group.
     * 
     * @param groupId Management Group ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the result of the request to view descendants as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DescendantInfo> getDescendants(String groupId);

    /**
     * List all entities that descend from a management group.
     * 
     * @param groupId Management Group ID.
     * @param skiptoken Page continuation token is only used if a previous operation returned a partial result.
     * If a previous response contains a nextLink element, the value of the nextLink element will include a token
     * parameter that specifies a starting point to use for subsequent calls.
     * @param top Number of elements to return when retrieving results. Passing this in will override $skipToken.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the result of the request to view descendants as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DescendantInfo> getDescendants(String groupId, String skiptoken, Integer top, Context context);
}
