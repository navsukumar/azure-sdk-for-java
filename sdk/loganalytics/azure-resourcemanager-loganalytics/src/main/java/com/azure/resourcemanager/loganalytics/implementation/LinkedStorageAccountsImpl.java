// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.loganalytics.fluent.LinkedStorageAccountsClient;
import com.azure.resourcemanager.loganalytics.fluent.models.LinkedStorageAccountsResourceInner;
import com.azure.resourcemanager.loganalytics.models.DataSourceType;
import com.azure.resourcemanager.loganalytics.models.LinkedStorageAccounts;
import com.azure.resourcemanager.loganalytics.models.LinkedStorageAccountsResource;

public final class LinkedStorageAccountsImpl implements LinkedStorageAccounts {
    private static final ClientLogger LOGGER = new ClientLogger(LinkedStorageAccountsImpl.class);

    private final LinkedStorageAccountsClient innerClient;

    private final com.azure.resourcemanager.loganalytics.LogAnalyticsManager serviceManager;

    public LinkedStorageAccountsImpl(
        LinkedStorageAccountsClient innerClient,
        com.azure.resourcemanager.loganalytics.LogAnalyticsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String workspaceName, DataSourceType dataSourceType) {
        this.serviceClient().delete(resourceGroupName, workspaceName, dataSourceType);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String workspaceName, DataSourceType dataSourceType, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, workspaceName, dataSourceType, context);
    }

    public LinkedStorageAccountsResource get(
        String resourceGroupName, String workspaceName, DataSourceType dataSourceType) {
        LinkedStorageAccountsResourceInner inner =
            this.serviceClient().get(resourceGroupName, workspaceName, dataSourceType);
        if (inner != null) {
            return new LinkedStorageAccountsResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<LinkedStorageAccountsResource> getWithResponse(
        String resourceGroupName, String workspaceName, DataSourceType dataSourceType, Context context) {
        Response<LinkedStorageAccountsResourceInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, workspaceName, dataSourceType, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LinkedStorageAccountsResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<LinkedStorageAccountsResource> listByWorkspace(
        String resourceGroupName, String workspaceName) {
        PagedIterable<LinkedStorageAccountsResourceInner> inner =
            this.serviceClient().listByWorkspace(resourceGroupName, workspaceName);
        return Utils.mapPage(inner, inner1 -> new LinkedStorageAccountsResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<LinkedStorageAccountsResource> listByWorkspace(
        String resourceGroupName, String workspaceName, Context context) {
        PagedIterable<LinkedStorageAccountsResourceInner> inner =
            this.serviceClient().listByWorkspace(resourceGroupName, workspaceName, context);
        return Utils.mapPage(inner, inner1 -> new LinkedStorageAccountsResourceImpl(inner1, this.manager()));
    }

    public LinkedStorageAccountsResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        DataSourceType dataSourceType =
            DataSourceType.fromString(Utils.getValueFromIdByName(id, "linkedStorageAccounts"));
        if (dataSourceType == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'linkedStorageAccounts'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, dataSourceType, Context.NONE).getValue();
    }

    public Response<LinkedStorageAccountsResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        DataSourceType dataSourceType =
            DataSourceType.fromString(Utils.getValueFromIdByName(id, "linkedStorageAccounts"));
        if (dataSourceType == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'linkedStorageAccounts'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, dataSourceType, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        DataSourceType dataSourceType =
            DataSourceType.fromString(Utils.getValueFromIdByName(id, "linkedStorageAccounts"));
        if (dataSourceType == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'linkedStorageAccounts'.",
                                id)));
        }
        this.deleteWithResponse(resourceGroupName, workspaceName, dataSourceType, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        DataSourceType dataSourceType =
            DataSourceType.fromString(Utils.getValueFromIdByName(id, "linkedStorageAccounts"));
        if (dataSourceType == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'linkedStorageAccounts'.",
                                id)));
        }
        return this.deleteWithResponse(resourceGroupName, workspaceName, dataSourceType, context);
    }

    private LinkedStorageAccountsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.loganalytics.LogAnalyticsManager manager() {
        return this.serviceManager;
    }

    public LinkedStorageAccountsResourceImpl define(DataSourceType name) {
        return new LinkedStorageAccountsResourceImpl(name, this.manager());
    }
}
