package org.bouncycastle.p083b.p084a.p085a;

import java.io.IOException;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0590bn;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.InterfaceC1173p;
import org.bouncycastle.p083b.InterfaceC1174q;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p142f.AbstractC1556g;

/* JADX INFO: renamed from: org.bouncycastle.b.a.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0790c implements InterfaceC1173p {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1175r f3305a;

    /* JADX INFO: renamed from: b */
    private C0653p f3306b;

    /* JADX INFO: renamed from: c */
    private int f3307c;

    /* JADX INFO: renamed from: d */
    private byte[] f3308d;

    /* JADX INFO: renamed from: e */
    private byte[] f3309e;

    public C0790c(InterfaceC1175r interfaceC1175r) {
        this.f3305a = interfaceC1175r;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1173p
    /* JADX INFO: renamed from: a */
    public final int mo1876a(byte[] bArr, int i, int i2) {
        if (bArr.length - i2 < 0) {
            throw new C0803ac("output buffer too small");
        }
        long j = i2;
        int iMo1930b = this.f3305a.mo1930b();
        if (j > 8589934591L) {
            throw new IllegalArgumentException("Output length too large");
        }
        int i3 = (int) (((((long) iMo1930b) + j) - 1) / ((long) iMo1930b));
        byte[] bArr2 = new byte[this.f3305a.mo1930b()];
        int i4 = 1;
        int i5 = i2;
        int i6 = i;
        for (int i7 = 0; i7 < i3; i7++) {
            this.f3305a.mo1929a(this.f3308d, 0, this.f3308d.length);
            C0625g c0625g = new C0625g();
            C0625g c0625g2 = new C0625g();
            c0625g2.m1521a(this.f3306b);
            c0625g2.m1521a(new C0581be(AbstractC1556g.m4143a(i4)));
            c0625g.m1521a(new C0585bi(c0625g2));
            if (this.f3309e != null) {
                c0625g.m1521a(new C0590bn(true, 0, new C0581be(this.f3309e)));
            }
            c0625g.m1521a(new C0590bn(true, 2, new C0581be(AbstractC1556g.m4143a(this.f3307c))));
            try {
                byte[] bArrA = new C0585bi(c0625g).m1577a("DER");
                this.f3305a.mo1929a(bArrA, 0, bArrA.length);
                this.f3305a.mo1926a(bArr2, 0);
                if (i5 > iMo1930b) {
                    System.arraycopy(bArr2, 0, bArr, i6, iMo1930b);
                    i6 += iMo1930b;
                    i5 -= iMo1930b;
                } else {
                    System.arraycopy(bArr2, 0, bArr, i6, i5);
                }
                i4++;
            } catch (IOException e) {
                throw new IllegalArgumentException("unable to encode parameter info: " + e.getMessage());
            }
        }
        this.f3305a.mo1931c();
        return (int) j;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1173p
    /* JADX INFO: renamed from: a */
    public final void mo1877a(InterfaceC1174q interfaceC1174q) {
        C0789b c0789b = (C0789b) interfaceC1174q;
        this.f3306b = c0789b.m1878a();
        this.f3307c = c0789b.m1879b();
        this.f3308d = c0789b.m1880c();
        this.f3309e = c0789b.m1881d();
    }
}
