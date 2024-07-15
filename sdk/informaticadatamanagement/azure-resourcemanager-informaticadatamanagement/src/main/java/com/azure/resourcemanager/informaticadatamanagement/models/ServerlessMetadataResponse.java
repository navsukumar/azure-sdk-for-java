// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.models;

import com.azure.resourcemanager.informaticadatamanagement.fluent.models.ServerlessMetadataResponseInner;

/**
 * An immutable client-side representation of ServerlessMetadataResponse.
 */
public interface ServerlessMetadataResponse {
    /**
     * Gets the type property: type of the runtime environment.
     * 
     * @return the type value.
     */
    RuntimeType type();

    /**
     * Gets the serverlessConfigProperties property: serverless config properties.
     * 
     * @return the serverlessConfigProperties value.
     */
    ServerlessConfigProperties serverlessConfigProperties();

    /**
     * Gets the serverlessRuntimeConfigProperties property: serverless runtime config properties.
     * 
     * @return the serverlessRuntimeConfigProperties value.
     */
    ServerlessRuntimeConfigProperties serverlessRuntimeConfigProperties();

    /**
     * Gets the inner com.azure.resourcemanager.informaticadatamanagement.fluent.models.ServerlessMetadataResponseInner
     * object.
     * 
     * @return the inner object.
     */
    ServerlessMetadataResponseInner innerModel();
}
