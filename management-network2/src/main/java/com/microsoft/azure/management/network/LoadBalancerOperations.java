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

package com.microsoft.azure.management.network;

import com.microsoft.azure.management.network.models.AzureAsyncOperationResponse;
import com.microsoft.azure.management.network.models.LoadBalancer;
import com.microsoft.azure.management.network.models.LoadBalancerGetResponse;
import com.microsoft.azure.management.network.models.LoadBalancerListResponse;
import com.microsoft.azure.management.network.models.LoadBalancerPutResponse;
import com.microsoft.azure.management.network.models.UpdateOperationResponse;
import com.microsoft.windowsazure.core.OperationResponse;
import com.microsoft.windowsazure.exception.ServiceException;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
* The Network Resource Provider API includes operations for managing the load
* balancers for your subscription.
*/
public interface LoadBalancerOperations {
    /**
    * The Put LoadBalancer operation creates/updates a LoadBalancer
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param loadBalancerName Required. The name of the loadBalancer.
    * @param parameters Required. Parameters supplied to the create/delete
    * LoadBalancer operation
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Response of a PUT Load Balancer operation
    */
    LoadBalancerPutResponse beginCreateOrUpdating(String resourceGroupName, String loadBalancerName, LoadBalancer parameters) throws IOException, ServiceException;
    
    /**
    * The Put LoadBalancer operation creates/updates a LoadBalancer
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param loadBalancerName Required. The name of the loadBalancer.
    * @param parameters Required. Parameters supplied to the create/delete
    * LoadBalancer operation
    * @return Response of a PUT Load Balancer operation
    */
    Future<LoadBalancerPutResponse> beginCreateOrUpdatingAsync(String resourceGroupName, String loadBalancerName, LoadBalancer parameters);
    
    /**
    * The delete loadbalancer operation deletes the specified loadbalancer.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param loadBalancerName Required. The name of the loadBalancer.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return If the resource provide needs to return an error to any
    * operation, it should return the appropriate HTTP error code and a
    * message body as can be seen below.The message should be localized per
    * the Accept-Language header specified in the original request such thatit
    * could be directly be exposed to users
    */
    UpdateOperationResponse beginDeleting(String resourceGroupName, String loadBalancerName) throws IOException, ServiceException;
    
    /**
    * The delete loadbalancer operation deletes the specified loadbalancer.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param loadBalancerName Required. The name of the loadBalancer.
    * @return If the resource provide needs to return an error to any
    * operation, it should return the appropriate HTTP error code and a
    * message body as can be seen below.The message should be localized per
    * the Accept-Language header specified in the original request such thatit
    * could be directly be exposed to users
    */
    Future<UpdateOperationResponse> beginDeletingAsync(String resourceGroupName, String loadBalancerName);
    
    /**
    * The Put LoadBalancer operation creates/updates a LoadBalancer
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param loadBalancerName Required. The name of the loadBalancer.
    * @param parameters Required. Parameters supplied to the create/update
    * LoadBalancer operation
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @throws IOException Thrown if there was an error setting up tracing for
    * the request.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request. If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request and error information regarding the failure.
    */
    AzureAsyncOperationResponse createOrUpdate(String resourceGroupName, String loadBalancerName, LoadBalancer parameters) throws InterruptedException, ExecutionException, IOException;
    
    /**
    * The Put LoadBalancer operation creates/updates a LoadBalancer
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param loadBalancerName Required. The name of the loadBalancer.
    * @param parameters Required. Parameters supplied to the create/update
    * LoadBalancer operation
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request. If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request and error information regarding the failure.
    */
    Future<AzureAsyncOperationResponse> createOrUpdateAsync(String resourceGroupName, String loadBalancerName, LoadBalancer parameters);
    
    /**
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param loadBalancerName Required. The name of the loadBalancer.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @throws IOException Thrown if there was an error setting up tracing for
    * the request.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse delete(String resourceGroupName, String loadBalancerName) throws InterruptedException, ExecutionException, IOException;
    
    /**
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param loadBalancerName Required. The name of the loadBalancer.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> deleteAsync(String resourceGroupName, String loadBalancerName);
    
    /**
    * The Get ntework interface operation retreives information about the
    * specified network interface.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param loadBalancerName Required. The name of the loadBalancer.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Response of a GET Load Balancer operation
    */
    LoadBalancerGetResponse get(String resourceGroupName, String loadBalancerName) throws IOException, ServiceException;
    
    /**
    * The Get ntework interface operation retreives information about the
    * specified network interface.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param loadBalancerName Required. The name of the loadBalancer.
    * @return Response of a GET Load Balancer operation
    */
    Future<LoadBalancerGetResponse> getAsync(String resourceGroupName, String loadBalancerName);
    
    /**
    * The List loadBalancer opertion retrieves all the loadbalancers in a
    * resource group.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Response for ListLoadBalancers Api service call
    */
    LoadBalancerListResponse list(String resourceGroupName) throws IOException, ServiceException;
    
    /**
    * The List loadBalancer opertion retrieves all the loadbalancers in a
    * resource group.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @return Response for ListLoadBalancers Api service call
    */
    Future<LoadBalancerListResponse> listAsync(String resourceGroupName);
    
    /**
    * The List loadBalancer opertion retrieves all the loadbalancers in a
    * subscription.
    *
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Response for ListLoadBalancers Api service call
    */
    LoadBalancerListResponse listAll() throws IOException, ServiceException;
    
    /**
    * The List loadBalancer opertion retrieves all the loadbalancers in a
    * subscription.
    *
    * @return Response for ListLoadBalancers Api service call
    */
    Future<LoadBalancerListResponse> listAllAsync();
}
