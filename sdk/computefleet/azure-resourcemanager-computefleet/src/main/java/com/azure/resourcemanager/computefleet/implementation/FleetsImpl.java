// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computefleet.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.computefleet.fluent.FleetsClient;
import com.azure.resourcemanager.computefleet.fluent.models.FleetInner;
import com.azure.resourcemanager.computefleet.fluent.models.VirtualMachineScaleSetInner;
import com.azure.resourcemanager.computefleet.models.Fleet;
import com.azure.resourcemanager.computefleet.models.Fleets;
import com.azure.resourcemanager.computefleet.models.VirtualMachineScaleSet;

public final class FleetsImpl implements Fleets {
    private static final ClientLogger LOGGER = new ClientLogger(FleetsImpl.class);

    private final FleetsClient innerClient;

    private final com.azure.resourcemanager.computefleet.ComputeFleetManager serviceManager;

    public FleetsImpl(FleetsClient innerClient,
        com.azure.resourcemanager.computefleet.ComputeFleetManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<Fleet> getByResourceGroupWithResponse(String resourceGroupName, String fleetName, Context context) {
        Response<FleetInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, fleetName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new FleetImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Fleet getByResourceGroup(String resourceGroupName, String fleetName) {
        FleetInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, fleetName);
        if (inner != null) {
            return new FleetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String fleetName) {
        this.serviceClient().delete(resourceGroupName, fleetName);
    }

    public void delete(String resourceGroupName, String fleetName, Context context) {
        this.serviceClient().delete(resourceGroupName, fleetName, context);
    }

    public PagedIterable<Fleet> listByResourceGroup(String resourceGroupName) {
        PagedIterable<FleetInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new FleetImpl(inner1, this.manager()));
    }

    public PagedIterable<Fleet> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<FleetInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new FleetImpl(inner1, this.manager()));
    }

    public PagedIterable<Fleet> list() {
        PagedIterable<FleetInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new FleetImpl(inner1, this.manager()));
    }

    public PagedIterable<Fleet> list(Context context) {
        PagedIterable<FleetInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new FleetImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachineScaleSet> listVirtualMachineScaleSets(String resourceGroupName, String name) {
        PagedIterable<VirtualMachineScaleSetInner> inner
            = this.serviceClient().listVirtualMachineScaleSets(resourceGroupName, name);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VirtualMachineScaleSetImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachineScaleSet> listVirtualMachineScaleSets(String resourceGroupName, String name,
        Context context) {
        PagedIterable<VirtualMachineScaleSetInner> inner
            = this.serviceClient().listVirtualMachineScaleSets(resourceGroupName, name, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VirtualMachineScaleSetImpl(inner1, this.manager()));
    }

    public Fleet getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String fleetName = ResourceManagerUtils.getValueFromIdByName(id, "fleets");
        if (fleetName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'fleets'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, fleetName, Context.NONE).getValue();
    }

    public Response<Fleet> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String fleetName = ResourceManagerUtils.getValueFromIdByName(id, "fleets");
        if (fleetName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'fleets'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, fleetName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String fleetName = ResourceManagerUtils.getValueFromIdByName(id, "fleets");
        if (fleetName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'fleets'.", id)));
        }
        this.delete(resourceGroupName, fleetName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String fleetName = ResourceManagerUtils.getValueFromIdByName(id, "fleets");
        if (fleetName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'fleets'.", id)));
        }
        this.delete(resourceGroupName, fleetName, context);
    }

    private FleetsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.computefleet.ComputeFleetManager manager() {
        return this.serviceManager;
    }

    public FleetImpl define(String name) {
        return new FleetImpl(name, this.manager());
    }
}
