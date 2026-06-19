package org.bouncycastle.p083b.p102o;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0514b;
import org.bouncycastle.p083b.p097k.C1053ae;
import org.bouncycastle.p083b.p097k.C1056ah;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p083b.p097k.C1088bm;
import org.bouncycastle.p083b.p097k.C1115r;
import org.bouncycastle.p083b.p097k.C1117t;
import org.bouncycastle.p083b.p097k.C1122y;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.p109a.p112c.C1252ar;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: renamed from: org.bouncycastle.b.o.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1166c {
    /* JADX INFO: renamed from: a */
    public static byte[] m2792a(C1075b c1075b) {
        if (c1075b == null) {
            throw new IllegalArgumentException("cipherParameters was null.");
        }
        if (c1075b instanceof C1088bm) {
            if (c1075b.m2602a()) {
                throw new IllegalArgumentException("RSAKeyParamaters was for encryption");
            }
            BigInteger bigIntegerM2626c = ((C1088bm) c1075b).m2626c();
            BigInteger bigIntegerM2625b = ((C1088bm) c1075b).m2625b();
            C1171h c1171h = new C1171h();
            c1171h.m2813a("ssh-rsa");
            c1171h.m2814a(bigIntegerM2626c.toByteArray());
            c1171h.m2814a(bigIntegerM2625b.toByteArray());
            return c1171h.m2815a();
        }
        if (c1075b instanceof C1053ae) {
            C1171h c1171h2 = new C1171h();
            if (!(((C1053ae) c1075b).m2563b().m2699a() instanceof C1252ar)) {
                throw new IllegalArgumentException("unable to derive ssh curve name for " + ((C1053ae) c1075b).m2563b().m2699a().getClass().getName());
            }
            c1171h2.m2813a("ecdsa-sha2-".concat(String.valueOf("nistp256")));
            c1171h2.m2813a("nistp256");
            c1171h2.m2814a(((C1053ae) c1075b).m2566c().m3452a(false));
            return c1171h2.m2815a();
        }
        if (!(c1075b instanceof C1117t)) {
            if (!(c1075b instanceof C1056ah)) {
                throw new IllegalArgumentException("unable to convert " + c1075b.getClass().getName() + " to private key");
            }
            C1171h c1171h3 = new C1171h();
            c1171h3.m2813a("ssh-ed25519");
            c1171h3.m2814a(((C1056ah) c1075b).m2571b());
            return c1171h3.m2815a();
        }
        C1171h c1171h4 = new C1171h();
        c1171h4.m2813a("ssh-dss");
        c1171h4.m2814a(((C1117t) c1075b).m2680b().m2686a().toByteArray());
        c1171h4.m2814a(((C1117t) c1075b).m2680b().m2687b().toByteArray());
        c1171h4.m2814a(((C1117t) c1075b).m2680b().m2688c().toByteArray());
        c1171h4.m2814a(((C1117t) c1075b).m2691c().toByteArray());
        return c1171h4.m2815a();
    }

    /* JADX INFO: renamed from: a */
    public static C1075b m2791a(byte[] bArr) {
        C1170g c1170g = new C1170g(bArr);
        C1075b c1056ah = null;
        String strM4164b = C1560k.m4164b(c1170g.m2808b());
        if ("ssh-rsa".equals(strM4164b)) {
            c1056ah = new C1088bm(false, c1170g.m2810d(), c1170g.m2810d());
        } else if ("ssh-dss".equals(strM4164b)) {
            c1056ah = new C1117t(c1170g.m2810d(), new C1115r(c1170g.m2810d(), c1170g.m2810d(), c1170g.m2810d()));
        } else if (strM4164b.startsWith("ecdsa")) {
            String strM4164b2 = C1560k.m4164b(c1170g.m2808b());
            if (strM4164b2.startsWith("nist")) {
                String strSubstring = strM4164b2.substring(4);
                strM4164b2 = strSubstring.substring(0, 1) + "-" + strSubstring.substring(1);
            }
            C0507ad c0507adM1380a = C0514b.m1380a(strM4164b2);
            if (c0507adM1380a == null) {
                throw new IllegalStateException("unable to find curve for " + strM4164b + " using curve name " + strM4164b2);
            }
            AbstractC1381d abstractC1381dM1366a = c0507adM1380a.m1366a();
            c1056ah = new C1053ae(abstractC1381dM1366a.m3357a(c1170g.m2808b()), new C1122y(abstractC1381dM1366a, c0507adM1380a.m1367b(), c0507adM1380a.m1368c(), c0507adM1380a.m1369d(), c0507adM1380a.m1370e()));
        } else if (strM4164b.startsWith("ssh-ed25519")) {
            c1056ah = new C1056ah(c1170g.m2808b(), 0);
        }
        if (c1056ah == null) {
            throw new IllegalArgumentException("unable to parse key");
        }
        if (c1170g.m2811e()) {
            throw new IllegalArgumentException("uncoded key has trailing data");
        }
        return c1056ah;
    }
}
