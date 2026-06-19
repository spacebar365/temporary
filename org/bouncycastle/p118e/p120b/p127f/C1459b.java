package org.bouncycastle.p118e.p120b.p127f;

import java.io.IOException;
import org.bouncycastle.p054a.AbstractC0747x;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p118e.p119a.C1434h;
import org.bouncycastle.p118e.p119a.C1435i;
import org.bouncycastle.p118e.p119a.C1436j;
import org.bouncycastle.p118e.p119a.C1437k;
import org.bouncycastle.p118e.p119a.C1439m;
import org.bouncycastle.p118e.p119a.InterfaceC1431e;
import org.bouncycastle.p118e.p120b.p122b.C1448a;
import org.bouncycastle.p118e.p120b.p123c.C1450a;
import org.bouncycastle.p118e.p120b.p126e.C1456b;
import org.bouncycastle.p118e.p120b.p128g.C1464aa;
import org.bouncycastle.p118e.p120b.p128g.C1482s;
import org.bouncycastle.p118e.p120b.p128g.C1488y;

/* JADX INFO: renamed from: org.bouncycastle.e.b.f.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1459b {
    /* JADX INFO: renamed from: a */
    public static C0676p m3817a(C1075b c1075b, AbstractC0747x abstractC0747x) throws IOException {
        if (c1075b instanceof C1450a) {
            C1450a c1450a = (C1450a) c1075b;
            return new C0676p(C1462e.m3823a(c1450a.m3794b()), new C0581be(c1450a.m3795c()), abstractC0747x);
        }
        if (c1075b instanceof C1456b) {
            C1456b c1456b = (C1456b) c1075b;
            return new C0676p(new C0759a(InterfaceC1431e.f5187r, new C1434h(C1462e.m3824a(c1456b.m3812b()))), new C0581be(c1456b.m3813c()));
        }
        if (c1075b instanceof C1448a) {
            C0759a c0759a = new C0759a(InterfaceC1431e.f5191v);
            short[] sArrM3792b = ((C1448a) c1075b).m3792b();
            byte[] bArr = new byte[sArrM3792b.length * 2];
            for (int i = 0; i != sArrM3792b.length; i++) {
                short s = sArrM3792b[i];
                int i2 = i * 2;
                bArr[i2] = (byte) s;
                bArr[i2 + 1] = (byte) (s >>> 8);
            }
            return new C0676p(c0759a, new C0581be(bArr));
        }
        if (c1075b instanceof C1488y) {
            C1488y c1488y = (C1488y) c1075b;
            C0759a c0759a2 = new C0759a(InterfaceC1431e.f5192w, new C1435i(c1488y.m3969d().m3965d(), C1462e.m3826b(c1488y.m3920b())));
            byte[] bArrM3968c = c1488y.m3968c();
            int iM3963b = c1488y.m3969d().m3963b();
            int iM3965d = c1488y.m3969d().m3965d();
            int iM3835a = (int) C1464aa.m3835a(bArrM3968c, 4);
            if (!C1464aa.m3838a(iM3965d, iM3835a)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            byte[] bArrM3842a = C1464aa.m3842a(bArrM3968c, 4, iM3963b);
            int i3 = iM3963b + 4;
            byte[] bArrM3842a2 = C1464aa.m3842a(bArrM3968c, i3, iM3963b);
            int i4 = i3 + iM3963b;
            byte[] bArrM3842a3 = C1464aa.m3842a(bArrM3968c, i4, iM3963b);
            int i5 = i4 + iM3963b;
            byte[] bArrM3842a4 = C1464aa.m3842a(bArrM3968c, i5, iM3963b);
            int i6 = iM3963b + i5;
            return new C0676p(c0759a2, new C1439m(iM3835a, bArrM3842a, bArrM3842a2, bArrM3842a3, bArrM3842a4, C1464aa.m3842a(bArrM3968c, i6, bArrM3968c.length - i6)));
        }
        if (!(c1075b instanceof C1482s)) {
            throw new IOException("key parameters not recognized");
        }
        C1482s c1482s = (C1482s) c1075b;
        C0759a c0759a3 = new C0759a(InterfaceC1431e.f5147F, new C1436j(c1482s.m3928d().m3922a(), c1482s.m3928d().m3923b(), C1462e.m3826b(c1482s.m3921b())));
        byte[] bArrM3927c = c1482s.m3927c();
        int iM3926e = c1482s.m3928d().m3926e();
        int iM3922a = c1482s.m3928d().m3922a();
        int i7 = (iM3922a + 7) / 8;
        int iM3835a2 = (int) C1464aa.m3835a(bArrM3927c, i7);
        if (!C1464aa.m3838a(iM3922a, iM3835a2)) {
            throw new IllegalArgumentException("index out of bounds");
        }
        int i8 = i7 + 0;
        byte[] bArrM3842a5 = C1464aa.m3842a(bArrM3927c, i8, iM3926e);
        int i9 = i8 + iM3926e;
        byte[] bArrM3842a6 = C1464aa.m3842a(bArrM3927c, i9, iM3926e);
        int i10 = i9 + iM3926e;
        byte[] bArrM3842a7 = C1464aa.m3842a(bArrM3927c, i10, iM3926e);
        int i11 = i10 + iM3926e;
        byte[] bArrM3842a8 = C1464aa.m3842a(bArrM3927c, i11, iM3926e);
        int i12 = iM3926e + i11;
        return new C0676p(c0759a3, new C1437k(iM3835a2, bArrM3842a5, bArrM3842a6, bArrM3842a7, bArrM3842a8, C1464aa.m3842a(bArrM3927c, i12, bArrM3927c.length - i12)));
    }
}
