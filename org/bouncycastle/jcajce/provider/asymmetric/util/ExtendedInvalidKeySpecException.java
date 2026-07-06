package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.spec.InvalidKeySpecException;

/* JADX INFO: loaded from: classes.dex */
public class ExtendedInvalidKeySpecException extends InvalidKeySpecException {
    private Throwable a;

    public ExtendedInvalidKeySpecException(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
