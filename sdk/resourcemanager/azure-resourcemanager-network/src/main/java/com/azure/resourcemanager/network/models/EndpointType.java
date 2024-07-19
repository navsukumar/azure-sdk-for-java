// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The endpoint type.
 */
public final class EndpointType extends ExpandableStringEnum<EndpointType> {
    /**
     * Static value AzureVM for EndpointType.
     */
    public static final EndpointType AZURE_VM = fromString("AzureVM");

    /**
     * Static value AzureVNet for EndpointType.
     */
    public static final EndpointType AZURE_VNET = fromString("AzureVNet");

    /**
     * Static value AzureSubnet for EndpointType.
     */
    public static final EndpointType AZURE_SUBNET = fromString("AzureSubnet");

    /**
     * Static value ExternalAddress for EndpointType.
     */
    public static final EndpointType EXTERNAL_ADDRESS = fromString("ExternalAddress");

    /**
     * Static value MMAWorkspaceMachine for EndpointType.
     */
    public static final EndpointType MMAWORKSPACE_MACHINE = fromString("MMAWorkspaceMachine");

    /**
     * Static value MMAWorkspaceNetwork for EndpointType.
     */
    public static final EndpointType MMAWORKSPACE_NETWORK = fromString("MMAWorkspaceNetwork");

    /**
     * Static value AzureArcVM for EndpointType.
     */
    public static final EndpointType AZURE_ARC_VM = fromString("AzureArcVM");

    /**
     * Static value AzureVMSS for EndpointType.
     */
    public static final EndpointType AZURE_VMSS = fromString("AzureVMSS");

    /**
     * Static value AzureArcNetwork for EndpointType.
     */
    public static final EndpointType AZURE_ARC_NETWORK = fromString("AzureArcNetwork");

    /**
     * Creates a new instance of EndpointType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EndpointType() {
    }

    /**
     * Creates or finds a EndpointType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding EndpointType.
     */
    @JsonCreator
    public static EndpointType fromString(String name) {
        return fromString(name, EndpointType.class);
    }

    /**
     * Gets known EndpointType values.
     * 
     * @return known EndpointType values.
     */
    public static Collection<EndpointType> values() {
        return values(EndpointType.class);
    }
}
