package org.a.a.a;

import java.io.Serializable;
import java.util.EventListener;
import java.util.Iterator;

/* JADX INFO: compiled from: ProtocolCommandSupport.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Serializable {
    private final Object a;
    private final org.a.a.a.c.a b = new org.a.a.a.c.a();

    public c(Object obj) {
        this.a = obj;
    }

    public final void a(String str, String str2) {
        new b(this.a, str, str2);
        Iterator<EventListener> it = this.b.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(int i, String str) {
        new b(this.a, i, str);
        Iterator<EventListener> it = this.b.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final int a() {
        return this.b.a();
    }
}
