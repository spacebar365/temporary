package org.bouncycastle.p083b.p089e;

import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1076ba;

/* JADX INFO: renamed from: org.bouncycastle.b.e.az */
/* JADX INFO: loaded from: classes.dex */
public final class C0917az implements InterfaceC0890e {

    /* JADX INFO: renamed from: a */
    private int f3798a;

    /* JADX INFO: renamed from: b */
    private int f3799b;

    /* JADX INFO: renamed from: c */
    private int f3800c;

    /* JADX INFO: renamed from: d */
    private int f3801d;

    /* JADX INFO: renamed from: e */
    private boolean f3802e = false;

    /* JADX INFO: renamed from: f */
    private boolean f3803f;

    /* JADX INFO: renamed from: a */
    private static int m2264a(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return ((bArr[i2] & 255) << 16) | (bArr[i] << 24) | ((bArr[i3] & 255) << 8) | (bArr[i3 + 1] & 255);
    }

    /* JADX INFO: renamed from: a */
    private static void m2265a(int i, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 16);
        bArr[i4] = (byte) (i >>> 8);
        bArr[i4 + 1] = (byte) i;
    }

    /* JADX INFO: renamed from: b */
    private int m2266b(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iM2264a = m2264a(bArr, i);
        int iM2264a2 = m2264a(bArr, i + 4);
        int i3 = 0;
        int i4 = 0;
        while (i3 != 32) {
            i4 -= 1640531527;
            int i5 = ((((iM2264a2 << 4) + this.f3798a) ^ (iM2264a2 + i4)) ^ ((iM2264a2 >>> 5) + this.f3799b)) + iM2264a;
            iM2264a2 += (((i5 << 4) + this.f3800c) ^ (i5 + i4)) ^ ((i5 >>> 5) + this.f3801d);
            i3++;
            iM2264a = i5;
        }
        m2265a(iM2264a, bArr2, i2);
        m2265a(iM2264a2, bArr2, i2 + 4);
        return 8;
    }

    /* JADX INFO: renamed from: c */
    private int m2267c(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iM2264a = m2264a(bArr, i);
        int iM2264a2 = m2264a(bArr, i + 4);
        int i3 = -957401312;
        for (int i4 = 0; i4 != 32; i4++) {
            iM2264a2 -= (((iM2264a << 4) + this.f3800c) ^ (iM2264a + i3)) ^ ((iM2264a >>> 5) + this.f3801d);
            iM2264a -= (((iM2264a2 << 4) + this.f3798a) ^ (iM2264a2 + i3)) ^ ((iM2264a2 >>> 5) + this.f3799b);
            i3 += 1640531527;
        }
        m2265a(iM2264a, bArr2, i2);
        m2265a(iM2264a2, bArr2, i2 + 4);
        return 8;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final int mo2122a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (!this.f3802e) {
            throw new IllegalStateException("TEA not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new C1163o("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new C0803ac("output buffer too short");
        }
        return this.f3803f ? m2266b(bArr, i, bArr2, i2) : m2267c(bArr, i, bArr2, i2);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final String mo2123a() {
        return "TEA";
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
        if (!(interfaceC1003i instanceof C1076ba)) {
            throw new IllegalArgumentException("invalid parameter passed to TEA init - " + interfaceC1003i.getClass().getName());
        }
        this.f3803f = z;
        this.f3802e = true;
        byte[] bArrM2603a = ((C1076ba) interfaceC1003i).m2603a();
        if (bArrM2603a.length != 16) {
            throw new IllegalArgumentException("Key size must be 128 bits.");
        }
        this.f3798a = m2264a(bArrM2603a, 0);
        this.f3799b = m2264a(bArrM2603a, 4);
        this.f3800c = m2264a(bArrM2603a, 8);
        this.f3801d = m2264a(bArrM2603a, 12);
    }
}
