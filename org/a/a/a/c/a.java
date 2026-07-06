package org.a.a.a.c;

import java.io.Serializable;
import java.util.EventListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: ListenerList.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Serializable, Iterable<EventListener> {
    private final CopyOnWriteArrayList<EventListener> a = new CopyOnWriteArrayList<>();

    public final int a() {
        return this.a.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<EventListener> iterator() {
        return this.a.iterator();
    }
}
