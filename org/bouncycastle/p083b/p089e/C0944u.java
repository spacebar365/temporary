package org.bouncycastle.p083b.p089e;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1082bg;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: renamed from: org.bouncycastle.b.e.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0944u implements InterfaceC0890e {

    /* JADX INFO: renamed from: d */
    private static byte[] f3939d = {4, 10, 9, 2, 13, 8, 0, 14, 6, 11, 1, 12, 7, 15, 5, 3, 14, 11, 4, 12, 6, 13, 15, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, 13, 10, 3, 4, 2, 14, 15, 12, 7, 6, 0, 9, 11, 7, 13, 10, 1, 0, 8, 9, 15, 14, 4, 6, 12, 11, 2, 5, 3, 6, 12, 7, 1, 5, 15, 13, 8, 4, 10, 9, 14, 0, 3, 11, 2, 4, 11, 10, 0, 7, 2, 1, 13, 3, 6, 8, 5, 9, 12, 15, 14, 13, 11, 4, 1, 3, 15, 5, 9, 0, 10, 14, 7, 6, 8, 2, 12, 1, 15, 13, 0, 5, 7, 10, 4, 9, 2, 3, 14, 6, 11, 8, 12};

    /* JADX INFO: renamed from: e */
    private static byte[] f3940e = {4, 2, 15, 5, 9, 1, 0, 8, 14, 3, 11, 12, 13, 7, 10, 6, 12, 9, 15, 14, 8, 1, 3, 10, 2, 7, 4, 13, 6, 0, 11, 5, 13, 8, 14, 12, 7, 3, 9, 10, 1, 5, 2, 4, 6, 15, 0, 11, 14, 9, 11, 2, 5, 15, 7, 1, 0, 13, 12, 6, 10, 4, 3, 8, 3, 14, 5, 9, 6, 8, 0, 13, 10, 11, 7, 12, 2, 1, 15, 4, 8, 15, 6, 11, 1, 9, 12, 5, 13, 3, 7, 10, 0, 14, 2, 4, 9, 11, 12, 0, 3, 6, 7, 5, 4, 8, 14, 15, 1, 10, 2, 13, 12, 6, 5, 2, 11, 0, 9, 13, 3, 14, 7, 10, 15, 4, 1, 8};

    /* JADX INFO: renamed from: f */
    private static byte[] f3941f = {9, 6, 3, 2, 8, 11, 1, 7, 10, 4, 14, 15, 12, 0, 13, 5, 3, 7, 14, 9, 8, 10, 15, 0, 5, 2, 6, 12, 11, 4, 13, 1, 14, 4, 6, 2, 11, 3, 13, 8, 12, 15, 5, 10, 0, 7, 1, 9, 14, 7, 10, 12, 13, 1, 3, 9, 0, 2, 11, 4, 15, 8, 5, 6, 11, 5, 1, 9, 8, 13, 15, 0, 14, 4, 2, 3, 12, 7, 10, 6, 3, 10, 13, 12, 1, 2, 0, 11, 7, 5, 9, 4, 8, 15, 14, 6, 1, 13, 2, 9, 7, 10, 6, 0, 8, 12, 4, 5, 15, 3, 11, 14, 11, 10, 15, 5, 0, 12, 14, 8, 6, 2, 3, 9, 1, 7, 13, 4};

    /* JADX INFO: renamed from: g */
    private static byte[] f3942g = {8, 4, 11, 1, 3, 5, 0, 9, 2, 14, 10, 12, 13, 6, 7, 15, 0, 1, 2, 10, 4, 13, 5, 12, 9, 7, 3, 15, 11, 8, 6, 14, 14, 12, 0, 10, 9, 2, 13, 11, 7, 5, 8, 15, 3, 6, 1, 4, 7, 5, 0, 13, 11, 6, 1, 2, 3, 10, 12, 15, 4, 14, 9, 8, 2, 7, 12, 15, 9, 5, 10, 11, 1, 4, 0, 13, 6, 8, 14, 3, 8, 3, 2, 6, 4, 13, 14, 11, 12, 1, 7, 15, 10, 0, 9, 5, 5, 2, 10, 11, 9, 1, 12, 3, 7, 4, 13, 0, 6, 15, 8, 14, 0, 4, 11, 14, 8, 3, 7, 1, 10, 2, 9, 6, 15, 13, 5, 12};

    /* JADX INFO: renamed from: h */
    private static byte[] f3943h = {1, 11, 12, 2, 9, 13, 0, 15, 4, 5, 8, 14, 10, 7, 6, 3, 0, 1, 7, 13, 11, 4, 5, 2, 8, 14, 15, 12, 9, 10, 6, 3, 8, 2, 5, 0, 4, 9, 15, 10, 3, 7, 12, 13, 6, 14, 1, 11, 3, 6, 0, 1, 5, 13, 10, 8, 11, 2, 9, 7, 14, 15, 12, 4, 8, 13, 11, 0, 4, 5, 1, 2, 9, 3, 12, 14, 6, 15, 10, 7, 12, 9, 11, 1, 8, 14, 2, 4, 7, 3, 6, 5, 10, 0, 15, 13, 10, 9, 6, 8, 13, 14, 2, 0, 15, 3, 5, 11, 4, 1, 12, 7, 7, 4, 0, 5, 10, 2, 15, 14, 12, 6, 1, 11, 13, 9, 3, 8};

    /* JADX INFO: renamed from: i */
    private static byte[] f3944i = {15, 12, 2, 10, 6, 4, 5, 0, 7, 9, 14, 13, 1, 11, 8, 3, 11, 6, 3, 4, 12, 15, 14, 2, 7, 13, 8, 0, 5, 10, 9, 1, 1, 12, 11, 0, 15, 14, 6, 5, 10, 13, 4, 8, 9, 3, 7, 2, 1, 5, 14, 12, 10, 7, 0, 13, 6, 2, 11, 4, 9, 3, 15, 8, 0, 12, 8, 9, 13, 2, 10, 11, 7, 3, 6, 5, 4, 14, 15, 1, 8, 0, 15, 3, 2, 5, 14, 11, 1, 10, 4, 7, 12, 9, 13, 6, 3, 0, 6, 15, 1, 14, 9, 2, 13, 8, 12, 4, 11, 10, 5, 7, 1, 10, 6, 8, 15, 11, 0, 4, 12, 3, 5, 9, 7, 13, 2, 14};

    /* JADX INFO: renamed from: j */
    private static byte[] f3945j = {12, 4, 6, 2, 10, 5, 11, 9, 14, 8, 13, 7, 0, 3, 15, 1, 6, 8, 2, 3, 9, 10, 5, 12, 1, 14, 4, 7, 11, 13, 0, 15, 11, 3, 5, 8, 2, 15, 10, 13, 14, 1, 7, 4, 12, 9, 6, 0, 12, 8, 2, 1, 13, 4, 15, 6, 7, 0, 10, 5, 3, 14, 9, 11, 7, 15, 5, 10, 8, 1, 6, 13, 0, 9, 3, 14, 11, 4, 2, 12, 5, 13, 15, 6, 9, 2, 12, 10, 11, 7, 8, 1, 4, 3, 14, 0, 8, 14, 2, 5, 6, 9, 1, 12, 15, 4, 11, 0, 13, 10, 3, 7, 1, 7, 14, 13, 0, 5, 8, 3, 4, 15, 10, 6, 9, 12, 11, 2};

    /* JADX INFO: renamed from: k */
    private static byte[] f3946k = {4, 10, 9, 2, 13, 8, 0, 14, 6, 11, 1, 12, 7, 15, 5, 3, 14, 11, 4, 12, 6, 13, 15, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, 13, 10, 3, 4, 2, 14, 15, 12, 7, 6, 0, 9, 11, 7, 13, 10, 1, 0, 8, 9, 15, 14, 4, 6, 12, 11, 2, 5, 3, 6, 12, 7, 1, 5, 15, 13, 8, 4, 10, 9, 14, 0, 3, 11, 2, 4, 11, 10, 0, 7, 2, 1, 13, 3, 6, 8, 5, 9, 12, 15, 14, 13, 11, 4, 1, 3, 15, 5, 9, 0, 10, 14, 7, 6, 8, 2, 12, 1, 15, 13, 0, 5, 7, 10, 4, 9, 2, 3, 14, 6, 11, 8, 12};

    /* JADX INFO: renamed from: l */
    private static byte[] f3947l = {10, 4, 5, 6, 8, 1, 3, 7, 13, 12, 14, 0, 9, 2, 11, 15, 5, 15, 4, 0, 2, 13, 11, 9, 1, 7, 6, 3, 12, 14, 10, 8, 7, 15, 12, 14, 9, 4, 1, 0, 3, 11, 5, 2, 6, 10, 8, 13, 4, 10, 7, 12, 0, 15, 2, 8, 14, 1, 6, 5, 13, 11, 9, 3, 7, 6, 4, 11, 9, 12, 2, 10, 1, 8, 0, 14, 15, 13, 3, 5, 7, 6, 2, 4, 13, 9, 15, 0, 10, 1, 5, 11, 8, 14, 12, 3, 13, 14, 4, 1, 7, 0, 5, 10, 3, 12, 8, 15, 6, 2, 9, 11, 1, 3, 10, 9, 5, 11, 4, 15, 8, 6, 7, 14, 13, 0, 2, 12};

    /* JADX INFO: renamed from: m */
    private static Hashtable f3948m = new Hashtable();

    /* JADX INFO: renamed from: b */
    private boolean f3950b;

    /* JADX INFO: renamed from: a */
    private int[] f3949a = null;

    /* JADX INFO: renamed from: c */
    private byte[] f3951c = f3939d;

    static {
        m2375a("Default", f3939d);
        m2375a("E-TEST", f3940e);
        m2375a("E-A", f3941f);
        m2375a("E-B", f3942g);
        m2375a("E-C", f3943h);
        m2375a("E-D", f3944i);
        m2375a("Param-Z", f3945j);
        m2375a("D-TEST", f3946k);
        m2375a("D-A", f3947l);
    }

    /* JADX INFO: renamed from: a */
    private int m2371a(int i, int i2) {
        int i3 = i2 + i;
        int i4 = (this.f3951c[((i3 >> 28) & 15) + 112] << 28) + (this.f3951c[((i3 >> 0) & 15) + 0] << 0) + (this.f3951c[((i3 >> 4) & 15) + 16] << 4) + (this.f3951c[((i3 >> 8) & 15) + 32] << 8) + (this.f3951c[((i3 >> 12) & 15) + 48] << 12) + (this.f3951c[((i3 >> 16) & 15) + 64] << 16) + (this.f3951c[((i3 >> 20) & 15) + 80] << 20) + (this.f3951c[((i3 >> 24) & 15) + 96] << 24);
        return (i4 >>> 21) | (i4 << 11);
    }

    /* JADX INFO: renamed from: a */
    private static int m2372a(byte[] bArr, int i) {
        return ((bArr[i + 3] << 24) & (-16777216)) + ((bArr[i + 2] << 16) & 16711680) + ((bArr[i + 1] << 8) & 65280) + (bArr[i] & 255);
    }

    /* JADX INFO: renamed from: a */
    public static String m2373a(byte[] bArr) {
        Enumeration enumerationKeys = f3948m.keys();
        while (enumerationKeys.hasMoreElements()) {
            String str = (String) enumerationKeys.nextElement();
            if (C1535a.m4076a((byte[]) f3948m.get(str), bArr)) {
                return str;
            }
        }
        throw new IllegalArgumentException("SBOX provided did not map to a known one");
    }

    /* JADX INFO: renamed from: a */
    private static void m2374a(int i, byte[] bArr, int i2) {
        bArr[i2 + 3] = (byte) (i >>> 24);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2] = (byte) i;
    }

    /* JADX INFO: renamed from: a */
    private static void m2375a(String str, byte[] bArr) {
        f3948m.put(C1560k.m4163b(str), bArr);
    }

    /* JADX INFO: renamed from: a */
    private void m2376a(int[] iArr, byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = 7;
        int iM2372a = m2372a(bArr, i);
        int iM2372a2 = m2372a(bArr, i + 4);
        if (this.f3950b) {
            int i4 = 0;
            while (i4 < 3) {
                int i5 = 0;
                int i6 = iM2372a;
                int i7 = iM2372a2;
                while (i5 < 8) {
                    int iM2371a = i7 ^ m2371a(i6, iArr[i5]);
                    i5++;
                    i7 = i6;
                    i6 = iM2371a;
                }
                i4++;
                iM2372a = i6;
                iM2372a2 = i7;
            }
            while (i3 > 0) {
                int iM2371a2 = m2371a(iM2372a, iArr[i3]) ^ iM2372a2;
                i3--;
                iM2372a2 = iM2372a;
                iM2372a = iM2371a2;
            }
        } else {
            int i8 = 0;
            while (i8 < 8) {
                int iM2371a3 = m2371a(iM2372a, iArr[i8]) ^ iM2372a2;
                i8++;
                iM2372a2 = iM2372a;
                iM2372a = iM2371a3;
            }
            int i9 = 0;
            while (i9 < 3) {
                int i10 = 7;
                int i11 = iM2372a;
                int i12 = iM2372a2;
                while (i10 >= 0 && (i9 != 2 || i10 != 0)) {
                    int iM2371a4 = i12 ^ m2371a(i11, iArr[i10]);
                    i10--;
                    i12 = i11;
                    i11 = iM2371a4;
                }
                i9++;
                iM2372a = i11;
                iM2372a2 = i12;
            }
        }
        int iM2371a5 = iM2372a2 ^ m2371a(iM2372a, iArr[0]);
        m2374a(iM2372a, bArr2, i2);
        m2374a(iM2371a5, bArr2, i2 + 4);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m2377a(String str) {
        byte[] bArr = (byte[]) f3948m.get(C1560k.m4163b(str));
        if (bArr == null) {
            throw new IllegalArgumentException("Unknown S-Box - possible types: \"Default\", \"E-Test\", \"E-A\", \"E-B\", \"E-C\", \"E-D\", \"Param-Z\", \"D-Test\", \"D-A\".");
        }
        return C1535a.m4086b(bArr);
    }

    /* JADX INFO: renamed from: a */
    private int[] m2378a(boolean z, byte[] bArr) {
        this.f3950b = z;
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
        }
        int[] iArr = new int[8];
        for (int i = 0; i != 8; i++) {
            iArr[i] = m2372a(bArr, i * 4);
        }
        return iArr;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final int mo2122a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.f3949a == null) {
            throw new IllegalStateException("GOST28147 engine not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new C1163o("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new C0803ac("output buffer too short");
        }
        m2376a(this.f3949a, bArr, i, bArr2, i2);
        return 8;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final String mo2123a() {
        return "GOST28147";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final void mo2124a(boolean z, InterfaceC1003i interfaceC1003i) {
        if (!(interfaceC1003i instanceof C1082bg)) {
            if (interfaceC1003i instanceof C1076ba) {
                this.f3949a = m2378a(z, ((C1076ba) interfaceC1003i).m2603a());
                return;
            } else {
                if (interfaceC1003i != null) {
                    throw new IllegalArgumentException("invalid parameter passed to GOST28147 init - " + interfaceC1003i.getClass().getName());
                }
                return;
            }
        }
        C1082bg c1082bg = (C1082bg) interfaceC1003i;
        byte[] bArrM2615a = c1082bg.m2615a();
        if (bArrM2615a.length != f3939d.length) {
            throw new IllegalArgumentException("invalid S-box passed to GOST28147 init");
        }
        this.f3951c = C1535a.m4086b(bArrM2615a);
        if (c1082bg.m2616b() != null) {
            this.f3949a = m2378a(z, ((C1076ba) c1082bg.m2616b()).m2603a());
        }
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
}
