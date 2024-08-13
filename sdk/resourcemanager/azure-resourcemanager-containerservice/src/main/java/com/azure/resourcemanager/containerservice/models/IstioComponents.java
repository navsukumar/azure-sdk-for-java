// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Istio components configuration.
 */
@Fluent
public final class IstioComponents implements JsonSerializable<IstioComponents> {
    /*
     * Istio ingress gateways.
     */
    private List<IstioIngressGateway> ingressGateways;

    /*
     * Istio egress gateways.
     */
    private List<IstioEgressGateway> egressGateways;

    /**
     * Creates an instance of IstioComponents class.
     */
    public IstioComponents() {
    }

    /**
     * Get the ingressGateways property: Istio ingress gateways.
     * 
     * @return the ingressGateways value.
     */
    public List<IstioIngressGateway> ingressGateways() {
        return this.ingressGateways;
    }

    /**
     * Set the ingressGateways property: Istio ingress gateways.
     * 
     * @param ingressGateways the ingressGateways value to set.
     * @return the IstioComponents object itself.
     */
    public IstioComponents withIngressGateways(List<IstioIngressGateway> ingressGateways) {
        this.ingressGateways = ingressGateways;
        return this;
    }

    /**
     * Get the egressGateways property: Istio egress gateways.
     * 
     * @return the egressGateways value.
     */
    public List<IstioEgressGateway> egressGateways() {
        return this.egressGateways;
    }

    /**
     * Set the egressGateways property: Istio egress gateways.
     * 
     * @param egressGateways the egressGateways value to set.
     * @return the IstioComponents object itself.
     */
    public IstioComponents withEgressGateways(List<IstioEgressGateway> egressGateways) {
        this.egressGateways = egressGateways;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ingressGateways() != null) {
            ingressGateways().forEach(e -> e.validate());
        }
        if (egressGateways() != null) {
            egressGateways().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("ingressGateways", this.ingressGateways,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("egressGateways", this.egressGateways,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IstioComponents from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IstioComponents if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the IstioComponents.
     */
    public static IstioComponents fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IstioComponents deserializedIstioComponents = new IstioComponents();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("ingressGateways".equals(fieldName)) {
                    List<IstioIngressGateway> ingressGateways
                        = reader.readArray(reader1 -> IstioIngressGateway.fromJson(reader1));
                    deserializedIstioComponents.ingressGateways = ingressGateways;
                } else if ("egressGateways".equals(fieldName)) {
                    List<IstioEgressGateway> egressGateways
                        = reader.readArray(reader1 -> IstioEgressGateway.fromJson(reader1));
                    deserializedIstioComponents.egressGateways = egressGateways;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIstioComponents;
        });
    }
}
