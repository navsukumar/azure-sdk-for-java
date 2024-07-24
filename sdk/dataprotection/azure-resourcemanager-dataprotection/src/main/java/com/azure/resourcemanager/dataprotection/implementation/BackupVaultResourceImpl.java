// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.dataprotection.fluent.models.BackupVaultResourceInner;
import com.azure.resourcemanager.dataprotection.models.BackupVault;
import com.azure.resourcemanager.dataprotection.models.BackupVaultResource;
import com.azure.resourcemanager.dataprotection.models.DppIdentityDetails;
import com.azure.resourcemanager.dataprotection.models.PatchBackupVaultInput;
import com.azure.resourcemanager.dataprotection.models.PatchResourceRequestInput;
import java.util.Collections;
import java.util.Map;

public final class BackupVaultResourceImpl
    implements BackupVaultResource, BackupVaultResource.Definition, BackupVaultResource.Update {
    private BackupVaultResourceInner innerObject;

    private final com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public DppIdentityDetails identity() {
        return this.innerModel().identity();
    }

    public BackupVault properties() {
        return this.innerModel().properties();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public BackupVaultResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.dataprotection.DataProtectionManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String vaultName;

    private PatchResourceRequestInput updateParameters;

    public BackupVaultResourceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public BackupVaultResource create() {
        this.innerObject = serviceManager.serviceClient()
            .getBackupVaults()
            .createOrUpdate(resourceGroupName, vaultName, this.innerModel(), Context.NONE);
        return this;
    }

    public BackupVaultResource create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getBackupVaults()
            .createOrUpdate(resourceGroupName, vaultName, this.innerModel(), context);
        return this;
    }

    BackupVaultResourceImpl(String name,
        com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager) {
        this.innerObject = new BackupVaultResourceInner();
        this.serviceManager = serviceManager;
        this.vaultName = name;
    }

    public BackupVaultResourceImpl update() {
        this.updateParameters = new PatchResourceRequestInput();
        return this;
    }

    public BackupVaultResource apply() {
        this.innerObject = serviceManager.serviceClient()
            .getBackupVaults()
            .update(resourceGroupName, vaultName, updateParameters, Context.NONE);
        return this;
    }

    public BackupVaultResource apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getBackupVaults()
            .update(resourceGroupName, vaultName, updateParameters, context);
        return this;
    }

    BackupVaultResourceImpl(BackupVaultResourceInner innerObject,
        com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.vaultName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "backupVaults");
    }

    public BackupVaultResource refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getBackupVaults()
            .getByResourceGroupWithResponse(resourceGroupName, vaultName, Context.NONE)
            .getValue();
        return this;
    }

    public BackupVaultResource refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getBackupVaults()
            .getByResourceGroupWithResponse(resourceGroupName, vaultName, context)
            .getValue();
        return this;
    }

    public BackupVaultResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public BackupVaultResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public BackupVaultResourceImpl withProperties(BackupVault properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public BackupVaultResourceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public BackupVaultResourceImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }

    public BackupVaultResourceImpl withIdentity(DppIdentityDetails identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateParameters.withIdentity(identity);
            return this;
        }
    }

    public BackupVaultResourceImpl withProperties(PatchBackupVaultInput properties) {
        this.updateParameters.withProperties(properties);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
