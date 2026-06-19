package com.p033al.dlnaserver.p035b;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: com.al.dlnaserver.b.j */
/* JADX INFO: compiled from: MapUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class C0356j<K, V> implements Comparator<Map.Entry<K, V>> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = (Map.Entry) obj2;
        if (entry.getValue() == null && entry2.getValue() != null) {
            return 1;
        }
        if (entry.getValue() != null && entry2.getValue() == null) {
            return -1;
        }
        if (entry.getValue() == null && entry2.getValue() == null) {
            return 0;
        }
        return ((Comparable) entry.getValue()).compareTo(entry2.getValue());
    }

    C0356j() {
    }
}
