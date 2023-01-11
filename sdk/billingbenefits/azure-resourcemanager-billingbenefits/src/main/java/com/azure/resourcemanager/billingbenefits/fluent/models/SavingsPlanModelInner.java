// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeProperties;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeType;
import com.azure.resourcemanager.billingbenefits.models.BillingPlan;
import com.azure.resourcemanager.billingbenefits.models.Commitment;
import com.azure.resourcemanager.billingbenefits.models.ExtendedStatusInfo;
import com.azure.resourcemanager.billingbenefits.models.ProvisioningState;
import com.azure.resourcemanager.billingbenefits.models.RenewProperties;
import com.azure.resourcemanager.billingbenefits.models.Sku;
import com.azure.resourcemanager.billingbenefits.models.Term;
import com.azure.resourcemanager.billingbenefits.models.Utilization;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Savings plan. */
@Fluent
public final class SavingsPlanModelInner extends ProxyResource {
    /*
     * Savings plan SKU
     */
    @JsonProperty(value = "sku", required = true)
    private Sku sku;

    /*
     * Savings plan properties
     */
    @JsonProperty(value = "properties")
    private SavingsPlanModelProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of SavingsPlanModelInner class. */
    public SavingsPlanModelInner() {
    }

    /**
     * Get the sku property: Savings plan SKU.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Savings plan SKU.
     *
     * @param sku the sku value to set.
     * @return the SavingsPlanModelInner object itself.
     */
    public SavingsPlanModelInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the innerProperties property: Savings plan properties.
     *
     * @return the innerProperties value.
     */
    private SavingsPlanModelProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the displayName property: Display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: Display name.
     *
     * @param displayName the displayName value to set.
     * @return the SavingsPlanModelInner object itself.
     */
    public SavingsPlanModelInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SavingsPlanModelProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the displayProvisioningState property: The provisioning state of the savings plan for display, e.g.
     * Succeeded.
     *
     * @return the displayProvisioningState value.
     */
    public String displayProvisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().displayProvisioningState();
    }

    /**
     * Get the billingScopeId property: Subscription that will be charged for purchasing the benefit.
     *
     * @return the billingScopeId value.
     */
    public String billingScopeId() {
        return this.innerProperties() == null ? null : this.innerProperties().billingScopeId();
    }

    /**
     * Set the billingScopeId property: Subscription that will be charged for purchasing the benefit.
     *
     * @param billingScopeId the billingScopeId value to set.
     * @return the SavingsPlanModelInner object itself.
     */
    public SavingsPlanModelInner withBillingScopeId(String billingScopeId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SavingsPlanModelProperties();
        }
        this.innerProperties().withBillingScopeId(billingScopeId);
        return this;
    }

    /**
     * Get the billingProfileId property: Fully-qualified identifier of the billing profile where the savings plan is
     * applied. Present only for Field-led or Customer-led customers.
     *
     * @return the billingProfileId value.
     */
    public String billingProfileId() {
        return this.innerProperties() == null ? null : this.innerProperties().billingProfileId();
    }

    /**
     * Get the customerId property: Fully-qualified identifier of the customer where the savings plan is applied.
     * Present only for Partner-led customers.
     *
     * @return the customerId value.
     */
    public String customerId() {
        return this.innerProperties() == null ? null : this.innerProperties().customerId();
    }

    /**
     * Get the billingAccountId property: Fully-qualified identifier of the billing account where the savings plan is
     * applied. Present only for Enterprise Agreement customers.
     *
     * @return the billingAccountId value.
     */
    public String billingAccountId() {
        return this.innerProperties() == null ? null : this.innerProperties().billingAccountId();
    }

    /**
     * Get the term property: Represent benefit term in ISO 8601 format.
     *
     * @return the term value.
     */
    public Term term() {
        return this.innerProperties() == null ? null : this.innerProperties().term();
    }

    /**
     * Set the term property: Represent benefit term in ISO 8601 format.
     *
     * @param term the term value to set.
     * @return the SavingsPlanModelInner object itself.
     */
    public SavingsPlanModelInner withTerm(Term term) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SavingsPlanModelProperties();
        }
        this.innerProperties().withTerm(term);
        return this;
    }

    /**
     * Get the billingPlan property: Represents the billing plan in ISO 8601 format. Required only for monthly billing
     * plans.
     *
     * @return the billingPlan value.
     */
    public BillingPlan billingPlan() {
        return this.innerProperties() == null ? null : this.innerProperties().billingPlan();
    }

    /**
     * Set the billingPlan property: Represents the billing plan in ISO 8601 format. Required only for monthly billing
     * plans.
     *
     * @param billingPlan the billingPlan value to set.
     * @return the SavingsPlanModelInner object itself.
     */
    public SavingsPlanModelInner withBillingPlan(BillingPlan billingPlan) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SavingsPlanModelProperties();
        }
        this.innerProperties().withBillingPlan(billingPlan);
        return this;
    }

    /**
     * Get the appliedScopeType property: Type of the Applied Scope.
     *
     * @return the appliedScopeType value.
     */
    public AppliedScopeType appliedScopeType() {
        return this.innerProperties() == null ? null : this.innerProperties().appliedScopeType();
    }

    /**
     * Set the appliedScopeType property: Type of the Applied Scope.
     *
     * @param appliedScopeType the appliedScopeType value to set.
     * @return the SavingsPlanModelInner object itself.
     */
    public SavingsPlanModelInner withAppliedScopeType(AppliedScopeType appliedScopeType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SavingsPlanModelProperties();
        }
        this.innerProperties().withAppliedScopeType(appliedScopeType);
        return this;
    }

    /**
     * Get the userFriendlyAppliedScopeType property: The applied scope type of the savings plan for display, e.g.
     * Shared.
     *
     * @return the userFriendlyAppliedScopeType value.
     */
    public String userFriendlyAppliedScopeType() {
        return this.innerProperties() == null ? null : this.innerProperties().userFriendlyAppliedScopeType();
    }

    /**
     * Get the appliedScopeProperties property: Properties specific to applied scope type. Not required if not
     * applicable.
     *
     * @return the appliedScopeProperties value.
     */
    public AppliedScopeProperties appliedScopeProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().appliedScopeProperties();
    }

    /**
     * Set the appliedScopeProperties property: Properties specific to applied scope type. Not required if not
     * applicable.
     *
     * @param appliedScopeProperties the appliedScopeProperties value to set.
     * @return the SavingsPlanModelInner object itself.
     */
    public SavingsPlanModelInner withAppliedScopeProperties(AppliedScopeProperties appliedScopeProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SavingsPlanModelProperties();
        }
        this.innerProperties().withAppliedScopeProperties(appliedScopeProperties);
        return this;
    }

    /**
     * Get the commitment property: Commitment towards the benefit.
     *
     * @return the commitment value.
     */
    public Commitment commitment() {
        return this.innerProperties() == null ? null : this.innerProperties().commitment();
    }

    /**
     * Set the commitment property: Commitment towards the benefit.
     *
     * @param commitment the commitment value to set.
     * @return the SavingsPlanModelInner object itself.
     */
    public SavingsPlanModelInner withCommitment(Commitment commitment) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SavingsPlanModelProperties();
        }
        this.innerProperties().withCommitment(commitment);
        return this;
    }

    /**
     * Get the effectiveDateTime property: DateTime of the savings plan starts providing benefit from.
     *
     * @return the effectiveDateTime value.
     */
    public OffsetDateTime effectiveDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().effectiveDateTime();
    }

    /**
     * Get the expiryDateTime property: Expiry date time.
     *
     * @return the expiryDateTime value.
     */
    public OffsetDateTime expiryDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().expiryDateTime();
    }

    /**
     * Get the purchaseDateTime property: Date time when the savings plan was purchased.
     *
     * @return the purchaseDateTime value.
     */
    public OffsetDateTime purchaseDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().purchaseDateTime();
    }

    /**
     * Get the benefitStartTime property: This is the DateTime when the savings plan benefit started.
     *
     * @return the benefitStartTime value.
     */
    public OffsetDateTime benefitStartTime() {
        return this.innerProperties() == null ? null : this.innerProperties().benefitStartTime();
    }

    /**
     * Set the benefitStartTime property: This is the DateTime when the savings plan benefit started.
     *
     * @param benefitStartTime the benefitStartTime value to set.
     * @return the SavingsPlanModelInner object itself.
     */
    public SavingsPlanModelInner withBenefitStartTime(OffsetDateTime benefitStartTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SavingsPlanModelProperties();
        }
        this.innerProperties().withBenefitStartTime(benefitStartTime);
        return this;
    }

    /**
     * Get the extendedStatusInfo property: The extendedStatusInfo property.
     *
     * @return the extendedStatusInfo value.
     */
    public ExtendedStatusInfo extendedStatusInfo() {
        return this.innerProperties() == null ? null : this.innerProperties().extendedStatusInfo();
    }

    /**
     * Get the renew property: Setting this to true will automatically purchase a new benefit on the expiration date
     * time.
     *
     * @return the renew value.
     */
    public Boolean renew() {
        return this.innerProperties() == null ? null : this.innerProperties().renew();
    }

    /**
     * Set the renew property: Setting this to true will automatically purchase a new benefit on the expiration date
     * time.
     *
     * @param renew the renew value to set.
     * @return the SavingsPlanModelInner object itself.
     */
    public SavingsPlanModelInner withRenew(Boolean renew) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SavingsPlanModelProperties();
        }
        this.innerProperties().withRenew(renew);
        return this;
    }

    /**
     * Get the utilization property: Savings plan utilization.
     *
     * @return the utilization value.
     */
    public Utilization utilization() {
        return this.innerProperties() == null ? null : this.innerProperties().utilization();
    }

    /**
     * Get the renewSource property: SavingsPlan Id of the SavingsPlan from which this SavingsPlan is renewed.
     *
     * @return the renewSource value.
     */
    public String renewSource() {
        return this.innerProperties() == null ? null : this.innerProperties().renewSource();
    }

    /**
     * Set the renewSource property: SavingsPlan Id of the SavingsPlan from which this SavingsPlan is renewed.
     *
     * @param renewSource the renewSource value to set.
     * @return the SavingsPlanModelInner object itself.
     */
    public SavingsPlanModelInner withRenewSource(String renewSource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SavingsPlanModelProperties();
        }
        this.innerProperties().withRenewSource(renewSource);
        return this;
    }

    /**
     * Get the renewDestination property: SavingsPlan Id of the SavingsPlan which is purchased because of renew.
     *
     * @return the renewDestination value.
     */
    public String renewDestination() {
        return this.innerProperties() == null ? null : this.innerProperties().renewDestination();
    }

    /**
     * Set the renewDestination property: SavingsPlan Id of the SavingsPlan which is purchased because of renew.
     *
     * @param renewDestination the renewDestination value to set.
     * @return the SavingsPlanModelInner object itself.
     */
    public SavingsPlanModelInner withRenewDestination(String renewDestination) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SavingsPlanModelProperties();
        }
        this.innerProperties().withRenewDestination(renewDestination);
        return this;
    }

    /**
     * Get the renewProperties property: The renewProperties property.
     *
     * @return the renewProperties value.
     */
    public RenewProperties renewProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().renewProperties();
    }

    /**
     * Set the renewProperties property: The renewProperties property.
     *
     * @param renewProperties the renewProperties value to set.
     * @return the SavingsPlanModelInner object itself.
     */
    public SavingsPlanModelInner withRenewProperties(RenewProperties renewProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SavingsPlanModelProperties();
        }
        this.innerProperties().withRenewProperties(renewProperties);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sku in model SavingsPlanModelInner"));
        } else {
            sku().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SavingsPlanModelInner.class);
}