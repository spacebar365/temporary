package org.bouncycastle.p083b.p102o;

import java.io.IOException;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.p054a.AbstractC0642n;
import org.bouncycastle.p054a.AbstractC0747x;
import org.bouncycastle.p054a.C0558au;
import org.bouncycastle.p054a.C0579bc;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p056aa.C0505ab;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.InterfaceC0513aj;
import org.bouncycastle.p054a.p061f.C0624f;
import org.bouncycastle.p054a.p061f.InterfaceC0619a;
import org.bouncycastle.p054a.p063h.InterfaceC0628a;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p054a.p074s.C0679s;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p054a.p075t.InterfaceC0685a;
import org.bouncycastle.p054a.p076u.C0687a;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p054a.p082z.C0768i;
import org.bouncycastle.p083b.p097k.C1051ac;
import org.bouncycastle.p083b.p097k.C1052ad;
import org.bouncycastle.p083b.p097k.C1055ag;
import org.bouncycastle.p083b.p097k.C1058aj;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p083b.p097k.C1088bm;
import org.bouncycastle.p083b.p097k.C1089bn;
import org.bouncycastle.p083b.p097k.C1093br;
import org.bouncycastle.p083b.p097k.C1096bu;
import org.bouncycastle.p083b.p097k.C1115r;
import org.bouncycastle.p083b.p097k.C1116s;
import org.bouncycastle.p083b.p097k.C1122y;
import org.bouncycastle.p083b.p097k.C1123z;

/* JADX INFO: renamed from: org.bouncycastle.b.o.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1169f {

    /* JADX INFO: renamed from: a */
    private static Set f4665a;

    static {
        HashSet hashSet = new HashSet(5);
        f4665a = hashSet;
        hashSet.add(InterfaceC0619a.f2216x);
        f4665a.add(InterfaceC0619a.f2217y);
        f4665a.add(InterfaceC0619a.f2218z);
        f4665a.add(InterfaceC0619a.f2187A);
        f4665a.add(InterfaceC0619a.f2188B);
    }

    /* JADX INFO: renamed from: a */
    public static C0676p m2804a(C1075b c1075b) {
        return m2805a(c1075b, null);
    }

    /* JADX INFO: renamed from: a */
    public static C0676p m2805a(C1075b c1075b, AbstractC0747x abstractC0747x) {
        C0505ab c0505ab;
        int iBitLength;
        C0653p c0653p;
        int i = 32;
        if (c1075b instanceof C1088bm) {
            C1089bn c1089bn = (C1089bn) c1075b;
            return new C0676p(new C0759a(InterfaceC0674n.f2733f_, C0579bc.f2112a), new C0679s(c1089bn.m2625b(), c1089bn.m2627d(), c1089bn.m2626c(), c1089bn.m2628e(), c1089bn.m2629f(), c1089bn.m2630g(), c1089bn.m2631h(), c1089bn.m2632i()), abstractC0747x);
        }
        if (c1075b instanceof C1116s) {
            C1116s c1116s = (C1116s) c1075b;
            C1115r c1115rB = c1116s.m2680b();
            return new C0676p(new C0759a(InterfaceC0513aj.f1921U, new C0768i(c1115rB.m2686a(), c1115rB.m2687b(), c1115rB.m2688c())), new C0640m(c1116s.m2690c()), abstractC0747x);
        }
        if (!(c1075b instanceof C1052ad)) {
            if (c1075b instanceof C1096bu) {
                C1096bu c1096bu = (C1096bu) c1075b;
                return new C0676p(new C0759a(InterfaceC0628a.f2266c), new C0581be(c1096bu.m2645b()), abstractC0747x, c1096bu.m2646c().m2648b());
            }
            if (c1075b instanceof C1093br) {
                C1093br c1093br = (C1093br) c1075b;
                return new C0676p(new C0759a(InterfaceC0628a.f2265b), new C0581be(c1093br.m2640b()), abstractC0747x, c1093br.m2641c().m2643b());
            }
            if (c1075b instanceof C1058aj) {
                C1058aj c1058aj = (C1058aj) c1075b;
                return new C0676p(new C0759a(InterfaceC0628a.f2268e), new C0581be(c1058aj.m2573b()), abstractC0747x, c1058aj.m2574c().m2576b());
            }
            if (!(c1075b instanceof C1055ag)) {
                throw new IOException("key parameters not recognized");
            }
            C1055ag c1055ag = (C1055ag) c1075b;
            return new C0676p(new C0759a(InterfaceC0628a.f2267d), new C0581be(c1055ag.m2568b()), abstractC0747x, c1055ag.m2569c().m2571b());
        }
        C1052ad c1052ad = (C1052ad) c1075b;
        C1122y c1122yB = c1052ad.m2563b();
        if (c1122yB == null) {
            c0505ab = new C0505ab((AbstractC0642n) C0579bc.f2112a);
            iBitLength = c1052ad.m2565c().bitLength();
        } else {
            if (c1122yB instanceof C1123z) {
                C0624f c0624f = new C0624f(((C1123z) c1122yB).m2705g(), ((C1123z) c1122yB).m2706h(), ((C1123z) c1122yB).m2707i());
                if (f4665a.contains(c0624f.m1516a())) {
                    c0653p = InterfaceC0619a.f2205m;
                } else {
                    boolean z = c1052ad.m2565c().bitLength() > 256;
                    c0653p = z ? InterfaceC0685a.f2808h : InterfaceC0685a.f2807g;
                    i = z ? 64 : 32;
                }
                byte[] bArr = new byte[i];
                m2806a(bArr, i, c1052ad.m2565c());
                return new C0676p(new C0759a(c0653p, c0624f), new C0581be(bArr));
            }
            if (c1122yB instanceof C1051ac) {
                c0505ab = new C0505ab(((C1051ac) c1122yB).m2564j());
                iBitLength = c1122yB.m2701c().bitLength();
            } else {
                c0505ab = new C0505ab(new C0507ad(c1122yB.m2699a(), c1122yB.m2700b(), c1122yB.m2701c(), c1122yB.m2702d(), c1122yB.m2704f()));
                iBitLength = c1122yB.m2701c().bitLength();
            }
        }
        return new C0676p(new C0759a(InterfaceC0513aj.f1952k, c0505ab), new C0687a(iBitLength, c1052ad.m2565c(), new C0558au(c1122yB.m2700b().m3447a(c1052ad.m2565c()).m3452a(false)), c0505ab), abstractC0747x);
    }

    /* JADX INFO: renamed from: a */
    private static void m2806a(byte[] bArr, int i, BigInteger bigInteger) {
        byte[] bArr2;
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < i) {
            bArr2 = new byte[i];
            System.arraycopy(byteArray, 0, bArr2, bArr2.length - byteArray.length, byteArray.length);
        } else {
            bArr2 = byteArray;
        }
        for (int i2 = 0; i2 != i; i2++) {
            bArr[i2 + 0] = bArr2[(bArr2.length - 1) - i2];
        }
    }
}
