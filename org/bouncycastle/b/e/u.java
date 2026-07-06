package org.bouncycastle.b.e;

import java.util.Enumeration;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes.dex */
public final class u implements org.bouncycastle.b.e {
    private static byte[] d = {4, 10, 9, 2, 13, 8, 0, 14, 6, 11, 1, 12, 7, 15, 5, 3, 14, 11, 4, 12, 6, 13, 15, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, 13, 10, 3, 4, 2, 14, 15, 12, 7, 6, 0, 9, 11, 7, 13, 10, 1, 0, 8, 9, 15, 14, 4, 6, 12, 11, 2, 5, 3, 6, 12, 7, 1, 5, 15, 13, 8, 4, 10, 9, 14, 0, 3, 11, 2, 4, 11, 10, 0, 7, 2, 1, 13, 3, 6, 8, 5, 9, 12, 15, 14, 13, 11, 4, 1, 3, 15, 5, 9, 0, 10, 14, 7, 6, 8, 2, 12, 1, 15, 13, 0, 5, 7, 10, 4, 9, 2, 3, 14, 6, 11, 8, 12};
    private static byte[] e = {4, 2, 15, 5, 9, 1, 0, 8, 14, 3, 11, 12, 13, 7, 10, 6, 12, 9, 15, 14, 8, 1, 3, 10, 2, 7, 4, 13, 6, 0, 11, 5, 13, 8, 14, 12, 7, 3, 9, 10, 1, 5, 2, 4, 6, 15, 0, 11, 14, 9, 11, 2, 5, 15, 7, 1, 0, 13, 12, 6, 10, 4, 3, 8, 3, 14, 5, 9, 6, 8, 0, 13, 10, 11, 7, 12, 2, 1, 15, 4, 8, 15, 6, 11, 1, 9, 12, 5, 13, 3, 7, 10, 0, 14, 2, 4, 9, 11, 12, 0, 3, 6, 7, 5, 4, 8, 14, 15, 1, 10, 2, 13, 12, 6, 5, 2, 11, 0, 9, 13, 3, 14, 7, 10, 15, 4, 1, 8};
    private static byte[] f = {9, 6, 3, 2, 8, 11, 1, 7, 10, 4, 14, 15, 12, 0, 13, 5, 3, 7, 14, 9, 8, 10, 15, 0, 5, 2, 6, 12, 11, 4, 13, 1, 14, 4, 6, 2, 11, 3, 13, 8, 12, 15, 5, 10, 0, 7, 1, 9, 14, 7, 10, 12, 13, 1, 3, 9, 0, 2, 11, 4, 15, 8, 5, 6, 11, 5, 1, 9, 8, 13, 15, 0, 14, 4, 2, 3, 12, 7, 10, 6, 3, 10, 13, 12, 1, 2, 0, 11, 7, 5, 9, 4, 8, 15, 14, 6, 1, 13, 2, 9, 7, 10, 6, 0, 8, 12, 4, 5, 15, 3, 11, 14, 11, 10, 15, 5, 0, 12, 14, 8, 6, 2, 3, 9, 1, 7, 13, 4};
    private static byte[] g = {8, 4, 11, 1, 3, 5, 0, 9, 2, 14, 10, 12, 13, 6, 7, 15, 0, 1, 2, 10, 4, 13, 5, 12, 9, 7, 3, 15, 11, 8, 6, 14, 14, 12, 0, 10, 9, 2, 13, 11, 7, 5, 8, 15, 3, 6, 1, 4, 7, 5, 0, 13, 11, 6, 1, 2, 3, 10, 12, 15, 4, 14, 9, 8, 2, 7, 12, 15, 9, 5, 10, 11, 1, 4, 0, 13, 6, 8, 14, 3, 8, 3, 2, 6, 4, 13, 14, 11, 12, 1, 7, 15, 10, 0, 9, 5, 5, 2, 10, 11, 9, 1, 12, 3, 7, 4, 13, 0, 6, 15, 8, 14, 0, 4, 11, 14, 8, 3, 7, 1, 10, 2, 9, 6, 15, 13, 5, 12};
    private static byte[] h = {1, 11, 12, 2, 9, 13, 0, 15, 4, 5, 8, 14, 10, 7, 6, 3, 0, 1, 7, 13, 11, 4, 5, 2, 8, 14, 15, 12, 9, 10, 6, 3, 8, 2, 5, 0, 4, 9, 15, 10, 3, 7, 12, 13, 6, 14, 1, 11, 3, 6, 0, 1, 5, 13, 10, 8, 11, 2, 9, 7, 14, 15, 12, 4, 8, 13, 11, 0, 4, 5, 1, 2, 9, 3, 12, 14, 6, 15, 10, 7, 12, 9, 11, 1, 8, 14, 2, 4, 7, 3, 6, 5, 10, 0, 15, 13, 10, 9, 6, 8, 13, 14, 2, 0, 15, 3, 5, 11, 4, 1, 12, 7, 7, 4, 0, 5, 10, 2, 15, 14, 12, 6, 1, 11, 13, 9, 3, 8};
    private static byte[] i = {15, 12, 2, 10, 6, 4, 5, 0, 7, 9, 14, 13, 1, 11, 8, 3, 11, 6, 3, 4, 12, 15, 14, 2, 7, 13, 8, 0, 5, 10, 9, 1, 1, 12, 11, 0, 15, 14, 6, 5, 10, 13, 4, 8, 9, 3, 7, 2, 1, 5, 14, 12, 10, 7, 0, 13, 6, 2, 11, 4, 9, 3, 15, 8, 0, 12, 8, 9, 13, 2, 10, 11, 7, 3, 6, 5, 4, 14, 15, 1, 8, 0, 15, 3, 2, 5, 14, 11, 1, 10, 4, 7, 12, 9, 13, 6, 3, 0, 6, 15, 1, 14, 9, 2, 13, 8, 12, 4, 11, 10, 5, 7, 1, 10, 6, 8, 15, 11, 0, 4, 12, 3, 5, 9, 7, 13, 2, 14};
    private static byte[] j = {12, 4, 6, 2, 10, 5, 11, 9, 14, 8, 13, 7, 0, 3, 15, 1, 6, 8, 2, 3, 9, 10, 5, 12, 1, 14, 4, 7, 11, 13, 0, 15, 11, 3, 5, 8, 2, 15, 10, 13, 14, 1, 7, 4, 12, 9, 6, 0, 12, 8, 2, 1, 13, 4, 15, 6, 7, 0, 10, 5, 3, 14, 9, 11, 7, 15, 5, 10, 8, 1, 6, 13, 0, 9, 3, 14, 11, 4, 2, 12, 5, 13, 15, 6, 9, 2, 12, 10, 11, 7, 8, 1, 4, 3, 14, 0, 8, 14, 2, 5, 6, 9, 1, 12, 15, 4, 11, 0, 13, 10, 3, 7, 1, 7, 14, 13, 0, 5, 8, 3, 4, 15, 10, 6, 9, 12, 11, 2};
    private static byte[] k = {4, 10, 9, 2, 13, 8, 0, 14, 6, 11, 1, 12, 7, 15, 5, 3, 14, 11, 4, 12, 6, 13, 15, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, 13, 10, 3, 4, 2, 14, 15, 12, 7, 6, 0, 9, 11, 7, 13, 10, 1, 0, 8, 9, 15, 14, 4, 6, 12, 11, 2, 5, 3, 6, 12, 7, 1, 5, 15, 13, 8, 4, 10, 9, 14, 0, 3, 11, 2, 4, 11, 10, 0, 7, 2, 1, 13, 3, 6, 8, 5, 9, 12, 15, 14, 13, 11, 4, 1, 3, 15, 5, 9, 0, 10, 14, 7, 6, 8, 2, 12, 1, 15, 13, 0, 5, 7, 10, 4, 9, 2, 3, 14, 6, 11, 8, 12};
    private static byte[] l = {10, 4, 5, 6, 8, 1, 3, 7, 13, 12, 14, 0, 9, 2, 11, 15, 5, 15, 4, 0, 2, 13, 11, 9, 1, 7, 6, 3, 12, 14, 10, 8, 7, 15, 12, 14, 9, 4, 1, 0, 3, 11, 5, 2, 6, 10, 8, 13, 4, 10, 7, 12, 0, 15, 2, 8, 14, 1, 6, 5, 13, 11, 9, 3, 7, 6, 4, 11, 9, 12, 2, 10, 1, 8, 0, 14, 15, 13, 3, 5, 7, 6, 2, 4, 13, 9, 15, 0, 10, 1, 5, 11, 8, 14, 12, 3, 13, 14, 4, 1, 7, 0, 5, 10, 3, 12, 8, 15, 6, 2, 9, 11, 1, 3, 10, 9, 5, 11, 4, 15, 8, 6, 7, 14, 13, 0, 2, 12};
    private static Hashtable m = new Hashtable();
    private boolean b;
    private int[] a = null;
    private byte[] c = d;

    static {
        a("Default", d);
        a("E-TEST", e);
        a("E-A", f);
        a("E-B", g);
        a("E-C", h);
        a("E-D", i);
        a("Param-Z", j);
        a("D-TEST", k);
        a("D-A", l);
    }

    private int a(int i2, int i3) {
        int i4 = i3 + i2;
        int i5 = (this.c[((i4 >> 28) & 15) + 112] << 28) + (this.c[((i4 >> 0) & 15) + 0] << 0) + (this.c[((i4 >> 4) & 15) + 16] << 4) + (this.c[((i4 >> 8) & 15) + 32] << 8) + (this.c[((i4 >> 12) & 15) + 48] << 12) + (this.c[((i4 >> 16) & 15) + 64] << 16) + (this.c[((i4 >> 20) & 15) + 80] << 20) + (this.c[((i4 >> 24) & 15) + 96] << 24);
        return (i5 >>> 21) | (i5 << 11);
    }

    private static int a(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] << 24) & (-16777216)) + ((bArr[i2 + 2] << 16) & 16711680) + ((bArr[i2 + 1] << 8) & 65280) + (bArr[i2] & 255);
    }

    public static String a(byte[] bArr) {
        Enumeration enumerationKeys = m.keys();
        while (enumerationKeys.hasMoreElements()) {
            String str = (String) enumerationKeys.nextElement();
            if (org.bouncycastle.f.a.a((byte[]) m.get(str), bArr)) {
                return str;
            }
        }
        throw new IllegalArgumentException("SBOX provided did not map to a known one");
    }

    private static void a(int i2, byte[] bArr, int i3) {
        bArr[i3 + 3] = (byte) (i2 >>> 24);
        bArr[i3 + 2] = (byte) (i2 >>> 16);
        bArr[i3 + 1] = (byte) (i2 >>> 8);
        bArr[i3] = (byte) i2;
    }

    private static void a(String str, byte[] bArr) {
        m.put(org.bouncycastle.f.k.b(str), bArr);
    }

    private void a(int[] iArr, byte[] bArr, int i2, byte[] bArr2, int i3) {
        int i4 = 7;
        int iA = a(bArr, i2);
        int iA2 = a(bArr, i2 + 4);
        if (this.b) {
            int i5 = 0;
            while (i5 < 3) {
                int i6 = 0;
                int i7 = iA;
                int i8 = iA2;
                while (i6 < 8) {
                    int iA3 = i8 ^ a(i7, iArr[i6]);
                    i6++;
                    i8 = i7;
                    i7 = iA3;
                }
                i5++;
                iA = i7;
                iA2 = i8;
            }
            while (i4 > 0) {
                int iA4 = a(iA, iArr[i4]) ^ iA2;
                i4--;
                iA2 = iA;
                iA = iA4;
            }
        } else {
            int i9 = 0;
            while (i9 < 8) {
                int iA5 = a(iA, iArr[i9]) ^ iA2;
                i9++;
                iA2 = iA;
                iA = iA5;
            }
            int i10 = 0;
            while (i10 < 3) {
                int i11 = 7;
                int i12 = iA;
                int i13 = iA2;
                while (i11 >= 0 && (i10 != 2 || i11 != 0)) {
                    int iA6 = i13 ^ a(i12, iArr[i11]);
                    i11--;
                    i13 = i12;
                    i12 = iA6;
                }
                i10++;
                iA = i12;
                iA2 = i13;
            }
        }
        int iA7 = iA2 ^ a(iA, iArr[0]);
        a(iA, bArr2, i3);
        a(iA7, bArr2, i3 + 4);
    }

    public static byte[] a(String str) {
        byte[] bArr = (byte[]) m.get(org.bouncycastle.f.k.b(str));
        if (bArr == null) {
            throw new IllegalArgumentException("Unknown S-Box - possible types: \"Default\", \"E-Test\", \"E-A\", \"E-B\", \"E-C\", \"E-D\", \"Param-Z\", \"D-Test\", \"D-A\".");
        }
        return org.bouncycastle.f.a.b(bArr);
    }

    private int[] a(boolean z, byte[] bArr) {
        this.b = z;
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
        }
        int[] iArr = new int[8];
        for (int i2 = 0; i2 != 8; i2++) {
            iArr[i2] = a(bArr, i2 * 4);
        }
        return iArr;
    }

    @Override // org.bouncycastle.b.e
    public final int a(byte[] bArr, int i2, byte[] bArr2, int i3) {
        if (this.a == null) {
            throw new IllegalStateException("GOST28147 engine not initialised");
        }
        if (i2 + 8 > bArr.length) {
            throw new org.bouncycastle.b.o("input buffer too short");
        }
        if (i3 + 8 > bArr2.length) {
            throw new org.bouncycastle.b.ac("output buffer too short");
        }
        a(this.a, bArr, i2, bArr2, i3);
        return 8;
    }

    @Override // org.bouncycastle.b.e
    public final String a() {
        return "GOST28147";
    }

    @Override // org.bouncycastle.b.e
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        if (!(iVar instanceof org.bouncycastle.b.k.bg)) {
            if (iVar instanceof org.bouncycastle.b.k.ba) {
                this.a = a(z, ((org.bouncycastle.b.k.ba) iVar).a());
                return;
            } else {
                if (iVar != null) {
                    throw new IllegalArgumentException("invalid parameter passed to GOST28147 init - " + iVar.getClass().getName());
                }
                return;
            }
        }
        org.bouncycastle.b.k.bg bgVar = (org.bouncycastle.b.k.bg) iVar;
        byte[] bArrA = bgVar.a();
        if (bArrA.length != d.length) {
            throw new IllegalArgumentException("invalid S-box passed to GOST28147 init");
        }
        this.c = org.bouncycastle.f.a.b(bArrA);
        if (bgVar.b() != null) {
            this.a = a(z, ((org.bouncycastle.b.k.ba) bgVar.b()).a());
        }
    }

    @Override // org.bouncycastle.b.e
    public final int b() {
        return 8;
    }

    @Override // org.bouncycastle.b.e
    public final void c() {
    }
}
