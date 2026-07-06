package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.InvalidKeyException;
import javax.crypto.BadPaddingException;

/* JADX INFO: loaded from: classes.dex */
class BaseCipherSpi$1 extends InvalidKeyException {
    final /* synthetic */ BadPaddingException a;
    final /* synthetic */ BaseCipherSpi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseCipherSpi$1(BaseCipherSpi baseCipherSpi, String str, BadPaddingException badPaddingException) {
        super(str);
        this.b = baseCipherSpi;
        this.a = badPaddingException;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        return this.a;
    }
}
