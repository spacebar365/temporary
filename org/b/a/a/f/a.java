package org.b.a.a.f;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: DefaultAsyncRunner.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b {
    protected long a;
    private final List<org.b.a.a.a> b = Collections.synchronizedList(new ArrayList());

    @Override // org.b.a.a.f.b
    public final void a() {
        Iterator it = new ArrayList(this.b).iterator();
        while (it.hasNext()) {
            ((org.b.a.a.a) it.next()).a();
        }
    }

    @Override // org.b.a.a.f.b
    public final void a(org.b.a.a.a aVar) {
        this.b.remove(aVar);
    }

    @Override // org.b.a.a.f.b
    public final void b(org.b.a.a.a aVar) {
        this.a++;
        this.b.add(aVar);
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.a + ")");
        thread.start();
    }
}
