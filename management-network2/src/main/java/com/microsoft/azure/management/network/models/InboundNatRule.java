/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.network.models;

/**
* Inbound NAT rule of the loadbalancer
*/
public class InboundNatRule extends ChildResource {
    private ResourceId backendIPConfiguration;
    
    /**
    * Optional. Gets or sets a reference to a private ip address defined on a
    * NetworkInterface of a VM. Traffic sent to frontendPort of each of the
    * frontendIPConfigurations is forwarded to the backed IP
    * @return The BackendIPConfiguration value.
    */
    public ResourceId getBackendIPConfiguration() {
        return this.backendIPConfiguration;
    }
    
    /**
    * Optional. Gets or sets a reference to a private ip address defined on a
    * NetworkInterface of a VM. Traffic sent to frontendPort of each of the
    * frontendIPConfigurations is forwarded to the backed IP
    * @param backendIPConfigurationValue The BackendIPConfiguration value.
    */
    public void setBackendIPConfiguration(final ResourceId backendIPConfigurationValue) {
        this.backendIPConfiguration = backendIPConfigurationValue;
    }
    
    private int backendPort;
    
    /**
    * Optional. Gets or sets a port used for internal connections on the
    * endpoint. The localPort attribute maps the eternal port of the endpoint
    * to an internal port on a role. This is useful in scenarios where a role
    * must communicate to an internal compotnent on a port that is different
    * from the one that is exposed externally. If not specified, the value of
    * localPort is the same as the port attribute. Set the value of localPort
    * to '*' to automatically assign an unallocated port that is discoverable
    * using the runtime API
    * @return The BackendPort value.
    */
    public int getBackendPort() {
        return this.backendPort;
    }
    
    /**
    * Optional. Gets or sets a port used for internal connections on the
    * endpoint. The localPort attribute maps the eternal port of the endpoint
    * to an internal port on a role. This is useful in scenarios where a role
    * must communicate to an internal compotnent on a port that is different
    * from the one that is exposed externally. If not specified, the value of
    * localPort is the same as the port attribute. Set the value of localPort
    * to '*' to automatically assign an unallocated port that is discoverable
    * using the runtime API
    * @param backendPortValue The BackendPort value.
    */
    public void setBackendPort(final int backendPortValue) {
        this.backendPort = backendPortValue;
    }
    
    private boolean enableFloatingIP;
    
    /**
    * Required. Configures a virtual machine's endpoint for the floating IP
    * capability required to configure a SQL AlwaysOn availability Group. This
    * setting is required when using the SQL Always ON availability Groups in
    * SQL server. This setting can't be changed after you create the endpoint
    * @return The EnableFloatingIP value.
    */
    public boolean isEnableFloatingIP() {
        return this.enableFloatingIP;
    }
    
    /**
    * Required. Configures a virtual machine's endpoint for the floating IP
    * capability required to configure a SQL AlwaysOn availability Group. This
    * setting is required when using the SQL Always ON availability Groups in
    * SQL server. This setting can't be changed after you create the endpoint
    * @param enableFloatingIPValue The EnableFloatingIP value.
    */
    public void setEnableFloatingIP(final boolean enableFloatingIPValue) {
        this.enableFloatingIP = enableFloatingIPValue;
    }
    
    private ResourceId frontendIPConfiguration;
    
    /**
    * Optional. Gets or sets a reference to frontend IP Addresses
    * @return The FrontendIPConfiguration value.
    */
    public ResourceId getFrontendIPConfiguration() {
        return this.frontendIPConfiguration;
    }
    
    /**
    * Optional. Gets or sets a reference to frontend IP Addresses
    * @param frontendIPConfigurationValue The FrontendIPConfiguration value.
    */
    public void setFrontendIPConfiguration(final ResourceId frontendIPConfigurationValue) {
        this.frontendIPConfiguration = frontendIPConfigurationValue;
    }
    
    private int frontendPort;
    
    /**
    * Required. Gets or sets the port for the external endpoint. You can spcify
    * any port number you choose, but the port numbers specified for each role
    * in the service must be unique. Possible values range between 1 and
    * 65535, inclusive
    * @return The FrontendPort value.
    */
    public int getFrontendPort() {
        return this.frontendPort;
    }
    
    /**
    * Required. Gets or sets the port for the external endpoint. You can spcify
    * any port number you choose, but the port numbers specified for each role
    * in the service must be unique. Possible values range between 1 and
    * 65535, inclusive
    * @param frontendPortValue The FrontendPort value.
    */
    public void setFrontendPort(final int frontendPortValue) {
        this.frontendPort = frontendPortValue;
    }
    
    private Integer idleTimeoutInMinutes;
    
    /**
    * Optional. Gets or sets the timeout for the Tcp idle connection. The value
    * can be set between 4 and 30 minutes. The default value is 4 minutes.
    * This emlement is only used when the protocol is set to Tcp
    * @return The IdleTimeoutInMinutes value.
    */
    public Integer getIdleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }
    
    /**
    * Optional. Gets or sets the timeout for the Tcp idle connection. The value
    * can be set between 4 and 30 minutes. The default value is 4 minutes.
    * This emlement is only used when the protocol is set to Tcp
    * @param idleTimeoutInMinutesValue The IdleTimeoutInMinutes value.
    */
    public void setIdleTimeoutInMinutes(final Integer idleTimeoutInMinutesValue) {
        this.idleTimeoutInMinutes = idleTimeoutInMinutesValue;
    }
    
    private String protocol;
    
    /**
    * Required. Gets or sets the transport potocol for the external endpoint.
    * Possible values are Udp or Tcp
    * @return The Protocol value.
    */
    public String getProtocol() {
        return this.protocol;
    }
    
    /**
    * Required. Gets or sets the transport potocol for the external endpoint.
    * Possible values are Udp or Tcp
    * @param protocolValue The Protocol value.
    */
    public void setProtocol(final String protocolValue) {
        this.protocol = protocolValue;
    }
    
    private String provisioningState;
    
    /**
    * Optional. Gets or sets Provisioning state of the PublicIP resource
    * Updating/Deleting/Failed
    * @return The ProvisioningState value.
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    
    /**
    * Optional. Gets or sets Provisioning state of the PublicIP resource
    * Updating/Deleting/Failed
    * @param provisioningStateValue The ProvisioningState value.
    */
    public void setProvisioningState(final String provisioningStateValue) {
        this.provisioningState = provisioningStateValue;
    }
    
    /**
    * Initializes a new instance of the InboundNatRule class.
    *
    */
    public InboundNatRule() {
        super();
    }
    
    /**
    * Initializes a new instance of the InboundNatRule class with required
    * arguments.
    *
    * @param protocol Gets or sets the transport potocol for the external
    * endpoint. Possible values are Udp or Tcp
    * @param frontendPort Gets or sets the port for the external endpoint. You
    * can spcify any port number you choose, but the port numbers specified
    * for each role in the service must be unique. Possible values range
    * between 1 and 65535, inclusive
    * @param enableFloatingIP Configures a virtual machine's endpoint for the
    * floating IP capability required to configure a SQL AlwaysOn availability
    * Group. This setting is required when using the SQL Always ON
    * availability Groups in SQL server. This setting can't be changed after
    * you create the endpoint
    */
    public InboundNatRule(String protocol, int frontendPort, boolean enableFloatingIP) {
        if (protocol == null) {
            throw new NullPointerException("protocol");
        }
        this.setProtocol(protocol);
        this.setFrontendPort(frontendPort);
        this.setEnableFloatingIP(enableFloatingIP);
    }
}
