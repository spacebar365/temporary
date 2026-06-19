package org.bouncycastle.p083b.p088d;

import java.security.AccessController;
import java.security.SecureRandom;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.C1179v;
import org.bouncycastle.p083b.InterfaceC0786a;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.d.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0887c implements InterfaceC0786a {

    /* JADX INFO: renamed from: a */
    private SecureRandom f3636a;

    /* JADX INFO: renamed from: b */
    private InterfaceC0786a f3637b;

    /* JADX INFO: renamed from: c */
    private boolean f3638c;

    /* JADX INFO: renamed from: d */
    private boolean f3639d;

    /* JADX INFO: renamed from: e */
    private boolean f3640e;

    /* JADX INFO: renamed from: f */
    private int f3641f = -1;

    /* JADX INFO: renamed from: g */
    private byte[] f3642g = null;

    /* JADX INFO: renamed from: h */
    private byte[] f3643h;

    /* JADX INFO: renamed from: a */
    private static int m2120a(byte b, byte[] bArr) {
        boolean z = false;
        int i = -1;
        for (int i2 = 1; i2 != bArr.length; i2++) {
            byte b2 = bArr[i2];
            if ((i < 0) & (b2 == 0)) {
                i = i2;
            }
            z |= (b2 != -1) & (b == 1) & (i < 0);
        }
        if (z) {
            return -1;
        }
        return i;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0786a
    /* JADX INFO: renamed from: a */
    public final int mo1868a() {
        int iMo1868a = this.f3637b.mo1868a();
        return this.f3638c ? iMo1868a - 10 : iMo1868a;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0786a
    /* JADX INFO: renamed from: a */
    public final void mo1869a(boolean z, InterfaceC1003i interfaceC1003i) {
        C1075b c1075b;
        if (interfaceC1003i instanceof C1081bf) {
            C1081bf c1081bf = (C1081bf) interfaceC1003i;
            this.f3636a = c1081bf.m2613a();
            c1075b = (C1075b) c1081bf.m2614b();
        } else {
            c1075b = (C1075b) interfaceC1003i;
            if (!c1075b.m2602a() && z) {
                this.f3636a = C1124l.m2709a();
            }
        }
        this.f3637b.mo1869a(z, interfaceC1003i);
        this.f3639d = c1075b.m2602a();
        this.f3638c = z;
        this.f3643h = new byte[this.f3637b.mo1871b()];
        if (this.f3641f > 0 && this.f3642g == null && this.f3636a == null) {
            throw new IllegalArgumentException("encoder requires random");
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC0786a
    /* JADX INFO: renamed from: b */
    public final int mo1871b() {
        int iMo1871b = this.f3637b.mo1871b();
        return this.f3638c ? iMo1871b : iMo1871b - 10;
    }

    public C0887c(InterfaceC0786a interfaceC0786a) {
        this.f3637b = interfaceC0786a;
        String str = (String) AccessController.doPrivileged(new C0888d(this));
        String str2 = (String) AccessController.doPrivileged(new C0889e(this));
        this.f3640e = str2 != null ? !str2.equals("true") : str == null || str.equals("true");
    }

    @Override // org.bouncycastle.p083b.InterfaceC0786a
    /* JADX INFO: renamed from: a */
    public final byte[] mo1870a(byte[] bArr, int i, int i2) throws C1179v {
        if (this.f3638c) {
            if (i2 > mo1868a()) {
                throw new IllegalArgumentException("input data too large");
            }
            byte[] bArr2 = new byte[this.f3637b.mo1868a()];
            if (this.f3639d) {
                bArr2[0] = 1;
                while (i != (bArr2.length - i2) - 1) {
                    bArr2[i] = -1;
                    i++;
                }
            } else {
                this.f3636a.nextBytes(bArr2);
                bArr2[0] = 2;
                while (i != (bArr2.length - i2) - 1) {
                    while (bArr2[i] == 0) {
                        bArr2[i] = (byte) this.f3636a.nextInt();
                    }
                    i++;
                }
            }
            bArr2[(bArr2.length - i2) - 1] = 0;
            System.arraycopy(bArr, i, bArr2, bArr2.length - i2, i2);
            return this.f3637b.mo1870a(bArr2, 0, bArr2.length);
        }
        if (this.f3641f != -1) {
            return m2121b(bArr, i, i2);
        }
        byte[] bArrMo1870a = this.f3637b.mo1870a(bArr, i, i2);
        boolean z = this.f3640e & (bArrMo1870a.length != this.f3637b.mo1871b());
        byte[] bArr3 = bArrMo1870a.length < mo1871b() ? this.f3643h : bArrMo1870a;
        byte b = bArr3[0];
        int i3 = this.f3639d ? b != 2 ? 1 : 0 : b != 1 ? 1 : 0;
        int iM2120a = m2120a(b, bArr3) + 1;
        if (((iM2120a >= 10 ? 0 : 1) | i3) != 0) {
            C1535a.m4071a(bArr3, (byte) 0);
            throw new C1179v("block incorrect");
        }
        if (z) {
            C1535a.m4071a(bArr3, (byte) 0);
            throw new C1179v("block incorrect size");
        }
        byte[] bArr4 = new byte[bArr3.length - iM2120a];
        System.arraycopy(bArr3, iM2120a, bArr4, 0, bArr4.length);
        return bArr4;
    }

    /* JADX INFO: renamed from: b */
    private byte[] m2121b(byte[] bArr, int i, int i2) throws C1179v {
        byte[] bArr2;
        if (!this.f3639d) {
            throw new C1179v("sorry, this method is only for decryption, not for signing");
        }
        byte[] bArrMo1870a = this.f3637b.mo1870a(bArr, i, i2);
        if (this.f3642g == null) {
            bArr2 = new byte[this.f3641f];
            this.f3636a.nextBytes(bArr2);
        } else {
            bArr2 = this.f3642g;
        }
        if ((bArrMo1870a.length != this.f3637b.mo1871b()) & this.f3640e) {
            bArrMo1870a = this.f3643h;
        }
        int i3 = this.f3641f;
        int i4 = (bArrMo1870a[0] ^ 2) | 0;
        int length = bArrMo1870a.length - (i3 + 1);
        for (int i5 = 1; i5 < length; i5++) {
            byte b = bArrMo1870a[i5];
            int i6 = b | (b >> 1);
            int i7 = i6 | (i6 >> 2);
            i4 |= ((i7 | (i7 >> 4)) & 1) - 1;
        }
        int i8 = bArrMo1870a[bArrMo1870a.length - (i3 + 1)] | i4;
        int i9 = i8 | (i8 >> 1);
        int i10 = i9 | (i9 >> 2);
        int i11 = (((i10 | (i10 >> 4)) & 1) - 1) ^ (-1);
        byte[] bArr3 = new byte[this.f3641f];
        for (int i12 = 0; i12 < this.f3641f; i12++) {
            bArr3[i12] = (byte) ((bArrMo1870a[(bArrMo1870a.length - this.f3641f) + i12] & (i11 ^ (-1))) | (bArr2[i12] & i11));
        }
        C1535a.m4071a(bArrMo1870a, (byte) 0);
        return bArr3;
    }
}
