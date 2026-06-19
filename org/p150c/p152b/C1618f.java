package org.p150c.p152b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import org.p150c.InterfaceC1607a;
import org.p150c.InterfaceC1612b;
import org.p150c.p151a.C1611d;

/* JADX INFO: renamed from: org.c.b.f */
/* JADX INFO: compiled from: SubstituteLoggerFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1618f implements InterfaceC1607a {

    /* JADX INFO: renamed from: a */
    boolean f6308a = false;

    /* JADX INFO: renamed from: b */
    final Map<String, C1617e> f6309b = new HashMap();

    /* JADX INFO: renamed from: c */
    final LinkedBlockingQueue<C1611d> f6310c = new LinkedBlockingQueue<>();

    @Override // org.p150c.InterfaceC1607a
    /* JADX INFO: renamed from: a */
    public final synchronized InterfaceC1612b mo4529a(String str) {
        C1617e c1617e;
        c1617e = this.f6309b.get(str);
        if (c1617e == null) {
            c1617e = new C1617e(str, this.f6310c, this.f6308a);
            this.f6309b.put(str, c1617e);
        }
        return c1617e;
    }

    /* JADX INFO: renamed from: a */
    public final List<C1617e> m4553a() {
        return new ArrayList(this.f6309b.values());
    }

    /* JADX INFO: renamed from: b */
    public final LinkedBlockingQueue<C1611d> m4554b() {
        return this.f6310c;
    }

    /* JADX INFO: renamed from: c */
    public final void m4555c() {
        this.f6308a = true;
    }

    /* JADX INFO: renamed from: d */
    public final void m4556d() {
        this.f6309b.clear();
        this.f6310c.clear();
    }
}
