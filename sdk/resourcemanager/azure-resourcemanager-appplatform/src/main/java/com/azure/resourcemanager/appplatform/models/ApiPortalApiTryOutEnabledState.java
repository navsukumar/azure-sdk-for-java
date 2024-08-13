// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Indicates whether the API try-out feature is enabled or disabled. When enabled, users can try out the API by sending
 * requests and viewing responses in API portal. When disabled, users cannot try out the API.
 */
public final class ApiPortalApiTryOutEnabledState extends ExpandableStringEnum<ApiPortalApiTryOutEnabledState> {
    /**
     * Static value Enabled for ApiPortalApiTryOutEnabledState.
     */
    public static final ApiPortalApiTryOutEnabledState ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for ApiPortalApiTryOutEnabledState.
     */
    public static final ApiPortalApiTryOutEnabledState DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of ApiPortalApiTryOutEnabledState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ApiPortalApiTryOutEnabledState() {
    }

    /**
     * Creates or finds a ApiPortalApiTryOutEnabledState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ApiPortalApiTryOutEnabledState.
     */
    public static ApiPortalApiTryOutEnabledState fromString(String name) {
        return fromString(name, ApiPortalApiTryOutEnabledState.class);
    }

    /**
     * Gets known ApiPortalApiTryOutEnabledState values.
     * 
     * @return known ApiPortalApiTryOutEnabledState values.
     */
    public static Collection<ApiPortalApiTryOutEnabledState> values() {
        return values(ApiPortalApiTryOutEnabledState.class);
    }
}
