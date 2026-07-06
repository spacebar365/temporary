package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.security.spec.InvalidKeySpecException;

/* JADX INFO: loaded from: classes.dex */
class KeyFactorySpi$1 extends InvalidKeySpecException {
    final /* synthetic */ Exception a;
    final /* synthetic */ KeyFactorySpi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    KeyFactorySpi$1(KeyFactorySpi keyFactorySpi, String str, Exception exc) {
        super(str);
        this.b = keyFactorySpi;
        this.a = exc;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
