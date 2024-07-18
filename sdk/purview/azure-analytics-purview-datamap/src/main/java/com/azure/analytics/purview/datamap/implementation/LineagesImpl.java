// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap.implementation;

import com.azure.analytics.purview.datamap.PurviewDataMapServiceVersion;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in Lineages.
 */
public final class LineagesImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final LineagesService service;

    /**
     * The service client containing this operation class.
     */
    private final DataMapClientImpl client;

    /**
     * Initializes an instance of LineagesImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    LineagesImpl(DataMapClientImpl client) {
        this.service = RestProxy.create(LineagesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * Gets Service version.
     * 
     * @return the serviceVersion value.
     */
    public PurviewDataMapServiceVersion getServiceVersion() {
        return client.getServiceVersion();
    }

    /**
     * The interface defining all the services for DataMapClientLineages to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{endpoint}/datamap/api")
    @ServiceInterface(name = "DataMapClientLineage")
    public interface LineagesService {
        @Get("/atlas/v2/lineage/{guid}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> get(@HostParam("endpoint") String endpoint, @PathParam("guid") String guid,
            @QueryParam("direction") String direction, @HeaderParam("accept") String accept,
            RequestOptions requestOptions, Context context);

        @Get("/atlas/v2/lineage/{guid}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> getSync(@HostParam("endpoint") String endpoint, @PathParam("guid") String guid,
            @QueryParam("direction") String direction, @HeaderParam("accept") String accept,
            RequestOptions requestOptions, Context context);

        @Get("/lineage/{guid}/next/")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> getNextPage(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("guid") String guid,
            @QueryParam("direction") String direction, @HeaderParam("accept") String accept,
            RequestOptions requestOptions, Context context);

        @Get("/lineage/{guid}/next/")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> getNextPageSync(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("guid") String guid,
            @QueryParam("direction") String direction, @HeaderParam("accept") String accept,
            RequestOptions requestOptions, Context context);

        @Get("/atlas/v2/lineage/uniqueAttribute/type/{typeName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> getByUniqueAttribute(@HostParam("endpoint") String endpoint,
            @PathParam("typeName") String typeName, @QueryParam("direction") String direction,
            @HeaderParam("accept") String accept, RequestOptions requestOptions, Context context);

        @Get("/atlas/v2/lineage/uniqueAttribute/type/{typeName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> getByUniqueAttributeSync(@HostParam("endpoint") String endpoint,
            @PathParam("typeName") String typeName, @QueryParam("direction") String direction,
            @HeaderParam("accept") String accept, RequestOptions requestOptions, Context context);
    }

    /**
     * Get lineage info of the entity specified by GUID.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>depth</td><td>Integer</td><td>No</td><td>The number of hops for lineage.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     baseEntityGuid: String (Optional)
     *     guidEntityMap (Optional): {
     *         String (Required): {
     *             attributes (Optional): {
     *                 String: Object (Required)
     *             }
     *             typeName: String (Optional)
     *             lastModifiedTS: String (Optional)
     *             classificationNames (Optional): [
     *                 String (Optional)
     *             ]
     *             classifications (Optional): [
     *                  (Optional){
     *                     attributes (Optional): {
     *                         String: Object (Required)
     *                     }
     *                     typeName: String (Optional)
     *                     lastModifiedTS: String (Optional)
     *                     entityGuid: String (Optional)
     *                     entityStatus: String(ACTIVE/DELETED) (Optional)
     *                     removePropagationsOnEntityDelete: Boolean (Optional)
     *                     validityPeriods (Optional): [
     *                          (Optional){
     *                             endTime: String (Optional)
     *                             startTime: String (Optional)
     *                             timeZone: String (Optional)
     *                         }
     *                     ]
     *                 }
     *             ]
     *             displayText: String (Optional)
     *             guid: String (Optional)
     *             isIncomplete: Boolean (Optional)
     *             labels (Optional): [
     *                 String (Optional)
     *             ]
     *             meaningNames (Optional): [
     *                 String (Optional)
     *             ]
     *             meanings (Optional): [
     *                  (Optional){
     *                     confidence: Integer (Optional)
     *                     createdBy: String (Optional)
     *                     description: String (Optional)
     *                     displayText: String (Optional)
     *                     expression: String (Optional)
     *                     relationGuid: String (Optional)
     *                     status: String(DISCOVERED/PROPOSED/IMPORTED/VALIDATED/DEPRECATED/OBSOLETE/OTHER) (Optional)
     *                     steward: String (Optional)
     *                     termGuid: String (Optional)
     *                 }
     *             ]
     *             status: String(ACTIVE/DELETED) (Optional)
     *         }
     *     }
     *     widthCounts (Optional): {
     *         String (Required): {
     *             String: Object (Required)
     *         }
     *     }
     *     lineageDepth: Integer (Optional)
     *     lineageWidth: Integer (Optional)
     *     childrenCount: Integer (Optional)
     *     lineageDirection: String(INPUT/OUTPUT/BOTH) (Optional)
     *     parentRelations (Optional): [
     *          (Optional){
     *             childEntityId: String (Optional)
     *             relationshipId: String (Optional)
     *             parentEntityId: String (Optional)
     *         }
     *     ]
     *     relations (Optional): [
     *          (Optional){
     *             fromEntityId: String (Optional)
     *             relationshipId: String (Optional)
     *             toEntityId: String (Optional)
     *         }
     *     ]
     * }
     * }</pre>
     * 
     * @param guid The globally unique identifier of the entity.
     * @param direction The direction of the lineage, which could be INPUT, OUTPUT or BOTH. Allowed values: "INPUT",
     * "OUTPUT", "BOTH".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return lineage info of the entity specified by GUID along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponseAsync(String guid, String direction,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
            context -> service.get(this.client.getEndpoint(), guid, direction, accept, requestOptions, context));
    }

    /**
     * Get lineage info of the entity specified by GUID.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>depth</td><td>Integer</td><td>No</td><td>The number of hops for lineage.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     baseEntityGuid: String (Optional)
     *     guidEntityMap (Optional): {
     *         String (Required): {
     *             attributes (Optional): {
     *                 String: Object (Required)
     *             }
     *             typeName: String (Optional)
     *             lastModifiedTS: String (Optional)
     *             classificationNames (Optional): [
     *                 String (Optional)
     *             ]
     *             classifications (Optional): [
     *                  (Optional){
     *                     attributes (Optional): {
     *                         String: Object (Required)
     *                     }
     *                     typeName: String (Optional)
     *                     lastModifiedTS: String (Optional)
     *                     entityGuid: String (Optional)
     *                     entityStatus: String(ACTIVE/DELETED) (Optional)
     *                     removePropagationsOnEntityDelete: Boolean (Optional)
     *                     validityPeriods (Optional): [
     *                          (Optional){
     *                             endTime: String (Optional)
     *                             startTime: String (Optional)
     *                             timeZone: String (Optional)
     *                         }
     *                     ]
     *                 }
     *             ]
     *             displayText: String (Optional)
     *             guid: String (Optional)
     *             isIncomplete: Boolean (Optional)
     *             labels (Optional): [
     *                 String (Optional)
     *             ]
     *             meaningNames (Optional): [
     *                 String (Optional)
     *             ]
     *             meanings (Optional): [
     *                  (Optional){
     *                     confidence: Integer (Optional)
     *                     createdBy: String (Optional)
     *                     description: String (Optional)
     *                     displayText: String (Optional)
     *                     expression: String (Optional)
     *                     relationGuid: String (Optional)
     *                     status: String(DISCOVERED/PROPOSED/IMPORTED/VALIDATED/DEPRECATED/OBSOLETE/OTHER) (Optional)
     *                     steward: String (Optional)
     *                     termGuid: String (Optional)
     *                 }
     *             ]
     *             status: String(ACTIVE/DELETED) (Optional)
     *         }
     *     }
     *     widthCounts (Optional): {
     *         String (Required): {
     *             String: Object (Required)
     *         }
     *     }
     *     lineageDepth: Integer (Optional)
     *     lineageWidth: Integer (Optional)
     *     childrenCount: Integer (Optional)
     *     lineageDirection: String(INPUT/OUTPUT/BOTH) (Optional)
     *     parentRelations (Optional): [
     *          (Optional){
     *             childEntityId: String (Optional)
     *             relationshipId: String (Optional)
     *             parentEntityId: String (Optional)
     *         }
     *     ]
     *     relations (Optional): [
     *          (Optional){
     *             fromEntityId: String (Optional)
     *             relationshipId: String (Optional)
     *             toEntityId: String (Optional)
     *         }
     *     ]
     * }
     * }</pre>
     * 
     * @param guid The globally unique identifier of the entity.
     * @param direction The direction of the lineage, which could be INPUT, OUTPUT or BOTH. Allowed values: "INPUT",
     * "OUTPUT", "BOTH".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return lineage info of the entity specified by GUID along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(String guid, String direction, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.getSync(this.client.getEndpoint(), guid, direction, accept, requestOptions, Context.NONE);
    }

    /**
     * Return immediate next page lineage info about entity with pagination.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>offset</td><td>Integer</td><td>No</td><td>The offset for pagination purpose.</td></tr>
     * <tr><td>limit</td><td>Integer</td><td>No</td><td>The page size - by default there is no paging.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     baseEntityGuid: String (Optional)
     *     guidEntityMap (Optional): {
     *         String (Required): {
     *             attributes (Optional): {
     *                 String: Object (Required)
     *             }
     *             typeName: String (Optional)
     *             lastModifiedTS: String (Optional)
     *             classificationNames (Optional): [
     *                 String (Optional)
     *             ]
     *             classifications (Optional): [
     *                  (Optional){
     *                     attributes (Optional): {
     *                         String: Object (Required)
     *                     }
     *                     typeName: String (Optional)
     *                     lastModifiedTS: String (Optional)
     *                     entityGuid: String (Optional)
     *                     entityStatus: String(ACTIVE/DELETED) (Optional)
     *                     removePropagationsOnEntityDelete: Boolean (Optional)
     *                     validityPeriods (Optional): [
     *                          (Optional){
     *                             endTime: String (Optional)
     *                             startTime: String (Optional)
     *                             timeZone: String (Optional)
     *                         }
     *                     ]
     *                 }
     *             ]
     *             displayText: String (Optional)
     *             guid: String (Optional)
     *             isIncomplete: Boolean (Optional)
     *             labels (Optional): [
     *                 String (Optional)
     *             ]
     *             meaningNames (Optional): [
     *                 String (Optional)
     *             ]
     *             meanings (Optional): [
     *                  (Optional){
     *                     confidence: Integer (Optional)
     *                     createdBy: String (Optional)
     *                     description: String (Optional)
     *                     displayText: String (Optional)
     *                     expression: String (Optional)
     *                     relationGuid: String (Optional)
     *                     status: String(DISCOVERED/PROPOSED/IMPORTED/VALIDATED/DEPRECATED/OBSOLETE/OTHER) (Optional)
     *                     steward: String (Optional)
     *                     termGuid: String (Optional)
     *                 }
     *             ]
     *             status: String(ACTIVE/DELETED) (Optional)
     *         }
     *     }
     *     widthCounts (Optional): {
     *         String (Required): {
     *             String: Object (Required)
     *         }
     *     }
     *     lineageDepth: Integer (Optional)
     *     lineageWidth: Integer (Optional)
     *     childrenCount: Integer (Optional)
     *     lineageDirection: String(INPUT/OUTPUT/BOTH) (Optional)
     *     parentRelations (Optional): [
     *          (Optional){
     *             childEntityId: String (Optional)
     *             relationshipId: String (Optional)
     *             parentEntityId: String (Optional)
     *         }
     *     ]
     *     relations (Optional): [
     *          (Optional){
     *             fromEntityId: String (Optional)
     *             relationshipId: String (Optional)
     *             toEntityId: String (Optional)
     *         }
     *     ]
     * }
     * }</pre>
     * 
     * @param guid The globally unique identifier of the entity.
     * @param direction The direction of the lineage, which could be INPUT, OUTPUT or BOTH. Allowed values: "INPUT",
     * "OUTPUT", "BOTH".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the lineage information along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getNextPageWithResponseAsync(String guid, String direction,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.getNextPage(this.client.getEndpoint(),
            this.client.getServiceVersion().getVersion(), guid, direction, accept, requestOptions, context));
    }

    /**
     * Return immediate next page lineage info about entity with pagination.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>offset</td><td>Integer</td><td>No</td><td>The offset for pagination purpose.</td></tr>
     * <tr><td>limit</td><td>Integer</td><td>No</td><td>The page size - by default there is no paging.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     baseEntityGuid: String (Optional)
     *     guidEntityMap (Optional): {
     *         String (Required): {
     *             attributes (Optional): {
     *                 String: Object (Required)
     *             }
     *             typeName: String (Optional)
     *             lastModifiedTS: String (Optional)
     *             classificationNames (Optional): [
     *                 String (Optional)
     *             ]
     *             classifications (Optional): [
     *                  (Optional){
     *                     attributes (Optional): {
     *                         String: Object (Required)
     *                     }
     *                     typeName: String (Optional)
     *                     lastModifiedTS: String (Optional)
     *                     entityGuid: String (Optional)
     *                     entityStatus: String(ACTIVE/DELETED) (Optional)
     *                     removePropagationsOnEntityDelete: Boolean (Optional)
     *                     validityPeriods (Optional): [
     *                          (Optional){
     *                             endTime: String (Optional)
     *                             startTime: String (Optional)
     *                             timeZone: String (Optional)
     *                         }
     *                     ]
     *                 }
     *             ]
     *             displayText: String (Optional)
     *             guid: String (Optional)
     *             isIncomplete: Boolean (Optional)
     *             labels (Optional): [
     *                 String (Optional)
     *             ]
     *             meaningNames (Optional): [
     *                 String (Optional)
     *             ]
     *             meanings (Optional): [
     *                  (Optional){
     *                     confidence: Integer (Optional)
     *                     createdBy: String (Optional)
     *                     description: String (Optional)
     *                     displayText: String (Optional)
     *                     expression: String (Optional)
     *                     relationGuid: String (Optional)
     *                     status: String(DISCOVERED/PROPOSED/IMPORTED/VALIDATED/DEPRECATED/OBSOLETE/OTHER) (Optional)
     *                     steward: String (Optional)
     *                     termGuid: String (Optional)
     *                 }
     *             ]
     *             status: String(ACTIVE/DELETED) (Optional)
     *         }
     *     }
     *     widthCounts (Optional): {
     *         String (Required): {
     *             String: Object (Required)
     *         }
     *     }
     *     lineageDepth: Integer (Optional)
     *     lineageWidth: Integer (Optional)
     *     childrenCount: Integer (Optional)
     *     lineageDirection: String(INPUT/OUTPUT/BOTH) (Optional)
     *     parentRelations (Optional): [
     *          (Optional){
     *             childEntityId: String (Optional)
     *             relationshipId: String (Optional)
     *             parentEntityId: String (Optional)
     *         }
     *     ]
     *     relations (Optional): [
     *          (Optional){
     *             fromEntityId: String (Optional)
     *             relationshipId: String (Optional)
     *             toEntityId: String (Optional)
     *         }
     *     ]
     * }
     * }</pre>
     * 
     * @param guid The globally unique identifier of the entity.
     * @param direction The direction of the lineage, which could be INPUT, OUTPUT or BOTH. Allowed values: "INPUT",
     * "OUTPUT", "BOTH".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the lineage information along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getNextPageWithResponse(String guid, String direction, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.getNextPageSync(this.client.getEndpoint(), this.client.getServiceVersion().getVersion(), guid,
            direction, accept, requestOptions, Context.NONE);
    }

    /**
     * Return lineage info about entity.
     * 
     * In addition to the typeName path parameter,
     * attribute key-value pair(s) can be provided in the following
     * format
     * 
     * attr:[attrName]=[attrValue]
     * 
     * NOTE: The attrName and attrValue should be
     * unique across entities, eg. qualifiedName.
     * 
     * The REST request would look
     * something like this:
     * 
     * GET
     * /v2/lineage/uniqueAttribute/type/aType?attr:aTypeAttribute=someValue.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>depth</td><td>Integer</td><td>No</td><td>The number of hops for lineage.</td></tr>
     * <tr><td>attr:qualifiedName</td><td>String</td><td>No</td><td>The qualified name of the entity. (This is only an
     * example. qualifiedName can
     * be changed to other unique attributes)</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     baseEntityGuid: String (Optional)
     *     guidEntityMap (Optional): {
     *         String (Required): {
     *             attributes (Optional): {
     *                 String: Object (Required)
     *             }
     *             typeName: String (Optional)
     *             lastModifiedTS: String (Optional)
     *             classificationNames (Optional): [
     *                 String (Optional)
     *             ]
     *             classifications (Optional): [
     *                  (Optional){
     *                     attributes (Optional): {
     *                         String: Object (Required)
     *                     }
     *                     typeName: String (Optional)
     *                     lastModifiedTS: String (Optional)
     *                     entityGuid: String (Optional)
     *                     entityStatus: String(ACTIVE/DELETED) (Optional)
     *                     removePropagationsOnEntityDelete: Boolean (Optional)
     *                     validityPeriods (Optional): [
     *                          (Optional){
     *                             endTime: String (Optional)
     *                             startTime: String (Optional)
     *                             timeZone: String (Optional)
     *                         }
     *                     ]
     *                 }
     *             ]
     *             displayText: String (Optional)
     *             guid: String (Optional)
     *             isIncomplete: Boolean (Optional)
     *             labels (Optional): [
     *                 String (Optional)
     *             ]
     *             meaningNames (Optional): [
     *                 String (Optional)
     *             ]
     *             meanings (Optional): [
     *                  (Optional){
     *                     confidence: Integer (Optional)
     *                     createdBy: String (Optional)
     *                     description: String (Optional)
     *                     displayText: String (Optional)
     *                     expression: String (Optional)
     *                     relationGuid: String (Optional)
     *                     status: String(DISCOVERED/PROPOSED/IMPORTED/VALIDATED/DEPRECATED/OBSOLETE/OTHER) (Optional)
     *                     steward: String (Optional)
     *                     termGuid: String (Optional)
     *                 }
     *             ]
     *             status: String(ACTIVE/DELETED) (Optional)
     *         }
     *     }
     *     widthCounts (Optional): {
     *         String (Required): {
     *             String: Object (Required)
     *         }
     *     }
     *     lineageDepth: Integer (Optional)
     *     lineageWidth: Integer (Optional)
     *     childrenCount: Integer (Optional)
     *     lineageDirection: String(INPUT/OUTPUT/BOTH) (Optional)
     *     parentRelations (Optional): [
     *          (Optional){
     *             childEntityId: String (Optional)
     *             relationshipId: String (Optional)
     *             parentEntityId: String (Optional)
     *         }
     *     ]
     *     relations (Optional): [
     *          (Optional){
     *             fromEntityId: String (Optional)
     *             relationshipId: String (Optional)
     *             toEntityId: String (Optional)
     *         }
     *     ]
     * }
     * }</pre>
     * 
     * @param typeName The name of the type.
     * @param direction The direction of the lineage, which could be INPUT, OUTPUT or BOTH. Allowed values: "INPUT",
     * "OUTPUT", "BOTH".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the lineage information along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getByUniqueAttributeWithResponseAsync(String typeName, String direction,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.getByUniqueAttribute(this.client.getEndpoint(), typeName,
            direction, accept, requestOptions, context));
    }

    /**
     * Return lineage info about entity.
     * 
     * In addition to the typeName path parameter,
     * attribute key-value pair(s) can be provided in the following
     * format
     * 
     * attr:[attrName]=[attrValue]
     * 
     * NOTE: The attrName and attrValue should be
     * unique across entities, eg. qualifiedName.
     * 
     * The REST request would look
     * something like this:
     * 
     * GET
     * /v2/lineage/uniqueAttribute/type/aType?attr:aTypeAttribute=someValue.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>depth</td><td>Integer</td><td>No</td><td>The number of hops for lineage.</td></tr>
     * <tr><td>attr:qualifiedName</td><td>String</td><td>No</td><td>The qualified name of the entity. (This is only an
     * example. qualifiedName can
     * be changed to other unique attributes)</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     baseEntityGuid: String (Optional)
     *     guidEntityMap (Optional): {
     *         String (Required): {
     *             attributes (Optional): {
     *                 String: Object (Required)
     *             }
     *             typeName: String (Optional)
     *             lastModifiedTS: String (Optional)
     *             classificationNames (Optional): [
     *                 String (Optional)
     *             ]
     *             classifications (Optional): [
     *                  (Optional){
     *                     attributes (Optional): {
     *                         String: Object (Required)
     *                     }
     *                     typeName: String (Optional)
     *                     lastModifiedTS: String (Optional)
     *                     entityGuid: String (Optional)
     *                     entityStatus: String(ACTIVE/DELETED) (Optional)
     *                     removePropagationsOnEntityDelete: Boolean (Optional)
     *                     validityPeriods (Optional): [
     *                          (Optional){
     *                             endTime: String (Optional)
     *                             startTime: String (Optional)
     *                             timeZone: String (Optional)
     *                         }
     *                     ]
     *                 }
     *             ]
     *             displayText: String (Optional)
     *             guid: String (Optional)
     *             isIncomplete: Boolean (Optional)
     *             labels (Optional): [
     *                 String (Optional)
     *             ]
     *             meaningNames (Optional): [
     *                 String (Optional)
     *             ]
     *             meanings (Optional): [
     *                  (Optional){
     *                     confidence: Integer (Optional)
     *                     createdBy: String (Optional)
     *                     description: String (Optional)
     *                     displayText: String (Optional)
     *                     expression: String (Optional)
     *                     relationGuid: String (Optional)
     *                     status: String(DISCOVERED/PROPOSED/IMPORTED/VALIDATED/DEPRECATED/OBSOLETE/OTHER) (Optional)
     *                     steward: String (Optional)
     *                     termGuid: String (Optional)
     *                 }
     *             ]
     *             status: String(ACTIVE/DELETED) (Optional)
     *         }
     *     }
     *     widthCounts (Optional): {
     *         String (Required): {
     *             String: Object (Required)
     *         }
     *     }
     *     lineageDepth: Integer (Optional)
     *     lineageWidth: Integer (Optional)
     *     childrenCount: Integer (Optional)
     *     lineageDirection: String(INPUT/OUTPUT/BOTH) (Optional)
     *     parentRelations (Optional): [
     *          (Optional){
     *             childEntityId: String (Optional)
     *             relationshipId: String (Optional)
     *             parentEntityId: String (Optional)
     *         }
     *     ]
     *     relations (Optional): [
     *          (Optional){
     *             fromEntityId: String (Optional)
     *             relationshipId: String (Optional)
     *             toEntityId: String (Optional)
     *         }
     *     ]
     * }
     * }</pre>
     * 
     * @param typeName The name of the type.
     * @param direction The direction of the lineage, which could be INPUT, OUTPUT or BOTH. Allowed values: "INPUT",
     * "OUTPUT", "BOTH".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the lineage information along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getByUniqueAttributeWithResponse(String typeName, String direction,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.getByUniqueAttributeSync(this.client.getEndpoint(), typeName, direction, accept, requestOptions,
            Context.NONE);
    }
}
