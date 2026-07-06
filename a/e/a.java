package a.e;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: Lmhosts.java */
/* JADX INFO: loaded from: classes.dex */
public class a {
    private static final org.c.b a = org.c.c.a((Class<?>) a.class);
    private final Map<b, h> b = new HashMap();
    private long c = 1;
    private int d;

    public final synchronized h a(String str, a.c cVar) {
        return a(new b(cVar.a(), str, 32, null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0093 A[Catch: IOException -> 0x006c, all -> 0x0090, TRY_ENTER, TRY_LEAVE, TryCatch #5 {IOException -> 0x006c, blocks: (B:4:0x0002, B:6:0x000c, B:8:0x0023, B:10:0x002b, B:11:0x0047, B:13:0x0056, B:21:0x0068, B:22:0x006b, B:32:0x0093, B:27:0x008c, B:14:0x0059), top: B:38:0x0002, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final synchronized a.e.h a(a.e.b r8, a.c r9) {
        /*
            r7 = this;
            r1 = 0
            monitor-enter(r7)
            a.h r0 = r9.a()     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L90
            java.lang.String r0 = r0.X()     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L90
            if (r0 == 0) goto L89
            java.io.File r0 = new java.io.File     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L90
            a.h r2 = r9.a()     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L90
            java.lang.String r2 = r2.X()     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L90
            r0.<init>(r2)     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L90
            long r2 = r0.lastModified()     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L90
            long r4 = r7.c     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L90
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L59
            org.c.b r4 = a.e.a.a     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L90
            boolean r4 = r4.c()     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L90
            if (r4 == 0) goto L47
            org.c.b r4 = a.e.a.a     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L90
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L90
            java.lang.String r6 = "Reading "
            r5.<init>(r6)     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L90
            a.h r6 = r9.a()     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L90
            java.lang.String r6 = r6.X()     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L90
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L90
            java.lang.String r5 = r5.toString()     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L90
            r4.b(r5)     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L90
        L47:
            r7.c = r2     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L90
            java.util.Map<a.e.b, a.e.h> r2 = r7.b     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L90
            r2.clear()     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L90
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L90
            r3.<init>(r0)     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L90
            r7.a(r3, r9)     // Catch: java.lang.Throwable -> L63 java.lang.Throwable -> L97
            r3.close()     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L90
        L59:
            java.util.Map<a.e.b, a.e.h> r0 = r7.b     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L90
            java.lang.Object r0 = r0.get(r8)     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L90
            a.e.h r0 = (a.e.h) r0     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L90
        L61:
            monitor-exit(r7)
            return r0
        L63:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L65
        L65:
            r0 = move-exception
        L66:
            if (r2 == 0) goto L93
            r3.close()     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L8b java.lang.Throwable -> L90
        L6b:
            throw r0     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L90
        L6c:
            r0 = move-exception
            org.c.b r2 = a.e.a.a     // Catch: java.lang.Throwable -> L90
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            java.lang.String r4 = "Could not read lmhosts "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L90
            a.h r4 = r9.a()     // Catch: java.lang.Throwable -> L90
            java.lang.String r4 = r4.X()     // Catch: java.lang.Throwable -> L90
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L90
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L90
            r2.e(r3, r0)     // Catch: java.lang.Throwable -> L90
        L89:
            r0 = r1
            goto L61
        L8b:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L90
            goto L6b
        L90:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L93:
            r3.close()     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L90
            goto L6b
        L97:
            r0 = move-exception
            r2 = r1
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.a.a(a.e.b, a.c):a.e.h");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.io.Reader r12, a.c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.a.a(java.io.Reader, a.c):void");
    }
}
