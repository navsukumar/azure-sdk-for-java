// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Properties of a managed Cassandra data center.
 */
@Fluent
public final class DataCenterResourceProperties implements JsonSerializable<DataCenterResourceProperties> {
    /*
     * The status of the resource at the time the operation was called.
     */
    private ManagedCassandraProvisioningState provisioningState;

    /*
     * The region this data center should be created in.
     */
    private String dataCenterLocation;

    /*
     * Resource id of a subnet the nodes in this data center should have their network interfaces connected to. The
     * subnet must be in the same region specified in 'dataCenterLocation' and must be able to route to the subnet
     * specified in the cluster's 'delegatedManagementSubnetId' property. This resource id will be of the form
     * '/subscriptions/<subscription id>/resourceGroups/<resource
     * group>/providers/Microsoft.Network/virtualNetworks/<virtual network>/subnets/<subnet>'.
     */
    private String delegatedSubnetId;

    /*
     * The number of nodes the data center should have. This is the desired number. After it is set, it may take some
     * time for the data center to be scaled to match. To monitor the number of nodes and their status, use the
     * fetchNodeStatus method on the cluster.
     */
    private Integer nodeCount;

    /*
     * IP addresses for seed nodes in this data center. This is for reference. Generally you will want to use the
     * seedNodes property on the cluster, which aggregates the seed nodes from all data centers in the cluster.
     */
    private List<SeedNode> seedNodes;

    /*
     * A fragment of a cassandra.yaml configuration file to be included in the cassandra.yaml for all nodes in this data
     * center. The fragment should be Base64 encoded, and only a subset of keys are allowed.
     */
    private String base64EncodedCassandraYamlFragment;

    /*
     * Key uri to use for encryption of managed disks. Ensure the system assigned identity of the cluster has been
     * assigned appropriate permissions(key get/wrap/unwrap permissions) on the key.
     */
    private String managedDiskCustomerKeyUri;

    /*
     * Indicates the Key Uri of the customer key to use for encryption of the backup storage account.
     */
    private String backupStorageCustomerKeyUri;

    /*
     * Virtual Machine SKU used for data centers. Default value is Standard_DS14_v2
     */
    private String sku;

    /*
     * Disk SKU used for data centers. Default value is P30.
     */
    private String diskSku;

    /*
     * Number of disks attached to each node. Default is 4.
     */
    private Integer diskCapacity;

    /*
     * If the data center has Availability Zone support, apply it to the Virtual Machine ScaleSet that host the
     * cassandra data center virtual machines.
     */
    private Boolean availabilityZone;

    /*
     * Ldap authentication method properties. This feature is in preview.
     */
    private AuthenticationMethodLdapProperties authenticationMethodLdapProperties;

    /*
     * Whether the data center has been deallocated.
     */
    private Boolean deallocated;

    /*
     * Error related to resource provisioning.
     */
    private CassandraError provisionError;

    /*
     * Ip of the VPN Endpoint for this data center.
     */
    private String privateEndpointIpAddress;

    /**
     * Creates an instance of DataCenterResourceProperties class.
     */
    public DataCenterResourceProperties() {
    }

    /**
     * Get the provisioningState property: The status of the resource at the time the operation was called.
     * 
     * @return the provisioningState value.
     */
    public ManagedCassandraProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The status of the resource at the time the operation was called.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the DataCenterResourceProperties object itself.
     */
    public DataCenterResourceProperties withProvisioningState(ManagedCassandraProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the dataCenterLocation property: The region this data center should be created in.
     * 
     * @return the dataCenterLocation value.
     */
    public String dataCenterLocation() {
        return this.dataCenterLocation;
    }

    /**
     * Set the dataCenterLocation property: The region this data center should be created in.
     * 
     * @param dataCenterLocation the dataCenterLocation value to set.
     * @return the DataCenterResourceProperties object itself.
     */
    public DataCenterResourceProperties withDataCenterLocation(String dataCenterLocation) {
        this.dataCenterLocation = dataCenterLocation;
        return this;
    }

    /**
     * Get the delegatedSubnetId property: Resource id of a subnet the nodes in this data center should have their
     * network interfaces connected to. The subnet must be in the same region specified in 'dataCenterLocation' and must
     * be able to route to the subnet specified in the cluster's 'delegatedManagementSubnetId' property. This resource
     * id will be of the form '/subscriptions/&lt;subscription id&gt;/resourceGroups/&lt;resource
     * group&gt;/providers/Microsoft.Network/virtualNetworks/&lt;virtual network&gt;/subnets/&lt;subnet&gt;'.
     * 
     * @return the delegatedSubnetId value.
     */
    public String delegatedSubnetId() {
        return this.delegatedSubnetId;
    }

    /**
     * Set the delegatedSubnetId property: Resource id of a subnet the nodes in this data center should have their
     * network interfaces connected to. The subnet must be in the same region specified in 'dataCenterLocation' and must
     * be able to route to the subnet specified in the cluster's 'delegatedManagementSubnetId' property. This resource
     * id will be of the form '/subscriptions/&lt;subscription id&gt;/resourceGroups/&lt;resource
     * group&gt;/providers/Microsoft.Network/virtualNetworks/&lt;virtual network&gt;/subnets/&lt;subnet&gt;'.
     * 
     * @param delegatedSubnetId the delegatedSubnetId value to set.
     * @return the DataCenterResourceProperties object itself.
     */
    public DataCenterResourceProperties withDelegatedSubnetId(String delegatedSubnetId) {
        this.delegatedSubnetId = delegatedSubnetId;
        return this;
    }

    /**
     * Get the nodeCount property: The number of nodes the data center should have. This is the desired number. After it
     * is set, it may take some time for the data center to be scaled to match. To monitor the number of nodes and their
     * status, use the fetchNodeStatus method on the cluster.
     * 
     * @return the nodeCount value.
     */
    public Integer nodeCount() {
        return this.nodeCount;
    }

    /**
     * Set the nodeCount property: The number of nodes the data center should have. This is the desired number. After it
     * is set, it may take some time for the data center to be scaled to match. To monitor the number of nodes and their
     * status, use the fetchNodeStatus method on the cluster.
     * 
     * @param nodeCount the nodeCount value to set.
     * @return the DataCenterResourceProperties object itself.
     */
    public DataCenterResourceProperties withNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }

    /**
     * Get the seedNodes property: IP addresses for seed nodes in this data center. This is for reference. Generally you
     * will want to use the seedNodes property on the cluster, which aggregates the seed nodes from all data centers in
     * the cluster.
     * 
     * @return the seedNodes value.
     */
    public List<SeedNode> seedNodes() {
        return this.seedNodes;
    }

    /**
     * Get the base64EncodedCassandraYamlFragment property: A fragment of a cassandra.yaml configuration file to be
     * included in the cassandra.yaml for all nodes in this data center. The fragment should be Base64 encoded, and only
     * a subset of keys are allowed.
     * 
     * @return the base64EncodedCassandraYamlFragment value.
     */
    public String base64EncodedCassandraYamlFragment() {
        return this.base64EncodedCassandraYamlFragment;
    }

    /**
     * Set the base64EncodedCassandraYamlFragment property: A fragment of a cassandra.yaml configuration file to be
     * included in the cassandra.yaml for all nodes in this data center. The fragment should be Base64 encoded, and only
     * a subset of keys are allowed.
     * 
     * @param base64EncodedCassandraYamlFragment the base64EncodedCassandraYamlFragment value to set.
     * @return the DataCenterResourceProperties object itself.
     */
    public DataCenterResourceProperties
        withBase64EncodedCassandraYamlFragment(String base64EncodedCassandraYamlFragment) {
        this.base64EncodedCassandraYamlFragment = base64EncodedCassandraYamlFragment;
        return this;
    }

    /**
     * Get the managedDiskCustomerKeyUri property: Key uri to use for encryption of managed disks. Ensure the system
     * assigned identity of the cluster has been assigned appropriate permissions(key get/wrap/unwrap permissions) on
     * the key.
     * 
     * @return the managedDiskCustomerKeyUri value.
     */
    public String managedDiskCustomerKeyUri() {
        return this.managedDiskCustomerKeyUri;
    }

    /**
     * Set the managedDiskCustomerKeyUri property: Key uri to use for encryption of managed disks. Ensure the system
     * assigned identity of the cluster has been assigned appropriate permissions(key get/wrap/unwrap permissions) on
     * the key.
     * 
     * @param managedDiskCustomerKeyUri the managedDiskCustomerKeyUri value to set.
     * @return the DataCenterResourceProperties object itself.
     */
    public DataCenterResourceProperties withManagedDiskCustomerKeyUri(String managedDiskCustomerKeyUri) {
        this.managedDiskCustomerKeyUri = managedDiskCustomerKeyUri;
        return this;
    }

    /**
     * Get the backupStorageCustomerKeyUri property: Indicates the Key Uri of the customer key to use for encryption of
     * the backup storage account.
     * 
     * @return the backupStorageCustomerKeyUri value.
     */
    public String backupStorageCustomerKeyUri() {
        return this.backupStorageCustomerKeyUri;
    }

    /**
     * Set the backupStorageCustomerKeyUri property: Indicates the Key Uri of the customer key to use for encryption of
     * the backup storage account.
     * 
     * @param backupStorageCustomerKeyUri the backupStorageCustomerKeyUri value to set.
     * @return the DataCenterResourceProperties object itself.
     */
    public DataCenterResourceProperties withBackupStorageCustomerKeyUri(String backupStorageCustomerKeyUri) {
        this.backupStorageCustomerKeyUri = backupStorageCustomerKeyUri;
        return this;
    }

    /**
     * Get the sku property: Virtual Machine SKU used for data centers. Default value is Standard_DS14_v2.
     * 
     * @return the sku value.
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Virtual Machine SKU used for data centers. Default value is Standard_DS14_v2.
     * 
     * @param sku the sku value to set.
     * @return the DataCenterResourceProperties object itself.
     */
    public DataCenterResourceProperties withSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the diskSku property: Disk SKU used for data centers. Default value is P30.
     * 
     * @return the diskSku value.
     */
    public String diskSku() {
        return this.diskSku;
    }

    /**
     * Set the diskSku property: Disk SKU used for data centers. Default value is P30.
     * 
     * @param diskSku the diskSku value to set.
     * @return the DataCenterResourceProperties object itself.
     */
    public DataCenterResourceProperties withDiskSku(String diskSku) {
        this.diskSku = diskSku;
        return this;
    }

    /**
     * Get the diskCapacity property: Number of disks attached to each node. Default is 4.
     * 
     * @return the diskCapacity value.
     */
    public Integer diskCapacity() {
        return this.diskCapacity;
    }

    /**
     * Set the diskCapacity property: Number of disks attached to each node. Default is 4.
     * 
     * @param diskCapacity the diskCapacity value to set.
     * @return the DataCenterResourceProperties object itself.
     */
    public DataCenterResourceProperties withDiskCapacity(Integer diskCapacity) {
        this.diskCapacity = diskCapacity;
        return this;
    }

    /**
     * Get the availabilityZone property: If the data center has Availability Zone support, apply it to the Virtual
     * Machine ScaleSet that host the cassandra data center virtual machines.
     * 
     * @return the availabilityZone value.
     */
    public Boolean availabilityZone() {
        return this.availabilityZone;
    }

    /**
     * Set the availabilityZone property: If the data center has Availability Zone support, apply it to the Virtual
     * Machine ScaleSet that host the cassandra data center virtual machines.
     * 
     * @param availabilityZone the availabilityZone value to set.
     * @return the DataCenterResourceProperties object itself.
     */
    public DataCenterResourceProperties withAvailabilityZone(Boolean availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * Get the authenticationMethodLdapProperties property: Ldap authentication method properties. This feature is in
     * preview.
     * 
     * @return the authenticationMethodLdapProperties value.
     */
    public AuthenticationMethodLdapProperties authenticationMethodLdapProperties() {
        return this.authenticationMethodLdapProperties;
    }

    /**
     * Set the authenticationMethodLdapProperties property: Ldap authentication method properties. This feature is in
     * preview.
     * 
     * @param authenticationMethodLdapProperties the authenticationMethodLdapProperties value to set.
     * @return the DataCenterResourceProperties object itself.
     */
    public DataCenterResourceProperties
        withAuthenticationMethodLdapProperties(AuthenticationMethodLdapProperties authenticationMethodLdapProperties) {
        this.authenticationMethodLdapProperties = authenticationMethodLdapProperties;
        return this;
    }

    /**
     * Get the deallocated property: Whether the data center has been deallocated.
     * 
     * @return the deallocated value.
     */
    public Boolean deallocated() {
        return this.deallocated;
    }

    /**
     * Set the deallocated property: Whether the data center has been deallocated.
     * 
     * @param deallocated the deallocated value to set.
     * @return the DataCenterResourceProperties object itself.
     */
    public DataCenterResourceProperties withDeallocated(Boolean deallocated) {
        this.deallocated = deallocated;
        return this;
    }

    /**
     * Get the provisionError property: Error related to resource provisioning.
     * 
     * @return the provisionError value.
     */
    public CassandraError provisionError() {
        return this.provisionError;
    }

    /**
     * Set the provisionError property: Error related to resource provisioning.
     * 
     * @param provisionError the provisionError value to set.
     * @return the DataCenterResourceProperties object itself.
     */
    public DataCenterResourceProperties withProvisionError(CassandraError provisionError) {
        this.provisionError = provisionError;
        return this;
    }

    /**
     * Get the privateEndpointIpAddress property: Ip of the VPN Endpoint for this data center.
     * 
     * @return the privateEndpointIpAddress value.
     */
    public String privateEndpointIpAddress() {
        return this.privateEndpointIpAddress;
    }

    /**
     * Set the privateEndpointIpAddress property: Ip of the VPN Endpoint for this data center.
     * 
     * @param privateEndpointIpAddress the privateEndpointIpAddress value to set.
     * @return the DataCenterResourceProperties object itself.
     */
    public DataCenterResourceProperties withPrivateEndpointIpAddress(String privateEndpointIpAddress) {
        this.privateEndpointIpAddress = privateEndpointIpAddress;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (seedNodes() != null) {
            seedNodes().forEach(e -> e.validate());
        }
        if (authenticationMethodLdapProperties() != null) {
            authenticationMethodLdapProperties().validate();
        }
        if (provisionError() != null) {
            provisionError().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("provisioningState",
            this.provisioningState == null ? null : this.provisioningState.toString());
        jsonWriter.writeStringField("dataCenterLocation", this.dataCenterLocation);
        jsonWriter.writeStringField("delegatedSubnetId", this.delegatedSubnetId);
        jsonWriter.writeNumberField("nodeCount", this.nodeCount);
        jsonWriter.writeStringField("base64EncodedCassandraYamlFragment", this.base64EncodedCassandraYamlFragment);
        jsonWriter.writeStringField("managedDiskCustomerKeyUri", this.managedDiskCustomerKeyUri);
        jsonWriter.writeStringField("backupStorageCustomerKeyUri", this.backupStorageCustomerKeyUri);
        jsonWriter.writeStringField("sku", this.sku);
        jsonWriter.writeStringField("diskSku", this.diskSku);
        jsonWriter.writeNumberField("diskCapacity", this.diskCapacity);
        jsonWriter.writeBooleanField("availabilityZone", this.availabilityZone);
        jsonWriter.writeJsonField("authenticationMethodLdapProperties", this.authenticationMethodLdapProperties);
        jsonWriter.writeBooleanField("deallocated", this.deallocated);
        jsonWriter.writeJsonField("provisionError", this.provisionError);
        jsonWriter.writeStringField("privateEndpointIpAddress", this.privateEndpointIpAddress);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataCenterResourceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataCenterResourceProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DataCenterResourceProperties.
     */
    public static DataCenterResourceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataCenterResourceProperties deserializedDataCenterResourceProperties = new DataCenterResourceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedDataCenterResourceProperties.provisioningState
                        = ManagedCassandraProvisioningState.fromString(reader.getString());
                } else if ("dataCenterLocation".equals(fieldName)) {
                    deserializedDataCenterResourceProperties.dataCenterLocation = reader.getString();
                } else if ("delegatedSubnetId".equals(fieldName)) {
                    deserializedDataCenterResourceProperties.delegatedSubnetId = reader.getString();
                } else if ("nodeCount".equals(fieldName)) {
                    deserializedDataCenterResourceProperties.nodeCount = reader.getNullable(JsonReader::getInt);
                } else if ("seedNodes".equals(fieldName)) {
                    List<SeedNode> seedNodes = reader.readArray(reader1 -> SeedNode.fromJson(reader1));
                    deserializedDataCenterResourceProperties.seedNodes = seedNodes;
                } else if ("base64EncodedCassandraYamlFragment".equals(fieldName)) {
                    deserializedDataCenterResourceProperties.base64EncodedCassandraYamlFragment = reader.getString();
                } else if ("managedDiskCustomerKeyUri".equals(fieldName)) {
                    deserializedDataCenterResourceProperties.managedDiskCustomerKeyUri = reader.getString();
                } else if ("backupStorageCustomerKeyUri".equals(fieldName)) {
                    deserializedDataCenterResourceProperties.backupStorageCustomerKeyUri = reader.getString();
                } else if ("sku".equals(fieldName)) {
                    deserializedDataCenterResourceProperties.sku = reader.getString();
                } else if ("diskSku".equals(fieldName)) {
                    deserializedDataCenterResourceProperties.diskSku = reader.getString();
                } else if ("diskCapacity".equals(fieldName)) {
                    deserializedDataCenterResourceProperties.diskCapacity = reader.getNullable(JsonReader::getInt);
                } else if ("availabilityZone".equals(fieldName)) {
                    deserializedDataCenterResourceProperties.availabilityZone
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("authenticationMethodLdapProperties".equals(fieldName)) {
                    deserializedDataCenterResourceProperties.authenticationMethodLdapProperties
                        = AuthenticationMethodLdapProperties.fromJson(reader);
                } else if ("deallocated".equals(fieldName)) {
                    deserializedDataCenterResourceProperties.deallocated = reader.getNullable(JsonReader::getBoolean);
                } else if ("provisionError".equals(fieldName)) {
                    deserializedDataCenterResourceProperties.provisionError = CassandraError.fromJson(reader);
                } else if ("privateEndpointIpAddress".equals(fieldName)) {
                    deserializedDataCenterResourceProperties.privateEndpointIpAddress = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataCenterResourceProperties;
        });
    }
}
