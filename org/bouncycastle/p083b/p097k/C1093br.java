package org.bouncycastle.p083b.p097k;

import java.security.SecureRandom;
import org.bouncycastle.p107d.p108a.p114c.AbstractC1377a;
import org.bouncycastle.p107d.p108a.p114c.AbstractC1378b;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.k.br */
/* JADX INFO: loaded from: classes.dex */
public final class C1093br extends C1075b {

    /* JADX INFO: renamed from: b */
    private final byte[] f4447b;

    public C1093br(byte[] bArr) {
        super(true);
        this.f4447b = new byte[32];
        System.arraycopy(bArr, 0, this.f4447b, 0, 32);
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m2640b() {
        return C1535a.m4086b(this.f4447b);
    }

    public C1093br(SecureRandom secureRandom) {
        super(true);
        this.f4447b = new byte[32];
        byte[] bArr = this.f4447b;
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & 248);
        bArr[31] = (byte) (bArr[31] & 127);
        bArr[31] = (byte) (bArr[31] | 64);
    }

    /* JADX INFO: renamed from: c */
    public final C1094bs m2641c() {
        byte[] bArr = new byte[32];
        AbstractC1377a.m3293a(this.f4447b, bArr);
        return new C1094bs(bArr, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m2639a(C1094bs c1094bs, byte[] bArr, int i) {
        byte[] bArr2 = new byte[32];
        c1094bs.m2642a(bArr2, 0);
        byte[] bArr3 = this.f4447b;
        int[] iArr = new int[8];
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = (i2 * 4) + 0;
            int i4 = bArr3[i3] & 255;
            int i5 = i3 + 1;
            int i6 = i4 | ((bArr3[i5] & 255) << 8);
            int i7 = i5 + 1;
            iArr[i2] = (bArr3[i7 + 1] << 24) | i6 | ((bArr3[i7] & 255) << 16);
        }
        iArr[0] = iArr[0] & (-8);
        iArr[7] = iArr[7] & Integer.MAX_VALUE;
        iArr[7] = iArr[7] | 1073741824;
        int[] iArrM3310a = AbstractC1378b.m3310a();
        AbstractC1378b.m3300a(bArr2, iArrM3310a);
        int[] iArrM3310a2 = AbstractC1378b.m3310a();
        AbstractC1378b.m3307a(iArrM3310a, iArrM3310a2, 0);
        int[] iArrM3310a3 = AbstractC1378b.m3310a();
        iArrM3310a3[0] = 1;
        int[] iArrM3310a4 = AbstractC1378b.m3310a();
        iArrM3310a4[0] = 1;
        int[] iArrM3310a5 = AbstractC1378b.m3310a();
        int[] iArrM3310a6 = AbstractC1378b.m3310a();
        int[] iArrM3310a7 = AbstractC1378b.m3310a();
        int i8 = 1;
        int i9 = 254;
        while (true) {
            AbstractC1378b.m3309a(iArrM3310a4, iArrM3310a5, iArrM3310a6, iArrM3310a4);
            AbstractC1378b.m3309a(iArrM3310a2, iArrM3310a3, iArrM3310a5, iArrM3310a2);
            AbstractC1378b.m3313b(iArrM3310a6, iArrM3310a2, iArrM3310a6);
            AbstractC1378b.m3313b(iArrM3310a4, iArrM3310a5, iArrM3310a4);
            AbstractC1378b.m3318d(iArrM3310a5, iArrM3310a5);
            AbstractC1378b.m3318d(iArrM3310a2, iArrM3310a2);
            AbstractC1378b.m3319d(iArrM3310a5, iArrM3310a2, iArrM3310a7);
            AbstractC1378b.m3312b(iArrM3310a7, iArrM3310a3);
            AbstractC1378b.m3308a(iArrM3310a3, iArrM3310a2, iArrM3310a3);
            AbstractC1378b.m3313b(iArrM3310a3, iArrM3310a7, iArrM3310a3);
            AbstractC1378b.m3313b(iArrM3310a2, iArrM3310a5, iArrM3310a2);
            AbstractC1378b.m3309a(iArrM3310a6, iArrM3310a4, iArrM3310a4, iArrM3310a5);
            AbstractC1378b.m3318d(iArrM3310a4, iArrM3310a4);
            AbstractC1378b.m3318d(iArrM3310a5, iArrM3310a5);
            AbstractC1378b.m3313b(iArrM3310a5, iArrM3310a, iArrM3310a5);
            i9--;
            int i10 = (iArr[i9 >>> 5] >>> (i9 & 31)) & 1;
            int i11 = i8 ^ i10;
            AbstractC1378b.m3298a(i11, iArrM3310a2, iArrM3310a4);
            AbstractC1378b.m3298a(i11, iArrM3310a3, iArrM3310a5);
            if (i9 < 3) {
                break;
            } else {
                i8 = i10;
            }
        }
        for (int i12 = 0; i12 < 3; i12++) {
            int[] iArrM3310a8 = AbstractC1378b.m3310a();
            int[] iArrM3310a9 = AbstractC1378b.m3310a();
            AbstractC1378b.m3309a(iArrM3310a2, iArrM3310a3, iArrM3310a8, iArrM3310a9);
            AbstractC1378b.m3318d(iArrM3310a8, iArrM3310a8);
            AbstractC1378b.m3318d(iArrM3310a9, iArrM3310a9);
            AbstractC1378b.m3313b(iArrM3310a8, iArrM3310a9, iArrM3310a2);
            AbstractC1378b.m3319d(iArrM3310a8, iArrM3310a9, iArrM3310a8);
            AbstractC1378b.m3312b(iArrM3310a8, iArrM3310a3);
            AbstractC1378b.m3308a(iArrM3310a3, iArrM3310a9, iArrM3310a3);
            AbstractC1378b.m3313b(iArrM3310a3, iArrM3310a8, iArrM3310a3);
        }
        AbstractC1378b.m3306a(iArrM3310a3, iArrM3310a3);
        AbstractC1378b.m3313b(iArrM3310a2, iArrM3310a3, iArrM3310a2);
        AbstractC1378b.m3317d(iArrM3310a2);
        AbstractC1378b.m3305a(iArrM3310a2, bArr, i);
        if (!(!C1535a.m4075a(bArr, i, 32))) {
            throw new IllegalStateException("X25519 agreement failed");
        }
    }
}
