// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/**
 * The interface for ServiceFabricManagedClustersMgmtClient class.
 */
public interface ServiceFabricManagedClustersMgmtClient {
    /**
     * Gets The customer subscription identifier.
     * 
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     * 
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     * 
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     * 
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the ApplicationTypesClient object to access its operations.
     * 
     * @return the ApplicationTypesClient object.
     */
    ApplicationTypesClient getApplicationTypes();

    /**
     * Gets the ApplicationTypeVersionsClient object to access its operations.
     * 
     * @return the ApplicationTypeVersionsClient object.
     */
    ApplicationTypeVersionsClient getApplicationTypeVersions();

    /**
     * Gets the ApplicationsClient object to access its operations.
     * 
     * @return the ApplicationsClient object.
     */
    ApplicationsClient getApplications();

    /**
     * Gets the ServicesClient object to access its operations.
     * 
     * @return the ServicesClient object.
     */
    ServicesClient getServices();

    /**
     * Gets the ManagedClustersClient object to access its operations.
     * 
     * @return the ManagedClustersClient object.
     */
    ManagedClustersClient getManagedClusters();

    /**
     * Gets the ManagedAzResiliencyStatusesClient object to access its operations.
     * 
     * @return the ManagedAzResiliencyStatusesClient object.
     */
    ManagedAzResiliencyStatusesClient getManagedAzResiliencyStatuses();

    /**
     * Gets the ManagedMaintenanceWindowStatusesClient object to access its operations.
     * 
     * @return the ManagedMaintenanceWindowStatusesClient object.
     */
    ManagedMaintenanceWindowStatusesClient getManagedMaintenanceWindowStatuses();

    /**
     * Gets the ManagedApplyMaintenanceWindowsClient object to access its operations.
     * 
     * @return the ManagedApplyMaintenanceWindowsClient object.
     */
    ManagedApplyMaintenanceWindowsClient getManagedApplyMaintenanceWindows();

    /**
     * Gets the ManagedClusterVersionsClient object to access its operations.
     * 
     * @return the ManagedClusterVersionsClient object.
     */
    ManagedClusterVersionsClient getManagedClusterVersions();

    /**
     * Gets the ManagedUnsupportedVMSizesClient object to access its operations.
     * 
     * @return the ManagedUnsupportedVMSizesClient object.
     */
    ManagedUnsupportedVMSizesClient getManagedUnsupportedVMSizes();

    /**
     * Gets the OperationStatusClient object to access its operations.
     * 
     * @return the OperationStatusClient object.
     */
    OperationStatusClient getOperationStatus();

    /**
     * Gets the OperationResultsClient object to access its operations.
     * 
     * @return the OperationResultsClient object.
     */
    OperationResultsClient getOperationResults();

    /**
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the NodeTypesClient object to access its operations.
     * 
     * @return the NodeTypesClient object.
     */
    NodeTypesClient getNodeTypes();

    /**
     * Gets the NodeTypeSkusClient object to access its operations.
     * 
     * @return the NodeTypeSkusClient object.
     */
    NodeTypeSkusClient getNodeTypeSkus();
}
