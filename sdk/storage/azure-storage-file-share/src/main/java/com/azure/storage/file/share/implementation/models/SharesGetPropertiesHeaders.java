// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeader;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;
import com.azure.core.util.DateTimeRfc1123;
import com.azure.storage.file.share.models.LeaseDurationType;
import com.azure.storage.file.share.models.LeaseStateType;
import com.azure.storage.file.share.models.LeaseStatusType;
import com.azure.storage.file.share.models.ShareRootSquash;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * The SharesGetPropertiesHeaders model.
 */
@Fluent
public final class SharesGetPropertiesHeaders {
    /*
     * The x-ms-share-provisioned-iops property.
     */
    private Integer xMsShareProvisionedIops;

    /*
     * The x-ms-version property.
     */
    private String xMsVersion;

    /*
     * The x-ms-lease-status property.
     */
    private LeaseStatusType xMsLeaseStatus;

    /*
     * The x-ms-share-paid-bursting-enabled property.
     */
    private Boolean xMsSharePaidBurstingEnabled;

    /*
     * The x-ms-lease-state property.
     */
    private LeaseStateType xMsLeaseState;

    /*
     * The x-ms-root-squash property.
     */
    private ShareRootSquash xMsRootSquash;

    /*
     * The Last-Modified property.
     */
    private DateTimeRfc1123 lastModified;

    /*
     * The x-ms-access-tier-change-time property.
     */
    private DateTimeRfc1123 xMsAccessTierChangeTime;

    /*
     * The x-ms-enable-snapshot-virtual-directory-access property.
     */
    private Boolean xMsEnableSnapshotVirtualDirectoryAccess;

    /*
     * The x-ms-meta- property.
     */
    private Map<String, String> xMsMeta;

    /*
     * The Date property.
     */
    private DateTimeRfc1123 date;

    /*
     * The x-ms-share-provisioned-ingress-mbps property.
     */
    private Integer xMsShareProvisionedIngressMbps;

    /*
     * The x-ms-share-provisioned-bandwidth-mibps property.
     */
    private Integer xMsShareProvisionedBandwidthMibps;

    /*
     * The x-ms-share-quota property.
     */
    private Integer xMsShareQuota;

    /*
     * The x-ms-share-paid-bursting-max-iops property.
     */
    private Long xMsSharePaidBurstingMaxIops;

    /*
     * The x-ms-share-paid-bursting-max-bandwidth-mibps property.
     */
    private Long xMsSharePaidBurstingMaxBandwidthMibps;

    /*
     * The x-ms-access-tier property.
     */
    private String xMsAccessTier;

    /*
     * The ETag property.
     */
    private String eTag;

    /*
     * The x-ms-enabled-protocols property.
     */
    private String xMsEnabledProtocols;

    /*
     * The x-ms-lease-duration property.
     */
    private LeaseDurationType xMsLeaseDuration;

    /*
     * The x-ms-request-id property.
     */
    private String xMsRequestId;

    /*
     * The x-ms-access-tier-transition-state property.
     */
    private String xMsAccessTierTransitionState;

    /*
     * The x-ms-share-provisioned-egress-mbps property.
     */
    private Integer xMsShareProvisionedEgressMbps;

    /*
     * The x-ms-share-next-allowed-quota-downgrade-time property.
     */
    private DateTimeRfc1123 xMsShareNextAllowedQuotaDowngradeTime;

    private static final HttpHeaderName X_MS_SHARE_PROVISIONED_IOPS
        = HttpHeaderName.fromString("x-ms-share-provisioned-iops");

    private static final HttpHeaderName X_MS_VERSION = HttpHeaderName.fromString("x-ms-version");

    private static final HttpHeaderName X_MS_LEASE_STATUS = HttpHeaderName.fromString("x-ms-lease-status");

    private static final HttpHeaderName X_MS_SHARE_PAID_BURSTING_ENABLED
        = HttpHeaderName.fromString("x-ms-share-paid-bursting-enabled");

    private static final HttpHeaderName X_MS_LEASE_STATE = HttpHeaderName.fromString("x-ms-lease-state");

    private static final HttpHeaderName X_MS_ROOT_SQUASH = HttpHeaderName.fromString("x-ms-root-squash");

    private static final HttpHeaderName X_MS_ACCESS_TIER_CHANGE_TIME
        = HttpHeaderName.fromString("x-ms-access-tier-change-time");

    private static final HttpHeaderName X_MS_ENABLE_SNAPSHOT_VIRTUAL_DIRECTORY_ACCESS
        = HttpHeaderName.fromString("x-ms-enable-snapshot-virtual-directory-access");

    private static final HttpHeaderName X_MS_SHARE_PROVISIONED_INGRESS_MBPS
        = HttpHeaderName.fromString("x-ms-share-provisioned-ingress-mbps");

    private static final HttpHeaderName X_MS_SHARE_PROVISIONED_BANDWIDTH_MIBPS
        = HttpHeaderName.fromString("x-ms-share-provisioned-bandwidth-mibps");

    private static final HttpHeaderName X_MS_SHARE_QUOTA = HttpHeaderName.fromString("x-ms-share-quota");

    private static final HttpHeaderName X_MS_SHARE_PAID_BURSTING_MAX_IOPS
        = HttpHeaderName.fromString("x-ms-share-paid-bursting-max-iops");

    private static final HttpHeaderName X_MS_SHARE_PAID_BURSTING_MAX_BANDWIDTH_MIBPS
        = HttpHeaderName.fromString("x-ms-share-paid-bursting-max-bandwidth-mibps");

    private static final HttpHeaderName X_MS_ACCESS_TIER = HttpHeaderName.fromString("x-ms-access-tier");

    private static final HttpHeaderName X_MS_ENABLED_PROTOCOLS = HttpHeaderName.fromString("x-ms-enabled-protocols");

    private static final HttpHeaderName X_MS_LEASE_DURATION = HttpHeaderName.fromString("x-ms-lease-duration");

    private static final HttpHeaderName X_MS_ACCESS_TIER_TRANSITION_STATE
        = HttpHeaderName.fromString("x-ms-access-tier-transition-state");

    private static final HttpHeaderName X_MS_SHARE_PROVISIONED_EGRESS_MBPS
        = HttpHeaderName.fromString("x-ms-share-provisioned-egress-mbps");

    private static final HttpHeaderName X_MS_SHARE_NEXT_ALLOWED_QUOTA_DOWNGRADE_TIME
        = HttpHeaderName.fromString("x-ms-share-next-allowed-quota-downgrade-time");

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of SharesGetPropertiesHeaders class.
     * 
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public SharesGetPropertiesHeaders(HttpHeaders rawHeaders) {
        String xMsShareProvisionedIops = rawHeaders.getValue(X_MS_SHARE_PROVISIONED_IOPS);
        if (xMsShareProvisionedIops != null) {
            this.xMsShareProvisionedIops = Integer.parseInt(xMsShareProvisionedIops);
        }
        this.xMsVersion = rawHeaders.getValue(X_MS_VERSION);
        String xMsLeaseStatus = rawHeaders.getValue(X_MS_LEASE_STATUS);
        if (xMsLeaseStatus != null) {
            this.xMsLeaseStatus = LeaseStatusType.fromString(xMsLeaseStatus);
        }
        String xMsSharePaidBurstingEnabled = rawHeaders.getValue(X_MS_SHARE_PAID_BURSTING_ENABLED);
        if (xMsSharePaidBurstingEnabled != null) {
            this.xMsSharePaidBurstingEnabled = Boolean.parseBoolean(xMsSharePaidBurstingEnabled);
        }
        String xMsLeaseState = rawHeaders.getValue(X_MS_LEASE_STATE);
        if (xMsLeaseState != null) {
            this.xMsLeaseState = LeaseStateType.fromString(xMsLeaseState);
        }
        String xMsRootSquash = rawHeaders.getValue(X_MS_ROOT_SQUASH);
        if (xMsRootSquash != null) {
            this.xMsRootSquash = ShareRootSquash.fromString(xMsRootSquash);
        }
        String lastModified = rawHeaders.getValue(HttpHeaderName.LAST_MODIFIED);
        if (lastModified != null) {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        String xMsAccessTierChangeTime = rawHeaders.getValue(X_MS_ACCESS_TIER_CHANGE_TIME);
        if (xMsAccessTierChangeTime != null) {
            this.xMsAccessTierChangeTime = new DateTimeRfc1123(xMsAccessTierChangeTime);
        }
        String xMsEnableSnapshotVirtualDirectoryAccess
            = rawHeaders.getValue(X_MS_ENABLE_SNAPSHOT_VIRTUAL_DIRECTORY_ACCESS);
        if (xMsEnableSnapshotVirtualDirectoryAccess != null) {
            this.xMsEnableSnapshotVirtualDirectoryAccess
                = Boolean.parseBoolean(xMsEnableSnapshotVirtualDirectoryAccess);
        }
        String date = rawHeaders.getValue(HttpHeaderName.DATE);
        if (date != null) {
            this.date = new DateTimeRfc1123(date);
        }
        String xMsShareProvisionedIngressMbps = rawHeaders.getValue(X_MS_SHARE_PROVISIONED_INGRESS_MBPS);
        if (xMsShareProvisionedIngressMbps != null) {
            this.xMsShareProvisionedIngressMbps = Integer.parseInt(xMsShareProvisionedIngressMbps);
        }
        String xMsShareProvisionedBandwidthMibps = rawHeaders.getValue(X_MS_SHARE_PROVISIONED_BANDWIDTH_MIBPS);
        if (xMsShareProvisionedBandwidthMibps != null) {
            this.xMsShareProvisionedBandwidthMibps = Integer.parseInt(xMsShareProvisionedBandwidthMibps);
        }
        String xMsShareQuota = rawHeaders.getValue(X_MS_SHARE_QUOTA);
        if (xMsShareQuota != null) {
            this.xMsShareQuota = Integer.parseInt(xMsShareQuota);
        }
        String xMsSharePaidBurstingMaxIops = rawHeaders.getValue(X_MS_SHARE_PAID_BURSTING_MAX_IOPS);
        if (xMsSharePaidBurstingMaxIops != null) {
            this.xMsSharePaidBurstingMaxIops = Long.parseLong(xMsSharePaidBurstingMaxIops);
        }
        String xMsSharePaidBurstingMaxBandwidthMibps
            = rawHeaders.getValue(X_MS_SHARE_PAID_BURSTING_MAX_BANDWIDTH_MIBPS);
        if (xMsSharePaidBurstingMaxBandwidthMibps != null) {
            this.xMsSharePaidBurstingMaxBandwidthMibps = Long.parseLong(xMsSharePaidBurstingMaxBandwidthMibps);
        }
        this.xMsAccessTier = rawHeaders.getValue(X_MS_ACCESS_TIER);
        this.eTag = rawHeaders.getValue(HttpHeaderName.ETAG);
        this.xMsEnabledProtocols = rawHeaders.getValue(X_MS_ENABLED_PROTOCOLS);
        String xMsLeaseDuration = rawHeaders.getValue(X_MS_LEASE_DURATION);
        if (xMsLeaseDuration != null) {
            this.xMsLeaseDuration = LeaseDurationType.fromString(xMsLeaseDuration);
        }
        this.xMsRequestId = rawHeaders.getValue(HttpHeaderName.X_MS_REQUEST_ID);
        this.xMsAccessTierTransitionState = rawHeaders.getValue(X_MS_ACCESS_TIER_TRANSITION_STATE);
        String xMsShareProvisionedEgressMbps = rawHeaders.getValue(X_MS_SHARE_PROVISIONED_EGRESS_MBPS);
        if (xMsShareProvisionedEgressMbps != null) {
            this.xMsShareProvisionedEgressMbps = Integer.parseInt(xMsShareProvisionedEgressMbps);
        }
        String xMsShareNextAllowedQuotaDowngradeTime
            = rawHeaders.getValue(X_MS_SHARE_NEXT_ALLOWED_QUOTA_DOWNGRADE_TIME);
        if (xMsShareNextAllowedQuotaDowngradeTime != null) {
            this.xMsShareNextAllowedQuotaDowngradeTime = new DateTimeRfc1123(xMsShareNextAllowedQuotaDowngradeTime);
        }
        Map<String, String> xMsMetaHeaderCollection = new HashMap<>();

        for (HttpHeader header : rawHeaders) {
            String headerName = header.getName();
            if (headerName.startsWith("x-ms-meta-")) {
                xMsMetaHeaderCollection.put(headerName.substring(10), header.getValue());
            }
        }

        this.xMsMeta = xMsMetaHeaderCollection;
    }

    /**
     * Get the xMsShareProvisionedIops property: The x-ms-share-provisioned-iops property.
     * 
     * @return the xMsShareProvisionedIops value.
     */
    public Integer getXMsShareProvisionedIops() {
        return this.xMsShareProvisionedIops;
    }

    /**
     * Set the xMsShareProvisionedIops property: The x-ms-share-provisioned-iops property.
     * 
     * @param xMsShareProvisionedIops the xMsShareProvisionedIops value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsShareProvisionedIops(Integer xMsShareProvisionedIops) {
        this.xMsShareProvisionedIops = xMsShareProvisionedIops;
        return this;
    }

    /**
     * Get the xMsVersion property: The x-ms-version property.
     * 
     * @return the xMsVersion value.
     */
    public String getXMsVersion() {
        return this.xMsVersion;
    }

    /**
     * Set the xMsVersion property: The x-ms-version property.
     * 
     * @param xMsVersion the xMsVersion value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /**
     * Get the xMsLeaseStatus property: The x-ms-lease-status property.
     * 
     * @return the xMsLeaseStatus value.
     */
    public LeaseStatusType getXMsLeaseStatus() {
        return this.xMsLeaseStatus;
    }

    /**
     * Set the xMsLeaseStatus property: The x-ms-lease-status property.
     * 
     * @param xMsLeaseStatus the xMsLeaseStatus value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsLeaseStatus(LeaseStatusType xMsLeaseStatus) {
        this.xMsLeaseStatus = xMsLeaseStatus;
        return this;
    }

    /**
     * Get the xMsSharePaidBurstingEnabled property: The x-ms-share-paid-bursting-enabled property.
     * 
     * @return the xMsSharePaidBurstingEnabled value.
     */
    public Boolean isXMsSharePaidBurstingEnabled() {
        return this.xMsSharePaidBurstingEnabled;
    }

    /**
     * Set the xMsSharePaidBurstingEnabled property: The x-ms-share-paid-bursting-enabled property.
     * 
     * @param xMsSharePaidBurstingEnabled the xMsSharePaidBurstingEnabled value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsSharePaidBurstingEnabled(Boolean xMsSharePaidBurstingEnabled) {
        this.xMsSharePaidBurstingEnabled = xMsSharePaidBurstingEnabled;
        return this;
    }

    /**
     * Get the xMsLeaseState property: The x-ms-lease-state property.
     * 
     * @return the xMsLeaseState value.
     */
    public LeaseStateType getXMsLeaseState() {
        return this.xMsLeaseState;
    }

    /**
     * Set the xMsLeaseState property: The x-ms-lease-state property.
     * 
     * @param xMsLeaseState the xMsLeaseState value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsLeaseState(LeaseStateType xMsLeaseState) {
        this.xMsLeaseState = xMsLeaseState;
        return this;
    }

    /**
     * Get the xMsRootSquash property: The x-ms-root-squash property.
     * 
     * @return the xMsRootSquash value.
     */
    public ShareRootSquash getXMsRootSquash() {
        return this.xMsRootSquash;
    }

    /**
     * Set the xMsRootSquash property: The x-ms-root-squash property.
     * 
     * @param xMsRootSquash the xMsRootSquash value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsRootSquash(ShareRootSquash xMsRootSquash) {
        this.xMsRootSquash = xMsRootSquash;
        return this;
    }

    /**
     * Get the lastModified property: The Last-Modified property.
     * 
     * @return the lastModified value.
     */
    public OffsetDateTime getLastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified property: The Last-Modified property.
     * 
     * @param lastModified the lastModified value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the xMsAccessTierChangeTime property: The x-ms-access-tier-change-time property.
     * 
     * @return the xMsAccessTierChangeTime value.
     */
    public OffsetDateTime getXMsAccessTierChangeTime() {
        if (this.xMsAccessTierChangeTime == null) {
            return null;
        }
        return this.xMsAccessTierChangeTime.getDateTime();
    }

    /**
     * Set the xMsAccessTierChangeTime property: The x-ms-access-tier-change-time property.
     * 
     * @param xMsAccessTierChangeTime the xMsAccessTierChangeTime value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsAccessTierChangeTime(OffsetDateTime xMsAccessTierChangeTime) {
        if (xMsAccessTierChangeTime == null) {
            this.xMsAccessTierChangeTime = null;
        } else {
            this.xMsAccessTierChangeTime = new DateTimeRfc1123(xMsAccessTierChangeTime);
        }
        return this;
    }

    /**
     * Get the xMsEnableSnapshotVirtualDirectoryAccess property: The x-ms-enable-snapshot-virtual-directory-access
     * property.
     * 
     * @return the xMsEnableSnapshotVirtualDirectoryAccess value.
     */
    public Boolean isXMsEnableSnapshotVirtualDirectoryAccess() {
        return this.xMsEnableSnapshotVirtualDirectoryAccess;
    }

    /**
     * Set the xMsEnableSnapshotVirtualDirectoryAccess property: The x-ms-enable-snapshot-virtual-directory-access
     * property.
     * 
     * @param xMsEnableSnapshotVirtualDirectoryAccess the xMsEnableSnapshotVirtualDirectoryAccess value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders
        setXMsEnableSnapshotVirtualDirectoryAccess(Boolean xMsEnableSnapshotVirtualDirectoryAccess) {
        this.xMsEnableSnapshotVirtualDirectoryAccess = xMsEnableSnapshotVirtualDirectoryAccess;
        return this;
    }

    /**
     * Get the xMsMeta property: The x-ms-meta- property.
     * 
     * @return the xMsMeta value.
     */
    public Map<String, String> getXMsMeta() {
        return this.xMsMeta;
    }

    /**
     * Set the xMsMeta property: The x-ms-meta- property.
     * 
     * @param xMsMeta the xMsMeta value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsMeta(Map<String, String> xMsMeta) {
        this.xMsMeta = xMsMeta;
        return this;
    }

    /**
     * Get the date property: The Date property.
     * 
     * @return the date value.
     */
    public OffsetDateTime getDate() {
        if (this.date == null) {
            return null;
        }
        return this.date.getDateTime();
    }

    /**
     * Set the date property: The Date property.
     * 
     * @param date the date value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setDate(OffsetDateTime date) {
        if (date == null) {
            this.date = null;
        } else {
            this.date = new DateTimeRfc1123(date);
        }
        return this;
    }

    /**
     * Get the xMsShareProvisionedIngressMbps property: The x-ms-share-provisioned-ingress-mbps property.
     * 
     * @return the xMsShareProvisionedIngressMbps value.
     */
    public Integer getXMsShareProvisionedIngressMbps() {
        return this.xMsShareProvisionedIngressMbps;
    }

    /**
     * Set the xMsShareProvisionedIngressMbps property: The x-ms-share-provisioned-ingress-mbps property.
     * 
     * @param xMsShareProvisionedIngressMbps the xMsShareProvisionedIngressMbps value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsShareProvisionedIngressMbps(Integer xMsShareProvisionedIngressMbps) {
        this.xMsShareProvisionedIngressMbps = xMsShareProvisionedIngressMbps;
        return this;
    }

    /**
     * Get the xMsShareProvisionedBandwidthMibps property: The x-ms-share-provisioned-bandwidth-mibps property.
     * 
     * @return the xMsShareProvisionedBandwidthMibps value.
     */
    public Integer getXMsShareProvisionedBandwidthMibps() {
        return this.xMsShareProvisionedBandwidthMibps;
    }

    /**
     * Set the xMsShareProvisionedBandwidthMibps property: The x-ms-share-provisioned-bandwidth-mibps property.
     * 
     * @param xMsShareProvisionedBandwidthMibps the xMsShareProvisionedBandwidthMibps value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsShareProvisionedBandwidthMibps(Integer xMsShareProvisionedBandwidthMibps) {
        this.xMsShareProvisionedBandwidthMibps = xMsShareProvisionedBandwidthMibps;
        return this;
    }

    /**
     * Get the xMsShareQuota property: The x-ms-share-quota property.
     * 
     * @return the xMsShareQuota value.
     */
    public Integer getXMsShareQuota() {
        return this.xMsShareQuota;
    }

    /**
     * Set the xMsShareQuota property: The x-ms-share-quota property.
     * 
     * @param xMsShareQuota the xMsShareQuota value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsShareQuota(Integer xMsShareQuota) {
        this.xMsShareQuota = xMsShareQuota;
        return this;
    }

    /**
     * Get the xMsSharePaidBurstingMaxIops property: The x-ms-share-paid-bursting-max-iops property.
     * 
     * @return the xMsSharePaidBurstingMaxIops value.
     */
    public Long getXMsSharePaidBurstingMaxIops() {
        return this.xMsSharePaidBurstingMaxIops;
    }

    /**
     * Set the xMsSharePaidBurstingMaxIops property: The x-ms-share-paid-bursting-max-iops property.
     * 
     * @param xMsSharePaidBurstingMaxIops the xMsSharePaidBurstingMaxIops value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsSharePaidBurstingMaxIops(Long xMsSharePaidBurstingMaxIops) {
        this.xMsSharePaidBurstingMaxIops = xMsSharePaidBurstingMaxIops;
        return this;
    }

    /**
     * Get the xMsSharePaidBurstingMaxBandwidthMibps property: The x-ms-share-paid-bursting-max-bandwidth-mibps
     * property.
     * 
     * @return the xMsSharePaidBurstingMaxBandwidthMibps value.
     */
    public Long getXMsSharePaidBurstingMaxBandwidthMibps() {
        return this.xMsSharePaidBurstingMaxBandwidthMibps;
    }

    /**
     * Set the xMsSharePaidBurstingMaxBandwidthMibps property: The x-ms-share-paid-bursting-max-bandwidth-mibps
     * property.
     * 
     * @param xMsSharePaidBurstingMaxBandwidthMibps the xMsSharePaidBurstingMaxBandwidthMibps value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders
        setXMsSharePaidBurstingMaxBandwidthMibps(Long xMsSharePaidBurstingMaxBandwidthMibps) {
        this.xMsSharePaidBurstingMaxBandwidthMibps = xMsSharePaidBurstingMaxBandwidthMibps;
        return this;
    }

    /**
     * Get the xMsAccessTier property: The x-ms-access-tier property.
     * 
     * @return the xMsAccessTier value.
     */
    public String getXMsAccessTier() {
        return this.xMsAccessTier;
    }

    /**
     * Set the xMsAccessTier property: The x-ms-access-tier property.
     * 
     * @param xMsAccessTier the xMsAccessTier value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsAccessTier(String xMsAccessTier) {
        this.xMsAccessTier = xMsAccessTier;
        return this;
    }

    /**
     * Get the eTag property: The ETag property.
     * 
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag property.
     * 
     * @param eTag the eTag value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the xMsEnabledProtocols property: The x-ms-enabled-protocols property.
     * 
     * @return the xMsEnabledProtocols value.
     */
    public String getXMsEnabledProtocols() {
        return this.xMsEnabledProtocols;
    }

    /**
     * Set the xMsEnabledProtocols property: The x-ms-enabled-protocols property.
     * 
     * @param xMsEnabledProtocols the xMsEnabledProtocols value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsEnabledProtocols(String xMsEnabledProtocols) {
        this.xMsEnabledProtocols = xMsEnabledProtocols;
        return this;
    }

    /**
     * Get the xMsLeaseDuration property: The x-ms-lease-duration property.
     * 
     * @return the xMsLeaseDuration value.
     */
    public LeaseDurationType getXMsLeaseDuration() {
        return this.xMsLeaseDuration;
    }

    /**
     * Set the xMsLeaseDuration property: The x-ms-lease-duration property.
     * 
     * @param xMsLeaseDuration the xMsLeaseDuration value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsLeaseDuration(LeaseDurationType xMsLeaseDuration) {
        this.xMsLeaseDuration = xMsLeaseDuration;
        return this;
    }

    /**
     * Get the xMsRequestId property: The x-ms-request-id property.
     * 
     * @return the xMsRequestId value.
     */
    public String getXMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Set the xMsRequestId property: The x-ms-request-id property.
     * 
     * @param xMsRequestId the xMsRequestId value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the xMsAccessTierTransitionState property: The x-ms-access-tier-transition-state property.
     * 
     * @return the xMsAccessTierTransitionState value.
     */
    public String getXMsAccessTierTransitionState() {
        return this.xMsAccessTierTransitionState;
    }

    /**
     * Set the xMsAccessTierTransitionState property: The x-ms-access-tier-transition-state property.
     * 
     * @param xMsAccessTierTransitionState the xMsAccessTierTransitionState value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsAccessTierTransitionState(String xMsAccessTierTransitionState) {
        this.xMsAccessTierTransitionState = xMsAccessTierTransitionState;
        return this;
    }

    /**
     * Get the xMsShareProvisionedEgressMbps property: The x-ms-share-provisioned-egress-mbps property.
     * 
     * @return the xMsShareProvisionedEgressMbps value.
     */
    public Integer getXMsShareProvisionedEgressMbps() {
        return this.xMsShareProvisionedEgressMbps;
    }

    /**
     * Set the xMsShareProvisionedEgressMbps property: The x-ms-share-provisioned-egress-mbps property.
     * 
     * @param xMsShareProvisionedEgressMbps the xMsShareProvisionedEgressMbps value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsShareProvisionedEgressMbps(Integer xMsShareProvisionedEgressMbps) {
        this.xMsShareProvisionedEgressMbps = xMsShareProvisionedEgressMbps;
        return this;
    }

    /**
     * Get the xMsShareNextAllowedQuotaDowngradeTime property: The x-ms-share-next-allowed-quota-downgrade-time
     * property.
     * 
     * @return the xMsShareNextAllowedQuotaDowngradeTime value.
     */
    public OffsetDateTime getXMsShareNextAllowedQuotaDowngradeTime() {
        if (this.xMsShareNextAllowedQuotaDowngradeTime == null) {
            return null;
        }
        return this.xMsShareNextAllowedQuotaDowngradeTime.getDateTime();
    }

    /**
     * Set the xMsShareNextAllowedQuotaDowngradeTime property: The x-ms-share-next-allowed-quota-downgrade-time
     * property.
     * 
     * @param xMsShareNextAllowedQuotaDowngradeTime the xMsShareNextAllowedQuotaDowngradeTime value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders
        setXMsShareNextAllowedQuotaDowngradeTime(OffsetDateTime xMsShareNextAllowedQuotaDowngradeTime) {
        if (xMsShareNextAllowedQuotaDowngradeTime == null) {
            this.xMsShareNextAllowedQuotaDowngradeTime = null;
        } else {
            this.xMsShareNextAllowedQuotaDowngradeTime = new DateTimeRfc1123(xMsShareNextAllowedQuotaDowngradeTime);
        }
        return this;
    }
}
