package org.bouncycastle.jcajce.provider.drbg;

import java.io.IOException;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes.dex */
class DRBG$URLSeededSecureRandom$2 implements PrivilegedAction<Integer> {
    final /* synthetic */ byte[] a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ DRBG$URLSeededSecureRandom d;

    DRBG$URLSeededSecureRandom$2(DRBG$URLSeededSecureRandom dRBG$URLSeededSecureRandom, byte[] bArr, int i, int i2) {
        this.d = dRBG$URLSeededSecureRandom;
        this.a = bArr;
        this.b = i;
        this.c = i2;
    }

    private Integer a() {
        try {
            return Integer.valueOf(DRBG$URLSeededSecureRandom.a(this.d).read(this.a, this.b, this.c));
        } catch (IOException e) {
            throw new InternalError("unable to read random source");
        }
    }

    @Override // java.security.PrivilegedAction
    public /* synthetic */ Integer run() {
        return a();
    }
}
