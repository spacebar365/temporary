package org.bouncycastle.e.b.d;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private int a;
    private int b;
    private int c;
    private short[][][] d;
    private short[][][] e;
    private short[][] f;
    private short[] g;

    public a(byte b, byte b2, short[][][] sArr, short[][][] sArr2, short[][] sArr3, short[] sArr4) {
        this.a = b & 255;
        this.b = b2 & 255;
        this.c = this.b - this.a;
        this.d = sArr;
        this.e = sArr2;
        this.f = sArr3;
        this.g = sArr4;
    }

    public final short[][][] a() {
        return this.d;
    }

    public final short[][][] b() {
        return this.e;
    }

    public final short[][] c() {
        return this.f;
    }

    public final short[] d() {
        return this.g;
    }

    public final int hashCode() {
        return (((((((((((this.a * 37) + this.b) * 37) + this.c) * 37) + org.bouncycastle.f.a.a(this.d)) * 37) + org.bouncycastle.f.a.a(this.e)) * 37) + org.bouncycastle.f.a.a(this.f)) * 37) + org.bouncycastle.f.a.b(this.g);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && org.bouncycastle.e.b.d.a.a.a(this.d, aVar.d) && org.bouncycastle.e.b.d.a.a.a(this.e, aVar.e) && org.bouncycastle.e.b.d.a.a.a(this.f, aVar.f) && org.bouncycastle.e.b.d.a.a.a(this.g, aVar.g);
    }
}
