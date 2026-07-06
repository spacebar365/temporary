package org.bouncycastle.jcajce;

import java.security.cert.CRL;
import java.security.cert.X509CRLSelector;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class PKIXCRLStoreSelector$SelectorClone extends X509CRLSelector {
    private final PKIXCRLStoreSelector a;

    @Override // java.security.cert.X509CRLSelector, java.security.cert.CRLSelector
    public boolean match(CRL crl) {
        return this.a == null ? crl != null : this.a.a(crl);
    }
}
