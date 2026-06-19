package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.spec.InvalidKeySpecException;

/* JADX INFO: loaded from: classes.dex */
public class ExtendedInvalidKeySpecException extends InvalidKeySpecException {

    /* JADX INFO: renamed from: a */
    private Throwable f5919a;

    public ExtendedInvalidKeySpecException(String str, Throwable th) {
        super(str);
        this.f5919a = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f5919a;
    }
}
