package org.p044b.p045a.p046a.p052f;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.p044b.p045a.p046a.RunnableC0474a;

/* JADX INFO: renamed from: org.b.a.a.f.a */
/* JADX INFO: compiled from: DefaultAsyncRunner.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0493a implements InterfaceC0494b {

    /* JADX INFO: renamed from: a */
    protected long f1867a;

    /* JADX INFO: renamed from: b */
    private final List<RunnableC0474a> f1868b = Collections.synchronizedList(new ArrayList());

    @Override // org.p044b.p045a.p046a.p052f.InterfaceC0494b
    /* JADX INFO: renamed from: a */
    public final void mo1332a() {
        Iterator it = new ArrayList(this.f1868b).iterator();
        while (it.hasNext()) {
            ((RunnableC0474a) it.next()).m1281a();
        }
    }

    @Override // org.p044b.p045a.p046a.p052f.InterfaceC0494b
    /* JADX INFO: renamed from: a */
    public final void mo1333a(RunnableC0474a runnableC0474a) {
        this.f1868b.remove(runnableC0474a);
    }

    @Override // org.p044b.p045a.p046a.p052f.InterfaceC0494b
    /* JADX INFO: renamed from: b */
    public final void mo1334b(RunnableC0474a runnableC0474a) {
        this.f1867a++;
        this.f1868b.add(runnableC0474a);
        Thread thread = new Thread(runnableC0474a);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f1867a + ")");
        thread.start();
    }
}
