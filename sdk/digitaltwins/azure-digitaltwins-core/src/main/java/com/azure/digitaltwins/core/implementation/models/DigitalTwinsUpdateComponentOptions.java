// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.digitaltwins.core.implementation.models;

import com.azure.core.annotation.Fluent;

/**
 * Parameter group.
 */
@Fluent
public final class DigitalTwinsUpdateComponentOptions {
    /*
     * Identifies the request in a distributed tracing system.
     */
    private String traceparent;

    /*
     * Provides vendor-specific trace identification information and is a companion to traceparent.
     */
    private String tracestate;

    /*
     * Only perform the operation if the entity's etag matches one of the etags provided or * is provided.
     */
    private String ifMatch;

    /**
     * Creates an instance of DigitalTwinsUpdateComponentOptions class.
     */
    public DigitalTwinsUpdateComponentOptions() {
    }

    /**
     * Get the traceparent property: Identifies the request in a distributed tracing system.
     * 
     * @return the traceparent value.
     */
    public String getTraceparent() {
        return this.traceparent;
    }

    /**
     * Set the traceparent property: Identifies the request in a distributed tracing system.
     * 
     * @param traceparent the traceparent value to set.
     * @return the DigitalTwinsUpdateComponentOptions object itself.
     */
    public DigitalTwinsUpdateComponentOptions setTraceparent(String traceparent) {
        this.traceparent = traceparent;
        return this;
    }

    /**
     * Get the tracestate property: Provides vendor-specific trace identification information and is a companion to
     * traceparent.
     * 
     * @return the tracestate value.
     */
    public String getTracestate() {
        return this.tracestate;
    }

    /**
     * Set the tracestate property: Provides vendor-specific trace identification information and is a companion to
     * traceparent.
     * 
     * @param tracestate the tracestate value to set.
     * @return the DigitalTwinsUpdateComponentOptions object itself.
     */
    public DigitalTwinsUpdateComponentOptions setTracestate(String tracestate) {
        this.tracestate = tracestate;
        return this;
    }

    /**
     * Get the ifMatch property: Only perform the operation if the entity's etag matches one of the etags provided or *
     * is provided.
     * 
     * @return the ifMatch value.
     */
    public String getIfMatch() {
        return this.ifMatch;
    }

    /**
     * Set the ifMatch property: Only perform the operation if the entity's etag matches one of the etags provided or *
     * is provided.
     * 
     * @param ifMatch the ifMatch value to set.
     * @return the DigitalTwinsUpdateComponentOptions object itself.
     */
    public DigitalTwinsUpdateComponentOptions setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
        return this;
    }
}
