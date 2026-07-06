package org.bouncycastle.b.a.a;

import java.io.IOException;
import org.bouncycastle.a.be;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.bn;
import org.bouncycastle.a.g;
import org.bouncycastle.b.ac;
import org.bouncycastle.b.p;
import org.bouncycastle.b.q;
import org.bouncycastle.b.r;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p {
    private final r a;
    private org.bouncycastle.a.p b;
    private int c;
    private byte[] d;
    private byte[] e;

    public c(r rVar) {
        this.a = rVar;
    }

    @Override // org.bouncycastle.b.p
    public final int a(byte[] bArr, int i, int i2) {
        if (bArr.length - i2 < 0) {
            throw new ac("output buffer too small");
        }
        long j = i2;
        int iB = this.a.b();
        if (j > 8589934591L) {
            throw new IllegalArgumentException("Output length too large");
        }
        int i3 = (int) (((((long) iB) + j) - 1) / ((long) iB));
        byte[] bArr2 = new byte[this.a.b()];
        int i4 = 1;
        int i5 = i2;
        int i6 = i;
        for (int i7 = 0; i7 < i3; i7++) {
            this.a.a(this.d, 0, this.d.length);
            g gVar = new g();
            g gVar2 = new g();
            gVar2.a(this.b);
            gVar2.a(new be(org.bouncycastle.f.g.a(i4)));
            gVar.a(new bi(gVar2));
            if (this.e != null) {
                gVar.a(new bn(true, 0, new be(this.e)));
            }
            gVar.a(new bn(true, 2, new be(org.bouncycastle.f.g.a(this.c))));
            try {
                byte[] bArrA = new bi(gVar).a("DER");
                this.a.a(bArrA, 0, bArrA.length);
                this.a.a(bArr2, 0);
                if (i5 > iB) {
                    System.arraycopy(bArr2, 0, bArr, i6, iB);
                    i6 += iB;
                    i5 -= iB;
                } else {
                    System.arraycopy(bArr2, 0, bArr, i6, i5);
                }
                i4++;
            } catch (IOException e) {
                throw new IllegalArgumentException("unable to encode parameter info: " + e.getMessage());
            }
        }
        this.a.c();
        return (int) j;
    }

    @Override // org.bouncycastle.b.p
    public final void a(q qVar) {
        b bVar = (b) qVar;
        this.b = bVar.a();
        this.c = bVar.b();
        this.d = bVar.c();
        this.e = bVar.d();
    }
}
