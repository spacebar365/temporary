package org.bouncycastle.jcajce.provider.keystore.bcfks;

import java.security.KeyStoreException;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class BcFKSKeyStoreSpi$ExtKeyStoreException extends KeyStoreException {
    private final Throwable a;

    BcFKSKeyStoreSpi$ExtKeyStoreException(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
