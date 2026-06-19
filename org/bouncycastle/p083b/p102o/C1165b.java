package org.bouncycastle.p083b.p102o;

import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p083b.p097k.C1052ad;
import org.bouncycastle.p083b.p097k.C1055ag;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p083b.p097k.C1089bn;
import org.bouncycastle.p083b.p097k.C1116s;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: renamed from: org.bouncycastle.b.o.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1165b {

    /* JADX INFO: renamed from: a */
    static final byte[] f4651a = C1560k.m4168d("openssh-key-v1\u0000");

    /* JADX WARN: Removed duplicated region for block: B:46:0x0183  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.bouncycastle.p083b.p097k.C1075b m2788a(byte[] r9) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.p083b.p102o.C1165b.m2788a(byte[]):org.bouncycastle.b.k.b");
    }

    /* JADX INFO: renamed from: a */
    private static boolean m2789a(AbstractC0723v abstractC0723v) {
        for (int i = 0; i < abstractC0723v.mo1484d(); i++) {
            if (!(abstractC0723v.mo1482a(i) instanceof C0640m)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m2790a(C1075b c1075b) {
        if (!(c1075b instanceof C1089bn) && !(c1075b instanceof C1052ad)) {
            if (c1075b instanceof C1116s) {
                C0625g c0625g = new C0625g();
                c0625g.m1521a(new C0640m(0L));
                c0625g.m1521a(new C0640m(((C1116s) c1075b).m2680b().m2686a()));
                c0625g.m1521a(new C0640m(((C1116s) c1075b).m2680b().m2687b()));
                c0625g.m1521a(new C0640m(((C1116s) c1075b).m2680b().m2688c()));
                c0625g.m1521a(new C0640m(((C1116s) c1075b).m2680b().m2688c().modPow(((C1116s) c1075b).m2690c(), ((C1116s) c1075b).m2680b().m2686a())));
                c0625g.m1521a(new C0640m(((C1116s) c1075b).m2690c()));
                try {
                    return new C0585bi(c0625g).mo1578k();
                } catch (Exception e) {
                    throw new IllegalStateException("unable to encode DSAPrivateKeyParameters " + e.getMessage());
                }
            }
            if (!(c1075b instanceof C1055ag)) {
                throw new IllegalArgumentException("unable to convert " + c1075b.getClass().getName() + " to openssh private key");
            }
            C1171h c1171h = new C1171h();
            c1171h.m2816b(f4651a);
            c1171h.m2813a("none");
            c1171h.m2813a("none");
            c1171h.m2812a(0L);
            c1171h.m2812a(1L);
            c1171h.m2814a(C1166c.m2792a(((C1055ag) c1075b).m2569c()));
            C1171h c1171h2 = new C1171h();
            c1171h2.m2812a(16711935L);
            c1171h2.m2812a(16711935L);
            c1171h2.m2813a("ssh-ed25519");
            byte[] bArrM2571b = ((C1055ag) c1075b).m2569c().m2571b();
            c1171h2.m2814a(bArrM2571b);
            c1171h2.m2814a(C1535a.m4095d(((C1055ag) c1075b).m2568b(), bArrM2571b));
            c1171h2.m2812a(0L);
            c1171h.m2814a(c1171h2.m2815a());
            return c1171h.m2815a();
        }
        return C1169f.m2804a(c1075b).m1659c().mo1358i().mo1578k();
    }
}
