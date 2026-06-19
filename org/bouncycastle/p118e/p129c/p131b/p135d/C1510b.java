package org.bouncycastle.p118e.p129c.p131b.p135d;

import java.security.PublicKey;
import org.bouncycastle.p054a.C0579bc;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p118e.p119a.C1433g;
import org.bouncycastle.p118e.p119a.InterfaceC1431e;
import org.bouncycastle.p118e.p120b.p124d.p125a.C1454a;
import org.bouncycastle.p118e.p129c.p131b.p137f.C1515a;
import org.bouncycastle.p118e.p129c.p139c.C1523b;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.e.c.b.d.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1510b implements PublicKey {

    /* JADX INFO: renamed from: a */
    private short[][] f5431a;

    /* JADX INFO: renamed from: b */
    private short[][] f5432b;

    /* JADX INFO: renamed from: c */
    private short[] f5433c;

    /* JADX INFO: renamed from: d */
    private int f5434d;

    public C1510b(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f5434d = i;
        this.f5431a = sArr;
        this.f5432b = sArr2;
        this.f5433c = sArr3;
    }

    public C1510b(C1523b c1523b) {
        this(c1523b.m4019a(), c1523b.m4020b(), c1523b.m4021c(), c1523b.m4022d());
    }

    /* JADX INFO: renamed from: a */
    public final int m4007a() {
        return this.f5434d;
    }

    /* JADX INFO: renamed from: b */
    public final short[][] m4008b() {
        return this.f5431a;
    }

    /* JADX INFO: renamed from: c */
    public final short[][] m4009c() {
        short[][] sArr = new short[this.f5432b.length][];
        for (int i = 0; i != this.f5432b.length; i++) {
            sArr[i] = C1535a.m4093c(this.f5432b[i]);
        }
        return sArr;
    }

    /* JADX INFO: renamed from: d */
    public final short[] m4010d() {
        return C1535a.m4093c(this.f5433c);
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return C1515a.m4011a(new C0759a(InterfaceC1431e.f5168a, C0579bc.f2112a), new C1433g(this.f5434d, this.f5431a, this.f5432b, this.f5433c));
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return (((((this.f5434d * 37) + C1535a.m4069a(this.f5431a)) * 37) + C1535a.m4069a(this.f5432b)) * 37) + C1535a.m4083b(this.f5433c);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1510b)) {
            return false;
        }
        C1510b c1510b = (C1510b) obj;
        return this.f5434d == c1510b.f5434d && C1454a.m3804a(this.f5431a, c1510b.f5431a) && C1454a.m3804a(this.f5432b, c1510b.m4009c()) && C1454a.m3803a(this.f5433c, C1535a.m4093c(c1510b.f5433c));
    }
}
