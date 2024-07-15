// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.informaticadatamanagement.fluent.models.InformaticaServerlessRuntimeResourceListInner;
import com.azure.resourcemanager.informaticadatamanagement.models.RuntimeType;
import org.junit.jupiter.api.Assertions;

public final class InformaticaServerlessRuntimeResourceListInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InformaticaServerlessRuntimeResourceListInner model = BinaryData.fromString(
            "{\"informaticaRuntimeResources\":[{\"name\":\"mjmwvvjektcx\",\"createdTime\":\"enhwlrs\",\"updatedTime\":\"frzpwvlqdqgb\",\"createdBy\":\"qylihkaetckt\",\"updatedBy\":\"fcivfsnkym\",\"id\":\"ctq\",\"type\":\"SERVERLESS\",\"status\":\"fbebrjcxer\",\"statusLocalized\":\"uwutttxfvjrbi\",\"statusMessage\":\"phxepcyvahf\",\"serverlessConfigProperties\":{\"subnet\":\"jky\",\"applicationType\":\"j\",\"resourceGroupName\":\"ujqgidok\",\"advancedCustomProperties\":\"ljyoxgvcltb\",\"supplementaryFileLocation\":\"ncghkje\",\"platform\":\"zhbijhtxfv\",\"tags\":\"bfs\",\"vnet\":\"nehmpvecx\",\"executionTimeout\":\"debfqkkrbmpukgri\",\"computeUnits\":\"lzlfbxzpuz\",\"tenantId\":\"ispnqzahmgkbrp\",\"subscriptionId\":\"dhibnuq\",\"region\":\"pikad\",\"serverlessArmResourceId\":\"vtq\"},\"description\":\"n\"},{\"name\":\"uynhijg\",\"createdTime\":\"mebf\",\"updatedTime\":\"iarbutrcvpna\",\"createdBy\":\"zmhjrunmp\",\"updatedBy\":\"ttdbhrbnl\",\"id\":\"nkxmyskpbhenbtk\",\"type\":\"SERVERLESS\",\"status\":\"ywn\",\"statusLocalized\":\"tnrsyn\",\"statusMessage\":\"qidybyx\",\"serverlessConfigProperties\":{\"subnet\":\"fclhaaxdbabphlwr\",\"applicationType\":\"fkts\",\"resourceGroupName\":\"sucocmnyyazttbtw\",\"advancedCustomProperties\":\"qpuedckzywbiex\",\"supplementaryFileLocation\":\"eyueaxibxujwb\",\"platform\":\"walm\",\"tags\":\"yoxa\",\"vnet\":\"dkzjancuxrh\",\"executionTimeout\":\"bavxbniwdjswzt\",\"computeUnits\":\"bpg\",\"tenantId\":\"ytxhp\",\"subscriptionId\":\"bzpfzab\",\"region\":\"cuh\",\"serverlessArmResourceId\":\"tcty\"},\"description\":\"klbb\"},{\"name\":\"vplwzbhv\",\"createdTime\":\"yuguosvmkfssx\",\"updatedTime\":\"ukkfplgmgs\",\"createdBy\":\"nkjzkdeslpvlop\",\"updatedBy\":\"i\",\"id\":\"ighxpk\",\"type\":\"SERVERLESS\",\"status\":\"zb\",\"statusLocalized\":\"iuebbaumny\",\"statusMessage\":\"upedeojnabckhs\",\"serverlessConfigProperties\":{\"subnet\":\"xpsiebtfhvpes\",\"applicationType\":\"skrdqmhjj\",\"resourceGroupName\":\"tldwkyzxuutk\",\"advancedCustomProperties\":\"ws\",\"supplementaryFileLocation\":\"svlxotogtwrup\",\"platform\":\"xvnmicykvceov\",\"tags\":\"lo\",\"vnet\":\"oty\",\"executionTimeout\":\"fcnj\",\"computeUnits\":\"cn\",\"tenantId\":\"hbttkphyw\",\"subscriptionId\":\"vjtoqnermclfp\",\"region\":\"hoxus\",\"serverlessArmResourceId\":\"pabgyeps\"},\"description\":\"tazqugxywpmueefj\"}]}")
            .toObject(InformaticaServerlessRuntimeResourceListInner.class);
        Assertions.assertEquals("mjmwvvjektcx", model.informaticaRuntimeResources().get(0).name());
        Assertions.assertEquals("enhwlrs", model.informaticaRuntimeResources().get(0).createdTime());
        Assertions.assertEquals("frzpwvlqdqgb", model.informaticaRuntimeResources().get(0).updatedTime());
        Assertions.assertEquals("qylihkaetckt", model.informaticaRuntimeResources().get(0).createdBy());
        Assertions.assertEquals("fcivfsnkym", model.informaticaRuntimeResources().get(0).updatedBy());
        Assertions.assertEquals("ctq", model.informaticaRuntimeResources().get(0).id());
        Assertions.assertEquals(RuntimeType.SERVERLESS, model.informaticaRuntimeResources().get(0).type());
        Assertions.assertEquals("fbebrjcxer", model.informaticaRuntimeResources().get(0).status());
        Assertions.assertEquals("uwutttxfvjrbi", model.informaticaRuntimeResources().get(0).statusLocalized());
        Assertions.assertEquals("phxepcyvahf", model.informaticaRuntimeResources().get(0).statusMessage());
        Assertions.assertEquals("jky",
            model.informaticaRuntimeResources().get(0).serverlessConfigProperties().subnet());
        Assertions.assertEquals("j",
            model.informaticaRuntimeResources().get(0).serverlessConfigProperties().applicationType());
        Assertions.assertEquals("ujqgidok",
            model.informaticaRuntimeResources().get(0).serverlessConfigProperties().resourceGroupName());
        Assertions.assertEquals("ljyoxgvcltb",
            model.informaticaRuntimeResources().get(0).serverlessConfigProperties().advancedCustomProperties());
        Assertions.assertEquals("ncghkje",
            model.informaticaRuntimeResources().get(0).serverlessConfigProperties().supplementaryFileLocation());
        Assertions.assertEquals("zhbijhtxfv",
            model.informaticaRuntimeResources().get(0).serverlessConfigProperties().platform());
        Assertions.assertEquals("bfs", model.informaticaRuntimeResources().get(0).serverlessConfigProperties().tags());
        Assertions.assertEquals("nehmpvecx",
            model.informaticaRuntimeResources().get(0).serverlessConfigProperties().vnet());
        Assertions.assertEquals("debfqkkrbmpukgri",
            model.informaticaRuntimeResources().get(0).serverlessConfigProperties().executionTimeout());
        Assertions.assertEquals("lzlfbxzpuz",
            model.informaticaRuntimeResources().get(0).serverlessConfigProperties().computeUnits());
        Assertions.assertEquals("ispnqzahmgkbrp",
            model.informaticaRuntimeResources().get(0).serverlessConfigProperties().tenantId());
        Assertions.assertEquals("dhibnuq",
            model.informaticaRuntimeResources().get(0).serverlessConfigProperties().subscriptionId());
        Assertions.assertEquals("pikad",
            model.informaticaRuntimeResources().get(0).serverlessConfigProperties().region());
        Assertions.assertEquals("vtq",
            model.informaticaRuntimeResources().get(0).serverlessConfigProperties().serverlessArmResourceId());
        Assertions.assertEquals("n", model.informaticaRuntimeResources().get(0).description());
    }
}
