// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;
import com.azure.core.util.DateTimeRfc1123;
import java.time.OffsetDateTime;

/**
 * The PageBlobsGetPageRangesDiffHeaders model.
 */
@Fluent
public final class PageBlobsGetPageRangesDiffHeaders {
    /*
     * The x-ms-version property.
     */
    private String xMsVersion;

    /*
     * The x-ms-blob-content-length property.
     */
    private Long xMsBlobContentLength;

    /*
     * The ETag property.
     */
    private String eTag;

    /*
     * The Last-Modified property.
     */
    private DateTimeRfc1123 lastModified;

    /*
     * The x-ms-request-id property.
     */
    private String xMsRequestId;

    /*
     * The x-ms-client-request-id property.
     */
    private String xMsClientRequestId;

    /*
     * The Date property.
     */
    private DateTimeRfc1123 date;

    private static final HttpHeaderName X_MS_VERSION = HttpHeaderName.fromString("x-ms-version");

    private static final HttpHeaderName X_MS_BLOB_CONTENT_LENGTH
        = HttpHeaderName.fromString("x-ms-blob-content-length");

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of PageBlobsGetPageRangesDiffHeaders class.
     * 
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public PageBlobsGetPageRangesDiffHeaders(HttpHeaders rawHeaders) {
        this.xMsVersion = rawHeaders.getValue(X_MS_VERSION);
        String xMsBlobContentLength = rawHeaders.getValue(X_MS_BLOB_CONTENT_LENGTH);
        if (xMsBlobContentLength != null) {
            this.xMsBlobContentLength = Long.parseLong(xMsBlobContentLength);
        }
        this.eTag = rawHeaders.getValue(HttpHeaderName.ETAG);
        String lastModified = rawHeaders.getValue(HttpHeaderName.LAST_MODIFIED);
        if (lastModified != null) {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        this.xMsRequestId = rawHeaders.getValue(HttpHeaderName.X_MS_REQUEST_ID);
        this.xMsClientRequestId = rawHeaders.getValue(HttpHeaderName.X_MS_CLIENT_REQUEST_ID);
        String date = rawHeaders.getValue(HttpHeaderName.DATE);
        if (date != null) {
            this.date = new DateTimeRfc1123(date);
        }
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
     * @return the PageBlobsGetPageRangesDiffHeaders object itself.
     */
    public PageBlobsGetPageRangesDiffHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /**
     * Get the xMsBlobContentLength property: The x-ms-blob-content-length property.
     * 
     * @return the xMsBlobContentLength value.
     */
    public Long getXMsBlobContentLength() {
        return this.xMsBlobContentLength;
    }

    /**
     * Set the xMsBlobContentLength property: The x-ms-blob-content-length property.
     * 
     * @param xMsBlobContentLength the xMsBlobContentLength value to set.
     * @return the PageBlobsGetPageRangesDiffHeaders object itself.
     */
    public PageBlobsGetPageRangesDiffHeaders setXMsBlobContentLength(Long xMsBlobContentLength) {
        this.xMsBlobContentLength = xMsBlobContentLength;
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
     * @return the PageBlobsGetPageRangesDiffHeaders object itself.
     */
    public PageBlobsGetPageRangesDiffHeaders setETag(String eTag) {
        this.eTag = eTag;
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
     * @return the PageBlobsGetPageRangesDiffHeaders object itself.
     */
    public PageBlobsGetPageRangesDiffHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
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
     * @return the PageBlobsGetPageRangesDiffHeaders object itself.
     */
    public PageBlobsGetPageRangesDiffHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the xMsClientRequestId property: The x-ms-client-request-id property.
     * 
     * @return the xMsClientRequestId value.
     */
    public String getXMsClientRequestId() {
        return this.xMsClientRequestId;
    }

    /**
     * Set the xMsClientRequestId property: The x-ms-client-request-id property.
     * 
     * @param xMsClientRequestId the xMsClientRequestId value to set.
     * @return the PageBlobsGetPageRangesDiffHeaders object itself.
     */
    public PageBlobsGetPageRangesDiffHeaders setXMsClientRequestId(String xMsClientRequestId) {
        this.xMsClientRequestId = xMsClientRequestId;
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
     * @return the PageBlobsGetPageRangesDiffHeaders object itself.
     */
    public PageBlobsGetPageRangesDiffHeaders setDate(OffsetDateTime date) {
        if (date == null) {
            this.date = null;
        } else {
            this.date = new DateTimeRfc1123(date);
        }
        return this;
    }
}
