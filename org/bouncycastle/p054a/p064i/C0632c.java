package org.bouncycastle.p054a.p064i;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.i.c */
/* JADX INFO: loaded from: classes.dex */
final class C0632c extends AbstractC0508ae {
    C0632c() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigIntegerM1533c = C0630a.m1533c("BDB6F4FE3E8B1D9E0DA8C0D46F4C318CEFE4AFE3B6B8551F");
        BigInteger bigIntegerM1533c2 = C0630a.m1533c("BB8E5E8FBC115E139FE6A814FE48AAA6F0ADA1AA5DF91985");
        BigInteger bigIntegerM1533c3 = C0630a.m1533c("1854BEBDC31B21B7AEFC80AB0ECD10D5B1B3308E6DBF11C1");
        BigInteger bigIntegerM1533c4 = C0630a.m1533c("BDB6F4FE3E8B1D9E0DA8C0D40FC962195DFAE76F56564677");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        AbstractC1381d abstractC1381dM1529a = C0630a.m1529a(new AbstractC1381d.e(bigIntegerM1533c, bigIntegerM1533c2, bigIntegerM1533c3, bigIntegerM1533c4, bigIntegerValueOf));
        return new C0507ad(abstractC1381dM1529a, new C0509af(abstractC1381dM1529a, C1541f.m4106a("044AD5F7048DE709AD51236DE65E4D4B482C836DC6E410664002BB3A02D4AAADACAE24817A4CA3A1B014B5270432DB27D2")), bigIntegerM1533c4, bigIntegerValueOf, (byte[]) null);
    }
}
