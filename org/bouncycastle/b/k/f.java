package org.bouncycastle.b.k;

/* JADX INFO: loaded from: classes.dex */
public class f extends b {
    private i b;

    protected f(boolean z, i iVar) {
        super(z);
        this.b = iVar;
    }

    public final i b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.b == null ? fVar.b == null : this.b.equals(fVar.b);
    }

    public int hashCode() {
        int i = this.a ? 0 : 1;
        return this.b != null ? i ^ this.b.hashCode() : i;
    }
}
