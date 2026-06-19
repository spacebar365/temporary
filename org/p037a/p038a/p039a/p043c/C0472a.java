package org.p037a.p038a.p039a.p043c;

import java.io.Serializable;
import java.util.EventListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: org.a.a.a.c.a */
/* JADX INFO: compiled from: ListenerList.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0472a implements Serializable, Iterable<EventListener> {

    /* JADX INFO: renamed from: a */
    private final CopyOnWriteArrayList<EventListener> f1729a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: a */
    public final int m1270a() {
        return this.f1729a.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<EventListener> iterator() {
        return this.f1729a.iterator();
    }
}
