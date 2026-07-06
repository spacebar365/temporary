package org.bouncycastle.e.c.b.d;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;
import org.bouncycastle.a.bc;
import org.bouncycastle.a.s.p;
import org.bouncycastle.e.a.e;
import org.bouncycastle.e.a.f;

/* JADX INFO: loaded from: classes.dex */
public final class a implements PrivateKey {
    private short[][] a;
    private short[] b;
    private short[][] c;
    private short[] d;
    private org.bouncycastle.e.b.d.a[] e;
    private int[] f;

    public a(org.bouncycastle.e.c.c.a aVar) {
        this(aVar.b(), aVar.a(), aVar.d(), aVar.c(), aVar.f(), aVar.e());
    }

    public a(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, org.bouncycastle.e.b.d.a[] aVarArr) {
        this.a = sArr;
        this.b = sArr2;
        this.c = sArr3;
        this.d = sArr4;
        this.f = iArr;
        this.e = aVarArr;
    }

    public final short[][] a() {
        return this.a;
    }

    public final short[] b() {
        return this.b;
    }

    public final short[] c() {
        return this.d;
    }

    public final short[][] d() {
        return this.c;
    }

    public final org.bouncycastle.e.b.d.a[] e() {
        return this.e;
    }

    public final int[] f() {
        return this.f;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            try {
                return new p(new org.bouncycastle.a.z.a(e.a, bc.a), new f(this.a, this.b, this.c, this.d, this.f, this.e)).k();
            } catch (IOException e) {
                return null;
            }
        } catch (IOException e2) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        int iB = org.bouncycastle.f.a.b(this.f) + (((((((((this.e.length * 37) + org.bouncycastle.f.a.a(this.a)) * 37) + org.bouncycastle.f.a.b(this.b)) * 37) + org.bouncycastle.f.a.a(this.c)) * 37) + org.bouncycastle.f.a.b(this.d)) * 37);
        for (int length = this.e.length - 1; length >= 0; length--) {
            iB = (iB * 37) + this.e[length].hashCode();
        }
        return iB;
    }

    public final boolean equals(Object obj) {
        boolean zEquals = false;
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            boolean z = ((((org.bouncycastle.e.b.d.a.a.a(this.a, aVar.a)) && org.bouncycastle.e.b.d.a.a.a(this.c, aVar.c)) && org.bouncycastle.e.b.d.a.a.a(this.b, aVar.b)) && org.bouncycastle.e.b.d.a.a.a(this.d, aVar.d)) && Arrays.equals(this.f, aVar.f);
            if (this.e.length == aVar.e.length) {
                zEquals = z;
                for (int length = this.e.length - 1; length >= 0; length--) {
                    zEquals &= this.e[length].equals(aVar.e[length]);
                }
            }
        }
        return zEquals;
    }
}
