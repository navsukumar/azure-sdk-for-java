// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** BackupRequestBase is the base for all backup request. */
@Fluent
public class BackupRequestBase {
    /*
     * Backup Settings
     */
    @JsonProperty(value = "backupSettings", required = true)
    private BackupSettings backupSettings;

    /** Creates an instance of BackupRequestBase class. */
    public BackupRequestBase() {
    }

    /**
     * Get the backupSettings property: Backup Settings.
     *
     * @return the backupSettings value.
     */
    public BackupSettings backupSettings() {
        return this.backupSettings;
    }

    /**
     * Set the backupSettings property: Backup Settings.
     *
     * @param backupSettings the backupSettings value to set.
     * @return the BackupRequestBase object itself.
     */
    public BackupRequestBase withBackupSettings(BackupSettings backupSettings) {
        this.backupSettings = backupSettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (backupSettings() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property backupSettings in model BackupRequestBase"));
        } else {
            backupSettings().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BackupRequestBase.class);
}
