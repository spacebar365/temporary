package com.al.dlnaserver.b;

import java.util.Comparator;
import java.util.Map$Entry;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: compiled from: MapUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class j<K, V> implements Comparator<Map$Entry<K, V>> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Map$Entry map$Entry = (Map$Entry) obj;
        Map$Entry map$Entry2 = (Map$Entry) obj2;
        if (map$Entry.getValue() == null && map$Entry2.getValue() != null) {
            return 1;
        }
        if (map$Entry.getValue() != null && map$Entry2.getValue() == null) {
            return -1;
        }
        if (map$Entry.getValue() == null && map$Entry2.getValue() == null) {
            return 0;
        }
        return ((Comparable) map$Entry.getValue()).compareTo(map$Entry2.getValue());
    }

    j() {
    }
}
