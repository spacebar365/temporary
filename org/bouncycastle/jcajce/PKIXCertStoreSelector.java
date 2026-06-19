package org.bouncycastle.jcajce;

import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.X509CertSelector;
import org.bouncycastle.p142f.InterfaceC1559j;

/* JADX INFO: loaded from: classes.dex */
public class PKIXCertStoreSelector<T extends Certificate> implements InterfaceC1559j<T> {

    /* JADX INFO: renamed from: a */
    private final CertSelector f5572a;

    public static class Builder {
    }

    private static class SelectorClone extends X509CertSelector {

        /* JADX INFO: renamed from: a */
        private final PKIXCertStoreSelector f5573a;

        @Override // java.security.cert.X509CertSelector, java.security.cert.CertSelector
        public boolean match(Certificate certificate) {
            return this.f5573a == null ? certificate != null : this.f5573a.m4184a(certificate);
        }
    }

    private PKIXCertStoreSelector(CertSelector certSelector) {
        this.f5572a = certSelector;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4184a(Certificate certificate) {
        return this.f5572a.match(certificate);
    }

    public Object clone() {
        return new PKIXCertStoreSelector(this.f5572a);
    }
}
