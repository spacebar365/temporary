package com.al.dlnaserver.b;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map$Entry;

/* JADX INFO: compiled from: MapUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V extends Comparable<? super V>> Map<K, V> a(Map<K, V> map) {
        LinkedList<Map$Entry> linkedList = new LinkedList(map.entrySet());
        Collections.sort(linkedList, new j());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map$Entry map$Entry : linkedList) {
            if (map$Entry.getValue() != null) {
                linkedHashMap.put(map$Entry.getKey(), (Comparable) map$Entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
