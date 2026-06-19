package org.bouncycastle.p083b.p089e;

import java.security.SecureRandom;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.C1179v;
import org.bouncycastle.p083b.InterfaceC0816ap;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.p086b.C0842s;
import org.bouncycastle.p083b.p093i.C1010b;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.e.af */
/* JADX INFO: loaded from: classes.dex */
public final class C0897af implements InterfaceC0816ap {

    /* JADX INFO: renamed from: i */
    private static final byte[] f3691i = {74, -35, -94, 44, 121, -24, 33, 5};

    /* JADX INFO: renamed from: a */
    InterfaceC1175r f3692a = new C0842s();

    /* JADX INFO: renamed from: b */
    byte[] f3693b = new byte[20];

    /* JADX INFO: renamed from: c */
    private C1010b f3694c;

    /* JADX INFO: renamed from: d */
    private InterfaceC1003i f3695d;

    /* JADX INFO: renamed from: e */
    private C1080be f3696e;

    /* JADX INFO: renamed from: f */
    private byte[] f3697f;

    /* JADX INFO: renamed from: g */
    private boolean f3698g;

    /* JADX INFO: renamed from: h */
    private SecureRandom f3699h;

    /* JADX INFO: renamed from: a */
    private byte[] m2165a(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        this.f3692a.mo1929a(bArr, 0, bArr.length);
        this.f3692a.mo1926a(this.f3693b, 0);
        System.arraycopy(this.f3693b, 0, bArr2, 0, 8);
        return bArr2;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0816ap
    /* JADX INFO: renamed from: a */
    public final String mo1914a() {
        return "RC2";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0816ap
    /* JADX INFO: renamed from: a */
    public final void mo1915a(boolean z, InterfaceC1003i interfaceC1003i) {
        InterfaceC1003i interfaceC1003iM2614b;
        this.f3698g = z;
        this.f3694c = new C1010b(new C0896ae());
        if (interfaceC1003i instanceof C1081bf) {
            C1081bf c1081bf = (C1081bf) interfaceC1003i;
            this.f3699h = c1081bf.m2613a();
            interfaceC1003iM2614b = c1081bf.m2614b();
        } else {
            this.f3699h = C1124l.m2709a();
            interfaceC1003iM2614b = interfaceC1003i;
        }
        if (!(interfaceC1003iM2614b instanceof C1080be)) {
            this.f3695d = interfaceC1003iM2614b;
            if (this.f3698g) {
                this.f3697f = new byte[8];
                this.f3699h.nextBytes(this.f3697f);
                this.f3696e = new C1080be(this.f3695d, this.f3697f);
                return;
            }
            return;
        }
        this.f3696e = (C1080be) interfaceC1003iM2614b;
        this.f3697f = this.f3696e.m2611a();
        this.f3695d = this.f3696e.m2612b();
        if (!this.f3698g) {
            throw new IllegalArgumentException("You should not supply an IV for unwrapping");
        }
        if (this.f3697f == null || this.f3697f.length != 8) {
            throw new IllegalArgumentException("IV is not 8 octets");
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC0816ap
    /* JADX INFO: renamed from: a */
    public final byte[] mo1916a(byte[] bArr, int i) {
        if (!this.f3698g) {
            throw new IllegalStateException("Not initialized for wrapping");
        }
        int i2 = i + 1;
        if (i2 % 8 != 0) {
            i2 += 8 - (i2 % 8);
        }
        byte[] bArr2 = new byte[i2];
        bArr2[0] = (byte) i;
        System.arraycopy(bArr, 0, bArr2, 1, i);
        byte[] bArr3 = new byte[(bArr2.length - i) - 1];
        if (bArr3.length > 0) {
            this.f3699h.nextBytes(bArr3);
            System.arraycopy(bArr3, 0, bArr2, i + 1, bArr3.length);
        }
        byte[] bArrM2165a = m2165a(bArr2);
        byte[] bArr4 = new byte[bArr2.length + 8];
        System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
        System.arraycopy(bArrM2165a, 0, bArr4, bArr2.length, 8);
        byte[] bArr5 = new byte[bArr4.length];
        System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
        int length = bArr4.length / this.f3694c.mo2125b();
        if (bArr4.length % this.f3694c.mo2125b() != 0) {
            throw new IllegalStateException("Not multiple of block length");
        }
        this.f3694c.mo2124a(true, this.f3696e);
        for (int i3 = 0; i3 < length; i3++) {
            int iMo2125b = this.f3694c.mo2125b() * i3;
            this.f3694c.mo2122a(bArr5, iMo2125b, bArr5, iMo2125b);
        }
        byte[] bArr6 = new byte[this.f3697f.length + bArr5.length];
        System.arraycopy(this.f3697f, 0, bArr6, 0, this.f3697f.length);
        System.arraycopy(bArr5, 0, bArr6, this.f3697f.length, bArr5.length);
        byte[] bArr7 = new byte[bArr6.length];
        for (int i4 = 0; i4 < bArr6.length; i4++) {
            bArr7[i4] = bArr6[bArr6.length - (i4 + 1)];
        }
        this.f3694c.mo2124a(true, new C1080be(this.f3695d, f3691i));
        for (int i5 = 0; i5 < length + 1; i5++) {
            int iMo2125b2 = this.f3694c.mo2125b() * i5;
            this.f3694c.mo2122a(bArr7, iMo2125b2, bArr7, iMo2125b2);
        }
        return bArr7;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0816ap
    /* JADX INFO: renamed from: b */
    public final byte[] mo1917b(byte[] bArr, int i) throws C1179v {
        if (this.f3698g) {
            throw new IllegalStateException("Not set for unwrapping");
        }
        if (bArr == null) {
            throw new C1179v("Null pointer as ciphertext");
        }
        if (i % this.f3694c.mo2125b() != 0) {
            throw new C1179v("Ciphertext not multiple of " + this.f3694c.mo2125b());
        }
        this.f3694c.mo2124a(false, new C1080be(this.f3695d, f3691i));
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        for (int i2 = 0; i2 < bArr2.length / this.f3694c.mo2125b(); i2++) {
            int iMo2125b = this.f3694c.mo2125b() * i2;
            this.f3694c.mo2122a(bArr2, iMo2125b, bArr2, iMo2125b);
        }
        byte[] bArr3 = new byte[bArr2.length];
        for (int i3 = 0; i3 < bArr2.length; i3++) {
            bArr3[i3] = bArr2[bArr2.length - (i3 + 1)];
        }
        this.f3697f = new byte[8];
        byte[] bArr4 = new byte[bArr3.length - 8];
        System.arraycopy(bArr3, 0, this.f3697f, 0, 8);
        System.arraycopy(bArr3, 8, bArr4, 0, bArr3.length - 8);
        this.f3696e = new C1080be(this.f3695d, this.f3697f);
        this.f3694c.mo2124a(false, this.f3696e);
        byte[] bArr5 = new byte[bArr4.length];
        System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
        for (int i4 = 0; i4 < bArr5.length / this.f3694c.mo2125b(); i4++) {
            int iMo2125b2 = this.f3694c.mo2125b() * i4;
            this.f3694c.mo2122a(bArr5, iMo2125b2, bArr5, iMo2125b2);
        }
        byte[] bArr6 = new byte[bArr5.length - 8];
        byte[] bArr7 = new byte[8];
        System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length - 8);
        System.arraycopy(bArr5, bArr5.length - 8, bArr7, 0, 8);
        if (!C1535a.m4085b(m2165a(bArr6), bArr7)) {
            throw new C1179v("Checksum inside ciphertext is corrupted");
        }
        if (bArr6.length - ((bArr6[0] & 255) + 1) > 7) {
            throw new C1179v("too many pad bytes (" + (bArr6.length - ((bArr6[0] & 255) + 1)) + ")");
        }
        byte[] bArr8 = new byte[bArr6[0]];
        System.arraycopy(bArr6, 1, bArr8, 0, bArr8.length);
        return bArr8;
    }
}
