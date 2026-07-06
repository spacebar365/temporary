package org.cybergarage.e;

import java.util.Vector;

/* JADX INFO: compiled from: ListenerList.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Vector {
    @Override // java.util.Vector, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        if (indexOf(obj) >= 0) {
            return false;
        }
        return super.add(obj);
    }
}
