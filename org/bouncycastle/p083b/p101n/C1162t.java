package org.bouncycastle.p083b.p101n;

import java.math.BigInteger;
import org.bouncycastle.p083b.InterfaceC0786a;
import org.bouncycastle.p083b.InterfaceC0811ak;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.p097k.C1088bm;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1544b;

/* JADX INFO: renamed from: org.bouncycastle.b.n.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1162t implements InterfaceC0811ak {

    /* JADX INFO: renamed from: a */
    private InterfaceC1175r f4645a;

    /* JADX INFO: renamed from: b */
    private InterfaceC0786a f4646b;

    /* JADX INFO: renamed from: c */
    private C1088bm f4647c;

    /* JADX INFO: renamed from: d */
    private int f4648d;

    /* JADX INFO: renamed from: e */
    private int f4649e;

    /* JADX INFO: renamed from: f */
    private byte[] f4650f;

    private C1162t(InterfaceC0786a interfaceC0786a, InterfaceC1175r interfaceC1175r) {
        this.f4646b = interfaceC0786a;
        this.f4645a = interfaceC1175r;
        Integer numM2766a = C1156n.m2766a(interfaceC1175r);
        if (numM2766a == null) {
            throw new IllegalArgumentException("no valid trailer for digest: " + interfaceC1175r.mo1927a());
        }
        this.f4648d = numM2766a.intValue();
    }

    public C1162t(InterfaceC0786a interfaceC0786a, InterfaceC1175r interfaceC1175r, byte b) {
        this(interfaceC0786a, interfaceC1175r);
    }

    /* JADX INFO: renamed from: a */
    private void m2780a(int i) {
        int length;
        int iMo1930b = this.f4645a.mo1930b();
        if (i == 188) {
            length = (this.f4650f.length - iMo1930b) - 1;
            this.f4645a.mo1926a(this.f4650f, length);
            this.f4650f[this.f4650f.length - 1] = -68;
        } else {
            length = (this.f4650f.length - iMo1930b) - 2;
            this.f4645a.mo1926a(this.f4650f, length);
            this.f4650f[this.f4650f.length - 2] = (byte) (i >>> 8);
            this.f4650f[this.f4650f.length - 1] = (byte) i;
        }
        this.f4650f[0] = 107;
        for (int i2 = length - 2; i2 != 0; i2--) {
            this.f4650f[i2] = -69;
        }
        this.f4650f[length - 1] = -70;
    }

    /* JADX INFO: renamed from: b */
    private static void m2781b(byte[] bArr) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC0811ak
    /* JADX INFO: renamed from: a */
    public final void mo1903a(byte b) {
        this.f4645a.mo1928a(b);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0811ak
    /* JADX INFO: renamed from: a */
    public final void mo1905a(byte[] bArr, int i, int i2) {
        this.f4645a.mo1929a(bArr, i, i2);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0811ak
    /* JADX INFO: renamed from: a */
    public final boolean mo1906a(byte[] bArr) {
        try {
            this.f4650f = this.f4646b.mo1870a(bArr, 0, bArr.length);
            BigInteger bigInteger = new BigInteger(1, this.f4650f);
            if ((bigInteger.intValue() & 15) != 12) {
                bigInteger = this.f4647c.m2625b().subtract(bigInteger);
                if ((bigInteger.intValue() & 15) != 12) {
                    return false;
                }
            }
            m2780a(this.f4648d);
            byte[] bArrM4117a = C1544b.m4117a(this.f4650f.length, bigInteger);
            boolean zM4085b = C1535a.m4085b(this.f4650f, bArrM4117a);
            if (this.f4648d == 15052 && !zM4085b) {
                this.f4650f[this.f4650f.length - 2] = 64;
                zM4085b = C1535a.m4085b(this.f4650f, bArrM4117a);
            }
            m2781b(this.f4650f);
            m2781b(bArrM4117a);
            return zM4085b;
        } catch (Exception e) {
            return false;
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC0811ak
    /* JADX INFO: renamed from: a */
    public final byte[] mo1907a() {
        m2780a(this.f4648d);
        BigInteger bigInteger = new BigInteger(1, this.f4646b.mo1870a(this.f4650f, 0, this.f4650f.length));
        m2781b(this.f4650f);
        return C1544b.m4117a(C1544b.m4119b(this.f4647c.m2625b()), bigInteger.min(this.f4647c.m2625b().subtract(bigInteger)));
    }

    @Override // org.bouncycastle.p083b.InterfaceC0811ak
    /* JADX INFO: renamed from: a */
    public final void mo1904a(boolean z, InterfaceC1003i interfaceC1003i) {
        this.f4647c = (C1088bm) interfaceC1003i;
        this.f4646b.mo1869a(z, this.f4647c);
        this.f4649e = this.f4647c.m2625b().bitLength();
        this.f4650f = new byte[(this.f4649e + 7) / 8];
        this.f4645a.mo1931c();
    }
}
