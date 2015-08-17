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

package com.microsoft.azure.management.websites.models;

import com.microsoft.windowsazure.core.LazyHashMap;
import java.util.HashMap;

public class ResourceBase {
    private String id;
    
    /**
    * Optional. Gets the ID of the resource.
    * @return The Id value.
    */
    public String getId() {
        return this.id;
    }
    
    /**
    * Optional. Gets the ID of the resource.
    * @param idValue The Id value.
    */
    public void setId(final String idValue) {
        this.id = idValue;
    }
    
    private String location;
    
    /**
    * Required. Gets or sets the location of the resource.
    * @return The Location value.
    */
    public String getLocation() {
        return this.location;
    }
    
    /**
    * Required. Gets or sets the location of the resource.
    * @param locationValue The Location value.
    */
    public void setLocation(final String locationValue) {
        this.location = locationValue;
    }
    
    private String name;
    
    /**
    * Optional. The name of the resource.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional. The name of the resource.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private HashMap<String, String> tags;
    
    /**
    * Optional. Gets or sets the tags attached to the resource.
    * @return The Tags value.
    */
    public HashMap<String, String> getTags() {
        return this.tags;
    }
    
    /**
    * Optional. Gets or sets the tags attached to the resource.
    * @param tagsValue The Tags value.
    */
    public void setTags(final HashMap<String, String> tagsValue) {
        this.tags = tagsValue;
    }
    
    private String type;
    
    /**
    * Optional. The type of the resource
    * @return The Type value.
    */
    public String getType() {
        return this.type;
    }
    
    /**
    * Optional. The type of the resource
    * @param typeValue The Type value.
    */
    public void setType(final String typeValue) {
        this.type = typeValue;
    }
    
    /**
    * Initializes a new instance of the ResourceBase class.
    *
    */
    public ResourceBase() {
        this.setTags(new LazyHashMap<String, String>());
    }
    
    /**
    * Initializes a new instance of the ResourceBase class with required
    * arguments.
    *
    * @param location Gets or sets the location of the resource.
    */
    public ResourceBase(String location) {
        this();
        if (location == null) {
            throw new NullPointerException("location");
        }
        this.setLocation(location);
    }
}
