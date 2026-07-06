package a.g;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map$Entry;

/* JADX INFO: compiled from: DfsImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class c implements a.l {
    private static final a.d.a.a a = new a.d.a.a();
    private static final org.c.b b = org.c.c.a((Class<?>) c.class);
    private c$a<Map<String, c$a<a.d.a.b>>> c = null;
    private final Object d = new Object();
    private final Map<String, c$a<a.d.a.b>> e = new HashMap();
    private final Object f = new Object();
    private c$a<a.d.a.b> g = null;
    private final Object h = new Object();

    /* JADX WARN: Removed duplicated region for block: B:54:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.Map<java.lang.String, java.util.Map<java.lang.String, a.g.c$a<a.d.a.b>>> a(a.c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.c.a(a.c):java.util.Map");
    }

    @Override // a.l
    public final boolean a(a.c cVar, String str) {
        synchronized (this.d) {
            Map<String, Map<String, c$a<a.d.a.b>>> mapA = a(cVar);
            if (mapA != null) {
                z = mapA.get(str.toLowerCase(Locale.ROOT)) != null;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x010c A[Catch: all -> 0x0040, IOException -> 0x00d3, TRY_LEAVE, TryCatch #3 {IOException -> 0x00d3, blocks: (B:24:0x0050, B:33:0x00a9, B:37:0x00b1, B:49:0x00cf, B:50:0x00d2, B:63:0x010c, B:62:0x0108), top: B:69:0x0050, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private a.k b(a.c r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.c.b(a.c, java.lang.String):a.k");
    }

    private a.ad c(a.c cVar, String str) throws ab {
        if (cVar.a().d()) {
            return null;
        }
        as asVarA = a(cVar, b(cVar, str));
        if (asVarA == null && b.c()) {
            b.b(String.format("Failed to connect to domain controller for %s", str));
            return asVarA;
        }
        return asVarA;
    }

    private static as a(a.c cVar, a.k kVar) throws ab {
        if (kVar != null) {
            a.k kVar2 = kVar;
            while (kVar2.a() != null && !kVar2.a().isEmpty()) {
                try {
                    try {
                        as asVar = (as) cVar.d().a(cVar, kVar2.a(), 0, false, !cVar.g().b() && cVar.a().S() && cVar.a().T()).a(as.class);
                        asVar.m();
                        return asVar;
                    } catch (IOException e) {
                        b.b("Connection failed " + kVar2.a(), e);
                        a.k kVarG = kVar2.g();
                        if (kVarG == kVar) {
                            throw e;
                        }
                        kVar2 = kVarG;
                    }
                } catch (IOException e2) {
                    if (cVar.a().c() && (e2 instanceof ab)) {
                        throw ((ab) e2);
                    }
                }
            }
            b.b("No server name in referral");
            return null;
        }
        return null;
    }

    private static a.d.a.b a(a.c cVar, at atVar, String str, String str2, String str3, String str4, String str5) throws ab {
        if (cVar.a().d()) {
            return null;
        }
        String str6 = "\\" + str + "\\" + str4;
        if (str5 != null) {
            str6 = str6 + str5;
        }
        try {
            if (b.c()) {
                b.b("Fetching referral for ".concat(String.valueOf(str6)));
            }
            a.k kVarA = atVar.a(cVar, str6, str3, str2, 0);
            if (kVarA != null) {
                if (b.c()) {
                    b.b(String.format("Referral for %s: %s", str6, kVarA));
                }
                return (a.d.a.b) kVarA.a(a.d.a.b.class);
            }
        } catch (IOException e) {
            if (b.c()) {
                b.b(String.format("Getting referral for %s failed", str6), e);
            }
            if (cVar.a().c() && (e instanceof ab)) {
                throw ((ab) e);
            }
        }
        return null;
    }

    @Override // a.l
    public final a.k a(a.c cVar, String str, String str2, String str3) {
        return a(cVar, str, str2, str3, 5);
    }

    private a.k a(a.c cVar, String str, String str2, String str3, int i) {
        a.d.a.b bVarA;
        String str4;
        a.d.a.b bVar;
        c$a<a.d.a.b> c_aA;
        if (cVar.a().d() || str2 == null || str2.equals("IPC$") || i <= 0 || str == null) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        if (b.b()) {
            org.c.b bVar2 = b;
            Object[] objArr = new Object[3];
            objArr[0] = lowerCase;
            objArr[1] = str2;
            objArr[2] = str3 != null ? str3 : "";
            bVar2.a(String.format("Resolving \\%s\\%s%s", objArr));
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.d) {
            Map<String, Map<String, c$a<a.d.a.b>>> mapA = a(cVar);
            if (mapA == null) {
                bVarA = null;
                str4 = str2;
            } else {
                if (b.b()) {
                    for (Map$Entry<String, Map<String, c$a<a.d.a.b>>> map$Entry : mapA.entrySet()) {
                        b.a("Domain " + map$Entry.getKey());
                        for (Map$Entry<String, c$a<a.d.a.b>> map$Entry2 : map$Entry.getValue().entrySet()) {
                            b.a("  Root " + map$Entry2.getKey());
                            if (map$Entry2.getValue().b != null) {
                                for (Map$Entry<String, a.d.a.b> map$Entry3 : map$Entry2.getValue().b.entrySet()) {
                                    a.d.a.b value = map$Entry3.getValue();
                                    do {
                                        b.a("    " + map$Entry3.getKey() + " => " + map$Entry3.getValue());
                                    } while (value.n() != value);
                                }
                            }
                        }
                    }
                }
                String lowerCase2 = str2.toLowerCase();
                Map<String, c$a<a.d.a.b>> map = mapA.get(lowerCase);
                if (map == null) {
                    bVar = null;
                } else {
                    a.d.a.b bVarA2 = null;
                    if (b.b()) {
                        b.a("Is a domain referral for ".concat(String.valueOf(lowerCase)));
                    }
                    if (b.b()) {
                        b.a("Resolving root ".concat(String.valueOf(lowerCase2)));
                    }
                    c$a<a.d.a.b> c_a = map.get(lowerCase2);
                    if (c_a == null || jCurrentTimeMillis <= c_a.a) {
                        c_aA = c_a;
                    } else {
                        if (b.c()) {
                            b.b("Removing expired " + c_a.b);
                        }
                        map.remove(lowerCase2);
                        c_aA = null;
                    }
                    if (c_aA == null) {
                        b.a("Loadings roots");
                        bVarA2 = b(cVar, lowerCase, lowerCase2, lowerCase);
                        c_aA = a(cVar, lowerCase2, map, bVarA2, c_aA);
                    } else if (c_aA instanceof c$b) {
                        c_aA = null;
                    } else {
                        bVarA2 = c_aA.b.get("\\");
                    }
                    if (c_aA != null) {
                        bVarA2 = a(cVar, lowerCase, lowerCase2, str3, bVarA2, jCurrentTimeMillis, c_aA);
                    }
                    bVar = bVarA2;
                }
                if (cVar.a().e() && (bVar instanceof a.d.a.a)) {
                    ((a.d.a.a) bVar).d(lowerCase);
                }
                bVarA = bVar;
                str4 = lowerCase2;
            }
        }
        if (bVarA == null && str3 != null) {
            bVarA = a(lowerCase, str4, str3, jCurrentTimeMillis);
        }
        if (bVarA != null && bVarA.m()) {
            return a(cVar, str3, i, bVarA);
        }
        return bVarA;
    }

    private a.d.a.b a(a.c cVar, String str, int i, a.d.a.b bVar) {
        a.d.a.b bVarN;
        a.d.a.b bVar2 = null;
        do {
            bVarN = bVar.n();
            String str2 = (bVar.e() != null ? "\\" + bVar.e() : "") + (str != null ? str.substring(bVarN.d()) : "");
            if (b.c()) {
                b.b(String.format("Intermediate referral, server %s share %s refPath %s origPath %s nextPath %s", bVarN.a(), bVarN.c(), bVarN.e(), str, str2));
            }
            a.k kVarA = a(cVar, bVarN.a(), bVarN.c(), str2, i - 1);
            if (kVarA != null) {
                a.d.a.b bVarA = bVar2;
                do {
                    if (b.c()) {
                        b.b("Next referral is ".concat(String.valueOf(kVarA)));
                    }
                    if (bVarA == null) {
                        bVarA = bVarN.a(kVarA);
                    } else {
                        bVarA.a(bVarN.a(kVarA));
                    }
                } while (kVarA != kVarA);
                bVar2 = bVarA;
            }
        } while (bVarN != bVar);
        return bVar2 != null ? bVar2 : bVar;
    }

    private static c$a<a.d.a.b> a(a.c cVar, String str, Map<String, c$a<a.d.a.b>> map, a.d.a.b bVar, c$a<a.d.a.b> c_a) {
        if (bVar != null) {
            c_a = new c$a<>(cVar.a().b());
            c_a.b.put("\\", bVar);
            a.d.a.b bVarN = bVar;
            do {
                bVarN.a(c_a.b);
                bVarN.c("\\");
                bVarN = bVarN.n();
            } while (bVarN != bVar);
            if (b.c()) {
                b.b("Have referral ".concat(String.valueOf(bVar)));
            }
            map.put(str, c_a);
        } else {
            map.put(str, new c$b(cVar.a().b()));
        }
        return c_a;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private a.d.a.b b(a.c r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) throws java.lang.Throwable {
        /*
            r9 = this;
            r7 = 0
            a.ad r8 = r9.c(r10, r11)
            if (r8 != 0) goto L24
            org.c.b r0 = a.g.c.b     // Catch: java.lang.Throwable -> L8f java.lang.Throwable -> La4
            boolean r0 = r0.c()     // Catch: java.lang.Throwable -> L8f java.lang.Throwable -> La4
            if (r0 == 0) goto L1e
            org.c.b r0 = a.g.c.b     // Catch: java.lang.Throwable -> L8f java.lang.Throwable -> La4
            java.lang.String r1 = "Failed to get domain controller for "
            java.lang.String r2 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L8f java.lang.Throwable -> La4
            java.lang.String r1 = r1.concat(r2)     // Catch: java.lang.Throwable -> L8f java.lang.Throwable -> La4
            r0.b(r1)     // Catch: java.lang.Throwable -> L8f java.lang.Throwable -> La4
        L1e:
            if (r8 == 0) goto L23
            r8.close()
        L23:
            return r7
        L24:
            java.lang.Class<a.g.at> r0 = a.g.at.class
            a.ad r1 = r8.a(r0)     // Catch: java.lang.Throwable -> L8f java.lang.Throwable -> La4
            a.g.at r1 = (a.g.at) r1     // Catch: java.lang.Throwable -> L8f java.lang.Throwable -> La4
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L8f java.lang.Throwable -> La4
            r1.m()     // Catch: java.io.IOException -> L82 java.lang.Throwable -> L8c
            java.lang.String r4 = r1.a()     // Catch: java.io.IOException -> L82 java.lang.Throwable -> L8c
        L34:
            r6 = 0
            r0 = r10
            r2 = r11
            r3 = r11
            r5 = r12
            a.d.a.b r0 = a(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8c
            if (r8 == 0) goto L43
            r8.close()
        L43:
            org.c.b r1 = a.g.c.b
            boolean r1 = r1.b()
            if (r1 == 0) goto L5a
            org.c.b r1 = a.g.c.b
            java.lang.String r2 = "Have DC referral "
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r2 = r2.concat(r3)
            r1.a(r2)
        L5a:
            if (r0 == 0) goto L80
            java.lang.String r1 = r0.a()
            boolean r1 = r11.equals(r1)
            if (r1 == 0) goto L80
            java.lang.String r1 = r0.c()
            boolean r1 = r12.equals(r1)
            if (r1 == 0) goto L80
            org.c.b r1 = a.g.c.b
            java.lang.String r2 = "Dropping self-referential referral "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r2.concat(r0)
            r1.d(r0)
            r0 = r7
        L80:
            r7 = r0
            goto L23
        L82:
            r0 = move-exception
            org.c.b r2 = a.g.c.b     // Catch: java.lang.Throwable -> L8c
            java.lang.String r3 = "Failed to connect to domain controller"
            r2.d(r3, r0)     // Catch: java.lang.Throwable -> L8c
            r4 = r13
            goto L34
        L8c:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8c
            throw r0     // Catch: java.lang.Throwable -> L8f java.lang.Throwable -> La4
        L8f:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L91
        L91:
            r1 = move-exception
            r7 = r0
        L93:
            if (r8 == 0) goto L9a
            if (r7 == 0) goto La0
            r8.close()     // Catch: java.lang.Throwable -> L9b
        L9a:
            throw r1
        L9b:
            r0 = move-exception
            r7.addSuppressed(r0)
            goto L9a
        La0:
            r8.close()
            goto L9a
        La4:
            r0 = move-exception
            r1 = r0
            goto L93
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.c.b(a.c, java.lang.String, java.lang.String, java.lang.String):a.d.a.b");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static a.d.a.b a(a.c r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, a.d.a.b r15, long r16, a.g.c$a<a.d.a.b> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.c.a(a.c, java.lang.String, java.lang.String, java.lang.String, a.d.a.b, long, a.g.c$a):a.d.a.b");
    }

    private a.d.a.b a(String str, String str2, String str3, long j) {
        c$a<a.d.a.b> c_a;
        if (b.b()) {
            b.a("No match for domain based root, checking standalone ".concat(String.valueOf(str)));
        }
        synchronized (this.h) {
            c$a<a.d.a.b> c_a2 = this.g;
            c_a = (c_a2 == null || j > c_a2.a) ? new c$a<>(0L) : c_a2;
            this.g = c_a;
        }
        String str4 = "\\" + str + "\\" + str2;
        if (!str3.equals("\\")) {
            str4 = str4 + str3;
        }
        String lowerCase = str4.toLowerCase(Locale.ROOT);
        int length = lowerCase.length();
        for (String str5 : c_a.b.keySet()) {
            int length2 = str5.length();
            boolean zStartsWith = false;
            if (length2 == length) {
                zStartsWith = str5.equals(lowerCase);
            } else if (length2 < length) {
                zStartsWith = lowerCase.startsWith(str5);
            } else if (b.b()) {
                b.a(lowerCase + " vs. " + str5);
            }
            if (zStartsWith) {
                if (b.c()) {
                    b.b("Matched ".concat(String.valueOf(str5)));
                }
                return c_a.b.get(str5);
            }
        }
        if (b.b()) {
            b.a("No match for ".concat(String.valueOf(lowerCase)));
        }
        return null;
    }

    @Override // a.l
    public final synchronized void a(a.c cVar, String str, a.k kVar) {
        if (!cVar.a().d() && (kVar instanceof a.d.a.b)) {
            if (b.c()) {
                b.b("Inserting referral for ".concat(String.valueOf(str)));
            }
            int iIndexOf = str.indexOf(92, 1);
            int iIndexOf2 = str.indexOf(92, iIndexOf + 1);
            if (iIndexOf < 0 || iIndexOf2 < 0) {
                b.e("Invalid UNC path ".concat(String.valueOf(str)));
            } else {
                String lowerCase = str.substring(1, iIndexOf).toLowerCase(Locale.ROOT);
                String strSubstring = str.substring(iIndexOf + 1, iIndexOf2);
                String lowerCase2 = str.substring(0, kVar.d()).toLowerCase(Locale.ROOT);
                a.d.a.b bVar = (a.d.a.b) kVar;
                if (cVar.a().e()) {
                    bVar.e(lowerCase);
                }
                if (b.c()) {
                    b.b("Adding key " + lowerCase2 + " to " + kVar);
                }
                bVar.a(lowerCase.length() + 1 + 1 + strSubstring.length());
                String str2 = lowerCase2.charAt(lowerCase2.length() + (-1)) != '\\' ? lowerCase2 + '\\' : lowerCase2;
                if (b.c()) {
                    b.b("Key is ".concat(String.valueOf(str2)));
                }
                c$a<a.d.a.b> c_a = this.g;
                synchronized (this.h) {
                    if (c_a != null) {
                        if (System.currentTimeMillis() + 10000 > c_a.a) {
                        }
                        this.g = c_a;
                    }
                    c_a = new c$a<>(cVar.a().b());
                    this.g = c_a;
                }
                c_a.b.put(str2, bVar);
            }
        }
    }
}
