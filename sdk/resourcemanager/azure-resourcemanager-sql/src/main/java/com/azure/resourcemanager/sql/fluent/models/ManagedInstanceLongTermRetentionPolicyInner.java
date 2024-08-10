// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A long term retention policy.
 */
@Fluent
public final class ManagedInstanceLongTermRetentionPolicyInner extends ProxyResource {
    /*
     * Resource properties.
     */
    private BaseLongTermRetentionPolicyProperties innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of ManagedInstanceLongTermRetentionPolicyInner class.
     */
    public ManagedInstanceLongTermRetentionPolicyInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     * 
     * @return the innerProperties value.
     */
    private BaseLongTermRetentionPolicyProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the weeklyRetention property: The weekly retention policy for an LTR backup in an ISO 8601 format.
     * 
     * @return the weeklyRetention value.
     */
    public String weeklyRetention() {
        return this.innerProperties() == null ? null : this.innerProperties().weeklyRetention();
    }

    /**
     * Set the weeklyRetention property: The weekly retention policy for an LTR backup in an ISO 8601 format.
     * 
     * @param weeklyRetention the weeklyRetention value to set.
     * @return the ManagedInstanceLongTermRetentionPolicyInner object itself.
     */
    public ManagedInstanceLongTermRetentionPolicyInner withWeeklyRetention(String weeklyRetention) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BaseLongTermRetentionPolicyProperties();
        }
        this.innerProperties().withWeeklyRetention(weeklyRetention);
        return this;
    }

    /**
     * Get the monthlyRetention property: The monthly retention policy for an LTR backup in an ISO 8601 format.
     * 
     * @return the monthlyRetention value.
     */
    public String monthlyRetention() {
        return this.innerProperties() == null ? null : this.innerProperties().monthlyRetention();
    }

    /**
     * Set the monthlyRetention property: The monthly retention policy for an LTR backup in an ISO 8601 format.
     * 
     * @param monthlyRetention the monthlyRetention value to set.
     * @return the ManagedInstanceLongTermRetentionPolicyInner object itself.
     */
    public ManagedInstanceLongTermRetentionPolicyInner withMonthlyRetention(String monthlyRetention) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BaseLongTermRetentionPolicyProperties();
        }
        this.innerProperties().withMonthlyRetention(monthlyRetention);
        return this;
    }

    /**
     * Get the yearlyRetention property: The yearly retention policy for an LTR backup in an ISO 8601 format.
     * 
     * @return the yearlyRetention value.
     */
    public String yearlyRetention() {
        return this.innerProperties() == null ? null : this.innerProperties().yearlyRetention();
    }

    /**
     * Set the yearlyRetention property: The yearly retention policy for an LTR backup in an ISO 8601 format.
     * 
     * @param yearlyRetention the yearlyRetention value to set.
     * @return the ManagedInstanceLongTermRetentionPolicyInner object itself.
     */
    public ManagedInstanceLongTermRetentionPolicyInner withYearlyRetention(String yearlyRetention) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BaseLongTermRetentionPolicyProperties();
        }
        this.innerProperties().withYearlyRetention(yearlyRetention);
        return this;
    }

    /**
     * Get the weekOfYear property: The week of year to take the yearly backup in an ISO 8601 format.
     * 
     * @return the weekOfYear value.
     */
    public Integer weekOfYear() {
        return this.innerProperties() == null ? null : this.innerProperties().weekOfYear();
    }

    /**
     * Set the weekOfYear property: The week of year to take the yearly backup in an ISO 8601 format.
     * 
     * @param weekOfYear the weekOfYear value to set.
     * @return the ManagedInstanceLongTermRetentionPolicyInner object itself.
     */
    public ManagedInstanceLongTermRetentionPolicyInner withWeekOfYear(Integer weekOfYear) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BaseLongTermRetentionPolicyProperties();
        }
        this.innerProperties().withWeekOfYear(weekOfYear);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedInstanceLongTermRetentionPolicyInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedInstanceLongTermRetentionPolicyInner if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ManagedInstanceLongTermRetentionPolicyInner.
     */
    public static ManagedInstanceLongTermRetentionPolicyInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedInstanceLongTermRetentionPolicyInner deserializedManagedInstanceLongTermRetentionPolicyInner
                = new ManagedInstanceLongTermRetentionPolicyInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedManagedInstanceLongTermRetentionPolicyInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedManagedInstanceLongTermRetentionPolicyInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedManagedInstanceLongTermRetentionPolicyInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedManagedInstanceLongTermRetentionPolicyInner.innerProperties
                        = BaseLongTermRetentionPolicyProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedInstanceLongTermRetentionPolicyInner;
        });
    }
}
