package org.bouncycastle.p083b.p089e;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.bouncycastle.p083b.C0950f;
import org.bouncycastle.p083b.C1177t;
import org.bouncycastle.p083b.C1179v;
import org.bouncycastle.p083b.InterfaceC0884d;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1173p;
import org.bouncycastle.p083b.InterfaceC1182y;
import org.bouncycastle.p083b.InterfaceC1183z;
import org.bouncycastle.p083b.p090f.C0970q;
import org.bouncycastle.p083b.p097k.C1070av;
import org.bouncycastle.p083b.p097k.C1071aw;
import org.bouncycastle.p083b.p097k.C1074az;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p142f.AbstractC1556g;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1544b;

/* JADX INFO: renamed from: org.bouncycastle.b.e.ac */
/* JADX INFO: loaded from: classes.dex */
public final class C0894ac {

    /* JADX INFO: renamed from: a */
    InterfaceC0884d f3668a;

    /* JADX INFO: renamed from: b */
    InterfaceC1173p f3669b;

    /* JADX INFO: renamed from: c */
    InterfaceC1183z f3670c;

    /* JADX INFO: renamed from: d */
    C0950f f3671d;

    /* JADX INFO: renamed from: e */
    byte[] f3672e;

    /* JADX INFO: renamed from: f */
    boolean f3673f;

    /* JADX INFO: renamed from: g */
    InterfaceC1003i f3674g;

    /* JADX INFO: renamed from: h */
    InterfaceC1003i f3675h;

    /* JADX INFO: renamed from: i */
    C1070av f3676i;

    /* JADX INFO: renamed from: j */
    byte[] f3677j;

    /* JADX INFO: renamed from: k */
    private C0970q f3678k;

    /* JADX INFO: renamed from: l */
    private InterfaceC1182y f3679l;

    /* JADX INFO: renamed from: m */
    private byte[] f3680m;

    public C0894ac(InterfaceC0884d interfaceC0884d, InterfaceC1173p interfaceC1173p, InterfaceC1183z interfaceC1183z) {
        this.f3668a = interfaceC0884d;
        this.f3669b = interfaceC1173p;
        this.f3670c = interfaceC1183z;
        this.f3672e = new byte[interfaceC1183z.mo2451b()];
        this.f3671d = null;
    }

    public C0894ac(InterfaceC0884d interfaceC0884d, InterfaceC1173p interfaceC1173p, InterfaceC1183z interfaceC1183z, C0950f c0950f) {
        this.f3668a = interfaceC0884d;
        this.f3669b = interfaceC1173p;
        this.f3670c = interfaceC1183z;
        this.f3672e = new byte[interfaceC1183z.mo2451b()];
        this.f3671d = c0950f;
    }

    /* JADX INFO: renamed from: a */
    private void m2142a(InterfaceC1003i interfaceC1003i) {
        if (interfaceC1003i instanceof C1080be) {
            this.f3680m = ((C1080be) interfaceC1003i).m2611a();
            this.f3676i = (C1070av) ((C1080be) interfaceC1003i).m2612b();
        } else {
            this.f3680m = null;
            this.f3676i = (C1070av) interfaceC1003i;
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m2143a(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        if (bArr != null) {
            AbstractC1556g.m4137a(((long) bArr.length) * 8, bArr2, 0);
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: b */
    private byte[] m2144b(byte[] bArr, int i) {
        byte[] bArr2;
        byte[] bArr3;
        if (this.f3671d == null) {
            byte[] bArr4 = new byte[i];
            bArr3 = new byte[this.f3676i.m2593c() / 8];
            byte[] bArr5 = new byte[bArr4.length + bArr3.length];
            this.f3669b.mo1876a(bArr5, 0, bArr5.length);
            if (this.f3677j.length != 0) {
                System.arraycopy(bArr5, 0, bArr3, 0, bArr3.length);
                System.arraycopy(bArr5, bArr3.length, bArr4, 0, bArr4.length);
            } else {
                System.arraycopy(bArr5, 0, bArr4, 0, bArr4.length);
                System.arraycopy(bArr5, i, bArr3, 0, bArr3.length);
            }
            bArr2 = new byte[i];
            for (int i2 = 0; i2 != i; i2++) {
                bArr2[i2] = (byte) (bArr[i2 + 0] ^ bArr4[i2]);
            }
        } else {
            byte[] bArr6 = new byte[((C1071aw) this.f3676i).m2594d() / 8];
            byte[] bArr7 = new byte[this.f3676i.m2593c() / 8];
            byte[] bArr8 = new byte[bArr6.length + bArr7.length];
            this.f3669b.mo1876a(bArr8, 0, bArr8.length);
            System.arraycopy(bArr8, 0, bArr6, 0, bArr6.length);
            System.arraycopy(bArr8, bArr6.length, bArr7, 0, bArr7.length);
            if (this.f3680m != null) {
                this.f3671d.mo2403a(true, (InterfaceC1003i) new C1080be(new C1076ba(bArr6), this.f3680m));
            } else {
                this.f3671d.mo2403a(true, (InterfaceC1003i) new C1076ba(bArr6));
            }
            bArr2 = new byte[this.f3671d.mo2405b(i)];
            int iMo2401a = this.f3671d.mo2401a(bArr, 0, i, bArr2, 0);
            i = iMo2401a + this.f3671d.mo2400a(bArr2, iMo2401a);
            bArr3 = bArr7;
        }
        byte[] bArrM2592b = this.f3676i.m2592b();
        byte[] bArrM2143a = this.f3677j.length != 0 ? m2143a(bArrM2592b) : null;
        byte[] bArr9 = new byte[this.f3670c.mo2451b()];
        this.f3670c.mo2449a(new C1076ba(bArr3));
        this.f3670c.mo2450a(bArr2, 0, bArr2.length);
        if (bArrM2592b != null) {
            this.f3670c.mo2450a(bArrM2592b, 0, bArrM2592b.length);
        }
        if (this.f3677j.length != 0) {
            this.f3670c.mo2450a(bArrM2143a, 0, bArrM2143a.length);
        }
        this.f3670c.mo2446a(bArr9, 0);
        byte[] bArr10 = new byte[this.f3677j.length + i + bArr9.length];
        System.arraycopy(this.f3677j, 0, bArr10, 0, this.f3677j.length);
        System.arraycopy(bArr2, 0, bArr10, this.f3677j.length, i);
        System.arraycopy(bArr9, 0, bArr10, this.f3677j.length + i, bArr9.length);
        return bArr10;
    }

    /* JADX INFO: renamed from: c */
    private byte[] m2145c(byte[] bArr, int i) throws C1179v {
        byte[] bArr2;
        int iMo2401a;
        byte[] bArr3;
        if (i < this.f3677j.length + this.f3670c.mo2451b()) {
            throw new C1179v("Length of input must be greater than the MAC and V combined");
        }
        if (this.f3671d == null) {
            byte[] bArr4 = new byte[(i - this.f3677j.length) - this.f3670c.mo2451b()];
            bArr3 = new byte[this.f3676i.m2593c() / 8];
            byte[] bArr5 = new byte[bArr4.length + bArr3.length];
            this.f3669b.mo1876a(bArr5, 0, bArr5.length);
            if (this.f3677j.length != 0) {
                System.arraycopy(bArr5, 0, bArr3, 0, bArr3.length);
                System.arraycopy(bArr5, bArr3.length, bArr4, 0, bArr4.length);
            } else {
                System.arraycopy(bArr5, 0, bArr4, 0, bArr4.length);
                System.arraycopy(bArr5, bArr4.length, bArr3, 0, bArr3.length);
            }
            bArr2 = new byte[bArr4.length];
            for (int i2 = 0; i2 != bArr4.length; i2++) {
                bArr2[i2] = (byte) (bArr[(this.f3677j.length + 0) + i2] ^ bArr4[i2]);
            }
            iMo2401a = 0;
        } else {
            byte[] bArr6 = new byte[((C1071aw) this.f3676i).m2594d() / 8];
            byte[] bArr7 = new byte[this.f3676i.m2593c() / 8];
            byte[] bArr8 = new byte[bArr6.length + bArr7.length];
            this.f3669b.mo1876a(bArr8, 0, bArr8.length);
            System.arraycopy(bArr8, 0, bArr6, 0, bArr6.length);
            System.arraycopy(bArr8, bArr6.length, bArr7, 0, bArr7.length);
            C1076ba c1076ba = new C1076ba(bArr6);
            this.f3671d.mo2403a(false, this.f3680m != null ? new C1080be(c1076ba, this.f3680m) : c1076ba);
            bArr2 = new byte[this.f3671d.mo2405b((i - this.f3677j.length) - this.f3670c.mo2451b())];
            iMo2401a = this.f3671d.mo2401a(bArr, this.f3677j.length + 0, (i - this.f3677j.length) - this.f3670c.mo2451b(), bArr2, 0);
            bArr3 = bArr7;
        }
        byte[] bArrM2592b = this.f3676i.m2592b();
        byte[] bArrM2143a = this.f3677j.length != 0 ? m2143a(bArrM2592b) : null;
        int i3 = i + 0;
        byte[] bArrM4090c = C1535a.m4090c(bArr, i3 - this.f3670c.mo2451b(), i3);
        byte[] bArr9 = new byte[bArrM4090c.length];
        this.f3670c.mo2449a(new C1076ba(bArr3));
        this.f3670c.mo2450a(bArr, this.f3677j.length + 0, (i - this.f3677j.length) - bArr9.length);
        if (bArrM2592b != null) {
            this.f3670c.mo2450a(bArrM2592b, 0, bArrM2592b.length);
        }
        if (this.f3677j.length != 0) {
            this.f3670c.mo2450a(bArrM2143a, 0, bArrM2143a.length);
        }
        this.f3670c.mo2446a(bArr9, 0);
        if (C1535a.m4085b(bArrM4090c, bArr9)) {
            return this.f3671d == null ? bArr2 : C1535a.m4090c(bArr2, 0, iMo2401a + this.f3671d.mo2400a(bArr2, iMo2401a));
        }
        throw new C1179v("invalid MAC");
    }

    /* JADX INFO: renamed from: a */
    public final C0950f m2146a() {
        return this.f3671d;
    }

    /* JADX INFO: renamed from: a */
    public final void m2147a(C1075b c1075b, InterfaceC1003i interfaceC1003i, C0970q c0970q) {
        this.f3673f = true;
        this.f3675h = c1075b;
        this.f3678k = c0970q;
        m2142a(interfaceC1003i);
    }

    /* JADX INFO: renamed from: a */
    public final void m2148a(C1075b c1075b, InterfaceC1003i interfaceC1003i, InterfaceC1182y interfaceC1182y) {
        this.f3673f = false;
        this.f3674g = c1075b;
        this.f3679l = interfaceC1182y;
        m2142a(interfaceC1003i);
    }

    /* JADX INFO: renamed from: a */
    public final void m2149a(boolean z, InterfaceC1003i interfaceC1003i, InterfaceC1003i interfaceC1003i2, InterfaceC1003i interfaceC1003i3) {
        this.f3673f = z;
        this.f3674g = interfaceC1003i;
        this.f3675h = interfaceC1003i2;
        this.f3677j = new byte[0];
        m2142a(interfaceC1003i3);
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m2150a(byte[] bArr, int i) throws C1179v {
        if (this.f3673f) {
            if (this.f3678k != null) {
                C1177t c1177tM2435a = this.f3678k.m2435a();
                this.f3674g = c1177tM2435a.m2821a().m1920b();
                this.f3677j = c1177tM2435a.m2822b();
            }
        } else if (this.f3679l != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, 0, i);
            try {
                this.f3675h = this.f3679l.mo2714a(byteArrayInputStream);
                this.f3677j = C1535a.m4090c(bArr, 0, (i - byteArrayInputStream.available()) + 0);
            } catch (IOException e) {
                throw new C1179v("unable to recover ephemeral public key: " + e.getMessage(), e);
            } catch (IllegalArgumentException e2) {
                throw new C1179v("unable to recover ephemeral public key: " + e2.getMessage(), e2);
            }
        }
        this.f3668a.mo1873a(this.f3674g);
        byte[] bArrM4117a = C1544b.m4117a(this.f3668a.mo1872a(), this.f3668a.mo1874b(this.f3675h));
        if (this.f3677j.length != 0) {
            byte[] bArrM4095d = C1535a.m4095d(this.f3677j, bArrM4117a);
            C1535a.m4071a(bArrM4117a, (byte) 0);
            bArrM4117a = bArrM4095d;
        }
        try {
            this.f3669b.mo1877a(new C1074az(bArrM4117a, this.f3676i.m2591a()));
            return this.f3673f ? m2144b(bArr, i) : m2145c(bArr, i);
        } finally {
            C1535a.m4071a(bArrM4117a, (byte) 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC1183z m2151b() {
        return this.f3670c;
    }
}
