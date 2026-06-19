package p000a.p029g;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.C0044d;
import p000a.InterfaceC0000a;
import p000a.InterfaceC0006ad;
import p000a.InterfaceC0007ae;
import p000a.InterfaceC0016c;

/* JADX INFO: renamed from: a.g.au */
/* JADX INFO: compiled from: SmbTransportPoolImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class C0231au implements InterfaceC0007ae {

    /* JADX INFO: renamed from: b */
    private static final InterfaceC1612b f1080b = C1620c.m4563a((Class<?>) C0231au.class);

    /* JADX INFO: renamed from: c */
    private final List<C0229as> f1082c = new LinkedList();

    /* JADX INFO: renamed from: d */
    private final List<C0229as> f1083d = new LinkedList();

    /* JADX INFO: renamed from: e */
    private final ConcurrentLinkedQueue<C0229as> f1084e = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: a */
    final Map<String, Integer> f1081a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    private C0229as m759a(InterfaceC0016c interfaceC0016c, InterfaceC0000a interfaceC0000a, int i, InetAddress inetAddress, int i2, boolean z, boolean z2) {
        C0229as c0229as;
        int i3 = i <= 0 ? 445 : i;
        synchronized (this.f1082c) {
            m761b();
            if (f1080b.mo4536b()) {
                f1080b.mo4532a("Exclusive " + z + " enforced signing " + z2);
            }
            if (z || interfaceC0016c.mo114a().mo19N() == 1 || (c0229as = m758a(interfaceC0016c, interfaceC0000a, i3, inetAddress, i2, null, z2, false)) == null) {
                c0229as = new C0229as(interfaceC0016c, interfaceC0000a, i3, inetAddress, i2, z2);
                if (f1080b.mo4539c()) {
                    f1080b.mo4534b("New transport connection ".concat(String.valueOf(c0229as)));
                }
                if (z) {
                    this.f1083d.add(c0229as);
                } else {
                    this.f1082c.add(0, c0229as);
                }
            }
        }
        return c0229as;
    }

    /* JADX INFO: renamed from: a */
    private C0229as m758a(InterfaceC0016c interfaceC0016c, InterfaceC0000a interfaceC0000a, int i, InetAddress inetAddress, int i2, String str, boolean z, boolean z2) {
        for (C0229as c0229as : this.f1082c) {
            if (c0229as.m734a(interfaceC0000a, i, inetAddress, i2, str) && (interfaceC0016c.mo114a().mo19N() == 0 || c0229as.m741c() < interfaceC0016c.mo114a().mo19N())) {
                try {
                    if (!c0229as.mo744e() && (!z2 || !c0229as.mo743d())) {
                        if (z && !c0229as.m751l()) {
                            if (f1080b.mo4536b()) {
                                f1080b.mo4534b("Cannot reuse, signing enforced but connection does not have it enabled ".concat(String.valueOf(c0229as)));
                            }
                        } else if (!z && !interfaceC0016c.mo114a().mo26U() && c0229as.m751l() && !c0229as.m745f().mo280g()) {
                            if (f1080b.mo4536b()) {
                                f1080b.mo4534b("Cannot reuse, signing enforced on connection ".concat(String.valueOf(c0229as)));
                            }
                        } else if (!c0229as.m745f().mo275a(interfaceC0016c)) {
                            if (f1080b.mo4536b()) {
                                f1080b.mo4532a("Cannot reuse, different config ".concat(String.valueOf(c0229as)));
                            }
                        } else {
                            if (f1080b.mo4536b()) {
                                f1080b.mo4532a("Reusing transport connection ".concat(String.valueOf(c0229as)));
                            }
                            return c0229as.m749j();
                        }
                    }
                } catch (C0044d e) {
                    f1080b.mo4535b("Error while checking for reuse", e);
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9 A[SYNTHETIC] */
    @Override // p000a.InterfaceC0007ae
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000a.p029g.C0229as mo98a(p000a.InterfaceC0016c r14, java.lang.String r15, int r16, boolean r17, boolean r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0231au.mo98a(a.c, java.lang.String, int, boolean, boolean):a.g.as");
    }

    @Override // p000a.InterfaceC0007ae
    /* JADX INFO: renamed from: a */
    public final void mo99a(InterfaceC0006ad interfaceC0006ad) {
        if (f1080b.mo4539c()) {
            f1080b.mo4534b("Scheduling transport connection for removal " + interfaceC0006ad + " (" + System.identityHashCode(interfaceC0006ad) + ")");
        }
        this.f1084e.add((C0229as) interfaceC0006ad);
    }

    /* JADX INFO: renamed from: b */
    private void m761b() {
        synchronized (this.f1082c) {
            while (true) {
                C0229as c0229asPoll = this.f1084e.poll();
                if (c0229asPoll != null) {
                    if (f1080b.mo4539c()) {
                        f1080b.mo4534b("Removing transport connection " + c0229asPoll + " (" + System.identityHashCode(c0229asPoll) + ")");
                    }
                    this.f1082c.remove(c0229asPoll);
                    this.f1083d.remove(c0229asPoll);
                }
            }
        }
    }

    @Override // p000a.InterfaceC0007ae
    /* JADX INFO: renamed from: a */
    public final boolean mo100a() {
        LinkedList linkedList;
        synchronized (this.f1082c) {
            m761b();
            f1080b.mo4534b("Closing pool");
            linkedList = new LinkedList(this.f1082c);
            linkedList.addAll(this.f1083d);
            this.f1082c.clear();
            this.f1083d.clear();
        }
        Iterator it = linkedList.iterator();
        boolean zB = false;
        while (it.hasNext()) {
            try {
                zB = ((C0229as) it.next()).m930b(false, false) | zB;
            } catch (IOException e) {
                f1080b.mo4541d("Failed to close connection", e);
            }
        }
        synchronized (this.f1082c) {
            m761b();
        }
        return zB;
    }
}
