// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicefabricmanagedclusters.fluent.ManagedAzResiliencyStatusesClient;
import com.azure.resourcemanager.servicefabricmanagedclusters.fluent.models.ManagedAzResiliencyStatusInner;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ManagedAzResiliencyStatus;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ManagedAzResiliencyStatuses;

public final class ManagedAzResiliencyStatusesImpl implements ManagedAzResiliencyStatuses {
    private static final ClientLogger LOGGER = new ClientLogger(ManagedAzResiliencyStatusesImpl.class);

    private final ManagedAzResiliencyStatusesClient innerClient;

    private final com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager serviceManager;

    public ManagedAzResiliencyStatusesImpl(ManagedAzResiliencyStatusesClient innerClient,
        com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ManagedAzResiliencyStatus> getWithResponse(String resourceGroupName, String clusterName,
        Context context) {
        Response<ManagedAzResiliencyStatusInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, clusterName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ManagedAzResiliencyStatusImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ManagedAzResiliencyStatus get(String resourceGroupName, String clusterName) {
        ManagedAzResiliencyStatusInner inner = this.serviceClient().get(resourceGroupName, clusterName);
        if (inner != null) {
            return new ManagedAzResiliencyStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ManagedAzResiliencyStatusesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager manager() {
        return this.serviceManager;
    }
}
