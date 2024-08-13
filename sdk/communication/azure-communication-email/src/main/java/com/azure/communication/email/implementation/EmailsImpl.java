// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.email.implementation;

import com.azure.communication.email.implementation.models.EmailMessage;
import com.azure.communication.email.implementation.models.EmailSendResult;
import com.azure.communication.email.implementation.models.EmailsGetSendResultResponse;
import com.azure.communication.email.implementation.models.EmailsSendResponse;
import com.azure.communication.email.implementation.models.ErrorResponseException;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.DefaultPollingStrategy;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.PollingStrategyOptions;
import com.azure.core.util.serializer.TypeReference;
import java.time.Duration;
import java.util.UUID;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in Emails.
 */
public final class EmailsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final EmailsService service;

    /**
     * The service client containing this operation class.
     */
    private final AzureCommunicationEmailServiceImpl client;

    /**
     * Initializes an instance of EmailsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    EmailsImpl(AzureCommunicationEmailServiceImpl client) {
        this.service = RestProxy.create(EmailsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureCommunicationEmailServiceEmails to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "AzureCommunicationEm")
    public interface EmailsService {
        @Get("/emails/operations/{operationId}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<EmailsGetSendResultResponse> getSendResult(@HostParam("endpoint") String endpoint,
            @PathParam("operationId") String operationId, @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept, Context context);

        @Post("/emails:send")
        @ExpectedResponses({ 202 })
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<EmailsSendResponse> send(@HostParam("endpoint") String endpoint,
            @HeaderParam("Operation-Id") UUID operationId, @HeaderParam("x-ms-client-request-id") UUID clientRequestId,
            @QueryParam("api-version") String apiVersion, @BodyParam("application/json") EmailMessage message,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Gets the status of the email send operation.
     *
     * @param operationId ID of the long running operation (GUID) returned from a previous call to send email.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the email send operation on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<EmailsGetSendResultResponse> getSendResultWithResponseAsync(String operationId) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.getSendResult(this.client.getEndpoint(), operationId,
            this.client.getApiVersion(), accept, context));
    }

    /**
     * Gets the status of the email send operation.
     *
     * @param operationId ID of the long running operation (GUID) returned from a previous call to send email.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the email send operation on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<EmailsGetSendResultResponse> getSendResultWithResponseAsync(String operationId, Context context) {
        final String accept = "application/json";
        return service.getSendResult(this.client.getEndpoint(), operationId, this.client.getApiVersion(), accept,
            context);
    }

    /**
     * Gets the status of the email send operation.
     *
     * @param operationId ID of the long running operation (GUID) returned from a previous call to send email.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the email send operation on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<EmailSendResult> getSendResultAsync(String operationId) {
        return getSendResultWithResponseAsync(operationId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the status of the email send operation.
     *
     * @param operationId ID of the long running operation (GUID) returned from a previous call to send email.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the email send operation on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<EmailSendResult> getSendResultAsync(String operationId, Context context) {
        return getSendResultWithResponseAsync(operationId, context).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Queues an email message to be sent to one or more recipients.
     *
     * @param message Message payload for sending an email.
     * @param operationId This is the ID provided by the customer to identify the long running operation. If an ID is
     * not provided by the customer, the service will generate one.
     * @param clientRequestId Tracking ID sent with the request to help with debugging.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return status of the long running operation on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<EmailsSendResponse> sendWithResponseAsync(EmailMessage message, UUID operationId,
        UUID clientRequestId) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.send(this.client.getEndpoint(), operationId, clientRequestId,
            this.client.getApiVersion(), message, accept, context));
    }

    /**
     * Queues an email message to be sent to one or more recipients.
     *
     * @param message Message payload for sending an email.
     * @param operationId This is the ID provided by the customer to identify the long running operation. If an ID is
     * not provided by the customer, the service will generate one.
     * @param clientRequestId Tracking ID sent with the request to help with debugging.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return status of the long running operation on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<EmailsSendResponse> sendWithResponseAsync(EmailMessage message, UUID operationId, UUID clientRequestId,
        Context context) {
        final String accept = "application/json";
        return service.send(this.client.getEndpoint(), operationId, clientRequestId, this.client.getApiVersion(),
            message, accept, context);
    }

    /**
     * Queues an email message to be sent to one or more recipients.
     *
     * @param message Message payload for sending an email.
     * @param operationId This is the ID provided by the customer to identify the long running operation. If an ID is
     * not provided by the customer, the service will generate one.
     * @param clientRequestId Tracking ID sent with the request to help with debugging.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<EmailSendResult, EmailSendResult> beginSendAsync(EmailMessage message, UUID operationId,
        UUID clientRequestId) {
        return PollerFlux.create(Duration.ofSeconds(1),
            () -> this.sendWithResponseAsync(message, operationId, clientRequestId),
            new DefaultPollingStrategy<>(new PollingStrategyOptions(this.client.getHttpPipeline())
                .setEndpoint("{endpoint}".replace("{endpoint}", this.client.getEndpoint()))
                .setContext(Context.NONE)),
            TypeReference.createInstance(EmailSendResult.class), TypeReference.createInstance(EmailSendResult.class));
    }

    /**
     * Queues an email message to be sent to one or more recipients.
     *
     * @param message Message payload for sending an email.
     * @param operationId This is the ID provided by the customer to identify the long running operation. If an ID is
     * not provided by the customer, the service will generate one.
     * @param clientRequestId Tracking ID sent with the request to help with debugging.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<EmailSendResult, EmailSendResult> beginSendAsync(EmailMessage message, UUID operationId,
        UUID clientRequestId, Context context) {
        return PollerFlux.create(Duration.ofSeconds(1),
            () -> this.sendWithResponseAsync(message, operationId, clientRequestId, context),
            new DefaultPollingStrategy<>(new PollingStrategyOptions(this.client.getHttpPipeline())
                .setEndpoint("{endpoint}".replace("{endpoint}", this.client.getEndpoint()))
                .setContext(context)),
            TypeReference.createInstance(EmailSendResult.class), TypeReference.createInstance(EmailSendResult.class));
    }
}
