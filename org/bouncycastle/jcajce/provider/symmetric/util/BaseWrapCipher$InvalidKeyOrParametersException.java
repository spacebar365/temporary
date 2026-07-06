package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.InvalidKeyException;

/* JADX INFO: Access modifiers changed from: protected */
/* JADX INFO: loaded from: classes.dex */
public class BaseWrapCipher$InvalidKeyOrParametersException extends InvalidKeyException {
    private final Throwable a;

    BaseWrapCipher$InvalidKeyOrParametersException(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
