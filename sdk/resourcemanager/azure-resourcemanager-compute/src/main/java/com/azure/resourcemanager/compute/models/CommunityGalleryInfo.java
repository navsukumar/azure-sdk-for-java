// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Information of community gallery if current gallery is shared to community.
 */
@Fluent
public final class CommunityGalleryInfo {
    /*
     * The link to the publisher website. Visible to all users.
     */
    @JsonProperty(value = "publisherUri")
    private String publisherUri;

    /*
     * Community gallery publisher support email. The email address of the publisher. Visible to all users.
     */
    @JsonProperty(value = "publisherContact")
    private String publisherContact;

    /*
     * End-user license agreement for community gallery image.
     */
    @JsonProperty(value = "eula")
    private String eula;

    /*
     * The prefix of the gallery name that will be displayed publicly. Visible to all users.
     */
    @JsonProperty(value = "publicNamePrefix")
    private String publicNamePrefix;

    /*
     * Contains info about whether community gallery sharing is enabled.
     */
    @JsonProperty(value = "communityGalleryEnabled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean communityGalleryEnabled;

    /*
     * Community gallery public name list.
     */
    @JsonProperty(value = "publicNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> publicNames;

    /**
     * Creates an instance of CommunityGalleryInfo class.
     */
    public CommunityGalleryInfo() {
    }

    /**
     * Get the publisherUri property: The link to the publisher website. Visible to all users.
     *
     * @return the publisherUri value.
     */
    public String publisherUri() {
        return this.publisherUri;
    }

    /**
     * Set the publisherUri property: The link to the publisher website. Visible to all users.
     *
     * @param publisherUri the publisherUri value to set.
     * @return the CommunityGalleryInfo object itself.
     */
    public CommunityGalleryInfo withPublisherUri(String publisherUri) {
        this.publisherUri = publisherUri;
        return this;
    }

    /**
     * Get the publisherContact property: Community gallery publisher support email. The email address of the publisher.
     * Visible to all users.
     *
     * @return the publisherContact value.
     */
    public String publisherContact() {
        return this.publisherContact;
    }

    /**
     * Set the publisherContact property: Community gallery publisher support email. The email address of the publisher.
     * Visible to all users.
     *
     * @param publisherContact the publisherContact value to set.
     * @return the CommunityGalleryInfo object itself.
     */
    public CommunityGalleryInfo withPublisherContact(String publisherContact) {
        this.publisherContact = publisherContact;
        return this;
    }

    /**
     * Get the eula property: End-user license agreement for community gallery image.
     *
     * @return the eula value.
     */
    public String eula() {
        return this.eula;
    }

    /**
     * Set the eula property: End-user license agreement for community gallery image.
     *
     * @param eula the eula value to set.
     * @return the CommunityGalleryInfo object itself.
     */
    public CommunityGalleryInfo withEula(String eula) {
        this.eula = eula;
        return this;
    }

    /**
     * Get the publicNamePrefix property: The prefix of the gallery name that will be displayed publicly. Visible to all
     * users.
     *
     * @return the publicNamePrefix value.
     */
    public String publicNamePrefix() {
        return this.publicNamePrefix;
    }

    /**
     * Set the publicNamePrefix property: The prefix of the gallery name that will be displayed publicly. Visible to all
     * users.
     *
     * @param publicNamePrefix the publicNamePrefix value to set.
     * @return the CommunityGalleryInfo object itself.
     */
    public CommunityGalleryInfo withPublicNamePrefix(String publicNamePrefix) {
        this.publicNamePrefix = publicNamePrefix;
        return this;
    }

    /**
     * Get the communityGalleryEnabled property: Contains info about whether community gallery sharing is enabled.
     *
     * @return the communityGalleryEnabled value.
     */
    public Boolean communityGalleryEnabled() {
        return this.communityGalleryEnabled;
    }

    /**
     * Get the publicNames property: Community gallery public name list.
     *
     * @return the publicNames value.
     */
    public List<String> publicNames() {
        return this.publicNames;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
