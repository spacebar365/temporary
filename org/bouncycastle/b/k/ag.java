package org.bouncycastle.b.k;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class ag extends b {
    private final byte[] b;

    public ag(SecureRandom secureRandom) {
        super(true);
        this.b = new byte[32];
        org.bouncycastle.d.a.d.a.a(secureRandom, this.b);
    }

    public ag(byte[] bArr) {
        super(true);
        this.b = new byte[32];
        System.arraycopy(bArr, 0, this.b, 0, 32);
    }

    public final void a(ah ahVar, byte[] bArr, int i, byte[] bArr2) {
        byte[] bArr3 = new byte[32];
        if (ahVar == null) {
            org.bouncycastle.d.a.d.a.a(this.b, bArr3);
        } else {
            ahVar.a(bArr3, 0);
        }
        org.bouncycastle.d.a.d.a.a(this.b, bArr3, bArr, i, bArr2);
    }

    public final byte[] b() {
        return org.bouncycastle.f.a.b(this.b);
    }

    public final ah c() {
        byte[] bArr = new byte[32];
        org.bouncycastle.d.a.d.a.a(this.b, bArr);
        return new ah(bArr, 0);
    }
}
