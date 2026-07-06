package a.g;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: SmbTransportPoolImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class au implements a.ae {
    private static final org.c.b b = org.c.c.a((Class<?>) au.class);
    private final List<as> c = new LinkedList();
    private final List<as> d = new LinkedList();
    private final ConcurrentLinkedQueue<as> e = new ConcurrentLinkedQueue<>();
    final Map<String, Integer> a = new ConcurrentHashMap();

    @Override // a.ae
    public final /* synthetic */ a.ad a(a.c cVar, String str, int i, boolean z, boolean z2) {
        return b(cVar, str, i, z, z2);
    }

    private as a(a.c cVar, a.a aVar, int i, InetAddress inetAddress, int i2, boolean z, boolean z2) {
        as asVar;
        int i3 = i <= 0 ? 445 : i;
        synchronized (this.c) {
            b();
            if (b.b()) {
                b.a("Exclusive " + z + " enforced signing " + z2);
            }
            if (z || cVar.a().N() == 1 || (asVar = a(cVar, aVar, i3, inetAddress, i2, null, z2, false)) == null) {
                asVar = new as(cVar, aVar, i3, inetAddress, i2, z2);
                if (b.c()) {
                    b.b("New transport connection ".concat(String.valueOf(asVar)));
                }
                if (z) {
                    this.d.add(asVar);
                } else {
                    this.c.add(0, asVar);
                }
            }
        }
        return asVar;
    }

    private as a(a.c cVar, a.a aVar, int i, InetAddress inetAddress, int i2, String str, boolean z, boolean z2) {
        for (as asVar : this.c) {
            if (asVar.a(aVar, i, inetAddress, i2, str) && (cVar.a().N() == 0 || asVar.c() < cVar.a().N())) {
                try {
                    if (!asVar.e() && (!z2 || !asVar.d())) {
                        if (z && !asVar.l()) {
                            if (b.b()) {
                                b.b("Cannot reuse, signing enforced but connection does not have it enabled ".concat(String.valueOf(asVar)));
                            }
                        } else if (!z && !cVar.a().U() && asVar.l() && !asVar.f().g()) {
                            if (b.b()) {
                                b.b("Cannot reuse, signing enforced on connection ".concat(String.valueOf(asVar)));
                            }
                        } else if (!asVar.f().a(cVar)) {
                            if (b.b()) {
                                b.a("Cannot reuse, different config ".concat(String.valueOf(asVar)));
                            }
                        } else {
                            if (b.b()) {
                                b.a("Reusing transport connection ".concat(String.valueOf(asVar)));
                            }
                            return asVar.j();
                        }
                    }
                } catch (a.d e) {
                    b.b("Error while checking for reuse", e);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private a.g.as b(a.c r14, java.lang.String r15, int r16, boolean r17, boolean r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.au.b(a.c, java.lang.String, int, boolean, boolean):a.g.as");
    }

    @Override // a.ae
    public final void a(a.ad adVar) {
        if (b.c()) {
            b.b("Scheduling transport connection for removal " + adVar + " (" + System.identityHashCode(adVar) + ")");
        }
        this.e.add((as) adVar);
    }

    private void b() {
        synchronized (this.c) {
            while (true) {
                as asVarPoll = this.e.poll();
                if (asVarPoll != null) {
                    if (b.c()) {
                        b.b("Removing transport connection " + asVarPoll + " (" + System.identityHashCode(asVarPoll) + ")");
                    }
                    this.c.remove(asVarPoll);
                    this.d.remove(asVarPoll);
                }
            }
        }
    }

    @Override // a.ae
    public final boolean a() {
        LinkedList linkedList;
        synchronized (this.c) {
            b();
            b.b("Closing pool");
            linkedList = new LinkedList(this.c);
            linkedList.addAll(this.d);
            this.c.clear();
            this.d.clear();
        }
        Iterator it = linkedList.iterator();
        boolean zB = false;
        while (it.hasNext()) {
            try {
                zB = ((as) it.next()).b(false, false) | zB;
            } catch (IOException e) {
                b.d("Failed to close connection", e);
            }
        }
        synchronized (this.c) {
            b();
        }
        return zB;
    }
}
