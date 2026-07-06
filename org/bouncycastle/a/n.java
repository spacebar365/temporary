package org.bouncycastle.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends u {
    n() {
    }

    @Override // org.bouncycastle.a.u
    abstract void a(s sVar);

    @Override // org.bouncycastle.a.u
    final boolean a(u uVar) {
        return uVar instanceof n;
    }

    @Override // org.bouncycastle.a.u, org.bouncycastle.a.o
    public int hashCode() {
        return -1;
    }

    public String toString() {
        return "NULL";
    }
}
