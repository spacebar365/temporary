package org.bouncycastle.a.b;

import org.bouncycastle.a.ab;
import org.bouncycastle.a.bn;
import org.bouncycastle.a.o;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class i extends o implements org.bouncycastle.a.e {
    private final int a;
    private final o b;

    public i(j jVar) {
        this((org.bouncycastle.a.f) jVar);
    }

    public i(l lVar) {
        this(new bn(lVar));
    }

    private i(org.bouncycastle.a.f fVar) {
        if ((fVar instanceof v) || (fVar instanceof j)) {
            this.a = 0;
            this.b = j.a(fVar);
        } else {
            if (!(fVar instanceof ab)) {
                throw new IllegalArgumentException("Unknown check object in integrity check.");
            }
            this.a = 1;
            this.b = l.a(((ab) fVar).j());
        }
    }

    public static i a(Object obj) {
        if (obj instanceof i) {
            return (i) obj;
        }
        if (obj != null) {
            return new i((org.bouncycastle.a.f) obj);
        }
        return null;
    }

    public final int a() {
        return this.a;
    }

    public final o b() {
        return this.b;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        return this.b instanceof l ? new bn(this.b) : this.b.i();
    }
}
