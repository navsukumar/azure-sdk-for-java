// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.implementation;

import com.azure.resourcemanager.servicefabricmanagedclusters.fluent.models.ManagedMaintenanceWindowStatusInner;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ManagedMaintenanceWindowStatus;
import java.time.OffsetDateTime;

public final class ManagedMaintenanceWindowStatusImpl implements ManagedMaintenanceWindowStatus {
    private ManagedMaintenanceWindowStatusInner innerObject;

    private final com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager serviceManager;

    ManagedMaintenanceWindowStatusImpl(ManagedMaintenanceWindowStatusInner innerObject,
        com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean isWindowEnabled() {
        return this.innerModel().isWindowEnabled();
    }

    public Boolean isRegionReady() {
        return this.innerModel().isRegionReady();
    }

    public Boolean isWindowActive() {
        return this.innerModel().isWindowActive();
    }

    public Boolean canApplyUpdates() {
        return this.innerModel().canApplyUpdates();
    }

    public OffsetDateTime lastWindowStatusUpdateAtUtc() {
        return this.innerModel().lastWindowStatusUpdateAtUtc();
    }

    public OffsetDateTime lastWindowStartTimeUtc() {
        return this.innerModel().lastWindowStartTimeUtc();
    }

    public OffsetDateTime lastWindowEndTimeUtc() {
        return this.innerModel().lastWindowEndTimeUtc();
    }

    public ManagedMaintenanceWindowStatusInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager manager() {
        return this.serviceManager;
    }
}
