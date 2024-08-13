// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.sql.models.BlobAuditingPolicyState;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * Properties of an extended database blob auditing policy.
 */
@Fluent
public final class ExtendedDatabaseBlobAuditingPolicyProperties
    implements JsonSerializable<ExtendedDatabaseBlobAuditingPolicyProperties> {
    /*
     * Specifies condition of where clause when creating an audit.
     */
    private String predicateExpression;

    /*
     * Specifies the number of days to keep in the audit logs in the storage account.
     */
    private Integer retentionDays;

    /*
     * Specifies the Actions-Groups and Actions to audit.
     * 
     * The recommended set of action groups to use is the following combination - this will audit all the queries and
     * stored procedures executed against the database, as well as successful and failed logins:
     * 
     * BATCH_COMPLETED_GROUP,
     * SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP,
     * FAILED_DATABASE_AUTHENTICATION_GROUP.
     * 
     * This above combination is also the set that is configured by default when enabling auditing from the Azure
     * portal.
     * 
     * The supported action groups to audit are (note: choose only specific groups that cover your auditing needs. Using
     * unnecessary groups could lead to very large quantities of audit records):
     * 
     * APPLICATION_ROLE_CHANGE_PASSWORD_GROUP
     * BACKUP_RESTORE_GROUP
     * DATABASE_LOGOUT_GROUP
     * DATABASE_OBJECT_CHANGE_GROUP
     * DATABASE_OBJECT_OWNERSHIP_CHANGE_GROUP
     * DATABASE_OBJECT_PERMISSION_CHANGE_GROUP
     * DATABASE_OPERATION_GROUP
     * DATABASE_PERMISSION_CHANGE_GROUP
     * DATABASE_PRINCIPAL_CHANGE_GROUP
     * DATABASE_PRINCIPAL_IMPERSONATION_GROUP
     * DATABASE_ROLE_MEMBER_CHANGE_GROUP
     * FAILED_DATABASE_AUTHENTICATION_GROUP
     * SCHEMA_OBJECT_ACCESS_GROUP
     * SCHEMA_OBJECT_CHANGE_GROUP
     * SCHEMA_OBJECT_OWNERSHIP_CHANGE_GROUP
     * SCHEMA_OBJECT_PERMISSION_CHANGE_GROUP
     * SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP
     * USER_CHANGE_PASSWORD_GROUP
     * BATCH_STARTED_GROUP
     * BATCH_COMPLETED_GROUP
     * DBCC_GROUP
     * DATABASE_OWNERSHIP_CHANGE_GROUP
     * DATABASE_CHANGE_GROUP
     * LEDGER_OPERATION_GROUP
     * 
     * These are groups that cover all sql statements and stored procedures executed against the database, and should
     * not be used in combination with other groups as this will result in duplicate audit logs.
     * 
     * For more information, see [Database-Level Audit Action
     * Groups](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-
     * groups-and-actions#database-level-audit-action-groups).
     * 
     * For Database auditing policy, specific Actions can also be specified (note that Actions cannot be specified for
     * Server auditing policy). The supported actions to audit are:
     * SELECT
     * UPDATE
     * INSERT
     * DELETE
     * EXECUTE
     * RECEIVE
     * REFERENCES
     * 
     * The general form for defining an action to be audited is:
     * {action} ON {object} BY {principal}
     * 
     * Note that <object> in the above format can refer to an object like a table, view, or stored procedure, or an
     * entire database or schema. For the latter cases, the forms DATABASE::{db_name} and SCHEMA::{schema_name} are
     * used, respectively.
     * 
     * For example:
     * SELECT on dbo.myTable by public
     * SELECT on DATABASE::myDatabase by public
     * SELECT on SCHEMA::mySchema by public
     * 
     * For more information, see [Database-Level Audit
     * Actions](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-
     * groups-and-actions#database-level-audit-actions)
     */
    private List<String> auditActionsAndGroups;

    /*
     * Specifies whether storageAccountAccessKey value is the storage's secondary key.
     */
    private Boolean isStorageSecondaryKeyInUse;

    /*
     * Specifies whether audit events are sent to Azure Monitor.
     * In order to send the events to Azure Monitor, specify 'State' as 'Enabled' and 'IsAzureMonitorTargetEnabled' as
     * true.
     * 
     * When using REST API to configure auditing, Diagnostic Settings with 'SQLSecurityAuditEvents' diagnostic logs
     * category on the database should be also created.
     * Note that for server level audit you should use the 'master' database as {databaseName}.
     * 
     * Diagnostic Settings URI format:
     * PUT
     * https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.
     * Sql/servers/{serverName}/databases/{databaseName}/providers/microsoft.insights/diagnosticSettings/{settingsName}?
     * api-version=2017-05-01-preview
     * 
     * For more information, see [Diagnostic Settings REST API](https://go.microsoft.com/fwlink/?linkid=2033207)
     * or [Diagnostic Settings PowerShell](https://go.microsoft.com/fwlink/?linkid=2033043)
     */
    private Boolean isAzureMonitorTargetEnabled;

    /*
     * Specifies the amount of time in milliseconds that can elapse before audit actions are forced to be processed.
     * The default minimum value is 1000 (1 second). The maximum is 2,147,483,647.
     */
    private Integer queueDelayMs;

    /*
     * Specifies whether Managed Identity is used to access blob storage
     */
    private Boolean isManagedIdentityInUse;

    /*
     * Specifies the state of the audit. If state is Enabled, storageEndpoint or isAzureMonitorTargetEnabled are
     * required.
     */
    private BlobAuditingPolicyState state;

    /*
     * Specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). If state is Enabled,
     * storageEndpoint or isAzureMonitorTargetEnabled is required.
     */
    private String storageEndpoint;

    /*
     * Specifies the identifier key of the auditing storage account.
     * If state is Enabled and storageEndpoint is specified, not specifying the storageAccountAccessKey will use SQL
     * server system-assigned managed identity to access the storage.
     * Prerequisites for using managed identity authentication:
     * 1. Assign SQL Server a system-assigned managed identity in Azure Active Directory (AAD).
     * 2. Grant SQL Server identity access to the storage account by adding 'Storage Blob Data Contributor' RBAC role to
     * the server identity.
     * For more information, see [Auditing to storage using Managed Identity
     * authentication](https://go.microsoft.com/fwlink/?linkid=2114355)
     */
    private String storageAccountAccessKey;

    /*
     * Specifies the blob storage subscription Id.
     */
    private UUID storageAccountSubscriptionId;

    /**
     * Creates an instance of ExtendedDatabaseBlobAuditingPolicyProperties class.
     */
    public ExtendedDatabaseBlobAuditingPolicyProperties() {
    }

    /**
     * Get the predicateExpression property: Specifies condition of where clause when creating an audit.
     * 
     * @return the predicateExpression value.
     */
    public String predicateExpression() {
        return this.predicateExpression;
    }

    /**
     * Set the predicateExpression property: Specifies condition of where clause when creating an audit.
     * 
     * @param predicateExpression the predicateExpression value to set.
     * @return the ExtendedDatabaseBlobAuditingPolicyProperties object itself.
     */
    public ExtendedDatabaseBlobAuditingPolicyProperties withPredicateExpression(String predicateExpression) {
        this.predicateExpression = predicateExpression;
        return this;
    }

    /**
     * Get the retentionDays property: Specifies the number of days to keep in the audit logs in the storage account.
     * 
     * @return the retentionDays value.
     */
    public Integer retentionDays() {
        return this.retentionDays;
    }

    /**
     * Set the retentionDays property: Specifies the number of days to keep in the audit logs in the storage account.
     * 
     * @param retentionDays the retentionDays value to set.
     * @return the ExtendedDatabaseBlobAuditingPolicyProperties object itself.
     */
    public ExtendedDatabaseBlobAuditingPolicyProperties withRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    /**
     * Get the auditActionsAndGroups property: Specifies the Actions-Groups and Actions to audit.
     * 
     * The recommended set of action groups to use is the following combination - this will audit all the queries and
     * stored procedures executed against the database, as well as successful and failed logins:
     * 
     * BATCH_COMPLETED_GROUP,
     * SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP,
     * FAILED_DATABASE_AUTHENTICATION_GROUP.
     * 
     * This above combination is also the set that is configured by default when enabling auditing from the Azure
     * portal.
     * 
     * The supported action groups to audit are (note: choose only specific groups that cover your auditing needs. Using
     * unnecessary groups could lead to very large quantities of audit records):
     * 
     * APPLICATION_ROLE_CHANGE_PASSWORD_GROUP
     * BACKUP_RESTORE_GROUP
     * DATABASE_LOGOUT_GROUP
     * DATABASE_OBJECT_CHANGE_GROUP
     * DATABASE_OBJECT_OWNERSHIP_CHANGE_GROUP
     * DATABASE_OBJECT_PERMISSION_CHANGE_GROUP
     * DATABASE_OPERATION_GROUP
     * DATABASE_PERMISSION_CHANGE_GROUP
     * DATABASE_PRINCIPAL_CHANGE_GROUP
     * DATABASE_PRINCIPAL_IMPERSONATION_GROUP
     * DATABASE_ROLE_MEMBER_CHANGE_GROUP
     * FAILED_DATABASE_AUTHENTICATION_GROUP
     * SCHEMA_OBJECT_ACCESS_GROUP
     * SCHEMA_OBJECT_CHANGE_GROUP
     * SCHEMA_OBJECT_OWNERSHIP_CHANGE_GROUP
     * SCHEMA_OBJECT_PERMISSION_CHANGE_GROUP
     * SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP
     * USER_CHANGE_PASSWORD_GROUP
     * BATCH_STARTED_GROUP
     * BATCH_COMPLETED_GROUP
     * DBCC_GROUP
     * DATABASE_OWNERSHIP_CHANGE_GROUP
     * DATABASE_CHANGE_GROUP
     * LEDGER_OPERATION_GROUP
     * 
     * These are groups that cover all sql statements and stored procedures executed against the database, and should
     * not be used in combination with other groups as this will result in duplicate audit logs.
     * 
     * For more information, see [Database-Level Audit Action
     * Groups](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-action-groups).
     * 
     * For Database auditing policy, specific Actions can also be specified (note that Actions cannot be specified for
     * Server auditing policy). The supported actions to audit are:
     * SELECT
     * UPDATE
     * INSERT
     * DELETE
     * EXECUTE
     * RECEIVE
     * REFERENCES
     * 
     * The general form for defining an action to be audited is:
     * {action} ON {object} BY {principal}
     * 
     * Note that &lt;object&gt; in the above format can refer to an object like a table, view, or stored procedure, or
     * an entire database or schema. For the latter cases, the forms DATABASE::{db_name} and SCHEMA::{schema_name} are
     * used, respectively.
     * 
     * For example:
     * SELECT on dbo.myTable by public
     * SELECT on DATABASE::myDatabase by public
     * SELECT on SCHEMA::mySchema by public
     * 
     * For more information, see [Database-Level Audit
     * Actions](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-actions).
     * 
     * @return the auditActionsAndGroups value.
     */
    public List<String> auditActionsAndGroups() {
        return this.auditActionsAndGroups;
    }

    /**
     * Set the auditActionsAndGroups property: Specifies the Actions-Groups and Actions to audit.
     * 
     * The recommended set of action groups to use is the following combination - this will audit all the queries and
     * stored procedures executed against the database, as well as successful and failed logins:
     * 
     * BATCH_COMPLETED_GROUP,
     * SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP,
     * FAILED_DATABASE_AUTHENTICATION_GROUP.
     * 
     * This above combination is also the set that is configured by default when enabling auditing from the Azure
     * portal.
     * 
     * The supported action groups to audit are (note: choose only specific groups that cover your auditing needs. Using
     * unnecessary groups could lead to very large quantities of audit records):
     * 
     * APPLICATION_ROLE_CHANGE_PASSWORD_GROUP
     * BACKUP_RESTORE_GROUP
     * DATABASE_LOGOUT_GROUP
     * DATABASE_OBJECT_CHANGE_GROUP
     * DATABASE_OBJECT_OWNERSHIP_CHANGE_GROUP
     * DATABASE_OBJECT_PERMISSION_CHANGE_GROUP
     * DATABASE_OPERATION_GROUP
     * DATABASE_PERMISSION_CHANGE_GROUP
     * DATABASE_PRINCIPAL_CHANGE_GROUP
     * DATABASE_PRINCIPAL_IMPERSONATION_GROUP
     * DATABASE_ROLE_MEMBER_CHANGE_GROUP
     * FAILED_DATABASE_AUTHENTICATION_GROUP
     * SCHEMA_OBJECT_ACCESS_GROUP
     * SCHEMA_OBJECT_CHANGE_GROUP
     * SCHEMA_OBJECT_OWNERSHIP_CHANGE_GROUP
     * SCHEMA_OBJECT_PERMISSION_CHANGE_GROUP
     * SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP
     * USER_CHANGE_PASSWORD_GROUP
     * BATCH_STARTED_GROUP
     * BATCH_COMPLETED_GROUP
     * DBCC_GROUP
     * DATABASE_OWNERSHIP_CHANGE_GROUP
     * DATABASE_CHANGE_GROUP
     * LEDGER_OPERATION_GROUP
     * 
     * These are groups that cover all sql statements and stored procedures executed against the database, and should
     * not be used in combination with other groups as this will result in duplicate audit logs.
     * 
     * For more information, see [Database-Level Audit Action
     * Groups](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-action-groups).
     * 
     * For Database auditing policy, specific Actions can also be specified (note that Actions cannot be specified for
     * Server auditing policy). The supported actions to audit are:
     * SELECT
     * UPDATE
     * INSERT
     * DELETE
     * EXECUTE
     * RECEIVE
     * REFERENCES
     * 
     * The general form for defining an action to be audited is:
     * {action} ON {object} BY {principal}
     * 
     * Note that &lt;object&gt; in the above format can refer to an object like a table, view, or stored procedure, or
     * an entire database or schema. For the latter cases, the forms DATABASE::{db_name} and SCHEMA::{schema_name} are
     * used, respectively.
     * 
     * For example:
     * SELECT on dbo.myTable by public
     * SELECT on DATABASE::myDatabase by public
     * SELECT on SCHEMA::mySchema by public
     * 
     * For more information, see [Database-Level Audit
     * Actions](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-actions).
     * 
     * @param auditActionsAndGroups the auditActionsAndGroups value to set.
     * @return the ExtendedDatabaseBlobAuditingPolicyProperties object itself.
     */
    public ExtendedDatabaseBlobAuditingPolicyProperties withAuditActionsAndGroups(List<String> auditActionsAndGroups) {
        this.auditActionsAndGroups = auditActionsAndGroups;
        return this;
    }

    /**
     * Get the isStorageSecondaryKeyInUse property: Specifies whether storageAccountAccessKey value is the storage's
     * secondary key.
     * 
     * @return the isStorageSecondaryKeyInUse value.
     */
    public Boolean isStorageSecondaryKeyInUse() {
        return this.isStorageSecondaryKeyInUse;
    }

    /**
     * Set the isStorageSecondaryKeyInUse property: Specifies whether storageAccountAccessKey value is the storage's
     * secondary key.
     * 
     * @param isStorageSecondaryKeyInUse the isStorageSecondaryKeyInUse value to set.
     * @return the ExtendedDatabaseBlobAuditingPolicyProperties object itself.
     */
    public ExtendedDatabaseBlobAuditingPolicyProperties
        withIsStorageSecondaryKeyInUse(Boolean isStorageSecondaryKeyInUse) {
        this.isStorageSecondaryKeyInUse = isStorageSecondaryKeyInUse;
        return this;
    }

    /**
     * Get the isAzureMonitorTargetEnabled property: Specifies whether audit events are sent to Azure Monitor.
     * In order to send the events to Azure Monitor, specify 'State' as 'Enabled' and 'IsAzureMonitorTargetEnabled' as
     * true.
     * 
     * When using REST API to configure auditing, Diagnostic Settings with 'SQLSecurityAuditEvents' diagnostic logs
     * category on the database should be also created.
     * Note that for server level audit you should use the 'master' database as {databaseName}.
     * 
     * Diagnostic Settings URI format:
     * PUT
     * https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/providers/microsoft.insights/diagnosticSettings/{settingsName}?api-version=2017-05-01-preview
     * 
     * For more information, see [Diagnostic Settings REST API](https://go.microsoft.com/fwlink/?linkid=2033207)
     * or [Diagnostic Settings PowerShell](https://go.microsoft.com/fwlink/?linkid=2033043).
     * 
     * @return the isAzureMonitorTargetEnabled value.
     */
    public Boolean isAzureMonitorTargetEnabled() {
        return this.isAzureMonitorTargetEnabled;
    }

    /**
     * Set the isAzureMonitorTargetEnabled property: Specifies whether audit events are sent to Azure Monitor.
     * In order to send the events to Azure Monitor, specify 'State' as 'Enabled' and 'IsAzureMonitorTargetEnabled' as
     * true.
     * 
     * When using REST API to configure auditing, Diagnostic Settings with 'SQLSecurityAuditEvents' diagnostic logs
     * category on the database should be also created.
     * Note that for server level audit you should use the 'master' database as {databaseName}.
     * 
     * Diagnostic Settings URI format:
     * PUT
     * https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/providers/microsoft.insights/diagnosticSettings/{settingsName}?api-version=2017-05-01-preview
     * 
     * For more information, see [Diagnostic Settings REST API](https://go.microsoft.com/fwlink/?linkid=2033207)
     * or [Diagnostic Settings PowerShell](https://go.microsoft.com/fwlink/?linkid=2033043).
     * 
     * @param isAzureMonitorTargetEnabled the isAzureMonitorTargetEnabled value to set.
     * @return the ExtendedDatabaseBlobAuditingPolicyProperties object itself.
     */
    public ExtendedDatabaseBlobAuditingPolicyProperties
        withIsAzureMonitorTargetEnabled(Boolean isAzureMonitorTargetEnabled) {
        this.isAzureMonitorTargetEnabled = isAzureMonitorTargetEnabled;
        return this;
    }

    /**
     * Get the queueDelayMs property: Specifies the amount of time in milliseconds that can elapse before audit actions
     * are forced to be processed.
     * The default minimum value is 1000 (1 second). The maximum is 2,147,483,647.
     * 
     * @return the queueDelayMs value.
     */
    public Integer queueDelayMs() {
        return this.queueDelayMs;
    }

    /**
     * Set the queueDelayMs property: Specifies the amount of time in milliseconds that can elapse before audit actions
     * are forced to be processed.
     * The default minimum value is 1000 (1 second). The maximum is 2,147,483,647.
     * 
     * @param queueDelayMs the queueDelayMs value to set.
     * @return the ExtendedDatabaseBlobAuditingPolicyProperties object itself.
     */
    public ExtendedDatabaseBlobAuditingPolicyProperties withQueueDelayMs(Integer queueDelayMs) {
        this.queueDelayMs = queueDelayMs;
        return this;
    }

    /**
     * Get the isManagedIdentityInUse property: Specifies whether Managed Identity is used to access blob storage.
     * 
     * @return the isManagedIdentityInUse value.
     */
    public Boolean isManagedIdentityInUse() {
        return this.isManagedIdentityInUse;
    }

    /**
     * Set the isManagedIdentityInUse property: Specifies whether Managed Identity is used to access blob storage.
     * 
     * @param isManagedIdentityInUse the isManagedIdentityInUse value to set.
     * @return the ExtendedDatabaseBlobAuditingPolicyProperties object itself.
     */
    public ExtendedDatabaseBlobAuditingPolicyProperties withIsManagedIdentityInUse(Boolean isManagedIdentityInUse) {
        this.isManagedIdentityInUse = isManagedIdentityInUse;
        return this;
    }

    /**
     * Get the state property: Specifies the state of the audit. If state is Enabled, storageEndpoint or
     * isAzureMonitorTargetEnabled are required.
     * 
     * @return the state value.
     */
    public BlobAuditingPolicyState state() {
        return this.state;
    }

    /**
     * Set the state property: Specifies the state of the audit. If state is Enabled, storageEndpoint or
     * isAzureMonitorTargetEnabled are required.
     * 
     * @param state the state value to set.
     * @return the ExtendedDatabaseBlobAuditingPolicyProperties object itself.
     */
    public ExtendedDatabaseBlobAuditingPolicyProperties withState(BlobAuditingPolicyState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the storageEndpoint property: Specifies the blob storage endpoint (e.g.
     * https://MyAccount.blob.core.windows.net). If state is Enabled, storageEndpoint or isAzureMonitorTargetEnabled is
     * required.
     * 
     * @return the storageEndpoint value.
     */
    public String storageEndpoint() {
        return this.storageEndpoint;
    }

    /**
     * Set the storageEndpoint property: Specifies the blob storage endpoint (e.g.
     * https://MyAccount.blob.core.windows.net). If state is Enabled, storageEndpoint or isAzureMonitorTargetEnabled is
     * required.
     * 
     * @param storageEndpoint the storageEndpoint value to set.
     * @return the ExtendedDatabaseBlobAuditingPolicyProperties object itself.
     */
    public ExtendedDatabaseBlobAuditingPolicyProperties withStorageEndpoint(String storageEndpoint) {
        this.storageEndpoint = storageEndpoint;
        return this;
    }

    /**
     * Get the storageAccountAccessKey property: Specifies the identifier key of the auditing storage account.
     * If state is Enabled and storageEndpoint is specified, not specifying the storageAccountAccessKey will use SQL
     * server system-assigned managed identity to access the storage.
     * Prerequisites for using managed identity authentication:
     * 1. Assign SQL Server a system-assigned managed identity in Azure Active Directory (AAD).
     * 2. Grant SQL Server identity access to the storage account by adding 'Storage Blob Data Contributor' RBAC role to
     * the server identity.
     * For more information, see [Auditing to storage using Managed Identity
     * authentication](https://go.microsoft.com/fwlink/?linkid=2114355).
     * 
     * @return the storageAccountAccessKey value.
     */
    public String storageAccountAccessKey() {
        return this.storageAccountAccessKey;
    }

    /**
     * Set the storageAccountAccessKey property: Specifies the identifier key of the auditing storage account.
     * If state is Enabled and storageEndpoint is specified, not specifying the storageAccountAccessKey will use SQL
     * server system-assigned managed identity to access the storage.
     * Prerequisites for using managed identity authentication:
     * 1. Assign SQL Server a system-assigned managed identity in Azure Active Directory (AAD).
     * 2. Grant SQL Server identity access to the storage account by adding 'Storage Blob Data Contributor' RBAC role to
     * the server identity.
     * For more information, see [Auditing to storage using Managed Identity
     * authentication](https://go.microsoft.com/fwlink/?linkid=2114355).
     * 
     * @param storageAccountAccessKey the storageAccountAccessKey value to set.
     * @return the ExtendedDatabaseBlobAuditingPolicyProperties object itself.
     */
    public ExtendedDatabaseBlobAuditingPolicyProperties withStorageAccountAccessKey(String storageAccountAccessKey) {
        this.storageAccountAccessKey = storageAccountAccessKey;
        return this;
    }

    /**
     * Get the storageAccountSubscriptionId property: Specifies the blob storage subscription Id.
     * 
     * @return the storageAccountSubscriptionId value.
     */
    public UUID storageAccountSubscriptionId() {
        return this.storageAccountSubscriptionId;
    }

    /**
     * Set the storageAccountSubscriptionId property: Specifies the blob storage subscription Id.
     * 
     * @param storageAccountSubscriptionId the storageAccountSubscriptionId value to set.
     * @return the ExtendedDatabaseBlobAuditingPolicyProperties object itself.
     */
    public ExtendedDatabaseBlobAuditingPolicyProperties
        withStorageAccountSubscriptionId(UUID storageAccountSubscriptionId) {
        this.storageAccountSubscriptionId = storageAccountSubscriptionId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (state() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property state in model ExtendedDatabaseBlobAuditingPolicyProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ExtendedDatabaseBlobAuditingPolicyProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("state", this.state == null ? null : this.state.toString());
        jsonWriter.writeStringField("predicateExpression", this.predicateExpression);
        jsonWriter.writeNumberField("retentionDays", this.retentionDays);
        jsonWriter.writeArrayField("auditActionsAndGroups", this.auditActionsAndGroups,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeBooleanField("isStorageSecondaryKeyInUse", this.isStorageSecondaryKeyInUse);
        jsonWriter.writeBooleanField("isAzureMonitorTargetEnabled", this.isAzureMonitorTargetEnabled);
        jsonWriter.writeNumberField("queueDelayMs", this.queueDelayMs);
        jsonWriter.writeBooleanField("isManagedIdentityInUse", this.isManagedIdentityInUse);
        jsonWriter.writeStringField("storageEndpoint", this.storageEndpoint);
        jsonWriter.writeStringField("storageAccountAccessKey", this.storageAccountAccessKey);
        jsonWriter.writeStringField("storageAccountSubscriptionId",
            Objects.toString(this.storageAccountSubscriptionId, null));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExtendedDatabaseBlobAuditingPolicyProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExtendedDatabaseBlobAuditingPolicyProperties if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ExtendedDatabaseBlobAuditingPolicyProperties.
     */
    public static ExtendedDatabaseBlobAuditingPolicyProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExtendedDatabaseBlobAuditingPolicyProperties deserializedExtendedDatabaseBlobAuditingPolicyProperties
                = new ExtendedDatabaseBlobAuditingPolicyProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("state".equals(fieldName)) {
                    deserializedExtendedDatabaseBlobAuditingPolicyProperties.state
                        = BlobAuditingPolicyState.fromString(reader.getString());
                } else if ("predicateExpression".equals(fieldName)) {
                    deserializedExtendedDatabaseBlobAuditingPolicyProperties.predicateExpression = reader.getString();
                } else if ("retentionDays".equals(fieldName)) {
                    deserializedExtendedDatabaseBlobAuditingPolicyProperties.retentionDays
                        = reader.getNullable(JsonReader::getInt);
                } else if ("auditActionsAndGroups".equals(fieldName)) {
                    List<String> auditActionsAndGroups = reader.readArray(reader1 -> reader1.getString());
                    deserializedExtendedDatabaseBlobAuditingPolicyProperties.auditActionsAndGroups
                        = auditActionsAndGroups;
                } else if ("isStorageSecondaryKeyInUse".equals(fieldName)) {
                    deserializedExtendedDatabaseBlobAuditingPolicyProperties.isStorageSecondaryKeyInUse
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("isAzureMonitorTargetEnabled".equals(fieldName)) {
                    deserializedExtendedDatabaseBlobAuditingPolicyProperties.isAzureMonitorTargetEnabled
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("queueDelayMs".equals(fieldName)) {
                    deserializedExtendedDatabaseBlobAuditingPolicyProperties.queueDelayMs
                        = reader.getNullable(JsonReader::getInt);
                } else if ("isManagedIdentityInUse".equals(fieldName)) {
                    deserializedExtendedDatabaseBlobAuditingPolicyProperties.isManagedIdentityInUse
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("storageEndpoint".equals(fieldName)) {
                    deserializedExtendedDatabaseBlobAuditingPolicyProperties.storageEndpoint = reader.getString();
                } else if ("storageAccountAccessKey".equals(fieldName)) {
                    deserializedExtendedDatabaseBlobAuditingPolicyProperties.storageAccountAccessKey
                        = reader.getString();
                } else if ("storageAccountSubscriptionId".equals(fieldName)) {
                    deserializedExtendedDatabaseBlobAuditingPolicyProperties.storageAccountSubscriptionId
                        = reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExtendedDatabaseBlobAuditingPolicyProperties;
        });
    }
}
