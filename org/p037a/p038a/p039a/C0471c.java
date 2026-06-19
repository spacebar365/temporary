package org.p037a.p038a.p039a;

import java.io.Serializable;
import java.util.EventListener;
import java.util.Iterator;
import org.p037a.p038a.p039a.p043c.C0472a;

/* JADX INFO: renamed from: org.a.a.a.c */
/* JADX INFO: compiled from: ProtocolCommandSupport.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0471c implements Serializable {

    /* JADX INFO: renamed from: a */
    private final Object f1727a;

    /* JADX INFO: renamed from: b */
    private final C0472a f1728b = new C0472a();

    public C0471c(Object obj) {
        this.f1727a = obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m1269a(String str, String str2) {
        new C0466b(this.f1727a, str, str2);
        Iterator<EventListener> it = this.f1728b.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1268a(int i, String str) {
        new C0466b(this.f1727a, i, str);
        Iterator<EventListener> it = this.f1728b.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m1267a() {
        return this.f1728b.m1270a();
    }
}
