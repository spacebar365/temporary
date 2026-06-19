package org.bouncycastle.p083b.p093i;

import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;

/* JADX INFO: renamed from: org.bouncycastle.b.i.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1035t implements InterfaceC0890e {

    /* JADX INFO: renamed from: a */
    private byte[] f4346a;

    /* JADX INFO: renamed from: b */
    private byte[] f4347b;

    /* JADX INFO: renamed from: c */
    private byte[] f4348c;

    /* JADX INFO: renamed from: d */
    private InterfaceC0890e f4349d;

    /* JADX INFO: renamed from: e */
    private int f4350e;

    /* JADX INFO: renamed from: f */
    private int f4351f;

    /* JADX INFO: renamed from: g */
    private boolean f4352g;

    public C1035t(InterfaceC0890e interfaceC0890e) {
        this.f4349d = interfaceC0890e;
        this.f4351f = interfaceC0890e.mo2125b();
        this.f4346a = new byte[this.f4351f];
        this.f4347b = new byte[this.f4351f];
        this.f4348c = new byte[this.f4351f];
    }

    /* JADX INFO: renamed from: a */
    private byte m2553a(byte b, int i) {
        return (byte) (this.f4348c[i] ^ b);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final String mo2123a() {
        return this.f4349d.mo2123a() + "/OpenPGPCFB";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final void mo2124a(boolean z, InterfaceC1003i interfaceC1003i) {
        this.f4352g = z;
        mo2126c();
        this.f4349d.mo2124a(true, interfaceC1003i);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: b */
    public final int mo2125b() {
        return this.f4349d.mo2125b();
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: c */
    public final void mo2126c() {
        this.f4350e = 0;
        System.arraycopy(this.f4346a, 0, this.f4347b, 0, this.f4347b.length);
        this.f4349d.mo2126c();
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final int mo2122a(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = 2;
        if (!this.f4352g) {
            if (this.f4351f + i > bArr.length) {
                throw new C1163o("input buffer too short");
            }
            if (this.f4351f + i2 > bArr2.length) {
                throw new C0803ac("output buffer too short");
            }
            if (this.f4350e > this.f4351f) {
                byte b = bArr[i];
                this.f4347b[this.f4351f - 2] = b;
                bArr2[i2] = m2553a(b, this.f4351f - 2);
                byte b2 = bArr[i + 1];
                this.f4347b[this.f4351f - 1] = b2;
                bArr2[i2 + 1] = m2553a(b2, this.f4351f - 1);
                this.f4349d.mo2122a(this.f4347b, 0, this.f4348c, 0);
                while (i3 < this.f4351f) {
                    byte b3 = bArr[i + i3];
                    this.f4347b[i3 - 2] = b3;
                    bArr2[i2 + i3] = m2553a(b3, i3 - 2);
                    i3++;
                }
            } else if (this.f4350e == 0) {
                this.f4349d.mo2122a(this.f4347b, 0, this.f4348c, 0);
                for (int i4 = 0; i4 < this.f4351f; i4++) {
                    this.f4347b[i4] = bArr[i + i4];
                    bArr2[i4] = m2553a(bArr[i + i4], i4);
                }
                this.f4350e += this.f4351f;
            } else if (this.f4350e == this.f4351f) {
                this.f4349d.mo2122a(this.f4347b, 0, this.f4348c, 0);
                byte b4 = bArr[i];
                byte b5 = bArr[i + 1];
                bArr2[i2] = m2553a(b4, 0);
                bArr2[i2 + 1] = m2553a(b5, 1);
                System.arraycopy(this.f4347b, 2, this.f4347b, 0, this.f4351f - 2);
                this.f4347b[this.f4351f - 2] = b4;
                this.f4347b[this.f4351f - 1] = b5;
                this.f4349d.mo2122a(this.f4347b, 0, this.f4348c, 0);
                while (i3 < this.f4351f) {
                    byte b6 = bArr[i + i3];
                    this.f4347b[i3 - 2] = b6;
                    bArr2[i2 + i3] = m2553a(b6, i3 - 2);
                    i3++;
                }
                this.f4350e += this.f4351f;
            }
            return this.f4351f;
        }
        if (this.f4351f + i > bArr.length) {
            throw new C1163o("input buffer too short");
        }
        if (this.f4351f + i2 > bArr2.length) {
            throw new C0803ac("output buffer too short");
        }
        if (this.f4350e > this.f4351f) {
            byte[] bArr3 = this.f4347b;
            int i5 = this.f4351f - 2;
            byte bM2553a = m2553a(bArr[i], this.f4351f - 2);
            bArr2[i2] = bM2553a;
            bArr3[i5] = bM2553a;
            byte[] bArr4 = this.f4347b;
            int i6 = this.f4351f - 1;
            byte bM2553a2 = m2553a(bArr[i + 1], this.f4351f - 1);
            bArr2[i2 + 1] = bM2553a2;
            bArr4[i6] = bM2553a2;
            this.f4349d.mo2122a(this.f4347b, 0, this.f4348c, 0);
            while (i3 < this.f4351f) {
                byte bM2553a3 = m2553a(bArr[i + i3], i3 - 2);
                bArr2[i2 + i3] = bM2553a3;
                this.f4347b[i3 - 2] = bM2553a3;
                i3++;
            }
        } else if (this.f4350e == 0) {
            this.f4349d.mo2122a(this.f4347b, 0, this.f4348c, 0);
            for (int i7 = 0; i7 < this.f4351f; i7++) {
                byte[] bArr5 = this.f4347b;
                byte bM2553a4 = m2553a(bArr[i + i7], i7);
                bArr2[i2 + i7] = bM2553a4;
                bArr5[i7] = bM2553a4;
            }
            this.f4350e += this.f4351f;
        } else if (this.f4350e == this.f4351f) {
            this.f4349d.mo2122a(this.f4347b, 0, this.f4348c, 0);
            bArr2[i2] = m2553a(bArr[i], 0);
            bArr2[i2 + 1] = m2553a(bArr[i + 1], 1);
            System.arraycopy(this.f4347b, 2, this.f4347b, 0, this.f4351f - 2);
            System.arraycopy(bArr2, i2, this.f4347b, this.f4351f - 2, 2);
            this.f4349d.mo2122a(this.f4347b, 0, this.f4348c, 0);
            while (i3 < this.f4351f) {
                byte bM2553a5 = m2553a(bArr[i + i3], i3 - 2);
                bArr2[i2 + i3] = bM2553a5;
                this.f4347b[i3 - 2] = bM2553a5;
                i3++;
            }
            this.f4350e += this.f4351f;
        }
        return this.f4351f;
    }
}
