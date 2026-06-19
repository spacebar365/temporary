package com.p033al.dlnaserver.p036c;

import com.p033al.dlnaserver.customs.C0378a;
import com.p033al.dlnaserver.p035b.C0308a;
import com.p033al.dlnaserver.p035b.C0349c;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.p037a.p038a.p039a.p040a.C0452c;
import org.p037a.p038a.p039a.p040a.C0456g;
import org.p037a.p038a.p039a.p040a.C0460k;

/* JADX INFO: renamed from: com.al.dlnaserver.c.a */
/* JADX INFO: compiled from: FTPFileTreeWalker.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0374a {
    /* JADX INFO: renamed from: a */
    public final void m1070a(List<C0378a> list, Map<C0378a, C0378a> map, String str) {
        C0452c c0452c = null;
        try {
            try {
                URL url = new URL(str);
                new C0308a();
                C0452c c0452cM1008a = C0308a.m1008a(url.toURI());
                try {
                    m1069a(c0452cM1008a.m1227q().m1261a(C0460k.f1712b), list, map, url, str);
                    C0308a.m1009a(c0452cM1008a);
                } catch (Exception e) {
                } catch (Throwable th) {
                    th = th;
                    c0452c = c0452cM1008a;
                    C0308a.m1009a(c0452c);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1069a(C0456g[] c0456gArr, List<C0378a> list, Map<C0378a, C0378a> map, URL url, String str) {
        Arrays.sort(c0456gArr, new C0375b(this));
        for (C0456g c0456g : c0456gArr) {
            if (c0456g.m1251b() && C0349c.m1024d(c0456g.m1252c())) {
                C0378a c0378a = new C0378a(c0456g, url, c0456g.m1256e().getTimeInMillis(), c0456g.m1254d());
                list.add(c0378a);
                if (C0349c.m1025e(c0378a.m1074a().m1252c())) {
                    for (C0456g c0456g2 : c0456gArr) {
                        if (C0349c.m1028h(c0456g2.m1252c()) && c0456g2.m1252c().startsWith(C0349c.m1022c(c0378a.m1074a().m1252c()))) {
                            map.put(c0378a, new C0378a(c0456g2, url, c0456g2.m1256e().getTimeInMillis(), c0456g2.m1254d()));
                        }
                    }
                }
            } else if (c0456g.m1248a()) {
                m1070a(list, map, String.valueOf(str) + "/" + c0456g.m1252c());
            }
        }
    }
}
