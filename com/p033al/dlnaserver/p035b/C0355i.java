package com.p033al.dlnaserver.p035b;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: renamed from: com.al.dlnaserver.b.i */
/* JADX INFO: compiled from: MapUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0355i {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static <K, V extends Comparable<? super V>> Map<K, V> m1034a(Map<K, V> map) {
        LinkedList<Map.Entry> linkedList = new LinkedList(map.entrySet());
        Collections.sort(linkedList, new C0356j());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : linkedList) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), (Comparable) entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
