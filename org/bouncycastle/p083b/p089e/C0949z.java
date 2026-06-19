package org.bouncycastle.p083b.p089e;

import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC0815ao;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1080be;

/* JADX INFO: renamed from: org.bouncycastle.b.e.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0949z implements InterfaceC0815ao {

    /* JADX INFO: renamed from: d */
    private byte[] f3981d;

    /* JADX INFO: renamed from: e */
    private byte[] f3982e;

    /* JADX INFO: renamed from: f */
    private boolean f3983f;

    /* JADX INFO: renamed from: a */
    private int[] f3978a = new int[512];

    /* JADX INFO: renamed from: b */
    private int[] f3979b = new int[512];

    /* JADX INFO: renamed from: c */
    private int f3980c = 0;

    /* JADX INFO: renamed from: g */
    private byte[] f3984g = new byte[4];

    /* JADX INFO: renamed from: h */
    private int f3985h = 0;

    /* JADX INFO: renamed from: a */
    private static int m2395a(int i, int i2) {
        return (i << i2) | (i >>> (-i2));
    }

    /* JADX INFO: renamed from: b */
    private static int m2397b(int i, int i2) {
        return (i >>> i2) | (i << (-i2));
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final String mo1911a() {
        return "HC-128";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final void mo1912a(boolean z, InterfaceC1003i interfaceC1003i) {
        InterfaceC1003i interfaceC1003iM2612b;
        if (interfaceC1003i instanceof C1080be) {
            this.f3982e = ((C1080be) interfaceC1003i).m2611a();
            interfaceC1003iM2612b = ((C1080be) interfaceC1003i).m2612b();
        } else {
            this.f3982e = new byte[0];
            interfaceC1003iM2612b = interfaceC1003i;
        }
        if (!(interfaceC1003iM2612b instanceof C1076ba)) {
            throw new IllegalArgumentException("Invalid parameter passed to HC128 init - " + interfaceC1003i.getClass().getName());
        }
        this.f3981d = ((C1076ba) interfaceC1003iM2612b).m2603a();
        m2398d();
        this.f3983f = true;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: c */
    public final void mo1913c() {
        m2398d();
    }

    /* JADX INFO: renamed from: b */
    private int m2396b() {
        int i;
        int i2 = this.f3980c & 511;
        if (this.f3980c < 512) {
            int[] iArr = this.f3978a;
            iArr[i2] = iArr[i2] + (m2397b(this.f3978a[(i2 - 3) & 511], 10) ^ m2397b(this.f3978a[(i2 - 511) & 511], 23)) + m2397b(this.f3978a[(i2 - 10) & 511], 8);
            int i3 = this.f3978a[(i2 - 12) & 511];
            i = this.f3978a[i2] ^ (this.f3979b[((i3 >> 16) & 255) + 256] + this.f3979b[i3 & 255]);
        } else {
            int[] iArr2 = this.f3979b;
            iArr2[i2] = iArr2[i2] + (m2395a(this.f3979b[(i2 - 3) & 511], 10) ^ m2395a(this.f3979b[(i2 - 511) & 511], 23)) + m2395a(this.f3979b[(i2 - 10) & 511], 8);
            int i4 = this.f3979b[(i2 - 12) & 511];
            i = this.f3979b[i2] ^ (this.f3978a[((i4 >> 16) & 255) + 256] + this.f3978a[i4 & 255]);
        }
        this.f3980c = (this.f3980c + 1) & 1023;
        return i;
    }

    /* JADX INFO: renamed from: d */
    private void m2398d() {
        if (this.f3981d.length != 16) {
            throw new IllegalArgumentException("The key must be 128 bits long");
        }
        this.f3985h = 0;
        this.f3980c = 0;
        int[] iArr = new int[1280];
        for (int i = 0; i < 16; i++) {
            int i2 = i >> 2;
            iArr[i2] = iArr[i2] | ((this.f3981d[i] & 255) << ((i & 3) * 8));
        }
        System.arraycopy(iArr, 0, iArr, 4, 4);
        for (int i3 = 0; i3 < this.f3982e.length && i3 < 16; i3++) {
            int i4 = (i3 >> 2) + 8;
            iArr[i4] = iArr[i4] | ((this.f3982e[i3] & 255) << ((i3 & 3) * 8));
        }
        System.arraycopy(iArr, 8, iArr, 12, 4);
        for (int i5 = 16; i5 < 1280; i5++) {
            int i6 = iArr[i5 - 2];
            int iM2397b = ((i6 >>> 10) ^ (m2397b(i6, 17) ^ m2397b(i6, 19))) + iArr[i5 - 7];
            int i7 = iArr[i5 - 15];
            iArr[i5] = iM2397b + ((i7 >>> 3) ^ (m2397b(i7, 7) ^ m2397b(i7, 18))) + iArr[i5 - 16] + i5;
        }
        System.arraycopy(iArr, 256, this.f3978a, 0, 512);
        System.arraycopy(iArr, 768, this.f3979b, 0, 512);
        for (int i8 = 0; i8 < 512; i8++) {
            this.f3978a[i8] = m2396b();
        }
        for (int i9 = 0; i9 < 512; i9++) {
            this.f3979b[i9] = m2396b();
        }
        this.f3980c = 0;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final int mo1909a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (!this.f3983f) {
            throw new IllegalStateException("HC-128 not initialised");
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
            if (this.f3985h == 0) {
                int iM2396b = m2396b();
                this.f3984g[0] = (byte) (iM2396b & 255);
                int i6 = iM2396b >> 8;
                this.f3984g[1] = (byte) (i6 & 255);
                int i7 = i6 >> 8;
                this.f3984g[2] = (byte) (i7 & 255);
                this.f3984g[3] = (byte) ((i7 >> 8) & 255);
            }
            byte b2 = this.f3984g[this.f3985h];
            this.f3985h = (this.f3985h + 1) & 3;
            bArr2[i5] = (byte) (b ^ b2);
        }
        return i2;
    }
}
