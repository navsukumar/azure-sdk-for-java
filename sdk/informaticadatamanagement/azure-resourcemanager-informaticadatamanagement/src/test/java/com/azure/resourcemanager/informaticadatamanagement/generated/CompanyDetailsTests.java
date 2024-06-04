// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.informaticadatamanagement.models.CompanyDetails;
import org.junit.jupiter.api.Assertions;

public final class CompanyDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CompanyDetails model = BinaryData.fromString(
            "{\"companyName\":\"sgcbac\",\"officeAddress\":\"ejk\",\"country\":\"ynqgoulzndlikwyq\",\"domain\":\"fgibmadgakeq\",\"business\":\"xybz\",\"numberOfEmployees\":161045800}")
            .toObject(CompanyDetails.class);
        Assertions.assertEquals("sgcbac", model.companyName());
        Assertions.assertEquals("ejk", model.officeAddress());
        Assertions.assertEquals("ynqgoulzndlikwyq", model.country());
        Assertions.assertEquals("fgibmadgakeq", model.domain());
        Assertions.assertEquals("xybz", model.business());
        Assertions.assertEquals(161045800, model.numberOfEmployees());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CompanyDetails model = new CompanyDetails().withCompanyName("sgcbac")
            .withOfficeAddress("ejk")
            .withCountry("ynqgoulzndlikwyq")
            .withDomain("fgibmadgakeq")
            .withBusiness("xybz")
            .withNumberOfEmployees(161045800);
        model = BinaryData.fromObject(model).toObject(CompanyDetails.class);
        Assertions.assertEquals("sgcbac", model.companyName());
        Assertions.assertEquals("ejk", model.officeAddress());
        Assertions.assertEquals("ynqgoulzndlikwyq", model.country());
        Assertions.assertEquals("fgibmadgakeq", model.domain());
        Assertions.assertEquals("xybz", model.business());
        Assertions.assertEquals(161045800, model.numberOfEmployees());
    }
}
