package org.bouncycastle.p083b.p088d;

import java.security.SecureRandom;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.C1179v;
import org.bouncycastle.p083b.InterfaceC0786a;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.d.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0886b implements InterfaceC0786a {

    /* JADX INFO: renamed from: a */
    private byte[] f3631a;

    /* JADX INFO: renamed from: b */
    private InterfaceC1175r f3632b;

    /* JADX INFO: renamed from: c */
    private InterfaceC0786a f3633c;

    /* JADX INFO: renamed from: d */
    private SecureRandom f3634d;

    /* JADX INFO: renamed from: e */
    private boolean f3635e;

    public C0886b(InterfaceC0786a interfaceC0786a, InterfaceC1175r interfaceC1175r, InterfaceC1175r interfaceC1175r2, byte[] bArr) {
        this.f3633c = interfaceC0786a;
        this.f3632b = interfaceC1175r2;
        this.f3631a = new byte[interfaceC1175r.mo1930b()];
        interfaceC1175r.mo1931c();
        if (bArr != null) {
            interfaceC1175r.mo1929a(bArr, 0, bArr.length);
        }
        interfaceC1175r.mo1926a(this.f3631a, 0);
    }

    public C0886b(InterfaceC0786a interfaceC0786a, InterfaceC1175r interfaceC1175r, byte[] bArr) {
        this(interfaceC0786a, interfaceC1175r, interfaceC1175r, bArr);
    }

    /* JADX INFO: renamed from: a */
    private static void m2118a(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) (i >>> 0);
    }

    /* JADX INFO: renamed from: a */
    private byte[] m2119a(byte[] bArr, int i, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        byte[] bArr3 = new byte[this.f3632b.mo1930b()];
        byte[] bArr4 = new byte[4];
        this.f3632b.mo1931c();
        int i4 = 0;
        while (i4 < i3 / bArr3.length) {
            m2118a(i4, bArr4);
            this.f3632b.mo1929a(bArr, i, i2);
            this.f3632b.mo1929a(bArr4, 0, 4);
            this.f3632b.mo1926a(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, bArr3.length * i4, bArr3.length);
            i4++;
        }
        if (bArr3.length * i4 < i3) {
            m2118a(i4, bArr4);
            this.f3632b.mo1929a(bArr, i, i2);
            this.f3632b.mo1929a(bArr4, 0, 4);
            this.f3632b.mo1926a(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, bArr3.length * i4, bArr2.length - (i4 * bArr3.length));
        }
        return bArr2;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0786a
    /* JADX INFO: renamed from: a */
    public final int mo1868a() {
        int iMo1868a = this.f3633c.mo1868a();
        return this.f3635e ? (iMo1868a - 1) - (this.f3631a.length * 2) : iMo1868a;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0786a
    /* JADX INFO: renamed from: a */
    public final void mo1869a(boolean z, InterfaceC1003i interfaceC1003i) {
        if (interfaceC1003i instanceof C1081bf) {
            this.f3634d = ((C1081bf) interfaceC1003i).m2613a();
        } else {
            this.f3634d = C1124l.m2709a();
        }
        this.f3633c.mo1869a(z, interfaceC1003i);
        this.f3635e = z;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0786a
    /* JADX INFO: renamed from: b */
    public final int mo1871b() {
        int iMo1871b = this.f3633c.mo1871b();
        return this.f3635e ? iMo1871b : (iMo1871b - 1) - (this.f3631a.length * 2);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0786a
    /* JADX INFO: renamed from: a */
    public final byte[] mo1870a(byte[] bArr, int i, int i2) throws C1179v {
        if (this.f3635e) {
            if (i2 > mo1868a()) {
                throw new C1163o("input data too long");
            }
            byte[] bArr2 = new byte[mo1868a() + 1 + (this.f3631a.length * 2)];
            System.arraycopy(bArr, i, bArr2, bArr2.length - i2, i2);
            bArr2[(bArr2.length - i2) - 1] = 1;
            System.arraycopy(this.f3631a, 0, bArr2, this.f3631a.length, this.f3631a.length);
            byte[] bArr3 = new byte[this.f3631a.length];
            this.f3634d.nextBytes(bArr3);
            byte[] bArrM2119a = m2119a(bArr3, 0, bArr3.length, bArr2.length - this.f3631a.length);
            for (int length = this.f3631a.length; length != bArr2.length; length++) {
                bArr2[length] = (byte) (bArr2[length] ^ bArrM2119a[length - this.f3631a.length]);
            }
            System.arraycopy(bArr3, 0, bArr2, 0, this.f3631a.length);
            byte[] bArrM2119a2 = m2119a(bArr2, this.f3631a.length, bArr2.length - this.f3631a.length, this.f3631a.length);
            for (int i3 = 0; i3 != this.f3631a.length; i3++) {
                bArr2[i3] = (byte) (bArr2[i3] ^ bArrM2119a2[i3]);
            }
            return this.f3633c.mo1870a(bArr2, 0, bArr2.length);
        }
        byte[] bArrMo1870a = this.f3633c.mo1870a(bArr, i, i2);
        byte[] bArr4 = new byte[this.f3633c.mo1871b()];
        boolean z = bArr4.length < (this.f3631a.length * 2) + 1;
        if (bArrMo1870a.length <= bArr4.length) {
            System.arraycopy(bArrMo1870a, 0, bArr4, bArr4.length - bArrMo1870a.length, bArrMo1870a.length);
        } else {
            System.arraycopy(bArrMo1870a, 0, bArr4, 0, bArr4.length);
            z = true;
        }
        byte[] bArrM2119a3 = m2119a(bArr4, this.f3631a.length, bArr4.length - this.f3631a.length, this.f3631a.length);
        for (int i4 = 0; i4 != this.f3631a.length; i4++) {
            bArr4[i4] = (byte) (bArr4[i4] ^ bArrM2119a3[i4]);
        }
        byte[] bArrM2119a4 = m2119a(bArr4, 0, this.f3631a.length, bArr4.length - this.f3631a.length);
        for (int length2 = this.f3631a.length; length2 != bArr4.length; length2++) {
            bArr4[length2] = (byte) (bArr4[length2] ^ bArrM2119a4[length2 - this.f3631a.length]);
        }
        boolean z2 = false;
        for (int i5 = 0; i5 != this.f3631a.length; i5++) {
            if (this.f3631a[i5] != bArr4[this.f3631a.length + i5]) {
                z2 = true;
            }
        }
        int length3 = bArr4.length;
        for (int length4 = this.f3631a.length * 2; length4 != bArr4.length; length4++) {
            if ((bArr4[length4] != 0) & (length3 == bArr4.length)) {
                length3 = length4;
            }
        }
        boolean z3 = length3 > bArr4.length + (-1);
        boolean z4 = bArr4[length3] != 1;
        int i6 = length3 + 1;
        if ((z | z2) || (z4 | z3)) {
            C1535a.m4071a(bArr4, (byte) 0);
            throw new C1179v("data wrong");
        }
        byte[] bArr5 = new byte[bArr4.length - i6];
        System.arraycopy(bArr4, i6, bArr5, 0, bArr5.length);
        return bArr5;
    }
}
