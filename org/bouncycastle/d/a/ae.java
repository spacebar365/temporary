package org.bouncycastle.d.a;

/* JADX INFO: loaded from: classes.dex */
final class ae implements s {
    final /* synthetic */ j$a a;
    final /* synthetic */ byte b;

    ae(j$a j_a, byte b) {
        this.a = j_a;
        this.b = b;
    }

    @Override // org.bouncycastle.d.a.s
    public final t a(t tVar) {
        if (tVar instanceof af) {
            return tVar;
        }
        af afVar = new af();
        afVar.a(w.a(this.a, this.b));
        return afVar;
    }
}
