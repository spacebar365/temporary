package org.bouncycastle.p083b.p089e;

import java.security.SecureRandom;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.C1179v;
import org.bouncycastle.p083b.InterfaceC0816ap;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.p086b.C0842s;
import org.bouncycastle.p083b.p093i.C1010b;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.e.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0940q implements InterfaceC0816ap {

    /* JADX INFO: renamed from: h */
    private static final byte[] f3902h = {74, -35, -94, 44, 121, -24, 33, 5};

    /* JADX INFO: renamed from: a */
    InterfaceC1175r f3903a = new C0842s();

    /* JADX INFO: renamed from: b */
    byte[] f3904b = new byte[20];

    /* JADX INFO: renamed from: c */
    private C1010b f3905c;

    /* JADX INFO: renamed from: d */
    private C1076ba f3906d;

    /* JADX INFO: renamed from: e */
    private C1080be f3907e;

    /* JADX INFO: renamed from: f */
    private byte[] f3908f;

    /* JADX INFO: renamed from: g */
    private boolean f3909g;

    /* JADX INFO: renamed from: a */
    private byte[] m2350a(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        this.f3903a.mo1929a(bArr, 0, bArr.length);
        this.f3903a.mo1926a(this.f3904b, 0);
        System.arraycopy(this.f3904b, 0, bArr2, 0, 8);
        return bArr2;
    }

    /* JADX INFO: renamed from: b */
    private static byte[] m2351b(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = bArr[bArr.length - (i + 1)];
        }
        return bArr2;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0816ap
    /* JADX INFO: renamed from: a */
    public final String mo1914a() {
        return "DESede";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0816ap
    /* JADX INFO: renamed from: a */
    public final void mo1915a(boolean z, InterfaceC1003i interfaceC1003i) {
        SecureRandom secureRandomM2709a;
        InterfaceC1003i interfaceC1003iM2614b;
        this.f3909g = z;
        this.f3905c = new C1010b(new C0939p());
        if (interfaceC1003i instanceof C1081bf) {
            C1081bf c1081bf = (C1081bf) interfaceC1003i;
            interfaceC1003iM2614b = c1081bf.m2614b();
            secureRandomM2709a = c1081bf.m2613a();
        } else {
            secureRandomM2709a = C1124l.m2709a();
            interfaceC1003iM2614b = interfaceC1003i;
        }
        if (interfaceC1003iM2614b instanceof C1076ba) {
            this.f3906d = (C1076ba) interfaceC1003iM2614b;
            if (this.f3909g) {
                this.f3908f = new byte[8];
                secureRandomM2709a.nextBytes(this.f3908f);
                this.f3907e = new C1080be(this.f3906d, this.f3908f);
                return;
            }
            return;
        }
        if (interfaceC1003iM2614b instanceof C1080be) {
            this.f3907e = (C1080be) interfaceC1003iM2614b;
            this.f3908f = this.f3907e.m2611a();
            this.f3906d = (C1076ba) this.f3907e.m2612b();
            if (!this.f3909g) {
                throw new IllegalArgumentException("You should not supply an IV for unwrapping");
            }
            if (this.f3908f == null || this.f3908f.length != 8) {
                throw new IllegalArgumentException("IV is not 8 octets");
            }
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC0816ap
    /* JADX INFO: renamed from: a */
    public final byte[] mo1916a(byte[] bArr, int i) {
        if (!this.f3909g) {
            throw new IllegalStateException("Not initialized for wrapping");
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        byte[] bArrM2350a = m2350a(bArr2);
        byte[] bArr3 = new byte[bArr2.length + 8];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArrM2350a, 0, bArr3, bArr2.length, 8);
        int iMo2125b = this.f3905c.mo2125b();
        if (bArr3.length % iMo2125b != 0) {
            throw new IllegalStateException("Not multiple of block length");
        }
        this.f3905c.mo2124a(true, this.f3907e);
        byte[] bArr4 = new byte[bArr3.length];
        for (int i2 = 0; i2 != bArr3.length; i2 += iMo2125b) {
            this.f3905c.mo2122a(bArr3, i2, bArr4, i2);
        }
        byte[] bArr5 = new byte[this.f3908f.length + bArr4.length];
        System.arraycopy(this.f3908f, 0, bArr5, 0, this.f3908f.length);
        System.arraycopy(bArr4, 0, bArr5, this.f3908f.length, bArr4.length);
        byte[] bArrM2351b = m2351b(bArr5);
        this.f3905c.mo2124a(true, new C1080be(this.f3906d, f3902h));
        for (int i3 = 0; i3 != bArrM2351b.length; i3 += iMo2125b) {
            this.f3905c.mo2122a(bArrM2351b, i3, bArrM2351b, i3);
        }
        return bArrM2351b;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0816ap
    /* JADX INFO: renamed from: b */
    public final byte[] mo1917b(byte[] bArr, int i) throws C1179v {
        if (this.f3909g) {
            throw new IllegalStateException("Not set for unwrapping");
        }
        if (bArr == null) {
            throw new C1179v("Null pointer as ciphertext");
        }
        int iMo2125b = this.f3905c.mo2125b();
        if (i % iMo2125b != 0) {
            throw new C1179v("Ciphertext not multiple of ".concat(String.valueOf(iMo2125b)));
        }
        this.f3905c.mo2124a(false, new C1080be(this.f3906d, f3902h));
        byte[] bArr2 = new byte[i];
        for (int i2 = 0; i2 != i; i2 += iMo2125b) {
            this.f3905c.mo2122a(bArr, i2 + 0, bArr2, i2);
        }
        byte[] bArrM2351b = m2351b(bArr2);
        this.f3908f = new byte[8];
        byte[] bArr3 = new byte[bArrM2351b.length - 8];
        System.arraycopy(bArrM2351b, 0, this.f3908f, 0, 8);
        System.arraycopy(bArrM2351b, 8, bArr3, 0, bArrM2351b.length - 8);
        this.f3907e = new C1080be(this.f3906d, this.f3908f);
        this.f3905c.mo2124a(false, this.f3907e);
        byte[] bArr4 = new byte[bArr3.length];
        for (int i3 = 0; i3 != bArr4.length; i3 += iMo2125b) {
            this.f3905c.mo2122a(bArr3, i3, bArr4, i3);
        }
        byte[] bArr5 = new byte[bArr4.length - 8];
        byte[] bArr6 = new byte[8];
        System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length - 8);
        System.arraycopy(bArr4, bArr4.length - 8, bArr6, 0, 8);
        if (C1535a.m4085b(m2350a(bArr5), bArr6)) {
            return bArr5;
        }
        throw new C1179v("Checksum inside ciphertext is corrupted");
    }
}
