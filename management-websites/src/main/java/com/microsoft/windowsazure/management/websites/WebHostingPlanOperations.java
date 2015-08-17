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

package com.microsoft.windowsazure.management.websites;

import com.microsoft.windowsazure.core.OperationResponse;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.websites.models.WebHostingPlanCreateParameters;
import com.microsoft.windowsazure.management.websites.models.WebHostingPlanCreateResponse;
import com.microsoft.windowsazure.management.websites.models.WebHostingPlanGetHistoricalUsageMetricsParameters;
import com.microsoft.windowsazure.management.websites.models.WebHostingPlanGetHistoricalUsageMetricsResponse;
import com.microsoft.windowsazure.management.websites.models.WebHostingPlanGetResponse;
import com.microsoft.windowsazure.management.websites.models.WebHostingPlanListResponse;
import com.microsoft.windowsazure.management.websites.models.WebHostingPlanUpdateParameters;
import com.microsoft.windowsazure.management.websites.models.WebHostingPlanUpdateResponse;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.Future;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

/**
* Operations for managing web hosting plans beneath your subscription.
*/
public interface WebHostingPlanOperations {
    /**
    * Creates a new Web Hosting Plan.  (see
    * http://azure.microsoft.com/en-us/documentation/articles/azure-web-sites-web-hosting-plans-in-depth-overview/
    * for more information)
    *
    * @param webSpaceName Required. The name of the web space.
    * @param parameters Required. Web Hosting Plan Parameters.
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The Create Web Web Hosting Plan operation response.
    */
    WebHostingPlanCreateResponse create(String webSpaceName, WebHostingPlanCreateParameters parameters) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException, URISyntaxException;
    
    /**
    * Creates a new Web Hosting Plan.  (see
    * http://azure.microsoft.com/en-us/documentation/articles/azure-web-sites-web-hosting-plans-in-depth-overview/
    * for more information)
    *
    * @param webSpaceName Required. The name of the web space.
    * @param parameters Required. Web Hosting Plan Parameters.
    * @return The Create Web Web Hosting Plan operation response.
    */
    Future<WebHostingPlanCreateResponse> createAsync(String webSpaceName, WebHostingPlanCreateParameters parameters);
    
    /**
    * Deletes a Web Hosting Plan  (see
    * http://azure.microsoft.com/en-us/documentation/articles/azure-web-sites-web-hosting-plans-in-depth-overview/
    * for more information)
    *
    * @param webSpaceName Required. The name of the web space.
    * @param webHostingPlanName Required. The name of the web hosting plan.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse delete(String webSpaceName, String webHostingPlanName) throws IOException, ServiceException;
    
    /**
    * Deletes a Web Hosting Plan  (see
    * http://azure.microsoft.com/en-us/documentation/articles/azure-web-sites-web-hosting-plans-in-depth-overview/
    * for more information)
    *
    * @param webSpaceName Required. The name of the web space.
    * @param webHostingPlanName Required. The name of the web hosting plan.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> deleteAsync(String webSpaceName, String webHostingPlanName);
    
    /**
    * Gets details of an existing Web Hosting Plan  (see
    * http://azure.microsoft.com/en-us/documentation/articles/azure-web-sites-web-hosting-plans-in-depth-overview/
    * for more information)
    *
    * @param webSpaceName Required. The name of the web space.
    * @param webHostingPlanName Required. The name of the web hosting plan.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The Get Web Hosting Plan operation response.
    */
    WebHostingPlanGetResponse get(String webSpaceName, String webHostingPlanName) throws IOException, ServiceException, ParserConfigurationException, SAXException, URISyntaxException;
    
    /**
    * Gets details of an existing Web Hosting Plan  (see
    * http://azure.microsoft.com/en-us/documentation/articles/azure-web-sites-web-hosting-plans-in-depth-overview/
    * for more information)
    *
    * @param webSpaceName Required. The name of the web space.
    * @param webHostingPlanName Required. The name of the web hosting plan.
    * @return The Get Web Hosting Plan operation response.
    */
    Future<WebHostingPlanGetResponse> getAsync(String webSpaceName, String webHostingPlanName);
    
    /**
    * You can retrieve historical usage metrics for a site by issuing an HTTP
    * GET request.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn166964.aspx for
    * more information)
    *
    * @param webSpaceName Required. The name of the web space.
    * @param webHostingPlanName Required. The name of the web hosting plan.
    * @param parameters Required. Parameters supplied to the Get Historical
    * Usage Metrics Web hosting plan operation.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return The Get Historical Usage Metrics Web hosting plan operation
    * response.
    */
    WebHostingPlanGetHistoricalUsageMetricsResponse getHistoricalUsageMetrics(String webSpaceName, String webHostingPlanName, WebHostingPlanGetHistoricalUsageMetricsParameters parameters) throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * You can retrieve historical usage metrics for a site by issuing an HTTP
    * GET request.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn166964.aspx for
    * more information)
    *
    * @param webSpaceName Required. The name of the web space.
    * @param webHostingPlanName Required. The name of the web hosting plan.
    * @param parameters Required. Parameters supplied to the Get Historical
    * Usage Metrics Web hosting plan operation.
    * @return The Get Historical Usage Metrics Web hosting plan operation
    * response.
    */
    Future<WebHostingPlanGetHistoricalUsageMetricsResponse> getHistoricalUsageMetricsAsync(String webSpaceName, String webHostingPlanName, WebHostingPlanGetHistoricalUsageMetricsParameters parameters);
    
    /**
    * You can list the web spaces under the current subscription by issuing a
    * GET request.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn166961.aspx for
    * more information)
    *
    * @param webSpaceName Required. The name of the web space.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return The List Web Hosting Plans operation response.
    */
    WebHostingPlanListResponse list(String webSpaceName) throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * You can list the web spaces under the current subscription by issuing a
    * GET request.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn166961.aspx for
    * more information)
    *
    * @param webSpaceName Required. The name of the web space.
    * @return The List Web Hosting Plans operation response.
    */
    Future<WebHostingPlanListResponse> listAsync(String webSpaceName);
    
    /**
    * Updates an existing Web Hosting Plan.  (see
    * http://azure.microsoft.com/en-us/documentation/articles/azure-web-sites-web-hosting-plans-in-depth-overview/
    * for more information)
    *
    * @param webSpaceName Required. The name of the web space.
    * @param webHostingPlanName Required. The name of the web hosting plan.
    * @param parameters Required. Parameters supplied to the Update Web Hosting
    * Plan operation.
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The Create Web Hosting Plan operation response.
    */
    WebHostingPlanUpdateResponse update(String webSpaceName, String webHostingPlanName, WebHostingPlanUpdateParameters parameters) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException, URISyntaxException;
    
    /**
    * Updates an existing Web Hosting Plan.  (see
    * http://azure.microsoft.com/en-us/documentation/articles/azure-web-sites-web-hosting-plans-in-depth-overview/
    * for more information)
    *
    * @param webSpaceName Required. The name of the web space.
    * @param webHostingPlanName Required. The name of the web hosting plan.
    * @param parameters Required. Parameters supplied to the Update Web Hosting
    * Plan operation.
    * @return The Create Web Hosting Plan operation response.
    */
    Future<WebHostingPlanUpdateResponse> updateAsync(String webSpaceName, String webHostingPlanName, WebHostingPlanUpdateParameters parameters);
}
