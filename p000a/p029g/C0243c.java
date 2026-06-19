package p000a.p029g;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.InterfaceC0006ad;
import p000a.InterfaceC0016c;
import p000a.InterfaceC0287k;
import p000a.InterfaceC0288l;
import p000a.p006d.p007a.C0046a;
import p000a.p006d.p007a.InterfaceC0047b;

/* JADX INFO: renamed from: a.g.c */
/* JADX INFO: compiled from: DfsImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class C0243c implements InterfaceC0288l {

    /* JADX INFO: renamed from: a */
    private static final C0046a f1129a = new C0046a();

    /* JADX INFO: renamed from: b */
    private static final InterfaceC1612b f1130b = C1620c.m4563a((Class<?>) C0243c.class);

    /* JADX INFO: renamed from: c */
    private a<Map<String, a<InterfaceC0047b>>> f1131c = null;

    /* JADX INFO: renamed from: d */
    private final Object f1132d = new Object();

    /* JADX INFO: renamed from: e */
    private final Map<String, a<InterfaceC0047b>> f1133e = new HashMap();

    /* JADX INFO: renamed from: f */
    private final Object f1134f = new Object();

    /* JADX INFO: renamed from: g */
    private a<InterfaceC0047b> f1135g = null;

    /* JADX INFO: renamed from: h */
    private final Object f1136h = new Object();

    /* JADX INFO: renamed from: a.g.c$a */
    /* JADX INFO: compiled from: DfsImpl.java */
    private static class a<T> {

        /* JADX INFO: renamed from: a */
        long f1137a;

        /* JADX INFO: renamed from: b */
        Map<String, T> f1138b = new ConcurrentHashMap();

        a(long j) {
            this.f1137a = System.currentTimeMillis() + (1000 * j);
        }
    }

    /* JADX INFO: renamed from: a.g.c$b */
    /* JADX INFO: compiled from: DfsImpl.java */
    private static class b<T> extends a<T> {
        b(long j) {
            super(j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0124  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.Map<java.lang.String, java.util.Map<java.lang.String, p000a.p029g.C0243c.a<p000a.p006d.p007a.InterfaceC0047b>>> m854a(p000a.InterfaceC0016c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0243c.m854a(a.c):java.util.Map");
    }

    @Override // p000a.InterfaceC0288l
    /* JADX INFO: renamed from: a */
    public final boolean mo860a(InterfaceC0016c interfaceC0016c, String str) {
        synchronized (this.f1132d) {
            Map<String, Map<String, a<InterfaceC0047b>>> mapM854a = m854a(interfaceC0016c);
            if (mapM854a != null) {
                z = mapM854a.get(str.toLowerCase(Locale.ROOT)) != null;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x010c A[Catch: all -> 0x0040, IOException -> 0x00d3, TRY_LEAVE, TryCatch #3 {IOException -> 0x00d3, blocks: (B:24:0x0050, B:33:0x00a9, B:37:0x00b1, B:49:0x00cf, B:50:0x00d2, B:63:0x010c, B:62:0x0108), top: B:69:0x0050, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p000a.InterfaceC0287k m856b(p000a.InterfaceC0016c r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0243c.m856b(a.c, java.lang.String):a.k");
    }

    /* JADX INFO: renamed from: c */
    private InterfaceC0006ad m857c(InterfaceC0016c interfaceC0016c, String str) throws C0212ab {
        if (interfaceC0016c.mo114a().mo59d()) {
            return null;
        }
        C0229as c0229asM851a = m851a(interfaceC0016c, m856b(interfaceC0016c, str));
        if (c0229asM851a == null && f1130b.mo4539c()) {
            f1130b.mo4534b(String.format("Failed to connect to domain controller for %s", str));
            return c0229asM851a;
        }
        return c0229asM851a;
    }

    /* JADX INFO: renamed from: a */
    private static C0229as m851a(InterfaceC0016c interfaceC0016c, InterfaceC0287k interfaceC0287k) throws C0212ab {
        if (interfaceC0287k != null) {
            InterfaceC0287k interfaceC0287k2 = interfaceC0287k;
            while (interfaceC0287k2.mo176a() != null && !interfaceC0287k2.mo176a().isEmpty()) {
                try {
                    try {
                        C0229as c0229as = (C0229as) interfaceC0016c.mo117d().mo98a(interfaceC0016c, interfaceC0287k2.mo176a(), 0, false, !interfaceC0016c.mo109g().mo899b() && interfaceC0016c.mo114a().mo24S() && interfaceC0016c.mo114a().mo25T()).mo96a(C0229as.class);
                        c0229as.mo752m();
                        return c0229as;
                    } catch (IOException e) {
                        f1130b.mo4535b("Connection failed " + interfaceC0287k2.mo176a(), e);
                        InterfaceC0287k interfaceC0287kMo190g = interfaceC0287k2.mo190g();
                        if (interfaceC0287kMo190g == interfaceC0287k) {
                            throw e;
                        }
                        interfaceC0287k2 = interfaceC0287kMo190g;
                    }
                } catch (IOException e2) {
                    if (interfaceC0016c.mo114a().mo57c() && (e2 instanceof C0212ab)) {
                        throw ((C0212ab) e2);
                    }
                }
            }
            f1130b.mo4534b("No server name in referral");
            return null;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static InterfaceC0047b m847a(InterfaceC0016c interfaceC0016c, InterfaceC0230at interfaceC0230at, String str, String str2, String str3, String str4, String str5) throws C0212ab {
        if (interfaceC0016c.mo114a().mo59d()) {
            return null;
        }
        String str6 = "\\" + str + "\\" + str4;
        if (str5 != null) {
            str6 = str6 + str5;
        }
        try {
            if (f1130b.mo4539c()) {
                f1130b.mo4534b("Fetching referral for ".concat(String.valueOf(str6)));
            }
            InterfaceC0287k interfaceC0287kMo729a = interfaceC0230at.mo729a(interfaceC0016c, str6, str3, str2, 0);
            if (interfaceC0287kMo729a != null) {
                if (f1130b.mo4539c()) {
                    f1130b.mo4534b(String.format("Referral for %s: %s", str6, interfaceC0287kMo729a));
                }
                return (InterfaceC0047b) interfaceC0287kMo729a.mo175a(InterfaceC0047b.class);
            }
        } catch (IOException e) {
            if (f1130b.mo4539c()) {
                f1130b.mo4535b(String.format("Getting referral for %s failed", str6), e);
            }
            if (interfaceC0016c.mo114a().mo57c() && (e instanceof C0212ab)) {
                throw ((C0212ab) e);
            }
        }
        return null;
    }

    @Override // p000a.InterfaceC0288l
    /* JADX INFO: renamed from: a */
    public final InterfaceC0287k mo858a(InterfaceC0016c interfaceC0016c, String str, String str2, String str3) {
        return m853a(interfaceC0016c, str, str2, str3, 5);
    }

    /* JADX INFO: renamed from: a */
    private InterfaceC0287k m853a(InterfaceC0016c interfaceC0016c, String str, String str2, String str3, int i) {
        InterfaceC0047b interfaceC0047bM850a;
        String str4;
        InterfaceC0047b interfaceC0047b;
        a<InterfaceC0047b> aVarM852a;
        if (interfaceC0016c.mo114a().mo59d() || str2 == null || str2.equals("IPC$") || i <= 0 || str == null) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        if (f1130b.mo4536b()) {
            InterfaceC1612b interfaceC1612b = f1130b;
            Object[] objArr = new Object[3];
            objArr[0] = lowerCase;
            objArr[1] = str2;
            objArr[2] = str3 != null ? str3 : "";
            interfaceC1612b.mo4532a(String.format("Resolving \\%s\\%s%s", objArr));
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f1132d) {
            Map<String, Map<String, a<InterfaceC0047b>>> mapM854a = m854a(interfaceC0016c);
            if (mapM854a == null) {
                interfaceC0047bM850a = null;
                str4 = str2;
            } else {
                if (f1130b.mo4536b()) {
                    for (Map.Entry<String, Map<String, a<InterfaceC0047b>>> entry : mapM854a.entrySet()) {
                        f1130b.mo4532a("Domain " + entry.getKey());
                        for (Map.Entry<String, a<InterfaceC0047b>> entry2 : entry.getValue().entrySet()) {
                            f1130b.mo4532a("  Root " + entry2.getKey());
                            if (entry2.getValue().f1138b != null) {
                                for (Map.Entry<String, InterfaceC0047b> entry3 : entry2.getValue().f1138b.entrySet()) {
                                    InterfaceC0047b value = entry3.getValue();
                                    do {
                                        f1130b.mo4532a("    " + entry3.getKey() + " => " + entry3.getValue());
                                    } while (value.mo197n() != value);
                                }
                            }
                        }
                    }
                }
                String lowerCase2 = str2.toLowerCase();
                Map<String, a<InterfaceC0047b>> map = mapM854a.get(lowerCase);
                if (map == null) {
                    interfaceC0047b = null;
                } else {
                    InterfaceC0047b interfaceC0047bM849a = null;
                    if (f1130b.mo4536b()) {
                        f1130b.mo4532a("Is a domain referral for ".concat(String.valueOf(lowerCase)));
                    }
                    if (f1130b.mo4536b()) {
                        f1130b.mo4532a("Resolving root ".concat(String.valueOf(lowerCase2)));
                    }
                    a<InterfaceC0047b> aVar = map.get(lowerCase2);
                    if (aVar == null || jCurrentTimeMillis <= aVar.f1137a) {
                        aVarM852a = aVar;
                    } else {
                        if (f1130b.mo4539c()) {
                            f1130b.mo4534b("Removing expired " + aVar.f1138b);
                        }
                        map.remove(lowerCase2);
                        aVarM852a = null;
                    }
                    if (aVarM852a == null) {
                        f1130b.mo4532a("Loadings roots");
                        interfaceC0047bM849a = m855b(interfaceC0016c, lowerCase, lowerCase2, lowerCase);
                        aVarM852a = m852a(interfaceC0016c, lowerCase2, map, interfaceC0047bM849a, aVarM852a);
                    } else if (aVarM852a instanceof b) {
                        aVarM852a = null;
                    } else {
                        interfaceC0047bM849a = aVarM852a.f1138b.get("\\");
                    }
                    if (aVarM852a != null) {
                        interfaceC0047bM849a = m849a(interfaceC0016c, lowerCase, lowerCase2, str3, interfaceC0047bM849a, jCurrentTimeMillis, aVarM852a);
                    }
                    interfaceC0047b = interfaceC0047bM849a;
                }
                if (interfaceC0016c.mo114a().mo60e() && (interfaceC0047b instanceof C0046a)) {
                    ((C0046a) interfaceC0047b).m186d(lowerCase);
                }
                interfaceC0047bM850a = interfaceC0047b;
                str4 = lowerCase2;
            }
        }
        if (interfaceC0047bM850a == null && str3 != null) {
            interfaceC0047bM850a = m850a(lowerCase, str4, str3, jCurrentTimeMillis);
        }
        if (interfaceC0047bM850a != null && interfaceC0047bM850a.mo196m()) {
            return m848a(interfaceC0016c, str3, i, interfaceC0047bM850a);
        }
        return interfaceC0047bM850a;
    }

    /* JADX INFO: renamed from: a */
    private InterfaceC0047b m848a(InterfaceC0016c interfaceC0016c, String str, int i, InterfaceC0047b interfaceC0047b) {
        InterfaceC0047b interfaceC0047bMo197n;
        InterfaceC0047b interfaceC0047b2 = null;
        do {
            interfaceC0047bMo197n = interfaceC0047b.mo197n();
            String str2 = (interfaceC0047b.mo187e() != null ? "\\" + interfaceC0047b.mo187e() : "") + (str != null ? str.substring(interfaceC0047bMo197n.mo185d()) : "");
            if (f1130b.mo4539c()) {
                f1130b.mo4534b(String.format("Intermediate referral, server %s share %s refPath %s origPath %s nextPath %s", interfaceC0047bMo197n.mo176a(), interfaceC0047bMo197n.mo183c(), interfaceC0047bMo197n.mo187e(), str, str2));
            }
            InterfaceC0287k interfaceC0287kM853a = m853a(interfaceC0016c, interfaceC0047bMo197n.mo176a(), interfaceC0047bMo197n.mo183c(), str2, i - 1);
            if (interfaceC0287kM853a != null) {
                InterfaceC0047b interfaceC0047bMo174a = interfaceC0047b2;
                do {
                    if (f1130b.mo4539c()) {
                        f1130b.mo4534b("Next referral is ".concat(String.valueOf(interfaceC0287kM853a)));
                    }
                    if (interfaceC0047bMo174a == null) {
                        interfaceC0047bMo174a = interfaceC0047bMo197n.mo174a(interfaceC0287kM853a);
                    } else {
                        interfaceC0047bMo174a.mo178a(interfaceC0047bMo197n.mo174a(interfaceC0287kM853a));
                    }
                } while (interfaceC0287kM853a != interfaceC0287kM853a);
                interfaceC0047b2 = interfaceC0047bMo174a;
            }
        } while (interfaceC0047bMo197n != interfaceC0047b);
        return interfaceC0047b2 != null ? interfaceC0047b2 : interfaceC0047b;
    }

    /* JADX INFO: renamed from: a */
    private static a<InterfaceC0047b> m852a(InterfaceC0016c interfaceC0016c, String str, Map<String, a<InterfaceC0047b>> map, InterfaceC0047b interfaceC0047b, a<InterfaceC0047b> aVar) {
        if (interfaceC0047b != null) {
            aVar = new a<>(interfaceC0016c.mo114a().mo54b());
            aVar.f1138b.put("\\", interfaceC0047b);
            InterfaceC0047b interfaceC0047bMo197n = interfaceC0047b;
            do {
                interfaceC0047bMo197n.mo180a(aVar.f1138b);
                interfaceC0047bMo197n.mo184c("\\");
                interfaceC0047bMo197n = interfaceC0047bMo197n.mo197n();
            } while (interfaceC0047bMo197n != interfaceC0047b);
            if (f1130b.mo4539c()) {
                f1130b.mo4534b("Have referral ".concat(String.valueOf(interfaceC0047b)));
            }
            map.put(str, aVar);
        } else {
            map.put(str, new b(interfaceC0016c.mo114a().mo54b()));
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p000a.p006d.p007a.InterfaceC0047b m855b(p000a.InterfaceC0016c r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) throws java.lang.Throwable {
        /*
            r9 = this;
            r7 = 0
            a.ad r8 = r9.m857c(r10, r11)
            if (r8 != 0) goto L24
            org.c.b r0 = p000a.p029g.C0243c.f1130b     // Catch: java.lang.Throwable -> L8f java.lang.Throwable -> La4
            boolean r0 = r0.mo4539c()     // Catch: java.lang.Throwable -> L8f java.lang.Throwable -> La4
            if (r0 == 0) goto L1e
            org.c.b r0 = p000a.p029g.C0243c.f1130b     // Catch: java.lang.Throwable -> L8f java.lang.Throwable -> La4
            java.lang.String r1 = "Failed to get domain controller for "
            java.lang.String r2 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L8f java.lang.Throwable -> La4
            java.lang.String r1 = r1.concat(r2)     // Catch: java.lang.Throwable -> L8f java.lang.Throwable -> La4
            r0.mo4534b(r1)     // Catch: java.lang.Throwable -> L8f java.lang.Throwable -> La4
        L1e:
            if (r8 == 0) goto L23
            r8.close()
        L23:
            return r7
        L24:
            java.lang.Class<a.g.at> r0 = p000a.p029g.InterfaceC0230at.class
            a.ad r1 = r8.mo96a(r0)     // Catch: java.lang.Throwable -> L8f java.lang.Throwable -> La4
            a.g.at r1 = (p000a.p029g.InterfaceC0230at) r1     // Catch: java.lang.Throwable -> L8f java.lang.Throwable -> La4
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L8f java.lang.Throwable -> La4
            r1.mo752m()     // Catch: java.io.IOException -> L82 java.lang.Throwable -> L8c
            java.lang.String r4 = r1.mo97a()     // Catch: java.io.IOException -> L82 java.lang.Throwable -> L8c
        L34:
            r6 = 0
            r0 = r10
            r2 = r11
            r3 = r11
            r5 = r12
            a.d.a.b r0 = m847a(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8c
            if (r8 == 0) goto L43
            r8.close()
        L43:
            org.c.b r1 = p000a.p029g.C0243c.f1130b
            boolean r1 = r1.mo4536b()
            if (r1 == 0) goto L5a
            org.c.b r1 = p000a.p029g.C0243c.f1130b
            java.lang.String r2 = "Have DC referral "
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r2 = r2.concat(r3)
            r1.mo4532a(r2)
        L5a:
            if (r0 == 0) goto L80
            java.lang.String r1 = r0.mo176a()
            boolean r1 = r11.equals(r1)
            if (r1 == 0) goto L80
            java.lang.String r1 = r0.mo183c()
            boolean r1 = r12.equals(r1)
            if (r1 == 0) goto L80
            org.c.b r1 = p000a.p029g.C0243c.f1130b
            java.lang.String r2 = "Dropping self-referential referral "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r2.concat(r0)
            r1.mo4540d(r0)
            r0 = r7
        L80:
            r7 = r0
            goto L23
        L82:
            r0 = move-exception
            org.c.b r2 = p000a.p029g.C0243c.f1130b     // Catch: java.lang.Throwable -> L8c
            java.lang.String r3 = "Failed to connect to domain controller"
            r2.mo4541d(r3, r0)     // Catch: java.lang.Throwable -> L8c
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
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0243c.m855b(a.c, java.lang.String, java.lang.String, java.lang.String):a.d.a.b");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0170  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p000a.p006d.p007a.InterfaceC0047b m849a(p000a.InterfaceC0016c r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, p000a.p006d.p007a.InterfaceC0047b r15, long r16, p000a.p029g.C0243c.a<p000a.p006d.p007a.InterfaceC0047b> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0243c.m849a(a.c, java.lang.String, java.lang.String, java.lang.String, a.d.a.b, long, a.g.c$a):a.d.a.b");
    }

    /* JADX INFO: renamed from: a */
    private InterfaceC0047b m850a(String str, String str2, String str3, long j) {
        a<InterfaceC0047b> aVar;
        if (f1130b.mo4536b()) {
            f1130b.mo4532a("No match for domain based root, checking standalone ".concat(String.valueOf(str)));
        }
        synchronized (this.f1136h) {
            a<InterfaceC0047b> aVar2 = this.f1135g;
            aVar = (aVar2 == null || j > aVar2.f1137a) ? new a<>(0L) : aVar2;
            this.f1135g = aVar;
        }
        String str4 = "\\" + str + "\\" + str2;
        if (!str3.equals("\\")) {
            str4 = str4 + str3;
        }
        String lowerCase = str4.toLowerCase(Locale.ROOT);
        int length = lowerCase.length();
        for (String str5 : aVar.f1138b.keySet()) {
            int length2 = str5.length();
            boolean zStartsWith = false;
            if (length2 == length) {
                zStartsWith = str5.equals(lowerCase);
            } else if (length2 < length) {
                zStartsWith = lowerCase.startsWith(str5);
            } else if (f1130b.mo4536b()) {
                f1130b.mo4532a(lowerCase + " vs. " + str5);
            }
            if (zStartsWith) {
                if (f1130b.mo4539c()) {
                    f1130b.mo4534b("Matched ".concat(String.valueOf(str5)));
                }
                return aVar.f1138b.get(str5);
            }
        }
        if (f1130b.mo4536b()) {
            f1130b.mo4532a("No match for ".concat(String.valueOf(lowerCase)));
        }
        return null;
    }

    @Override // p000a.InterfaceC0288l
    /* JADX INFO: renamed from: a */
    public final synchronized void mo859a(InterfaceC0016c interfaceC0016c, String str, InterfaceC0287k interfaceC0287k) {
        if (!interfaceC0016c.mo114a().mo59d() && (interfaceC0287k instanceof InterfaceC0047b)) {
            if (f1130b.mo4539c()) {
                f1130b.mo4534b("Inserting referral for ".concat(String.valueOf(str)));
            }
            int iIndexOf = str.indexOf(92, 1);
            int iIndexOf2 = str.indexOf(92, iIndexOf + 1);
            if (iIndexOf < 0 || iIndexOf2 < 0) {
                f1130b.mo4543e("Invalid UNC path ".concat(String.valueOf(str)));
            } else {
                String lowerCase = str.substring(1, iIndexOf).toLowerCase(Locale.ROOT);
                String strSubstring = str.substring(iIndexOf + 1, iIndexOf2);
                String lowerCase2 = str.substring(0, interfaceC0287k.mo185d()).toLowerCase(Locale.ROOT);
                InterfaceC0047b interfaceC0047b = (InterfaceC0047b) interfaceC0287k;
                if (interfaceC0016c.mo114a().mo60e()) {
                    interfaceC0047b.mo188e(lowerCase);
                }
                if (f1130b.mo4539c()) {
                    f1130b.mo4534b("Adding key " + lowerCase2 + " to " + interfaceC0287k);
                }
                interfaceC0047b.mo177a(lowerCase.length() + 1 + 1 + strSubstring.length());
                String str2 = lowerCase2.charAt(lowerCase2.length() + (-1)) != '\\' ? lowerCase2 + '\\' : lowerCase2;
                if (f1130b.mo4539c()) {
                    f1130b.mo4534b("Key is ".concat(String.valueOf(str2)));
                }
                a<InterfaceC0047b> aVar = this.f1135g;
                synchronized (this.f1136h) {
                    if (aVar != null) {
                        if (System.currentTimeMillis() + 10000 > aVar.f1137a) {
                        }
                        this.f1135g = aVar;
                    }
                    aVar = new a<>(interfaceC0016c.mo114a().mo54b());
                    this.f1135g = aVar;
                }
                aVar.f1138b.put(str2, interfaceC0047b);
            }
        }
    }
}
