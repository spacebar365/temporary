package org.bouncycastle.e.c.b.d;

import java.security.PublicKey;
import org.bouncycastle.a.bc;
import org.bouncycastle.e.a.e;
import org.bouncycastle.e.a.g;

/* JADX INFO: loaded from: classes.dex */
public final class b implements PublicKey {
    private short[][] a;
    private short[][] b;
    private short[] c;
    private int d;

    public b(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.d = i;
        this.a = sArr;
        this.b = sArr2;
        this.c = sArr3;
    }

    public b(org.bouncycastle.e.c.c.b bVar) {
        this(bVar.a(), bVar.b(), bVar.c(), bVar.d());
    }

    public final int a() {
        return this.d;
    }

    public final short[][] b() {
        return this.a;
    }

    public final short[][] c() {
        short[][] sArr = new short[this.b.length][];
        for (int i = 0; i != this.b.length; i++) {
            sArr[i] = org.bouncycastle.f.a.c(this.b[i]);
        }
        return sArr;
    }

    public final short[] d() {
        return org.bouncycastle.f.a.c(this.c);
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return org.bouncycastle.e.c.b.f.a.a(new org.bouncycastle.a.z.a(e.a, bc.a), new g(this.d, this.a, this.b, this.c));
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return (((((this.d * 37) + org.bouncycastle.f.a.a(this.a)) * 37) + org.bouncycastle.f.a.a(this.b)) * 37) + org.bouncycastle.f.a.b(this.c);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.d == bVar.d && org.bouncycastle.e.b.d.a.a.a(this.a, bVar.a) && org.bouncycastle.e.b.d.a.a.a(this.b, bVar.c()) && org.bouncycastle.e.b.d.a.a.a(this.c, org.bouncycastle.f.a.c(bVar.c));
    }
}
