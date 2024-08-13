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
 * Properties of a managed Cassandra cluster.
 */
@Fluent
public final class ClusterResourceProperties implements JsonSerializable<ClusterResourceProperties> {
    /*
     * The status of the resource at the time the operation was called.
     */
    private ManagedCassandraProvisioningState provisioningState;

    /*
     * To create an empty cluster, omit this field or set it to null. To restore a backup into a new cluster, set this
     * field to the resource id of the backup.
     */
    private String restoreFromBackupId;

    /*
     * Resource id of a subnet that this cluster's management service should have its network interface attached to. The
     * subnet must be routable to all subnets that will be delegated to data centers. The resource id must be of the
     * form '/subscriptions/<subscription id>/resourceGroups/<resource
     * group>/providers/Microsoft.Network/virtualNetworks/<virtual network>/subnets/<subnet>'
     */
    private String delegatedManagementSubnetId;

    /*
     * Which version of Cassandra should this cluster converge to running (e.g., 3.11). When updated, the cluster may
     * take some time to migrate to the new version.
     */
    private String cassandraVersion;

    /*
     * If you need to set the clusterName property in cassandra.yaml to something besides the resource name of the
     * cluster, set the value to use on this property.
     */
    private String clusterNameOverride;

    /*
     * Which authentication method Cassandra should use to authenticate clients. 'None' turns off authentication, so
     * should not be used except in emergencies. 'Cassandra' is the default password based authentication. The default
     * is 'Cassandra'.
     */
    private AuthenticationMethod authenticationMethod;

    /*
     * Initial password for clients connecting as admin to the cluster. Should be changed after cluster creation.
     * Returns null on GET. This field only applies when the authenticationMethod field is 'Cassandra'.
     */
    private String initialCassandraAdminPassword;

    /*
     * Hostname or IP address where the Prometheus endpoint containing data about the managed Cassandra nodes can be
     * reached.
     */
    private SeedNode prometheusEndpoint;

    /*
     * Should automatic repairs run on this cluster? If omitted, this is true, and should stay true unless you are
     * running a hybrid cluster where you are already doing your own repairs.
     */
    private Boolean repairEnabled;

    /*
     * List of TLS certificates used to authorize clients connecting to the cluster. All connections are TLS encrypted
     * whether clientCertificates is set or not, but if clientCertificates is set, the managed Cassandra cluster will
     * reject all connections not bearing a TLS client certificate that can be validated from one or more of the public
     * certificates in this property.
     */
    private List<Certificate> clientCertificates;

    /*
     * List of TLS certificates used to authorize gossip from unmanaged data centers. The TLS certificates of all nodes
     * in unmanaged data centers must be verifiable using one of the certificates provided in this property.
     */
    private List<Certificate> externalGossipCertificates;

    /*
     * List of TLS certificates that unmanaged nodes must trust for gossip with managed nodes. All managed nodes will
     * present TLS client certificates that are verifiable using one of the certificates provided in this property.
     */
    private List<Certificate> gossipCertificates;

    /*
     * List of IP addresses of seed nodes in unmanaged data centers. These will be added to the seed node lists of all
     * managed nodes.
     */
    private List<SeedNode> externalSeedNodes;

    /*
     * List of IP addresses of seed nodes in the managed data centers. These should be added to the seed node lists of
     * all unmanaged nodes.
     */
    private List<SeedNode> seedNodes;

    /*
     * (Deprecated) Number of hours to wait between taking a backup of the cluster.
     */
    private Integer hoursBetweenBackups;

    /*
     * Whether the cluster and associated data centers has been deallocated.
     */
    private Boolean deallocated;

    /*
     * Whether Cassandra audit logging is enabled
     */
    private Boolean cassandraAuditLoggingEnabled;

    /*
     * Error related to resource provisioning.
     */
    private CassandraError provisionError;

    /*
     * How to connect to the azure services needed for running the cluster
     */
    private AzureConnectionType azureConnectionMethod;

    /*
     * If the Connection Method is VPN, this is the Id of the private link resource that the datacenters need to connect
     * to.
     */
    private String privateLinkResourceId;

    /**
     * Creates an instance of ClusterResourceProperties class.
     */
    public ClusterResourceProperties() {
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
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withProvisioningState(ManagedCassandraProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the restoreFromBackupId property: To create an empty cluster, omit this field or set it to null. To restore a
     * backup into a new cluster, set this field to the resource id of the backup.
     * 
     * @return the restoreFromBackupId value.
     */
    public String restoreFromBackupId() {
        return this.restoreFromBackupId;
    }

    /**
     * Set the restoreFromBackupId property: To create an empty cluster, omit this field or set it to null. To restore a
     * backup into a new cluster, set this field to the resource id of the backup.
     * 
     * @param restoreFromBackupId the restoreFromBackupId value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withRestoreFromBackupId(String restoreFromBackupId) {
        this.restoreFromBackupId = restoreFromBackupId;
        return this;
    }

    /**
     * Get the delegatedManagementSubnetId property: Resource id of a subnet that this cluster's management service
     * should have its network interface attached to. The subnet must be routable to all subnets that will be delegated
     * to data centers. The resource id must be of the form '/subscriptions/&lt;subscription
     * id&gt;/resourceGroups/&lt;resource group&gt;/providers/Microsoft.Network/virtualNetworks/&lt;virtual
     * network&gt;/subnets/&lt;subnet&gt;'.
     * 
     * @return the delegatedManagementSubnetId value.
     */
    public String delegatedManagementSubnetId() {
        return this.delegatedManagementSubnetId;
    }

    /**
     * Set the delegatedManagementSubnetId property: Resource id of a subnet that this cluster's management service
     * should have its network interface attached to. The subnet must be routable to all subnets that will be delegated
     * to data centers. The resource id must be of the form '/subscriptions/&lt;subscription
     * id&gt;/resourceGroups/&lt;resource group&gt;/providers/Microsoft.Network/virtualNetworks/&lt;virtual
     * network&gt;/subnets/&lt;subnet&gt;'.
     * 
     * @param delegatedManagementSubnetId the delegatedManagementSubnetId value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withDelegatedManagementSubnetId(String delegatedManagementSubnetId) {
        this.delegatedManagementSubnetId = delegatedManagementSubnetId;
        return this;
    }

    /**
     * Get the cassandraVersion property: Which version of Cassandra should this cluster converge to running (e.g.,
     * 3.11). When updated, the cluster may take some time to migrate to the new version.
     * 
     * @return the cassandraVersion value.
     */
    public String cassandraVersion() {
        return this.cassandraVersion;
    }

    /**
     * Set the cassandraVersion property: Which version of Cassandra should this cluster converge to running (e.g.,
     * 3.11). When updated, the cluster may take some time to migrate to the new version.
     * 
     * @param cassandraVersion the cassandraVersion value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withCassandraVersion(String cassandraVersion) {
        this.cassandraVersion = cassandraVersion;
        return this;
    }

    /**
     * Get the clusterNameOverride property: If you need to set the clusterName property in cassandra.yaml to something
     * besides the resource name of the cluster, set the value to use on this property.
     * 
     * @return the clusterNameOverride value.
     */
    public String clusterNameOverride() {
        return this.clusterNameOverride;
    }

    /**
     * Set the clusterNameOverride property: If you need to set the clusterName property in cassandra.yaml to something
     * besides the resource name of the cluster, set the value to use on this property.
     * 
     * @param clusterNameOverride the clusterNameOverride value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withClusterNameOverride(String clusterNameOverride) {
        this.clusterNameOverride = clusterNameOverride;
        return this;
    }

    /**
     * Get the authenticationMethod property: Which authentication method Cassandra should use to authenticate clients.
     * 'None' turns off authentication, so should not be used except in emergencies. 'Cassandra' is the default password
     * based authentication. The default is 'Cassandra'.
     * 
     * @return the authenticationMethod value.
     */
    public AuthenticationMethod authenticationMethod() {
        return this.authenticationMethod;
    }

    /**
     * Set the authenticationMethod property: Which authentication method Cassandra should use to authenticate clients.
     * 'None' turns off authentication, so should not be used except in emergencies. 'Cassandra' is the default password
     * based authentication. The default is 'Cassandra'.
     * 
     * @param authenticationMethod the authenticationMethod value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withAuthenticationMethod(AuthenticationMethod authenticationMethod) {
        this.authenticationMethod = authenticationMethod;
        return this;
    }

    /**
     * Get the initialCassandraAdminPassword property: Initial password for clients connecting as admin to the cluster.
     * Should be changed after cluster creation. Returns null on GET. This field only applies when the
     * authenticationMethod field is 'Cassandra'.
     * 
     * @return the initialCassandraAdminPassword value.
     */
    public String initialCassandraAdminPassword() {
        return this.initialCassandraAdminPassword;
    }

    /**
     * Set the initialCassandraAdminPassword property: Initial password for clients connecting as admin to the cluster.
     * Should be changed after cluster creation. Returns null on GET. This field only applies when the
     * authenticationMethod field is 'Cassandra'.
     * 
     * @param initialCassandraAdminPassword the initialCassandraAdminPassword value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withInitialCassandraAdminPassword(String initialCassandraAdminPassword) {
        this.initialCassandraAdminPassword = initialCassandraAdminPassword;
        return this;
    }

    /**
     * Get the prometheusEndpoint property: Hostname or IP address where the Prometheus endpoint containing data about
     * the managed Cassandra nodes can be reached.
     * 
     * @return the prometheusEndpoint value.
     */
    public SeedNode prometheusEndpoint() {
        return this.prometheusEndpoint;
    }

    /**
     * Set the prometheusEndpoint property: Hostname or IP address where the Prometheus endpoint containing data about
     * the managed Cassandra nodes can be reached.
     * 
     * @param prometheusEndpoint the prometheusEndpoint value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withPrometheusEndpoint(SeedNode prometheusEndpoint) {
        this.prometheusEndpoint = prometheusEndpoint;
        return this;
    }

    /**
     * Get the repairEnabled property: Should automatic repairs run on this cluster? If omitted, this is true, and
     * should stay true unless you are running a hybrid cluster where you are already doing your own repairs.
     * 
     * @return the repairEnabled value.
     */
    public Boolean repairEnabled() {
        return this.repairEnabled;
    }

    /**
     * Set the repairEnabled property: Should automatic repairs run on this cluster? If omitted, this is true, and
     * should stay true unless you are running a hybrid cluster where you are already doing your own repairs.
     * 
     * @param repairEnabled the repairEnabled value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withRepairEnabled(Boolean repairEnabled) {
        this.repairEnabled = repairEnabled;
        return this;
    }

    /**
     * Get the clientCertificates property: List of TLS certificates used to authorize clients connecting to the
     * cluster. All connections are TLS encrypted whether clientCertificates is set or not, but if clientCertificates is
     * set, the managed Cassandra cluster will reject all connections not bearing a TLS client certificate that can be
     * validated from one or more of the public certificates in this property.
     * 
     * @return the clientCertificates value.
     */
    public List<Certificate> clientCertificates() {
        return this.clientCertificates;
    }

    /**
     * Set the clientCertificates property: List of TLS certificates used to authorize clients connecting to the
     * cluster. All connections are TLS encrypted whether clientCertificates is set or not, but if clientCertificates is
     * set, the managed Cassandra cluster will reject all connections not bearing a TLS client certificate that can be
     * validated from one or more of the public certificates in this property.
     * 
     * @param clientCertificates the clientCertificates value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withClientCertificates(List<Certificate> clientCertificates) {
        this.clientCertificates = clientCertificates;
        return this;
    }

    /**
     * Get the externalGossipCertificates property: List of TLS certificates used to authorize gossip from unmanaged
     * data centers. The TLS certificates of all nodes in unmanaged data centers must be verifiable using one of the
     * certificates provided in this property.
     * 
     * @return the externalGossipCertificates value.
     */
    public List<Certificate> externalGossipCertificates() {
        return this.externalGossipCertificates;
    }

    /**
     * Set the externalGossipCertificates property: List of TLS certificates used to authorize gossip from unmanaged
     * data centers. The TLS certificates of all nodes in unmanaged data centers must be verifiable using one of the
     * certificates provided in this property.
     * 
     * @param externalGossipCertificates the externalGossipCertificates value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withExternalGossipCertificates(List<Certificate> externalGossipCertificates) {
        this.externalGossipCertificates = externalGossipCertificates;
        return this;
    }

    /**
     * Get the gossipCertificates property: List of TLS certificates that unmanaged nodes must trust for gossip with
     * managed nodes. All managed nodes will present TLS client certificates that are verifiable using one of the
     * certificates provided in this property.
     * 
     * @return the gossipCertificates value.
     */
    public List<Certificate> gossipCertificates() {
        return this.gossipCertificates;
    }

    /**
     * Get the externalSeedNodes property: List of IP addresses of seed nodes in unmanaged data centers. These will be
     * added to the seed node lists of all managed nodes.
     * 
     * @return the externalSeedNodes value.
     */
    public List<SeedNode> externalSeedNodes() {
        return this.externalSeedNodes;
    }

    /**
     * Set the externalSeedNodes property: List of IP addresses of seed nodes in unmanaged data centers. These will be
     * added to the seed node lists of all managed nodes.
     * 
     * @param externalSeedNodes the externalSeedNodes value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withExternalSeedNodes(List<SeedNode> externalSeedNodes) {
        this.externalSeedNodes = externalSeedNodes;
        return this;
    }

    /**
     * Get the seedNodes property: List of IP addresses of seed nodes in the managed data centers. These should be added
     * to the seed node lists of all unmanaged nodes.
     * 
     * @return the seedNodes value.
     */
    public List<SeedNode> seedNodes() {
        return this.seedNodes;
    }

    /**
     * Get the hoursBetweenBackups property: (Deprecated) Number of hours to wait between taking a backup of the
     * cluster.
     * 
     * @return the hoursBetweenBackups value.
     */
    public Integer hoursBetweenBackups() {
        return this.hoursBetweenBackups;
    }

    /**
     * Set the hoursBetweenBackups property: (Deprecated) Number of hours to wait between taking a backup of the
     * cluster.
     * 
     * @param hoursBetweenBackups the hoursBetweenBackups value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withHoursBetweenBackups(Integer hoursBetweenBackups) {
        this.hoursBetweenBackups = hoursBetweenBackups;
        return this;
    }

    /**
     * Get the deallocated property: Whether the cluster and associated data centers has been deallocated.
     * 
     * @return the deallocated value.
     */
    public Boolean deallocated() {
        return this.deallocated;
    }

    /**
     * Set the deallocated property: Whether the cluster and associated data centers has been deallocated.
     * 
     * @param deallocated the deallocated value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withDeallocated(Boolean deallocated) {
        this.deallocated = deallocated;
        return this;
    }

    /**
     * Get the cassandraAuditLoggingEnabled property: Whether Cassandra audit logging is enabled.
     * 
     * @return the cassandraAuditLoggingEnabled value.
     */
    public Boolean cassandraAuditLoggingEnabled() {
        return this.cassandraAuditLoggingEnabled;
    }

    /**
     * Set the cassandraAuditLoggingEnabled property: Whether Cassandra audit logging is enabled.
     * 
     * @param cassandraAuditLoggingEnabled the cassandraAuditLoggingEnabled value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withCassandraAuditLoggingEnabled(Boolean cassandraAuditLoggingEnabled) {
        this.cassandraAuditLoggingEnabled = cassandraAuditLoggingEnabled;
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
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withProvisionError(CassandraError provisionError) {
        this.provisionError = provisionError;
        return this;
    }

    /**
     * Get the azureConnectionMethod property: How to connect to the azure services needed for running the cluster.
     * 
     * @return the azureConnectionMethod value.
     */
    public AzureConnectionType azureConnectionMethod() {
        return this.azureConnectionMethod;
    }

    /**
     * Set the azureConnectionMethod property: How to connect to the azure services needed for running the cluster.
     * 
     * @param azureConnectionMethod the azureConnectionMethod value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withAzureConnectionMethod(AzureConnectionType azureConnectionMethod) {
        this.azureConnectionMethod = azureConnectionMethod;
        return this;
    }

    /**
     * Get the privateLinkResourceId property: If the Connection Method is VPN, this is the Id of the private link
     * resource that the datacenters need to connect to.
     * 
     * @return the privateLinkResourceId value.
     */
    public String privateLinkResourceId() {
        return this.privateLinkResourceId;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (prometheusEndpoint() != null) {
            prometheusEndpoint().validate();
        }
        if (clientCertificates() != null) {
            clientCertificates().forEach(e -> e.validate());
        }
        if (externalGossipCertificates() != null) {
            externalGossipCertificates().forEach(e -> e.validate());
        }
        if (gossipCertificates() != null) {
            gossipCertificates().forEach(e -> e.validate());
        }
        if (externalSeedNodes() != null) {
            externalSeedNodes().forEach(e -> e.validate());
        }
        if (seedNodes() != null) {
            seedNodes().forEach(e -> e.validate());
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
        jsonWriter.writeStringField("restoreFromBackupId", this.restoreFromBackupId);
        jsonWriter.writeStringField("delegatedManagementSubnetId", this.delegatedManagementSubnetId);
        jsonWriter.writeStringField("cassandraVersion", this.cassandraVersion);
        jsonWriter.writeStringField("clusterNameOverride", this.clusterNameOverride);
        jsonWriter.writeStringField("authenticationMethod",
            this.authenticationMethod == null ? null : this.authenticationMethod.toString());
        jsonWriter.writeStringField("initialCassandraAdminPassword", this.initialCassandraAdminPassword);
        jsonWriter.writeJsonField("prometheusEndpoint", this.prometheusEndpoint);
        jsonWriter.writeBooleanField("repairEnabled", this.repairEnabled);
        jsonWriter.writeArrayField("clientCertificates", this.clientCertificates,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("externalGossipCertificates", this.externalGossipCertificates,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("externalSeedNodes", this.externalSeedNodes,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeNumberField("hoursBetweenBackups", this.hoursBetweenBackups);
        jsonWriter.writeBooleanField("deallocated", this.deallocated);
        jsonWriter.writeBooleanField("cassandraAuditLoggingEnabled", this.cassandraAuditLoggingEnabled);
        jsonWriter.writeJsonField("provisionError", this.provisionError);
        jsonWriter.writeStringField("azureConnectionMethod",
            this.azureConnectionMethod == null ? null : this.azureConnectionMethod.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterResourceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterResourceProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ClusterResourceProperties.
     */
    public static ClusterResourceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterResourceProperties deserializedClusterResourceProperties = new ClusterResourceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedClusterResourceProperties.provisioningState
                        = ManagedCassandraProvisioningState.fromString(reader.getString());
                } else if ("restoreFromBackupId".equals(fieldName)) {
                    deserializedClusterResourceProperties.restoreFromBackupId = reader.getString();
                } else if ("delegatedManagementSubnetId".equals(fieldName)) {
                    deserializedClusterResourceProperties.delegatedManagementSubnetId = reader.getString();
                } else if ("cassandraVersion".equals(fieldName)) {
                    deserializedClusterResourceProperties.cassandraVersion = reader.getString();
                } else if ("clusterNameOverride".equals(fieldName)) {
                    deserializedClusterResourceProperties.clusterNameOverride = reader.getString();
                } else if ("authenticationMethod".equals(fieldName)) {
                    deserializedClusterResourceProperties.authenticationMethod
                        = AuthenticationMethod.fromString(reader.getString());
                } else if ("initialCassandraAdminPassword".equals(fieldName)) {
                    deserializedClusterResourceProperties.initialCassandraAdminPassword = reader.getString();
                } else if ("prometheusEndpoint".equals(fieldName)) {
                    deserializedClusterResourceProperties.prometheusEndpoint = SeedNode.fromJson(reader);
                } else if ("repairEnabled".equals(fieldName)) {
                    deserializedClusterResourceProperties.repairEnabled = reader.getNullable(JsonReader::getBoolean);
                } else if ("clientCertificates".equals(fieldName)) {
                    List<Certificate> clientCertificates = reader.readArray(reader1 -> Certificate.fromJson(reader1));
                    deserializedClusterResourceProperties.clientCertificates = clientCertificates;
                } else if ("externalGossipCertificates".equals(fieldName)) {
                    List<Certificate> externalGossipCertificates
                        = reader.readArray(reader1 -> Certificate.fromJson(reader1));
                    deserializedClusterResourceProperties.externalGossipCertificates = externalGossipCertificates;
                } else if ("gossipCertificates".equals(fieldName)) {
                    List<Certificate> gossipCertificates = reader.readArray(reader1 -> Certificate.fromJson(reader1));
                    deserializedClusterResourceProperties.gossipCertificates = gossipCertificates;
                } else if ("externalSeedNodes".equals(fieldName)) {
                    List<SeedNode> externalSeedNodes = reader.readArray(reader1 -> SeedNode.fromJson(reader1));
                    deserializedClusterResourceProperties.externalSeedNodes = externalSeedNodes;
                } else if ("seedNodes".equals(fieldName)) {
                    List<SeedNode> seedNodes = reader.readArray(reader1 -> SeedNode.fromJson(reader1));
                    deserializedClusterResourceProperties.seedNodes = seedNodes;
                } else if ("hoursBetweenBackups".equals(fieldName)) {
                    deserializedClusterResourceProperties.hoursBetweenBackups = reader.getNullable(JsonReader::getInt);
                } else if ("deallocated".equals(fieldName)) {
                    deserializedClusterResourceProperties.deallocated = reader.getNullable(JsonReader::getBoolean);
                } else if ("cassandraAuditLoggingEnabled".equals(fieldName)) {
                    deserializedClusterResourceProperties.cassandraAuditLoggingEnabled
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("provisionError".equals(fieldName)) {
                    deserializedClusterResourceProperties.provisionError = CassandraError.fromJson(reader);
                } else if ("azureConnectionMethod".equals(fieldName)) {
                    deserializedClusterResourceProperties.azureConnectionMethod
                        = AzureConnectionType.fromString(reader.getString());
                } else if ("privateLinkResourceId".equals(fieldName)) {
                    deserializedClusterResourceProperties.privateLinkResourceId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterResourceProperties;
        });
    }
}
