package org.cybergarage.d.c;

import org.cybergarage.d.n;

/* JADX INFO: compiled from: SubscriptionResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class h extends org.cybergarage.a.g {
    public h() {
        j(n.a());
    }

    public h(org.cybergarage.a.g gVar) {
        super(gVar);
    }

    public final void u() {
        b(412);
        a(0L);
    }

    public final void k(String str) {
        a("SID", f.b(str));
    }

    public final String v() {
        return f.c(c("SID"));
    }

    public final void b(long j) {
        a("TIMEOUT", f.a(j));
    }

    public final long w() {
        return f.a(c("TIMEOUT"));
    }
}
