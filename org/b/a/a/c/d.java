package org.b.a.a.c;

import java.util.HashMap;

/* JADX INFO: compiled from: Response.java */
/* JADX INFO: loaded from: classes.dex */
final class d extends HashMap<String, String> {
    final /* synthetic */ c a;

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        c.a(this.a).put(str == null ? str : str.toLowerCase(), str2);
        return (String) super.put(str, str2);
    }

    d(c cVar) {
        this.a = cVar;
    }
}
