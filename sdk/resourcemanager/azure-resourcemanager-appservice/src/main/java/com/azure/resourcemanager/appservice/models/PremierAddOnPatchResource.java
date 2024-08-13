// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.fluent.models.PremierAddOnPatchResourceProperties;
import java.io.IOException;

/**
 * ARM resource for a PremierAddOn.
 */
@Fluent
public final class PremierAddOnPatchResource extends ProxyOnlyResource {
    /*
     * PremierAddOnPatchResource resource specific properties
     */
    private PremierAddOnPatchResourceProperties innerProperties;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of PremierAddOnPatchResource class.
     */
    public PremierAddOnPatchResource() {
    }

    /**
     * Get the innerProperties property: PremierAddOnPatchResource resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private PremierAddOnPatchResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PremierAddOnPatchResource withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the sku property: Premier add on SKU.
     * 
     * @return the sku value.
     */
    public String sku() {
        return this.innerProperties() == null ? null : this.innerProperties().sku();
    }

    /**
     * Set the sku property: Premier add on SKU.
     * 
     * @param sku the sku value to set.
     * @return the PremierAddOnPatchResource object itself.
     */
    public PremierAddOnPatchResource withSku(String sku) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PremierAddOnPatchResourceProperties();
        }
        this.innerProperties().withSku(sku);
        return this;
    }

    /**
     * Get the product property: Premier add on Product.
     * 
     * @return the product value.
     */
    public String product() {
        return this.innerProperties() == null ? null : this.innerProperties().product();
    }

    /**
     * Set the product property: Premier add on Product.
     * 
     * @param product the product value to set.
     * @return the PremierAddOnPatchResource object itself.
     */
    public PremierAddOnPatchResource withProduct(String product) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PremierAddOnPatchResourceProperties();
        }
        this.innerProperties().withProduct(product);
        return this;
    }

    /**
     * Get the vendor property: Premier add on Vendor.
     * 
     * @return the vendor value.
     */
    public String vendor() {
        return this.innerProperties() == null ? null : this.innerProperties().vendor();
    }

    /**
     * Set the vendor property: Premier add on Vendor.
     * 
     * @param vendor the vendor value to set.
     * @return the PremierAddOnPatchResource object itself.
     */
    public PremierAddOnPatchResource withVendor(String vendor) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PremierAddOnPatchResourceProperties();
        }
        this.innerProperties().withVendor(vendor);
        return this;
    }

    /**
     * Get the marketplacePublisher property: Premier add on Marketplace publisher.
     * 
     * @return the marketplacePublisher value.
     */
    public String marketplacePublisher() {
        return this.innerProperties() == null ? null : this.innerProperties().marketplacePublisher();
    }

    /**
     * Set the marketplacePublisher property: Premier add on Marketplace publisher.
     * 
     * @param marketplacePublisher the marketplacePublisher value to set.
     * @return the PremierAddOnPatchResource object itself.
     */
    public PremierAddOnPatchResource withMarketplacePublisher(String marketplacePublisher) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PremierAddOnPatchResourceProperties();
        }
        this.innerProperties().withMarketplacePublisher(marketplacePublisher);
        return this;
    }

    /**
     * Get the marketplaceOffer property: Premier add on Marketplace offer.
     * 
     * @return the marketplaceOffer value.
     */
    public String marketplaceOffer() {
        return this.innerProperties() == null ? null : this.innerProperties().marketplaceOffer();
    }

    /**
     * Set the marketplaceOffer property: Premier add on Marketplace offer.
     * 
     * @param marketplaceOffer the marketplaceOffer value to set.
     * @return the PremierAddOnPatchResource object itself.
     */
    public PremierAddOnPatchResource withMarketplaceOffer(String marketplaceOffer) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PremierAddOnPatchResourceProperties();
        }
        this.innerProperties().withMarketplaceOffer(marketplaceOffer);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", kind());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PremierAddOnPatchResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PremierAddOnPatchResource if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PremierAddOnPatchResource.
     */
    public static PremierAddOnPatchResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PremierAddOnPatchResource deserializedPremierAddOnPatchResource = new PremierAddOnPatchResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedPremierAddOnPatchResource.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedPremierAddOnPatchResource.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedPremierAddOnPatchResource.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedPremierAddOnPatchResource.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedPremierAddOnPatchResource.innerProperties
                        = PremierAddOnPatchResourceProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPremierAddOnPatchResource;
        });
    }
}
