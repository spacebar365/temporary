package org.bouncycastle.d.b;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
final class e implements g {
    protected final b a;
    protected final f b;

    e(b bVar, f fVar) {
        this.a = bVar;
        this.b = fVar;
    }

    @Override // org.bouncycastle.d.b.b
    public final BigInteger a() {
        return this.a.a();
    }

    @Override // org.bouncycastle.d.b.b
    public final int b() {
        return this.a.b() * this.b.a();
    }

    @Override // org.bouncycastle.d.b.g
    public final f c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a.equals(eVar.a) && this.b.equals(eVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ Integer.rotateLeft(this.b.hashCode(), 16);
    }
}
