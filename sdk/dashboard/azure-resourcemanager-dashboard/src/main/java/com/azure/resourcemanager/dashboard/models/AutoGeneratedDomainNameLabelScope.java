// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dashboard.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Scope for dns deterministic name hash calculation. */
public final class AutoGeneratedDomainNameLabelScope extends ExpandableStringEnum<AutoGeneratedDomainNameLabelScope> {
    /** Static value TenantReuse for AutoGeneratedDomainNameLabelScope. */
    public static final AutoGeneratedDomainNameLabelScope TENANT_REUSE = fromString("TenantReuse");

    /**
     * Creates or finds a AutoGeneratedDomainNameLabelScope from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AutoGeneratedDomainNameLabelScope.
     */
    @JsonCreator
    public static AutoGeneratedDomainNameLabelScope fromString(String name) {
        return fromString(name, AutoGeneratedDomainNameLabelScope.class);
    }

    /**
     * Gets known AutoGeneratedDomainNameLabelScope values.
     *
     * @return known AutoGeneratedDomainNameLabelScope values.
     */
    public static Collection<AutoGeneratedDomainNameLabelScope> values() {
        return values(AutoGeneratedDomainNameLabelScope.class);
    }
}
