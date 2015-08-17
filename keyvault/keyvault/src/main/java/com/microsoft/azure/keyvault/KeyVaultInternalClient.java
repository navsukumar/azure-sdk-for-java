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

package com.microsoft.azure.keyvault;

import java.io.Closeable;
import java.net.URI;

import com.microsoft.windowsazure.core.FilterableService;
import com.microsoft.windowsazure.credentials.CloudCredentials;

interface KeyVaultInternalClient extends Closeable, FilterableService<KeyVaultInternalClient> {
    /**
     * Gets the API version.
     *
     * @return The ApiVersion value.
     */
    String getApiVersion();

    /**
     * Gets the URI used as the base for all cloud service requests.
     *
     * @return The BaseUri value.
     */
    URI getBaseUri();

    /**
     * Gets or sets the credential
     *
     * @return The Credentials value.
     */
    CloudCredentials getCredentials();

    /**
     * Gets or sets the credential
     *
     * @param credentialsValue
     *            The Credentials value.
     */
    void setCredentials(final CloudCredentials credentialsValue);

    /**
     * Gets or sets the initial timeout for Long Running Operations.
     *
     * @return The LongRunningOperationInitialTimeout value.
     */
    int getLongRunningOperationInitialTimeout();

    /**
     * Gets or sets the initial timeout for Long Running Operations.
     *
     * @param longRunningOperationInitialTimeoutValue
     *            The LongRunningOperationInitialTimeout value.
     */
    void setLongRunningOperationInitialTimeout(final int longRunningOperationInitialTimeoutValue);

    /**
     * Gets or sets the retry timeout for Long Running Operations.
     *
     * @return The LongRunningOperationRetryTimeout value.
     */
    int getLongRunningOperationRetryTimeout();

    /**
     * Gets or sets the retry timeout for Long Running Operations.
     *
     * @param longRunningOperationRetryTimeoutValue
     *            The LongRunningOperationRetryTimeout value.
     */
    void setLongRunningOperationRetryTimeout(final int longRunningOperationRetryTimeoutValue);

    /**
     * Cryptographic and management operations for keys in a vault
     *
     * @return The KeysOperations value.
     */
    KeyOperations getKeysOperations();

    /**
     * Operations for secrets in a vault
     *
     * @return The SecretsOperations value.
     */
    SecretOperations getSecretsOperations();
}
