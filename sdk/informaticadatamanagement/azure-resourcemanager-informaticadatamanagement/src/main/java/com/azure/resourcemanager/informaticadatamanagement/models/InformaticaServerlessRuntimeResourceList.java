// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.models;

import com.azure.resourcemanager.informaticadatamanagement.fluent.models.InformaticaServerlessRuntimeResourceListInner;
import java.util.List;

/**
 * An immutable client-side representation of InformaticaServerlessRuntimeResourceList.
 */
public interface InformaticaServerlessRuntimeResourceList {
    /**
     * Gets the informaticaRuntimeResources property: List of runtime resources for the fetch all API.
     * 
     * @return the informaticaRuntimeResources value.
     */
    List<InfaRuntimeResourceFetchMetadata> informaticaRuntimeResources();

    /**
     * Gets the inner
     * com.azure.resourcemanager.informaticadatamanagement.fluent.models.InformaticaServerlessRuntimeResourceListInner
     * object.
     * 
     * @return the inner object.
     */
    InformaticaServerlessRuntimeResourceListInner innerModel();
}
