package org.bouncycastle.p083b.p089e;

import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC0815ao;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1080be;

/* JADX INFO: renamed from: org.bouncycastle.b.e.aa */
/* JADX INFO: loaded from: classes.dex */
public final class C0892aa implements InterfaceC0815ao {

    /* JADX INFO: renamed from: d */
    private byte[] f3662d;

    /* JADX INFO: renamed from: e */
    private byte[] f3663e;

    /* JADX INFO: renamed from: f */
    private boolean f3664f;

    /* JADX INFO: renamed from: a */
    private int[] f3659a = new int[1024];

    /* JADX INFO: renamed from: b */
    private int[] f3660b = new int[1024];

    /* JADX INFO: renamed from: c */
    private int f3661c = 0;

    /* JADX INFO: renamed from: g */
    private byte[] f3665g = new byte[4];

    /* JADX INFO: renamed from: h */
    private int f3666h = 0;

    /* JADX INFO: renamed from: a */
    private static int m2133a(int i, int i2) {
        return (i >>> i2) | (i << (-i2));
    }

    /* JADX INFO: renamed from: b */
    private int m2134b() {
        int i;
        int i2 = this.f3661c & 1023;
        if (this.f3661c < 1024) {
            int i3 = this.f3659a[(i2 - 3) & 1023];
            int i4 = this.f3659a[(i2 - 1023) & 1023];
            int[] iArr = this.f3659a;
            iArr[i2] = this.f3660b[(i3 ^ i4) & 1023] + this.f3659a[(i2 - 10) & 1023] + (m2133a(i3, 10) ^ m2133a(i4, 23)) + iArr[i2];
            int i5 = this.f3659a[(i2 - 12) & 1023];
            i = this.f3659a[i2] ^ (this.f3660b[((i5 >> 24) & 255) + 768] + ((this.f3660b[i5 & 255] + this.f3660b[((i5 >> 8) & 255) + 256]) + this.f3660b[((i5 >> 16) & 255) + 512]));
        } else {
            int i6 = this.f3660b[(i2 - 3) & 1023];
            int i7 = this.f3660b[(i2 - 1023) & 1023];
            int[] iArr2 = this.f3660b;
            iArr2[i2] = this.f3659a[(i6 ^ i7) & 1023] + this.f3660b[(i2 - 10) & 1023] + (m2133a(i6, 10) ^ m2133a(i7, 23)) + iArr2[i2];
            int i8 = this.f3660b[(i2 - 12) & 1023];
            i = this.f3660b[i2] ^ (this.f3659a[((i8 >> 24) & 255) + 768] + ((this.f3659a[i8 & 255] + this.f3659a[((i8 >> 8) & 255) + 256]) + this.f3659a[((i8 >> 16) & 255) + 512]));
        }
        this.f3661c = (this.f3661c + 1) & 2047;
        return i;
    }

    /* JADX INFO: renamed from: d */
    private void m2135d() {
        if (this.f3662d.length != 32 && this.f3662d.length != 16) {
            throw new IllegalArgumentException("The key must be 128/256 bits long");
        }
        if (this.f3663e.length < 16) {
            throw new IllegalArgumentException("The IV must be at least 128 bits long");
        }
        if (this.f3662d.length != 32) {
            byte[] bArr = new byte[32];
            System.arraycopy(this.f3662d, 0, bArr, 0, this.f3662d.length);
            System.arraycopy(this.f3662d, 0, bArr, 16, this.f3662d.length);
            this.f3662d = bArr;
        }
        if (this.f3663e.length < 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(this.f3663e, 0, bArr2, 0, this.f3663e.length);
            System.arraycopy(this.f3663e, 0, bArr2, this.f3663e.length, 32 - this.f3663e.length);
            this.f3663e = bArr2;
        }
        this.f3666h = 0;
        this.f3661c = 0;
        int[] iArr = new int[2560];
        for (int i = 0; i < 32; i++) {
            int i2 = i >> 2;
            iArr[i2] = iArr[i2] | ((this.f3662d[i] & 255) << ((i & 3) * 8));
        }
        for (int i3 = 0; i3 < 32; i3++) {
            int i4 = (i3 >> 2) + 8;
            iArr[i4] = iArr[i4] | ((this.f3663e[i3] & 255) << ((i3 & 3) * 8));
        }
        for (int i5 = 16; i5 < 2560; i5++) {
            int i6 = iArr[i5 - 2];
            int i7 = iArr[i5 - 15];
            iArr[i5] = ((i6 >>> 10) ^ (m2133a(i6, 17) ^ m2133a(i6, 19))) + iArr[i5 - 7] + ((i7 >>> 3) ^ (m2133a(i7, 7) ^ m2133a(i7, 18))) + iArr[i5 - 16] + i5;
        }
        System.arraycopy(iArr, 512, this.f3659a, 0, 1024);
        System.arraycopy(iArr, 1536, this.f3660b, 0, 1024);
        for (int i8 = 0; i8 < 4096; i8++) {
            m2134b();
        }
        this.f3661c = 0;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final String mo1911a() {
        return "HC-256";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final void mo1912a(boolean z, InterfaceC1003i interfaceC1003i) {
        InterfaceC1003i interfaceC1003iM2612b;
        if (interfaceC1003i instanceof C1080be) {
            this.f3663e = ((C1080be) interfaceC1003i).m2611a();
            interfaceC1003iM2612b = ((C1080be) interfaceC1003i).m2612b();
        } else {
            this.f3663e = new byte[0];
            interfaceC1003iM2612b = interfaceC1003i;
        }
        if (!(interfaceC1003iM2612b instanceof C1076ba)) {
            throw new IllegalArgumentException("Invalid parameter passed to HC256 init - " + interfaceC1003i.getClass().getName());
        }
        this.f3662d = ((C1076ba) interfaceC1003iM2612b).m2603a();
        m2135d();
        this.f3664f = true;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: c */
    public final void mo1913c() {
        m2135d();
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final int mo1909a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (!this.f3664f) {
            throw new IllegalStateException("HC-256 not initialised");
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
            if (this.f3666h == 0) {
                int iM2134b = m2134b();
                this.f3665g[0] = (byte) (iM2134b & 255);
                int i6 = iM2134b >> 8;
                this.f3665g[1] = (byte) (i6 & 255);
                int i7 = i6 >> 8;
                this.f3665g[2] = (byte) (i7 & 255);
                this.f3665g[3] = (byte) ((i7 >> 8) & 255);
            }
            byte b2 = this.f3665g[this.f3666h];
            this.f3666h = (this.f3666h + 1) & 3;
            bArr2[i5] = (byte) (b ^ b2);
        }
        return i2;
    }
}
