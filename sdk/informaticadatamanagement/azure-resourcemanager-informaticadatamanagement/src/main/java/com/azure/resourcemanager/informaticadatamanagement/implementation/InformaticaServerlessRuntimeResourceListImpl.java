// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.implementation;

import com.azure.resourcemanager.informaticadatamanagement.fluent.models.InformaticaServerlessRuntimeResourceListInner;
import com.azure.resourcemanager.informaticadatamanagement.models.InfaRuntimeResourceFetchMetadata;
import com.azure.resourcemanager.informaticadatamanagement.models.InformaticaServerlessRuntimeResourceList;
import java.util.Collections;
import java.util.List;

public final class InformaticaServerlessRuntimeResourceListImpl implements InformaticaServerlessRuntimeResourceList {
    private InformaticaServerlessRuntimeResourceListInner innerObject;

    private final com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager serviceManager;

    InformaticaServerlessRuntimeResourceListImpl(InformaticaServerlessRuntimeResourceListInner innerObject,
        com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<InfaRuntimeResourceFetchMetadata> informaticaRuntimeResources() {
        List<InfaRuntimeResourceFetchMetadata> inner = this.innerModel().informaticaRuntimeResources();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public InformaticaServerlessRuntimeResourceListInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager() {
        return this.serviceManager;
    }
}
