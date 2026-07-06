package org.bouncycastle.a;

import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    private final Vector a = new Vector();

    public final int a() {
        return this.a.size();
    }

    public final f a(int i) {
        return (f) this.a.elementAt(i);
    }

    public final void a(f fVar) {
        this.a.addElement(fVar);
    }
}
