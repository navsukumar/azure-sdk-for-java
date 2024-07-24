// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dataprotection.fluent.BackupPoliciesClient;
import com.azure.resourcemanager.dataprotection.fluent.models.BaseBackupPolicyResourceInner;
import com.azure.resourcemanager.dataprotection.models.BackupPolicies;
import com.azure.resourcemanager.dataprotection.models.BaseBackupPolicyResource;

public final class BackupPoliciesImpl implements BackupPolicies {
    private static final ClientLogger LOGGER = new ClientLogger(BackupPoliciesImpl.class);

    private final BackupPoliciesClient innerClient;

    private final com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager;

    public BackupPoliciesImpl(BackupPoliciesClient innerClient,
        com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<BaseBackupPolicyResource> list(String resourceGroupName, String vaultName) {
        PagedIterable<BaseBackupPolicyResourceInner> inner = this.serviceClient().list(resourceGroupName, vaultName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new BaseBackupPolicyResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<BaseBackupPolicyResource> list(String resourceGroupName, String vaultName, Context context) {
        PagedIterable<BaseBackupPolicyResourceInner> inner
            = this.serviceClient().list(resourceGroupName, vaultName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new BaseBackupPolicyResourceImpl(inner1, this.manager()));
    }

    public Response<BaseBackupPolicyResource> getWithResponse(String resourceGroupName, String vaultName,
        String backupPolicyName, Context context) {
        Response<BaseBackupPolicyResourceInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, vaultName, backupPolicyName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new BaseBackupPolicyResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BaseBackupPolicyResource get(String resourceGroupName, String vaultName, String backupPolicyName) {
        BaseBackupPolicyResourceInner inner = this.serviceClient().get(resourceGroupName, vaultName, backupPolicyName);
        if (inner != null) {
            return new BaseBackupPolicyResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String vaultName, String backupPolicyName,
        Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, vaultName, backupPolicyName, context);
    }

    public void delete(String resourceGroupName, String vaultName, String backupPolicyName) {
        this.serviceClient().delete(resourceGroupName, vaultName, backupPolicyName);
    }

    public BaseBackupPolicyResource getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vaultName = ResourceManagerUtils.getValueFromIdByName(id, "backupVaults");
        if (vaultName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'backupVaults'.", id)));
        }
        String backupPolicyName = ResourceManagerUtils.getValueFromIdByName(id, "backupPolicies");
        if (backupPolicyName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'backupPolicies'.", id)));
        }
        return this.getWithResponse(resourceGroupName, vaultName, backupPolicyName, Context.NONE).getValue();
    }

    public Response<BaseBackupPolicyResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vaultName = ResourceManagerUtils.getValueFromIdByName(id, "backupVaults");
        if (vaultName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'backupVaults'.", id)));
        }
        String backupPolicyName = ResourceManagerUtils.getValueFromIdByName(id, "backupPolicies");
        if (backupPolicyName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'backupPolicies'.", id)));
        }
        return this.getWithResponse(resourceGroupName, vaultName, backupPolicyName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vaultName = ResourceManagerUtils.getValueFromIdByName(id, "backupVaults");
        if (vaultName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'backupVaults'.", id)));
        }
        String backupPolicyName = ResourceManagerUtils.getValueFromIdByName(id, "backupPolicies");
        if (backupPolicyName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'backupPolicies'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, vaultName, backupPolicyName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vaultName = ResourceManagerUtils.getValueFromIdByName(id, "backupVaults");
        if (vaultName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'backupVaults'.", id)));
        }
        String backupPolicyName = ResourceManagerUtils.getValueFromIdByName(id, "backupPolicies");
        if (backupPolicyName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'backupPolicies'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, vaultName, backupPolicyName, context);
    }

    private BackupPoliciesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.dataprotection.DataProtectionManager manager() {
        return this.serviceManager;
    }

    public BaseBackupPolicyResourceImpl define(String name) {
        return new BaseBackupPolicyResourceImpl(name, this.manager());
    }
}
