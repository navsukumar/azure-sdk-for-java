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

package com.microsoft.azure.management.sql.models;

import com.microsoft.windowsazure.core.LazyArrayList;
import com.microsoft.windowsazure.core.OperationResponse;
import java.util.ArrayList;
import java.util.Iterator;

/**
* Represents the response to a List data masking rules request.
*/
public class DataMaskingRuleListResponse extends OperationResponse implements Iterable<DataMaskingRule> {
    private ArrayList<DataMaskingRule> dataMaskingRules;
    
    /**
    * Optional. Gets or sets the list of Azure Sql Database data masking rules
    * @return The DataMaskingRules value.
    */
    public ArrayList<DataMaskingRule> getDataMaskingRules() {
        return this.dataMaskingRules;
    }
    
    /**
    * Optional. Gets or sets the list of Azure Sql Database data masking rules
    * @param dataMaskingRulesValue The DataMaskingRules value.
    */
    public void setDataMaskingRules(final ArrayList<DataMaskingRule> dataMaskingRulesValue) {
        this.dataMaskingRules = dataMaskingRulesValue;
    }
    
    /**
    * Initializes a new instance of the DataMaskingRuleListResponse class.
    *
    */
    public DataMaskingRuleListResponse() {
        super();
        this.setDataMaskingRules(new LazyArrayList<DataMaskingRule>());
    }
    
    /**
    * Gets the sequence of DataMaskingRules.
    *
    */
    public Iterator<DataMaskingRule> iterator() {
        return this.getDataMaskingRules().iterator();
    }
}
