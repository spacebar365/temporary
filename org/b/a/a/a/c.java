package org.b.a.a.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: CookieHandler.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Iterable<String> {
    private final HashMap<String, String> a = new HashMap<>();
    private final ArrayList<b> b = new ArrayList<>();

    public c(Map<String, String> map) {
        String str = map.get("cookie");
        if (str != null) {
            String[] strArrSplit = str.split(";");
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.trim().split("=");
                if (strArrSplit2.length == 2) {
                    this.a.put(strArrSplit2[0], strArrSplit2[1]);
                }
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return this.a.keySet().iterator();
    }

    public final void a(org.b.a.a.c.c cVar) {
        Iterator<b> it = this.b.iterator();
        while (it.hasNext()) {
            cVar.a(it.next().a());
        }
    }
}
