package org.bouncycastle.p083b.p089e;

import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1076ba;

/* JADX INFO: renamed from: org.bouncycastle.b.e.ab */
/* JADX INFO: loaded from: classes.dex */
public final class C0893ab implements InterfaceC0890e {

    /* JADX INFO: renamed from: a */
    private int[] f3667a = null;

    /* JADX INFO: renamed from: a */
    private static int m2136a(int i) {
        if (i < 2) {
            return i;
        }
        int i2 = 65537 / i;
        int i3 = 65537 % i;
        int i4 = 1;
        int i5 = i;
        while (i3 != 1) {
            int i6 = i5 / i3;
            i5 %= i3;
            int i7 = (i4 + (i6 * i2)) & 65535;
            if (i5 == 1) {
                return i7;
            }
            int i8 = i3 / i5;
            i3 %= i5;
            i2 = (i2 + (i8 * i7)) & 65535;
            i4 = i7;
        }
        return (1 - i2) & 65535;
    }

    /* JADX INFO: renamed from: a */
    private static int m2137a(int i, int i2) {
        int i3;
        if (i == 0) {
            i3 = 65537 - i2;
        } else if (i2 == 0) {
            i3 = 65537 - i;
        } else {
            int i4 = i * i2;
            int i5 = i4 & 65535;
            int i6 = i4 >>> 16;
            i3 = (i5 < i6 ? 1 : 0) + (i5 - i6);
        }
        return i3 & 65535;
    }

    /* JADX INFO: renamed from: a */
    private static int m2138a(byte[] bArr, int i) {
        return ((bArr[i] << 8) & 65280) + (bArr[i + 1] & 255);
    }

    /* JADX INFO: renamed from: a */
    private static void m2139a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
    }

    /* JADX INFO: renamed from: a */
    private static void m2140a(int[] iArr, byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = 0;
        int iM2138a = m2138a(bArr, i);
        int iM2138a2 = m2138a(bArr, i + 2);
        int iM2138a3 = m2138a(bArr, i + 4);
        int iM2138a4 = m2138a(bArr, i + 6);
        int i4 = 0;
        while (true) {
            int i5 = i3;
            if (i4 >= 8) {
                int i6 = i5 + 1;
                m2139a(m2137a(iM2138a, iArr[i5]), bArr2, i2);
                int i7 = i6 + 1;
                m2139a(iArr[i6] + iM2138a3, bArr2, i2 + 2);
                m2139a(iArr[i7] + iM2138a2, bArr2, i2 + 4);
                m2139a(m2137a(iM2138a4, iArr[i7 + 1]), bArr2, i2 + 6);
                return;
            }
            int i8 = i5 + 1;
            int iM2137a = m2137a(iM2138a, iArr[i5]);
            int i9 = i8 + 1;
            int i10 = (iArr[i8] + iM2138a2) & 65535;
            int i11 = i9 + 1;
            int i12 = (iM2138a3 + iArr[i9]) & 65535;
            int i13 = i11 + 1;
            int iM2137a2 = m2137a(iM2138a4, iArr[i11]);
            int i14 = i13 + 1;
            int iM2137a3 = m2137a(i12 ^ iM2137a, iArr[i13]);
            i3 = i14 + 1;
            int iM2137a4 = m2137a(((i10 ^ iM2137a2) + iM2137a3) & 65535, iArr[i14]);
            int i15 = (iM2137a3 + iM2137a4) & 65535;
            iM2138a = iM2137a ^ iM2137a4;
            iM2138a4 = iM2137a2 ^ i15;
            iM2138a2 = iM2137a4 ^ i12;
            iM2138a3 = i15 ^ i10;
            i4++;
        }
    }

    /* JADX INFO: renamed from: a */
    private static int[] m2141a(byte[] bArr) {
        int[] iArr = new int[52];
        if (bArr.length < 16) {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
            bArr = bArr2;
        }
        for (int i = 0; i < 8; i++) {
            iArr[i] = m2138a(bArr, i * 2);
        }
        for (int i2 = 8; i2 < 52; i2++) {
            if ((i2 & 7) < 6) {
                iArr[i2] = (((iArr[i2 - 7] & 127) << 9) | (iArr[i2 - 6] >> 7)) & 65535;
            } else if ((i2 & 7) == 6) {
                iArr[i2] = (((iArr[i2 - 7] & 127) << 9) | (iArr[i2 - 14] >> 7)) & 65535;
            } else {
                iArr[i2] = (((iArr[i2 - 15] & 127) << 9) | (iArr[i2 - 14] >> 7)) & 65535;
            }
        }
        return iArr;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final int mo2122a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.f3667a == null) {
            throw new IllegalStateException("IDEA engine not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new C1163o("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new C0803ac("output buffer too short");
        }
        m2140a(this.f3667a, bArr, i, bArr2, i2);
        return 8;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final String mo2123a() {
        return "IDEA";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: b */
    public final int mo2125b() {
        return 8;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: c */
    public final void mo2126c() {
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final void mo2124a(boolean z, InterfaceC1003i interfaceC1003i) {
        int[] iArrM2141a;
        int i = 48;
        if (!(interfaceC1003i instanceof C1076ba)) {
            throw new IllegalArgumentException("invalid parameter passed to IDEA init - " + interfaceC1003i.getClass().getName());
        }
        byte[] bArrM2603a = ((C1076ba) interfaceC1003i).m2603a();
        if (z) {
            iArrM2141a = m2141a(bArrM2603a);
        } else {
            int[] iArrM2141a2 = m2141a(bArrM2603a);
            iArrM2141a = new int[52];
            int iM2136a = m2136a(iArrM2141a2[0]);
            int i2 = (0 - iArrM2141a2[1]) & 65535;
            int i3 = (0 - iArrM2141a2[2]) & 65535;
            int i4 = 4;
            iArrM2141a[51] = m2136a(iArrM2141a2[3]);
            iArrM2141a[50] = i3;
            iArrM2141a[49] = i2;
            iArrM2141a[48] = iM2136a;
            for (int i5 = 1; i5 < 8; i5++) {
                int i6 = i4 + 1;
                int i7 = iArrM2141a2[i4];
                int i8 = i6 + 1;
                int i9 = i - 1;
                iArrM2141a[i9] = iArrM2141a2[i6];
                int i10 = i9 - 1;
                iArrM2141a[i10] = i7;
                int i11 = i8 + 1;
                int iM2136a2 = m2136a(iArrM2141a2[i8]);
                int i12 = i11 + 1;
                int i13 = (0 - iArrM2141a2[i11]) & 65535;
                int i14 = i12 + 1;
                int i15 = (0 - iArrM2141a2[i12]) & 65535;
                i4 = i14 + 1;
                int i16 = i10 - 1;
                iArrM2141a[i16] = m2136a(iArrM2141a2[i14]);
                int i17 = i16 - 1;
                iArrM2141a[i17] = i13;
                int i18 = i17 - 1;
                iArrM2141a[i18] = i15;
                i = i18 - 1;
                iArrM2141a[i] = iM2136a2;
            }
            int i19 = i4 + 1;
            int i20 = iArrM2141a2[i4];
            int i21 = i19 + 1;
            int i22 = i - 1;
            iArrM2141a[i22] = iArrM2141a2[i19];
            int i23 = i22 - 1;
            iArrM2141a[i23] = i20;
            int i24 = i21 + 1;
            int iM2136a3 = m2136a(iArrM2141a2[i21]);
            int i25 = i24 + 1;
            int i26 = (0 - iArrM2141a2[i24]) & 65535;
            int i27 = i25 + 1;
            int i28 = (0 - iArrM2141a2[i25]) & 65535;
            int i29 = i23 - 1;
            iArrM2141a[i29] = m2136a(iArrM2141a2[i27]);
            int i30 = i29 - 1;
            iArrM2141a[i30] = i28;
            int i31 = i30 - 1;
            iArrM2141a[i31] = i26;
            iArrM2141a[i31 - 1] = iM2136a3;
        }
        this.f3667a = iArrM2141a;
    }
}
