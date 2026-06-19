package org.bouncycastle.p083b.p089e;

import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1076ba;

/* JADX INFO: renamed from: org.bouncycastle.b.e.ad */
/* JADX INFO: loaded from: classes.dex */
public final class C0895ad implements InterfaceC0890e {

    /* JADX INFO: renamed from: a */
    private static final int[] f3681a = {0, 0, 0, 0};

    /* JADX INFO: renamed from: b */
    private static final int[] f3682b = {128, 27, 54, 108, 216, 171, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, 212};

    /* JADX INFO: renamed from: c */
    private int[] f3683c = new int[4];

    /* JADX INFO: renamed from: d */
    private int[] f3684d = new int[4];

    /* JADX INFO: renamed from: e */
    private int[] f3685e = new int[4];

    /* JADX INFO: renamed from: f */
    private boolean f3686f = false;

    /* JADX INFO: renamed from: g */
    private boolean f3687g;

    /* JADX INFO: renamed from: a */
    private static int m2152a(int i, int i2) {
        return (i << i2) | (i >>> (32 - i2));
    }

    /* JADX INFO: renamed from: a */
    private static int m2153a(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return ((bArr[i2] & 255) << 16) | (bArr[i] << 24) | ((bArr[i3] & 255) << 8) | (bArr[i3 + 1] & 255);
    }

    /* JADX INFO: renamed from: a */
    private static void m2154a(int i, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 16);
        bArr[i4] = (byte) (i >>> 8);
        bArr[i4 + 1] = (byte) i;
    }

    /* JADX INFO: renamed from: a */
    private static void m2155a(int[] iArr) {
        iArr[1] = iArr[1] ^ ((iArr[3] ^ (-1)) & (iArr[2] ^ (-1)));
        iArr[0] = iArr[0] ^ (iArr[2] & iArr[1]);
        int i = iArr[3];
        iArr[3] = iArr[0];
        iArr[0] = i;
        iArr[2] = iArr[2] ^ ((iArr[0] ^ iArr[1]) ^ iArr[3]);
        iArr[1] = iArr[1] ^ ((iArr[3] ^ (-1)) & (iArr[2] ^ (-1)));
        iArr[0] = iArr[0] ^ (iArr[2] & iArr[1]);
    }

    /* JADX INFO: renamed from: a */
    private static void m2156a(int[] iArr, int[] iArr2) {
        int i = iArr[0] ^ iArr[2];
        int iM2152a = i ^ (m2152a(i, 8) ^ m2152a(i, 24));
        iArr[1] = iArr[1] ^ iM2152a;
        iArr[3] = iM2152a ^ iArr[3];
        for (int i2 = 0; i2 < 4; i2++) {
            iArr[i2] = iArr[i2] ^ iArr2[i2];
        }
        int i3 = iArr[1] ^ iArr[3];
        int iM2152a2 = i3 ^ (m2152a(i3, 8) ^ m2152a(i3, 24));
        iArr[0] = iArr[0] ^ iM2152a2;
        iArr[2] = iM2152a2 ^ iArr[2];
    }

    /* JADX INFO: renamed from: b */
    private int m2157b(byte[] bArr, int i, byte[] bArr2, int i2) {
        this.f3683c[0] = m2153a(bArr, i);
        this.f3683c[1] = m2153a(bArr, i + 4);
        this.f3683c[2] = m2153a(bArr, i + 8);
        this.f3683c[3] = m2153a(bArr, i + 12);
        int i3 = 0;
        while (i3 < 16) {
            int[] iArr = this.f3683c;
            iArr[0] = iArr[0] ^ f3682b[i3];
            m2156a(this.f3683c, this.f3684d);
            m2158b(this.f3683c);
            m2155a(this.f3683c);
            m2160c(this.f3683c);
            i3++;
        }
        int[] iArr2 = this.f3683c;
        iArr2[0] = f3682b[i3] ^ iArr2[0];
        m2156a(this.f3683c, this.f3684d);
        m2154a(this.f3683c[0], bArr2, i2);
        m2154a(this.f3683c[1], bArr2, i2 + 4);
        m2154a(this.f3683c[2], bArr2, i2 + 8);
        m2154a(this.f3683c[3], bArr2, i2 + 12);
        return 16;
    }

    /* JADX INFO: renamed from: b */
    private static void m2158b(int[] iArr) {
        iArr[1] = m2152a(iArr[1], 1);
        iArr[2] = m2152a(iArr[2], 5);
        iArr[3] = m2152a(iArr[3], 2);
    }

    /* JADX INFO: renamed from: c */
    private int m2159c(byte[] bArr, int i, byte[] bArr2, int i2) {
        this.f3683c[0] = m2153a(bArr, i);
        this.f3683c[1] = m2153a(bArr, i + 4);
        this.f3683c[2] = m2153a(bArr, i + 8);
        this.f3683c[3] = m2153a(bArr, i + 12);
        System.arraycopy(this.f3684d, 0, this.f3685e, 0, this.f3684d.length);
        m2156a(this.f3685e, f3681a);
        int i3 = 16;
        while (i3 > 0) {
            m2156a(this.f3683c, this.f3685e);
            int[] iArr = this.f3683c;
            iArr[0] = iArr[0] ^ f3682b[i3];
            m2158b(this.f3683c);
            m2155a(this.f3683c);
            m2160c(this.f3683c);
            i3--;
        }
        m2156a(this.f3683c, this.f3685e);
        int[] iArr2 = this.f3683c;
        iArr2[0] = f3682b[i3] ^ iArr2[0];
        m2154a(this.f3683c[0], bArr2, i2);
        m2154a(this.f3683c[1], bArr2, i2 + 4);
        m2154a(this.f3683c[2], bArr2, i2 + 8);
        m2154a(this.f3683c[3], bArr2, i2 + 12);
        return 16;
    }

    /* JADX INFO: renamed from: c */
    private static void m2160c(int[] iArr) {
        iArr[1] = m2152a(iArr[1], 31);
        iArr[2] = m2152a(iArr[2], 27);
        iArr[3] = m2152a(iArr[3], 30);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final int mo2122a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (!this.f3686f) {
            throw new IllegalStateException("Noekeon not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new C1163o("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new C0803ac("output buffer too short");
        }
        return this.f3687g ? m2157b(bArr, i, bArr2, i2) : m2159c(bArr, i, bArr2, i2);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final String mo2123a() {
        return "Noekeon";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: b */
    public final int mo2125b() {
        return 16;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: c */
    public final void mo2126c() {
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final void mo2124a(boolean z, InterfaceC1003i interfaceC1003i) {
        if (!(interfaceC1003i instanceof C1076ba)) {
            throw new IllegalArgumentException("invalid parameter passed to Noekeon init - " + interfaceC1003i.getClass().getName());
        }
        this.f3687g = z;
        this.f3686f = true;
        byte[] bArrM2603a = ((C1076ba) interfaceC1003i).m2603a();
        this.f3684d[0] = m2153a(bArrM2603a, 0);
        this.f3684d[1] = m2153a(bArrM2603a, 4);
        this.f3684d[2] = m2153a(bArrM2603a, 8);
        this.f3684d[3] = m2153a(bArrM2603a, 12);
    }
}
