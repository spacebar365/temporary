package org.bouncycastle.b.k;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class aj extends b {
    private final byte[] b;

    public aj(SecureRandom secureRandom) {
        super(true);
        this.b = new byte[57];
        org.bouncycastle.d.a.d.b.a(secureRandom, this.b);
    }

    public aj(byte[] bArr) {
        super(true);
        this.b = new byte[57];
        System.arraycopy(bArr, 0, this.b, 0, 57);
    }

    public final void a(ak akVar, byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        byte[] bArr4 = new byte[57];
        if (akVar == null) {
            org.bouncycastle.d.a.d.b.a(this.b, bArr4);
        } else {
            akVar.a(bArr4, 0);
        }
        org.bouncycastle.d.a.d.b.a(this.b, bArr4, bArr, bArr2, i, bArr3);
    }

    public final byte[] b() {
        return org.bouncycastle.f.a.b(this.b);
    }

    public final ak c() {
        byte[] bArr = new byte[57];
        org.bouncycastle.d.a.d.b.a(this.b, bArr);
        return new ak(bArr, 0);
    }
}
