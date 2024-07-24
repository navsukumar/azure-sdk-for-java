// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Client certificate mode for mTLS authentication. Ignore indicates server drops client certificate on forwarding.
 * Accept indicates server forwards client certificate but does not require a client certificate. Require indicates
 * server requires a client certificate.
 */
public final class IngressClientCertificateMode extends ExpandableStringEnum<IngressClientCertificateMode> {
    /**
     * Static value ignore for IngressClientCertificateMode.
     */
    public static final IngressClientCertificateMode IGNORE = fromString("ignore");

    /**
     * Static value accept for IngressClientCertificateMode.
     */
    public static final IngressClientCertificateMode ACCEPT = fromString("accept");

    /**
     * Static value require for IngressClientCertificateMode.
     */
    public static final IngressClientCertificateMode REQUIRE = fromString("require");

    /**
     * Creates a new instance of IngressClientCertificateMode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public IngressClientCertificateMode() {
    }

    /**
     * Creates or finds a IngressClientCertificateMode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding IngressClientCertificateMode.
     */
    public static IngressClientCertificateMode fromString(String name) {
        return fromString(name, IngressClientCertificateMode.class);
    }

    /**
     * Gets known IngressClientCertificateMode values.
     * 
     * @return known IngressClientCertificateMode values.
     */
    public static Collection<IngressClientCertificateMode> values() {
        return values(IngressClientCertificateMode.class);
    }
}
