/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2017 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.ejb.client;

import javax.net.ssl.SSLContext;

import org.wildfly.security.auth.client.AuthenticationConfiguration;

/**
 * The session creation context for a selected receiver.
 *
 * @author <a href="mailto:david.lloyd@redhat.com">David M. Lloyd</a>
 */
public final class EJBReceiverSessionCreationContext extends AbstractReceiverInvocationContext {
    private final EJBSessionCreationInvocationContext invocationContext;
    private final AuthenticationConfiguration authenticationConfiguration;
    private final SSLContext sslContext;

    EJBReceiverSessionCreationContext(final EJBSessionCreationInvocationContext invocationContext, final AuthenticationConfiguration authenticationConfiguration, final SSLContext sslContext) {
        this.invocationContext = invocationContext;
        this.authenticationConfiguration = authenticationConfiguration;
        this.sslContext = sslContext;
    }

    public EJBSessionCreationInvocationContext getClientInvocationContext() {
        return invocationContext;
    }

    public AuthenticationConfiguration getAuthenticationConfiguration() {
        return authenticationConfiguration;
    }

    public SSLContext getSSLContext() {
        return sslContext;
    }
}
