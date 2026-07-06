package org.bouncycastle.jcajce;

import java.security.cert.Certificate;
import java.security.cert.X509CertSelector;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class PKIXCertStoreSelector$SelectorClone extends X509CertSelector {
    private final PKIXCertStoreSelector a;

    @Override // java.security.cert.X509CertSelector, java.security.cert.CertSelector
    public boolean match(Certificate certificate) {
        return this.a == null ? certificate != null : this.a.a(certificate);
    }
}
