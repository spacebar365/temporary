package org.bouncycastle.p118e.p120b.p128g;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p118e.p120b.p128g.C1473j;

/* JADX INFO: renamed from: org.bouncycastle.e.b.g.b */
/* JADX INFO: loaded from: classes.dex */
public class C1465b implements Serializable {

    /* JADX INFO: renamed from: a */
    private final Map<Integer, C1463a> f5302a = new TreeMap();

    C1465b() {
    }

    C1465b(C1481r c1481r, long j, byte[] bArr, byte[] bArr2) {
        for (long j2 = 0; j2 < j; j2++) {
            m3849a(c1481r, j2, bArr, bArr2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C1465b m3850a(C0653p c0653p) {
        C1465b c1465b = new C1465b();
        for (Integer num : this.f5302a.keySet()) {
            c1465b.f5302a.put(num, this.f5302a.get(num).m3831a(c0653p));
        }
        return c1465b;
    }

    /* JADX INFO: renamed from: a */
    private void m3849a(C1481r c1481r, long j, byte[] bArr, byte[] bArr2) {
        C1487x c1487xM3924c = c1481r.m3924c();
        int iM3965d = c1487xM3924c.m3965d();
        long j2 = j >> iM3965d;
        int iM3844b = C1464aa.m3844b(j, iM3965d);
        C1473j c1473j = (C1473j) new C1473j.a().m3917a(j2).m3893a(iM3844b).mo3871a();
        if (iM3844b < (1 << iM3965d) - 1) {
            if (m3846a(0) == null || iM3844b == 0) {
                m3848a(0, new C1463a(c1487xM3924c, bArr, bArr2, c1473j));
            }
            m3847a(0, bArr, bArr2, c1473j);
        }
        int i = 1;
        while (true) {
            long j3 = j2;
            if (i >= c1481r.m3923b()) {
                return;
            }
            int iM3844b2 = C1464aa.m3844b(j3, iM3965d);
            j2 = j3 >> iM3965d;
            C1473j c1473j2 = (C1473j) new C1473j.a().m3918d(i).m3917a(j2).m3893a(iM3844b2).mo3871a();
            if (iM3844b2 < (1 << iM3965d) - 1) {
                if (j != 0 && (1 + j) % ((long) Math.pow((double) (1 << iM3965d), (double) i)) == 0) {
                    if (m3846a(i) == null) {
                        m3848a(i, new C1463a(c1481r.m3924c(), bArr, bArr2, c1473j2));
                    }
                    m3847a(i, bArr, bArr2, c1473j2);
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    private C1463a m3846a(int i) {
        return this.f5302a.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: a */
    private C1463a m3847a(int i, byte[] bArr, byte[] bArr2, C1473j c1473j) {
        return this.f5302a.put(Integer.valueOf(i), this.f5302a.get(Integer.valueOf(i)).m3832a(bArr, bArr2, c1473j));
    }

    /* JADX INFO: renamed from: a */
    private void m3848a(int i, C1463a c1463a) {
        this.f5302a.put(Integer.valueOf(i), c1463a);
    }
}
