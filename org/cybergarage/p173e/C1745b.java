package org.cybergarage.p173e;

import java.util.Vector;

/* JADX INFO: renamed from: org.cybergarage.e.b */
/* JADX INFO: compiled from: ListenerList.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1745b extends Vector {
    @Override // java.util.Vector, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        if (indexOf(obj) >= 0) {
            return false;
        }
        return super.add(obj);
    }
}
