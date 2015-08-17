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

import com.microsoft.windowsazure.core.OperationResponse;

/**
* Response for GetNetworkSecurityGroup Api service call
*/
public class NetworkSecurityGroupGetResponse extends OperationResponse {
    private NetworkSecurityGroup networkSecurityGroup;
    
    /**
    * Optional. Gets a Network Security Group in a resource group
    * @return The NetworkSecurityGroup value.
    */
    public NetworkSecurityGroup getNetworkSecurityGroup() {
        return this.networkSecurityGroup;
    }
    
    /**
    * Optional. Gets a Network Security Group in a resource group
    * @param networkSecurityGroupValue The NetworkSecurityGroup value.
    */
    public void setNetworkSecurityGroup(final NetworkSecurityGroup networkSecurityGroupValue) {
        this.networkSecurityGroup = networkSecurityGroupValue;
    }
}
