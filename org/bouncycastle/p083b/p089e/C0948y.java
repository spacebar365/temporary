package org.bouncycastle.p083b.p089e;

import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC0815ao;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1080be;

/* JADX INFO: renamed from: org.bouncycastle.b.e.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0948y implements InterfaceC0815ao {

    /* JADX INFO: renamed from: a */
    private byte[] f3970a;

    /* JADX INFO: renamed from: b */
    private byte[] f3971b;

    /* JADX INFO: renamed from: c */
    private byte[] f3972c;

    /* JADX INFO: renamed from: d */
    private int[] f3973d;

    /* JADX INFO: renamed from: e */
    private int[] f3974e;

    /* JADX INFO: renamed from: f */
    private int f3975f;

    /* JADX INFO: renamed from: g */
    private int f3976g = 2;

    /* JADX INFO: renamed from: h */
    private boolean f3977h = false;

    /* JADX INFO: renamed from: a */
    private static int[] m2391a(int[] iArr, int i) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = iArr[4];
        iArr[4] = i;
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    private int m2392b() {
        int i = this.f3974e[0];
        int i2 = (this.f3974e[0] >>> 9) | (this.f3974e[1] << 7);
        int i3 = (this.f3974e[0] >>> 14) | (this.f3974e[1] << 2);
        int i4 = (this.f3974e[0] >>> 15) | (this.f3974e[1] << 1);
        int i5 = (this.f3974e[1] >>> 5) | (this.f3974e[2] << 11);
        int i6 = (this.f3974e[1] >>> 12) | (this.f3974e[2] << 4);
        int i7 = (this.f3974e[2] >>> 1) | (this.f3974e[3] << 15);
        int i8 = (this.f3974e[2] >>> 5) | (this.f3974e[3] << 11);
        int i9 = (this.f3974e[2] >>> 13) | (this.f3974e[3] << 3);
        int i10 = (this.f3974e[3] >>> 4) | (this.f3974e[4] << 12);
        int i11 = (this.f3974e[3] >>> 12) | (this.f3974e[4] << 4);
        int i12 = (this.f3974e[3] >>> 14) | (this.f3974e[4] << 2);
        int i13 = (this.f3974e[3] >>> 15) | (this.f3974e[4] << 1);
        return ((((((((((((i ^ ((i3 ^ (((((((i12 ^ i11) ^ i10) ^ i9) ^ i8) ^ i7) ^ i6) ^ i5)) ^ i2)) ^ (i13 & i11)) ^ (i8 & i7)) ^ (i4 & i2)) ^ ((i11 & i10) & i9)) ^ ((i7 & i6) & i5)) ^ (((i13 & i9) & i6) & i2)) ^ (((i11 & i10) & i8) & i7)) ^ (((i13 & i11) & i5) & i4)) ^ ((((i13 & i11) & i10) & i9) & i8)) ^ (i2 & (((i7 & i6) & i5) & i4))) ^ (((((i10 & i9) & i8) & i7) & i6) & i5)) & 65535;
    }

    /* JADX INFO: renamed from: d */
    private int m2393d() {
        int i = this.f3973d[0];
        int i2 = (this.f3973d[0] >>> 13) | (this.f3973d[1] << 3);
        int i3 = (this.f3973d[1] >>> 7) | (this.f3973d[2] << 9);
        int i4 = (this.f3973d[2] >>> 6) | (this.f3973d[3] << 10);
        return (((((i ^ i2) ^ i3) ^ i4) ^ ((this.f3973d[3] >>> 3) | (this.f3973d[4] << 13))) ^ ((this.f3973d[3] >>> 14) | (this.f3973d[4] << 2))) & 65535;
    }

    /* JADX INFO: renamed from: e */
    private int m2394e() {
        int i = (this.f3974e[0] >>> 1) | (this.f3974e[1] << 15);
        int i2 = (this.f3974e[0] >>> 2) | (this.f3974e[1] << 14);
        int i3 = (this.f3974e[0] >>> 4) | (this.f3974e[1] << 12);
        int i4 = (this.f3974e[0] >>> 10) | (this.f3974e[1] << 6);
        int i5 = (this.f3974e[1] >>> 15) | (this.f3974e[2] << 1);
        int i6 = (this.f3974e[2] >>> 11) | (this.f3974e[3] << 5);
        int i7 = (this.f3974e[3] >>> 8) | (this.f3974e[4] << 8);
        int i8 = (this.f3974e[3] >>> 15) | (this.f3974e[4] << 1);
        int i9 = (this.f3973d[0] >>> 3) | (this.f3973d[1] << 13);
        int i10 = (this.f3973d[1] >>> 9) | (this.f3973d[2] << 7);
        int i11 = (this.f3973d[2] >>> 14) | (this.f3973d[3] << 2);
        int i12 = this.f3973d[4];
        return (((((((i ^ ((i8 & (i11 & i12)) ^ ((((i9 & i11) & i8) ^ ((((((i10 ^ i8) ^ (i9 & i12)) ^ (i11 & i12)) ^ (i12 & i8)) ^ ((i9 & i10) & i11)) ^ ((i9 & i11) & i12))) ^ ((i10 & i11) & i8)))) ^ i2) ^ i3) ^ i4) ^ i5) ^ i6) ^ i7) & 65535;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final String mo1911a() {
        return "Grain v1";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final void mo1912a(boolean z, InterfaceC1003i interfaceC1003i) {
        if (!(interfaceC1003i instanceof C1080be)) {
            throw new IllegalArgumentException("Grain v1 Init parameters must include an IV");
        }
        C1080be c1080be = (C1080be) interfaceC1003i;
        byte[] bArrM2611a = c1080be.m2611a();
        if (bArrM2611a == null || bArrM2611a.length != 8) {
            throw new IllegalArgumentException("Grain v1 requires exactly 8 bytes of IV");
        }
        if (!(c1080be.m2612b() instanceof C1076ba)) {
            throw new IllegalArgumentException("Grain v1 Init parameters must include a key");
        }
        C1076ba c1076ba = (C1076ba) c1080be.m2612b();
        this.f3971b = new byte[c1076ba.m2603a().length];
        this.f3970a = new byte[c1076ba.m2603a().length];
        this.f3973d = new int[5];
        this.f3974e = new int[5];
        this.f3972c = new byte[2];
        System.arraycopy(bArrM2611a, 0, this.f3971b, 0, bArrM2611a.length);
        System.arraycopy(c1076ba.m2603a(), 0, this.f3970a, 0, c1076ba.m2603a().length);
        mo1913c();
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final int mo1909a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (!this.f3977h) {
            throw new IllegalStateException("Grain v1 not initialised");
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
            if (this.f3976g > 1) {
                this.f3975f = m2394e();
                this.f3972c[0] = (byte) this.f3975f;
                this.f3972c[1] = (byte) (this.f3975f >> 8);
                this.f3974e = m2391a(this.f3974e, m2392b() ^ this.f3973d[0]);
                this.f3973d = m2391a(this.f3973d, m2393d());
                this.f3976g = 0;
            }
            byte[] bArr3 = this.f3972c;
            int i6 = this.f3976g;
            this.f3976g = i6 + 1;
            bArr2[i5] = (byte) (b ^ bArr3[i6]);
        }
        return i2;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: c */
    public final void mo1913c() {
        this.f3976g = 2;
        byte[] bArr = this.f3970a;
        byte[] bArr2 = this.f3971b;
        bArr2[8] = -1;
        bArr2[9] = -1;
        this.f3970a = bArr;
        this.f3971b = bArr2;
        int i = 0;
        for (int i2 = 0; i2 < this.f3974e.length; i2++) {
            this.f3974e[i2] = ((this.f3970a[i + 1] << 8) | (this.f3970a[i] & 255)) & 65535;
            this.f3973d[i2] = ((this.f3971b[i + 1] << 8) | (this.f3971b[i] & 255)) & 65535;
            i += 2;
        }
        for (int i3 = 0; i3 < 10; i3++) {
            this.f3975f = m2394e();
            this.f3974e = m2391a(this.f3974e, (m2392b() ^ this.f3973d[0]) ^ this.f3975f);
            this.f3973d = m2391a(this.f3973d, m2393d() ^ this.f3975f);
        }
        this.f3977h = true;
    }
}
