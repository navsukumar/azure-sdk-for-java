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

package com.microsoft.windowsazure.management.storage;

import com.microsoft.windowsazure.core.OperationStatus;
import com.microsoft.windowsazure.core.OperationStatusResponse;
import com.microsoft.windowsazure.core.ServiceClient;
import com.microsoft.windowsazure.core.utils.BOMInputStream;
import com.microsoft.windowsazure.core.utils.XmlUtility;
import com.microsoft.windowsazure.credentials.SubscriptionCloudCredentials;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.configuration.ManagementConfiguration;
import com.microsoft.windowsazure.tracing.CloudTracing;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.inject.Inject;
import javax.inject.Named;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
* The Service Management API provides programmatic access to much of the
* functionality available through the Management Portal. The Service
* Management API is a REST API. All API operations are performed over SSL and
* are mutually authenticated using X.509 v3 certificates.  (see
* http://msdn.microsoft.com/en-us/library/windowsazure/ee460799.aspx for more
* information)
*/
public class StorageManagementClientImpl extends ServiceClient<StorageManagementClient> implements StorageManagementClient {
    private String apiVersion;
    
    /**
    * Gets the API version.
    * @return The ApiVersion value.
    */
    public String getApiVersion() {
        return this.apiVersion;
    }
    
    private URI baseUri;
    
    /**
    * Gets the URI used as the base for all cloud service requests.
    * @return The BaseUri value.
    */
    public URI getBaseUri() {
        return this.baseUri;
    }
    
    private SubscriptionCloudCredentials credentials;
    
    /**
    * Gets subscription credentials which uniquely identify Microsoft Azure
    * subscription. The subscription ID forms part of the URI for every
    * service call.
    * @return The Credentials value.
    */
    public SubscriptionCloudCredentials getCredentials() {
        return this.credentials;
    }
    
    private int longRunningOperationInitialTimeout;
    
    /**
    * Gets or sets the initial timeout for Long Running Operations.
    * @return The LongRunningOperationInitialTimeout value.
    */
    public int getLongRunningOperationInitialTimeout() {
        return this.longRunningOperationInitialTimeout;
    }
    
    /**
    * Gets or sets the initial timeout for Long Running Operations.
    * @param longRunningOperationInitialTimeoutValue The
    * LongRunningOperationInitialTimeout value.
    */
    public void setLongRunningOperationInitialTimeout(final int longRunningOperationInitialTimeoutValue) {
        this.longRunningOperationInitialTimeout = longRunningOperationInitialTimeoutValue;
    }
    
    private int longRunningOperationRetryTimeout;
    
    /**
    * Gets or sets the retry timeout for Long Running Operations.
    * @return The LongRunningOperationRetryTimeout value.
    */
    public int getLongRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }
    
    /**
    * Gets or sets the retry timeout for Long Running Operations.
    * @param longRunningOperationRetryTimeoutValue The
    * LongRunningOperationRetryTimeout value.
    */
    public void setLongRunningOperationRetryTimeout(final int longRunningOperationRetryTimeoutValue) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeoutValue;
    }
    
    private StorageAccountOperations storageAccounts;
    
    /**
    * The Service Management API includes operations for managing the storage
    * accounts beneath your subscription.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/ee460790.aspx for
    * more information)
    * @return The StorageAccountsOperations value.
    */
    public StorageAccountOperations getStorageAccountsOperations() {
        return this.storageAccounts;
    }
    
    /**
    * Initializes a new instance of the StorageManagementClientImpl class.
    *
    * @param httpBuilder The HTTP client builder.
    * @param executorService The executor service.
    */
    public StorageManagementClientImpl(HttpClientBuilder httpBuilder, ExecutorService executorService) {
        super(httpBuilder, executorService);
        this.storageAccounts = new StorageAccountOperationsImpl(this);
        this.apiVersion = "2014-10-01";
        this.longRunningOperationInitialTimeout = -1;
        this.longRunningOperationRetryTimeout = -1;
    }
    
    /**
    * Initializes a new instance of the StorageManagementClientImpl class.
    *
    * @param httpBuilder The HTTP client builder.
    * @param executorService The executor service.
    * @param credentials Required. Gets subscription credentials which uniquely
    * identify Microsoft Azure subscription. The subscription ID forms part of
    * the URI for every service call.
    * @param baseUri Optional. Gets the URI used as the base for all cloud
    * service requests.
    */
    @Inject
    public StorageManagementClientImpl(HttpClientBuilder httpBuilder, ExecutorService executorService, @Named(ManagementConfiguration.SUBSCRIPTION_CLOUD_CREDENTIALS) SubscriptionCloudCredentials credentials, @Named(ManagementConfiguration.URI) URI baseUri) {
        this(httpBuilder, executorService);
        if (credentials == null) {
            throw new NullPointerException("credentials");
        } else {
            this.credentials = credentials;
        }
        if (baseUri == null) {
            try {
                this.baseUri = new URI("https://management.core.windows.net");
            }
            catch (URISyntaxException ex) {
            }
        } else {
            this.baseUri = baseUri;
        }
    }
    
    /**
    * Initializes a new instance of the StorageManagementClientImpl class.
    *
    * @param httpBuilder The HTTP client builder.
    * @param executorService The executor service.
    * @param credentials Required. Gets subscription credentials which uniquely
    * identify Microsoft Azure subscription. The subscription ID forms part of
    * the URI for every service call.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    */
    public StorageManagementClientImpl(HttpClientBuilder httpBuilder, ExecutorService executorService, SubscriptionCloudCredentials credentials) throws URISyntaxException {
        this(httpBuilder, executorService);
        if (credentials == null) {
            throw new NullPointerException("credentials");
        }
        this.credentials = credentials;
        this.baseUri = new URI("https://management.core.windows.net");
    }
    
    /**
    * Initializes a new instance of the StorageManagementClientImpl class.
    *
    * @param httpBuilder The HTTP client builder.
    * @param executorService The executor service.
    * @param credentials Required. Gets subscription credentials which uniquely
    * identify Microsoft Azure subscription. The subscription ID forms part of
    * the URI for every service call.
    * @param baseUri Optional. Gets the URI used as the base for all cloud
    * service requests.
    * @param apiVersion Optional. Gets the API version.
    * @param longRunningOperationInitialTimeout Required. Gets or sets the
    * initial timeout for Long Running Operations.
    * @param longRunningOperationRetryTimeout Required. Gets or sets the retry
    * timeout for Long Running Operations.
    */
    public StorageManagementClientImpl(HttpClientBuilder httpBuilder, ExecutorService executorService, SubscriptionCloudCredentials credentials, URI baseUri, String apiVersion, int longRunningOperationInitialTimeout, int longRunningOperationRetryTimeout) {
        this(httpBuilder, executorService);
        this.credentials = credentials;
        this.baseUri = baseUri;
        this.apiVersion = apiVersion;
        this.longRunningOperationInitialTimeout = longRunningOperationInitialTimeout;
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
    }
    
    /**
    * Initializes a new instance of the StorageManagementClientImpl class.
    *
    * @param httpBuilder The HTTP client builder.
    * @param executorService The executor service.
    */
    protected StorageManagementClientImpl newInstance(HttpClientBuilder httpBuilder, ExecutorService executorService) {
        return new StorageManagementClientImpl(httpBuilder, executorService, this.getCredentials(), this.getBaseUri(), this.getApiVersion(), this.getLongRunningOperationInitialTimeout(), this.getLongRunningOperationRetryTimeout());
    }
    
    /**
    * The Get Operation Status operation returns the status of the specified
    * operation. After calling an asynchronous operation, you can call Get
    * Operation Status to determine whether the operation has succeeded,
    * failed, or is still in progress.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/ee460783.aspx for
    * more information)
    *
    * @param requestId Required. The request ID for the request you wish to
    * track. The request ID is returned in the x-ms-request-id response header
    * for every request.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request. If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request and error information regarding the failure.
    */
    @Override
    public Future<OperationStatusResponse> getOperationStatusAsync(final String requestId) {
        return this.getExecutorService().submit(new Callable<OperationStatusResponse>() { 
            @Override
            public OperationStatusResponse call() throws Exception {
                return getOperationStatus(requestId);
            }
         });
    }
    
    /**
    * The Get Operation Status operation returns the status of the specified
    * operation. After calling an asynchronous operation, you can call Get
    * Operation Status to determine whether the operation has succeeded,
    * failed, or is still in progress.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/ee460783.aspx for
    * more information)
    *
    * @param requestId Required. The request ID for the request you wish to
    * track. The request ID is returned in the x-ms-request-id response header
    * for every request.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request. If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request and error information regarding the failure.
    */
    @Override
    public OperationStatusResponse getOperationStatus(String requestId) throws IOException, ServiceException, ParserConfigurationException, SAXException {
        // Validate
        if (requestId == null) {
            throw new NullPointerException("requestId");
        }
        
        // Tracing
        boolean shouldTrace = CloudTracing.getIsEnabled();
        String invocationId = null;
        if (shouldTrace) {
            invocationId = Long.toString(CloudTracing.getNextInvocationId());
            HashMap<String, Object> tracingParameters = new HashMap<String, Object>();
            tracingParameters.put("requestId", requestId);
            CloudTracing.enter(invocationId, this, "getOperationStatusAsync", tracingParameters);
        }
        
        // Construct URL
        String url = "";
        url = url + "/";
        if (this.getCredentials().getSubscriptionId() != null) {
            url = url + URLEncoder.encode(this.getCredentials().getSubscriptionId(), "UTF-8");
        }
        url = url + "/operations/";
        url = url + URLEncoder.encode(requestId, "UTF-8");
        String baseUrl = this.getBaseUri().toString();
        // Trim '/' character from the end of baseUrl and beginning of url.
        if (baseUrl.charAt(baseUrl.length() - 1) == '/') {
            baseUrl = baseUrl.substring(0, (baseUrl.length() - 1) + 0);
        }
        if (url.charAt(0) == '/') {
            url = url.substring(1);
        }
        url = baseUrl + "/" + url;
        url = url.replace(" ", "%20");
        
        // Create HTTP transport objects
        HttpGet httpRequest = new HttpGet(url);
        
        // Set Headers
        httpRequest.setHeader("x-ms-version", "2014-10-01");
        
        // Send Request
        HttpResponse httpResponse = null;
        try {
            if (shouldTrace) {
                CloudTracing.sendRequest(invocationId, httpRequest);
            }
            httpResponse = this.getHttpClient().execute(httpRequest);
            if (shouldTrace) {
                CloudTracing.receiveResponse(invocationId, httpResponse);
            }
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_OK) {
                ServiceException ex = ServiceException.createFromXml(httpRequest, null, httpResponse, httpResponse.getEntity());
                if (shouldTrace) {
                    CloudTracing.error(invocationId, ex);
                }
                throw ex;
            }
            
            // Create Result
            OperationStatusResponse result = null;
            // Deserialize Response
            if (statusCode == HttpStatus.SC_OK) {
                InputStream responseContent = httpResponse.getEntity().getContent();
                result = new OperationStatusResponse();
                DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
                documentBuilderFactory.setNamespaceAware(true);
                DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
                Document responseDoc = documentBuilder.parse(new BOMInputStream(responseContent));
                
                Element operationElement = XmlUtility.getElementByTagNameNS(responseDoc, "http://schemas.microsoft.com/windowsazure", "Operation");
                if (operationElement != null) {
                    Element idElement = XmlUtility.getElementByTagNameNS(operationElement, "http://schemas.microsoft.com/windowsazure", "ID");
                    if (idElement != null) {
                        String idInstance;
                        idInstance = idElement.getTextContent();
                        result.setId(idInstance);
                    }
                    
                    Element statusElement = XmlUtility.getElementByTagNameNS(operationElement, "http://schemas.microsoft.com/windowsazure", "Status");
                    if (statusElement != null && statusElement.getTextContent() != null && !statusElement.getTextContent().isEmpty()) {
                        OperationStatus statusInstance;
                        statusInstance = OperationStatus.valueOf(statusElement.getTextContent().toUpperCase());
                        result.setStatus(statusInstance);
                    }
                    
                    Element httpStatusCodeElement = XmlUtility.getElementByTagNameNS(operationElement, "http://schemas.microsoft.com/windowsazure", "HttpStatusCode");
                    if (httpStatusCodeElement != null && httpStatusCodeElement.getTextContent() != null && !httpStatusCodeElement.getTextContent().isEmpty()) {
                        Integer httpStatusCodeInstance;
                        httpStatusCodeInstance = Integer.valueOf(httpStatusCodeElement.getTextContent().toUpperCase());
                        result.setHttpStatusCode(httpStatusCodeInstance);
                    }
                    
                    Element errorElement = XmlUtility.getElementByTagNameNS(operationElement, "http://schemas.microsoft.com/windowsazure", "Error");
                    if (errorElement != null) {
                        OperationStatusResponse.ErrorDetails errorInstance = new OperationStatusResponse.ErrorDetails();
                        result.setError(errorInstance);
                        
                        Element codeElement = XmlUtility.getElementByTagNameNS(errorElement, "http://schemas.microsoft.com/windowsazure", "Code");
                        if (codeElement != null) {
                            String codeInstance;
                            codeInstance = codeElement.getTextContent();
                            errorInstance.setCode(codeInstance);
                        }
                        
                        Element messageElement = XmlUtility.getElementByTagNameNS(errorElement, "http://schemas.microsoft.com/windowsazure", "Message");
                        if (messageElement != null) {
                            String messageInstance;
                            messageInstance = messageElement.getTextContent();
                            errorInstance.setMessage(messageInstance);
                        }
                    }
                }
                
            }
            result.setStatusCode(statusCode);
            if (httpResponse.getHeaders("x-ms-request-id").length > 0) {
                result.setRequestId(httpResponse.getFirstHeader("x-ms-request-id").getValue());
            }
            
            if (shouldTrace) {
                CloudTracing.exit(invocationId, result);
            }
            return result;
        } finally {
            if (httpResponse != null && httpResponse.getEntity() != null) {
                httpResponse.getEntity().getContent().close();
            }
        }
    }
}
