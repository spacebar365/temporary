package org.bouncycastle.b.k;

/* JADX INFO: loaded from: classes.dex */
public class am extends b {
    private an b;

    protected am(boolean z, an anVar) {
        super(z);
        this.b = anVar;
    }

    public final an b() {
        return this.b;
    }

    public int hashCode() {
        if (this.b != null) {
            return this.b.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof am)) {
            return false;
        }
        am amVar = (am) obj;
        return this.b == null ? amVar.b == null : this.b.equals(amVar.b);
    }
}
