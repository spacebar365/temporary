package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes.dex */
class KeyAgreementSpi$1 extends InvalidKeyException {
    final /* synthetic */ Exception a;
    final /* synthetic */ KeyAgreementSpi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    KeyAgreementSpi$1(KeyAgreementSpi keyAgreementSpi, String str, Exception exc) {
        super(str);
        this.b = keyAgreementSpi;
        this.a = exc;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
