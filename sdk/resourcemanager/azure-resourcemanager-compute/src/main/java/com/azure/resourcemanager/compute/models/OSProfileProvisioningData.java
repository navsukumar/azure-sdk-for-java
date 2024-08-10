// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Additional parameters for Reimaging Non-Ephemeral Virtual Machine.
 */
@Fluent
public final class OSProfileProvisioningData implements JsonSerializable<OSProfileProvisioningData> {
    /*
     * Specifies the password of the administrator account. <br><br> **Minimum-length (Windows):** 8 characters <br><br>
     * **Minimum-length (Linux):** 6 characters <br><br> **Max-length (Windows):** 123 characters <br><br> **Max-length
     * (Linux):** 72 characters <br><br> **Complexity requirements:** 3 out of 4 conditions below need to be fulfilled
     * <br> Has lower characters <br>Has upper characters <br> Has a digit <br> Has a special character (Regex match
     * [\W_]) <br><br> **Disallowed values:** "abc@123", "P@$$w0rd", "P@ssw0rd", "P@ssword123", "Pa$$word",
     * "pass@word1", "Password!", "Password1", "Password22", "iloveyou!" <br><br> For resetting the password, see [How
     * to reset the Remote Desktop service or its login password in a Windows
     * VM](https://docs.microsoft.com/troubleshoot/azure/virtual-machines/reset-rdp) <br><br> For resetting root
     * password, see [Manage users, SSH, and check or repair disks on Azure Linux VMs using the VMAccess
     * Extension](https://docs.microsoft.com/troubleshoot/azure/virtual-machines/troubleshoot-ssh-connection)
     */
    private String adminPassword;

    /*
     * Specifies a base-64 encoded string of custom data. The base-64 encoded string is decoded to a binary array that
     * is saved as a file on the Virtual Machine. The maximum length of the binary array is 65535 bytes. **Note: Do not
     * pass any secrets or passwords in customData property.** This property cannot be updated after the VM is created.
     * The property customData is passed to the VM to be saved as a file, for more information see [Custom Data on Azure
     * VMs](https://azure.microsoft.com/blog/custom-data-and-cloud-init-on-windows-azure/). If using cloud-init for your
     * Linux VM, see [Using cloud-init to customize a Linux VM during
     * creation](https://docs.microsoft.com/azure/virtual-machines/linux/using-cloud-init).
     */
    private String customData;

    /**
     * Creates an instance of OSProfileProvisioningData class.
     */
    public OSProfileProvisioningData() {
    }

    /**
     * Get the adminPassword property: Specifies the password of the administrator account. &lt;br&gt;&lt;br&gt;
     * **Minimum-length (Windows):** 8 characters &lt;br&gt;&lt;br&gt; **Minimum-length (Linux):** 6 characters
     * &lt;br&gt;&lt;br&gt; **Max-length (Windows):** 123 characters &lt;br&gt;&lt;br&gt; **Max-length (Linux):** 72
     * characters &lt;br&gt;&lt;br&gt; **Complexity requirements:** 3 out of 4 conditions below need to be fulfilled
     * &lt;br&gt; Has lower characters &lt;br&gt;Has upper characters &lt;br&gt; Has a digit &lt;br&gt; Has a special
     * character (Regex match [\W_]) &lt;br&gt;&lt;br&gt; **Disallowed values:** "abc&#064;123", "P&#064;$$w0rd",
     * "P&#064;ssw0rd", "P&#064;ssword123", "Pa$$word", "pass&#064;word1", "Password!", "Password1", "Password22",
     * "iloveyou!" &lt;br&gt;&lt;br&gt; For resetting the password, see [How to reset the Remote Desktop service or its
     * login password in a Windows VM](https://docs.microsoft.com/troubleshoot/azure/virtual-machines/reset-rdp)
     * &lt;br&gt;&lt;br&gt; For resetting root password, see [Manage users, SSH, and check or repair disks on Azure
     * Linux VMs using the VMAccess
     * Extension](https://docs.microsoft.com/troubleshoot/azure/virtual-machines/troubleshoot-ssh-connection).
     * 
     * @return the adminPassword value.
     */
    public String adminPassword() {
        return this.adminPassword;
    }

    /**
     * Set the adminPassword property: Specifies the password of the administrator account. &lt;br&gt;&lt;br&gt;
     * **Minimum-length (Windows):** 8 characters &lt;br&gt;&lt;br&gt; **Minimum-length (Linux):** 6 characters
     * &lt;br&gt;&lt;br&gt; **Max-length (Windows):** 123 characters &lt;br&gt;&lt;br&gt; **Max-length (Linux):** 72
     * characters &lt;br&gt;&lt;br&gt; **Complexity requirements:** 3 out of 4 conditions below need to be fulfilled
     * &lt;br&gt; Has lower characters &lt;br&gt;Has upper characters &lt;br&gt; Has a digit &lt;br&gt; Has a special
     * character (Regex match [\W_]) &lt;br&gt;&lt;br&gt; **Disallowed values:** "abc&#064;123", "P&#064;$$w0rd",
     * "P&#064;ssw0rd", "P&#064;ssword123", "Pa$$word", "pass&#064;word1", "Password!", "Password1", "Password22",
     * "iloveyou!" &lt;br&gt;&lt;br&gt; For resetting the password, see [How to reset the Remote Desktop service or its
     * login password in a Windows VM](https://docs.microsoft.com/troubleshoot/azure/virtual-machines/reset-rdp)
     * &lt;br&gt;&lt;br&gt; For resetting root password, see [Manage users, SSH, and check or repair disks on Azure
     * Linux VMs using the VMAccess
     * Extension](https://docs.microsoft.com/troubleshoot/azure/virtual-machines/troubleshoot-ssh-connection).
     * 
     * @param adminPassword the adminPassword value to set.
     * @return the OSProfileProvisioningData object itself.
     */
    public OSProfileProvisioningData withAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
        return this;
    }

    /**
     * Get the customData property: Specifies a base-64 encoded string of custom data. The base-64 encoded string is
     * decoded to a binary array that is saved as a file on the Virtual Machine. The maximum length of the binary array
     * is 65535 bytes. **Note: Do not pass any secrets or passwords in customData property.** This property cannot be
     * updated after the VM is created. The property customData is passed to the VM to be saved as a file, for more
     * information see [Custom Data on Azure
     * VMs](https://azure.microsoft.com/blog/custom-data-and-cloud-init-on-windows-azure/). If using cloud-init for your
     * Linux VM, see [Using cloud-init to customize a Linux VM during
     * creation](https://docs.microsoft.com/azure/virtual-machines/linux/using-cloud-init).
     * 
     * @return the customData value.
     */
    public String customData() {
        return this.customData;
    }

    /**
     * Set the customData property: Specifies a base-64 encoded string of custom data. The base-64 encoded string is
     * decoded to a binary array that is saved as a file on the Virtual Machine. The maximum length of the binary array
     * is 65535 bytes. **Note: Do not pass any secrets or passwords in customData property.** This property cannot be
     * updated after the VM is created. The property customData is passed to the VM to be saved as a file, for more
     * information see [Custom Data on Azure
     * VMs](https://azure.microsoft.com/blog/custom-data-and-cloud-init-on-windows-azure/). If using cloud-init for your
     * Linux VM, see [Using cloud-init to customize a Linux VM during
     * creation](https://docs.microsoft.com/azure/virtual-machines/linux/using-cloud-init).
     * 
     * @param customData the customData value to set.
     * @return the OSProfileProvisioningData object itself.
     */
    public OSProfileProvisioningData withCustomData(String customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("adminPassword", this.adminPassword);
        jsonWriter.writeStringField("customData", this.customData);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OSProfileProvisioningData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OSProfileProvisioningData if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OSProfileProvisioningData.
     */
    public static OSProfileProvisioningData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OSProfileProvisioningData deserializedOSProfileProvisioningData = new OSProfileProvisioningData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("adminPassword".equals(fieldName)) {
                    deserializedOSProfileProvisioningData.adminPassword = reader.getString();
                } else if ("customData".equals(fieldName)) {
                    deserializedOSProfileProvisioningData.customData = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOSProfileProvisioningData;
        });
    }
}
