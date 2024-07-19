// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.redis.fluent.models.RedisFirewallRuleInner;

/**
 * Parameters required for creating a firewall rule on redis cache. (Note, you can just use the FirewallRule type
 * instead now.).
 */
@Fluent
public final class RedisFirewallRuleCreateParameters extends RedisFirewallRuleInner {
    /**
     * Creates an instance of RedisFirewallRuleCreateParameters class.
     */
    public RedisFirewallRuleCreateParameters() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedisFirewallRuleCreateParameters withStartIp(String startIp) {
        super.withStartIp(startIp);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedisFirewallRuleCreateParameters withEndIp(String endIp) {
        super.withEndIp(endIp);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
