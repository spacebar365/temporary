package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.security.cert.CRLException;

/* JADX INFO: loaded from: classes.dex */
class ExtCRLException extends CRLException {

    /* JADX INFO: renamed from: a */
    Throwable f5934a;

    ExtCRLException(String str, Throwable th) {
        super(str);
        this.f5934a = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f5934a;
    }
}
