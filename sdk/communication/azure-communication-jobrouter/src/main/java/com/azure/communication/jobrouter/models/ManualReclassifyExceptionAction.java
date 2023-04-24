// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.List;

/** An action that manually reclassifies a job by providing the queue, priority and worker selectors. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("manual-reclassify")
@Fluent
public final class ManualReclassifyExceptionAction extends ExceptionAction {
    /*
     * Updated QueueId.
     */
    @JsonProperty(value = "queueId")
    private String queueId;

    /*
     * Updated Priority.
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /*
     * Updated WorkerSelectors.
     */
    @JsonProperty(value = "workerSelectors")
    private List<WorkerSelector> workerSelectors;

    /**
     * Get the queueId property: Updated QueueId.
     *
     * @return the queueId value.
     */
    public String getQueueId() {
        return this.queueId;
    }

    /**
     * Set the queueId property: Updated QueueId.
     *
     * @param queueId the queueId value to set.
     * @return the ManualReclassifyExceptionAction object itself.
     */
    public ManualReclassifyExceptionAction setQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }

    /**
     * Get the priority property: Updated Priority.
     *
     * @return the priority value.
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * Set the priority property: Updated Priority.
     *
     * @param priority the priority value to set.
     * @return the ManualReclassifyExceptionAction object itself.
     */
    public ManualReclassifyExceptionAction setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the workerSelectors property: Updated WorkerSelectors.
     *
     * @return the workerSelectors value.
     */
    public List<WorkerSelector> getWorkerSelectors() {
        return this.workerSelectors;
    }

    /**
     * Set the workerSelectors property: Updated WorkerSelectors.
     *
     * @param workerSelectors the workerSelectors value to set.
     * @return the ManualReclassifyExceptionAction object itself.
     */
    public ManualReclassifyExceptionAction setWorkerSelectors(List<WorkerSelector> workerSelectors) {
        this.workerSelectors = workerSelectors;
        return this;
    }
}
