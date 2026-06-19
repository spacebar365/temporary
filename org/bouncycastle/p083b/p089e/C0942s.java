package org.bouncycastle.p083b.p089e;

import java.util.ArrayList;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.C1179v;
import org.bouncycastle.p083b.InterfaceC0816ap;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.e.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0942s implements InterfaceC0816ap {

    /* JADX INFO: renamed from: a */
    private boolean f3925a;

    /* JADX INFO: renamed from: b */
    private C0941r f3926b;

    /* JADX INFO: renamed from: c */
    private byte[] f3927c;

    /* JADX INFO: renamed from: e */
    private byte[] f3929e;

    /* JADX INFO: renamed from: f */
    private byte[] f3930f;

    /* JADX INFO: renamed from: g */
    private ArrayList<byte[]> f3931g = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    private byte[] f3928d = new byte[4];

    public C0942s(int i) {
        this.f3926b = new C0941r(i);
        this.f3927c = new byte[this.f3926b.mo2125b() / 2];
        this.f3929e = new byte[this.f3926b.mo2125b()];
        this.f3930f = new byte[this.f3926b.mo2125b()];
    }

    /* JADX INFO: renamed from: a */
    private static void m2370a(int i, byte[] bArr) {
        bArr[3] = (byte) (i >> 24);
        bArr[2] = (byte) (i >> 16);
        bArr[1] = (byte) (i >> 8);
        bArr[0] = (byte) i;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0816ap
    /* JADX INFO: renamed from: a */
    public final String mo1914a() {
        return "DSTU7624WrapEngine";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0816ap
    /* JADX INFO: renamed from: a */
    public final void mo1915a(boolean z, InterfaceC1003i interfaceC1003i) {
        if (interfaceC1003i instanceof C1081bf) {
            interfaceC1003i = ((C1081bf) interfaceC1003i).m2614b();
        }
        this.f3925a = z;
        if (!(interfaceC1003i instanceof C1076ba)) {
            throw new IllegalArgumentException("invalid parameters passed to DSTU7624WrapEngine");
        }
        this.f3926b.mo2124a(z, interfaceC1003i);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0816ap
    /* JADX INFO: renamed from: a */
    public final byte[] mo1916a(byte[] bArr, int i) {
        if (!this.f3925a) {
            throw new IllegalStateException("not set for wrapping");
        }
        if (i % this.f3926b.mo2125b() != 0) {
            throw new C1163o("wrap data must be a multiple of " + this.f3926b.mo2125b() + " bytes");
        }
        if (i + 0 > bArr.length) {
            throw new C1163o("input buffer too short");
        }
        int iMo2125b = ((i / this.f3926b.mo2125b()) + 1) * 2;
        int i2 = (iMo2125b - 1) * 6;
        byte[] bArr2 = new byte[this.f3926b.mo2125b() + i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        System.arraycopy(bArr2, 0, this.f3927c, 0, this.f3926b.mo2125b() / 2);
        this.f3931g.clear();
        int length = bArr2.length - (this.f3926b.mo2125b() / 2);
        int iMo2125b2 = this.f3926b.mo2125b() / 2;
        while (length != 0) {
            byte[] bArr3 = new byte[this.f3926b.mo2125b() / 2];
            System.arraycopy(bArr2, iMo2125b2, bArr3, 0, this.f3926b.mo2125b() / 2);
            this.f3931g.add(bArr3);
            length -= this.f3926b.mo2125b() / 2;
            iMo2125b2 += this.f3926b.mo2125b() / 2;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            System.arraycopy(this.f3927c, 0, bArr2, 0, this.f3926b.mo2125b() / 2);
            System.arraycopy(this.f3931g.get(0), 0, bArr2, this.f3926b.mo2125b() / 2, this.f3926b.mo2125b() / 2);
            this.f3926b.mo2122a(bArr2, 0, bArr2, 0);
            m2370a(i3 + 1, this.f3928d);
            for (int i4 = 0; i4 < 4; i4++) {
                int iMo2125b3 = (this.f3926b.mo2125b() / 2) + i4;
                bArr2[iMo2125b3] = (byte) (bArr2[iMo2125b3] ^ this.f3928d[i4]);
            }
            System.arraycopy(bArr2, this.f3926b.mo2125b() / 2, this.f3927c, 0, this.f3926b.mo2125b() / 2);
            for (int i5 = 2; i5 < iMo2125b; i5++) {
                System.arraycopy(this.f3931g.get(i5 - 1), 0, this.f3931g.get(i5 - 2), 0, this.f3926b.mo2125b() / 2);
            }
            System.arraycopy(bArr2, 0, this.f3931g.get(iMo2125b - 2), 0, this.f3926b.mo2125b() / 2);
        }
        System.arraycopy(this.f3927c, 0, bArr2, 0, this.f3926b.mo2125b() / 2);
        int iMo2125b4 = this.f3926b.mo2125b() / 2;
        for (int i6 = 0; i6 < iMo2125b - 1; i6++) {
            System.arraycopy(this.f3931g.get(i6), 0, bArr2, iMo2125b4, this.f3926b.mo2125b() / 2);
            iMo2125b4 += this.f3926b.mo2125b() / 2;
        }
        return bArr2;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0816ap
    /* JADX INFO: renamed from: b */
    public final byte[] mo1917b(byte[] bArr, int i) throws C1179v {
        if (this.f3925a) {
            throw new IllegalStateException("not set for unwrapping");
        }
        if (i % this.f3926b.mo2125b() != 0) {
            throw new C1163o("unwrap data must be a multiple of " + this.f3926b.mo2125b() + " bytes");
        }
        int iMo2125b = (i * 2) / this.f3926b.mo2125b();
        int i2 = (iMo2125b - 1) * 6;
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        byte[] bArr3 = new byte[this.f3926b.mo2125b() / 2];
        System.arraycopy(bArr2, 0, bArr3, 0, this.f3926b.mo2125b() / 2);
        this.f3931g.clear();
        int length = bArr2.length - (this.f3926b.mo2125b() / 2);
        int iMo2125b2 = this.f3926b.mo2125b() / 2;
        while (length != 0) {
            byte[] bArr4 = new byte[this.f3926b.mo2125b() / 2];
            System.arraycopy(bArr2, iMo2125b2, bArr4, 0, this.f3926b.mo2125b() / 2);
            this.f3931g.add(bArr4);
            length -= this.f3926b.mo2125b() / 2;
            iMo2125b2 += this.f3926b.mo2125b() / 2;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            System.arraycopy(this.f3931g.get(iMo2125b - 2), 0, bArr2, 0, this.f3926b.mo2125b() / 2);
            System.arraycopy(bArr3, 0, bArr2, this.f3926b.mo2125b() / 2, this.f3926b.mo2125b() / 2);
            m2370a(i2 - i3, this.f3928d);
            for (int i4 = 0; i4 < 4; i4++) {
                int iMo2125b3 = (this.f3926b.mo2125b() / 2) + i4;
                bArr2[iMo2125b3] = (byte) (bArr2[iMo2125b3] ^ this.f3928d[i4]);
            }
            this.f3926b.mo2122a(bArr2, 0, bArr2, 0);
            System.arraycopy(bArr2, 0, bArr3, 0, this.f3926b.mo2125b() / 2);
            for (int i5 = 2; i5 < iMo2125b; i5++) {
                System.arraycopy(this.f3931g.get((iMo2125b - i5) - 1), 0, this.f3931g.get(iMo2125b - i5), 0, this.f3926b.mo2125b() / 2);
            }
            System.arraycopy(bArr2, this.f3926b.mo2125b() / 2, this.f3931g.get(0), 0, this.f3926b.mo2125b() / 2);
        }
        System.arraycopy(bArr3, 0, bArr2, 0, this.f3926b.mo2125b() / 2);
        int iMo2125b4 = this.f3926b.mo2125b() / 2;
        for (int i6 = 0; i6 < iMo2125b - 1; i6++) {
            System.arraycopy(this.f3931g.get(i6), 0, bArr2, iMo2125b4, this.f3926b.mo2125b() / 2);
            iMo2125b4 += this.f3926b.mo2125b() / 2;
        }
        System.arraycopy(bArr2, bArr2.length - this.f3926b.mo2125b(), this.f3929e, 0, this.f3926b.mo2125b());
        byte[] bArr5 = new byte[bArr2.length - this.f3926b.mo2125b()];
        if (!C1535a.m4076a(this.f3929e, this.f3930f)) {
            throw new C1179v("checksum failed");
        }
        System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length - this.f3926b.mo2125b());
        return bArr5;
    }
}
