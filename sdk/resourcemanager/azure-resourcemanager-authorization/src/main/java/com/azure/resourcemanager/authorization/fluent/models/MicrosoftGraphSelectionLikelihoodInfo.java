// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * selectionLikelihoodInfo.
 */
public final class MicrosoftGraphSelectionLikelihoodInfo
    extends ExpandableStringEnum<MicrosoftGraphSelectionLikelihoodInfo> {
    /**
     * Static value notSpecified for MicrosoftGraphSelectionLikelihoodInfo.
     */
    public static final MicrosoftGraphSelectionLikelihoodInfo NOT_SPECIFIED = fromString("notSpecified");

    /**
     * Static value high for MicrosoftGraphSelectionLikelihoodInfo.
     */
    public static final MicrosoftGraphSelectionLikelihoodInfo HIGH = fromString("high");

    /**
     * Creates a new instance of MicrosoftGraphSelectionLikelihoodInfo value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MicrosoftGraphSelectionLikelihoodInfo() {
    }

    /**
     * Creates or finds a MicrosoftGraphSelectionLikelihoodInfo from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphSelectionLikelihoodInfo.
     */
    public static MicrosoftGraphSelectionLikelihoodInfo fromString(String name) {
        return fromString(name, MicrosoftGraphSelectionLikelihoodInfo.class);
    }

    /**
     * Gets known MicrosoftGraphSelectionLikelihoodInfo values.
     * 
     * @return known MicrosoftGraphSelectionLikelihoodInfo values.
     */
    public static Collection<MicrosoftGraphSelectionLikelihoodInfo> values() {
        return values(MicrosoftGraphSelectionLikelihoodInfo.class);
    }
}
