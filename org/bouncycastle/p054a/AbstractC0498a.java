package org.bouncycastle.p054a;

import java.io.IOException;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0498a extends AbstractC0686u {

    /* JADX INFO: renamed from: a */
    protected final boolean f1869a;

    /* JADX INFO: renamed from: b */
    protected final int f1870b;

    /* JADX INFO: renamed from: c */
    protected final byte[] f1871c;

    AbstractC0498a(boolean z, int i, byte[] bArr) {
        this.f1869a = z;
        this.f1870b = i;
        this.f1871c = C1535a.m4086b(bArr);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    void mo1335a(C0660s c0660s) throws IOException {
        c0660s.m1604a(this.f1869a ? 96 : 64, this.f1870b, this.f1871c);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    public final boolean mo1336a() {
        return this.f1869a;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1337a(AbstractC0686u abstractC0686u) {
        if (!(abstractC0686u instanceof AbstractC0498a)) {
            return false;
        }
        AbstractC0498a abstractC0498a = (AbstractC0498a) abstractC0686u;
        return this.f1869a == abstractC0498a.f1869a && this.f1870b == abstractC0498a.f1870b && C1535a.m4076a(this.f1871c, abstractC0498a.f1871c);
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m1338b() {
        return C1535a.m4086b(this.f1871c);
    }

    /* JADX INFO: renamed from: c */
    public final int m1339c() {
        return this.f1870b;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: e */
    final int mo1341e() {
        return C0612ch.m1490b(this.f1870b) + C0612ch.m1488a(this.f1871c.length) + this.f1871c.length;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u, org.bouncycastle.p054a.AbstractC0650o
    public int hashCode() {
        return ((this.f1869a ? 1 : 0) ^ this.f1870b) ^ C1535a.m4066a(this.f1871c);
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC0686u m1340d() throws IOException {
        int i;
        byte[] bArrK = mo1578k();
        if ((bArrK[0] & 31) == 31) {
            i = 2;
            int i2 = bArrK[1] & 255;
            if ((i2 & 127) == 0) {
                throw new IOException("corrupted stream - invalid high tag number found");
            }
            int i3 = i2;
            while ((i3 & 128) != 0) {
                i3 = bArrK[i] & 255;
                i++;
            }
        } else {
            i = 1;
        }
        byte[] bArr = new byte[(bArrK.length - i) + 1];
        System.arraycopy(bArrK, i, bArr, 1, bArr.length - 1);
        bArr[0] = 16;
        if ((bArrK[0] & 32) != 0) {
            bArr[0] = (byte) (bArr[0] | 32);
        }
        return AbstractC0686u.m1692b(bArr);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (this.f1869a) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("APPLICATION ");
        stringBuffer.append(Integer.toString(this.f1870b));
        stringBuffer.append("]");
        if (this.f1871c != null) {
            stringBuffer.append(" #");
            stringBuffer.append(C1541f.m4105a(this.f1871c));
        } else {
            stringBuffer.append(" #null");
        }
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }
}
