// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.AttachedDatabaseConfigurationProperties;
import com.azure.resourcemanager.kusto.models.DefaultPrincipalsModificationKind;
import com.azure.resourcemanager.kusto.models.TableLevelSharingProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AttachedDatabaseConfigurationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AttachedDatabaseConfigurationProperties model =
            BinaryData
                .fromString(
                    "{\"provisioningState\":\"Creating\",\"databaseName\":\"pcesutrg\",\"clusterResourceId\":\"upauut\",\"attachedDatabaseNames\":[\"qhih\"],\"defaultPrincipalsModificationKind\":\"None\",\"tableLevelSharingProperties\":{\"tablesToInclude\":[\"zpnfqntcypsxj\"],\"tablesToExclude\":[\"imwkslircizj\",\"vydfceacvlhvygdy\",\"t\"],\"externalTablesToInclude\":[\"twnawjslbiwkojgc\",\"ztsfmznbaeqp\",\"chqnrnrpxehuwry\"],\"externalTablesToExclude\":[\"aifmvikl\",\"ydv\"],\"materializedViewsToInclude\":[\"ejd\",\"nxcvds\",\"hnjivo\"],\"materializedViewsToExclude\":[\"novqfzge\",\"jdftuljltd\",\"ceamtm\",\"zuo\"],\"functionsToInclude\":[\"wcw\"],\"functionsToExclude\":[\"oknssxmojmsvpkjp\",\"vk\",\"cfzq\"]},\"databaseNameOverride\":\"yxgtczh\",\"databaseNamePrefix\":\"dbsdshm\"}")
                .toObject(AttachedDatabaseConfigurationProperties.class);
        Assertions.assertEquals("pcesutrg", model.databaseName());
        Assertions.assertEquals("upauut", model.clusterResourceId());
        Assertions.assertEquals(DefaultPrincipalsModificationKind.NONE, model.defaultPrincipalsModificationKind());
        Assertions.assertEquals("zpnfqntcypsxj", model.tableLevelSharingProperties().tablesToInclude().get(0));
        Assertions.assertEquals("imwkslircizj", model.tableLevelSharingProperties().tablesToExclude().get(0));
        Assertions
            .assertEquals("twnawjslbiwkojgc", model.tableLevelSharingProperties().externalTablesToInclude().get(0));
        Assertions.assertEquals("aifmvikl", model.tableLevelSharingProperties().externalTablesToExclude().get(0));
        Assertions.assertEquals("ejd", model.tableLevelSharingProperties().materializedViewsToInclude().get(0));
        Assertions.assertEquals("novqfzge", model.tableLevelSharingProperties().materializedViewsToExclude().get(0));
        Assertions.assertEquals("wcw", model.tableLevelSharingProperties().functionsToInclude().get(0));
        Assertions.assertEquals("oknssxmojmsvpkjp", model.tableLevelSharingProperties().functionsToExclude().get(0));
        Assertions.assertEquals("yxgtczh", model.databaseNameOverride());
        Assertions.assertEquals("dbsdshm", model.databaseNamePrefix());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AttachedDatabaseConfigurationProperties model =
            new AttachedDatabaseConfigurationProperties()
                .withDatabaseName("pcesutrg")
                .withClusterResourceId("upauut")
                .withDefaultPrincipalsModificationKind(DefaultPrincipalsModificationKind.NONE)
                .withTableLevelSharingProperties(
                    new TableLevelSharingProperties()
                        .withTablesToInclude(Arrays.asList("zpnfqntcypsxj"))
                        .withTablesToExclude(Arrays.asList("imwkslircizj", "vydfceacvlhvygdy", "t"))
                        .withExternalTablesToInclude(
                            Arrays.asList("twnawjslbiwkojgc", "ztsfmznbaeqp", "chqnrnrpxehuwry"))
                        .withExternalTablesToExclude(Arrays.asList("aifmvikl", "ydv"))
                        .withMaterializedViewsToInclude(Arrays.asList("ejd", "nxcvds", "hnjivo"))
                        .withMaterializedViewsToExclude(Arrays.asList("novqfzge", "jdftuljltd", "ceamtm", "zuo"))
                        .withFunctionsToInclude(Arrays.asList("wcw"))
                        .withFunctionsToExclude(Arrays.asList("oknssxmojmsvpkjp", "vk", "cfzq")))
                .withDatabaseNameOverride("yxgtczh")
                .withDatabaseNamePrefix("dbsdshm");
        model = BinaryData.fromObject(model).toObject(AttachedDatabaseConfigurationProperties.class);
        Assertions.assertEquals("pcesutrg", model.databaseName());
        Assertions.assertEquals("upauut", model.clusterResourceId());
        Assertions.assertEquals(DefaultPrincipalsModificationKind.NONE, model.defaultPrincipalsModificationKind());
        Assertions.assertEquals("zpnfqntcypsxj", model.tableLevelSharingProperties().tablesToInclude().get(0));
        Assertions.assertEquals("imwkslircizj", model.tableLevelSharingProperties().tablesToExclude().get(0));
        Assertions
            .assertEquals("twnawjslbiwkojgc", model.tableLevelSharingProperties().externalTablesToInclude().get(0));
        Assertions.assertEquals("aifmvikl", model.tableLevelSharingProperties().externalTablesToExclude().get(0));
        Assertions.assertEquals("ejd", model.tableLevelSharingProperties().materializedViewsToInclude().get(0));
        Assertions.assertEquals("novqfzge", model.tableLevelSharingProperties().materializedViewsToExclude().get(0));
        Assertions.assertEquals("wcw", model.tableLevelSharingProperties().functionsToInclude().get(0));
        Assertions.assertEquals("oknssxmojmsvpkjp", model.tableLevelSharingProperties().functionsToExclude().get(0));
        Assertions.assertEquals("yxgtczh", model.databaseNameOverride());
        Assertions.assertEquals("dbsdshm", model.databaseNamePrefix());
    }
}
