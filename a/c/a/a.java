package a.c.a;

import a.c.l$a;
import a.g.ad;

/* JADX INFO: compiled from: LsaPolicyHandle.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends l$a implements AutoCloseable {
    private final a.c.f c;
    private boolean d;

    public a(a.c.f fVar, String str) throws a.c.e, ad {
        this.c = fVar;
        f fVar2 = new f(str == null ? "\\\\" : str, this);
        fVar.a(fVar2);
        if (fVar2.h != 0) {
            throw new ad(fVar2.h, false);
        }
        this.d = true;
    }

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.d) {
            this.d = false;
            e eVar = new e(this);
            this.c.a(eVar);
            if (eVar.h != 0) {
                throw new ad(eVar.h, false);
            }
        }
    }
}
