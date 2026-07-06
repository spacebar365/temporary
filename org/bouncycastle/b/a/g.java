package org.bouncycastle.b.a;

import java.math.BigInteger;
import org.bouncycastle.b.k.ad;
import org.bouncycastle.b.k.ae;
import org.bouncycastle.b.k.bh;
import org.bouncycastle.b.k.y;
import org.bouncycastle.b.r;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    private final r a;
    private ad b;
    private BigInteger c;

    public g(r rVar) {
        this.a = rVar;
    }

    private byte[] a(org.bouncycastle.d.a.j jVar) {
        BigInteger bigIntegerA = jVar.g().a();
        BigInteger bigIntegerA2 = jVar.h().a();
        int i = bigIntegerA.toByteArray().length > 33 ? 64 : 32;
        byte[] bArr = new byte[i * 2];
        byte[] bArrA = org.bouncycastle.f.b.a(i, bigIntegerA);
        byte[] bArrA2 = org.bouncycastle.f.b.a(i, bigIntegerA2);
        for (int i2 = 0; i2 != i; i2++) {
            bArr[i2] = bArrA[(i - i2) - 1];
        }
        for (int i3 = 0; i3 != i; i3++) {
            bArr[i + i3] = bArrA2[(i - i3) - 1];
        }
        this.a.a(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[this.a.b()];
        this.a.a(bArr2, 0);
        return bArr2;
    }

    public final byte[] b(org.bouncycastle.b.i iVar) {
        ae aeVar = (ae) iVar;
        y yVarB = this.b.b();
        if (!yVarB.equals(aeVar.b())) {
            throw new IllegalStateException("ECVKO public key has wrong domain parameters");
        }
        BigInteger bigIntegerMod = yVarB.d().multiply(this.c).multiply(this.b.c()).mod(yVarB.c());
        org.bouncycastle.d.a.j jVarB = org.bouncycastle.d.a.b.b(yVarB.a(), aeVar.c());
        if (jVarB.p()) {
            throw new IllegalStateException("Infinity is not a valid public key for ECDHC");
        }
        org.bouncycastle.d.a.j jVarO = jVarB.a(bigIntegerMod).o();
        if (jVarO.p()) {
            throw new IllegalStateException("Infinity is not a valid agreement value for ECVKO");
        }
        return a(jVarO);
    }

    public final void a(org.bouncycastle.b.i iVar) {
        bh bhVar = (bh) iVar;
        this.b = (ad) bhVar.b();
        byte[] bArrA = bhVar.a();
        byte[] bArr = new byte[bArrA.length];
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = bArrA[(bArrA.length - i) - 1];
        }
        this.c = new BigInteger(1, bArr);
    }
}
