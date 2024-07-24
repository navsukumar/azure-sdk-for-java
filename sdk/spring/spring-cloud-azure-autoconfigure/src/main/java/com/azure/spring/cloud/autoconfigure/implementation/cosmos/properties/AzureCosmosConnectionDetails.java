// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.autoconfigure.implementation.cosmos.properties;

import com.azure.cosmos.ConnectionMode;
import org.springframework.boot.autoconfigure.service.connection.ConnectionDetails;

public interface AzureCosmosConnectionDetails extends ConnectionDetails {

    String getEndpoint();

    String getKey();

    String getDatabase();

    Boolean getEndpointDiscoveryEnabled();

    ConnectionMode getConnectionMode();
}
