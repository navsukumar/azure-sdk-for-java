// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

import com.azure.core.util.Context;

/** Samples for ReportOperation Delete. */
public final class ReportOperationDeleteSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/preview/2022-11-16-preview/examples/Report_Delete.json
     */
    /**
     * Sample code: Report_Delete.
     *
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void reportDelete(
        com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.reportOperations().delete("testReportName", Context.NONE);
    }
}