package org.p044b.p045a.p046a.p047a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.p044b.p045a.p046a.p049c.C0483c;

/* JADX INFO: renamed from: org.b.a.a.a.c */
/* JADX INFO: compiled from: CookieHandler.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0477c implements Iterable<String> {

    /* JADX INFO: renamed from: a */
    private final HashMap<String, String> f1758a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    private final ArrayList<C0476b> f1759b = new ArrayList<>();

    public C0477c(Map<String, String> map) {
        String str = map.get("cookie");
        if (str != null) {
            String[] strArrSplit = str.split(";");
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.trim().split("=");
                if (strArrSplit2.length == 2) {
                    this.f1758a.put(strArrSplit2[0], strArrSplit2[1]);
                }
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return this.f1758a.keySet().iterator();
    }

    /* JADX INFO: renamed from: a */
    public final void m1287a(C0483c c0483c) {
        Iterator<C0476b> it = this.f1759b.iterator();
        while (it.hasNext()) {
            c0483c.m1311a(it.next().m1286a());
        }
    }
}
