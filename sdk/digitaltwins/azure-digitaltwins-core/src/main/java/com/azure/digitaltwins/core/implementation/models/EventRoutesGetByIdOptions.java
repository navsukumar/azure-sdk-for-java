// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.digitaltwins.core.implementation.models;

import com.azure.core.annotation.Fluent;

/**
 * Parameter group.
 */
@Fluent
public final class EventRoutesGetByIdOptions {
    /*
     * Identifies the request in a distributed tracing system.
     */
    private String traceparent;

    /*
     * Provides vendor-specific trace identification information and is a companion to traceparent.
     */
    private String tracestate;

    /**
     * Creates an instance of EventRoutesGetByIdOptions class.
     */
    public EventRoutesGetByIdOptions() {
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
     * @return the EventRoutesGetByIdOptions object itself.
     */
    public EventRoutesGetByIdOptions setTraceparent(String traceparent) {
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
     * @return the EventRoutesGetByIdOptions object itself.
     */
    public EventRoutesGetByIdOptions setTracestate(String tracestate) {
        this.tracestate = tracestate;
        return this;
    }
}
