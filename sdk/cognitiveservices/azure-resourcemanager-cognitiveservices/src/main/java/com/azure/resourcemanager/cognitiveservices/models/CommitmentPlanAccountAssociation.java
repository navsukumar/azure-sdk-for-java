// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cognitiveservices.fluent.models.CommitmentPlanAccountAssociationInner;

/** An immutable client-side representation of CommitmentPlanAccountAssociation. */
public interface CommitmentPlanAccountAssociation {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the etag property: Resource Etag.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the accountId property: The Azure resource id of the account.
     *
     * @return the accountId value.
     */
    String accountId();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.cognitiveservices.fluent.models.CommitmentPlanAccountAssociationInner
     * object.
     *
     * @return the inner object.
     */
    CommitmentPlanAccountAssociationInner innerModel();

    /** The entirety of the CommitmentPlanAccountAssociation definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The CommitmentPlanAccountAssociation definition stages. */
    interface DefinitionStages {
        /** The first stage of the CommitmentPlanAccountAssociation definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the CommitmentPlanAccountAssociation definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, commitmentPlanName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param commitmentPlanName The name of the commitmentPlan associated with the Cognitive Services Account.
             * @return the next definition stage.
             */
            WithCreate withExistingCommitmentPlan(String resourceGroupName, String commitmentPlanName);
        }
        /**
         * The stage of the CommitmentPlanAccountAssociation definition which contains all the minimum required
         * properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithAccountId {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            CommitmentPlanAccountAssociation create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            CommitmentPlanAccountAssociation create(Context context);
        }
        /** The stage of the CommitmentPlanAccountAssociation definition allowing to specify accountId. */
        interface WithAccountId {
            /**
             * Specifies the accountId property: The Azure resource id of the account..
             *
             * @param accountId The Azure resource id of the account.
             * @return the next definition stage.
             */
            WithCreate withAccountId(String accountId);
        }
    }
    /**
     * Begins update for the CommitmentPlanAccountAssociation resource.
     *
     * @return the stage of resource update.
     */
    CommitmentPlanAccountAssociation.Update update();

    /** The template for CommitmentPlanAccountAssociation update. */
    interface Update extends UpdateStages.WithAccountId {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        CommitmentPlanAccountAssociation apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        CommitmentPlanAccountAssociation apply(Context context);
    }
    /** The CommitmentPlanAccountAssociation update stages. */
    interface UpdateStages {
        /** The stage of the CommitmentPlanAccountAssociation update allowing to specify accountId. */
        interface WithAccountId {
            /**
             * Specifies the accountId property: The Azure resource id of the account..
             *
             * @param accountId The Azure resource id of the account.
             * @return the next definition stage.
             */
            Update withAccountId(String accountId);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    CommitmentPlanAccountAssociation refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    CommitmentPlanAccountAssociation refresh(Context context);
}
