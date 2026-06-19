package org.bouncycastle.p083b.p101n;

import java.security.SecureRandom;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.InterfaceC0786a;
import org.bouncycastle.p083b.InterfaceC0811ak;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p083b.p097k.C1086bk;
import org.bouncycastle.p083b.p097k.C1088bm;

/* JADX INFO: renamed from: org.bouncycastle.b.n.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1157o implements InterfaceC0811ak {

    /* JADX INFO: renamed from: a */
    private InterfaceC1175r f4620a;

    /* JADX INFO: renamed from: b */
    private InterfaceC1175r f4621b;

    /* JADX INFO: renamed from: c */
    private InterfaceC0786a f4622c;

    /* JADX INFO: renamed from: d */
    private SecureRandom f4623d;

    /* JADX INFO: renamed from: e */
    private int f4624e;

    /* JADX INFO: renamed from: f */
    private int f4625f;

    /* JADX INFO: renamed from: g */
    private boolean f4626g = false;

    /* JADX INFO: renamed from: h */
    private int f4627h;

    /* JADX INFO: renamed from: i */
    private int f4628i;

    /* JADX INFO: renamed from: j */
    private byte[] f4629j;

    /* JADX INFO: renamed from: k */
    private byte[] f4630k;

    /* JADX INFO: renamed from: l */
    private byte[] f4631l;

    /* JADX INFO: renamed from: m */
    private byte f4632m;

    public C1157o(InterfaceC0786a interfaceC0786a, InterfaceC1175r interfaceC1175r, InterfaceC1175r interfaceC1175r2, int i, byte b) {
        this.f4622c = interfaceC0786a;
        this.f4620a = interfaceC1175r;
        this.f4621b = interfaceC1175r2;
        this.f4624e = interfaceC1175r.mo1930b();
        this.f4625f = interfaceC1175r2.mo1930b();
        this.f4627h = i;
        this.f4629j = new byte[i];
        this.f4630k = new byte[i + 8 + this.f4624e];
        this.f4632m = b;
    }

    /* JADX INFO: renamed from: a */
    private static void m2767a(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) (i >>> 0);
    }

    /* JADX INFO: renamed from: a */
    private byte[] m2768a(byte[] bArr, int i, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        byte[] bArr3 = new byte[this.f4625f];
        byte[] bArr4 = new byte[4];
        this.f4621b.mo1931c();
        int i4 = 0;
        while (i4 < i3 / this.f4625f) {
            m2767a(i4, bArr4);
            this.f4621b.mo1929a(bArr, i, i2);
            this.f4621b.mo1929a(bArr4, 0, 4);
            this.f4621b.mo1926a(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, this.f4625f * i4, this.f4625f);
            i4++;
        }
        if (this.f4625f * i4 < i3) {
            m2767a(i4, bArr4);
            this.f4621b.mo1929a(bArr, i, i2);
            this.f4621b.mo1929a(bArr4, 0, 4);
            this.f4621b.mo1926a(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, this.f4625f * i4, bArr2.length - (i4 * this.f4625f));
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: b */
    private static void m2769b(byte[] bArr) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC0811ak
    /* JADX INFO: renamed from: a */
    public final void mo1903a(byte b) {
        this.f4620a.mo1928a(b);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0811ak
    /* JADX INFO: renamed from: a */
    public final void mo1905a(byte[] bArr, int i, int i2) {
        this.f4620a.mo1929a(bArr, i, i2);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0811ak
    /* JADX INFO: renamed from: a */
    public final boolean mo1906a(byte[] bArr) {
        this.f4620a.mo1926a(this.f4630k, (this.f4630k.length - this.f4624e) - this.f4627h);
        try {
            byte[] bArrMo1870a = this.f4622c.mo1870a(bArr, 0, bArr.length);
            System.arraycopy(bArrMo1870a, 0, this.f4631l, this.f4631l.length - bArrMo1870a.length, bArrMo1870a.length);
            if (this.f4631l[this.f4631l.length - 1] != this.f4632m) {
                m2769b(this.f4631l);
                return false;
            }
            byte[] bArrM2768a = m2768a(this.f4631l, (this.f4631l.length - this.f4624e) - 1, this.f4624e, (this.f4631l.length - this.f4624e) - 1);
            for (int i = 0; i != bArrM2768a.length; i++) {
                byte[] bArr2 = this.f4631l;
                bArr2[i] = (byte) (bArr2[i] ^ bArrM2768a[i]);
            }
            byte[] bArr3 = this.f4631l;
            bArr3[0] = (byte) (bArr3[0] & (255 >> ((this.f4631l.length * 8) - this.f4628i)));
            for (int i2 = 0; i2 != ((this.f4631l.length - this.f4624e) - this.f4627h) - 2; i2++) {
                if (this.f4631l[i2] != 0) {
                    m2769b(this.f4631l);
                    return false;
                }
            }
            if (this.f4631l[((this.f4631l.length - this.f4624e) - this.f4627h) - 2] != 1) {
                m2769b(this.f4631l);
                return false;
            }
            if (this.f4626g) {
                System.arraycopy(this.f4629j, 0, this.f4630k, this.f4630k.length - this.f4627h, this.f4627h);
            } else {
                System.arraycopy(this.f4631l, ((this.f4631l.length - this.f4627h) - this.f4624e) - 1, this.f4630k, this.f4630k.length - this.f4627h, this.f4627h);
            }
            this.f4620a.mo1929a(this.f4630k, 0, this.f4630k.length);
            this.f4620a.mo1926a(this.f4630k, this.f4630k.length - this.f4624e);
            int length = (this.f4631l.length - this.f4624e) - 1;
            for (int length2 = this.f4630k.length - this.f4624e; length2 != this.f4630k.length; length2++) {
                if ((this.f4631l[length] ^ this.f4630k[length2]) != 0) {
                    m2769b(this.f4630k);
                    m2769b(this.f4631l);
                    return false;
                }
                length++;
            }
            m2769b(this.f4630k);
            m2769b(this.f4631l);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC0811ak
    /* JADX INFO: renamed from: a */
    public final byte[] mo1907a() {
        this.f4620a.mo1926a(this.f4630k, (this.f4630k.length - this.f4624e) - this.f4627h);
        if (this.f4627h != 0) {
            if (!this.f4626g) {
                this.f4623d.nextBytes(this.f4629j);
            }
            System.arraycopy(this.f4629j, 0, this.f4630k, this.f4630k.length - this.f4627h, this.f4627h);
        }
        byte[] bArr = new byte[this.f4624e];
        this.f4620a.mo1929a(this.f4630k, 0, this.f4630k.length);
        this.f4620a.mo1926a(bArr, 0);
        this.f4631l[(((this.f4631l.length - this.f4627h) - 1) - this.f4624e) - 1] = 1;
        System.arraycopy(this.f4629j, 0, this.f4631l, ((this.f4631l.length - this.f4627h) - this.f4624e) - 1, this.f4627h);
        byte[] bArrM2768a = m2768a(bArr, 0, bArr.length, (this.f4631l.length - this.f4624e) - 1);
        for (int i = 0; i != bArrM2768a.length; i++) {
            byte[] bArr2 = this.f4631l;
            bArr2[i] = (byte) (bArr2[i] ^ bArrM2768a[i]);
        }
        byte[] bArr3 = this.f4631l;
        bArr3[0] = (byte) (bArr3[0] & (255 >> ((this.f4631l.length * 8) - this.f4628i)));
        System.arraycopy(bArr, 0, this.f4631l, (this.f4631l.length - this.f4624e) - 1, this.f4624e);
        this.f4631l[this.f4631l.length - 1] = this.f4632m;
        byte[] bArrMo1870a = this.f4622c.mo1870a(this.f4631l, 0, this.f4631l.length);
        m2769b(this.f4631l);
        return bArrMo1870a;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0811ak
    /* JADX INFO: renamed from: a */
    public final void mo1904a(boolean z, InterfaceC1003i interfaceC1003i) {
        InterfaceC1003i interfaceC1003i2;
        C1088bm c1088bmM2622a;
        if (interfaceC1003i instanceof C1081bf) {
            C1081bf c1081bf = (C1081bf) interfaceC1003i;
            InterfaceC1003i interfaceC1003iM2614b = c1081bf.m2614b();
            this.f4623d = c1081bf.m2613a();
            interfaceC1003i2 = interfaceC1003iM2614b;
        } else {
            if (z) {
                this.f4623d = C1124l.m2709a();
            }
            interfaceC1003i2 = interfaceC1003i;
        }
        if (interfaceC1003i2 instanceof C1086bk) {
            c1088bmM2622a = ((C1086bk) interfaceC1003i2).m2622a();
            this.f4622c.mo1869a(z, interfaceC1003i);
        } else {
            c1088bmM2622a = (C1088bm) interfaceC1003i2;
            this.f4622c.mo1869a(z, interfaceC1003i2);
        }
        this.f4628i = c1088bmM2622a.m2625b().bitLength() - 1;
        if (this.f4628i < (this.f4624e * 8) + (this.f4627h * 8) + 9) {
            throw new IllegalArgumentException("key too small for specified hash and salt lengths");
        }
        this.f4631l = new byte[(this.f4628i + 7) / 8];
        this.f4620a.mo1931c();
    }
}
