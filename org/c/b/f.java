package org.c.b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: SubstituteLoggerFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class f implements org.c.a {
    boolean a = false;
    final Map<String, e> b = new HashMap();
    final LinkedBlockingQueue<org.c.a.d> c = new LinkedBlockingQueue<>();

    @Override // org.c.a
    public final synchronized org.c.b a(String str) {
        e eVar;
        eVar = this.b.get(str);
        if (eVar == null) {
            eVar = new e(str, this.c, this.a);
            this.b.put(str, eVar);
        }
        return eVar;
    }

    public final List<e> a() {
        return new ArrayList(this.b.values());
    }

    public final LinkedBlockingQueue<org.c.a.d> b() {
        return this.c;
    }

    public final void c() {
        this.a = true;
    }

    public final void d() {
        this.b.clear();
        this.c.clear();
    }
}
