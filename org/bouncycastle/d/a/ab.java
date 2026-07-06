package org.bouncycastle.d.a;

/* JADX INFO: loaded from: classes.dex */
final class ab implements s {
    final /* synthetic */ z a;
    final /* synthetic */ l b;
    final /* synthetic */ boolean c = true;

    ab(z zVar, l lVar) {
        this.a = zVar;
        this.b = lVar;
    }

    @Override // org.bouncycastle.d.a.s
    public final t a(t tVar) {
        z zVar = new z();
        j jVarC = this.a.c();
        if (jVarC != null) {
            zVar.a(this.b.a(jVarC));
        }
        j[] jVarArrA = this.a.a();
        j[] jVarArr = new j[jVarArrA.length];
        for (int i = 0; i < jVarArrA.length; i++) {
            jVarArr[i] = this.b.a(jVarArrA[i]);
        }
        zVar.a(jVarArr);
        if (this.c) {
            j[] jVarArr2 = new j[jVarArr.length];
            for (int i2 = 0; i2 < jVarArr2.length; i2++) {
                jVarArr2[i2] = jVarArr[i2].s();
            }
            zVar.b(jVarArr2);
        }
        return zVar;
    }
}
