// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.implementation;

import com.azure.resourcemanager.billingbenefits.fluent.models.SavingsPlanValidateResponseInner;
import com.azure.resourcemanager.billingbenefits.models.SavingsPlanValidResponseProperty;
import com.azure.resourcemanager.billingbenefits.models.SavingsPlanValidateResponse;
import java.util.Collections;
import java.util.List;

public final class SavingsPlanValidateResponseImpl implements SavingsPlanValidateResponse {
    private SavingsPlanValidateResponseInner innerObject;

    private final com.azure.resourcemanager.billingbenefits.BillingBenefitsManager serviceManager;

    SavingsPlanValidateResponseImpl(
        SavingsPlanValidateResponseInner innerObject,
        com.azure.resourcemanager.billingbenefits.BillingBenefitsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<SavingsPlanValidResponseProperty> benefits() {
        List<SavingsPlanValidResponseProperty> inner = this.innerModel().benefits();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public SavingsPlanValidateResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager() {
        return this.serviceManager;
    }
}