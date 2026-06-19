package org.bouncycastle.jcajce.provider.util;

import javax.crypto.BadPaddingException;

/* JADX INFO: loaded from: classes.dex */
public class BadBlockException extends BadPaddingException {

    /* JADX INFO: renamed from: a */
    private final Throwable f6216a;

    public BadBlockException(String str, Throwable th) {
        super(str);
        this.f6216a = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f6216a;
    }
}
