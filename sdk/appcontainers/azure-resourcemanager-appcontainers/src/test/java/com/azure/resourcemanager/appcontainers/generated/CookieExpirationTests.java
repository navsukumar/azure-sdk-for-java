// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.CookieExpiration;
import com.azure.resourcemanager.appcontainers.models.CookieExpirationConvention;
import org.junit.jupiter.api.Assertions;

public final class CookieExpirationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CookieExpiration model
            = BinaryData.fromString("{\"convention\":\"IdentityProviderDerived\",\"timeToExpiration\":\"dlwtgrhpdj\"}")
                .toObject(CookieExpiration.class);
        Assertions.assertEquals(CookieExpirationConvention.IDENTITY_PROVIDER_DERIVED, model.convention());
        Assertions.assertEquals("dlwtgrhpdj", model.timeToExpiration());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CookieExpiration model
            = new CookieExpiration().withConvention(CookieExpirationConvention.IDENTITY_PROVIDER_DERIVED)
                .withTimeToExpiration("dlwtgrhpdj");
        model = BinaryData.fromObject(model).toObject(CookieExpiration.class);
        Assertions.assertEquals(CookieExpirationConvention.IDENTITY_PROVIDER_DERIVED, model.convention());
        Assertions.assertEquals("dlwtgrhpdj", model.timeToExpiration());
    }
}
