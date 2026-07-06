package com.al.dlnaserver.c;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.a.a.a.a.g;
import org.a.a.a.a.k;

/* JADX INFO: compiled from: FTPFileTreeWalker.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final void a(List<com.al.dlnaserver.customs.a> list, Map<com.al.dlnaserver.customs.a, com.al.dlnaserver.customs.a> map, String str) {
        org.a.a.a.a.c cVar = null;
        try {
            try {
                URL url = new URL(str);
                new com.al.dlnaserver.b.a();
                org.a.a.a.a.c cVarA = com.al.dlnaserver.b.a.a(url.toURI());
                try {
                    a(cVarA.q().a(k.b), list, map, url, str);
                    com.al.dlnaserver.b.a.a(cVarA);
                } catch (Exception e) {
                } catch (Throwable th) {
                    th = th;
                    cVar = cVarA;
                    com.al.dlnaserver.b.a.a(cVar);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private void a(g[] gVarArr, List<com.al.dlnaserver.customs.a> list, Map<com.al.dlnaserver.customs.a, com.al.dlnaserver.customs.a> map, URL url, String str) {
        Arrays.sort(gVarArr, new b(this));
        for (g gVar : gVarArr) {
            if (gVar.b() && com.al.dlnaserver.b.c.d(gVar.c())) {
                com.al.dlnaserver.customs.a aVar = new com.al.dlnaserver.customs.a(gVar, url, gVar.e().getTimeInMillis(), gVar.d());
                list.add(aVar);
                if (com.al.dlnaserver.b.c.e(aVar.a().c())) {
                    for (g gVar2 : gVarArr) {
                        if (com.al.dlnaserver.b.c.h(gVar2.c()) && gVar2.c().startsWith(com.al.dlnaserver.b.c.c(aVar.a().c()))) {
                            map.put(aVar, new com.al.dlnaserver.customs.a(gVar2, url, gVar2.e().getTimeInMillis(), gVar2.d()));
                        }
                    }
                }
            } else if (gVar.a()) {
                a(list, map, String.valueOf(str) + "/" + gVar.c());
            }
        }
    }
}
