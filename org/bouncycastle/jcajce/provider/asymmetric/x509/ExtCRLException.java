package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.security.cert.CRLException;

/* JADX INFO: loaded from: classes.dex */
class ExtCRLException extends CRLException {
    Throwable a;

    ExtCRLException(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
