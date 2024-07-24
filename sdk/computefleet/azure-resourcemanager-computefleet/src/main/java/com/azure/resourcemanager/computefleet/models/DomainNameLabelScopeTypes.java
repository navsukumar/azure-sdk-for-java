// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computefleet.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The Domain name label scope.The concatenation of the hashed domain name label
 * that generated according to the policy from domain name label scope and vm
 * index will be the domain name labels of the PublicIPAddress resources that will
 * be created.
 */
public final class DomainNameLabelScopeTypes extends ExpandableStringEnum<DomainNameLabelScopeTypes> {
    /**
     * Static value TenantReuse for DomainNameLabelScopeTypes.
     */
    public static final DomainNameLabelScopeTypes TENANT_REUSE = fromString("TenantReuse");

    /**
     * Static value SubscriptionReuse for DomainNameLabelScopeTypes.
     */
    public static final DomainNameLabelScopeTypes SUBSCRIPTION_REUSE = fromString("SubscriptionReuse");

    /**
     * Static value ResourceGroupReuse for DomainNameLabelScopeTypes.
     */
    public static final DomainNameLabelScopeTypes RESOURCE_GROUP_REUSE = fromString("ResourceGroupReuse");

    /**
     * Static value NoReuse for DomainNameLabelScopeTypes.
     */
    public static final DomainNameLabelScopeTypes NO_REUSE = fromString("NoReuse");

    /**
     * Creates a new instance of DomainNameLabelScopeTypes value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DomainNameLabelScopeTypes() {
    }

    /**
     * Creates or finds a DomainNameLabelScopeTypes from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DomainNameLabelScopeTypes.
     */
    public static DomainNameLabelScopeTypes fromString(String name) {
        return fromString(name, DomainNameLabelScopeTypes.class);
    }

    /**
     * Gets known DomainNameLabelScopeTypes values.
     * 
     * @return known DomainNameLabelScopeTypes values.
     */
    public static Collection<DomainNameLabelScopeTypes> values() {
        return values(DomainNameLabelScopeTypes.class);
    }
}
