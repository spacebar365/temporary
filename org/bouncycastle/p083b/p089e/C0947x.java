package org.bouncycastle.p083b.p089e;

import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC0815ao;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1080be;

/* JADX INFO: renamed from: org.bouncycastle.b.e.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0947x implements InterfaceC0815ao {

    /* JADX INFO: renamed from: a */
    private byte[] f3962a;

    /* JADX INFO: renamed from: b */
    private byte[] f3963b;

    /* JADX INFO: renamed from: c */
    private byte[] f3964c;

    /* JADX INFO: renamed from: d */
    private int[] f3965d;

    /* JADX INFO: renamed from: e */
    private int[] f3966e;

    /* JADX INFO: renamed from: f */
    private int f3967f;

    /* JADX INFO: renamed from: g */
    private int f3968g = 4;

    /* JADX INFO: renamed from: h */
    private boolean f3969h = false;

    /* JADX INFO: renamed from: a */
    private static int[] m2387a(int[] iArr, int i) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = i;
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    private int m2388b() {
        int i = this.f3966e[0];
        int i2 = (this.f3966e[0] >>> 3) | (this.f3966e[1] << 29);
        int i3 = (this.f3966e[0] >>> 11) | (this.f3966e[1] << 21);
        int i4 = (this.f3966e[0] >>> 13) | (this.f3966e[1] << 19);
        int i5 = (this.f3966e[0] >>> 17) | (this.f3966e[1] << 15);
        int i6 = (this.f3966e[0] >>> 18) | (this.f3966e[1] << 14);
        int i7 = (this.f3966e[0] >>> 26) | (this.f3966e[1] << 6);
        int i8 = (this.f3966e[0] >>> 27) | (this.f3966e[1] << 5);
        int i9 = (this.f3966e[1] >>> 8) | (this.f3966e[2] << 24);
        int i10 = (this.f3966e[1] >>> 16) | (this.f3966e[2] << 16);
        int i11 = (this.f3966e[1] >>> 24) | (this.f3966e[2] << 8);
        int i12 = (this.f3966e[1] >>> 27) | (this.f3966e[2] << 5);
        int i13 = (this.f3966e[1] >>> 29) | (this.f3966e[2] << 3);
        int i14 = (this.f3966e[2] >>> 1) | (this.f3966e[3] << 31);
        int i15 = (this.f3966e[2] >>> 3) | (this.f3966e[3] << 29);
        int i16 = (this.f3966e[2] >>> 4) | (this.f3966e[3] << 28);
        int i17 = (this.f3966e[2] >>> 20) | (this.f3966e[3] << 12);
        return ((((((((((i ^ i7) ^ i11) ^ ((this.f3966e[2] >>> 27) | (this.f3966e[3] << 5))) ^ this.f3966e[3]) ^ (i2 & i15)) ^ (i3 & i4)) ^ (i5 & i6)) ^ (i8 & i12)) ^ (i9 & i10)) ^ (i13 & i14)) ^ (i16 & i17);
    }

    /* JADX INFO: renamed from: d */
    private int m2389d() {
        int i = this.f3965d[0];
        int i2 = (this.f3965d[0] >>> 7) | (this.f3965d[1] << 25);
        int i3 = (this.f3965d[1] >>> 6) | (this.f3965d[2] << 26);
        int i4 = (this.f3965d[2] >>> 6) | (this.f3965d[3] << 26);
        return ((((i ^ i2) ^ i3) ^ i4) ^ ((this.f3965d[2] >>> 17) | (this.f3965d[3] << 15))) ^ this.f3965d[3];
    }

    /* JADX INFO: renamed from: e */
    private int m2390e() {
        int i = (this.f3966e[0] >>> 2) | (this.f3966e[1] << 30);
        int i2 = (this.f3966e[0] >>> 12) | (this.f3966e[1] << 20);
        int i3 = (this.f3966e[0] >>> 15) | (this.f3966e[1] << 17);
        int i4 = (this.f3966e[1] >>> 4) | (this.f3966e[2] << 28);
        int i5 = (this.f3966e[1] >>> 13) | (this.f3966e[2] << 19);
        int i6 = this.f3966e[2];
        int i7 = (this.f3966e[2] >>> 9) | (this.f3966e[3] << 23);
        int i8 = (this.f3966e[2] >>> 25) | (this.f3966e[3] << 7);
        int i9 = (this.f3966e[2] >>> 31) | (this.f3966e[3] << 1);
        int i10 = (this.f3965d[0] >>> 8) | (this.f3965d[1] << 24);
        int i11 = (this.f3965d[0] >>> 13) | (this.f3965d[1] << 19);
        int i12 = (this.f3965d[0] >>> 20) | (this.f3965d[1] << 12);
        int i13 = (this.f3965d[1] >>> 10) | (this.f3965d[2] << 22);
        int i14 = (this.f3965d[1] >>> 28) | (this.f3965d[2] << 4);
        int i15 = (this.f3965d[2] >>> 15) | (this.f3965d[3] << 17);
        return ((((((i ^ ((((i2 & i9) & ((this.f3965d[2] >>> 31) | (this.f3965d[3] << 1))) ^ ((((i10 & i2) ^ (i11 & i12)) ^ (i9 & i13)) ^ (i14 & i15))) ^ ((this.f3965d[2] >>> 29) | (this.f3965d[3] << 3)))) ^ i3) ^ i4) ^ i5) ^ i6) ^ i7) ^ i8;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final String mo1911a() {
        return "Grain-128";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final void mo1912a(boolean z, InterfaceC1003i interfaceC1003i) {
        if (!(interfaceC1003i instanceof C1080be)) {
            throw new IllegalArgumentException("Grain-128 Init parameters must include an IV");
        }
        C1080be c1080be = (C1080be) interfaceC1003i;
        byte[] bArrM2611a = c1080be.m2611a();
        if (bArrM2611a == null || bArrM2611a.length != 12) {
            throw new IllegalArgumentException("Grain-128  requires exactly 12 bytes of IV");
        }
        if (!(c1080be.m2612b() instanceof C1076ba)) {
            throw new IllegalArgumentException("Grain-128 Init parameters must include a key");
        }
        C1076ba c1076ba = (C1076ba) c1080be.m2612b();
        this.f3963b = new byte[c1076ba.m2603a().length];
        this.f3962a = new byte[c1076ba.m2603a().length];
        this.f3965d = new int[4];
        this.f3966e = new int[4];
        this.f3964c = new byte[4];
        System.arraycopy(bArrM2611a, 0, this.f3963b, 0, bArrM2611a.length);
        System.arraycopy(c1076ba.m2603a(), 0, this.f3962a, 0, c1076ba.m2603a().length);
        mo1913c();
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final int mo1909a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (!this.f3969h) {
            throw new IllegalStateException("Grain-128 not initialised");
        }
        if (i + i2 > bArr.length) {
            throw new C1163o("input buffer too short");
        }
        if (i3 + i2 > bArr2.length) {
            throw new C0803ac("output buffer too short");
        }
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 + i4;
            byte b = bArr[i + i4];
            if (this.f3968g > 3) {
                this.f3967f = m2390e();
                this.f3964c[0] = (byte) this.f3967f;
                this.f3964c[1] = (byte) (this.f3967f >> 8);
                this.f3964c[2] = (byte) (this.f3967f >> 16);
                this.f3964c[3] = (byte) (this.f3967f >> 24);
                this.f3966e = m2387a(this.f3966e, m2388b() ^ this.f3965d[0]);
                this.f3965d = m2387a(this.f3965d, m2389d());
                this.f3968g = 0;
            }
            byte[] bArr3 = this.f3964c;
            int i6 = this.f3968g;
            this.f3968g = i6 + 1;
            bArr2[i5] = (byte) (b ^ bArr3[i6]);
        }
        return i2;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: c */
    public final void mo1913c() {
        this.f3968g = 4;
        byte[] bArr = this.f3962a;
        byte[] bArr2 = this.f3963b;
        bArr2[12] = -1;
        bArr2[13] = -1;
        bArr2[14] = -1;
        bArr2[15] = -1;
        this.f3962a = bArr;
        this.f3963b = bArr2;
        int i = 0;
        for (int i2 = 0; i2 < this.f3966e.length; i2++) {
            this.f3966e[i2] = (this.f3962a[i + 3] << 24) | ((this.f3962a[i + 2] << 16) & 16711680) | ((this.f3962a[i + 1] << 8) & 65280) | (this.f3962a[i] & 255);
            this.f3965d[i2] = (this.f3963b[i + 3] << 24) | ((this.f3963b[i + 2] << 16) & 16711680) | ((this.f3963b[i + 1] << 8) & 65280) | (this.f3963b[i] & 255);
            i += 4;
        }
        for (int i3 = 0; i3 < 8; i3++) {
            this.f3967f = m2390e();
            this.f3966e = m2387a(this.f3966e, (m2388b() ^ this.f3965d[0]) ^ this.f3967f);
            this.f3965d = m2387a(this.f3965d, m2389d() ^ this.f3967f);
        }
        this.f3969h = true;
    }
}
