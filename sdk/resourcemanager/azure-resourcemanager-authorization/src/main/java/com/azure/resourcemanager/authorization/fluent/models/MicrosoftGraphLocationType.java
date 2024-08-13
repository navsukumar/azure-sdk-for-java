// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * locationType.
 */
public final class MicrosoftGraphLocationType extends ExpandableStringEnum<MicrosoftGraphLocationType> {
    /**
     * Static value default for MicrosoftGraphLocationType.
     */
    public static final MicrosoftGraphLocationType DEFAULT = fromString("default");

    /**
     * Static value conferenceRoom for MicrosoftGraphLocationType.
     */
    public static final MicrosoftGraphLocationType CONFERENCE_ROOM = fromString("conferenceRoom");

    /**
     * Static value homeAddress for MicrosoftGraphLocationType.
     */
    public static final MicrosoftGraphLocationType HOME_ADDRESS = fromString("homeAddress");

    /**
     * Static value businessAddress for MicrosoftGraphLocationType.
     */
    public static final MicrosoftGraphLocationType BUSINESS_ADDRESS = fromString("businessAddress");

    /**
     * Static value geoCoordinates for MicrosoftGraphLocationType.
     */
    public static final MicrosoftGraphLocationType GEO_COORDINATES = fromString("geoCoordinates");

    /**
     * Static value streetAddress for MicrosoftGraphLocationType.
     */
    public static final MicrosoftGraphLocationType STREET_ADDRESS = fromString("streetAddress");

    /**
     * Static value hotel for MicrosoftGraphLocationType.
     */
    public static final MicrosoftGraphLocationType HOTEL = fromString("hotel");

    /**
     * Static value restaurant for MicrosoftGraphLocationType.
     */
    public static final MicrosoftGraphLocationType RESTAURANT = fromString("restaurant");

    /**
     * Static value localBusiness for MicrosoftGraphLocationType.
     */
    public static final MicrosoftGraphLocationType LOCAL_BUSINESS = fromString("localBusiness");

    /**
     * Static value postalAddress for MicrosoftGraphLocationType.
     */
    public static final MicrosoftGraphLocationType POSTAL_ADDRESS = fromString("postalAddress");

    /**
     * Creates a new instance of MicrosoftGraphLocationType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MicrosoftGraphLocationType() {
    }

    /**
     * Creates or finds a MicrosoftGraphLocationType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphLocationType.
     */
    public static MicrosoftGraphLocationType fromString(String name) {
        return fromString(name, MicrosoftGraphLocationType.class);
    }

    /**
     * Gets known MicrosoftGraphLocationType values.
     * 
     * @return known MicrosoftGraphLocationType values.
     */
    public static Collection<MicrosoftGraphLocationType> values() {
        return values(MicrosoftGraphLocationType.class);
    }
}
