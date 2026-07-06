package org.bouncycastle.jcajce;

import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import org.bouncycastle.f.j;

/* JADX INFO: loaded from: classes.dex */
public class PKIXCertStoreSelector<T extends Certificate> implements j<T> {
    private final CertSelector a;

    private PKIXCertStoreSelector(CertSelector certSelector) {
        this.a = certSelector;
    }

    public final boolean a(Certificate certificate) {
        return this.a.match(certificate);
    }

    public Object clone() {
        return new PKIXCertStoreSelector(this.a);
    }
}
