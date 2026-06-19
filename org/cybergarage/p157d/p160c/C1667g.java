package org.cybergarage.p157d.p160c;

import org.cybergarage.p154a.C1624b;
import org.cybergarage.p154a.C1627e;
import org.cybergarage.p154a.C1629g;
import org.cybergarage.p157d.C1728f;
import org.cybergarage.p157d.C1738j;

/* JADX INFO: renamed from: org.cybergarage.d.c.g */
/* JADX INFO: compiled from: SubscriptionRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1667g extends C1627e {
    public C1667g() {
        m4603a(0L);
    }

    public C1667g(C1627e c1627e) {
        this();
        m4651a(c1627e);
    }

    /* JADX INFO: renamed from: b */
    private void m4775b(C1738j c1738j) {
        C1728f c1728fM5070c;
        C1728f c1728fM5070c2;
        String strM5078g = c1738j.m5078g();
        m4650a(strM5078g, true);
        String strM4998i = c1738j.m5067b().m4998i();
        if ((strM4998i == null || strM4998i.length() <= 0) && (c1728fM5070c = c1738j.m5070c()) != null) {
            strM4998i = c1728fM5070c.m4998i();
        }
        if ((strM4998i == null || strM4998i.length() <= 0) && (c1728fM5070c2 = c1738j.m5070c()) != null) {
            strM4998i = c1728fM5070c2.m4994g();
        }
        if ((strM4998i == null || strM4998i.length() <= 0) && C1624b.m4581a(strM5078g)) {
            strM4998i = strM5078g;
        }
        String strM4582b = C1624b.m4582b(strM4998i);
        int iM4583c = C1624b.m4583c(strM4998i);
        m4613b(strM4582b, iM4583c);
        m4658m(strM4582b);
        m4653b(iM4583c);
    }

    /* JADX INFO: renamed from: a */
    public final void m4785a(C1738j c1738j, String str, long j) {
        m4656k("SUBSCRIBE");
        m4775b(c1738j);
        if (!str.startsWith("<")) {
            str = String.valueOf("<") + str;
        }
        if (!str.endsWith(">")) {
            str = String.valueOf(str) + ">";
        }
        m4606a("CALLBACK", str);
        m4606a("NT", "upnp:event");
        m4774b(j);
    }

    /* JADX INFO: renamed from: b */
    public final void m4786b(C1738j c1738j, String str, long j) {
        m4656k("SUBSCRIBE");
        m4775b(c1738j);
        m4776n(str);
        m4774b(j);
    }

    /* JADX INFO: renamed from: a */
    public final void m4784a(C1738j c1738j) {
        m4656k("UNSUBSCRIBE");
        m4775b(c1738j);
        m4776n(c1738j.m5084j());
    }

    /* JADX INFO: renamed from: I */
    public final String m4777I() {
        return m4602a("CALLBACK", "<", ">");
    }

    /* JADX INFO: renamed from: J */
    public final boolean m4778J() {
        String strM4777I = m4777I();
        return strM4777I != null && strM4777I.length() > 0;
    }

    /* JADX INFO: renamed from: n */
    private void m4776n(String str) {
        m4606a("SID", C1666f.m4772b(str));
    }

    /* JADX INFO: renamed from: K */
    public final String m4779K() {
        String strM4773c = C1666f.m4773c(m4615c("SID"));
        if (strM4773c == null) {
            return "";
        }
        return strM4773c;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m4780L() {
        String strM4779K = m4779K();
        return strM4779K != null && strM4779K.length() > 0;
    }

    /* JADX INFO: renamed from: b */
    private void m4774b(long j) {
        m4606a("TIMEOUT", C1666f.m4771a(j));
    }

    /* JADX INFO: renamed from: M */
    public final long m4781M() {
        return C1666f.m4770a(m4615c("TIMEOUT"));
    }

    /* JADX INFO: renamed from: a */
    public final void m4783a(C1668h c1668h) {
        super.m4652a((C1629g) c1668h);
    }

    /* JADX INFO: renamed from: N */
    public final C1668h m4782N() {
        return new C1668h(m4655c(m4667y(), m4668z()));
    }
}
