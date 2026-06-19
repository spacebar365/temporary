package org.bouncycastle.p118e.p120b.p128g;

import org.bouncycastle.p118e.p120b.p128g.C1470g;
import org.bouncycastle.p118e.p120b.p128g.C1472i;

/* JADX INFO: renamed from: org.bouncycastle.e.b.g.v */
/* JADX INFO: loaded from: classes.dex */
final class C1485v {
    /* JADX INFO: renamed from: a */
    static C1484u m3959a(C1474k c1474k, C1477n c1477n, C1472i c1472i) {
        C1472i c1472i2;
        if (c1477n == null) {
            throw new NullPointerException("publicKey == null");
        }
        if (c1472i == null) {
            throw new NullPointerException("address == null");
        }
        int iM3908d = c1474k.m3897a().m3908d();
        byte[][] bArrM3909a = c1477n.m3909a();
        C1484u[] c1484uArr = new C1484u[bArrM3909a.length];
        for (int i = 0; i < bArrM3909a.length; i++) {
            c1484uArr[i] = new C1484u(0, bArrM3909a[i]);
        }
        C1472i c1472i3 = (C1472i) new C1472i.a().m3918d(c1472i.m3910e()).m3917a(c1472i.m3911f()).m3884a(c1472i.m3878b()).m3885b(0).m3886c(c1472i.m3880d()).m3919e(c1472i.m3912g()).mo3871a();
        int i2 = iM3908d;
        while (i2 > 1) {
            int i3 = 0;
            while (true) {
                c1472i2 = c1472i3;
                if (i3 >= i2 / 2) {
                    break;
                }
                c1472i3 = (C1472i) new C1472i.a().m3918d(c1472i2.m3910e()).m3917a(c1472i2.m3911f()).m3884a(c1472i2.m3878b()).m3885b(c1472i2.m3879c()).m3886c(i3).m3919e(c1472i2.m3912g()).mo3871a();
                c1484uArr[i3] = m3960a(c1474k, c1484uArr[i3 * 2], c1484uArr[(i3 * 2) + 1], c1472i3);
                i3++;
            }
            if (i2 % 2 == 1) {
                c1484uArr[i2 / 2] = c1484uArr[i2 - 1];
            }
            int iCeil = (int) Math.ceil(((double) i2) / 2.0d);
            c1472i3 = (C1472i) new C1472i.a().m3918d(c1472i2.m3910e()).m3917a(c1472i2.m3911f()).m3884a(c1472i2.m3878b()).m3885b(c1472i2.m3879c() + 1).m3886c(c1472i2.m3880d()).m3919e(c1472i2.m3912g()).mo3871a();
            i2 = iCeil;
        }
        return c1484uArr[0];
    }

    /* JADX INFO: renamed from: a */
    static C1484u m3960a(C1474k c1474k, C1484u c1484u, C1484u c1484u2, AbstractC1478o abstractC1478o) {
        AbstractC1478o abstractC1478o2;
        if (c1484u == null) {
            throw new NullPointerException("left == null");
        }
        if (c1484u2 == null) {
            throw new NullPointerException("right == null");
        }
        if (c1484u.m3956a() != c1484u2.m3956a()) {
            throw new IllegalStateException("height of both nodes must be equal");
        }
        if (abstractC1478o == null) {
            throw new NullPointerException("address == null");
        }
        byte[] bArrM3902c = c1474k.m3902c();
        if (abstractC1478o instanceof C1472i) {
            C1472i c1472i = (C1472i) abstractC1478o;
            abstractC1478o2 = (C1472i) new C1472i.a().m3918d(c1472i.m3910e()).m3917a(c1472i.m3911f()).m3884a(c1472i.m3878b()).m3885b(c1472i.m3879c()).m3886c(c1472i.m3880d()).m3919e(0).mo3871a();
        } else if (abstractC1478o instanceof C1470g) {
            C1470g c1470g = (C1470g) abstractC1478o;
            abstractC1478o2 = (C1470g) new C1470g.a().m3918d(c1470g.m3910e()).m3917a(c1470g.m3911f()).m3870a(c1470g.m3866b()).m3872b(c1470g.m3867c()).m3919e(0).mo3871a();
        } else {
            abstractC1478o2 = abstractC1478o;
        }
        byte[] bArrM3877c = c1474k.m3901b().m3877c(bArrM3902c, abstractC1478o2.mo3865a());
        if (abstractC1478o2 instanceof C1472i) {
            C1472i c1472i2 = (C1472i) abstractC1478o2;
            abstractC1478o2 = (C1472i) new C1472i.a().m3918d(c1472i2.m3910e()).m3917a(c1472i2.m3911f()).m3884a(c1472i2.m3878b()).m3885b(c1472i2.m3879c()).m3886c(c1472i2.m3880d()).m3919e(1).mo3871a();
        } else if (abstractC1478o2 instanceof C1470g) {
            C1470g c1470g2 = (C1470g) abstractC1478o2;
            abstractC1478o2 = (C1470g) new C1470g.a().m3918d(c1470g2.m3910e()).m3917a(c1470g2.m3911f()).m3870a(c1470g2.m3866b()).m3872b(c1470g2.m3867c()).m3919e(1).mo3871a();
        }
        byte[] bArrM3877c2 = c1474k.m3901b().m3877c(bArrM3902c, abstractC1478o2.mo3865a());
        if (abstractC1478o2 instanceof C1472i) {
            C1472i c1472i3 = (C1472i) abstractC1478o2;
            abstractC1478o2 = (C1472i) new C1472i.a().m3918d(c1472i3.m3910e()).m3917a(c1472i3.m3911f()).m3884a(c1472i3.m3878b()).m3885b(c1472i3.m3879c()).m3886c(c1472i3.m3880d()).m3919e(2).mo3871a();
        } else if (abstractC1478o2 instanceof C1470g) {
            C1470g c1470g3 = (C1470g) abstractC1478o2;
            abstractC1478o2 = (C1470g) new C1470g.a().m3918d(c1470g3.m3910e()).m3917a(c1470g3.m3911f()).m3870a(c1470g3.m3866b()).m3872b(c1470g3.m3867c()).m3919e(2).mo3871a();
        }
        byte[] bArrM3877c3 = c1474k.m3901b().m3877c(bArrM3902c, abstractC1478o2.mo3865a());
        int iM3906b = c1474k.m3897a().m3906b();
        byte[] bArr = new byte[iM3906b * 2];
        for (int i = 0; i < iM3906b; i++) {
            bArr[i] = (byte) (c1484u.m3957b()[i] ^ bArrM3877c2[i]);
        }
        for (int i2 = 0; i2 < iM3906b; i2++) {
            bArr[i2 + iM3906b] = (byte) (c1484u2.m3957b()[i2] ^ bArrM3877c3[i2]);
        }
        return new C1484u(c1484u.m3956a(), c1474k.m3901b().m3876b(bArrM3877c, bArr));
    }
}
