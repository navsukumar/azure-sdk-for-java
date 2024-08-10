// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Spring Cloud Gateway properties payload.
 */
@Fluent
public final class GatewayProperties implements JsonSerializable<GatewayProperties> {
    /*
     * State of the Spring Cloud Gateway.
     */
    private GatewayProvisioningState provisioningState;

    /*
     * Indicates whether the Spring Cloud Gateway exposes endpoint.
     */
    private Boolean publicProperty;

    /*
     * URL of the Spring Cloud Gateway, exposed when 'public' is true.
     */
    private String url;

    /*
     * Indicate if only https is allowed.
     */
    private Boolean httpsOnly;

    /*
     * Single sign-on related configuration
     */
    private SsoProperties ssoProperties;

    /*
     * API metadata property for Spring Cloud Gateway
     */
    private GatewayApiMetadataProperties apiMetadataProperties;

    /*
     * Cross-Origin Resource Sharing property
     */
    private GatewayCorsProperties corsProperties;

    /*
     * Client-Certification Authentication.
     */
    private GatewayPropertiesClientAuth clientAuth;

    /*
     * Collection of ApmReferences in service level
     */
    private List<ApmReference> apms;

    /*
     * Environment variables of Spring Cloud Gateway
     */
    private GatewayPropertiesEnvironmentVariables environmentVariables;

    /*
     * The requested resource quantity for required CPU and Memory.
     */
    private GatewayResourceRequests resourceRequests;

    /*
     * Collection of instances belong to Spring Cloud Gateway.
     */
    private List<GatewayInstance> instances;

    /*
     * Properties of the Spring Cloud Gateway Operator.
     */
    private GatewayOperatorProperties operatorProperties;

    /**
     * Creates an instance of GatewayProperties class.
     */
    public GatewayProperties() {
    }

    /**
     * Get the provisioningState property: State of the Spring Cloud Gateway.
     * 
     * @return the provisioningState value.
     */
    public GatewayProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the publicProperty property: Indicates whether the Spring Cloud Gateway exposes endpoint.
     * 
     * @return the publicProperty value.
     */
    public Boolean publicProperty() {
        return this.publicProperty;
    }

    /**
     * Set the publicProperty property: Indicates whether the Spring Cloud Gateway exposes endpoint.
     * 
     * @param publicProperty the publicProperty value to set.
     * @return the GatewayProperties object itself.
     */
    public GatewayProperties withPublicProperty(Boolean publicProperty) {
        this.publicProperty = publicProperty;
        return this;
    }

    /**
     * Get the url property: URL of the Spring Cloud Gateway, exposed when 'public' is true.
     * 
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Get the httpsOnly property: Indicate if only https is allowed.
     * 
     * @return the httpsOnly value.
     */
    public Boolean httpsOnly() {
        return this.httpsOnly;
    }

    /**
     * Set the httpsOnly property: Indicate if only https is allowed.
     * 
     * @param httpsOnly the httpsOnly value to set.
     * @return the GatewayProperties object itself.
     */
    public GatewayProperties withHttpsOnly(Boolean httpsOnly) {
        this.httpsOnly = httpsOnly;
        return this;
    }

    /**
     * Get the ssoProperties property: Single sign-on related configuration.
     * 
     * @return the ssoProperties value.
     */
    public SsoProperties ssoProperties() {
        return this.ssoProperties;
    }

    /**
     * Set the ssoProperties property: Single sign-on related configuration.
     * 
     * @param ssoProperties the ssoProperties value to set.
     * @return the GatewayProperties object itself.
     */
    public GatewayProperties withSsoProperties(SsoProperties ssoProperties) {
        this.ssoProperties = ssoProperties;
        return this;
    }

    /**
     * Get the apiMetadataProperties property: API metadata property for Spring Cloud Gateway.
     * 
     * @return the apiMetadataProperties value.
     */
    public GatewayApiMetadataProperties apiMetadataProperties() {
        return this.apiMetadataProperties;
    }

    /**
     * Set the apiMetadataProperties property: API metadata property for Spring Cloud Gateway.
     * 
     * @param apiMetadataProperties the apiMetadataProperties value to set.
     * @return the GatewayProperties object itself.
     */
    public GatewayProperties withApiMetadataProperties(GatewayApiMetadataProperties apiMetadataProperties) {
        this.apiMetadataProperties = apiMetadataProperties;
        return this;
    }

    /**
     * Get the corsProperties property: Cross-Origin Resource Sharing property.
     * 
     * @return the corsProperties value.
     */
    public GatewayCorsProperties corsProperties() {
        return this.corsProperties;
    }

    /**
     * Set the corsProperties property: Cross-Origin Resource Sharing property.
     * 
     * @param corsProperties the corsProperties value to set.
     * @return the GatewayProperties object itself.
     */
    public GatewayProperties withCorsProperties(GatewayCorsProperties corsProperties) {
        this.corsProperties = corsProperties;
        return this;
    }

    /**
     * Get the clientAuth property: Client-Certification Authentication.
     * 
     * @return the clientAuth value.
     */
    public GatewayPropertiesClientAuth clientAuth() {
        return this.clientAuth;
    }

    /**
     * Set the clientAuth property: Client-Certification Authentication.
     * 
     * @param clientAuth the clientAuth value to set.
     * @return the GatewayProperties object itself.
     */
    public GatewayProperties withClientAuth(GatewayPropertiesClientAuth clientAuth) {
        this.clientAuth = clientAuth;
        return this;
    }

    /**
     * Get the apms property: Collection of ApmReferences in service level.
     * 
     * @return the apms value.
     */
    public List<ApmReference> apms() {
        return this.apms;
    }

    /**
     * Set the apms property: Collection of ApmReferences in service level.
     * 
     * @param apms the apms value to set.
     * @return the GatewayProperties object itself.
     */
    public GatewayProperties withApms(List<ApmReference> apms) {
        this.apms = apms;
        return this;
    }

    /**
     * Get the environmentVariables property: Environment variables of Spring Cloud Gateway.
     * 
     * @return the environmentVariables value.
     */
    public GatewayPropertiesEnvironmentVariables environmentVariables() {
        return this.environmentVariables;
    }

    /**
     * Set the environmentVariables property: Environment variables of Spring Cloud Gateway.
     * 
     * @param environmentVariables the environmentVariables value to set.
     * @return the GatewayProperties object itself.
     */
    public GatewayProperties withEnvironmentVariables(GatewayPropertiesEnvironmentVariables environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }

    /**
     * Get the resourceRequests property: The requested resource quantity for required CPU and Memory.
     * 
     * @return the resourceRequests value.
     */
    public GatewayResourceRequests resourceRequests() {
        return this.resourceRequests;
    }

    /**
     * Set the resourceRequests property: The requested resource quantity for required CPU and Memory.
     * 
     * @param resourceRequests the resourceRequests value to set.
     * @return the GatewayProperties object itself.
     */
    public GatewayProperties withResourceRequests(GatewayResourceRequests resourceRequests) {
        this.resourceRequests = resourceRequests;
        return this;
    }

    /**
     * Get the instances property: Collection of instances belong to Spring Cloud Gateway.
     * 
     * @return the instances value.
     */
    public List<GatewayInstance> instances() {
        return this.instances;
    }

    /**
     * Get the operatorProperties property: Properties of the Spring Cloud Gateway Operator.
     * 
     * @return the operatorProperties value.
     */
    public GatewayOperatorProperties operatorProperties() {
        return this.operatorProperties;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ssoProperties() != null) {
            ssoProperties().validate();
        }
        if (apiMetadataProperties() != null) {
            apiMetadataProperties().validate();
        }
        if (corsProperties() != null) {
            corsProperties().validate();
        }
        if (clientAuth() != null) {
            clientAuth().validate();
        }
        if (apms() != null) {
            apms().forEach(e -> e.validate());
        }
        if (environmentVariables() != null) {
            environmentVariables().validate();
        }
        if (resourceRequests() != null) {
            resourceRequests().validate();
        }
        if (instances() != null) {
            instances().forEach(e -> e.validate());
        }
        if (operatorProperties() != null) {
            operatorProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("public", this.publicProperty);
        jsonWriter.writeBooleanField("httpsOnly", this.httpsOnly);
        jsonWriter.writeJsonField("ssoProperties", this.ssoProperties);
        jsonWriter.writeJsonField("apiMetadataProperties", this.apiMetadataProperties);
        jsonWriter.writeJsonField("corsProperties", this.corsProperties);
        jsonWriter.writeJsonField("clientAuth", this.clientAuth);
        jsonWriter.writeArrayField("apms", this.apms, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("environmentVariables", this.environmentVariables);
        jsonWriter.writeJsonField("resourceRequests", this.resourceRequests);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GatewayProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GatewayProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the GatewayProperties.
     */
    public static GatewayProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GatewayProperties deserializedGatewayProperties = new GatewayProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedGatewayProperties.provisioningState
                        = GatewayProvisioningState.fromString(reader.getString());
                } else if ("public".equals(fieldName)) {
                    deserializedGatewayProperties.publicProperty = reader.getNullable(JsonReader::getBoolean);
                } else if ("url".equals(fieldName)) {
                    deserializedGatewayProperties.url = reader.getString();
                } else if ("httpsOnly".equals(fieldName)) {
                    deserializedGatewayProperties.httpsOnly = reader.getNullable(JsonReader::getBoolean);
                } else if ("ssoProperties".equals(fieldName)) {
                    deserializedGatewayProperties.ssoProperties = SsoProperties.fromJson(reader);
                } else if ("apiMetadataProperties".equals(fieldName)) {
                    deserializedGatewayProperties.apiMetadataProperties = GatewayApiMetadataProperties.fromJson(reader);
                } else if ("corsProperties".equals(fieldName)) {
                    deserializedGatewayProperties.corsProperties = GatewayCorsProperties.fromJson(reader);
                } else if ("clientAuth".equals(fieldName)) {
                    deserializedGatewayProperties.clientAuth = GatewayPropertiesClientAuth.fromJson(reader);
                } else if ("apms".equals(fieldName)) {
                    List<ApmReference> apms = reader.readArray(reader1 -> ApmReference.fromJson(reader1));
                    deserializedGatewayProperties.apms = apms;
                } else if ("environmentVariables".equals(fieldName)) {
                    deserializedGatewayProperties.environmentVariables
                        = GatewayPropertiesEnvironmentVariables.fromJson(reader);
                } else if ("resourceRequests".equals(fieldName)) {
                    deserializedGatewayProperties.resourceRequests = GatewayResourceRequests.fromJson(reader);
                } else if ("instances".equals(fieldName)) {
                    List<GatewayInstance> instances = reader.readArray(reader1 -> GatewayInstance.fromJson(reader1));
                    deserializedGatewayProperties.instances = instances;
                } else if ("operatorProperties".equals(fieldName)) {
                    deserializedGatewayProperties.operatorProperties = GatewayOperatorProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGatewayProperties;
        });
    }
}
