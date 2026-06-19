package org.bouncycastle.p083b.p096j;

import java.security.SecureRandom;
import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C0950f;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1081bf;

/* JADX INFO: renamed from: org.bouncycastle.b.j.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1043e extends C0950f {

    /* JADX INFO: renamed from: g */
    InterfaceC1039a f4370g;

    public C1043e(InterfaceC0890e interfaceC0890e) {
        this(interfaceC0890e, new C1042d());
    }

    public C1043e(InterfaceC0890e interfaceC0890e, InterfaceC1039a interfaceC1039a) {
        this.f3989d = interfaceC0890e;
        this.f4370g = interfaceC1039a;
        this.f3986a = new byte[interfaceC0890e.mo2125b()];
        this.f3987b = 0;
    }

    @Override // org.bouncycastle.p083b.C0950f
    /* JADX INFO: renamed from: a */
    public final int mo2399a(int i) {
        int i2 = this.f3987b + i;
        int length = i2 % this.f3986a.length;
        return length == 0 ? Math.max(0, i2 - this.f3986a.length) : i2 - length;
    }

    @Override // org.bouncycastle.p083b.C0950f
    /* JADX INFO: renamed from: a */
    public final int mo2400a(byte[] bArr, int i) {
        int iMo2122a;
        int iMo2125b = this.f3989d.mo2125b();
        if (this.f3988c) {
            if (this.f3987b != iMo2125b) {
                iMo2122a = 0;
            } else {
                if ((iMo2125b * 2) + i > bArr.length) {
                    m2406c();
                    throw new C0803ac("output buffer too short");
                }
                iMo2122a = this.f3989d.mo2122a(this.f3986a, 0, bArr, i);
                this.f3987b = 0;
            }
            this.f4370g.mo2556a(this.f3986a, this.f3987b);
            return iMo2122a + this.f3989d.mo2122a(this.f3986a, 0, bArr, i + iMo2122a);
        }
        if (this.f3987b != iMo2125b) {
            m2406c();
            throw new C1163o("last block incomplete in decryption");
        }
        int iMo2122a2 = this.f3989d.mo2122a(this.f3986a, 0, this.f3986a, 0);
        this.f3987b = 0;
        try {
            int iMo2555a = iMo2122a2 - this.f4370g.mo2555a(this.f3986a);
            System.arraycopy(this.f3986a, 0, bArr, i, iMo2555a);
            return iMo2555a;
        } finally {
            m2406c();
        }
    }

    @Override // org.bouncycastle.p083b.C0950f
    /* JADX INFO: renamed from: a */
    public final int mo2401a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int iMo2122a;
        int i4;
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int iB = m2404b();
        int iMo2399a = mo2399a(i2);
        if (iMo2399a > 0 && iMo2399a + i3 > bArr2.length) {
            throw new C0803ac("output buffer too short");
        }
        int length = this.f3986a.length - this.f3987b;
        if (i2 > length) {
            System.arraycopy(bArr, i, this.f3986a, this.f3987b, length);
            iMo2122a = this.f3989d.mo2122a(this.f3986a, 0, bArr2, i3) + 0;
            this.f3987b = 0;
            int i5 = i2 - length;
            i4 = length + i;
            while (i5 > this.f3986a.length) {
                iMo2122a += this.f3989d.mo2122a(bArr, i4, bArr2, i3 + iMo2122a);
                i5 -= iB;
                i4 += iB;
            }
            i2 = i5;
        } else {
            iMo2122a = 0;
            i4 = i;
        }
        System.arraycopy(bArr, i4, this.f3986a, this.f3987b, i2);
        this.f3987b += i2;
        return iMo2122a;
    }

    @Override // org.bouncycastle.p083b.C0950f
    /* JADX INFO: renamed from: a */
    public final void mo2403a(boolean z, InterfaceC1003i interfaceC1003i) {
        this.f3988c = z;
        m2406c();
        if (!(interfaceC1003i instanceof C1081bf)) {
            this.f4370g.mo2557a((SecureRandom) null);
            this.f3989d.mo2124a(z, interfaceC1003i);
        } else {
            C1081bf c1081bf = (C1081bf) interfaceC1003i;
            this.f4370g.mo2557a(c1081bf.m2613a());
            this.f3989d.mo2124a(z, c1081bf.m2614b());
        }
    }

    @Override // org.bouncycastle.p083b.C0950f
    /* JADX INFO: renamed from: b */
    public final int mo2405b(int i) {
        int i2 = this.f3987b + i;
        int length = i2 % this.f3986a.length;
        return length == 0 ? this.f3988c ? i2 + this.f3986a.length : i2 : (i2 - length) + this.f3986a.length;
    }
}
