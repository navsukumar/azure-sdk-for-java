// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SqlSourceParameter model. */
@Fluent
public final class SqlSourceParameter {
    /*
     * Database connection string
     */
    @JsonProperty(value = "connectionString")
    private String connectionString;

    /*
     * Query script
     */
    @JsonProperty(value = "query", required = true)
    private String query;

    /**
     * Get the connectionString property: Database connection string.
     *
     * @return the connectionString value.
     */
    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: Database connection string.
     *
     * @param connectionString the connectionString value to set.
     * @return the SqlSourceParameter object itself.
     */
    public SqlSourceParameter setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the query property: Query script.
     *
     * @return the query value.
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * Set the query property: Query script.
     *
     * @param query the query value to set.
     * @return the SqlSourceParameter object itself.
     */
    public SqlSourceParameter setQuery(String query) {
        this.query = query;
        return this;
    }
}
