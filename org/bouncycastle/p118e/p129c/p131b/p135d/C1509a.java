package org.bouncycastle.p118e.p129c.p131b.p135d;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;
import org.bouncycastle.p054a.C0579bc;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p118e.p119a.C1432f;
import org.bouncycastle.p118e.p119a.InterfaceC1431e;
import org.bouncycastle.p118e.p120b.p124d.C1453a;
import org.bouncycastle.p118e.p120b.p124d.p125a.C1454a;
import org.bouncycastle.p118e.p129c.p139c.C1522a;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.e.c.b.d.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1509a implements PrivateKey {

    /* JADX INFO: renamed from: a */
    private short[][] f5425a;

    /* JADX INFO: renamed from: b */
    private short[] f5426b;

    /* JADX INFO: renamed from: c */
    private short[][] f5427c;

    /* JADX INFO: renamed from: d */
    private short[] f5428d;

    /* JADX INFO: renamed from: e */
    private C1453a[] f5429e;

    /* JADX INFO: renamed from: f */
    private int[] f5430f;

    public C1509a(C1522a c1522a) {
        this(c1522a.m4014b(), c1522a.m4013a(), c1522a.m4016d(), c1522a.m4015c(), c1522a.m4018f(), c1522a.m4017e());
    }

    public C1509a(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, C1453a[] c1453aArr) {
        this.f5425a = sArr;
        this.f5426b = sArr2;
        this.f5427c = sArr3;
        this.f5428d = sArr4;
        this.f5430f = iArr;
        this.f5429e = c1453aArr;
    }

    /* JADX INFO: renamed from: a */
    public final short[][] m4001a() {
        return this.f5425a;
    }

    /* JADX INFO: renamed from: b */
    public final short[] m4002b() {
        return this.f5426b;
    }

    /* JADX INFO: renamed from: c */
    public final short[] m4003c() {
        return this.f5428d;
    }

    /* JADX INFO: renamed from: d */
    public final short[][] m4004d() {
        return this.f5427c;
    }

    /* JADX INFO: renamed from: e */
    public final C1453a[] m4005e() {
        return this.f5429e;
    }

    /* JADX INFO: renamed from: f */
    public final int[] m4006f() {
        return this.f5430f;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            try {
                return new C0676p(new C0759a(InterfaceC1431e.f5168a, C0579bc.f2112a), new C1432f(this.f5425a, this.f5426b, this.f5427c, this.f5428d, this.f5430f, this.f5429e)).mo1578k();
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
        int iM4082b = C1535a.m4082b(this.f5430f) + (((((((((this.f5429e.length * 37) + C1535a.m4069a(this.f5425a)) * 37) + C1535a.m4083b(this.f5426b)) * 37) + C1535a.m4069a(this.f5427c)) * 37) + C1535a.m4083b(this.f5428d)) * 37);
        for (int length = this.f5429e.length - 1; length >= 0; length--) {
            iM4082b = (iM4082b * 37) + this.f5429e[length].hashCode();
        }
        return iM4082b;
    }

    public final boolean equals(Object obj) {
        boolean zEquals = false;
        if (obj != null && (obj instanceof C1509a)) {
            C1509a c1509a = (C1509a) obj;
            boolean z = ((((C1454a.m3804a(this.f5425a, c1509a.f5425a)) && C1454a.m3804a(this.f5427c, c1509a.f5427c)) && C1454a.m3803a(this.f5426b, c1509a.f5426b)) && C1454a.m3803a(this.f5428d, c1509a.f5428d)) && Arrays.equals(this.f5430f, c1509a.f5430f);
            if (this.f5429e.length == c1509a.f5429e.length) {
                zEquals = z;
                for (int length = this.f5429e.length - 1; length >= 0; length--) {
                    zEquals &= this.f5429e[length].equals(c1509a.f5429e[length]);
                }
            }
        }
        return zEquals;
    }
}
