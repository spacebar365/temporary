package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.security.cert.CertificateException;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class CertificateFactory$ExCertificateException extends CertificateException {
    final /* synthetic */ CertificateFactory a;
    private Throwable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CertificateFactory$ExCertificateException(CertificateFactory certificateFactory, String str, Throwable th) {
        super(str);
        this.a = certificateFactory;
        this.b = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.b;
    }
}
