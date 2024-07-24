// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Container App Ingress configuration.
 */
@Fluent
public final class Ingress implements JsonSerializable<Ingress> {
    /*
     * Hostname.
     */
    private String fqdn;

    /*
     * Bool indicating if app exposes an external http endpoint
     */
    private Boolean external;

    /*
     * Target Port in containers for traffic from ingress
     */
    private Integer targetPort;

    /*
     * Exposed Port in containers for TCP traffic from ingress
     */
    private Integer exposedPort;

    /*
     * Ingress transport protocol
     */
    private IngressTransportMethod transport;

    /*
     * Traffic weights for app's revisions
     */
    private List<TrafficWeight> traffic;

    /*
     * custom domain bindings for Container Apps' hostnames.
     */
    private List<CustomDomain> customDomains;

    /*
     * Bool indicating if HTTP connections to is allowed. If set to false HTTP connections are automatically redirected
     * to HTTPS connections
     */
    private Boolean allowInsecure;

    /*
     * Rules to restrict incoming IP address.
     */
    private List<IpSecurityRestrictionRule> ipSecurityRestrictions;

    /*
     * Sticky Sessions for Single Revision Mode
     */
    private IngressStickySessions stickySessions;

    /*
     * Client certificate mode for mTLS authentication. Ignore indicates server drops client certificate on forwarding.
     * Accept indicates server forwards client certificate but does not require a client certificate. Require indicates
     * server requires a client certificate.
     */
    private IngressClientCertificateMode clientCertificateMode;

    /*
     * CORS policy for container app
     */
    private CorsPolicy corsPolicy;

    /*
     * Settings to expose additional ports on container app
     */
    private List<IngressPortMapping> additionalPortMappings;

    /*
     * Whether an http app listens on http or https
     */
    private IngressTargetPortHttpScheme targetPortHttpScheme;

    /**
     * Creates an instance of Ingress class.
     */
    public Ingress() {
    }

    /**
     * Get the fqdn property: Hostname.
     * 
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Get the external property: Bool indicating if app exposes an external http endpoint.
     * 
     * @return the external value.
     */
    public Boolean external() {
        return this.external;
    }

    /**
     * Set the external property: Bool indicating if app exposes an external http endpoint.
     * 
     * @param external the external value to set.
     * @return the Ingress object itself.
     */
    public Ingress withExternal(Boolean external) {
        this.external = external;
        return this;
    }

    /**
     * Get the targetPort property: Target Port in containers for traffic from ingress.
     * 
     * @return the targetPort value.
     */
    public Integer targetPort() {
        return this.targetPort;
    }

    /**
     * Set the targetPort property: Target Port in containers for traffic from ingress.
     * 
     * @param targetPort the targetPort value to set.
     * @return the Ingress object itself.
     */
    public Ingress withTargetPort(Integer targetPort) {
        this.targetPort = targetPort;
        return this;
    }

    /**
     * Get the exposedPort property: Exposed Port in containers for TCP traffic from ingress.
     * 
     * @return the exposedPort value.
     */
    public Integer exposedPort() {
        return this.exposedPort;
    }

    /**
     * Set the exposedPort property: Exposed Port in containers for TCP traffic from ingress.
     * 
     * @param exposedPort the exposedPort value to set.
     * @return the Ingress object itself.
     */
    public Ingress withExposedPort(Integer exposedPort) {
        this.exposedPort = exposedPort;
        return this;
    }

    /**
     * Get the transport property: Ingress transport protocol.
     * 
     * @return the transport value.
     */
    public IngressTransportMethod transport() {
        return this.transport;
    }

    /**
     * Set the transport property: Ingress transport protocol.
     * 
     * @param transport the transport value to set.
     * @return the Ingress object itself.
     */
    public Ingress withTransport(IngressTransportMethod transport) {
        this.transport = transport;
        return this;
    }

    /**
     * Get the traffic property: Traffic weights for app's revisions.
     * 
     * @return the traffic value.
     */
    public List<TrafficWeight> traffic() {
        return this.traffic;
    }

    /**
     * Set the traffic property: Traffic weights for app's revisions.
     * 
     * @param traffic the traffic value to set.
     * @return the Ingress object itself.
     */
    public Ingress withTraffic(List<TrafficWeight> traffic) {
        this.traffic = traffic;
        return this;
    }

    /**
     * Get the customDomains property: custom domain bindings for Container Apps' hostnames.
     * 
     * @return the customDomains value.
     */
    public List<CustomDomain> customDomains() {
        return this.customDomains;
    }

    /**
     * Set the customDomains property: custom domain bindings for Container Apps' hostnames.
     * 
     * @param customDomains the customDomains value to set.
     * @return the Ingress object itself.
     */
    public Ingress withCustomDomains(List<CustomDomain> customDomains) {
        this.customDomains = customDomains;
        return this;
    }

    /**
     * Get the allowInsecure property: Bool indicating if HTTP connections to is allowed. If set to false HTTP
     * connections are automatically redirected to HTTPS connections.
     * 
     * @return the allowInsecure value.
     */
    public Boolean allowInsecure() {
        return this.allowInsecure;
    }

    /**
     * Set the allowInsecure property: Bool indicating if HTTP connections to is allowed. If set to false HTTP
     * connections are automatically redirected to HTTPS connections.
     * 
     * @param allowInsecure the allowInsecure value to set.
     * @return the Ingress object itself.
     */
    public Ingress withAllowInsecure(Boolean allowInsecure) {
        this.allowInsecure = allowInsecure;
        return this;
    }

    /**
     * Get the ipSecurityRestrictions property: Rules to restrict incoming IP address.
     * 
     * @return the ipSecurityRestrictions value.
     */
    public List<IpSecurityRestrictionRule> ipSecurityRestrictions() {
        return this.ipSecurityRestrictions;
    }

    /**
     * Set the ipSecurityRestrictions property: Rules to restrict incoming IP address.
     * 
     * @param ipSecurityRestrictions the ipSecurityRestrictions value to set.
     * @return the Ingress object itself.
     */
    public Ingress withIpSecurityRestrictions(List<IpSecurityRestrictionRule> ipSecurityRestrictions) {
        this.ipSecurityRestrictions = ipSecurityRestrictions;
        return this;
    }

    /**
     * Get the stickySessions property: Sticky Sessions for Single Revision Mode.
     * 
     * @return the stickySessions value.
     */
    public IngressStickySessions stickySessions() {
        return this.stickySessions;
    }

    /**
     * Set the stickySessions property: Sticky Sessions for Single Revision Mode.
     * 
     * @param stickySessions the stickySessions value to set.
     * @return the Ingress object itself.
     */
    public Ingress withStickySessions(IngressStickySessions stickySessions) {
        this.stickySessions = stickySessions;
        return this;
    }

    /**
     * Get the clientCertificateMode property: Client certificate mode for mTLS authentication. Ignore indicates server
     * drops client certificate on forwarding. Accept indicates server forwards client certificate but does not require
     * a client certificate. Require indicates server requires a client certificate.
     * 
     * @return the clientCertificateMode value.
     */
    public IngressClientCertificateMode clientCertificateMode() {
        return this.clientCertificateMode;
    }

    /**
     * Set the clientCertificateMode property: Client certificate mode for mTLS authentication. Ignore indicates server
     * drops client certificate on forwarding. Accept indicates server forwards client certificate but does not require
     * a client certificate. Require indicates server requires a client certificate.
     * 
     * @param clientCertificateMode the clientCertificateMode value to set.
     * @return the Ingress object itself.
     */
    public Ingress withClientCertificateMode(IngressClientCertificateMode clientCertificateMode) {
        this.clientCertificateMode = clientCertificateMode;
        return this;
    }

    /**
     * Get the corsPolicy property: CORS policy for container app.
     * 
     * @return the corsPolicy value.
     */
    public CorsPolicy corsPolicy() {
        return this.corsPolicy;
    }

    /**
     * Set the corsPolicy property: CORS policy for container app.
     * 
     * @param corsPolicy the corsPolicy value to set.
     * @return the Ingress object itself.
     */
    public Ingress withCorsPolicy(CorsPolicy corsPolicy) {
        this.corsPolicy = corsPolicy;
        return this;
    }

    /**
     * Get the additionalPortMappings property: Settings to expose additional ports on container app.
     * 
     * @return the additionalPortMappings value.
     */
    public List<IngressPortMapping> additionalPortMappings() {
        return this.additionalPortMappings;
    }

    /**
     * Set the additionalPortMappings property: Settings to expose additional ports on container app.
     * 
     * @param additionalPortMappings the additionalPortMappings value to set.
     * @return the Ingress object itself.
     */
    public Ingress withAdditionalPortMappings(List<IngressPortMapping> additionalPortMappings) {
        this.additionalPortMappings = additionalPortMappings;
        return this;
    }

    /**
     * Get the targetPortHttpScheme property: Whether an http app listens on http or https.
     * 
     * @return the targetPortHttpScheme value.
     */
    public IngressTargetPortHttpScheme targetPortHttpScheme() {
        return this.targetPortHttpScheme;
    }

    /**
     * Set the targetPortHttpScheme property: Whether an http app listens on http or https.
     * 
     * @param targetPortHttpScheme the targetPortHttpScheme value to set.
     * @return the Ingress object itself.
     */
    public Ingress withTargetPortHttpScheme(IngressTargetPortHttpScheme targetPortHttpScheme) {
        this.targetPortHttpScheme = targetPortHttpScheme;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (traffic() != null) {
            traffic().forEach(e -> e.validate());
        }
        if (customDomains() != null) {
            customDomains().forEach(e -> e.validate());
        }
        if (ipSecurityRestrictions() != null) {
            ipSecurityRestrictions().forEach(e -> e.validate());
        }
        if (stickySessions() != null) {
            stickySessions().validate();
        }
        if (corsPolicy() != null) {
            corsPolicy().validate();
        }
        if (additionalPortMappings() != null) {
            additionalPortMappings().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("external", this.external);
        jsonWriter.writeNumberField("targetPort", this.targetPort);
        jsonWriter.writeNumberField("exposedPort", this.exposedPort);
        jsonWriter.writeStringField("transport", this.transport == null ? null : this.transport.toString());
        jsonWriter.writeArrayField("traffic", this.traffic, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("customDomains", this.customDomains, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeBooleanField("allowInsecure", this.allowInsecure);
        jsonWriter.writeArrayField("ipSecurityRestrictions", this.ipSecurityRestrictions,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("stickySessions", this.stickySessions);
        jsonWriter.writeStringField("clientCertificateMode",
            this.clientCertificateMode == null ? null : this.clientCertificateMode.toString());
        jsonWriter.writeJsonField("corsPolicy", this.corsPolicy);
        jsonWriter.writeArrayField("additionalPortMappings", this.additionalPortMappings,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("targetPortHttpScheme",
            this.targetPortHttpScheme == null ? null : this.targetPortHttpScheme.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Ingress from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Ingress if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IOException If an error occurs while reading the Ingress.
     */
    public static Ingress fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Ingress deserializedIngress = new Ingress();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("fqdn".equals(fieldName)) {
                    deserializedIngress.fqdn = reader.getString();
                } else if ("external".equals(fieldName)) {
                    deserializedIngress.external = reader.getNullable(JsonReader::getBoolean);
                } else if ("targetPort".equals(fieldName)) {
                    deserializedIngress.targetPort = reader.getNullable(JsonReader::getInt);
                } else if ("exposedPort".equals(fieldName)) {
                    deserializedIngress.exposedPort = reader.getNullable(JsonReader::getInt);
                } else if ("transport".equals(fieldName)) {
                    deserializedIngress.transport = IngressTransportMethod.fromString(reader.getString());
                } else if ("traffic".equals(fieldName)) {
                    List<TrafficWeight> traffic = reader.readArray(reader1 -> TrafficWeight.fromJson(reader1));
                    deserializedIngress.traffic = traffic;
                } else if ("customDomains".equals(fieldName)) {
                    List<CustomDomain> customDomains = reader.readArray(reader1 -> CustomDomain.fromJson(reader1));
                    deserializedIngress.customDomains = customDomains;
                } else if ("allowInsecure".equals(fieldName)) {
                    deserializedIngress.allowInsecure = reader.getNullable(JsonReader::getBoolean);
                } else if ("ipSecurityRestrictions".equals(fieldName)) {
                    List<IpSecurityRestrictionRule> ipSecurityRestrictions
                        = reader.readArray(reader1 -> IpSecurityRestrictionRule.fromJson(reader1));
                    deserializedIngress.ipSecurityRestrictions = ipSecurityRestrictions;
                } else if ("stickySessions".equals(fieldName)) {
                    deserializedIngress.stickySessions = IngressStickySessions.fromJson(reader);
                } else if ("clientCertificateMode".equals(fieldName)) {
                    deserializedIngress.clientCertificateMode
                        = IngressClientCertificateMode.fromString(reader.getString());
                } else if ("corsPolicy".equals(fieldName)) {
                    deserializedIngress.corsPolicy = CorsPolicy.fromJson(reader);
                } else if ("additionalPortMappings".equals(fieldName)) {
                    List<IngressPortMapping> additionalPortMappings
                        = reader.readArray(reader1 -> IngressPortMapping.fromJson(reader1));
                    deserializedIngress.additionalPortMappings = additionalPortMappings;
                } else if ("targetPortHttpScheme".equals(fieldName)) {
                    deserializedIngress.targetPortHttpScheme
                        = IngressTargetPortHttpScheme.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIngress;
        });
    }
}
