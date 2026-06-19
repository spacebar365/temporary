package org.bouncycastle.p083b.p089e;

import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1076ba;

/* JADX INFO: renamed from: org.bouncycastle.b.e.bg */
/* JADX INFO: loaded from: classes.dex */
public final class C0925bg implements InterfaceC0890e {

    /* JADX INFO: renamed from: a */
    private int[] f3832a = new int[4];

    /* JADX INFO: renamed from: b */
    private int[] f3833b = new int[32];

    /* JADX INFO: renamed from: c */
    private int[] f3834c = new int[32];

    /* JADX INFO: renamed from: d */
    private boolean f3835d = false;

    /* JADX INFO: renamed from: e */
    private boolean f3836e;

    /* JADX INFO: renamed from: a */
    private static int m2299a(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return ((bArr[i2] & 255) << 16) | (bArr[i] << 24) | ((bArr[i3] & 255) << 8) | (bArr[i3 + 1] & 255);
    }

    /* JADX INFO: renamed from: a */
    private static void m2300a(int i, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 16);
        bArr[i4] = (byte) (i >>> 8);
        bArr[i4 + 1] = (byte) i;
    }

    /* JADX INFO: renamed from: a */
    private void m2301a(byte[] bArr) {
        int i = 0;
        if (bArr.length != 16) {
            throw new IllegalArgumentException("Key size must be 128 bits.");
        }
        int i2 = 0;
        int i3 = 0;
        while (i3 < 4) {
            this.f3832a[i3] = m2299a(bArr, i2);
            i3++;
            i2 += 4;
        }
        int i4 = 0;
        while (true) {
            int i5 = i;
            if (i5 >= 32) {
                return;
            }
            this.f3833b[i5] = this.f3832a[i4 & 3] + i4;
            i4 -= 1640531527;
            this.f3834c[i5] = this.f3832a[(i4 >>> 11) & 3] + i4;
            i = i5 + 1;
        }
    }

    /* JADX INFO: renamed from: b */
    private int m2302b(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iM2299a = m2299a(bArr, i);
        int iM2299a2 = m2299a(bArr, i + 4);
        for (int i3 = 0; i3 < 32; i3++) {
            iM2299a += (((iM2299a2 << 4) ^ (iM2299a2 >>> 5)) + iM2299a2) ^ this.f3833b[i3];
            iM2299a2 += (((iM2299a << 4) ^ (iM2299a >>> 5)) + iM2299a) ^ this.f3834c[i3];
        }
        m2300a(iM2299a, bArr2, i2);
        m2300a(iM2299a2, bArr2, i2 + 4);
        return 8;
    }

    /* JADX INFO: renamed from: c */
    private int m2303c(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iM2299a = m2299a(bArr, i);
        int iM2299a2 = m2299a(bArr, i + 4);
        for (int i3 = 31; i3 >= 0; i3--) {
            iM2299a2 -= (((iM2299a << 4) ^ (iM2299a >>> 5)) + iM2299a) ^ this.f3834c[i3];
            iM2299a -= (((iM2299a2 << 4) ^ (iM2299a2 >>> 5)) + iM2299a2) ^ this.f3833b[i3];
        }
        m2300a(iM2299a, bArr2, i2);
        m2300a(iM2299a2, bArr2, i2 + 4);
        return 8;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final int mo2122a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (!this.f3835d) {
            throw new IllegalStateException("XTEA not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new C1163o("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new C0803ac("output buffer too short");
        }
        return this.f3836e ? m2302b(bArr, i, bArr2, i2) : m2303c(bArr, i, bArr2, i2);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final String mo2123a() {
        return "XTEA";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final void mo2124a(boolean z, InterfaceC1003i interfaceC1003i) {
        if (!(interfaceC1003i instanceof C1076ba)) {
            throw new IllegalArgumentException("invalid parameter passed to TEA init - " + interfaceC1003i.getClass().getName());
        }
        this.f3836e = z;
        this.f3835d = true;
        m2301a(((C1076ba) interfaceC1003i).m2603a());
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
