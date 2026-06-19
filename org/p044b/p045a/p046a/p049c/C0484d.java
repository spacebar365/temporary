package org.p044b.p045a.p046a.p049c;

import java.util.HashMap;

/* JADX INFO: renamed from: org.b.a.a.c.d */
/* JADX INFO: compiled from: Response.java */
/* JADX INFO: loaded from: classes.dex */
final class C0484d extends HashMap<String, String> {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0483c f1810a;

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        this.f1810a.f1800f.put(str == null ? str : str.toLowerCase(), str2);
        return (String) super.put(str, str2);
    }

    C0484d(C0483c c0483c) {
        this.f1810a = c0483c;
    }
}
