package org.bouncycastle.p118e.p120b.p124d;

import org.bouncycastle.p118e.p120b.p124d.p125a.C1454a;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.e.b.d.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1453a {

    /* JADX INFO: renamed from: a */
    private int f5265a;

    /* JADX INFO: renamed from: b */
    private int f5266b;

    /* JADX INFO: renamed from: c */
    private int f5267c;

    /* JADX INFO: renamed from: d */
    private short[][][] f5268d;

    /* JADX INFO: renamed from: e */
    private short[][][] f5269e;

    /* JADX INFO: renamed from: f */
    private short[][] f5270f;

    /* JADX INFO: renamed from: g */
    private short[] f5271g;

    public C1453a(byte b, byte b2, short[][][] sArr, short[][][] sArr2, short[][] sArr3, short[] sArr4) {
        this.f5265a = b & 255;
        this.f5266b = b2 & 255;
        this.f5267c = this.f5266b - this.f5265a;
        this.f5268d = sArr;
        this.f5269e = sArr2;
        this.f5270f = sArr3;
        this.f5271g = sArr4;
    }

    /* JADX INFO: renamed from: a */
    public final short[][][] m3799a() {
        return this.f5268d;
    }

    /* JADX INFO: renamed from: b */
    public final short[][][] m3800b() {
        return this.f5269e;
    }

    /* JADX INFO: renamed from: c */
    public final short[][] m3801c() {
        return this.f5270f;
    }

    /* JADX INFO: renamed from: d */
    public final short[] m3802d() {
        return this.f5271g;
    }

    public final int hashCode() {
        return (((((((((((this.f5265a * 37) + this.f5266b) * 37) + this.f5267c) * 37) + C1535a.m4070a(this.f5268d)) * 37) + C1535a.m4070a(this.f5269e)) * 37) + C1535a.m4069a(this.f5270f)) * 37) + C1535a.m4083b(this.f5271g);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1453a)) {
            return false;
        }
        C1453a c1453a = (C1453a) obj;
        return this.f5265a == c1453a.f5265a && this.f5266b == c1453a.f5266b && this.f5267c == c1453a.f5267c && C1454a.m3805a(this.f5268d, c1453a.f5268d) && C1454a.m3805a(this.f5269e, c1453a.f5269e) && C1454a.m3804a(this.f5270f, c1453a.f5270f) && C1454a.m3803a(this.f5271g, c1453a.f5271g);
    }
}
